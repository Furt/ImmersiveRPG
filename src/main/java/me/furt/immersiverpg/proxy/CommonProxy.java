package me.furt.immersiverpg.proxy;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import me.furt.immersiverpg.block.BlockManager;
import me.furt.immersiverpg.events.ServerTestEvents;
import me.furt.immersiverpg.item.ItemManager;

/**
 * ImmersiveRPG
 * Created by Furt on 8/8/2015.
 */
public class CommonProxy {

    @SubscribeEvent
    public void preInit(FMLPreInitializationEvent event)
    {
        BlockManager.init();
        ItemManager.init();
    }

    @SubscribeEvent
    public void init(FMLInitializationEvent event)
    {
        FMLCommonHandler.instance().bus().register(new ServerTestEvents());
    }

    @SubscribeEvent
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
