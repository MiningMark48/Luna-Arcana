package com.miningmark48.lunaarcana.init;

import com.miningmark48.lunaarcana.block.*;
import com.miningmark48.lunaarcana.creativetab.CreativeTabLunaArcana;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

    public static final Block spellFactoryTier5 = new BlockSpellFactoryTier5(Material.rock).setBlockName("spellFactoryTier5").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);

    public static void init() {
        GameRegistry.registerBlock(spellFactoryTier5, "spellFactoryTier5");
    }

}
