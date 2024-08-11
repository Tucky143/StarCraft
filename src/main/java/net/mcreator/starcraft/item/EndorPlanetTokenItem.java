
package net.mcreator.starcraft.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.starcraft.procedures.EndorPlanetTokenRightClickedOnBlockProcedure;

public class EndorPlanetTokenItem extends Item {
	public EndorPlanetTokenItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		EndorPlanetTokenRightClickedOnBlockProcedure.execute(context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
