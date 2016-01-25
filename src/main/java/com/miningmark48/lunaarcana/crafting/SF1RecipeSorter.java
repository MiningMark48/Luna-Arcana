package com.miningmark48.lunaarcana.crafting;

import net.minecraft.item.crafting.IRecipe;

import java.util.Comparator;

public class SF1RecipeSorter implements Comparator{

    final SF1CraftingManager SF1;

    public SF1RecipeSorter(SF1CraftingManager SF1CM){
        this.SF1 = SF1CM;
    }

    public int compareRecipes(IRecipe irecipe1, IRecipe irecipe2){
        return irecipe1 instanceof SF1ShapelessRecipes && irecipe2 instanceof SF1ShapedRecipes ? 1: (irecipe2 instanceof SF1ShapelessRecipes && irecipe1 instanceof SF1ShapedRecipes ? -1 : (irecipe2.getRecipeSize() < irecipe1.getRecipeSize() ? -1 : (irecipe2.getRecipeSize() > irecipe1.getRecipeSize() ? 1 : 0)));
    }

    @Override
    public int compare(Object o1, Object o2) {
        return this.compareRecipes((IRecipe)o1, (IRecipe)o2);
    }

}
