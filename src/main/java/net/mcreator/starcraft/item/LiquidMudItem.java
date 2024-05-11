

package net.mcreator.starcraft.item;

import net.minecraft.network.chat.Component;

public class LiquidMudItem extends BucketItem {

	public LiquidMudItem() {
		super(StarcraftModFluids.LIQUID_MUD,
			new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON));
	}

}
