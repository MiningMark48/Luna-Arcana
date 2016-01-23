package com.miningmark48.lunaarcana.proxy;

import com.miningmark48.lunaarcana.init.ModBlocks;
import com.miningmark48.lunaarcana.init.ModItems;
import com.miningmark48.lunaarcana.renderer.*;
import com.miningmark48.lunaarcana.tileentity.*;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy{

    public void registerRenderThings(){

     //Blocks
        //Spell Factory Tier 2
            TileEntitySpecialRenderer sf1 = new RenderSpellFactoryTier1();
            ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySpellFactoryTier1.class, sf1);
            MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.spellFactoryTier1), new RenderItemSpellFactoryTier1());
        //Spell Factory Tier 2
            TileEntitySpecialRenderer sf2 = new RenderSpellFactoryTier2();
            ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySpellFactoryTier2.class, sf2);
            MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.spellFactoryTier2), new RenderItemSpellFactoryTier2());
        //Spell Factory Tier 3
            TileEntitySpecialRenderer sf3 = new RenderSpellFactoryTier3();
            ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySpellFactoryTier3.class, sf3);
            MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.spellFactoryTier3), new RenderItemSpellFactoryTier3());
        //Spell Factory Tier 4
            TileEntitySpecialRenderer sf4 = new RenderSpellFactoryTier4();
            ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySpellFactoryTier4.class, sf4);
            MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.spellFactoryTier4), new RenderItemSpellFactoryTier4());
        //Spell Factory Tier 5
            TileEntitySpecialRenderer sf5 = new RenderSpellFactoryTier5();
            ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySpellFactoryTier5.class, sf5);
            MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.spellFactoryTier5), new RenderItemSpellFactoryTier5());
        //Spell Factory Tier 6
            TileEntitySpecialRenderer sf6 = new RenderSpellFactoryTier6();
            ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySpellFactoryTier6.class, sf6);
            MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.spellFactoryTier6), new RenderItemSpellFactoryTier6());
     //Items
        MinecraftForgeClient.registerItemRenderer(ModItems.wandTier5, new RenderItemWandTier5());

    }

    public int addArmor(String armor){
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }

    public void registerTileEntitySpecialRenderer(){

    }

}
