
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.galaxycraft.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.galaxycraft.client.renderer.WampaRenderer;
import net.mcreator.galaxycraft.client.renderer.EwokRenderer;
import net.mcreator.galaxycraft.client.renderer.EwokArcherRenderer;
import net.mcreator.galaxycraft.client.renderer.BanthaRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GalaxycraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(GalaxycraftModEntities.EWOK.get(), EwokRenderer::new);
		event.registerEntityRenderer(GalaxycraftModEntities.EWOK_ARCHER.get(), EwokArcherRenderer::new);
		event.registerEntityRenderer(GalaxycraftModEntities.WAMPA.get(), WampaRenderer::new);
		event.registerEntityRenderer(GalaxycraftModEntities.BANTHA.get(), BanthaRenderer::new);
	}
}
