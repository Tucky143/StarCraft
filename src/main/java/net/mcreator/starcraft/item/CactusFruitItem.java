

package net.mcreator.starcraft.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class CactusFruitItem extends Item {
public CactusFruitItem() {
super(new Item.Properties()
.stacksTo(64)
.rarity(Rarity.COMMON)
.food((new FoodProperties.Builder())
.nutrition(7)
.saturationMod(1f)
.build())
);
}
}