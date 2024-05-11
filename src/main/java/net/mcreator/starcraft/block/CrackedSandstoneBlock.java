

package net.mcreator.starcraft.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;


public class CrackedSandstoneBlock extends
Block
{
public CrackedSandstoneBlock() {
super( BlockBehaviour.Properties.of()
.instrument(NoteBlockInstrument.BASEDRUM)
.sound(SoundType.SAND)
.strength(3.5f, 10f)
.requiresCorrectToolForDrops()
);
}
@Override public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
return 15;
}
}