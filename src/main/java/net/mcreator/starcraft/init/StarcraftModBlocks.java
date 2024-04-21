
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.starcraft.block.WetSandBlock;
import net.mcreator.starcraft.block.OldWoodBlock;
import net.mcreator.starcraft.block.OldStairsBlock;
import net.mcreator.starcraft.block.OldSlabBlock;
import net.mcreator.starcraft.block.OldPressurePlateBlock;
import net.mcreator.starcraft.block.OldPlanksBlock;
import net.mcreator.starcraft.block.OldMudBlock;
import net.mcreator.starcraft.block.OldLogBlock;
import net.mcreator.starcraft.block.OldFenceGateBlock;
import net.mcreator.starcraft.block.OldFenceBlock;
import net.mcreator.starcraft.block.OldButtonBlock;
import net.mcreator.starcraft.block.LiquidMudBlock;
import net.mcreator.starcraft.block.KyberCrystalOreBlock;
import net.mcreator.starcraft.block.FloweringCactusBlock;
import net.mcreator.starcraft.block.CrackedSandstoneBlock;
import net.mcreator.starcraft.StarcraftMod;

public class StarcraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, StarcraftMod.MODID);
	public static final RegistryObject<Block> KYBER_CRYSTAL_ORE = REGISTRY.register("kyber_crystal_ore", () -> new KyberCrystalOreBlock());
	public static final RegistryObject<Block> OLD_MUD = REGISTRY.register("old_mud", () -> new OldMudBlock());
	public static final RegistryObject<Block> LIQUID_MUD = REGISTRY.register("liquid_mud", () -> new LiquidMudBlock());
	public static final RegistryObject<Block> FLOWERING_CACTUS = REGISTRY.register("flowering_cactus", () -> new FloweringCactusBlock());
	public static final RegistryObject<Block> OLD_WOOD = REGISTRY.register("old_wood", () -> new OldWoodBlock());
	public static final RegistryObject<Block> OLD_LOG = REGISTRY.register("old_log", () -> new OldLogBlock());
	public static final RegistryObject<Block> OLD_PLANKS = REGISTRY.register("old_planks", () -> new OldPlanksBlock());
	public static final RegistryObject<Block> OLD_STAIRS = REGISTRY.register("old_stairs", () -> new OldStairsBlock());
	public static final RegistryObject<Block> OLD_SLAB = REGISTRY.register("old_slab", () -> new OldSlabBlock());
	public static final RegistryObject<Block> OLD_FENCE = REGISTRY.register("old_fence", () -> new OldFenceBlock());
	public static final RegistryObject<Block> OLD_FENCE_GATE = REGISTRY.register("old_fence_gate", () -> new OldFenceGateBlock());
	public static final RegistryObject<Block> OLD_PRESSURE_PLATE = REGISTRY.register("old_pressure_plate", () -> new OldPressurePlateBlock());
	public static final RegistryObject<Block> OLD_BUTTON = REGISTRY.register("old_button", () -> new OldButtonBlock());
	public static final RegistryObject<Block> CRACKED_SANDSTONE = REGISTRY.register("cracked_sandstone", () -> new CrackedSandstoneBlock());
	public static final RegistryObject<Block> WET_SAND = REGISTRY.register("wet_sand", () -> new WetSandBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			FloweringCactusBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
			FloweringCactusBlock.itemColorLoad(event);
		}
	}
}
