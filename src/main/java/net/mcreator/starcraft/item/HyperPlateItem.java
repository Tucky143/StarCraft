

package net.mcreator.starcraft.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class HyperPlateItem extends Item {
public HyperPlateItem() {
super(new Item.Properties()
.stacksTo(64)
.rarity(Rarity.RARE)
);
}
@Override @OnlyIn(Dist.CLIENT) public boolean isFoil(ItemStack itemstack) {
return true;
}
}