package com.eufez.letsmodreboot.init;

import com.eufez.letsmodreboot.block.BlockBlueLight;
import com.eufez.letsmodreboot.block.BlockLMRB;
import com.eufez.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMRB BlueLight = new BlockBlueLight();

    public static void init()
    {
        GameRegistry.registerBlock(BlueLight, "BlueLight");
    }

}
