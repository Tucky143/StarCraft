
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.galaxycraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.galaxycraft.GalaxycraftMod;

public class GalaxycraftModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, GalaxycraftMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> LIGHTSABER_SWING = REGISTRY.register("lightsaber_swing", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("galaxycraft", "lightsaber_swing")));
	public static final DeferredHolder<SoundEvent, SoundEvent> LIGHTSABER_CLASH = REGISTRY.register("lightsaber_clash", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("galaxycraft", "lightsaber_clash")));
	public static final DeferredHolder<SoundEvent, SoundEvent> EWOK_AMBIENT = REGISTRY.register("ewok_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("galaxycraft", "ewok_ambient")));
	public static final DeferredHolder<SoundEvent, SoundEvent> EWOK_HURT = REGISTRY.register("ewok_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("galaxycraft", "ewok_hurt")));
}
