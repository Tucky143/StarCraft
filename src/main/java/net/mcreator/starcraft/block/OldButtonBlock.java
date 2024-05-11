

package net.mcreator.starcraft.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;


public class OldButtonBlock extends
ButtonBlock
{
public OldButtonBlock() {
super( BlockBehaviour.Properties.of()
.ignitedByLava().instrument(NoteBlockInstrument.BASS)
.sound(SoundType.WOOD)
.strength(2f, 3f)
.dynamicShape()
, BlockSetType.OAK, 30, true);
}
@Override public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
return 0;
}
@Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
return 5;
}
}