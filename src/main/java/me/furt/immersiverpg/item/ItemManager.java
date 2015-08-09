package me.furt.immersiverpg.item;

import cpw.mods.fml.common.registry.GameRegistry;
import me.furt.immersiverpg.ImmersiveRPG;
import me.furt.immersiverpg.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * ImmersiveRPG
 * Created by Furt on 8/8/2015.
 */
public class ItemManager {

    public static Item immersiveItem = new Item().setUnlocalizedName("IItem").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Reference.MOD_ID + ":IItem");

    public static final void init()
    {
        GameRegistry.registerItem(immersiveItem, "IItem");
    }
}
