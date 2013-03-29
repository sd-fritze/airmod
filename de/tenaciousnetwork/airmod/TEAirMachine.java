package de.tenaciousnetwork.airmod;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.liquids.ILiquidTank;
import net.minecraftforge.liquids.ITankContainer;

abstract class TEAirMachine extends TileEntity implements ITankContainer
{
	public LiquidTank tank;
	@Override
    public void readFromNBT(NBTTagCompound par1)
    {
    	super.readFromNBT(par1);
    	
    	//fill = par1.getInteger("Fill");
    	//volume = par1.getInteger("Volume");
    }
    
    @Override
    public void writeToNBT(NBTTagCompound par1)
    {
    	super.writeToNBT(par1);
    	//par1.setInteger("Fill", fill);
    	//par1.setInteger("Volume", volume);
    }
    
    private float getPressure(boolean abs)
    {
    	return 0F;
    	//return (float)fill / (float)volume - (abs ? 0 : 1);
    }
}
