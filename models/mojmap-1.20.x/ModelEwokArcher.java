// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelEwokArcher<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "ewokarcher"), "main");
	private final ModelPart LeftArm;
	private final ModelPart Bow;
	private final ModelPart RightArm;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;
	private final ModelPart Head;
	private final ModelPart Body;

	public ModelEwokArcher(ModelPart root) {
		this.LeftArm = root.getChild("LeftArm");
		this.Bow = root.getChild("Bow");
		this.RightArm = root.getChild("RightArm");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = LeftArm.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(40, 16).addBox(-2.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 14.0F, 1.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Bow = partdefinition.addOrReplaceChild("Bow",
				CubeListBuilder.create().texOffs(1, 0)
						.addBox(-2.0F, -7.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(1, 0)
						.addBox(-1.0F, -4.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(1, 0)
						.addBox(-1.0F, -9.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(1, 0)
						.addBox(0.0F, -10.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(1, 0)
						.addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.0F, 16.0F, -1.0F, 0.0F, -1.5708F, 0.1309F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-2.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = RightArm.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(32, 48).mirror()
						.addBox(-2.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.0F, 14.0F, 1.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(16, 48)
				.addBox(-3.0F, -1.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 13.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-3.0F, -1.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 13.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-5.0F, -13.0F, -3.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(16, 16)
				.addBox(-9.0F, -11.0F, 1.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 12.0F, -2.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Bow.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}