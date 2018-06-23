package com.viking2481.projectmod.init;

import com.viking2481.projectmod.world.biomes.BiomeMerc;
import com.viking2481.projectmod.world.biomes.BiomePlasma;
import com.viking2481.projectmod.world.biomes.BiomeSA;
import com.viking2481.projectmod.world.biomes.BiomeSpire;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModBiomes 
{
	public static final Biome SA = new BiomeSA();
	public static final Biome PLASMA = new BiomePlasma();
	public static final Biome SPIRE = new BiomeSpire();
	public static final Biome MERC = new BiomeMerc();
	
	public static void registerBiomes()
	{
		initBiome(SA, "Sa", BiomeType.WARM, Type.PLAINS);
		initBiome(PLASMA, "Plasma", BiomeType.WARM, Type.MUSHROOM, Type.PLAINS);
		initBiome(SPIRE, "Spire", BiomeType.COOL, Type.COLD, Type.SPOOKY, Type.DRY);
		initBiome(MERC, "Mercury", BiomeType.WARM, Type.PLAINS);
	}
	
	private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types)
	{
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		System.out.println("Biome Registered");
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 1000));
		BiomeManager.addSpawnBiome(biome);
		System.out.println("Biome Added");
		return biome;
	}
}