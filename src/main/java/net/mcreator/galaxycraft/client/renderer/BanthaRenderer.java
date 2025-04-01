
package net.mcreator.galaxycraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.galaxycraft.entity.BanthaEntity;
import net.mcreator.galaxycraft.client.model.ModelBantha;

public class BanthaRenderer extends MobRenderer<BanthaEntity, ModelBantha<BanthaEntity>> {
	public BanthaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBantha<BanthaEntity>(context.bakeLayer(ModelBantha.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(BanthaEntity entity) {
		return ResourceLocation.parse("galaxycraft:textures/entities/bantha.png");
	}
}
