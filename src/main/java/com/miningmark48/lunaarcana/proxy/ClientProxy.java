package com.miningmark48.lunaarcana.proxy;

import com.miningmark48.lunaarcana.init.ModBlocks;
import com.miningmark48.lunaarcana.init.ModItems;
import com.miningmark48.lunaarcana.renderer.*;
import com.miningmark48.lunaarcana.tileentity.*;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy{

    public void registerRenderThings(){

     //Blocks
        //Spell Factory Tier 4
        TileEntitySpecialRenderer sf4 = new RenderSpellFactoryTier4();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySpellFactoryTier4.class, sf4);
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.spellFactoryTier4), new RenderItemSpellFactoryTier4());
        //Spell Factory Tier 5
        TileEntitySpecialRenderer sf5 = new RenderSpellFactoryTier5();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySpellFactoryTier5.class, sf5);
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.spellFactoryTier5), new RenderItemSpellFactoryTier5());
     //Items
        MinecraftForgeClient.registerItemRenderer(ModItems.wandTier5, new RenderItemWandTier5());

    }

    public void registerTileEntitySpecialRenderer(){

    }

}
