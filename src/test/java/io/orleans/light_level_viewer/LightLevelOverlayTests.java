package io.orleans.light_level_viewer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import io.orleans.light_level_viewer.LightLevelOverlay;
import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.crafting.RecipeManager;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.tags.NetworkTagManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.EnumLightType;
import net.minecraft.world.ITickList;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.IChunkGenerator;

class LightLevelOverlayTests {
  LightLevelOverlay llo = new LightLevelOverlay();

  @Test
  void getLightLevelBlockTest() {
    World world = new WorldMock();

    assertEquals(llo.getLightLevelBlock(world, new BlockPos(0, 0, 0)), 0);
  }
}


class WorldMock extends World {
  WorldMock() {
    // super();
    // World(ISaveHandler p_i49813_1_, @Nullable WorldSavedDataStorage
    // p_i49813_2_, WorldInfo p_i49813_3_, Dimension p_i49813_4_, Profiler
    // p_i49813_5_, boolean p_i49813_6_)
    super(null, null, null, new Dimension() {

      @Override
      public boolean isSurfaceWorld() {
        return false;
      }

      @Override
      protected void init() {

      }

      @Override
      public DimensionType getType() {
        return null;
      }

      @Override
      public Vec3d getFogColor(float p_76562_1_, float p_76562_2_) {
        return null;
      }

      @Override
      public BlockPos findSpawn(int p_206921_1_, int p_206921_2_,
          boolean checkValid) {
        return null;
      }

      @Override
      public BlockPos findSpawn(ChunkPos p_206920_1_, boolean checkValid) {
        return null;
      }

      @Override
      public boolean doesXZShowFog(int x, int z) {
        return false;
      }

      @Override
      public IChunkGenerator<?> createChunkGenerator() {
        return null;
      }

      @Override
      public boolean canRespawnHere() {
        return false;
      }

      @Override
      public float calculateCelestialAngle(long worldTime, float partialTicks) {
        return 0;
      }
    }, null, false);
  }

  @Override
  public int getLightFor(EnumLightType type, BlockPos pos) {
    return type.defaultLightValue;
  }

  @Override
  public RecipeManager getRecipeManager() {
    return null;
  }

  @Override
  public NetworkTagManager getTags() {
    return null;
  }

  @Override
  public IChunkProvider createChunkProvider() {
    return null;
  }

  @Override
  public boolean isChunkLoaded(int x, int z, boolean allowEmpty) {
    return true;
  }

  @Override
  public ITickList<Block> getPendingBlockTicks() {
    return null;
  }

  @Override
  public ITickList<Fluid> getPendingFluidTicks() {
    return null;
  }

  @Override
  public Scoreboard getScoreboard() {
    return null;
  }
}
