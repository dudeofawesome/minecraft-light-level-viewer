package io.orleans.light_level_viewer;

import net.minecraft.client.Minecraft;
// import net.minecraft.client.entity.EntityPlayerSP;
// import net.minecraft.inventory.IInventory;
// import net.minecraft.world.IInteractionObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.dimdev.rift.listener.client.OverlayRenderer;
// import org.dimdev.rift.listener.client.GameGuiAdder;

/**
 * The example mod listener, as defined in the riftmod.json file
 *
 * @author Louis Orleans
 */
public class RiftHook implements OverlayRenderer/* , GameGuiAdder */ {
  private static final Logger LOGGER = LogManager.getLogger();
  private LightLevelOverlay light_level_overlay = new LightLevelOverlay(Minecraft.getInstance());

  RiftHook () {
    LOGGER.info("[LLV] Initializing Light Level Viewer");
  }

  @Override
  public void renderOverlay() {
//    light_level_overlay.drawString();
    light_level_overlay.drawOverlay();
  }

  // @Override
  // public void displayGui(EntityPlayerSP playerSP, String something, IInteractionObject interactionObject) {

  // }

  // @Override
  // public void displayContainerGui(EntityPlayerSP playerSP, String something, IInventory inventory) {

  // }
}
