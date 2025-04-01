
package net.mcreator.galaxycraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LightsaberHiltItem extends Item {
	public LightsaberHiltItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
