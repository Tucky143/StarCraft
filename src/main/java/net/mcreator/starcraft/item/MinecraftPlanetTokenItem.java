
package net.mcreator.starcraft.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;

import net.mcreator.starcraft.procedures.MinecraftPlanetTokenRightclickedOnBlockProcedure;

import java.util.List;

public class MinecraftPlanetTokenItem extends Item {
	public MinecraftPlanetTokenItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		MinecraftPlanetTokenRightclickedOnBlockProcedure.execute(context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
