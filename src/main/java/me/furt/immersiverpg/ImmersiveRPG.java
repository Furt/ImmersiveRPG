package me.furt.immersiverpg;

import cpw.mods.fml.common.event.FMLFingerprintViolationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import me.furt.immersiverpg.events.TestEvents;
import me.furt.immersiverpg.util.LogHelper;
import net.minecraftforge.common.MinecraftForge;

import java.sql.Ref;

/**
 * ImmersiveRPG
 * Created by Furt on 8/4/2015.
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, certificateFingerprint = Reference.FINGERPRINT, version = Reference.MOD_VERSION, dependencies = Reference.DEPENDENCIES)
public class ImmersiveRPG
{
    @Instance(Reference.MOD_ID)
    public static ImmersiveRPG instance;

    @EventHandler
    public void invalidFingerprint(FMLFingerprintViolationEvent event)
    {
        if (Reference.FINGERPRINT.equals("@FINGERPRINT@"))
        {
            LogHelper.info("");
        }
        else
        {
            LogHelper.warn("");
        }
    }

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
