package com.miningmark48.lunaarcana.proxy;

import com.miningmark48.lunaarcana.init.ModBlocks;
import com.miningmark48.lunaarcana.init.ModItems;
import com.miningmark48.lunaarcana.renderer.*;
import com.miningmark48.lunaarcana.tileentity.TileEntitySpellFactoryTier5;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy{

    public void registerRenderThings(){

     //Blocks
        //Pearcel Plush
        TileEntitySpecialRenderer renderPPlush = new RenderSpellFactoryTier5();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySpellFactoryTier5.class, renderPPlush);
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.spellFactoryTier5), new RenderItemSpellFactoryTier5());
     //Items
        MinecraftForgeClient.registerItemRenderer(ModItems.wandTier5, new RenderItemWandTier5());

    }

    public void registerTileEntitySpecialRenderer(){

    }

}
