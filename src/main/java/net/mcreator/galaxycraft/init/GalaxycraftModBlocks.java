
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.galaxycraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.galaxycraft.block.RedwoodWoodBlock;
import net.mcreator.galaxycraft.block.RedwoodStairsBlock;
import net.mcreator.galaxycraft.block.RedwoodSlabBlock;
import net.mcreator.galaxycraft.block.RedwoodPressurePlateBlock;
import net.mcreator.galaxycraft.block.RedwoodPlanksBlock;
import net.mcreator.galaxycraft.block.RedwoodLogBlock;
import net.mcreator.galaxycraft.block.RedwoodLeavesBlock;
import net.mcreator.galaxycraft.block.RedwoodFenceGateBlock;
import net.mcreator.galaxycraft.block.RedwoodFenceBlock;
import net.mcreator.galaxycraft.block.RedwoodButtonBlock;
import net.mcreator.galaxycraft.block.OldWoodBlock;
import net.mcreator.galaxycraft.block.OldStairsBlock;
import net.mcreator.galaxycraft.block.OldSlabBlock;
import net.mcreator.galaxycraft.block.OldPressurePlateBlock;
import net.mcreator.galaxycraft.block.OldPlanksBlock;
import net.mcreator.galaxycraft.block.OldMudBlock;
import net.mcreator.galaxycraft.block.OldLogBlock;
import net.mcreator.galaxycraft.block.OldFenceGateBlock;
import net.mcreator.galaxycraft.block.OldFenceBlock;
import net.mcreator.galaxycraft.block.OldButtonBlock;
import net.mcreator.galaxycraft.block.MoistureVaporatorBlock;
import net.mcreator.galaxycraft.block.LiquidMudBlock;
import net.mcreator.galaxycraft.block.KyberCrystalOreBlock;
import net.mcreator.galaxycraft.block.HardenedMudBlock;
import net.mcreator.galaxycraft.block.FloweringCactusBlock;
import net.mcreator.galaxycraft.block.CrackedSandstoneBlock;
import net.mcreator.galaxycraft.block.AshBlockBlock;
import net.mcreator.galaxycraft.GalaxycraftMod;

public class GalaxycraftModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(GalaxycraftMod.MODID);
	public static final DeferredBlock<Block> KYBER_CRYSTAL_ORE = REGISTRY.register("kyber_crystal_ore", KyberCrystalOreBlock::new);
	public static final DeferredBlock<Block> OLD_MUD = REGISTRY.register("old_mud", OldMudBlock::new);
	public static final DeferredBlock<Block> LIQUID_MUD = REGISTRY.register("liquid_mud", LiquidMudBlock::new);
	public static final DeferredBlock<Block> FLOWERING_CACTUS = REGISTRY.register("flowering_cactus", FloweringCactusBlock::new);
	public static final DeferredBlock<Block> OLD_WOOD = REGISTRY.register("old_wood", OldWoodBlock::new);
	public static final DeferredBlock<Block> OLD_LOG = REGISTRY.register("old_log", OldLogBlock::new);
	public static final DeferredBlock<Block> OLD_PLANKS = REGISTRY.register("old_planks", OldPlanksBlock::new);
	public static final DeferredBlock<Block> OLD_STAIRS = REGISTRY.register("old_stairs", OldStairsBlock::new);
	public static final DeferredBlock<Block> OLD_SLAB = REGISTRY.register("old_slab", OldSlabBlock::new);
	public static final DeferredBlock<Block> OLD_FENCE = REGISTRY.register("old_fence", OldFenceBlock::new);
	public static final DeferredBlock<Block> OLD_FENCE_GATE = REGISTRY.register("old_fence_gate", OldFenceGateBlock::new);
	public static final DeferredBlock<Block> OLD_PRESSURE_PLATE = REGISTRY.register("old_pressure_plate", OldPressurePlateBlock::new);
	public static final DeferredBlock<Block> OLD_BUTTON = REGISTRY.register("old_button", OldButtonBlock::new);
	public static final DeferredBlock<Block> CRACKED_SANDSTONE = REGISTRY.register("cracked_sandstone", CrackedSandstoneBlock::new);
	public static final DeferredBlock<Block> MOISTURE_VAPORATOR = REGISTRY.register("moisture_vaporator", MoistureVaporatorBlock::new);
	public static final DeferredBlock<Block> REDWOOD_WOOD = REGISTRY.register("redwood_wood", RedwoodWoodBlock::new);
	public static final DeferredBlock<Block> REDWOOD_LOG = REGISTRY.register("redwood_log", RedwoodLogBlock::new);
	public static final DeferredBlock<Block> REDWOOD_PLANKS = REGISTRY.register("redwood_planks", RedwoodPlanksBlock::new);
	public static final DeferredBlock<Block> REDWOOD_LEAVES = REGISTRY.register("redwood_leaves", RedwoodLeavesBlock::new);
	public static final DeferredBlock<Block> REDWOOD_STAIRS = REGISTRY.register("redwood_stairs", RedwoodStairsBlock::new);
	public static final DeferredBlock<Block> REDWOOD_SLAB = REGISTRY.register("redwood_slab", RedwoodSlabBlock::new);
	public static final DeferredBlock<Block> REDWOOD_FENCE = REGISTRY.register("redwood_fence", RedwoodFenceBlock::new);
	public static final DeferredBlock<Block> REDWOOD_FENCE_GATE = REGISTRY.register("redwood_fence_gate", RedwoodFenceGateBlock::new);
	public static final DeferredBlock<Block> REDWOOD_PRESSURE_PLATE = REGISTRY.register("redwood_pressure_plate", RedwoodPressurePlateBlock::new);
	public static final DeferredBlock<Block> REDWOOD_BUTTON = REGISTRY.register("redwood_button", RedwoodButtonBlock::new);
	public static final DeferredBlock<Block> ASH_BLOCK = REGISTRY.register("ash_block", AshBlockBlock::new);
	public static final DeferredBlock<Block> HARDENED_MUD = REGISTRY.register("hardened_mud", HardenedMudBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class BlocksClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			FloweringCactusBlock.blockColorLoad(event);
		}
	}
}
