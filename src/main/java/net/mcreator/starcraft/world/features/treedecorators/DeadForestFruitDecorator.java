

package net.mcreator.starcraft.world.features.treedecorators;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD) public class DeadForestFruitDecorator extends CocoaDecorator {

    public static Codec<DeadForestFruitDecorator> CODEC = Codec.unit(DeadForestFruitDecorator::new);

    public static TreeDecoratorType<?> DECORATOR_TYPE = new TreeDecoratorType<>(CODEC);

    @SubscribeEvent public static void registerTreeDecorator(RegisterEvent event) {
        event.register(ForgeRegistries.Keys.TREE_DECORATOR_TYPES, registerHelper -> registerHelper.register("dead_forest_tree_fruit_decorator", DECORATOR_TYPE));
    }

    public DeadForestFruitDecorator() {
        super(0.2f);
    }

    @Override protected TreeDecoratorType<?> type() {
        return DECORATOR_TYPE;
    }

    @Override public void place(TreeDecorator.Context context){
  RandomSource randomsource=context.random();
  if (!(randomsource.nextFloat() >= 0.2F)) {
    List<BlockPos> list=context.logs();
    int i=list.get(0).getY();
    list.stream().filter((p_69980_) -> {
      return p_69980_.getY() - i <= 2;
    }
).forEach((p_226026_) -> {
      for (      Direction direction : Direction.Plane.HORIZONTAL) {
        if (randomsource.nextFloat() <= 0.25F) {
          Direction direction1=direction.getOpposite();
          BlockPos blockpos=p_226026_.offset(direction1.getStepX(),0,direction1.getStepZ());
          if (context.isAir(blockpos)) {
            context.setBlock(blockpos,oriented(Blocks.AIR.defaultBlockState(), direction1));
          }
        }
      }
    }
);
  }
}


    private static BlockState oriented(BlockState blockstate, Direction direction) {
        return switch (direction) {
            case SOUTH -> blockstate.getBlock().rotate(blockstate, Rotation.CLOCKWISE_180);
            case EAST -> blockstate.getBlock().rotate(blockstate, Rotation.CLOCKWISE_90);
            case WEST -> blockstate.getBlock().rotate(blockstate, Rotation.COUNTERCLOCKWISE_90);
            default -> blockstate;
        };
    }

}
