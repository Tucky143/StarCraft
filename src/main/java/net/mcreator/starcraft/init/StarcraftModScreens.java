
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcraft.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.starcraft.client.gui.MoistureVaporatorGUIScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class StarcraftModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(StarcraftModMenus.MOISTURE_VAPORATOR_GUI.get(), MoistureVaporatorGUIScreen::new);
	}
}
