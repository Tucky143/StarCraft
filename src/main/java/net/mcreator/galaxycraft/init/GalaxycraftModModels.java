
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.galaxycraft.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.galaxycraft.client.model.Modelwampa;
import net.mcreator.galaxycraft.client.model.ModelEwokArcher;
import net.mcreator.galaxycraft.client.model.ModelEwok;
import net.mcreator.galaxycraft.client.model.ModelBantha;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class GalaxycraftModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelBantha.LAYER_LOCATION, ModelBantha::createBodyLayer);
		event.registerLayerDefinition(Modelwampa.LAYER_LOCATION, Modelwampa::createBodyLayer);
		event.registerLayerDefinition(ModelEwok.LAYER_LOCATION, ModelEwok::createBodyLayer);
		event.registerLayerDefinition(ModelEwokArcher.LAYER_LOCATION, ModelEwokArcher::createBodyLayer);
	}
}
