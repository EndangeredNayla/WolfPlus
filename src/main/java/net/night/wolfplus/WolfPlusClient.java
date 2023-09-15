package net.night.wolfplus;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.night.wolfplus.wolfs.EntityWolf00;
import net.night.wolfplus.model.ModelWolf;
import net.night.wolfplus.renderer.RenderWolf10;

public class WolfPlusClient extends WolfPlusProxy {
   @SideOnly(Side.CLIENT)
   public void registerRenderInformation() {
      RenderingRegistry.instance();
      RenderingRegistry.registerEntityRenderingHandler(EntityWolf00.class, new RenderWolf(new ModelWolf(), new ModelWolf(), 0.5F));
   }
}
