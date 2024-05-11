

package net.mcreator.starcraft.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;


public class OldStairsBlock extends
StairBlock
{
public OldStairsBlock() {
super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of()
.ignitedByLava().instrument(NoteBlockInstrument.BASS)
.sound(SoundType.WOOD)
.strength(3f, 2f)
.dynamicShape()
);
}
@Override public float getExplosionResistance() {
return 2f;
}
@Override public boolean isRandomlyTicking(BlockState state) {
return false;
}
@Override public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
return 0;
}
@Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
return 5;
}
}