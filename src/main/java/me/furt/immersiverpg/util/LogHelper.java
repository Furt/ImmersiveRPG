package me.furt.immersiverpg.util;

import java.util.logging.Level;

/**
 * ImmersiveRPG
 * Created by Furt on 8/5/2015.
 */
public class LogHelper {
    private static String format = "";

    public static void log(Level logLevel, Object data)
    {
        //FMLLog.log(Reference.MOD_NAME, logLevel, String.valueOf(data));
        //FMLLog.log(Reference.MOD_NAME, logLevel, format, data);
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
