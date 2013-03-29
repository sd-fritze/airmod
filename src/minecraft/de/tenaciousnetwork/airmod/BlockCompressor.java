package de.tenaciousnetwork.airmod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.liquids.ILiquidTank;
import net.minecraftforge.liquids.LiquidStack;

public class BlockCompressor extends Block 
{
	private Icon[] tex = new Icon[4];
	/* (non-Javadoc)
	 * @see net.minecraft.block.Block#registerIcons(net.minecraft.client.renderer.texture.IconRegister)
	 */
	@Override
	public void registerIcons(IconRegister par1) {
		tex[0] = par1.registerIcon("airmod:mbottom");
		tex[1] = par1.registerIcon("airmod:mside");
		tex[2] = par1.registerIcon("airmod:compf_unlit");
		tex[3] = par1.registerIcon("airmod:compf_lit");
	}

	/* (non-Javadoc)
	 * @see net.minecraft.block.Block#getBlockTextureFromSideAndMetadata(int, int)
//	 */
	@Override
	public Icon getBlockTextureFromSideAndMetadata(int side, int meta) 
	{
		if (side == 0){
			return tex[0];
		}
		if (side == (meta&7)){
			if ((meta&8)>0) {
				return tex[3];
			} else
			return tex[2];
		}
		return tex[1];
	}

	public BlockCompressor(int par1, Material par2Material) {
		super(par1, par2Material);
		// TODO Auto-generated constructor stub
	}

    public TileEntity createNewTileEntity(World par1World)
    {
        return new TileEntityCompressor();
    }

	/* (non-Javadoc)
	 * @see net.minecraft.block.Block#onBlockPlacedBy(net.minecraft.world.World, int, int, int, net.minecraft.entity.EntityLiving, net.minecraft.item.ItemStack)
	 */
	@Override
	 public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving, ItemStack par6ItemStack)
    {
        int l = MathHelper.floor_double((double)(par5EntityLiving.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (l == 0)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 2, 2);
        }

        if (l == 1)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 5, 2);
        }

        if (l == 2)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 2);
        }

        if (l == 3)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 4, 2);
        }
    }



    
}
