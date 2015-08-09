package me.furt.immersiverpg.block;

import me.furt.immersiverpg.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

/**
 * ImmersiveRPG
 * Created by Furt on 8/7/2015.
 */
public class ImmersiveBlock extends Block {

    public IIcon[] icons = new IIcon[6];

    protected ImmersiveBlock(String unlocalizedName, Material material)
    {
        super(material);
        setBlockName(unlocalizedName);
        setBlockTextureName(Reference.MOD_ID + ":" + unlocalizedName);
        setCreativeTab(CreativeTabs.tabBlock);
        setHardness(1.0F);
        setResistance(6.0F);
        setStepSound(soundTypeGravel);
    }

    @Override
    public void registerBlockIcons(IIconRegister reg) {
        for (int i = 0; i < 6; i ++) {
            if (i < 2)
                icons[i] = reg.registerIcon(this.textureName + "_1");

            if(i > 1)
                icons[i] = reg.registerIcon(this.textureName + "_0");
        }
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        return this.icons[side];
    }
}
