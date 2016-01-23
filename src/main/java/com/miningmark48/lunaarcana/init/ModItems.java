package com.miningmark48.lunaarcana.init;

import com.miningmark48.lunaarcana.creativetab.CreativeTabLunaArcana;
import com.miningmark48.lunaarcana.item.*;
import com.miningmark48.lunaarcana.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItems {

    public static final Item wandTier5 = new ItemWandTier5().setUnlocalizedName("wandTier5").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);

    public static void init(){
        GameRegistry.registerItem(wandTier5, "wandTier5");
    }

}
