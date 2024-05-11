
package net.mcreator.starcraft.fluid.types;

public class LiquidMudFluidType extends FluidType {
public LiquidMudFluidType() {
super(FluidType.Properties.create()
.fallDistanceModifier(0F)
.canExtinguish(true)
.supportsBoating(true)
.canHydrate(true)
.motionScale(0.0042D)
.density(1400)
.viscosity(1655)
.temperature(260)
.rarity(Rarity.UNCOMMON)
.sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
.sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)
.sound(SoundActions.FLUID_VAPORIZE, SoundEvents.FIRE_EXTINGUISH));
}
@Override public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
consumer.accept(new IClientFluidTypeExtensions() {
private static final ResourceLocation STILL_TEXTURE = new ResourceLocation("starcraft:block/water_still"),
FLOWING_TEXTURE = new ResourceLocation("starcraft:block/water_flow");
@Override public ResourceLocation getStillTexture() {
return STILL_TEXTURE;
}
@Override public ResourceLocation getFlowingTexture() {
return FLOWING_TEXTURE;
}
}
);
}
}