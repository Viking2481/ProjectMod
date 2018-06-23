package com.viking2481.projectmod.world.biomes;

import java.util.Random;

import com.viking2481.projectmod.Entity.EntityMoa;
import com.viking2481.projectmod.blocks.metadata.BlockGrasses;
import com.viking2481.projectmod.init.ModBlocks;
import com.viking2481.projectmod.util.handlers.EnumHandler;

import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

public class BiomeMerc extends Biome 
{
	public BiomeMerc() 
	{
		super(new BiomeProperties("MERC").setBaseHeight(0.125F).setHeightVariation(0.05F).setTemperature(0.8F).setRainfall(0.4F).setWaterColor(14115190));
		
		topBlock = ModBlocks.M_GRASS.getDefaultState();
		fillerBlock = ModBlocks.M_DIRT.getDefaultState();
		
		this.decorator.treesPerChunk = -30;
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityMoa.class, 10, 1, 4));
		
	}
}