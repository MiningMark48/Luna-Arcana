package com.miningmark48.lunaarcana.init;

import com.miningmark48.lunaarcana.block.*;
import com.miningmark48.lunaarcana.creativetab.CreativeTabLunaArcana;
import com.miningmark48.lunaarcana.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

    //General
    public static final Block elixirBlock = new BlockLunaArcana().setBlockName("elixirBlock").setBlockTextureName(Reference.MOD_ID + ":elixirBlock").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);
    public static final Block darkElixirBlock = new BlockLunaArcana().setBlockName("darkElixirBlock").setBlockTextureName(Reference.MOD_ID + ":darkElixirBlock").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);
    public static final Block bronzeBlock = new BlockLunaArcana().setBlockName("bronzeBlock").setBlockTextureName(Reference.MOD_ID + ":bronzeBlock").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);
    public static final Block crystalElixirBlock = new BlockCrystal().setBlockName("crystalElixirBlock").setBlockTextureName(Reference.MOD_ID + ":crystalElixirBlock").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);
    public static final Block crystalDarkElixirBlock = new BlockCrystal().setBlockName("crystalDarkElixirBlock").setBlockTextureName(Reference.MOD_ID + ":crystalDarkElixirBlock").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);

    //Spell Factories
    public static final Block spellFactoryTier1 = new BlockSpellFactoryTier1(Material.iron).setBlockName("spellFactoryTier1").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);
    public static final Block spellFactoryTier2 = new BlockSpellFactoryTier2(Material.iron).setBlockName("spellFactoryTier2").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);
    public static final Block spellFactoryTier3 = new BlockSpellFactoryTier3(Material.iron).setBlockName("spellFactoryTier3").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);
    public static final Block spellFactoryTier4 = new BlockSpellFactoryTier4(Material.iron).setBlockName("spellFactoryTier4").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);
    public static final Block spellFactoryTier5 = new BlockSpellFactoryTier5(Material.iron).setBlockName("spellFactoryTier5").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);
    public static final Block spellFactoryTier6 = new BlockSpellFactoryTier6(Material.iron).setBlockName("spellFactoryTier6").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);

    //Ores
    public static final Block elixirOre = new BlockElixirOre().setBlockName("elixirOre").setBlockTextureName(Reference.MOD_ID + ":elixirOre").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);
    public static final Block darkElixirOre = new BlockDarkElixirOre().setBlockName("darkElixirOre").setBlockTextureName(Reference.MOD_ID + ":darkElixirOre").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);
    public static final Block bronzeOre = new BlockBronzeOre().setBlockName("bronzeOre").setBlockTextureName(Reference.MOD_ID + ":bronzeOre").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);

    public static void init() {

        GameRegistry.registerBlock(elixirBlock, "elixirBlock");
        GameRegistry.registerBlock(darkElixirBlock, "darkElixirBlock");
        GameRegistry.registerBlock(bronzeBlock, "bronzeBlock");
        GameRegistry.registerBlock(crystalElixirBlock, "crystalElixirBlock");
        GameRegistry.registerBlock(crystalDarkElixirBlock, "crystalDarkElixirBlock");

        GameRegistry.registerBlock(spellFactoryTier1, "spellFactoryTier1");
        GameRegistry.registerBlock(spellFactoryTier2, "spellFactoryTier2");
        GameRegistry.registerBlock(spellFactoryTier3, "spellFactoryTier3");
        GameRegistry.registerBlock(spellFactoryTier4, "spellFactoryTier4");
        GameRegistry.registerBlock(spellFactoryTier5, "spellFactoryTier5");
        GameRegistry.registerBlock(spellFactoryTier6, "spellFactoryTier6");

        GameRegistry.registerBlock(elixirOre, "elixirOre");
        GameRegistry.registerBlock(darkElixirOre, "darkElixirOre");
        GameRegistry.registerBlock(bronzeOre, "bronzeOre");
    }

}
