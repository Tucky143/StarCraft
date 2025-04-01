// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelwampa<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "wampa"), "main");
	private final ModelPart Head;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart bb_main;

	public Modelwampa(ModelPart root) {
		this.Head = root.getChild("Head");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-6.0F, -9.2F, -2.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(-4, -5)
						.addBox(6.0F, -0.2F, -3.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(-1, 1)
						.addBox(2.0F, -0.2F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(-1, 1)
						.addBox(-6.0F, -0.2F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(-4, -5)
						.addBox(-7.0F, -0.2F, -3.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -6.8F, -2.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 49)
				.addBox(-2.5F, -5.5F, -3.0F, 5.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.5F, 18.5F, 2.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(48, 0)
				.addBox(-2.5F, -5.5F, -3.0F, 5.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.5F, 18.5F, 2.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(45, 24)
				.addBox(-2.5F, -9.0F, -3.0F, 5.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-10.0F, 5.0F, 2.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(45, 45)
				.addBox(-2.5F, -9.0F, -3.0F, 5.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(10.0F, 5.0F, 2.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 24)
				.addBox(-7.5F, -28.0F, -2.0F, 15.0F, 17.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}