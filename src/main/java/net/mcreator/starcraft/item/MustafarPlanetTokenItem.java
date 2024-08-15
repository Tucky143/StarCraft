
package net.mcreator.starcraft.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.starcraft.procedures.MustafarPlanetTokenRightclickedOnBlockProcedure;

public class MustafarPlanetTokenItem extends Item {
	public MustafarPlanetTokenItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		MustafarPlanetTokenRightclickedOnBlockProcedure.execute(context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
