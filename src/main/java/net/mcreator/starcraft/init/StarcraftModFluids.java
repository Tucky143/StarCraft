
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.starcraft.fluid.LiquidMudFluid;
import net.mcreator.starcraft.StarcraftMod;

public class StarcraftModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, StarcraftMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> LIQUID_MUD = REGISTRY.register("liquid_mud", () -> new LiquidMudFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_LIQUID_MUD = REGISTRY.register("flowing_liquid_mud", () -> new LiquidMudFluid.Flowing());

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(LIQUID_MUD.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LIQUID_MUD.get(), RenderType.translucent());
		}
	}
}
