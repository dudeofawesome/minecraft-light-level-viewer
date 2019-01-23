package io.orleans.light_level_viewer;

import java.awt.Color;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;

class LightLevelOverlay extends Gui {
  private Minecraft mc;
  private static final Logger LOGGER = LogManager.getLogger();

  LightLevelOverlay (Minecraft mc) {
    this.mc = mc;
  }

  void drawOverlay() {
    // LOGGER.info("[LLV] " + mc.mainWindow.getWidth() + "x" + mc.mainWindow.getHeight());
    // LOGGER.info("[LLV] " + mc.mainWindow.getScaledWidth() + "x" + mc.mainWindow.getScaledHeight());

    // drawRect(10, 10, 20, 20, 0xFFFF00FF);
    // drawRect(30, 30, 40, 40, Color.orange.getRGB());

    // this.drawGradientRect(
    //   50, 50,
    //   60, 60,
    //   0xFFFF00FF,
    //   0xFFFFAA00
    // );

    // this.drawCenteredString(
    //   mc.fontRenderer,
    //   "Hello, World!",
    //   mc.mainWindow.getScaledWidth() / 2, mc.mainWindow.getScaledHeight() / 2,
    //   0xFFFFAA00
    // );
    // this.drawCenteredString(
    //   mc.fontRenderer,
    //   "Hello, World 2!",
    //   mc.mainWindow.getScaledWidth() / 2, mc.mainWindow.getScaledHeight() / 2,
    //   Color.pink.getRGB()
    // );

    drawString(mc.fontRenderer, "[Light Level Here]", 3, 3, 0x88FFFFFF);
  }
}
