package com.viking2481.projectmod.init;

import com.viking2481.projectmod.blocks.metadata.BlockOres;
import com.viking2481.projectmod.util.handlers.EnumHandler;

import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	
	public static void init() 
	{
		
		//Variants
		GameRegistry.addSmelting(ModBlocks.ORE_OVERWORLD, new ItemStack(ModItems.PLASMACORE, 1), 1.0f);
		GameRegistry.addSmelting(ModBlocks.ORE_OVERWORLD, new ItemStack(ModItems.SA_GEM, 1), 0.7f);
		
		GameRegistry.addSmelting(ModBlocks.SA_LOG, new ItemStack(Items.COAL, 1, 2), 0.15F);
		
		GameRegistry.addSmelting(ModBlocks.MERC_COBBLE, new ItemStack(ModBlocks.MERC_STONE, 1), 0.1F);
		
		//Food
		GameRegistry.addSmelting(ModItems.MOA_B, new ItemStack(ModItems.MOA_S, 1), 0.35f);
		GameRegistry.addSmelting(ModItems.SP_RAW, new ItemStack(ModItems.SP_BAKED, 1), 0.35f);
	}
	
	
	public static void register() {}
	
}
