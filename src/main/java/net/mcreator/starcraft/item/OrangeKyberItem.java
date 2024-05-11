

package net.mcreator.starcraft.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class OrangeKyberItem extends Item {
public OrangeKyberItem() {
super(new Item.Properties()
.stacksTo(64)
.rarity(Rarity.RARE)
);
}
@Override @OnlyIn(Dist.CLIENT) public boolean isFoil(ItemStack itemstack) {
return true;
}
}