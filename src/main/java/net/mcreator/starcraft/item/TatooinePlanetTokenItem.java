

package net.mcreator.starcraft.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class TatooinePlanetTokenItem extends Item {
public TatooinePlanetTokenItem() {
super(new Item.Properties()
.stacksTo(64)
.rarity(Rarity.RARE)
);
}
@Override public InteractionResult useOn(UseOnContext context) {
super.useOn(context);
TatooinePlanetTokenRightclickedOnBlockProcedure.execute(context.getPlayer());
return InteractionResult.SUCCESS;
}
}