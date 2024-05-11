

package net.mcreator.starcraft.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;


public class KyberOreBlock extends
Block
{
public KyberOreBlock() {
super( BlockBehaviour.Properties.of()
.instrument(NoteBlockInstrument.BASEDRUM)
.sound(SoundType.STONE)
.strength(8.4f, 11.3945303474f)
.requiresCorrectToolForDrops()
);
}
@Override public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
return 15;
}
}