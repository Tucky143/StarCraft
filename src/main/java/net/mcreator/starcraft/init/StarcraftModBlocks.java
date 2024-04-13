
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.starcraft.block.OldMudBlock;
import net.mcreator.starcraft.block.LiquidMudBlock;
import net.mcreator.starcraft.block.KyberCrystalOreBlock;
import net.mcreator.starcraft.StarcraftMod;

public class StarcraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, StarcraftMod.MODID);
	public static final RegistryObject<Block> KYBER_CRYSTAL_ORE = REGISTRY.register("kyber_crystal_ore", () -> new KyberCrystalOreBlock());
	public static final RegistryObject<Block> OLD_MUD = REGISTRY.register("old_mud", () -> new OldMudBlock());
	public static final RegistryObject<Block> LIQUID_MUD = REGISTRY.register("liquid_mud", () -> new LiquidMudBlock());
}
