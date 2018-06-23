package com.viking2481.projectmod.world.biomes;

import java.util.Random;

import com.viking2481.projectmod.blocks.metadata.BlockGrasses;
import com.viking2481.projectmod.init.ModBlocks;
import com.viking2481.projectmod.util.handlers.EnumHandler;

import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

public class BiomeSpire extends Biome 
{
	public BiomeSpire() 
	{
		super(new BiomeProperties("SPIRE").setBaseHeight(0.0F).setHeightVariation(0.0F).setTemperature(0.2F).setWaterColor(16777215));
		
		topBlock = ModBlocks.SP_GRASS.getDefaultState();
		fillerBlock = ModBlocks.SP_DIRT.getDefaultState();
		
		this.decorator.treesPerChunk = -100;
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityWolf.class, 2, 2, 6));
	}
}