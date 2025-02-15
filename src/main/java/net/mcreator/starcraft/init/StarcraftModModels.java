
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcraft.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.starcraft.client.model.ModelEwokArcher;
import net.mcreator.starcraft.client.model.ModelEwok;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class StarcraftModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelEwok.LAYER_LOCATION, ModelEwok::createBodyLayer);
		event.registerLayerDefinition(ModelEwokArcher.LAYER_LOCATION, ModelEwokArcher::createBodyLayer);
	}
}
