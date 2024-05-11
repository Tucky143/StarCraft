

package net.mcreator.starcraft.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class DagobahPlanetTokenItem extends Item {
public DagobahPlanetTokenItem() {
super(new Item.Properties()
.stacksTo(64)
.rarity(Rarity.RARE)
);
}
@Override public InteractionResult useOn(UseOnContext context) {
super.useOn(context);
DagobahPlanetTokenRightclickedOnBlockProcedure.execute(context.getPlayer());
return InteractionResult.SUCCESS;
}
}