//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package awesoft.hammers.items.itemtools;

import awesoft.hammers.HammerConfig;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemTool;
import net.minecraft.core.item.tool.ItemToolPickaxe;
import net.minecraft.core.world.World;

import java.util.Map;

public class ItemToolExcavator extends ItemTool {

	public ItemToolExcavator(String name, int id, ToolMaterial enumtoolmaterial) {
		super(name, id, 2, enumtoolmaterial, BlockTags.MINEABLE_BY_SHOVEL);
	}

	public boolean canHarvestBlock(Block block) {
		return block.hasTag(BlockTags.MINEABLE_BY_SHOVEL);
	}

	public boolean onBlockDestroyed(World world, ItemStack itemstack, int i, int j, int k, int l, EntityLiving entityliving) {
		super.onBlockDestroyed(world, itemstack, i, j, k, l, entityliving);
		int x = j;
		int y = k;
		int z = l;
		boolean silkTouch = false;

		// Only break single block if sneaking
		if (HammerConfig.cfg.getBoolean("Tool Config.DontBreakWhenSneaking") && entityliving.isSneaking()) { return true; }

		ItemStack heldItemStack = entityliving.getHeldItem();
		Item heldItem = heldItemStack != null ? Item.itemsList[heldItemStack.itemID] : null;

		if (heldItem != null && heldItem.isSilkTouch()) { silkTouch = true;	}

		float xRot = entityliving.xRot % 360;
		float yRot = Math.abs(entityliving.yRot % 360);

		// Up/Down
		if (xRot < -40.0 || xRot > 40.0)
		{
			MineBlock(x,y,z+1,entityliving.world,silkTouch);
			MineBlock(x,y,z-1,entityliving.world,silkTouch);

			MineBlock(x+1,y,z+1,entityliving.world,silkTouch);
			MineBlock(x+1,y,z,entityliving.world,silkTouch);
			MineBlock(x+1,y,z-1,entityliving.world,silkTouch);

			MineBlock(x-1,y,z+1,entityliving.world,silkTouch);
			MineBlock(x-1,y,z,entityliving.world,silkTouch);
			MineBlock(x-1,y,z-1,entityliving.world,silkTouch);
		}

		// North/South
		else if ((yRot >= 315 || (yRot >= 0 && yRot<= 45)) || yRot <= 225 && yRot >= 135)
		{
			MineBlock(x,y+1,z,entityliving.world,silkTouch);
			MineBlock(x,y-1,z,entityliving.world,silkTouch);

			MineBlock(x-1,y+1,z,entityliving.world,silkTouch);
			MineBlock(x-1,y,z,entityliving.world,silkTouch);
			MineBlock(x-1,y-1,z,entityliving.world,silkTouch);

			MineBlock(x+1,y+1,z,entityliving.world,silkTouch);
			MineBlock(x+1,y,z,entityliving.world,silkTouch);
			MineBlock(x+1,y-1,z,entityliving.world,silkTouch);
		}

		// East/West
		else if ((yRot >= 45 && yRot <= 135) || (yRot >= 225 && yRot <= 315))
		{
			MineBlock(x,y+1,z,entityliving.world,silkTouch);
			MineBlock(x,y-1,z,entityliving.world,silkTouch);

			MineBlock(x,y+1,z+1,entityliving.world,silkTouch);
			MineBlock(x,y,z+1,entityliving.world,silkTouch);
			MineBlock(x,y-1,z+1,entityliving.world,silkTouch);

			MineBlock(x,y+1,z-1,entityliving.world,silkTouch);
			MineBlock(x,y,z-1,entityliving.world,silkTouch);
			MineBlock(x,y-1,z-1,entityliving.world,silkTouch);
		}

		return true;
	}


	protected void MineBlock(int x, int y, int z, World world, boolean silkTouch) {
		if (world.getBlock(x, y, z) != null) {
			if (world.getBlock(x,y,z).id != Block.bedrock.id) {
				if (canHarvestBlock(world.getBlock(x, y, z))) {
					ItemStack[] item = world.getBlock(x, y, z).getBreakResult(world, (silkTouch ? EnumDropCause.SILK_TOUCH : EnumDropCause.PROPER_TOOL), x, y, z, world.getBlockMetadata(x, y, z), world.getBlockTileEntity(x, y, z));
					world.setBlockWithNotify(x, y, z, 0);
					if (item != null) {
						for (ItemStack itemStack : item) {
							if (itemStack != null) {
								world.dropItem(x, y, z, itemStack);
							}
						}
					}
				}
			}
		}
	}
}


