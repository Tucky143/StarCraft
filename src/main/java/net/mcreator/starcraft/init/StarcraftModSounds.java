
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.starcraft.StarcraftMod;

public class StarcraftModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, StarcraftMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> LIGHTSABER_SWING = REGISTRY.register("lightsaber_swing", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("starcraft", "lightsaber_swing")));
	public static final DeferredHolder<SoundEvent, SoundEvent> LIGHTSABER_CLASH = REGISTRY.register("lightsaber_clash", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("starcraft", "lightsaber_clash")));
	public static final DeferredHolder<SoundEvent, SoundEvent> EWOK_AMBIENT = REGISTRY.register("ewok_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("starcraft", "ewok_ambient")));
	public static final DeferredHolder<SoundEvent, SoundEvent> EWOK_HURT = REGISTRY.register("ewok_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("starcraft", "ewok_hurt")));
}
