
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.galaxycraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.galaxycraft.entity.WampaEntity;
import net.mcreator.galaxycraft.entity.EwokEntity;
import net.mcreator.galaxycraft.entity.EwokArcherEntity;
import net.mcreator.galaxycraft.entity.BanthaEntity;
import net.mcreator.galaxycraft.GalaxycraftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class GalaxycraftModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, GalaxycraftMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<EwokEntity>> EWOK = register("ewok",
			EntityType.Builder.<EwokEntity>of(EwokEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<EwokArcherEntity>> EWOK_ARCHER = register("ewok_archer",
			EntityType.Builder.<EwokArcherEntity>of(EwokArcherEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<WampaEntity>> WAMPA = register("wampa",
			EntityType.Builder.<WampaEntity>of(WampaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(72).setUpdateInterval(3)

					.sized(1f, 2.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<BanthaEntity>> BANTHA = register("bantha",
			EntityType.Builder.<BanthaEntity>of(BanthaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		EwokEntity.init(event);
		EwokArcherEntity.init(event);
		WampaEntity.init(event);
		BanthaEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(EWOK.get(), EwokEntity.createAttributes().build());
		event.put(EWOK_ARCHER.get(), EwokArcherEntity.createAttributes().build());
		event.put(WAMPA.get(), WampaEntity.createAttributes().build());
		event.put(BANTHA.get(), BanthaEntity.createAttributes().build());
	}
}
