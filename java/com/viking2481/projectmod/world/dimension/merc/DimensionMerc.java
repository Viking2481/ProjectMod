package com.viking2481.projectmod.world.dimension.merc;

import com.viking2481.projectmod.init.ModBiomes;
import com.viking2481.projectmod.init.ModDimensions;
import com.viking2481.projectmod.world.dimension.ChunkGeneratorMerc;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;

public class DimensionMerc extends WorldProvider
{
	public DimensionMerc() 
	{
		this.biomeProvider = new BiomeProviderSingle(ModBiomes.MERC);
		this.hasSkyLight = false;
	}
	
	@Override
	public DimensionType getDimensionType() 
	{
		return ModDimensions.MERC;
	}
	
	@Override
	public IChunkGenerator createChunkGenerator() 
	{
		return new ChunkGeneratorMerc(world, true, world.getSeed(), null);
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
