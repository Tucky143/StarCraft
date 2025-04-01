
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.galaxycraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

import net.mcreator.galaxycraft.GalaxycraftMod;

public class GalaxycraftModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, GalaxycraftMod.MODID);
	public static final DeferredHolder<Potion, Potion> WAMPA_SLAYER = REGISTRY.register("wampa_slayer",
			() -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 6000, 0, false, true), new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 0, false, true), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 6000, 0, false, true)));
}
