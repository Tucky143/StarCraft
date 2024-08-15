
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.starcraft.item.YellowKyberItem;
import net.mcreator.starcraft.item.WhiteKyberItem;
import net.mcreator.starcraft.item.TatooinePlanetTokenItem;
import net.mcreator.starcraft.item.RedKyberItem;
import net.mcreator.starcraft.item.PurpleKyberItem;
import net.mcreator.starcraft.item.OrangeKyberItem;
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
import net.mcreator.starcraft.item.EndorPlanetTokenItem;
import net.mcreator.starcraft.item.DagobahPlanetTokenItem;
import net.mcreator.starcraft.item.CloneArmorItem;
import net.mcreator.starcraft.item.CactusFruitItem;
import net.mcreator.starcraft.item.BlackKyberItem;
import net.mcreator.starcraft.StarcraftMod;

public class StarcraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, StarcraftMod.MODID);
	public static final RegistryObject<Item> BLUE_KYBER = REGISTRY.register("blue_kyber", () -> new KyberItem());
	public static final RegistryObject<Item> CLONE_ARMOR_HELMET = REGISTRY.register("clone_armor_helmet", () -> new CloneArmorItem.Helmet());
	public static final RegistryObject<Item> CLONE_ARMOR_CHESTPLATE = REGISTRY.register("clone_armor_chestplate", () -> new CloneArmorItem.Chestplate());
	public static final RegistryObject<Item> CLONE_ARMOR_LEGGINGS = REGISTRY.register("clone_armor_leggings", () -> new CloneArmorItem.Leggings());
	public static final RegistryObject<Item> CLONE_ARMOR_BOOTS = REGISTRY.register("clone_armor_boots", () -> new CloneArmorItem.Boots());
	public static final RegistryObject<Item> RED_KYBER = REGISTRY.register("red_kyber", () -> new RedKyberItem());
	public static final RegistryObject<Item> GREEN_KYBER = REGISTRY.register("green_kyber", () -> new GreenKyberItem());
	public static final RegistryObject<Item> PURPLE_KYBER = REGISTRY.register("purple_kyber", () -> new PurpleKyberItem());
	public static final RegistryObject<Item> ORANGE_KYBER = REGISTRY.register("orange_kyber", () -> new OrangeKyberItem());
	public static final RegistryObject<Item> YELLOW_KYBER = REGISTRY.register("yellow_kyber", () -> new YellowKyberItem());
	public static final RegistryObject<Item> WHITE_KYBER = REGISTRY.register("white_kyber", () -> new WhiteKyberItem());
	public static final RegistryObject<Item> BLACK_KYBER = REGISTRY.register("black_kyber", () -> new BlackKyberItem());
	public static final RegistryObject<Item> LIGHTSABER_HILT_CORE = REGISTRY.register("lightsaber_hilt_core", () -> new LightsaberHiltCoreItem());
	public static final RegistryObject<Item> LIGHTSABER_HILT_CASING = REGISTRY.register("lightsaber_hilt_casing", () -> new LightsaberHiltCasingItem());
	public static final RegistryObject<Item> LIGHTSABER_HILT_HANDLE = REGISTRY.register("lightsaber_hilt_handle", () -> new LightsaberHiltHandleItem());
	public static final RegistryObject<Item> LIGHTSABER_HILT = REGISTRY.register("lightsaber_hilt", () -> new LightsaberHiltItem());
	public static final RegistryObject<Item> KYBER_CRYSTAL_ORE = block(StarcraftModBlocks.KYBER_CRYSTAL_ORE);
	public static final RegistryObject<Item> OLD_MUD = block(StarcraftModBlocks.OLD_MUD);
	public static final RegistryObject<Item> DAGOBAH_PLANET_TOKEN = REGISTRY.register("dagobah_planet_token", () -> new DagobahPlanetTokenItem());
	public static final RegistryObject<Item> MC_PLANET_TOKEN = REGISTRY.register("mc_planet_token", () -> new MinecraftPlanetTokenItem());
	public static final RegistryObject<Item> HYPER_PLATE = REGISTRY.register("hyper_plate", () -> new HyperPlateItem());
	public static final RegistryObject<Item> HYPER_TOKEN = REGISTRY.register("hyper_token", () -> new HyperTokenItem());
	public static final RegistryObject<Item> LIQUID_MUD_BUCKET = REGISTRY.register("liquid_mud_bucket", () -> new LiquidMudItem());
	public static final RegistryObject<Item> FLOWERING_CACTUS = doubleBlock(StarcraftModBlocks.FLOWERING_CACTUS);
	public static final RegistryObject<Item> CACTUS_FRUIT = REGISTRY.register("cactus_fruit", () -> new CactusFruitItem());
	public static final RegistryObject<Item> TATOOINE_PLANET_TOKEN = REGISTRY.register("tatooine_planet_token", () -> new TatooinePlanetTokenItem());
	public static final RegistryObject<Item> OLD_WOOD = block(StarcraftModBlocks.OLD_WOOD);
	public static final RegistryObject<Item> OLD_LOG = block(StarcraftModBlocks.OLD_LOG);
	public static final RegistryObject<Item> OLD_PLANKS = block(StarcraftModBlocks.OLD_PLANKS);
	public static final RegistryObject<Item> OLD_STAIRS = block(StarcraftModBlocks.OLD_STAIRS);
	public static final RegistryObject<Item> OLD_SLAB = block(StarcraftModBlocks.OLD_SLAB);
	public static final RegistryObject<Item> OLD_FENCE = block(StarcraftModBlocks.OLD_FENCE);
	public static final RegistryObject<Item> OLD_FENCE_GATE = block(StarcraftModBlocks.OLD_FENCE_GATE);
	public static final RegistryObject<Item> OLD_PRESSURE_PLATE = block(StarcraftModBlocks.OLD_PRESSURE_PLATE);
	public static final RegistryObject<Item> OLD_BUTTON = block(StarcraftModBlocks.OLD_BUTTON);
	public static final RegistryObject<Item> CRACKED_SANDSTONE = block(StarcraftModBlocks.CRACKED_SANDSTONE);
	public static final RegistryObject<Item> MOISTURE_VAPORATOR = block(StarcraftModBlocks.MOISTURE_VAPORATOR);
	public static final RegistryObject<Item> IRON_ROD = REGISTRY.register("iron_rod", () -> new IronRodItem());
	public static final RegistryObject<Item> REDWOOD_WOOD = block(StarcraftModBlocks.REDWOOD_WOOD);
	public static final RegistryObject<Item> REDWOOD_LOG = block(StarcraftModBlocks.REDWOOD_LOG);
	public static final RegistryObject<Item> REDWOOD_PLANKS = block(StarcraftModBlocks.REDWOOD_PLANKS);
	public static final RegistryObject<Item> REDWOOD_LEAVES = block(StarcraftModBlocks.REDWOOD_LEAVES);
	public static final RegistryObject<Item> REDWOOD_STAIRS = block(StarcraftModBlocks.REDWOOD_STAIRS);
	public static final RegistryObject<Item> REDWOOD_SLAB = block(StarcraftModBlocks.REDWOOD_SLAB);
	public static final RegistryObject<Item> REDWOOD_FENCE = block(StarcraftModBlocks.REDWOOD_FENCE);
	public static final RegistryObject<Item> REDWOOD_FENCE_GATE = block(StarcraftModBlocks.REDWOOD_FENCE_GATE);
	public static final RegistryObject<Item> REDWOOD_PRESSURE_PLATE = block(StarcraftModBlocks.REDWOOD_PRESSURE_PLATE);
	public static final RegistryObject<Item> REDWOOD_BUTTON = block(StarcraftModBlocks.REDWOOD_BUTTON);
	public static final RegistryObject<Item> ENDOR_PLANET_TOKEN = REGISTRY.register("endor_planet_token", () -> new EndorPlanetTokenItem());
	public static final RegistryObject<Item> EWOK_SPAWN_EGG = REGISTRY.register("ewok_spawn_egg", () -> new ForgeSpawnEggItem(StarcraftModEntities.EWOK, -10798064, -12836608, new Item.Properties()));
	public static final RegistryObject<Item> EWOK_ARCHER_SPAWN_EGG = REGISTRY.register("ewok_archer_spawn_egg", () -> new ForgeSpawnEggItem(StarcraftModEntities.EWOK_ARCHER, -10069431, -12836608, new Item.Properties()));
	public static final RegistryObject<Item> HOTH_PLANET_TOKEN = REGISTRY.register("hoth_planet_token", () -> new HothPlanetTokenItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
