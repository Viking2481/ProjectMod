package com.viking2481.projectmod.world.biomes;

import java.util.Random;

import com.viking2481.projectmod.Entity.EntityMoa;
import com.viking2481.projectmod.blocks.metadata.BlockGrasses;
import com.viking2481.projectmod.init.ModBlocks;
import com.viking2481.projectmod.util.handlers.EnumHandler;
import com.viking2481.projectmod.world.gen.WorldGenPlasmaTree;

import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

public class BiomePlasma extends Biome 
{
	protected static final WorldGenAbstractTree TREE = new WorldGenPlasmaTree(true);
	
	public BiomePlasma() 
	{
		super(new BiomeProperties("PLASMA").setBaseHeight(0.0F).setHeightVariation(0.025F).setTemperature(0.8F).setRainfall(1.0F).setWaterColor(16711935));
		
		topBlock = ModBlocks.P_GRASS.getDefaultState();
		fillerBlock = ModBlocks.P_DIRT.getDefaultState();
		
		this.decorator.treesPerChunk = -100;
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityMooshroom.class, 3, 2, 6));
		this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityParrot.class, 3, 3, 6));
		this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityMoa.class, 10, 1, 4));
	}
	
	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) 
	{
		return TREE;
	}
}