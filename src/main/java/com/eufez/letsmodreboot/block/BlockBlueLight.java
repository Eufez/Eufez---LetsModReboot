package com.eufez.letsmodreboot.block;

import net.minecraft.block.material.Material;

public class BlockBlueLight extends BlockLMRB
{
    public BlockBlueLight()
    {
        super();
        this.setBlockName("BlueLight");
        this.setHardness(0.3F);
        this.setStepSound(soundTypeGlass);
        this.setLightLevel(1.0F);
    }
}

