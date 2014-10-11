package com.eufez.letsmodreboot.init;

import com.eufez.letsmodreboot.item.ItemBlueLightCore;
import com.eufez.letsmodreboot.item.ItemLMRB;
import com.eufez.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLMRB BlueLightCore = new ItemBlueLightCore();

    public static void init()
    {
        GameRegistry.registerItem(BlueLightCore, "BlueLightCore");
    }

}
