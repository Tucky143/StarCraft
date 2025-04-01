
package net.mcreator.galaxycraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.galaxycraft.entity.WampaEntity;
import net.mcreator.galaxycraft.client.model.Modelwampa;

public class WampaRenderer extends MobRenderer<WampaEntity, Modelwampa<WampaEntity>> {
	public WampaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwampa<WampaEntity>(context.bakeLayer(Modelwampa.LAYER_LOCATION)), 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(WampaEntity entity) {
		return ResourceLocation.parse("galaxycraft:textures/entities/wampa.png");
	}
}
