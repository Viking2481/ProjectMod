package com.viking2481.projectmod;

import com.viking2481.projectmod.init.ModBlocks;
import com.viking2481.projectmod.init.ModItems;
import com.viking2481.projectmod.init.ModRecipes;
import com.viking2481.projectmod.proxy.CommonProxy;
import com.viking2481.projectmod.tabs.ProjectBlocks;
import com.viking2481.projectmod.tabs.ProjectCombat;
import com.viking2481.projectmod.tabs.ProjectDecor;
import com.viking2481.projectmod.tabs.ProjectFood;
import com.viking2481.projectmod.tabs.ProjectItems;
import com.viking2481.projectmod.tabs.ProjectTools;
import com.viking2481.projectmod.util.Reference;
import com.viking2481.projectmod.util.handlers.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent; 

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	@Instance
	public static Main instance;
	
	public static final CreativeTabs projectblocks = new ProjectBlocks("projectblocks");
	public static final CreativeTabs projectdecor = new ProjectDecor("projectdecor");
	public static final CreativeTabs projectitems = new ProjectItems("projectitems");
	public static final CreativeTabs projectcombat = new ProjectCombat("projectcombat");
	public static final CreativeTabs projecttools = new ProjectTools("projecttools");
	public static final CreativeTabs projectfood = new ProjectFood("projectfood");
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
		
		ModRecipes.init();
		ModRecipes.register();
		
		RegistryHandler.otherRegistries();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		proxy.init();
		
		RegistryHandler.initRegistries();
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {}
	
	@EventHandler
	public static void ServerInit(FMLServerStartingEvent event) {RegistryHandler.serverRegistries(event);}

}
