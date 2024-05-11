
package net.mcreator.starcraft.fluid;

public abstract class LiquidMudFluid extends ForgeFlowingFluid {
public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(
() -> StarcraftModFluidTypes.LIQUID_MUD_TYPE.get(),
() -> StarcraftModFluids.LIQUID_MUD.get(),
() -> StarcraftModFluids.FLOWING_LIQUID_MUD.get())
.explosionResistance(100f)
.tickRate(45)
.slopeFindDistance(3)
.bucket(() -> StarcraftModItems.LIQUID_MUD_BUCKET.get())
.block(() -> (LiquidBlock) StarcraftModBlocks.LIQUID_MUD.get());
private LiquidMudFluid() {
super(PROPERTIES);
}
public static class Source extends LiquidMudFluid {
public int getAmount(FluidState state) {
return 8;
}
public boolean isSource(FluidState state) {
return true;
}
}
public static class Flowing extends LiquidMudFluid {
protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
super.createFluidStateDefinition(builder);
builder.add(LEVEL);
}
public int getAmount(FluidState state) {
return state.getValue(LEVEL);
}
public boolean isSource(FluidState state) {
return false;
}
}
}
