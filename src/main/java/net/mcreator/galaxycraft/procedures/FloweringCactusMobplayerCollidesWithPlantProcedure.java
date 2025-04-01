package net.mcreator.galaxycraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.galaxycraft.GalaxycraftMod;

public class FloweringCactusMobplayerCollidesWithPlantProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		GalaxycraftMod.queueServerWork(20, () -> {
			entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.CACTUS)), 1);
		});
	}
}
