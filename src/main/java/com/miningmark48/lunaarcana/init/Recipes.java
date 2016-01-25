package com.miningmark48.lunaarcana.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class Recipes {

    public static void init() {
        GameRegistry.addSmelting(new ItemStack(ModBlocks.elixirOre), new ItemStack(ModItems.elixirIngot), 10);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.darkElixirOre), new ItemStack(ModItems.darkElixirIngot), 15);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.bronzeOre), new ItemStack(ModItems.bronzeIngot), 5);

        GameRegistry.addRecipe(new ItemStack(ModItems.elixirHelmet), "xxx", "x x", 'x', new ItemStack(ModItems.elixirIngot));
        GameRegistry.addRecipe(new ItemStack(ModItems.elixirChestplate), "x x", "xxx", "xxx", 'x', new ItemStack(ModItems.elixirIngot));
        GameRegistry.addRecipe(new ItemStack(ModItems.elixirLeggings), "xxx", "x x", "x x", 'x', new ItemStack(ModItems.elixirIngot));
        GameRegistry.addRecipe(new ItemStack(ModItems.elixirBoots), "x x", "x x", 'x', new ItemStack(ModItems.elixirIngot));
        GameRegistry.addRecipe(new ItemStack(ModItems.darkElixirHelmet), "xxx", "x x", 'x', new ItemStack(ModItems.darkElixirIngot));
        GameRegistry.addRecipe(new ItemStack(ModItems.darkElixirChestplate), "x x", "xxx", "xxx", 'x', new ItemStack(ModItems.darkElixirIngot));
        GameRegistry.addRecipe(new ItemStack(ModItems.darkElixirLeggings), "xxx", "x x", "x x", 'x', new ItemStack(ModItems.darkElixirIngot));
        GameRegistry.addRecipe(new ItemStack(ModItems.darkElixirBoots), "x x", "x x", 'x', new ItemStack(ModItems.darkElixirIngot));

    }

}
