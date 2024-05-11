package net.mcreator.starcraft.procedures;

import net.minecraftforge.eventbus.api.Event;


public class FloweringCactusMobplayerCollidesWithPlantProcedure {
public static void execute(
LevelAccessor world,
Entity entity
) {
if(
entity == null
) return ;
StarcraftMod.queueServerWork(20, () -> {
entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.CACTUS)), 1);
});
}
}
