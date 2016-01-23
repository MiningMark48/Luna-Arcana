package com.miningmark48.lunaarcana.block;

import com.miningmark48.lunaarcana.reference.Reference;
import com.miningmark48.lunaarcana.tileentity.TileEntitySpellFactoryTier3;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockSpellFactoryTier3 extends BlockContainer{

    public BlockSpellFactoryTier3(Material material){
        super(material);
    }

    public int getRenderType(){
        return -1;
    }

    public boolean isOpaqueCube(){
        return false;
    }

    public boolean renderAsNormalBlock(){
        return false;
    }

    public TileEntity createNewTileEntity(World par1, int par2) {
        return new TileEntitySpellFactoryTier3();
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        this.blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
    }

}
