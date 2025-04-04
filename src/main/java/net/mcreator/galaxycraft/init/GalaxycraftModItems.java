
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.galaxycraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.galaxycraft.item.YellowLightsaberItem;
import net.mcreator.galaxycraft.item.YellowKyberItem;
import net.mcreator.galaxycraft.item.WhiteLightsaberItem;
import net.mcreator.galaxycraft.item.WhiteKyberItem;
import net.mcreator.galaxycraft.item.WampaFurItem;
import net.mcreator.galaxycraft.item.TatooinePlanetTokenItem;
import net.mcreator.galaxycraft.item.RedLightsaberItem;
import net.mcreator.galaxycraft.item.RedKyberItem;
import net.mcreator.galaxycraft.item.RawEwokMeatItem;
import net.mcreator.galaxycraft.item.PurpleLightsaberItem;
import net.mcreator.galaxycraft.item.PurpleKyberItem;
import net.mcreator.galaxycraft.item.OrangeLightsaberItem;
import net.mcreator.galaxycraft.item.OrangeKyberItem;
import net.mcreator.galaxycraft.item.MustafarPlanetTokenItem;
import net.mcreator.galaxycraft.item.MinecraftPlanetTokenItem;
import net.mcreator.galaxycraft.item.LiquidMudItem;
import net.mcreator.galaxycraft.item.LightsaberHiltItem;
import net.mcreator.galaxycraft.item.LightsaberHiltHandleItem;
import net.mcreator.galaxycraft.item.LightsaberHiltCoreItem;
import net.mcreator.galaxycraft.item.LightsaberHiltCasingItem;
import net.mcreator.galaxycraft.item.KyberItem;
import net.mcreator.galaxycraft.item.IronRodItem;
import net.mcreator.galaxycraft.item.HyperTokenItem;
import net.mcreator.galaxycraft.item.HyperPlateItem;
import net.mcreator.galaxycraft.item.HothPlanetTokenItem;
import net.mcreator.galaxycraft.item.GreenLightsaberItem;
import net.mcreator.galaxycraft.item.GreenKyberItem;
import net.mcreator.galaxycraft.item.ExegolPlanetTokenItem;
import net.mcreator.galaxycraft.item.EwokJerkyItem;
import net.mcreator.galaxycraft.item.EndorPlanetTokenItem;
import net.mcreator.galaxycraft.item.DarkSaberItem;
import net.mcreator.galaxycraft.item.DagobahPlanetTokenItem;
import net.mcreator.galaxycraft.item.CloneArmorItem;
import net.mcreator.galaxycraft.item.CactusFruitItem;
import net.mcreator.galaxycraft.item.BlueLightsaberItem;
import net.mcreator.galaxycraft.item.BlackKyberItem;
import net.mcreator.galaxycraft.item.AhchToPlanetTokenItem;
import net.mcreator.galaxycraft.GalaxycraftMod;

