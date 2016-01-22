package com.miningmark48.lunaarcana.init;

import com.miningmark48.lunaarcana.block.BlockLunaArcana;
import com.miningmark48.lunaarcana.creativetab.CreativeTabLunaArcana;
import com.miningmark48.lunaarcana.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks {

    public static final Block test = new BlockLunaArcana().setBlockName("test").setBlockTextureName(Reference.MOD_ID + ":test").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);

    public static void init() {
        GameRegistry.registerBlock(test, "test");
    }

    public boolean isOpaque() {
        return false;
    }

}
