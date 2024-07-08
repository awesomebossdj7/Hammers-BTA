package awesoft.hammers.items.itemtools;

import awesoft.hammers.HammerConfig;
import net.minecraft.core.item.material.ToolMaterial;

public class HammerToolMaterial extends ToolMaterial {
	public static final ToolMaterial wood = (new ToolMaterial()).setDurability(HammerConfig.cfg.getInt("Durability.WoodenDurability")).setEfficiency(2.0F, 4.0F).setMiningLevel(0);
	public static final ToolMaterial stone = (new ToolMaterial()).setDurability(HammerConfig.cfg.getInt("Durability.StoneDurability")).setEfficiency(4.0F, 6.0F).setMiningLevel(1);
	public static final ToolMaterial iron = (new ToolMaterial()).setDurability(HammerConfig.cfg.getInt("Durability.IronDurability")).setEfficiency(6.0F, 8.0F).setMiningLevel(2);
	public static final ToolMaterial steel = (new ToolMaterial()).setDurability(HammerConfig.cfg.getInt("Durability.SteelDurability")).setEfficiency(7.0F, 14.0F).setMiningLevel(3);
	public static final ToolMaterial diamond = (new ToolMaterial()).setDurability(HammerConfig.cfg.getInt("Durability.DiamondDurability")).setEfficiency(14.0F, 45.0F).setMiningLevel(3).setDamage(4).setBlockHitDelay(4);
	public static final ToolMaterial gold = (new ToolMaterial()).setDurability(HammerConfig.cfg.getInt("Durability.GoldDurability")).setEfficiency(4.0F, 8.0F).setMiningLevel(2).setSilkTouch(true);

}
