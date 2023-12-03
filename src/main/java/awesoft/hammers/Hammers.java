package awesoft.hammers;

import awesoft.hammers.items.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.block.Block;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.material.ToolMaterial;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.ItemHelper;
import turniplabs.halplibe.helper.RecipeHelper;
import turniplabs.halplibe.util.ConfigHandler;

import java.util.Properties;


public class Hammers implements ModInitializer {
    public static final String MOD_ID = "hammers";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final ConfigHandler config;
	static {
		// Config
		Properties prop = new Properties();
		prop.setProperty("ids.woodenhammer", "32006");
		prop.setProperty("ids.stonehammer", "32007");
		prop.setProperty("ids.ironhammer", "32008");
		prop.setProperty("ids.goldhammer", "32009");
		prop.setProperty("ids.diamondhammer", "32010");
		prop.setProperty("ids.steelhammer", "32011");

		config = new ConfigHandler(MOD_ID, prop);
	}


	//tools
	public static final Item toolHammerWooden = ItemHelper.createItem(MOD_ID, new WoodenHammer("tool.pickaxe.hammer.wooden", config.getInt("ids.woodenhammer"), ToolMaterial.wood), "tool.pickaxe.hammer.wooden", "wooden_hammer.png");
	public static final Item toolHammerStone = ItemHelper.createItem(MOD_ID, new StoneHammer("tool.pickaxe.hammer.stone", config.getInt("ids.stonehammer"), ToolMaterial.stone), "tool.pickaxe.hammer.stone", "stone_hammer.png");
	public static final Item toolHammerIron = ItemHelper.createItem(MOD_ID, new IronHammer("tool.pickaxe.hammer.iron", config.getInt("ids.ironhammer"), ToolMaterial.iron), "tool.pickaxe.hammer.iron", "iron_hammer.png");
	public static final Item toolHammerGold = ItemHelper.createItem(MOD_ID, new GoldHammer("tool.pickaxe.hammer.gold", config.getInt("ids.goldhammer"), ToolMaterial.gold), "tool.pickaxe.hammer.gold", "golden_hammer.png");
	public static final Item toolHammerDiamond = ItemHelper.createItem(MOD_ID, new DiamondHammer("tool.pickaxe.hammer.diamond", config.getInt("ids.diamondhammer"), ToolMaterial.diamond), "tool.pickaxe.hammer.diamond", "diamond_hammer.png");
	public static final Item toolHammerSteel = ItemHelper.createItem(MOD_ID, new SteelHammer("tool.pickaxe.hammer.steel", config.getInt("ids.steelhammer"), ToolMaterial.steel), "tool.pickaxe.hammer.steel", "steel_hammer.png");








    @Override
    public void onInitialize() {
        LOGGER.info("Hammers initialized.");

		RecipeHelper.Crafting.createRecipe(toolHammerWooden, 1, new Object[] {
			"OOO",
			"OSO",
			" S ",
			'S', Item.stick,
			'O', Block.planksOak
		});
		RecipeHelper.Crafting.createRecipe(toolHammerWooden, 1, new Object[] {
			"OOO",
			"OSO",
			" S ",
			'S', Item.stick,
			'O', Block.planksOakPainted
		});
		RecipeHelper.Crafting.createRecipe(toolHammerStone, 1, new Object[] {
			"OOO",
			"OSO",
			" S ",
			'S', Item.stick,
			'O', Block.cobbleStone
		});
		RecipeHelper.Crafting.createRecipe(toolHammerIron, 1, new Object[] {
			"OOO",
			"OSO",
			" S ",
			'S', Item.stick,
			'O', Item.ingotIron
		});
		RecipeHelper.Crafting.createRecipe(toolHammerGold, 1, new Object[] {
			"OOO",
			"OSO",
			" S ",
			'S', Item.stick,
			'O', Item.ingotGold
		});
		RecipeHelper.Crafting.createRecipe(toolHammerDiamond, 1, new Object[] {
			"OOO",
			"OSO",
			" S ",
			'S', Item.stick,
			'O', Item.diamond
		});
		RecipeHelper.Crafting.createRecipe(toolHammerSteel, 1, new Object[] {
			"OOO",
			"OSO",
			" S ",
			'S', Item.stick,
			'O', Item.ingotSteel
		});


	}
}
