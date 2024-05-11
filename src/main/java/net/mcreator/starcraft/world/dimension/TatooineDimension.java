
package net.mcreator.starcraft.world.dimension;

@Mod.EventBusSubscriber public class TatooineDimension {
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD) public static class DimensionSpecialEffectsHandler {
@SubscribeEvent @OnlyIn(Dist.CLIENT) public static void registerDimensionSpecialEffects(RegisterDimensionSpecialEffectsEvent event) {
DimensionSpecialEffects customEffect = new DimensionSpecialEffects(
DimensionSpecialEffects.OverworldEffects.CLOUD_LEVEL,
true,
DimensionSpecialEffects.SkyType.NORMAL,
false,
false
) {
@Override public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
return new Vec3(1,0.9254901961,0.5764705882);
}
@Override public boolean isFoggyAt(int x, int y) {
return false;
}
};
event.register(new ResourceLocation("starcraft:tatooine"), customEffect);
}
}
}