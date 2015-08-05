package me.furt.immersiverpg.util;

import cpw.mods.fml.common.FMLLog;
import me.furt.immersiverpg.Reference;

import java.util.logging.Level;

/**
 * ImmersiveRPG
 * Created by Furt on 8/5/2015.
 */
public class LogHelper {
    private static String format = "blah";

    public static void log(Level logLevel, Object data)
    {
        //FMLLog.log(Reference.MOD_NAME, logLevel, String.valueOf(data));
    }

    public static void all(Object object)
    {
        log(Level.ALL, object);
    }

    public static void severe(Object object)
    {
        log(Level.SEVERE, object);
    }

    public static void info(Object object)
    {
        log(Level.INFO, object);
    }

    public static void off(Object object)
    {
        log(Level.OFF, object);
    }

    public static void warn(Object object)
    {
        log(Level.WARNING, object);
    }
}
