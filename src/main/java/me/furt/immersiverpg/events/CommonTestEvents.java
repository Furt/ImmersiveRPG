package me.furt.immersiverpg.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import me.furt.immersiverpg.ImmersiveRPG;
import me.furt.immersiverpg.block.BlockManager;
import me.furt.immersiverpg.item.ItemManager;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;

/**
 * ImmersiveRPG
 * Created by Furt on 8/5/2015.
 */
public class CommonTestEvents
{
    @SubscribeEvent
    public void loginMessage(PlayerLoggedInEvent event)
    {
        //event.player
        //event.player.addChatComponentMessage(new ChatComponentText("Hello " + event.player.getDisplayName() + ", have a nice day!"));
        //System.out.println("Player has logged in.");
    }

    @SubscribeEvent
    public void onBlockPlace(BreakEvent event)
    {
        ImmersiveRPG.logger.info(event.getPlayer().getDisplayName() + " has broke a block.");
        /**
         * Example use of how to make a player drop something
         * even if they dont have it in inventory
        EntityPlayer player = event.getPlayer();
        Block block = event.block;
        if(block.equals(BlockManager.immersiveBlock))
        {
            player.dropItem(ItemManager.immersiveItem, 2);
        }
        */
    }
}
