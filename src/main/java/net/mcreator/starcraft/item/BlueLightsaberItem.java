
package net.mcreator.starcraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.starcraft.procedures.BlueLightsaberLivingEntityIsHitWithToolProcedure;
import net.mcreator.starcraft.procedures.BlueLightsaberEntitySwingsItemProcedure;
import net.mcreator.starcraft.init.StarcraftModItems;

public class BlueLightsaberItem extends SwordItem {
	public BlueLightsaberItem() {
		super(new Tier() {
			public int getUses() {
				return 6032;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 8.5f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(StarcraftModItems.BLUE_KYBER.get()));
			}
		}, 3, -3f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		BlueLightsaberLivingEntityIsHitWithToolProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
		return retval;
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		BlueLightsaberEntitySwingsItemProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
		return retval;
	}
}
