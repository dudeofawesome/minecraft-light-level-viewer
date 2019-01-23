package io.orleans.light_level_viewer;

import java.awt.Color;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.world.EnumLightType;

class LightLevelOverlay extends Gui {
  private Minecraft mc;
  private static final Logger LOGGER = LogManager.getLogger();

  LightLevelOverlay(Minecraft mc) {
    this.mc = mc;
  }

  void drawOverlay() {
    int light_level = mc.world.getLightFor(EnumLightType.BLOCK, mc.player.getPosition())
        - mc.world.getSkylightSubtracted();

    drawString(mc.fontRenderer, String.format("Light (min): %s", light_level), 3, 3, 0x88FFFFFF);
  }
}
