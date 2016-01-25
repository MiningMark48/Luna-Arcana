package com.miningmark48.lunaarcana.block;

import com.miningmark48.lunaarcana.reference.GUIs;
import com.miningmark48.lunaarcana.reference.Reference;
import com.miningmark48.lunaarcana.tileentity.TileEntitySpellFactoryTier2;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockSpellFactoryTier2 extends BlockContainer{

    public BlockSpellFactoryTier2(Material material){
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
        return new TileEntitySpellFactoryTier2();
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        this.blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ){
        if (!player.isSneaking()){
            player.openGui(Reference.MOD_ID, GUIs.guiSFTier2, world, x, y, z);
            return true;
        }else{
            return false;
        }
    }

}
