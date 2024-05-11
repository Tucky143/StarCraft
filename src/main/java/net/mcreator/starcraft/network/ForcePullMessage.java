
package net.mcreator.starcraft.network;

import net.mcreator.starcraft.StarcraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD) public class ForcePullMessage {

	int type, pressedms;

	public ForcePullMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public ForcePullMessage(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(ForcePullMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(ForcePullMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
				pressAction(context.getSender(), message.type, message.pressedms);
		});
		context.setPacketHandled(true);
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;

		if(type == 0) {
    

    ForcePullOnKeyPressedProcedure.execute(world,x,y,z,entity)
;
		}

	}

	@SubscribeEvent public static void registerMessage(FMLCommonSetupEvent event) {
		StarcraftMod.addNetworkMessage(ForcePullMessage.class, ForcePullMessage::buffer, ForcePullMessage::new, ForcePullMessage::handler);
	}

}
