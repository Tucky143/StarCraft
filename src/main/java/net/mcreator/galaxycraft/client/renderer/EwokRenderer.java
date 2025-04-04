
package net.mcreator.galaxycraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.galaxycraft.entity.EwokEntity;
import net.mcreator.galaxycraft.client.model.ModelEwok;

import com.mojang.blaze3d.vertex.PoseStack;

public class EwokRenderer extends MobRenderer<EwokEntity, ModelEwok<EwokEntity>> {
	public EwokRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEwok<EwokEntity>(context.bakeLayer(ModelEwok.LAYER_LOCATION)), 0.4f);
	}

	@Override
	protected void scale(EwokEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.65f, 0.65f, 0.65f);
	}

	@Override
	public ResourceLocation getTextureLocation(EwokEntity entity) {
		return ResourceLocation.parse("galaxycraft:textures/entities/ewok.png");
	}
}
