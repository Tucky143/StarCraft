
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcraft.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.starcraft.StarcraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StarcraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StarcraftMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(StarcraftModBlocks.OLD_WOOD.get().asItem());
			tabData.accept(StarcraftModBlocks.OLD_LOG.get().asItem());
			tabData.accept(StarcraftModBlocks.OLD_PLANKS.get().asItem());
			tabData.accept(StarcraftModBlocks.OLD_STAIRS.get().asItem());
			tabData.accept(StarcraftModBlocks.OLD_SLAB.get().asItem());
			tabData.accept(StarcraftModBlocks.OLD_FENCE.get().asItem());
			tabData.accept(StarcraftModBlocks.OLD_FENCE_GATE.get().asItem());
			tabData.accept(StarcraftModBlocks.OLD_PRESSURE_PLATE.get().asItem());
			tabData.accept(StarcraftModBlocks.OLD_BUTTON.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(StarcraftModItems.DAGOBAH_PLANET_TOKEN.get());
			tabData.accept(StarcraftModItems.MINECRAFT_PLANET_TOKEN.get());
			tabData.accept(StarcraftModItems.TATOOINE_PLANET_TOKEN.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(StarcraftModItems.CLONE_ARMOR_HELMET.get());
			tabData.accept(StarcraftModItems.CLONE_ARMOR_CHESTPLATE.get());
			tabData.accept(StarcraftModItems.CLONE_ARMOR_LEGGINGS.get());
			tabData.accept(StarcraftModItems.CLONE_ARMOR_BOOTS.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(StarcraftModItems.BLUE_KYBER.get());
			tabData.accept(StarcraftModItems.RED_KYBER.get());
			tabData.accept(StarcraftModItems.GREEN_KYBER.get());
			tabData.accept(StarcraftModItems.PURPLE_KYBER.get());
			tabData.accept(StarcraftModItems.ORANGE_KYBER.get());
			tabData.accept(StarcraftModItems.YELLOW_KYBER.get());
			tabData.accept(StarcraftModItems.WHITE_KYBER.get());
			tabData.accept(StarcraftModItems.BLACK_KYBER.get());
			tabData.accept(StarcraftModItems.LIGHTSABER_HILT_CORE.get());
			tabData.accept(StarcraftModItems.LIGHTSABER_HILT_CASING.get());
			tabData.accept(StarcraftModItems.LIGHTSABER_HILT_HANDLE.get());
			tabData.accept(StarcraftModItems.LIGHTSABER_HILT.get());
			tabData.accept(StarcraftModItems.HYPER_PLATE.get());
			tabData.accept(StarcraftModItems.HYPER_TOKEN.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(StarcraftModBlocks.KYBER_CRYSTAL_ORE.get().asItem());
			tabData.accept(StarcraftModBlocks.OLD_MUD.get().asItem());
			tabData.accept(StarcraftModBlocks.FLOWERING_CACTUS.get().asItem());
			tabData.accept(StarcraftModBlocks.CRACKED_SANDSTONE.get().asItem());
			tabData.accept(StarcraftModBlocks.WET_SAND.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(StarcraftModItems.LIQUID_MUD_BUCKET.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(StarcraftModItems.CACTUS_FRUIT.get());
		}
	}
}
