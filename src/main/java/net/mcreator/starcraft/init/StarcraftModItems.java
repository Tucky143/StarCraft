
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

import net.mcreator.starcraft.item.YellowKyberItem;
import net.mcreator.starcraft.item.WhiteKyberItem;
import net.mcreator.starcraft.item.RedKyberItem;
import net.mcreator.starcraft.item.PurpleKyberItem;
import net.mcreator.starcraft.item.OrangeKyberItem;
import net.mcreator.starcraft.item.KyberItem;
import net.mcreator.starcraft.item.GreenKyberItem;
import net.mcreator.starcraft.item.CloneArmorItem;
import net.mcreator.starcraft.item.BlackKyberItem;
import net.mcreator.starcraft.StarcraftMod;

public class StarcraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, StarcraftMod.MODID);
	public static final RegistryObject<Item> KYBER_ORE = block(StarcraftModBlocks.KYBER_ORE);
	public static final RegistryObject<Item> BLUE_KYBER = REGISTRY.register("blue_kyber", () -> new KyberItem());
	public static final RegistryObject<Item> CLONE_ARMOR_HELMET = REGISTRY.register("clone_armor_helmet", () -> new CloneArmorItem.Helmet());
	public static final RegistryObject<Item> CLONE_ARMOR_CHESTPLATE = REGISTRY.register("clone_armor_chestplate", () -> new CloneArmorItem.Chestplate());
	public static final RegistryObject<Item> CLONE_ARMOR_LEGGINGS = REGISTRY.register("clone_armor_leggings", () -> new CloneArmorItem.Leggings());
	public static final RegistryObject<Item> CLONE_ARMOR_BOOTS = REGISTRY.register("clone_armor_boots", () -> new CloneArmorItem.Boots());
	public static final RegistryObject<Item> RED_KYBER = REGISTRY.register("red_kyber", () -> new RedKyberItem());
	public static final RegistryObject<Item> GREEN_KYBER = REGISTRY.register("green_kyber", () -> new GreenKyberItem());
	public static final RegistryObject<Item> PURPLE_KYBER = REGISTRY.register("purple_kyber", () -> new PurpleKyberItem());
	public static final RegistryObject<Item> ORANGE_KYBER = REGISTRY.register("orange_kyber", () -> new OrangeKyberItem());
	public static final RegistryObject<Item> YELLOW_KYBER = REGISTRY.register("yellow_kyber", () -> new YellowKyberItem());
	public static final RegistryObject<Item> WHITE_KYBER = REGISTRY.register("white_kyber", () -> new WhiteKyberItem());
	public static final RegistryObject<Item> BLACK_KYBER = REGISTRY.register("black_kyber", () -> new BlackKyberItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
