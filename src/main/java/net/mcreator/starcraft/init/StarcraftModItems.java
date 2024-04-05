
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.starcraft.item.KyberItem;
import net.mcreator.starcraft.StarcraftMod;

public class StarcraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, StarcraftMod.MODID);
	public static final RegistryObject<Item> KYBER_BLOCK = block(StarcraftModBlocks.KYBER_BLOCK);
	public static final RegistryObject<Item> KYBER_ORE = block(StarcraftModBlocks.KYBER_ORE);
	public static final RegistryObject<Item> KYBER = REGISTRY.register("kyber", () -> new KyberItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
