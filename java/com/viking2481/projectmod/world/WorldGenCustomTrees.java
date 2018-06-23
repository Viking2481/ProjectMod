package com.viking2481.projectmod.world;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import com.viking2481.projectmod.world.biomes.BiomeMerc;
import com.viking2481.projectmod.world.biomes.BiomePlasma;
import com.viking2481.projectmod.world.biomes.BiomeSA;
import com.viking2481.projectmod.world.biomes.BiomeSpire;
import com.viking2481.projectmod.world.gen.WorldGenPinkMapleTree;
import com.viking2481.projectmod.world.gen.WorldGenPlasmaTree;
import com.viking2481.projectmod.world.gen.WorldGenSATree;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenBirchTree;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomTrees implements IWorldGenerator
{
	private final WorldGenerator SA = new WorldGenSATree(true);
	private final WorldGenerator PLASMA = new WorldGenPlasmaTree(true);
	private final WorldGenerator SPIRE = new WorldGenBirchTree(true, true);
	private final WorldGenerator MERC = new WorldGenSATree(true);
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{

		case 3:
			
			break;
			
		case 2:
			
			break;
			
		case 1:
			
			break;
			
		case 0:
			
			runGenerator(SA, world, random, chunkX, chunkZ, 0.5, -1, 0, BiomeSA.class);
			runGenerator(PLASMA, world, random, chunkX, chunkZ, 0.25, -1, 0, BiomePlasma.class);
			runGenerator(SPIRE, world, random, chunkX, chunkZ, 0.2, -1, 0, BiomeSpire.class);
			runGenerator(MERC, world, random, chunkX, chunkZ, 0.5, -1, 0, BiomeMerc.class);
			
			break;
			
		case -1:
			
		}
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, double chancesToSpawn, int minHeight, int maxHeight, Class<?>... classes)
	{
		if(chancesToSpawn < 1) 
		{
			if(random.nextDouble() < chancesToSpawn) chancesToSpawn = 1;
			else chancesToSpawn = 0;
		}
		
		ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classes));
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chancesToSpawn; i++)
		{
			BlockPos pos = new BlockPos(chunkX * 16 + 10 + random.nextInt(15), minHeight + random.nextInt(heightDiff), chunkZ * 16 + 10 + random.nextInt(15));
			if(minHeight < 0) pos = world.getHeight(pos);
			Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
			
			if(world.getWorldType() != WorldType.FLAT)
			{
				if(classesList.contains(biome) || classes.length == 0) generator.generate(world, random, pos);
			}
		}
	}
}