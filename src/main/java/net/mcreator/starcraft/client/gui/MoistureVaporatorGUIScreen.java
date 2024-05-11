package net.mcreator.starcraft.client.gui;

public class MoistureVaporatorGUIScreen extends AbstractContainerScreen<MoistureVaporatorGUIMenu> {

	private final static HashMap<String, Object> guistate = MoistureVaporatorGUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;


		Checkbox WaterGeneration;



	public MoistureVaporatorGUIScreen(MoistureVaporatorGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}


		private static final ResourceLocation texture = new ResourceLocation("starcraft:textures/screens/moisture_vaporator_gui.png" );

	@Override public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);

		super.render(guiGraphics, mouseX, mouseY, partialTicks);



		this.renderTooltip(guiGraphics, mouseX, mouseY);

	}

	@Override protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

			guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);


		RenderSystem.disableBlend();
	}

	@Override public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}


		return super.keyPressed(key, b, c);
	}

	@Override public void containerTick() {
		super.containerTick();
	}

	@Override protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
			guiGraphics.drawString(this.font,
				Component.translatable("gui.starcraft.moisture_vaporator_gui.label_moisture_vaporator"),
				43, 11, -12829636, false);
	}

	@Override public void init() {
		super.init();





			WaterGeneration = new Checkbox(this.leftPos + 7, this.topPos + 56,
					20, 20, Component.translatable("gui.starcraft.moisture_vaporator_gui.WaterGeneration"), false);

			guistate.put("checkbox:WaterGeneration", WaterGeneration);
			this.addRenderableWidget(WaterGeneration);
	}

}

