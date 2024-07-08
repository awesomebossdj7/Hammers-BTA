package awesoft.hammers;

import turniplabs.halplibe.util.ConfigUpdater;
import turniplabs.halplibe.util.TomlConfigHandler;
import turniplabs.halplibe.util.toml.Toml;

public class HammerConfig {

	public static ConfigUpdater updater = ConfigUpdater.fromProperties();
	private static final Toml properties = new Toml("Hammers's TOML Config");
	public static TomlConfigHandler cfg;
	static {
		properties.addCategory("Tool Config")
			.addEntry("DontBreakWhenSneaking", true);

		properties.addCategory("Item IDs")
			.addEntry("WoodenHammer", 32006)
			.addEntry("StoneHammer", 32007)
			.addEntry("IronHammer", 32008)
			.addEntry("GoldHammer", 32009)
			.addEntry("DiamondHammer", 32010)
			.addEntry("SteelHammer", 32011)
			.addEntry("WoodenExcavator", 32012)
			.addEntry("StoneExcavator", 32013)
			.addEntry("IronExcavator", 32014)
			.addEntry("GoldExcavator", 32015)
			.addEntry("DiamondExcavator", 32016)
			.addEntry("SteelExcavator", 32017)
			.addEntry("WoodenVeinaxe", 32018)
			.addEntry("StoneVeinaxe", 32019)
			.addEntry("IronVeinaxe", 32020)
			.addEntry("GoldVeinaxe", 32021)
			.addEntry("DiamondVeinaxe", 32022)
			.addEntry("SteelVeinaxe", 32023);

		properties.addCategory("Durability")
			.addEntry("WoodenDurability", 64)
			.addEntry("StoneDurability", 128)
			.addEntry("IronDurability", 256)
			.addEntry("GoldDurability", 64)
			.addEntry("DiamondDurability", 1536)
			.addEntry("SteelDurability", 4608);

		cfg = new TomlConfigHandler(updater, Hammers.MOD_ID, properties);
	}
}
