
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
	public static final RegistryObject<Block> MOISTURE_VAPORATOR = REGISTRY.register("moisture_vaporator", () -> new MoistureVaporatorBlock());
	public static final RegistryObject<Block> REDWOOD_WOOD = REGISTRY.register("redwood_wood", () -> new RedwoodWoodBlock());
	public static final RegistryObject<Block> REDWOOD_LOG = REGISTRY.register("redwood_log", () -> new RedwoodLogBlock());
	public static final RegistryObject<Block> REDWOOD_PLANKS = REGISTRY.register("redwood_planks", () -> new RedwoodPlanksBlock());
	public static final RegistryObject<Block> REDWOOD_LEAVES = REGISTRY.register("redwood_leaves", () -> new RedwoodLeavesBlock());
	public static final RegistryObject<Block> REDWOOD_STAIRS = REGISTRY.register("redwood_stairs", () -> new RedwoodStairsBlock());
	public static final RegistryObject<Block> REDWOOD_SLAB = REGISTRY.register("redwood_slab", () -> new RedwoodSlabBlock());
	public static final RegistryObject<Block> REDWOOD_FENCE = REGISTRY.register("redwood_fence", () -> new RedwoodFenceBlock());
	public static final RegistryObject<Block> REDWOOD_FENCE_GATE = REGISTRY.register("redwood_fence_gate", () -> new RedwoodFenceGateBlock());
	public static final RegistryObject<Block> REDWOOD_PRESSURE_PLATE = REGISTRY.register("redwood_pressure_plate", () -> new RedwoodPressurePlateBlock());
	public static final RegistryObject<Block> REDWOOD_BUTTON = REGISTRY.register("redwood_button", () -> new RedwoodButtonBlock());
	public static final RegistryObject<Block> ASH_BLOCK = REGISTRY.register("ash_block", () -> new AshBlockBlock());

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
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
