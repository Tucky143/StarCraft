
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.starcraft.block.KyberOreBlock;
import net.mcreator.starcraft.StarcraftMod;

public class StarcraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, StarcraftMod.MODID);
	public static final RegistryObject<Block> KYBER_ORE = REGISTRY.register("kyber_ore", () -> new KyberOreBlock());
}
