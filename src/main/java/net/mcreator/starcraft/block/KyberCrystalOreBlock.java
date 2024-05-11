

package net.mcreator.starcraft.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;


public class KyberCrystalOreBlock extends
Block
{
public KyberCrystalOreBlock() {
super( BlockBehaviour.Properties.of()
.instrument(NoteBlockInstrument.BASEDRUM)
.sound(SoundType.GLASS)
.strength(11f, 16f)
.lightLevel(s -> 5)
.requiresCorrectToolForDrops()
.hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)
);
}
@Override public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
return 15;
}
}