package me.furt.immersiverpg;

import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import me.furt.immersiverpg.events.TestEvents;
import net.minecraftforge.common.MinecraftForge;

/**
 * ImmersiveRPG
 * Created by Furt on 8/4/2015.
 */
@Mod(modid = ImmersiveRPG.MODID, version = ImmersiveRPG.VERSION)
public class ImmersiveRPG
{
    public static final String MODID = "ImmersiveRPG";
    public static final String VERSION = "1.7.10-0.0.1";

    @Instance("ImmersiveRPG")
    public static ImmersiveRPG instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //nethandling, config, blocks, items, etc
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// gui, tileentity, recipes, etc
        MinecraftForge.EVENT_BUS.register(new TestEvents());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        // final steps
    }
}
