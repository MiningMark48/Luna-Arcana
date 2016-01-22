package com.miningmark48.lunaarcana.init;

import com.miningmark48.lunaarcana.creativetab.CreativeTabLunaArcana;
import com.miningmark48.lunaarcana.item.ItemLunaArcana;
import com.miningmark48.lunaarcana.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItems {

    public static final Item testItem = new ItemLunaArcana().setUnlocalizedName("testItem").setTextureName(Reference.MOD_ID + ":testItem").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);

    public static void init(){
        GameRegistry.registerItem(testItem, "testItem");
    }

}
