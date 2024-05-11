package net.mcreator.starcraft.procedures;

import net.minecraftforge.eventbus.api.Event;


public class FloweringCactusOnBlockHitByProjectileProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z
) {
{
BlockPos _pos = BlockPos.containing(x,y,z);
Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x,y,z), null);
world.destroyBlock(_pos, false);
}
}
}
