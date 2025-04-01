
package net.mcreator.galaxycraft.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.galaxycraft.procedures.MustafarPlanetTokenRightclickedOnBlockProcedure;

public class MustafarPlanetTokenItem extends Item {
	public MustafarPlanetTokenItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		MustafarPlanetTokenRightclickedOnBlockProcedure.execute(context.getLevel(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
