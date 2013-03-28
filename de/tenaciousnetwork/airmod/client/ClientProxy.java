package de.tenaciousnetwork.airmod.client;

import net.minecraftforge.client.MinecraftForgeClient;
import de.tenaciousnetwork.airmod.CommonProxy;

public class ClientProxy extends CommonProxy 
{
	public void registerRenderers() 
	{
        MinecraftForgeClient.preloadTexture(items_PNG);
        MinecraftForgeClient.preloadTexture(block_PNG);
	}
}
