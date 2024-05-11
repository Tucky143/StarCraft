

package net.mcreator.starcraft.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;


public class OldPressurePlateBlock extends
PressurePlateBlock
{
public OldPressurePlateBlock() {
super(Sensitivity.EVERYTHING, BlockBehaviour.Properties.of()
.ignitedByLava().instrument(NoteBlockInstrument.BASS)
.sound(SoundType.WOOD)
.strength(2f, 3f)
.dynamicShape()
.forceSolidOn()
, BlockSetType.OAK);
}
@Override public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
return 0;
}
@Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
return 5;
}
}