package de.tenaciousnetwork.airmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.liquids.ILiquidTank;
import net.minecraftforge.liquids.LiquidStack;

public class BlockCompressor extends Block implements ILiquidTank {

	public BlockCompressor(int par1, Material par2Material) {
		super(par1, par2Material);
		// TODO Auto-generated constructor stub
	}

	@Override
	public LiquidStack getLiquid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCapacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int fill(LiquidStack resource, boolean doFill) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public LiquidStack drain(int maxDrain, boolean doDrain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTankPressure() {
		// TODO Auto-generated method stub
		return 0;
	}

}
