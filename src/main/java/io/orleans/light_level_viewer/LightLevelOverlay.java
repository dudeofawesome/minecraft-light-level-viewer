package io.orleans.light_level_viewer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumLightType;
import net.minecraft.world.World;

class LightLevelOverlay extends Gui {
  private static final Logger LOGGER = LogManager.getLogger();

  void drawOverlay(FontRenderer fontRenderer, World world, BlockPos pos) {
    drawString(fontRenderer,
        String.format("Light (min): %s", getLightLevelBlock(world, pos)), 3, 3,
        0x88FFFFFF);
  }

  int getLightLevelBlock(World world, BlockPos pos) {
    int light_level = world.getLightFor(EnumLightType.BLOCK, pos)
        - world.getSkylightSubtracted();

    return light_level;
  }
}
