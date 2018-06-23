package com.viking2481.projectmod.init;

import com.viking2481.projectmod.world.dimension.merc.DimensionMerc;
import com.viking2481.projectmod.world.dimension.spire.DimensionSpire;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class ModDimensions 
{
	public static final DimensionType MERC = DimensionType.register("Mercury", "_merc", 2, DimensionMerc.class, false);
	public static final DimensionType SPIRE = DimensionType.register("Spire", "_spire", 3, DimensionSpire.class, false);
	
	
	public static void registerDimensions()
	{
		DimensionManager.registerDimension(2, MERC);
		DimensionManager.registerDimension(3, SPIRE);
	}
}