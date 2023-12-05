package awesoft.hammers;

import awesoft.hammers.items.excavators.*;
import awesoft.hammers.items.hammers.*;
import awesoft.hammers.items.veinaxe.*;
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

		prop.setProperty("ids.wooden.excavator", "32012");
		prop.setProperty("ids.stone.excavator", "32013");
		prop.setProperty("ids.iron.excavator", "32014");
		prop.setProperty("ids.gold.excavator", "32015");
		prop.setProperty("ids.diamond.excavator", "32016");
		prop.setProperty("ids.steel.excavator", "32017");

		prop.setProperty("ids.wooden.veinaxe", "32018");
		prop.setProperty("ids.stone.veinaxe", "32019");
		prop.setProperty("ids.iron.veinaxe", "32020");
		prop.setProperty("ids.gold.veinaxe", "32021");
		prop.setProperty("ids.diamond.veinaxe", "32022");
		prop.setProperty("ids.steel.veinaxe", "32023");


		config = new ConfigHandler(MOD_ID, prop);
	}


	//hammers
	public static final Item toolHammerWooden = ItemHelper.createItem(MOD_ID, new WoodenHammer("tool.pickaxe.hammer.wooden", config.getInt("ids.woodenhammer"), ToolMaterial.wood), "tool.pickaxe.hammer.wooden", "wooden_hammer.png");
	public static final Item toolHammerStone = ItemHelper.createItem(MOD_ID, new StoneHammer("tool.pickaxe.hammer.stone", config.getInt("ids.stonehammer"), ToolMaterial.stone), "tool.pickaxe.hammer.stone", "stone_hammer.png");
	public static final Item toolHammerIron = ItemHelper.createItem(MOD_ID, new IronHammer("tool.pickaxe.hammer.iron", config.getInt("ids.ironhammer"), ToolMaterial.iron), "tool.pickaxe.hammer.iron", "iron_hammer.png");
	public static final Item toolHammerGold = ItemHelper.createItem(MOD_ID, new GoldHammer("tool.pickaxe.hammer.gold", config.getInt("ids.goldhammer"), ToolMaterial.gold), "tool.pickaxe.hammer.gold", "golden_hammer.png");
	public static final Item toolHammerDiamond = ItemHelper.createItem(MOD_ID, new DiamondHammer("tool.pickaxe.hammer.diamond", config.getInt("ids.diamondhammer"), ToolMaterial.diamond), "tool.pickaxe.hammer.diamond", "diamond_hammer.png");
	public static final Item toolHammerSteel = ItemHelper.createItem(MOD_ID, new SteelHammer("tool.pickaxe.hammer.steel", config.getInt("ids.steelhammer"), ToolMaterial.steel), "tool.pickaxe.hammer.steel", "steel_hammer.png");

	//excavators
	public static final Item toolExcavatorWooden = ItemHelper.createItem(MOD_ID, new WoodenExcavator("tool.shovel.excavator.wooden", config.getInt("ids.wooden.excavator"), ToolMaterial.wood), "tool.shovel.excavator.wooden", "wooden_excavator.png");
	public static final Item toolExcavatorStone = ItemHelper.createItem(MOD_ID, new StoneExcavator("tool.shovel.excavator.stone", config.getInt("ids.stone.excavator"), ToolMaterial.stone), "tool.shovel.excavator.stone", "stone_excavator.png");
	public static final Item toolExcavatorIron = ItemHelper.createItem(MOD_ID, new IronExcavator("tool.shovel.excavator.iron", config.getInt("ids.iron.excavator"), ToolMaterial.iron), "tool.shovel.excavator.iron", "iron_excavator.png");
	public static final Item toolExcavatorGolden = ItemHelper.createItem(MOD_ID, new GoldExcavator("tool.shovel.excavator.gold", config.getInt("ids.gold.excavator"), ToolMaterial.gold), "tool.shovel.excavator.gold", "golden_excavator.png");
	public static final Item toolExcavatorDiamond = ItemHelper.createItem(MOD_ID, new DiamondExcavator("tool.shovel.excavator.diamond", config.getInt("ids.diamond.excavator"), ToolMaterial.diamond), "tool.shovel.excavator.diamond", "diamond_excavator.png");
	public static final Item toolExcavatorSteel = ItemHelper.createItem(MOD_ID, new SteelExcavator("tool.shovel.excavator.steel", config.getInt("ids.steel.excavator"), ToolMaterial.steel), "tool.shovel.excavator.steel", "steel_excavator.png");

	//vein axe
	public static final Item toolVeinAxeWooden = ItemHelper.createItem(MOD_ID, new WoodenVeinAxe("tool.axe.veinaxe.wooden", config.getInt("ids.wooden.veinaxe"), ToolMaterial.wood), "tool.axe.veinaxe.wooden", "steel_excavator.png");
	public static final Item toolVeinAxeStone = ItemHelper.createItem(MOD_ID, new StoneVeinAxe("tool.axe.veinaxe.stone", config.getInt("ids.stone.veinaxe"), ToolMaterial.stone), "tool.axe.veinaxe.stone", "steel_excavator.png");
	public static final Item toolVeinAxeIron = ItemHelper.createItem(MOD_ID, new IronVeinAxe("tool.axe.veinaxe.iron", config.getInt("ids.iron.veinaxe"), ToolMaterial.iron), "tool.axe.veinaxe.iron", "steel_excavator.png");
	public static final Item toolVeinAxeGolden = ItemHelper.createItem(MOD_ID, new GoldVeinAxe("tool.axe.veinaxe.gold", config.getInt("ids.gold.veinaxe"), ToolMaterial.gold), "tool.axe.veinaxe.gold", "steel_excavator.png");
	public static final Item toolVeinAxeDiamond = ItemHelper.createItem(MOD_ID, new DiamondVeinAxe("tool.axe.veinaxe.diamond", config.getInt("ids.diamond.veinaxe"), ToolMaterial.diamond), "tool.axe.veinaxe.diamond", "steel_excavator.png");
	public static final Item toolVeinAxeSteel = ItemHelper.createItem(MOD_ID, new SteelVeinAxe("tool.axe.veinaxe.steel", config.getInt("ids.steel.veinaxe"), ToolMaterial.steel), "tool.axe.veinaxe.steel", "steel_excavator.png");




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

		//excavators
		RecipeHelper.Crafting.createRecipe(toolExcavatorWooden, 1, new Object[] {
			"OTO",
			" S ",
			" O ",
			'S', Item.stick,
			'O', Block.planksOak,
			'T', Item.toolShovelWood
		});

		RecipeHelper.Crafting.createRecipe(toolExcavatorWooden, 1, new Object[] {
			"OTO",
			" S ",
			" O ",
			'S', Item.stick,
			'O', Block.planksOakPainted,
			'T', Item.toolShovelWood
		});

		RecipeHelper.Crafting.createRecipe(toolExcavatorStone, 1, new Object[] {
			"BTB",
			" S ",
			" B ",
			'S', Item.stick,
			'T', Item.toolShovelStone,
			'B', Block.cobbleStone
		});

		RecipeHelper.Crafting.createRecipe(toolExcavatorIron, 1, new Object[] {
			"RTR",
			" S ",
			" B ",
			'S', Item.stick,
			'B', Block.cobbleStone,
			'T', Item.toolShovelIron,
			'R', Item.ingotIron
		});

		RecipeHelper.Crafting.createRecipe(toolExcavatorGolden, 1, new Object[] {
			"RTR",
			" S ",
			" B ",
			'S', Item.stick,
			'B', Block.cobbleStone,
			'T', Item.toolShovelGold,
			'R', Item.ingotGold
		});

		RecipeHelper.Crafting.createRecipe(toolExcavatorDiamond, 1, new Object[] {
			"RTR",
			" S ",
			" B ",
			'S', Item.stick,
			'B', Block.cobbleStone,
			'T', Item.toolShovelDiamond,
			'R', Item.diamond
		});

		RecipeHelper.Crafting.createRecipe(toolExcavatorSteel, 1, new Object[] {
			"RTR",
			" S ",
			" B ",
			'S', Item.stick,
			'B', Block.cobbleStone,
			'T', Item.toolShovelSteel,
			'R', Item.ingotSteel
		});

	}
}
