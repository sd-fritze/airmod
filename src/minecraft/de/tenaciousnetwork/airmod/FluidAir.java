package de.tenaciousnetwork.airmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraftforge.liquids.ILiquid;

public class FluidAir extends Item implements ILiquid {

	/* (non-Javadoc)
	 * @see net.minecraft.item.Item#updateIcons(net.minecraft.client.renderer.texture.IconRegister)
	 */

	public FluidAir(int par1) {
		super(par1);
	}

	@Override
	public int stillLiquidId() {
		return GameRegistry.findItem("airmod","air").itemID;
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
