
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.starcraft.world.inventory.MoistureVaporatorGUIMenu;
import net.mcreator.starcraft.StarcraftMod;

public class StarcraftModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, StarcraftMod.MODID);
	public static final RegistryObject<MenuType<MoistureVaporatorGUIMenu>> MOISTURE_VAPORATOR_GUI = REGISTRY.register("moisture_vaporator_gui", () -> IForgeMenuType.create(MoistureVaporatorGUIMenu::new));
}