public class GalaxycraftModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(GalaxycraftMod.MODID);
	public static final DeferredItem<Item> BLUE_KYBER = REGISTRY.register("blue_kyber", KyberItem::new);
	public static final DeferredItem<Item> CLONE_ARMOR_HELMET = REGISTRY.register("clone_armor_helmet", CloneArmorItem.Helmet::new);
	public static final DeferredItem<Item> CLONE_ARMOR_CHESTPLATE = REGISTRY.register("clone_armor_chestplate", CloneArmorItem.Chestplate::new);
	public static final DeferredItem<Item> CLONE_ARMOR_LEGGINGS = REGISTRY.register("clone_armor_leggings", CloneArmorItem.Leggings::new);
	public static final DeferredItem<Item> CLONE_ARMOR_BOOTS = REGISTRY.register("clone_armor_boots", CloneArmorItem.Boots::new);
	public static final DeferredItem<Item> RED_KYBER = REGISTRY.register("red_kyber", RedKyberItem::new);
	public static final DeferredItem<Item> GREEN_KYBER = REGISTRY.register("green_kyber", GreenKyberItem::new);
	public static final DeferredItem<Item> PURPLE_KYBER = REGISTRY.register("purple_kyber", PurpleKyberItem::new);
	public static final DeferredItem<Item> ORANGE_KYBER = REGISTRY.register("orange_kyber", OrangeKyberItem::new);
	public static final DeferredItem<Item> YELLOW_KYBER = REGISTRY.register("yellow_kyber", YellowKyberItem::new);
	public static final DeferredItem<Item> WHITE_KYBER = REGISTRY.register("white_kyber", WhiteKyberItem::new);
	public static final DeferredItem<Item> BLACK_KYBER = REGISTRY.register("black_kyber", BlackKyberItem::new);
	public static final DeferredItem<Item> LIGHTSABER_HILT_CORE = REGISTRY.register("lightsaber_hilt_core", LightsaberHiltCoreItem::new);
	public static final DeferredItem<Item> LIGHTSABER_HILT_CASING = REGISTRY.register("lightsaber_hilt_casing", LightsaberHiltCasingItem::new);
	public static final DeferredItem<Item> LIGHTSABER_HILT_HANDLE = REGISTRY.register("lightsaber_hilt_handle", LightsaberHiltHandleItem::new);
	public static final DeferredItem<Item> LIGHTSABER_HILT = REGISTRY.register("lightsaber_hilt", LightsaberHiltItem::new);
	public static final DeferredItem<Item> KYBER_CRYSTAL_ORE = block(GalaxycraftModBlocks.KYBER_CRYSTAL_ORE);
	public static final DeferredItem<Item> OLD_MUD = block(GalaxycraftModBlocks.OLD_MUD);
	public static final DeferredItem<Item> DAGOBAH_PLANET_TOKEN = REGISTRY.register("dagobah_planet_token", DagobahPlanetTokenItem::new);
	public static final DeferredItem<Item> MC_PLANET_TOKEN = REGISTRY.register("mc_planet_token", MinecraftPlanetTokenItem::new);
	public static final DeferredItem<Item> HYPER_PLATE = REGISTRY.register("hyper_plate", HyperPlateItem::new);
	public static final DeferredItem<Item> HYPER_TOKEN = REGISTRY.register("hyper_token", HyperTokenItem::new);
	public static final DeferredItem<Item> LIQUID_MUD_BUCKET = REGISTRY.register("liquid_mud_bucket", LiquidMudItem::new);
	public static final DeferredItem<Item> FLOWERING_CACTUS = doubleBlock(GalaxycraftModBlocks.FLOWERING_CACTUS);
	public static final DeferredItem<Item> CACTUS_FRUIT = REGISTRY.register("cactus_fruit", CactusFruitItem::new);
	public static final DeferredItem<Item> TATOOINE_PLANET_TOKEN = REGISTRY.register("tatooine_planet_token", TatooinePlanetTokenItem::new);
	public static final DeferredItem<Item> OLD_WOOD = block(GalaxycraftModBlocks.OLD_WOOD);
	public static final DeferredItem<Item> OLD_LOG = block(GalaxycraftModBlocks.OLD_LOG);
	public static final DeferredItem<Item> OLD_PLANKS = block(GalaxycraftModBlocks.OLD_PLANKS);
	public static final DeferredItem<Item> OLD_STAIRS = block(GalaxycraftModBlocks.OLD_STAIRS);
	public static final DeferredItem<Item> OLD_SLAB = block(GalaxycraftModBlocks.OLD_SLAB);
	public static final DeferredItem<Item> OLD_FENCE = block(GalaxycraftModBlocks.OLD_FENCE);
	public static final DeferredItem<Item> OLD_FENCE_GATE = block(GalaxycraftModBlocks.OLD_FENCE_GATE);
	public static final DeferredItem<Item> OLD_PRESSURE_PLATE = block(GalaxycraftModBlocks.OLD_PRESSURE_PLATE);
	public static final DeferredItem<Item> OLD_BUTTON = block(GalaxycraftModBlocks.OLD_BUTTON);
	public static final DeferredItem<Item> CRACKED_SANDSTONE = block(GalaxycraftModBlocks.CRACKED_SANDSTONE);
	public static final DeferredItem<Item> MOISTURE_VAPORATOR = block(GalaxycraftModBlocks.MOISTURE_VAPORATOR);
	public static final DeferredItem<Item> IRON_ROD = REGISTRY.register("iron_rod", IronRodItem::new);
	public static final DeferredItem<Item> REDWOOD_WOOD = block(GalaxycraftModBlocks.REDWOOD_WOOD);
	public static final DeferredItem<Item> REDWOOD_LOG = block(GalaxycraftModBlocks.REDWOOD_LOG);
	public static final DeferredItem<Item> REDWOOD_PLANKS = block(GalaxycraftModBlocks.REDWOOD_PLANKS);
	public static final DeferredItem<Item> REDWOOD_LEAVES = block(GalaxycraftModBlocks.REDWOOD_LEAVES);
	public static final DeferredItem<Item> REDWOOD_STAIRS = block(GalaxycraftModBlocks.REDWOOD_STAIRS);
	public static final DeferredItem<Item> REDWOOD_SLAB = block(GalaxycraftModBlocks.REDWOOD_SLAB);
	public static final DeferredItem<Item> REDWOOD_FENCE = block(GalaxycraftModBlocks.REDWOOD_FENCE);
	public static final DeferredItem<Item> REDWOOD_FENCE_GATE = block(GalaxycraftModBlocks.REDWOOD_FENCE_GATE);
	public static final DeferredItem<Item> REDWOOD_PRESSURE_PLATE = block(GalaxycraftModBlocks.REDWOOD_PRESSURE_PLATE);
	public static final DeferredItem<Item> REDWOOD_BUTTON = block(GalaxycraftModBlocks.REDWOOD_BUTTON);
	public static final DeferredItem<Item> ENDOR_PLANET_TOKEN = REGISTRY.register("endor_planet_token", EndorPlanetTokenItem::new);
	public static final DeferredItem<Item> EWOK_SPAWN_EGG = REGISTRY.register("ewok_spawn_egg", () -> new DeferredSpawnEggItem(GalaxycraftModEntities.EWOK, -10798064, -12836608, new Item.Properties()));
	public static final DeferredItem<Item> EWOK_ARCHER_SPAWN_EGG = REGISTRY.register("ewok_archer_spawn_egg", () -> new DeferredSpawnEggItem(GalaxycraftModEntities.EWOK_ARCHER, -10069431, -12836608, new Item.Properties()));
	public static final DeferredItem<Item> HOTH_PLANET_TOKEN = REGISTRY.register("hoth_planet_token", HothPlanetTokenItem::new);
	public static final DeferredItem<Item> BLUE_LIGHTSABER = REGISTRY.register("blue_lightsaber", BlueLightsaberItem::new);
	public static final DeferredItem<Item> RAW_EWOK_MEAT = REGISTRY.register("raw_ewok_meat", RawEwokMeatItem::new);
	public static final DeferredItem<Item> EWOK_JERKY = REGISTRY.register("ewok_jerky", EwokJerkyItem::new);
	public static final DeferredItem<Item> ASH_BLOCK = block(GalaxycraftModBlocks.ASH_BLOCK);
	public static final DeferredItem<Item> MUSTAFAR_PLANET_TOKEN = REGISTRY.register("mustafar_planet_token", MustafarPlanetTokenItem::new);
	public static final DeferredItem<Item> RED_LIGHTSABER = REGISTRY.register("red_lightsaber", RedLightsaberItem::new);
	public static final DeferredItem<Item> AHCH_TO_PLANET_TOKEN = REGISTRY.register("ahch_to_planet_token", AhchToPlanetTokenItem::new);
	public static final DeferredItem<Item> EXEGOL_PLANET_TOKEN = REGISTRY.register("exegol_planet_token", ExegolPlanetTokenItem::new);
	public static final DeferredItem<Item> YELLOW_LIGHTSABER = REGISTRY.register("yellow_lightsaber", YellowLightsaberItem::new);
	public static final DeferredItem<Item> DARK_SABER = REGISTRY.register("dark_saber", DarkSaberItem::new);
	public static final DeferredItem<Item> GREEN_LIGHTSABER = REGISTRY.register("green_lightsaber", GreenLightsaberItem::new);
	public static final DeferredItem<Item> ORANGE_LIGHTSABER = REGISTRY.register("orange_lightsaber", OrangeLightsaberItem::new);
	public static final DeferredItem<Item> HARDENED_MUD = block(GalaxycraftModBlocks.HARDENED_MUD);
	public static final DeferredItem<Item> WAMPA_SPAWN_EGG = REGISTRY.register("wampa_spawn_egg", () -> new DeferredSpawnEggItem(GalaxycraftModEntities.WAMPA, -5067385, -2632497, new Item.Properties()));
	public static final DeferredItem<Item> WAMPA_FUR = REGISTRY.register("wampa_fur", WampaFurItem::new);
	public static final DeferredItem<Item> PURPLE_LIGHTSABER = REGISTRY.register("purple_lightsaber", PurpleLightsaberItem::new);
	public static final DeferredItem<Item> WHITE_LIGHTSABER = REGISTRY.register("white_lightsaber", WhiteLightsaberItem::new);
	public static final DeferredItem<Item> BANTHA_SPAWN_EGG = REGISTRY.register("bantha_spawn_egg", () -> new DeferredSpawnEggItem(GalaxycraftModEntities.BANTHA, -10992100, -11522804, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
