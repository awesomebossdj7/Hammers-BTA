//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package awesoft.hammers.items.itemtools;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import net.minecraft.client.Minecraft;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemTool;
import net.minecraft.core.item.tool.ItemToolPickaxe;
import net.minecraft.core.world.World;
import static awesoft.hammers.Hammers.LOGGER;
import static javax.management.Query.and;

public class ItemToolHammer extends ItemTool {
	public static Map<Block, Integer> miningLevels = ItemToolPickaxe.miningLevels;

	public ItemToolHammer(String name, int id, ToolMaterial enumtoolmaterial) {
		super(name, id, 2, enumtoolmaterial, BlockTags.MINEABLE_BY_PICKAXE);
	}

	public boolean canHarvestBlock(Block block) {
		Integer miningLevel = (Integer) miningLevels.get(block);
		if (miningLevel != null) {
			return this.material.getMiningLevel() >= miningLevel;
		} else {
			return block.hasTag(BlockTags.MINEABLE_BY_PICKAXE);
		}
	}

	@Override
	public boolean onBlockDestroyed(ItemStack itemstack, int i, int j, int k, int l, EntityLiving entityliving) {
		super.onBlockDestroyed(itemstack, i, j, k, l, entityliving);
		int x = j;
		int y = k;
		int z = l;


		MineBlock(x,y+1,z,entityliving.world);
		MineBlock(x,y-1,z,entityliving.world);

		//x
		MineBlock(x+1,y+1,z,entityliving.world);
		MineBlock(x+1,y,z,entityliving.world);
		MineBlock(x+1,y-1,z,entityliving.world);

		MineBlock(x-1,y+1,z,entityliving.world);
		MineBlock(x-1,y,z,entityliving.world);
		MineBlock(x-1,y-1,z,entityliving.world);

		//z
		MineBlock(x,y+1,z+1,entityliving.world);
		MineBlock(x,y,z+1,entityliving.world);
		MineBlock(x,y-1,z+1,entityliving.world);

		MineBlock(x,y+1,z-1,entityliving.world);
		MineBlock(x,y,z-1,entityliving.world);
		MineBlock(x,y-1,z-1,entityliving.world);




		MineBlock(x+1,y+1,z+1,entityliving.world);
		MineBlock(x+1,y,z+1,entityliving.world);
		MineBlock(x+1,y-1,z+1,entityliving.world);

		MineBlock(x+1,y+1,z-1,entityliving.world);
		MineBlock(x+1,y,z-1,entityliving.world);
		MineBlock(x+1,y-1,z-1,entityliving.world);

		MineBlock(x-1,y+1,z+1,entityliving.world);
		MineBlock(x-1,y,z+1,entityliving.world);
		MineBlock(x-1,y-1,z+1,entityliving.world);

		MineBlock(x-1,y+1,z-1,entityliving.world);
		MineBlock(x-1,y,z-1,entityliving.world);
		MineBlock(x-1,y-1,z-1,entityliving.world);

		float yRot = entityliving.yRot % 360;
/*
		//x
		if (yRot < 225 && yRot > 135) {
			MineBlock(x+1,y+1,z,entityliving.world);
			MineBlock(x+1,y,z,entityliving.world);
			MineBlock(x+1,y-1,z,entityliving.world);

			MineBlock(x-1,y+1,z,entityliving.world);
			MineBlock(x-1,y,z,entityliving.world);
			MineBlock(x-1,y-1,z,entityliving.world);
		}
		else if (yRot > 315 || yRot < 45) {
			MineBlock(x+1,y+1,z,entityliving.world);
			MineBlock(x+1,y,z,entityliving.world);
			MineBlock(x+1,y-1,z,entityliving.world);

			MineBlock(x-1,y+1,z,entityliving.world);
			MineBlock(x-1,y,z,entityliving.world);
			MineBlock(x-1,y-1,z,entityliving.world);
		}
		//y
		else if (yRot > 45 && yRot < 135) {
			MineBlock(x,y+1,z+1,entityliving.world);
			MineBlock(x,y,z+1,entityliving.world);
			MineBlock(x,y-1,z+1,entityliving.world);

			MineBlock(x,y+1,z-1,entityliving.world);
			MineBlock(x,y,z-1,entityliving.world);
			MineBlock(x,y-1,z-1,entityliving.world);
		}
		else if (yRot > 225 && yRot < 315) {
			MineBlock(x,y+1,z+1,entityliving.world);
			MineBlock(x,y,z+1,entityliving.world);
			MineBlock(x,y-1,z+1,entityliving.world);

			MineBlock(x,y+1,z-1,entityliving.world);
			MineBlock(x,y,z-1,entityliving.world);
			MineBlock(x,y-1,z-1,entityliving.world);
		}




		//x
		//135 - 225
		//315 - 45

		//z
		//46 - 134
		//224 - 314
*/



		return true;
	}

	protected void MineBlock(int x, int y, int z, World world) {
		if (world.getBlock(x, y, z) != null) {
			if (world.getBlock(x,y,z).id != Block.bedrock.id) {
				ItemStack[] item = world.getBlock(x, y, z).getBreakResult(world, EnumDropCause.PROPER_TOOL, x, y, z, world.getBlockMetadata(x, y, z), world.getBlockTileEntity(x, y, z));
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


