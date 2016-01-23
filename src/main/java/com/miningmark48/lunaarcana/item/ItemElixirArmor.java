package com.miningmark48.lunaarcana.item;

import com.miningmark48.lunaarcana.init.ModItems;
import com.miningmark48.lunaarcana.reference.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemElixirArmor extends ItemArmor{

    public ItemElixirArmor(ArmorMaterial material, int type){
        super(material, 0, type);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
        if (stack.getItem() == ModItems.elixirHelmet || stack.getItem() == ModItems.elixirChestplate || stack.getItem() == ModItems.elixirBoots){
            return Reference.MOD_ID + ":textures/armor/elixirArmor1.png";
        }else if (stack.getItem() == ModItems.elixirLeggings){
            return Reference.MOD_ID + ":textures/armor/elixirArmor2.png";
        }else{
            return null;
        }
    }

}
