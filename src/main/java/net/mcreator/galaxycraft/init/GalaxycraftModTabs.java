
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.galaxycraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.galaxycraft.GalaxycraftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class GalaxycraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GalaxycraftMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> STAR_TAB = REGISTRY.register("star_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.galaxycraft.star_tab")).icon(() -> new ItemStack(GalaxycraftModItems.CLONE_ARMOR_HELMET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GalaxycraftModItems.BLUE_KYBER.get());
				tabData.accept(GalaxycraftModItems.RED_KYBER.get());
				tabData.accept(GalaxycraftModItems.GREEN_KYBER.get());
				tabData.accept(GalaxycraftModItems.PURPLE_KYBER.get());
				tabData.accept(GalaxycraftModItems.ORANGE_KYBER.get());
				tabData.accept(GalaxycraftModItems.YELLOW_KYBER.get());
				tabData.accept(GalaxycraftModItems.WHITE_KYBER.get());
				tabData.accept(GalaxycraftModItems.BLACK_KYBER.get());
				tabData.accept(GalaxycraftModItems.CACTUS_FRUIT.get());
				tabData.accept(GalaxycraftModItems.RAW_EWOK_MEAT.get());
				tabData.accept(GalaxycraftModItems.EWOK_JERKY.get());
				tabData.accept(GalaxycraftModItems.WAMPA_FUR.get());
				tabData.accept(GalaxycraftModItems.HYPER_PLATE.get());
				tabData.accept(GalaxycraftModItems.LIGHTSABER_HILT_CORE.get());
				tabData.accept(GalaxycraftModItems.LIGHTSABER_HILT_CASING.get());
				tabData.accept(GalaxycraftModItems.LIGHTSABER_HILT_HANDLE.get());
				tabData.accept(GalaxycraftModItems.LIGHTSABER_HILT.get());
				tabData.accept(GalaxycraftModItems.IRON_ROD.get());
				tabData.accept(GalaxycraftModBlocks.MOISTURE_VAPORATOR.get().asItem());
				tabData.accept(GalaxycraftModBlocks.KYBER_CRYSTAL_ORE.get().asItem());
				tabData.accept(GalaxycraftModBlocks.CRACKED_SANDSTONE.get().asItem());
				tabData.accept(GalaxycraftModBlocks.HARDENED_MUD.get().asItem());
				tabData.accept(GalaxycraftModBlocks.OLD_MUD.get().asItem());
				tabData.accept(GalaxycraftModItems.LIQUID_MUD_BUCKET.get());
				tabData.accept(GalaxycraftModBlocks.ASH_BLOCK.get().asItem());
				tabData.accept(GalaxycraftModBlocks.OLD_WOOD.get().asItem());
				tabData.accept(GalaxycraftModBlocks.OLD_LOG.get().asItem());
				tabData.accept(GalaxycraftModBlocks.OLD_PLANKS.get().asItem());
				tabData.accept(GalaxycraftModBlocks.OLD_STAIRS.get().asItem());
				tabData.accept(GalaxycraftModBlocks.OLD_SLAB.get().asItem());
				tabData.accept(GalaxycraftModBlocks.OLD_FENCE.get().asItem());
				tabData.accept(GalaxycraftModBlocks.OLD_FENCE_GATE.get().asItem());
				tabData.accept(GalaxycraftModBlocks.OLD_PRESSURE_PLATE.get().asItem());
				tabData.accept(GalaxycraftModBlocks.OLD_BUTTON.get().asItem());
				tabData.accept(GalaxycraftModBlocks.REDWOOD_WOOD.get().asItem());
				tabData.accept(GalaxycraftModBlocks.REDWOOD_LOG.get().asItem());
				tabData.accept(GalaxycraftModBlocks.REDWOOD_PLANKS.get().asItem());
				tabData.accept(GalaxycraftModBlocks.REDWOOD_STAIRS.get().asItem());
				tabData.accept(GalaxycraftModBlocks.REDWOOD_SLAB.get().asItem());
				tabData.accept(GalaxycraftModBlocks.REDWOOD_FENCE.get().asItem());
				tabData.accept(GalaxycraftModBlocks.REDWOOD_FENCE_GATE.get().asItem());
				tabData.accept(GalaxycraftModBlocks.REDWOOD_PRESSURE_PLATE.get().asItem());
				tabData.accept(GalaxycraftModBlocks.REDWOOD_BUTTON.get().asItem());
				tabData.accept(GalaxycraftModBlocks.REDWOOD_LEAVES.get().asItem());
				tabData.accept(GalaxycraftModItems.EXEGOL_PLANET_TOKEN.get());
				tabData.accept(GalaxycraftModItems.ENDOR_PLANET_TOKEN.get());
				tabData.accept(GalaxycraftModItems.DAGOBAH_PLANET_TOKEN.get());
				tabData.accept(GalaxycraftModItems.TATOOINE_PLANET_TOKEN.get());
				tabData.accept(GalaxycraftModItems.MUSTAFAR_PLANET_TOKEN.get());
				tabData.accept(GalaxycraftModItems.HOTH_PLANET_TOKEN.get());
				tabData.accept(GalaxycraftModItems.AHCH_TO_PLANET_TOKEN.get());
				tabData.accept(GalaxycraftModItems.HYPER_TOKEN.get());
				tabData.accept(GalaxycraftModItems.MC_PLANET_TOKEN.get());
				tabData.accept(GalaxycraftModItems.RED_LIGHTSABER.get());
				tabData.accept(GalaxycraftModItems.ORANGE_LIGHTSABER.get());
				tabData.accept(GalaxycraftModItems.YELLOW_LIGHTSABER.get());
				tabData.accept(GalaxycraftModItems.GREEN_LIGHTSABER.get());
				tabData.accept(GalaxycraftModItems.BLUE_LIGHTSABER.get());
				tabData.accept(GalaxycraftModItems.DARK_SABER.get());
				tabData.accept(GalaxycraftModItems.CLONE_ARMOR_HELMET.get());
				tabData.accept(GalaxycraftModItems.CLONE_ARMOR_CHESTPLATE.get());
				tabData.accept(GalaxycraftModItems.CLONE_ARMOR_LEGGINGS.get());
				tabData.accept(GalaxycraftModItems.CLONE_ARMOR_BOOTS.get());
				tabData.accept(GalaxycraftModItems.EWOK_SPAWN_EGG.get());
				tabData.accept(GalaxycraftModItems.EWOK_ARCHER_SPAWN_EGG.get());
				tabData.accept(GalaxycraftModItems.WAMPA_SPAWN_EGG.get());
				tabData.accept(GalaxycraftModItems.PURPLE_LIGHTSABER.get());
				tabData.accept(GalaxycraftModItems.WHITE_LIGHTSABER.get());
				tabData.accept(GalaxycraftModItems.BANTHA_SPAWN_EGG.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(GalaxycraftModItems.LIQUID_MUD_BUCKET.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(GalaxycraftModItems.CACTUS_FRUIT.get());
			tabData.accept(GalaxycraftModItems.RAW_EWOK_MEAT.get());
			tabData.accept(GalaxycraftModItems.EWOK_JERKY.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(GalaxycraftModBlocks.OLD_WOOD.get().asItem());
			tabData.accept(GalaxycraftModBlocks.OLD_LOG.get().asItem());
			tabData.accept(GalaxycraftModBlocks.OLD_PLANKS.get().asItem());
			tabData.accept(GalaxycraftModBlocks.OLD_STAIRS.get().asItem());
			tabData.accept(GalaxycraftModBlocks.OLD_SLAB.get().asItem());
			tabData.accept(GalaxycraftModBlocks.OLD_FENCE.get().asItem());
			tabData.accept(GalaxycraftModBlocks.OLD_FENCE_GATE.get().asItem());
			tabData.accept(GalaxycraftModBlocks.OLD_PRESSURE_PLATE.get().asItem());
			tabData.accept(GalaxycraftModBlocks.OLD_BUTTON.get().asItem());
			tabData.accept(GalaxycraftModBlocks.REDWOOD_WOOD.get().asItem());
			tabData.accept(GalaxycraftModBlocks.REDWOOD_LOG.get().asItem());
			tabData.accept(GalaxycraftModBlocks.REDWOOD_PLANKS.get().asItem());
			tabData.accept(GalaxycraftModBlocks.REDWOOD_STAIRS.get().asItem());
			tabData.accept(GalaxycraftModBlocks.REDWOOD_SLAB.get().asItem());
			tabData.accept(GalaxycraftModBlocks.REDWOOD_FENCE.get().asItem());
			tabData.accept(GalaxycraftModBlocks.REDWOOD_FENCE_GATE.get().asItem());
			tabData.accept(GalaxycraftModBlocks.REDWOOD_PRESSURE_PLATE.get().asItem());
			tabData.accept(GalaxycraftModBlocks.REDWOOD_BUTTON.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(GalaxycraftModBlocks.MOISTURE_VAPORATOR.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(GalaxycraftModItems.EWOK_SPAWN_EGG.get());
			tabData.accept(GalaxycraftModItems.EWOK_ARCHER_SPAWN_EGG.get());
			tabData.accept(GalaxycraftModItems.WAMPA_SPAWN_EGG.get());
			tabData.accept(GalaxycraftModItems.BANTHA_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(GalaxycraftModItems.MC_PLANET_TOKEN.get());
			tabData.accept(GalaxycraftModItems.ENDOR_PLANET_TOKEN.get());
			tabData.accept(GalaxycraftModItems.DAGOBAH_PLANET_TOKEN.get());
			tabData.accept(GalaxycraftModItems.TATOOINE_PLANET_TOKEN.get());
			tabData.accept(GalaxycraftModItems.MUSTAFAR_PLANET_TOKEN.get());
			tabData.accept(GalaxycraftModItems.HOTH_PLANET_TOKEN.get());
			tabData.accept(GalaxycraftModItems.AHCH_TO_PLANET_TOKEN.get());
			tabData.accept(GalaxycraftModItems.EXEGOL_PLANET_TOKEN.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(GalaxycraftModBlocks.KYBER_CRYSTAL_ORE.get().asItem());
			tabData.accept(GalaxycraftModBlocks.OLD_MUD.get().asItem());
			tabData.accept(GalaxycraftModBlocks.ASH_BLOCK.get().asItem());
			tabData.accept(GalaxycraftModBlocks.CRACKED_SANDSTONE.get().asItem());
			tabData.accept(GalaxycraftModBlocks.REDWOOD_LEAVES.get().asItem());
			tabData.accept(GalaxycraftModBlocks.FLOWERING_CACTUS.get().asItem());
			tabData.accept(GalaxycraftModBlocks.HARDENED_MUD.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(GalaxycraftModItems.WAMPA_FUR.get());
			tabData.accept(GalaxycraftModItems.RED_KYBER.get());
			tabData.accept(GalaxycraftModItems.ORANGE_KYBER.get());
			tabData.accept(GalaxycraftModItems.YELLOW_KYBER.get());
			tabData.accept(GalaxycraftModItems.GREEN_KYBER.get());
			tabData.accept(GalaxycraftModItems.BLUE_KYBER.get());
			tabData.accept(GalaxycraftModItems.PURPLE_KYBER.get());
			tabData.accept(GalaxycraftModItems.WHITE_KYBER.get());
			tabData.accept(GalaxycraftModItems.BLACK_KYBER.get());
			tabData.accept(GalaxycraftModItems.LIGHTSABER_HILT_CORE.get());
			tabData.accept(GalaxycraftModItems.LIGHTSABER_HILT_CASING.get());
			tabData.accept(GalaxycraftModItems.LIGHTSABER_HILT_HANDLE.get());
			tabData.accept(GalaxycraftModItems.LIGHTSABER_HILT.get());
			tabData.accept(GalaxycraftModItems.HYPER_PLATE.get());
			tabData.accept(GalaxycraftModItems.HYPER_TOKEN.get());
			tabData.accept(GalaxycraftModItems.IRON_ROD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(GalaxycraftModItems.CLONE_ARMOR_HELMET.get());
			tabData.accept(GalaxycraftModItems.CLONE_ARMOR_CHESTPLATE.get());
			tabData.accept(GalaxycraftModItems.CLONE_ARMOR_LEGGINGS.get());
			tabData.accept(GalaxycraftModItems.CLONE_ARMOR_BOOTS.get());
			tabData.accept(GalaxycraftModItems.RED_LIGHTSABER.get());
			tabData.accept(GalaxycraftModItems.ORANGE_LIGHTSABER.get());
			tabData.accept(GalaxycraftModItems.YELLOW_LIGHTSABER.get());
			tabData.accept(GalaxycraftModItems.GREEN_LIGHTSABER.get());
			tabData.accept(GalaxycraftModItems.BLUE_LIGHTSABER.get());
			tabData.accept(GalaxycraftModItems.DARK_SABER.get());
			tabData.accept(GalaxycraftModItems.PURPLE_LIGHTSABER.get());
			tabData.accept(GalaxycraftModItems.WHITE_LIGHTSABER.get());
		}
	}
}
