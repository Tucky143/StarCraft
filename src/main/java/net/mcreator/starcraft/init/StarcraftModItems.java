
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.starcraft.item.YellowLightsaberItem;
import net.mcreator.starcraft.item.YellowKyberItem;
import net.mcreator.starcraft.item.WhiteKyberItem;
import net.mcreator.starcraft.item.TatooinePlanetTokenItem;
import net.mcreator.starcraft.item.RedLightsaberItem;
import net.mcreator.starcraft.item.RedKyberItem;
import net.mcreator.starcraft.item.RawEwokMeatItem;
import net.mcreator.starcraft.item.PurpleKyberItem;
import net.mcreator.starcraft.item.OrangeKyberItem;
import net.mcreator.starcraft.item.MustafarPlanetTokenItem;
import net.mcreator.starcraft.item.MinecraftPlanetTokenItem;
import net.mcreator.starcraft.item.LiquidMudItem;
import net.mcreator.starcraft.item.LightsaberHiltItem;
import net.mcreator.starcraft.item.LightsaberHiltHandleItem;
import net.mcreator.starcraft.item.LightsaberHiltCoreItem;
import net.mcreator.starcraft.item.LightsaberHiltCasingItem;
import net.mcreator.starcraft.item.KyberItem;
import net.mcreator.starcraft.item.IronRodItem;
import net.mcreator.starcraft.item.HyperTokenItem;
import net.mcreator.starcraft.item.HyperPlateItem;
import net.mcreator.starcraft.item.HothPlanetTokenItem;
import net.mcreator.starcraft.item.GreenKyberItem;
import net.mcreator.starcraft.item.ExegolPlanetTokenItem;
import net.mcreator.starcraft.item.EwokJerkyItem;
import net.mcreator.starcraft.item.EndorPlanetTokenItem;
import net.mcreator.starcraft.item.DarkSaberItem;
import net.mcreator.starcraft.item.DagobahPlanetTokenItem;
import net.mcreator.starcraft.item.CloneArmorItem;
import net.mcreator.starcraft.item.CactusFruitItem;
import net.mcreator.starcraft.item.BlueLightsaberItem;
import net.mcreator.starcraft.item.BlackKyberItem;
import net.mcreator.starcraft.item.AhchToPlanetTokenItem;
import net.mcreator.starcraft.StarcraftMod;

