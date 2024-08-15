
package net.mcreator.starcraft.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.starcraft.procedures.AhchToPlanetTokenRightclickedOnBlockProcedure;

public class AhchToPlanetTokenItem extends Item {
	public AhchToPlanetTokenItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		AhchToPlanetTokenRightclickedOnBlockProcedure.execute(context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
