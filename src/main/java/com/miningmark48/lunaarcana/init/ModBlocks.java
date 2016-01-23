package com.miningmark48.lunaarcana.init;

import com.miningmark48.lunaarcana.block.*;
import com.miningmark48.lunaarcana.creativetab.CreativeTabLunaArcana;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

    //public static final Block spellFactoryTier1 = new BlockSpellFactoryTier1(Material.rock).setBlockName("spellFactoryTier1").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);
    //public static final Block spellFactoryTier2 = new BlockSpellFactoryTier2(Material.rock).setBlockName("spellFactoryTier2").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);
    //public static final Block spellFactoryTier3 = new BlockSpellFactoryTier3(Material.rock).setBlockName("spellFactoryTier3").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);
    public static final Block spellFactoryTier4 = new BlockSpellFactoryTier4(Material.rock).setBlockName("spellFactoryTier4").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);
    public static final Block spellFactoryTier5 = new BlockSpellFactoryTier5(Material.rock).setBlockName("spellFactoryTier5").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);

    public static void init() {

        //GameRegistry.registerBlock(spellFactoryTier1, "spellFactoryTier1");
        //GameRegistry.registerBlock(spellFactoryTier2, "spellFactoryTier2");
        //GameRegistry.registerBlock(spellFactoryTier3, "spellFactoryTier3");
        GameRegistry.registerBlock(spellFactoryTier4, "spellFactoryTier4");
        GameRegistry.registerBlock(spellFactoryTier5, "spellFactoryTier5");
    }

}
