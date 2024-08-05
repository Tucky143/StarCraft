
package net.mcreator.starcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class HyperTokenItem extends Item {
	public HyperTokenItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
