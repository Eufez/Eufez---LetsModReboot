package com.eufez.letsmodreboot.block;


import com.eufez.letsmodreboot.LetsModReboot;
import com.eufez.letsmodreboot.reference.GUIs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.List;

public class BlockChest extends BlockLMRB
{
    public BlockChest()
    {
        super(Material.wood);
        this.setHardness(2.5f);
        this.setBlockName("Chest");
        this.setBlockBounds(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
    }

    @Override
    public int damageDropped(int metaData)
    {
        return metaData;
    }

    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

   /* @Override
    public int getRenderType()
    {
        return RenderIds.alchemicalChest;
    } */

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9)
    {
        if ((player.isSneaking() && player.getCurrentEquippedItem() != null) || world.isSideSolid(x, y + 1, z, ForgeDirection.DOWN))
        {
            return true;
        }
        else
        {
            if (!world.isRemote && world.getTileEntity(x, y, z) instanceof TileEntityChest)
            {
                player.openGui(LetsModReboot.instance, GUIs.CHEST.ordinal(), world, x, y, z);
            }

            return true;
        }
    }

    @Override
    public boolean onBlockEventReceived(World world, int x, int y, int z, int eventId, int eventData)
    {
        super.onBlockEventReceived(world, x, y, z, eventId, eventData);
        TileEntity tileentity = world.getTileEntity(x, y, z);
        return tileentity != null && tileentity.receiveClientEvent(eventId, eventData);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list)
    {
        for (int meta = 0; meta < 3; meta++)
        {
            list.add(new ItemStack(item, 1, meta));
        }
    }
}