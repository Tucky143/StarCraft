package net.mcreator.galaxycraft.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.galaxycraft.network.GalaxycraftModVariables;
import net.mcreator.galaxycraft.GalaxycraftMod;

public class HothPlanetTokenRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.level().dimension()) == Level.OVERWORLD) {
			{
				GalaxycraftModVariables.PlayerVariables _vars = entity.getData(GalaxycraftModVariables.PLAYER_VARIABLES);
				_vars.returnX = entity.getX();
				_vars.syncPlayerVariables(entity);
			}
			{
				GalaxycraftModVariables.PlayerVariables _vars = entity.getData(GalaxycraftModVariables.PLAYER_VARIABLES);
				_vars.returnY = entity.getY();
				_vars.syncPlayerVariables(entity);
			}
			{
				GalaxycraftModVariables.PlayerVariables _vars = entity.getData(GalaxycraftModVariables.PLAYER_VARIABLES);
				_vars.returnZ = entity.getZ();
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
			ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("galaxycraft:hoth"));
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
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 5, false, false));
		GalaxycraftMod.queueServerWork(60, () -> {
			if (world.getBlockState(BlockPos.containing(x, y, z)).canOcclude() || world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
			}
		});
	}
}
