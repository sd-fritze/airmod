package de.tenaciousnetwork.airmod;

import net.minecraft.item.Item;
import net.minecraftforge.liquids.ILiquid;

public class FluidAir extends Item implements ILiquid {

	public FluidAir(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int stillLiquidId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isMetaSensitive() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int stillLiquidMeta() {
		// TODO Auto-generated method stub
		return 0;
	}

}
