
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.starcraft.block.RedwoodWoodBlock;
import net.mcreator.starcraft.block.RedwoodStairsBlock;
import net.mcreator.starcraft.block.RedwoodSlabBlock;
import net.mcreator.starcraft.block.RedwoodPressurePlateBlock;
import net.mcreator.starcraft.block.RedwoodPlanksBlock;
import net.mcreator.starcraft.block.RedwoodLogBlock;
import net.mcreator.starcraft.block.RedwoodLeavesBlock;
import net.mcreator.starcraft.block.RedwoodFenceGateBlock;
import net.mcreator.starcraft.block.RedwoodFenceBlock;
import net.mcreator.starcraft.block.RedwoodButtonBlock;
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
import net.mcreator.starcraft.block.MoistureVaporatorBlock;
import net.mcreator.starcraft.block.LiquidMudBlock;
import net.mcreator.starcraft.block.KyberCrystalOreBlock;
import net.mcreator.starcraft.block.FloweringCactusBlock;
import net.mcreator.starcraft.block.CrackedSandstoneBlock;
import net.mcreator.starcraft.block.AshBlockBlock;
import net.mcreator.starcraft.StarcraftMod;

public class StarcraftModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(StarcraftMod.MODID);
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

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class BlocksClientSideHandler {
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
