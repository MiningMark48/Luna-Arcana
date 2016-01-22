package com.miningmark48.lunaarcana.creativetab;

import com.miningmark48.lunaarcana.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabLunaArcana {

    public static final CreativeTabs LunaArcana_TAB = new CreativeTabs(Reference.MOD_ID){

        @Override
        public Item getTabIconItem(){
            return Items.ender_eye;
        }

    };

}
