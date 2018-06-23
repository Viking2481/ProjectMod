package com.viking2481.projectmod.world.biomes;

import java.util.Random;

import com.viking2481.projectmod.Entity.EntityMoa;
import com.viking2481.projectmod.blocks.metadata.BlockGrasses;
import com.viking2481.projectmod.init.ModBlocks;
import com.viking2481.projectmod.util.handlers.EnumHandler;
import com.viking2481.projectmod.world.gen.WorldGenSATree;

import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

public class BiomeSA extends Biome 
{
	protected static final WorldGenAbstractTree TREE = new WorldGenSATree(true);
	
	public BiomeSA() 
	{
		super(new BiomeProperties("SA").setBaseHeight(0.125F).setHeightVariation(0.05F).setTemperature(0.6F).setRainfall(0.4F).setSnowEnabled().setWaterColor(38480));
		
		topBlock = ModBlocks.SA_GRASS.getDefaultState();
		fillerBlock = ModBlocks.SA_DIRT.getDefaultState();
		
		this.decorator.treesPerChunk = -30;
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntitySheep.class, 12, 4, 4));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityPig.class, 10, 4, 4));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityChicken.class, 10, 4, 4));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityCow.class, 8, 4, 4));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityWolf.class, 6, 1, 2));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityRabbit.class,4, 1, 6));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityParrot.class,10, 2, 6));
		this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityMoa.class, 10, 1, 4));
		
	}

	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) 
	{
		return TREE;
	}
}