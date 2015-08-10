package me.furt.immersiverpg.proxy;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import me.furt.immersiverpg.block.BlockManager;
import me.furt.immersiverpg.events.CommonTestEvents;
import me.furt.immersiverpg.item.ItemManager;
import net.minecraftforge.common.MinecraftForge;

/**
 * ImmersiveRPG
 * Created by Furt on 8/8/2015.
 */
public class CommonProxy {

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        BlockManager.init();
        ItemManager.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new CommonTestEvents());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }
}
