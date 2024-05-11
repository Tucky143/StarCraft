package net.mcreator.starcraft.procedures;

import net.minecraftforge.eventbus.api.Event;


public class MoistureVaporatorUpdateTickProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
Entity sourceentity,
HashMap guistate
) {
if(
sourceentity == null ||
guistate == null
) return ;
if (world instanceof Level _level0 && _level0.hasNeighborSignal(BlockPos.containing(x,y,z))) {{
int _value = 1;
BlockPos _pos = BlockPos.containing(x,y,z);
BlockState _bs = world.getBlockState(_pos);
if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
}if (guistate.containsKey("checkbox:WaterGeneration") && ((Checkbox) guistate.get("checkbox:WaterGeneration")).selected()) {if ((sourceentity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ?
((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Items.BUCKET) {StarcraftMod.queueServerWork(12000, () -> {
if(sourceentity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
ItemStack _setstack = new ItemStack(Items.WATER_BUCKET).copy();
_setstack.setCount(1);
((Slot) _slots.get(0)).set(_setstack);
_player.containerMenu.broadcastChanges();
}
});
}}}
}
}
