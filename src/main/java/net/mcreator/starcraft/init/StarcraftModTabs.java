
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.starcraft.StarcraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StarcraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StarcraftMod.MODID);
	public static final RegistryObject<CreativeModeTab> STAR_TAB = REGISTRY.register("star_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.starcraft.star_tab")).icon(() -> new ItemStack(StarcraftModItems.CLONE_ARMOR_HELMET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(StarcraftModItems.BLUE_KYBER.get());
				tabData.accept(StarcraftModItems.RED_KYBER.get());
				tabData.accept(StarcraftModItems.GREEN_KYBER.get());
				tabData.accept(StarcraftModItems.PURPLE_KYBER.get());
				tabData.accept(StarcraftModItems.ORANGE_KYBER.get());
				tabData.accept(StarcraftModItems.YELLOW_KYBER.get());
				tabData.accept(StarcraftModItems.WHITE_KYBER.get());
				tabData.accept(StarcraftModItems.BLACK_KYBER.get());
				tabData.accept(StarcraftModItems.CLONE_ARMOR_HELMET.get());
				tabData.accept(StarcraftModItems.CLONE_ARMOR_CHESTPLATE.get());
				tabData.accept(StarcraftModItems.CLONE_ARMOR_LEGGINGS.get());
				tabData.accept(StarcraftModItems.CLONE_ARMOR_BOOTS.get());
				tabData.accept(StarcraftModItems.CACTUS_FRUIT.get());
				tabData.accept(StarcraftModItems.HYPER_PLATE.get());
				tabData.accept(StarcraftModItems.LIGHTSABER_HILT_CORE.get());
				tabData.accept(StarcraftModItems.LIGHTSABER_HILT_CASING.get());
				tabData.accept(StarcraftModItems.LIGHTSABER_HILT_HANDLE.get());
				tabData.accept(StarcraftModItems.LIGHTSABER_HILT.get());
				tabData.accept(StarcraftModBlocks.KYBER_CRYSTAL_ORE.get().asItem());
				tabData.accept(StarcraftModBlocks.OLD_MUD.get().asItem());
				tabData.accept(StarcraftModItems.LIQUID_MUD_BUCKET.get());
				tabData.accept(StarcraftModBlocks.OLD_WOOD.get().asItem());
				tabData.accept(StarcraftModBlocks.OLD_LOG.get().asItem());
				tabData.accept(StarcraftModBlocks.OLD_PLANKS.get().asItem());
				tabData.accept(StarcraftModBlocks.OLD_STAIRS.get().asItem());
				tabData.accept(StarcraftModBlocks.OLD_SLAB.get().asItem());
				tabData.accept(StarcraftModBlocks.OLD_FENCE.get().asItem());
				tabData.accept(StarcraftModBlocks.OLD_FENCE_GATE.get().asItem());
				tabData.accept(StarcraftModBlocks.OLD_PRESSURE_PLATE.get().asItem());
				tabData.accept(StarcraftModBlocks.OLD_BUTTON.get().asItem());
				tabData.accept(StarcraftModBlocks.CRACKED_SANDSTONE.get().asItem());
				tabData.accept(StarcraftModItems.IRON_ROD.get());
				tabData.accept(StarcraftModBlocks.REDWOOD_LEAVES.get().asItem());
				tabData.accept(StarcraftModBlocks.REDWOOD_WOOD.get().asItem());
				tabData.accept(StarcraftModBlocks.REDWOOD_LOG.get().asItem());
				tabData.accept(StarcraftModBlocks.REDWOOD_PLANKS.get().asItem());
				tabData.accept(StarcraftModBlocks.REDWOOD_STAIRS.get().asItem());
				tabData.accept(StarcraftModBlocks.REDWOOD_SLAB.get().asItem());
				tabData.accept(StarcraftModBlocks.REDWOOD_FENCE.get().asItem());
				tabData.accept(StarcraftModBlocks.REDWOOD_FENCE_GATE.get().asItem());
				tabData.accept(StarcraftModBlocks.REDWOOD_PRESSURE_PLATE.get().asItem());
				tabData.accept(StarcraftModBlocks.REDWOOD_BUTTON.get().asItem());
				tabData.accept(StarcraftModBlocks.MOISTURE_VAPORATOR.get().asItem());
				tabData.accept(StarcraftModItems.ENDOR_PLANET_TOKEN.get());
				tabData.accept(StarcraftModItems.DAGOBAH_PLANET_TOKEN.get());
				tabData.accept(StarcraftModItems.TATOOINE_PLANET_TOKEN.get());
				tabData.accept(StarcraftModItems.HYPER_TOKEN.get());
				tabData.accept(StarcraftModItems.MC_PLANET_TOKEN.get());
				tabData.accept(StarcraftModItems.HOTH_PLANET_TOKEN.get());
				tabData.accept(StarcraftModItems.BLUE_LIGHTSABER.get());
				tabData.accept(StarcraftModItems.RAW_EWOK_MEAT.get());
				tabData.accept(StarcraftModItems.EWOK_JERKY.get());
			}).withSearchBar().build());

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
			tabData.accept(StarcraftModBlocks.REDWOOD_WOOD.get().asItem());
			tabData.accept(StarcraftModBlocks.REDWOOD_LOG.get().asItem());
			tabData.accept(StarcraftModBlocks.REDWOOD_PLANKS.get().asItem());
			tabData.accept(StarcraftModBlocks.REDWOOD_STAIRS.get().asItem());
			tabData.accept(StarcraftModBlocks.REDWOOD_SLAB.get().asItem());
			tabData.accept(StarcraftModBlocks.REDWOOD_FENCE.get().asItem());
			tabData.accept(StarcraftModBlocks.REDWOOD_FENCE_GATE.get().asItem());
			tabData.accept(StarcraftModBlocks.REDWOOD_PRESSURE_PLATE.get().asItem());
			tabData.accept(StarcraftModBlocks.REDWOOD_BUTTON.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(StarcraftModItems.DAGOBAH_PLANET_TOKEN.get());
			tabData.accept(StarcraftModItems.MC_PLANET_TOKEN.get());
			tabData.accept(StarcraftModItems.TATOOINE_PLANET_TOKEN.get());
			tabData.accept(StarcraftModItems.ENDOR_PLANET_TOKEN.get());
			tabData.accept(StarcraftModItems.HOTH_PLANET_TOKEN.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(StarcraftModBlocks.MOISTURE_VAPORATOR.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(StarcraftModItems.CLONE_ARMOR_HELMET.get());
			tabData.accept(StarcraftModItems.CLONE_ARMOR_CHESTPLATE.get());
			tabData.accept(StarcraftModItems.CLONE_ARMOR_LEGGINGS.get());
			tabData.accept(StarcraftModItems.CLONE_ARMOR_BOOTS.get());
			tabData.accept(StarcraftModItems.BLUE_LIGHTSABER.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(StarcraftModItems.EWOK_SPAWN_EGG.get());
			tabData.accept(StarcraftModItems.EWOK_ARCHER_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
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
			tabData.accept(StarcraftModItems.IRON_ROD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(StarcraftModBlocks.KYBER_CRYSTAL_ORE.get().asItem());
			tabData.accept(StarcraftModBlocks.OLD_MUD.get().asItem());
			tabData.accept(StarcraftModBlocks.FLOWERING_CACTUS.get().asItem());
			tabData.accept(StarcraftModBlocks.CRACKED_SANDSTONE.get().asItem());
			tabData.accept(StarcraftModBlocks.REDWOOD_LEAVES.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(StarcraftModItems.LIQUID_MUD_BUCKET.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(StarcraftModItems.CACTUS_FRUIT.get());
			tabData.accept(StarcraftModItems.RAW_EWOK_MEAT.get());
			tabData.accept(StarcraftModItems.EWOK_JERKY.get());
		}
	}
}
