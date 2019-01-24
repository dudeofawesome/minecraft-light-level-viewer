package io.orleans.light_level_viewer;

import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dimdev.rift.listener.client.OverlayRenderer;

/**
 * Listeners for Rift mod loader
 *
 * @author Louis Orleans
 */
public class RiftHook implements OverlayRenderer {
  private static final Logger LOGGER = LogManager.getLogger();
  private Minecraft mc = Minecraft.getInstance();
  private LightLevelOverlay light_level_overlay;

  public RiftHook() {
    LOGGER.info("[LLV] Initializing Light Level Viewer");

    light_level_overlay = new LightLevelOverlay();
  }

  @Override
  public void renderOverlay() {
    light_level_overlay.drawOverlay(mc.fontRenderer, mc.world,
        mc.player.getPosition());
  }
}
