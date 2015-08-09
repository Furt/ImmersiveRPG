package me.furt.immersiverpg.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * ImmersiveRPG
 * Created by Furt on 8/8/2015.
 */
public final class BlockManager {
    public static final Block immersiveBlock = new ImmersiveBlock("IBlock", Material.cloth);

    public static final void init()
    {
        GameRegistry.registerBlock(immersiveBlock, "IBlock");
    }
}
