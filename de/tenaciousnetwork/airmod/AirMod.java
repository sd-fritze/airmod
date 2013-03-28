package de.tenaciousnetwork.airmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "airmod", version = "0.0.1", name="AirMod")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class AirMod 
{
	@Instance("airmod")
	public static AirMod instance;
	
    @SidedProxy(clientSide="de.tenaciousnetwork.airmod.client.ClientProxy", serverSide="de.tenaciousnetwork.airmod.CommonProxy")
    public static CommonProxy proxy;
   
    @PreInit
    public void preInit(FMLPreInitializationEvent event) 
    {
            // Stub Method
    }
   
    @Init
    public void load(FMLInitializationEvent event) 
    {
            proxy.registerRenderers();
    }
   
    @PostInit
    public void postInit(FMLPostInitializationEvent event) 
    {
            // Stub Method
    }

}
