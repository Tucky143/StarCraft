
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcraft.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.starcraft.fluid.types.LiquidMudFluidType;
import net.mcreator.starcraft.StarcraftMod;

public class StarcraftModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, StarcraftMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> LIQUID_MUD_TYPE = REGISTRY.register("liquid_mud", () -> new LiquidMudFluidType());
}
