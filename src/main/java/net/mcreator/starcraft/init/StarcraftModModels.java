
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.starcraft.client.model.ModelEwokArcher;
import net.mcreator.starcraft.client.model.ModelEwok;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class StarcraftModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelEwok.LAYER_LOCATION, ModelEwok::createBodyLayer);
		event.registerLayerDefinition(ModelEwokArcher.LAYER_LOCATION, ModelEwokArcher::createBodyLayer);
	}
}
