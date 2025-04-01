
package net.mcreator.galaxycraft.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.galaxycraft.init.GalaxycraftModItems;
import net.mcreator.galaxycraft.init.GalaxycraftModFluids;
import net.mcreator.galaxycraft.init.GalaxycraftModFluidTypes;
import net.mcreator.galaxycraft.init.GalaxycraftModBlocks;

public abstract class LiquidMudFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> GalaxycraftModFluidTypes.LIQUID_MUD_TYPE.get(), () -> GalaxycraftModFluids.LIQUID_MUD.get(), () -> GalaxycraftModFluids.FLOWING_LIQUID_MUD.get())
			.explosionResistance(100f).tickRate(45).slopeFindDistance(3).bucket(() -> GalaxycraftModItems.LIQUID_MUD_BUCKET.get()).block(() -> (LiquidBlock) GalaxycraftModBlocks.LIQUID_MUD.get());

	private LiquidMudFluid() {
		super(PROPERTIES);
	}

	public static class Source extends LiquidMudFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends LiquidMudFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
