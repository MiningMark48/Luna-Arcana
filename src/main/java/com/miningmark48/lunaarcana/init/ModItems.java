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

    //General
    public static final Item elixirIngot = new ItemLunaArcana().setUnlocalizedName("elixirIngot").setTextureName(Reference.MOD_ID + ":elixirIngot").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);
    public static final Item darkElixirIngot = new ItemLunaArcana().setUnlocalizedName("darkElixirIngot").setTextureName(Reference.MOD_ID + ":darkElixirIngot").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);
    public static final Item bronzeIngot = new ItemLunaArcana().setUnlocalizedName("bronzeIngot").setTextureName(Reference.MOD_ID + ":bronzeIngot").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);

    //Wands
    public static final Item wandTier5 = new ItemWandTier5().setUnlocalizedName("wandTier5").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);

    //Armor
    public static final Item elixirHelmet = new ItemElixirArmor(matElixir, 0).setUnlocalizedName("elixirHelmet").setTextureName(Reference.MOD_ID + ":elixirHelmet").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);
    public static final Item elixirChestplate = new ItemElixirArmor(matElixir, 1).setUnlocalizedName("elixirChestplate").setTextureName(Reference.MOD_ID + ":elixirChestplate").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);
    public static final Item elixirLeggings = new ItemElixirArmor(matElixir, 2).setUnlocalizedName("elixirLeggings").setTextureName(Reference.MOD_ID + ":elixirLeggings").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);
    public static final Item elixirBoots = new ItemElixirArmor(matElixir, 3).setUnlocalizedName("elixirBoots").setTextureName(Reference.MOD_ID + ":elixirBoots").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);
    public static final Item darkElixirHelmet = new ItemDarkElixirArmor(matElixir, 0).setUnlocalizedName("darkElixirHelmet").setTextureName(Reference.MOD_ID + ":darkElixirHelmet").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);
    public static final Item darkElixirChestplate = new ItemDarkElixirArmor(matElixir, 1).setUnlocalizedName("darkElixirChestplate").setTextureName(Reference.MOD_ID + ":darkElixirChestplate").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);
    public static final Item darkElixirLeggings = new ItemDarkElixirArmor(matElixir, 2).setUnlocalizedName("darkElixirLeggings").setTextureName(Reference.MOD_ID + ":darkElixirLeggings").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);
    public static final Item darkElixirBoots = new ItemDarkElixirArmor(matElixir, 3).setUnlocalizedName("darkElixirBoots").setTextureName(Reference.MOD_ID + ":darkElixirBoots").setCreativeTab(CreativeTabLunaArcana.LunaArcana_TAB);

    public static void init(){
        GameRegistry.registerItem(elixirIngot, "elixirIngot");
        GameRegistry.registerItem(darkElixirIngot, "darkElixirIngot");
        GameRegistry.registerItem(bronzeIngot, "bronzeIngot");

        GameRegistry.registerItem(wandTier5, "wandTier5");

        GameRegistry.registerItem(elixirHelmet, "elixirHelmet");
        GameRegistry.registerItem(elixirChestplate, "elixirChestplate");
        GameRegistry.registerItem(elixirLeggings, "elixirLeggings");
        GameRegistry.registerItem(elixirBoots, "elixirBoots");
        GameRegistry.registerItem(darkElixirHelmet, "darkElixirHelmet");
        GameRegistry.registerItem(darkElixirChestplate, "darkElixirChestplate");
        GameRegistry.registerItem(darkElixirLeggings, "darkElixirLeggings");
        GameRegistry.registerItem(darkElixirBoots, "darkElixirBoots");
    }

}
