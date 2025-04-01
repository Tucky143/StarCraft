
package net.mcreator.galaxycraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.galaxycraft.entity.EwokArcherEntity;
import net.mcreator.galaxycraft.client.model.ModelEwokArcher;

import com.mojang.blaze3d.vertex.PoseStack;

public class EwokArcherRenderer extends MobRenderer<EwokArcherEntity, ModelEwokArcher<EwokArcherEntity>> {
	public EwokArcherRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEwokArcher<EwokArcherEntity>(context.bakeLayer(ModelEwokArcher.LAYER_LOCATION)), 0.4f);
	}

	@Override
	protected void scale(EwokArcherEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.65f, 0.65f, 0.65f);
	}

	@Override
	public ResourceLocation getTextureLocation(EwokArcherEntity entity) {
		return ResourceLocation.parse("galaxycraft:textures/entities/ewokarcher.png");
	}
}
