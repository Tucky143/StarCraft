
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcraft.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.starcraft.client.renderer.EwokRenderer;
import net.mcreator.starcraft.client.renderer.EwokArcherRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class StarcraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(StarcraftModEntities.EWOK.get(), EwokRenderer::new);
		event.registerEntityRenderer(StarcraftModEntities.EWOK_ARCHER.get(), EwokArcherRenderer::new);
	}
}
