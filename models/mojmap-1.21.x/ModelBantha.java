// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelBantha<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "bantha"), "main");
	private final ModelPart head;
	private final ModelPart horns;
	private final ModelPart left_horn;
	private final ModelPart horns2;
	private final ModelPart left_horn2;
	private final ModelPart body;
	private final ModelPart rotation;
	private final ModelPart leg1;
	private final ModelPart leg2;
	private final ModelPart leg3;
	private final ModelPart leg4;

	public ModelBantha(ModelPart root) {
		this.head = root.getChild("head");
		this.horns = this.head.getChild("horns");
		this.left_horn = this.horns.getChild("left_horn");
		this.horns2 = this.horns.getChild("horns2");
		this.left_horn2 = this.horns2.getChild("left_horn2");
		this.body = root.getChild("body");
		this.rotation = this.body.getChild("rotation");
		this.leg1 = root.getChild("leg1");
		this.leg2 = root.getChild("leg2");
		this.leg3 = root.getChild("leg3");
		this.leg4 = root.getChild("leg4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 53)
				.addBox(-10.0833F, -12.0833F, -14.3333F, 20.0F, 20.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0833F, 2.0833F, -9.6667F));

		PartDefinition rotation_r1 = head.addOrReplaceChild("rotation_r1",
				CubeListBuilder.create().texOffs(32, 89).addBox(-5.0F, -6.5F, -6.5F, 8.0F, 13.0F, 8.0F,
						new CubeDeformation(-2.0F)),
				PartPose.offsetAndRotation(0.0417F, 11.5417F, -2.8333F, 0.0F, 1.5708F, -1.5708F));

		PartDefinition rotation_r2 = head.addOrReplaceChild("rotation_r2",
				CubeListBuilder.create().texOffs(0, 89).addBox(-3.0F, -6.5F, -1.5F, 8.0F, 13.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0417F, 11.5417F, -2.8333F, 0.0F, 1.5708F, -1.5708F));

		PartDefinition horns = head.addOrReplaceChild("horns",
				CubeListBuilder.create().texOffs(120, 66).addBox(-3.0F, -7.0F, -2.0F, 2.0F, 14.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0833F, -13.0884F, -10.0668F, -1.3526F, 0.0F, 0.0F));

		PartDefinition horns_r1 = horns.addOrReplaceChild("horns_r1",
				CubeListBuilder.create().texOffs(120, 66)
						.addBox(-1.0F, -3.0F, -2.0F, 2.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(120, 66)
						.addBox(-23.0F, -3.0F, -2.0F, 2.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.0F, 6.0F, 3.0F, 2.1817F, 0.0F, 0.0F));

		PartDefinition left_horn = horns.addOrReplaceChild("left_horn", CubeListBuilder.create().texOffs(56, 124)
				.addBox(10.0F, -41.0F, -20.0F, 2.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(9.0F, 34.0F, 18.0F));

		PartDefinition horns2 = horns.addOrReplaceChild("horns2",
				CubeListBuilder.create().texOffs(118, 119).addBox(-6.0F, -14.0F, -1.0F, 2.0F, 14.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -7.0F, -1.0F, -1.6581F, 0.0F, 0.0F));

		PartDefinition left_horn2 = horns2.addOrReplaceChild("left_horn2", CubeListBuilder.create().texOffs(120, 48)
				.addBox(9.0F, -41.0F, -20.0F, 2.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 27.0F, 19.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition rotation = body.addOrReplaceChild("rotation",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-12.0F, -17.0F, -9.5F, 24.0F, 34.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(121, 3)
						.addBox(-12.0F, 8.5F, -15.5F, 0.0F, 8.5F, 6.0F, new CubeDeformation(0.0F)).texOffs(67, 108)
						.addBox(12.0F, -17.0F, -16.5F, 0.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(107, 79)
						.addBox(12.0F, -8.0F, -14.5F, 0.0F, 16.5F, 5.0F, new CubeDeformation(0.0F)).texOffs(121, 20)
						.addBox(12.0F, 8.5F, -15.5F, 0.0F, 8.5F, 6.0F, new CubeDeformation(0.0F)).texOffs(107, 55)
						.addBox(-12.0F, -8.0F, -14.5F, 0.0F, 16.5F, 5.0F, new CubeDeformation(0.0F)).texOffs(107, 103)
						.addBox(-12.0F, -17.0F, -16.5F, 0.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -25.5F, 7.5F, 1.5708F, 0.0F, 0.0F));

		PartDefinition rotation_r3 = rotation.addOrReplaceChild("rotation_r3",
				CubeListBuilder.create().texOffs(19, 113).addBox(1.0F, -14.125F, -5.5F, 0.0F, 6.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.25F, 17.875F, -11.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition rotation_r4 = rotation.addOrReplaceChild("rotation_r4",
				CubeListBuilder.create().texOffs(87, 108).addBox(1.0F, -4.625F, -3.5F, 0.0F, 13.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.25F, 17.875F, -11.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition rotation_r5 = rotation.addOrReplaceChild("rotation_r5",
				CubeListBuilder.create().texOffs(103, 122).addBox(1.0F, 11.875F, -4.5F, 0.0F, 5.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.75F, -15.875F, -11.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition rotation_r6 = rotation.addOrReplaceChild("rotation_r6",
				CubeListBuilder.create().texOffs(3, 113).addBox(1.0F, -4.625F, -3.5F, 0.0F, 13.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.25F, -15.875F, -11.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition rotation_r7 = rotation.addOrReplaceChild("rotation_r7",
				CubeListBuilder.create().texOffs(39, 113).addBox(1.0F, -14.125F, -5.5F, 0.0F, 6.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.25F, -15.875F, -11.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition rotation_r8 = rotation.addOrReplaceChild("rotation_r8",
				CubeListBuilder.create().texOffs(121, 37).addBox(1.0F, 11.875F, -4.5F, 0.0F, 5.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.75F, 17.875F, -11.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(72, 53)
				.addBox(-4.0F, -1.0F, -4.0F, 8.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.75F, 7.0F, 20.0F));

		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(72, 79)
				.addBox(-4.0F, -1.0F, -4.0F, 8.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(7.75F, 7.0F, 20.0F));

		PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(86, 0)
				.addBox(-4.0F, -1.0F, -4.0F, 8.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.75F, 7.0F, -3.5F));

		PartDefinition leg4 = partdefinition.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(86, 26)
				.addBox(-4.0F, -1.0F, -4.0F, 8.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(7.75F, 7.0F, -3.5F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.leg1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg4.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg3.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}