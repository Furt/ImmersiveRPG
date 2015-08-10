package me.furt.immersiverpg.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import me.furt.immersiverpg.item.ItemManager;
import net.minecraft.block.material.Material;
import net.minecraftforge.event.world.BlockEvent;

/**
 * ImmersiveRPG
 * Created by Furt on 8/5/2015.
 */
public class ServerTestEvents
{
    @SubscribeEvent
    public void loginMessage(PlayerEvent.PlayerLoggedInEvent event)
    {
        //event.player
        //event.player.addChatComponentMessage(new ChatComponentText("Hello " + event.player.getDisplayName() + ", have a nice day!"));
        //System.out.println("Player has logged in.");
    }

    @SubscribeEvent
    public void onBlockPlace(BlockEvent.BreakEvent event)
    {
        System.out.println("Blocks break event triggered");
        if(event.block.equals())
        {
            event.getPlayer().dropItem(ItemManager.immersiveItem, 1);
            System.out.println("You broke grass!");
        }
    }
}
