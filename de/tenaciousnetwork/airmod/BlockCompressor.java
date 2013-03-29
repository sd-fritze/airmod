package de.tenaciousnetwork.airmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.liquids.ILiquidTank;
import net.minecraftforge.liquids.LiquidStack;

public class BlockCompressor extends Block 
{
	public BlockCompressor(int par1, Material par2Material) {
		super(par1, par2Material);
		// TODO Auto-generated constructor stub
	}

    public TileEntity createNewTileEntity(World par1World)
    {
        return new TileEntityCompressor();
    }
    
}
