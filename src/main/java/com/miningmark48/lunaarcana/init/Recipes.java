package com.miningmark48.lunaarcana.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class Recipes {

    public static void init() {
        GameRegistry.addSmelting(new ItemStack(ModBlocks.elixirOre), new ItemStack(ModItems.elixirIngot), 10);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.darkElixirOre), new ItemStack(ModItems.darkElixirIngot), 15);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.bronzeOre), new ItemStack(ModItems.bronzeIngot), 5);
    }

}
