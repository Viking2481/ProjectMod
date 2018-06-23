package com.viking2481.projectmod.world.dimension.spire;

import com.viking2481.projectmod.init.ModBiomes;
import com.viking2481.projectmod.init.ModDimensions;
import com.viking2481.projectmod.world.dimension.ChunkGeneratorSpire;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;

public class DimensionSpire extends WorldProvider
{
	public DimensionSpire() 
	{
		this.biomeProvider = new BiomeProviderSingle(ModBiomes.SPIRE);
		this.hasSkyLight = false;
	}
	
	@Override
	public DimensionType getDimensionType() 
	{
		return ModDimensions.SPIRE;
	}
	
	@Override
	public IChunkGenerator createChunkGenerator() 
	{
		return new ChunkGeneratorSpire(world, true, world.getSeed(), null);
	}
	
	@Override
	public boolean canRespawnHere() 
	{
		return false;
	}
	
	@Override
	public boolean isSurfaceWorld() 
	{
		return false;
	}
}
