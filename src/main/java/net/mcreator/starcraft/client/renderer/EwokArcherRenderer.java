
package net.mcreator.starcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.starcraft.entity.EwokArcherEntity;
import net.mcreator.starcraft.client.model.ModelEwok;

public class EwokArcherRenderer extends MobRenderer<EwokArcherEntity, ModelEwok<EwokArcherEntity>> {
	public EwokArcherRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEwok(context.bakeLayer(ModelEwok.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(EwokArcherEntity entity) {
		return new ResourceLocation("starcraft:textures/entities/ewok.png");
	}
}
