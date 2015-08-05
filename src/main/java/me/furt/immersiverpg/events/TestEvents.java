package me.furt.immersiverpg.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraft.util.ChatComponentText;

/**
 * ImmersiveRPG
 * Created by Furt on 8/5/2015.
 */
public class TestEvents
{
    @SubscribeEvent
    public void loginMessage(PlayerLoggedInEvent event)
    {
        //event.player
        // ObjWorld.isRemote
        //if(!event.player.getEntityWorld().isRemote)
        event.player.addChatComponentMessage(new ChatComponentText("Hello " + event.player.getDisplayName() + ", have a nice day!"));
    }
}
