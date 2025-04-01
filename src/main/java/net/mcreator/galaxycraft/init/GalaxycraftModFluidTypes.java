
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.galaxycraft.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.galaxycraft.fluid.types.LiquidMudFluidType;
import net.mcreator.galaxycraft.GalaxycraftMod;

public class GalaxycraftModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, GalaxycraftMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> LIQUID_MUD_TYPE = REGISTRY.register("liquid_mud", () -> new LiquidMudFluidType());
}
