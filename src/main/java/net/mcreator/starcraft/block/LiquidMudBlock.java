

package net.mcreator.starcraft.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class LiquidMudBlock extends LiquidBlock {
public LiquidMudBlock() {
super(() -> StarcraftModFluids.LIQUID_MUD.get(),
BlockBehaviour.Properties.of()
.mapColor(MapColor.COLOR_BROWN)
.strength(100f)
.noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable()
);
}
@Override public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
return 14;
}
@Override public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
super.onPlace(blockstate, world, pos, oldState, moving);
LiquidMudUpdateTickProcedure.execute(world,pos.getX(),pos.getY(),pos.getZ());
}
@Override public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
LiquidMudUpdateTickProcedure.execute(world,pos.getX(),pos.getY(),pos.getZ());
}
@Override public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
super.tick(blockstate, world, pos, random);
LiquidMudUpdateTickProcedure.execute(world,pos.getX(),pos.getY(),pos.getZ());
}
@Override public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
super.entityInside(blockstate, world, pos, entity);
LiquidMudUpdateTickProcedure.execute(world,pos.getX(),pos.getY(),pos.getZ());
}
@Override @OnlyIn(Dist.CLIENT) public void animateTick(BlockState blockstate, Level world, BlockPos pos, RandomSource random) {
super.animateTick(blockstate, world, pos, random);
LiquidMudUpdateTickProcedure.execute(world,pos.getX(),pos.getY(),pos.getZ());
}
}