
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.starcraft.block.entity.MoistureVaporatorBlockEntity;
import net.mcreator.starcraft.StarcraftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class StarcraftModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, StarcraftMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> MOISTURE_VAPORATOR = register("moisture_vaporator", StarcraftModBlocks.MOISTURE_VAPORATOR, MoistureVaporatorBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, MOISTURE_VAPORATOR.get(), (blockEntity, side) -> ((MoistureVaporatorBlockEntity) blockEntity).getItemHandler());
	}
}
