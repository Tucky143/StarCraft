

package net.mcreator.starcraft.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class FloweringCactusBlock extends DoublePlantBlock
{
public FloweringCactusBlock() {
super(
BlockBehaviour.Properties.of()
.mapColor(MapColor.COLOR_PINK)
.sound(SoundType.GRASS)
.strength(3f, 2f)
.noOcclusion()
.dynamicShape()
.offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)
);
}
@Override public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
Vec3 offset = state.getOffset(world, pos);
return
box(0, 0, 0,
11, 18.7, 11)
.move(offset.x, offset.y, offset.z); }
@Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
return 100;
}
@Override public BlockPathTypes getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
return BlockPathTypes.BLOCKED;
}
@Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
return 60;
}
@Override public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
return
groundState.is(Blocks.SAND)
;
}
@Override public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
BlockPos blockpos = pos.below();
BlockState groundState = worldIn.getBlockState(blockpos);
if (blockstate.getValue(HALF) == DoubleBlockHalf.UPPER)
return groundState.is(this) && groundState.getValue(HALF) == DoubleBlockHalf.LOWER;
else
return this.mayPlaceOn(groundState, worldIn, blockpos)
;
}
@Override public PlantType getPlantType(BlockGetter world, BlockPos pos) {
return PlantType.DESERT;
}
@Override public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
super.entityInside(blockstate, world, pos, entity);
FloweringCactusMobplayerCollidesWithPlantProcedure.execute(world,entity);
}
@Override public void onProjectileHit(Level world, BlockState blockstate, BlockHitResult hit, Projectile entity) {
FloweringCactusOnBlockHitByProjectileProcedure.execute(world,hit.getBlockPos().getX(),hit.getBlockPos().getY(),hit.getBlockPos().getZ());
}
@OnlyIn(Dist.CLIENT) public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
event.getBlockColors().register((bs, world, pos, index) -> {
return world != null && pos != null ?
BiomeColors.getAverageFoliageColor(world, pos) : FoliageColor.getDefaultColor();
}, StarcraftModBlocks.FLOWERING_CACTUS.get());
}
@OnlyIn(Dist.CLIENT) public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
event.getItemColors().register((stack, index) -> {
return FoliageColor.getDefaultColor();
}, StarcraftModBlocks.FLOWERING_CACTUS.get());
}
}