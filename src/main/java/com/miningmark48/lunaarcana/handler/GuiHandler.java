package com.miningmark48.lunaarcana.handler;

import com.miningmark48.lunaarcana.client.container.*;
import com.miningmark48.lunaarcana.client.gui.*;
import com.miningmark48.lunaarcana.init.ModBlocks;
import com.miningmark48.lunaarcana.reference.GUIs;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler{

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == GUIs.guiSFTier1){
            return ID == GUIs.guiSFTier1 && world.getBlock(x, y, z) == ModBlocks.spellFactoryTier1 ? new ContainerSFTier1(player.inventory, world, x, y, z) : null;
        }
        if (ID == GUIs.guiSFTier2){
            return ID == GUIs.guiSFTier2 && world.getBlock(x, y, z) == ModBlocks.spellFactoryTier2 ? new ContainerSFTier2(player.inventory, world, x, y, z) : null;
        }
        return null;
    }


    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == GUIs.guiSFTier1){
            return ID == GUIs.guiSFTier1 && world.getBlock(x, y, z) == ModBlocks.spellFactoryTier1 ? new GuiSFTier1(player.inventory, world, x, y, z) : null;
        }
        if (ID == GUIs.guiSFTier2){
            return ID == GUIs.guiSFTier2 && world.getBlock(x, y, z) == ModBlocks.spellFactoryTier2 ? new GuiSFTier2(player.inventory, world, x, y, z) : null;
        }
        return null;
    }

}
