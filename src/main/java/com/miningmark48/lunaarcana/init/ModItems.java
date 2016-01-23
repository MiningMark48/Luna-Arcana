package com.miningmark48.lunaarcana.init;

import com.miningmark48.lunaarcana.creativetab.CreativeTabLunaArcana;
import com.miningmark48.lunaarcana.item.*;
import com.miningmark48.lunaarcana.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

    public static ItemArmor.ArmorMaterial matElixir = EnumHelper.addArmorMaterial("ElixirArmor", 50, new int[]{4, 8, 6, 3}, 30);

    //Wands
    public static final Item wandTier5 = new ItemWandTier5().setUnlocalizedName("wandTier5").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);

    //Armor
    public static final Item elixirHelmet = new ItemElixirArmor(matElixir, 0).setUnlocalizedName("elixirHelmet").setTextureName(Reference.MOD_ID + ":elixirHelmet").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);
    public static final Item elixirChestplate = new ItemElixirArmor(matElixir, 1).setUnlocalizedName("elixirChestplate").setTextureName(Reference.MOD_ID + ":elixirChestplate").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);
    public static final Item elixirLeggings = new ItemElixirArmor(matElixir, 2).setUnlocalizedName("elixirLeggings").setTextureName(Reference.MOD_ID + ":elixirLeggings").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);
    public static final Item elixirBoots = new ItemElixirArmor(matElixir, 3).setUnlocalizedName("elixirBoots").setTextureName(Reference.MOD_ID + ":elixirBoots").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);

    public static void init(){
        GameRegistry.registerItem(wandTier5, "wandTier5");

        GameRegistry.registerItem(elixirHelmet, "elixirHelmet");
        GameRegistry.registerItem(elixirChestplate, "elixirChestplate");
        GameRegistry.registerItem(elixirLeggings, "elixirLeggings");
        GameRegistry.registerItem(elixirBoots, "elixirBoots");
    }

}
