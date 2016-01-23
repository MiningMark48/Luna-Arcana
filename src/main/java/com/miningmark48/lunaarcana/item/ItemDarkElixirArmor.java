package com.miningmark48.lunaarcana.item;

import com.miningmark48.lunaarcana.init.ModItems;
import com.miningmark48.lunaarcana.reference.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemDarkElixirArmor extends ItemArmor{

    public ItemDarkElixirArmor(ArmorMaterial material, int type){
        super(material, 0, type);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
        if (stack.getItem() == ModItems.darkElixirHelmet || stack.getItem() == ModItems.darkElixirChestplate || stack.getItem() == ModItems.darkElixirBoots){
            return Reference.MOD_ID + ":textures/armor/darkElixirArmor1.png";
        }else if (stack.getItem() == ModItems.darkElixirLeggings){
            return Reference.MOD_ID + ":textures/armor/darkElixirArmor2.png";
        }else{
            return null;
        }
    }

}