public class StarcraftModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(StarcraftMod.MODID);
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
	public static final DeferredItem<Item> KYBER_CRYSTAL_ORE = block(StarcraftModBlocks.KYBER_CRYSTAL_ORE);
	public static final DeferredItem<Item> OLD_MUD = block(StarcraftModBlocks.OLD_MUD);
	public static final DeferredItem<Item> DAGOBAH_PLANET_TOKEN = REGISTRY.register("dagobah_planet_token", DagobahPlanetTokenItem::new);
	public static final DeferredItem<Item> MC_PLANET_TOKEN = REGISTRY.register("mc_planet_token", MinecraftPlanetTokenItem::new);
	public static final DeferredItem<Item> HYPER_PLATE = REGISTRY.register("hyper_plate", HyperPlateItem::new);
	public static final DeferredItem<Item> HYPER_TOKEN = REGISTRY.register("hyper_token", HyperTokenItem::new);
	public static final DeferredItem<Item> LIQUID_MUD_BUCKET = REGISTRY.register("liquid_mud_bucket", LiquidMudItem::new);
	public static final DeferredItem<Item> FLOWERING_CACTUS = doubleBlock(StarcraftModBlocks.FLOWERING_CACTUS);
	public static final DeferredItem<Item> CACTUS_FRUIT = REGISTRY.register("cactus_fruit", CactusFruitItem::new);
	public static final DeferredItem<Item> TATOOINE_PLANET_TOKEN = REGISTRY.register("tatooine_planet_token", TatooinePlanetTokenItem::new);
	public static final DeferredItem<Item> OLD_WOOD = block(StarcraftModBlocks.OLD_WOOD);
	public static final DeferredItem<Item> OLD_LOG = block(StarcraftModBlocks.OLD_LOG);
	public static final DeferredItem<Item> OLD_PLANKS = block(StarcraftModBlocks.OLD_PLANKS);
	public static final DeferredItem<Item> OLD_STAIRS = block(StarcraftModBlocks.OLD_STAIRS);
	public static final DeferredItem<Item> OLD_SLAB = block(StarcraftModBlocks.OLD_SLAB);
	public static final DeferredItem<Item> OLD_FENCE = block(StarcraftModBlocks.OLD_FENCE);
	public static final DeferredItem<Item> OLD_FENCE_GATE = block(StarcraftModBlocks.OLD_FENCE_GATE);
	public static final DeferredItem<Item> OLD_PRESSURE_PLATE = block(StarcraftModBlocks.OLD_PRESSURE_PLATE);
	public static final DeferredItem<Item> OLD_BUTTON = block(StarcraftModBlocks.OLD_BUTTON);
	public static final DeferredItem<Item> CRACKED_SANDSTONE = block(StarcraftModBlocks.CRACKED_SANDSTONE);
	public static final DeferredItem<Item> MOISTURE_VAPORATOR = block(StarcraftModBlocks.MOISTURE_VAPORATOR);
	public static final DeferredItem<Item> IRON_ROD = REGISTRY.register("iron_rod", IronRodItem::new);
	public static final DeferredItem<Item> REDWOOD_WOOD = block(StarcraftModBlocks.REDWOOD_WOOD);
	public static final DeferredItem<Item> REDWOOD_LOG = block(StarcraftModBlocks.REDWOOD_LOG);
	public static final DeferredItem<Item> REDWOOD_PLANKS = block(StarcraftModBlocks.REDWOOD_PLANKS);
	public static final DeferredItem<Item> REDWOOD_LEAVES = block(StarcraftModBlocks.REDWOOD_LEAVES);
	public static final DeferredItem<Item> REDWOOD_STAIRS = block(StarcraftModBlocks.REDWOOD_STAIRS);
	public static final DeferredItem<Item> REDWOOD_SLAB = block(StarcraftModBlocks.REDWOOD_SLAB);
	public static final DeferredItem<Item> REDWOOD_FENCE = block(StarcraftModBlocks.REDWOOD_FENCE);
	public static final DeferredItem<Item> REDWOOD_FENCE_GATE = block(StarcraftModBlocks.REDWOOD_FENCE_GATE);
	public static final DeferredItem<Item> REDWOOD_PRESSURE_PLATE = block(StarcraftModBlocks.REDWOOD_PRESSURE_PLATE);
	public static final DeferredItem<Item> REDWOOD_BUTTON = block(StarcraftModBlocks.REDWOOD_BUTTON);
	public static final DeferredItem<Item> ENDOR_PLANET_TOKEN = REGISTRY.register("endor_planet_token", EndorPlanetTokenItem::new);
	public static final DeferredItem<Item> EWOK_SPAWN_EGG = REGISTRY.register("ewok_spawn_egg", () -> new DeferredSpawnEggItem(StarcraftModEntities.EWOK, -10798064, -12836608, new Item.Properties()));
	public static final DeferredItem<Item> EWOK_ARCHER_SPAWN_EGG = REGISTRY.register("ewok_archer_spawn_egg", () -> new DeferredSpawnEggItem(StarcraftModEntities.EWOK_ARCHER, -10069431, -12836608, new Item.Properties()));
	public static final DeferredItem<Item> HOTH_PLANET_TOKEN = REGISTRY.register("hoth_planet_token", HothPlanetTokenItem::new);
	public static final DeferredItem<Item> BLUE_LIGHTSABER = REGISTRY.register("blue_lightsaber", BlueLightsaberItem::new);
	public static final DeferredItem<Item> RAW_EWOK_MEAT = REGISTRY.register("raw_ewok_meat", RawEwokMeatItem::new);
	public static final DeferredItem<Item> EWOK_JERKY = REGISTRY.register("ewok_jerky", EwokJerkyItem::new);
	public static final DeferredItem<Item> ASH_BLOCK = block(StarcraftModBlocks.ASH_BLOCK);
	public static final DeferredItem<Item> MUSTAFAR_PLANET_TOKEN = REGISTRY.register("mustafar_planet_token", MustafarPlanetTokenItem::new);
	public static final DeferredItem<Item> RED_LIGHTSABER = REGISTRY.register("red_lightsaber", RedLightsaberItem::new);
	public static final DeferredItem<Item> AHCH_TO_PLANET_TOKEN = REGISTRY.register("ahch_to_planet_token", AhchToPlanetTokenItem::new);
	public static final DeferredItem<Item> EXEGOL_PLANET_TOKEN = REGISTRY.register("exegol_planet_token", ExegolPlanetTokenItem::new);
	public static final DeferredItem<Item> YELLOW_LIGHTSABER = REGISTRY.register("yellow_lightsaber", YellowLightsaberItem::new);
	public static final DeferredItem<Item> DARK_SABER = REGISTRY.register("dark_saber", DarkSaberItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
