package com.eufez.letsmodreboot.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.BlueLightCore), "sss", "sxs", "sss", 's', "paneGlass", 'x', "dyeBlue"));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BlueLight), "sss", "sxs", "sss", 's', new ItemStack(Blocks.glass), 'x', new ItemStack(ModItems.BlueLightCore));
    }
}

