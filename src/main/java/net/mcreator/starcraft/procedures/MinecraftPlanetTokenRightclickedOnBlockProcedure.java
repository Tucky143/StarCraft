package net.mcreator.starcraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.core.BlockPos;

import net.mcreator.starcraft.network.StarcraftModVariables;
import net.mcreator.starcraft.StarcraftMod;

public class MinecraftPlanetTokenRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
			ResourceKey<Level> destinationType = Level.OVERWORLD;
			if (_player.level().dimension() == destinationType)
				return;
			ServerLevel nextLevel = _player.server.getLevel(destinationType);
			if (nextLevel != null) {
				_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
				_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
				_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
				for (MobEffectInstance _effectinstance : _player.getActiveEffects())
					_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance, false));
				_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
			}
		}
		StarcraftMod.queueServerWork(5, () -> {
			{
				Entity _ent = entity;
				_ent.teleportTo(entity.getData(StarcraftModVariables.PLAYER_VARIABLES).returnX, entity.getData(StarcraftModVariables.PLAYER_VARIABLES).returnY, entity.getData(StarcraftModVariables.PLAYER_VARIABLES).returnZ);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(entity.getData(StarcraftModVariables.PLAYER_VARIABLES).returnX, entity.getData(StarcraftModVariables.PLAYER_VARIABLES).returnY, entity.getData(StarcraftModVariables.PLAYER_VARIABLES).returnZ,
							_ent.getYRot(), _ent.getXRot());
			}
		});
	}
}
