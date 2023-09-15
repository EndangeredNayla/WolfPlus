package net.night.wolfplus;

import net.minecraft.block.Block;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = WolfPlus.MODID, version = WolfPlus.VERSION)
public class WolfPlus
{
    public static final String MODID = "WolfPlus";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
	    EntityRegistry.registerGlobalEntityID(EntityWolf00.class, "Wolf00", EntityRegistry.findGlobalUniqueEntityId(), 14144467, 3858176);
    }
}
