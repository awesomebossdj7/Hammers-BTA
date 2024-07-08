package awesoft.hammers;

import awesoft.hammers.items.excavators.*;
import awesoft.hammers.items.hammers.*;
import awesoft.hammers.items.veinaxe.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.block.Block;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.helper.ItemHelper;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;
import awesoft.hammers.items.itemtools.HammerToolMaterial;


public class Hammers implements ModInitializer, RecipeEntrypoint {
	public static final String MOD_ID = "hammers";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);



	//hammers
	public static final Item toolHammerWooden = new ItemBuilder(MOD_ID)
		.setIcon("hammers:item/wooden_hammer")
		.build(new WoodenHammer("tool.pickaxe.hammer.wooden", HammerConfig.cfg.getInt("Item IDs.WoodenHammer"), HammerToolMaterial.wood));

	public static final Item toolHammerStone = new ItemBuilder(MOD_ID)
		.setIcon("hammers:item/stone_hammer")
		.build(new StoneHammer("tool.pickaxe.hammer.stone", HammerConfig.cfg.getInt("Item IDs.StoneHammer"), HammerToolMaterial.stone));

	public static final Item toolHammerIron = new ItemBuilder(MOD_ID)
		.setIcon("hammers:item/iron_hammer")
		.build(new IronHammer("tool.pickaxe.hammer.iron", HammerConfig.cfg.getInt("Item IDs.IronHammer"), HammerToolMaterial.iron));

	public static final Item toolHammerGold = new ItemBuilder(MOD_ID)
		.setIcon("hammers:item/golden_hammer")
		.build(new GoldHammer("tool.pickaxe.hammer.gold", HammerConfig.cfg.getInt("Item IDs.GoldHammer"), HammerToolMaterial.gold));

	public static final Item toolHammerDiamond = new ItemBuilder(MOD_ID)
		.setIcon("hammers:item/diamond_hammer")
		.build(new DiamondHammer("tool.pickaxe.hammer.diamond", HammerConfig.cfg.getInt("Item IDs.DiamondHammer"), HammerToolMaterial.diamond));

	public static final Item toolHammerSteel= new ItemBuilder(MOD_ID)
		.setIcon("hammers:item/steel_hammer")
		.build(new SteelHammer("tool.pickaxe.hammer.steel", HammerConfig.cfg.getInt("Item IDs.SteelHammer"), HammerToolMaterial.steel));


	//excavators

	public static final Item toolExcavatorWooden = new ItemBuilder(MOD_ID)
		.setIcon("hammers:item/wooden_excavator")
		.build(new WoodenExcavator("tool.pickaxe.excavator.wooden", HammerConfig.cfg.getInt("Item IDs.WoodExcavator"), HammerToolMaterial.wood));

	public static final Item toolExcavatorStone = new ItemBuilder(MOD_ID)
		.setIcon("hammers:item/stone_excavator")
		.build(new StoneExcavator("tool.pickaxe.excavator.stone", HammerConfig.cfg.getInt("Item IDs.StoneExcavator"), HammerToolMaterial.stone));

	public static final Item toolExcavatorIron = new ItemBuilder(MOD_ID)
		.setIcon("hammers:item/iron_excavator")
		.build(new IronExcavator("tool.pickaxe.excavator.iron", HammerConfig.cfg.getInt("Item IDs.IronExcavator"), HammerToolMaterial.iron));
	public static final Item toolExcavatorGolden = new ItemBuilder(MOD_ID)
		.setIcon("hammers:item/golden_excavator")
		.build(new GoldExcavator("tool.pickaxe.excavator.gold", HammerConfig.cfg.getInt("Item IDs.GoldExcavator"), HammerToolMaterial.gold));

	public static final Item toolExcavatorDiamond = new ItemBuilder(MOD_ID)
		.setIcon("hammers:item/diamond_excavator")
		.build(new DiamondExcavator("tool.pickaxe.excavator.diamond", HammerConfig.cfg.getInt("Item IDs.DiamondExcavator"), HammerToolMaterial.diamond));

	public static final Item toolExcavatorSteel = new ItemBuilder(MOD_ID)
		.setIcon("hammers:item/steel_excavator")
		.build(new WoodenExcavator("tool.pickaxe.excavator.steel", HammerConfig.cfg.getInt("Item IDs.SteelExcavator"), HammerToolMaterial.steel));




	//vein axe

	/*
	public static final Item toolVeinAxeWooden = ItemHelper.createItem(MOD_ID, new WoodenVeinAxe("tool.axe.veinaxe.wooden", HammerConfig.cfg.getInt("Item IDs.WoodenVeinaxe"), HammerToolMaterial.wood), "tool.axe.veinaxe.wooden", "steel_excavator.png");
	public static final Item toolVeinAxeStone = ItemHelper.createItem(MOD_ID, new StoneVeinAxe("tool.axe.veinaxe.stone", HammerConfig.cfg.getInt("Item IDs.StoneVeinaxe"), HammerToolMaterial.stone), "tool.axe.veinaxe.stone", "steel_excavator.png");
	public static final Item toolVeinAxeIron = ItemHelper.createItem(MOD_ID, new IronVeinAxe("tool.axe.veinaxe.iron", HammerConfig.cfg.getInt("Item IDs.IronVeinaxe"), HammerToolMaterial.iron), "tool.axe.veinaxe.iron", "steel_excavator.png");
	public static final Item toolVeinAxeGolden = ItemHelper.createItem(MOD_ID, new GoldVeinAxe("tool.axe.veinaxe.gold", HammerConfig.cfg.getInt("Item IDs.GoldVeinaxe"), HammerToolMaterial.gold), "tool.axe.veinaxe.gold", "steel_excavator.png");
	public static final Item toolVeinAxeDiamond = ItemHelper.createItem(MOD_ID, new DiamondVeinAxe("tool.axe.veinaxe.diamond", HammerConfig.cfg.getInt("Item IDs.DiamondVeinaxe"), HammerToolMaterial.diamond), "tool.axe.veinaxe.diamond", "steel_excavator.png");
	public static final Item toolVeinAxeSteel = ItemHelper.createItem(MOD_ID, new SteelVeinAxe("tool.axe.veinaxe.steel", HammerConfig.cfg.getInt("Item IDs.SteelVeinaxe"), HammerToolMaterial.steel), "tool.axe.veinaxe.steel", "steel_excavator.png");
*/

	@Override
	public void onInitialize() {
		LOGGER.info("Hammers initialized.");
	}


	@Override
	public void onRecipesReady()
	{
		//Hammers
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"OOO",
				"OSO",
				" S "
			)
			.addInput('S', Item.stick)
			.addInput('O', Block.planksOak)
			.create("toolHammerWooden", new ItemStack(toolHammerWooden, 1));

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"OOO",
				"OSO",
				" S "
			)
			.addInput('S', Item.stick)
			.addInput('O', Block.planksOakPainted)
			.create("toolHammerWooden", new ItemStack(toolHammerWooden, 1));

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"OOO",
				"OSO",
				" S "
			)
			.addInput('S', Item.stick)
			.addInput('O', Block.cobbleStone)
			.create("toolHammerStone", new ItemStack(toolHammerStone, 1));

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"OOO",
				"OSO",
				" S "
			)
			.addInput('S', Item.stick)
			.addInput('O', Item.ingotIron)
			.create("toolHammerIron", new ItemStack(toolHammerIron, 1));

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"OOO",
				"OSO",
				" S "
			)
			.addInput('S', Item.stick)
			.addInput('O', Item.ingotGold)
			.create("toolHammerGold", new ItemStack(toolHammerGold, 1));

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"OOO",
				"OSO",
				" S "
			)
			.addInput('S', Item.stick)
			.addInput('O', Item.diamond)
			.create("toolHammerDiamond", new ItemStack(toolHammerDiamond, 1));

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"OOO",
				"OSO",
				" S "
			)
			.addInput('S', Item.stick)
			.addInput('O', Item.ingotSteel)
			.create("toolHammerSteel", new ItemStack(toolHammerSteel, 1));

		//Excavators
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"OTO",
				" S ",
				" O "
			)
			.addInput('S', Item.stick)
			.addInput('O', Block.planksOak)
			.addInput('T', Item.toolShovelWood)
			.create("toolExcavatorWooden", new ItemStack(toolExcavatorWooden, 1));

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"OTO",
				" S ",
				" O "
			)
			.addInput('S', Item.stick)
			.addInput('O', Block.planksOakPainted)
			.addInput('T', Item.toolShovelWood)
			.create("toolExcavatorWooden", new ItemStack(toolExcavatorWooden, 1));

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"BTB",
				" S ",
				" B "
			)
			.addInput('S', Item.stick)
			.addInput('B', Block.cobbleStone)
			.addInput('T', Item.toolShovelStone)
			.create("toolExcavatorStone", new ItemStack(toolExcavatorStone, 1));

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"RTR",
				" S ",
				" B "
			)
			.addInput('S', Item.stick)
			.addInput('B', Block.cobbleStone)
			.addInput('T', Item.toolShovelIron)
			.addInput('R', Item.ingotIron)
			.create("toolExcavatorIron", new ItemStack(toolExcavatorIron, 1));

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"RTR",
				" S ",
				" B "
			)
			.addInput('S', Item.stick)
			.addInput('B', Block.cobbleStone)
			.addInput('T', Item.toolShovelGold)
			.addInput('R', Item.ingotGold)
			.create("toolExcavatorGolden", new ItemStack(toolExcavatorGolden, 1));

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"RTR",
				" S ",
				" B "
			)
			.addInput('S', Item.stick)
			.addInput('B', Block.cobbleStone)
			.addInput('T', Item.toolShovelDiamond)
			.addInput('R', Item.diamond)
			.create("toolExcavatorDiamond", new ItemStack(toolExcavatorDiamond, 1));

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"RTR",
				" S ",
				" B "
			)
			.addInput('S', Item.stick)
			.addInput('B', Block.cobbleStone)
			.addInput('T', Item.toolShovelSteel)
			.addInput('R', Item.ingotSteel)
			.create("toolExcavatorSteel", new ItemStack(toolExcavatorSteel, 1));
	}

	@Override
	public void initNamespaces() {

	}
}
