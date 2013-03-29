package de.tenaciousnetwork.airmod;

import net.minecraftforge.liquids.ILiquid;

public class LiquidAir implements ILiquid {
	private int AirID;

	@Override
	public int stillLiquidId() {
		return AirID;
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
