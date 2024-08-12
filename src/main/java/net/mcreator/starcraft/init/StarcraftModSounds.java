
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.starcraft.StarcraftMod;

public class StarcraftModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, StarcraftMod.MODID);
	public static final RegistryObject<SoundEvent> EWOK_AMBIENT = REGISTRY.register("ewok_ambient", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("starcraft", "ewok_ambient")));
	public static final RegistryObject<SoundEvent> EWOK_HURT = REGISTRY.register("ewok_hurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("starcraft", "ewok_hurt")));
}
