package net.mcreator.starcraft.procedures;

import net.minecraftforge.eventbus.api.Event;


public class ForcePullOnKeyPressedProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
Entity entity
) {
if(
entity == null
) return ;
{
final Vec3 _center = new Vec3(x, y, z);
List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
for (Entity entityiterator : _entfound) {
if (!(entityiterator == entity)) {entityiterator.setDeltaMovement(new Vec3((entity.getLookAngle().x*(-1)), (entity.getLookAngle().y*(-1)), (entity.getLookAngle().z*(-1))));}
}
}
}
}
