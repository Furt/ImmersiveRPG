package me.furt.immersiverpg.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import me.furt.immersiverpg.block.BlockManager;
import me.furt.immersiverpg.item.ItemManager;

/**
 * ImmersiveRPG
 * Created by Furt on 8/8/2015.
 */
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event)
    {
        BlockManager.init();
        ItemManager.init();
    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
