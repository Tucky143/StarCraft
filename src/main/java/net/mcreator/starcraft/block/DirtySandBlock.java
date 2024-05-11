

package net.mcreator.starcraft.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;


public class DirtySandBlock extends
Block
{
public static final DirectionProperty FACING = DirectionalBlock.FACING;
public DirtySandBlock() {
super( BlockBehaviour.Properties.of()
.instrument(NoteBlockInstrument.SNARE)
.mapColor(MapColor.SAND)
.sound(SoundType.SAND)
.strength(1f, 5f)
.friction(0.5f)
.speedFactor(0.9f)
);
this.registerDefaultState(this.stateDefinition.any()
.setValue(FACING, Direction.NORTH)
);
}
@Override public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
return 15;
}
@Override protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
builder.add(FACING);
}
@Override
public BlockState getStateForPlacement(BlockPlaceContext context) {
return this.defaultBlockState()
.setValue(FACING, context.getNearestLookingDirection().getOpposite())
;
}
public BlockState rotate(BlockState state, Rotation rot) {
return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
}
public BlockState mirror(BlockState state, Mirror mirrorIn) {
return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
}
}