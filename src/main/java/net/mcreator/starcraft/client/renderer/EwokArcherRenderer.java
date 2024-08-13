
package net.mcreator.starcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.starcraft.entity.EwokArcherEntity;
import net.mcreator.starcraft.client.model.ModelEwokArcher;

import com.mojang.blaze3d.vertex.PoseStack;

public class EwokArcherRenderer extends MobRenderer<EwokArcherEntity, ModelEwokArcher<EwokArcherEntity>> {
	public EwokArcherRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEwokArcher(context.bakeLayer(ModelEwokArcher.LAYER_LOCATION)), 0.4f);
	}

	@Override
	protected void scale(EwokArcherEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.65f, 0.65f, 0.65f);
	}

	@Override
	public ResourceLocation getTextureLocation(EwokArcherEntity entity) {
		return new ResourceLocation("starcraft:textures/entities/ewokarcher.png");
	}
}
