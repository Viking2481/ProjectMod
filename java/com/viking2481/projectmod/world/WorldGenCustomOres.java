package com.viking2481.projectmod.world;

import java.util.Random;

import com.viking2481.projectmod.blocks.metadata.BlockOres;
import com.viking2481.projectmod.init.ModBlocks;
import com.viking2481.projectmod.util.handlers.EnumHandler;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator
{
	private WorldGenerator ore_overworld_plasma;
	private WorldGenerator ore_overworld_sa;
	
	private WorldGenerator ore_merc_sp;
	private WorldGenerator ore_merc_per;
	private WorldGenerator ore_merc_rube;
	private WorldGenerator ore_merc_aq;
	private WorldGenerator ore_merc_am;
	
	private WorldGenerator ore_spire_spire;
	
	public WorldGenCustomOres() 
	{
		ore_overworld_plasma = new WorldGenMinable(ModBlocks.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.PLASMA), 9, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworld_sa = new WorldGenMinable(ModBlocks.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.SA), 9, BlockMatcher.forBlock(Blocks.STONE));
		
		ore_merc_sp = new WorldGenMinable(ModBlocks.ORE_MERC.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.SP), 9, BlockMatcher.forBlock(ModBlocks.MERC_STONE));
		ore_merc_per = new WorldGenMinable(ModBlocks.ORE_MERC.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.PER), 9, BlockMatcher.forBlock(ModBlocks.MERC_STONE));
		ore_merc_rube = new WorldGenMinable(ModBlocks.ORE_MERC.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.RUBE), 9, BlockMatcher.forBlock(ModBlocks.MERC_STONE));
		ore_merc_aq = new WorldGenMinable(ModBlocks.ORE_MERC.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.AQ), 9, BlockMatcher.forBlock(ModBlocks.MERC_STONE));
		ore_merc_am = new WorldGenMinable(ModBlocks.ORE_MERC.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.AM), 9, BlockMatcher.forBlock(ModBlocks.MERC_STONE));
		
		ore_spire_spire = new WorldGenMinable(ModBlocks.ORE_SPIRE.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.SPIRE), 9, BlockMatcher.forBlock(ModBlocks.MERC_STONE));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		
		case 3:
			
			runGenerator(ore_merc_sp, world, random, chunkX, chunkZ, 50, 0, 100);
			runGenerator(ore_merc_per, world, random, chunkX, chunkZ, 50, 0, 100);
			runGenerator(ore_merc_rube, world, random, chunkX, chunkZ, 50, 0, 100);
			runGenerator(ore_merc_aq, world, random, chunkX, chunkZ, 50, 0, 100);
			runGenerator(ore_merc_am, world, random, chunkX, chunkZ, 50, 0, 100);
			break;
		
		case 2:
			
			runGenerator(ore_spire_spire, world, random, chunkX, chunkZ, 50, 0, 100);
			
			break;
		
		case 1:
			
			break;
		
		case 0:
			
			runGenerator(ore_overworld_plasma, world, random, chunkX, chunkZ, 50, 0, 100);
			runGenerator(ore_overworld_sa, world, random, chunkX, chunkZ, 50, 0, 100);
			
			break;
			
		case -1:
			
		}
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
	}
}