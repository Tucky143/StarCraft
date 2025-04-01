
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.galaxycraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.galaxycraft.world.inventory.MoistureVaporatorGUIMenu;
import net.mcreator.galaxycraft.GalaxycraftMod;

public class GalaxycraftModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, GalaxycraftMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<MoistureVaporatorGUIMenu>> MOISTURE_VAPORATOR_GUI = REGISTRY.register("moisture_vaporator_gui", () -> IMenuTypeExtension.create(MoistureVaporatorGUIMenu::new));
}
