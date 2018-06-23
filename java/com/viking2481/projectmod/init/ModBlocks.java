package com.viking2481.projectmod.init;

import java.util.ArrayList;
import java.util.List;

import com.viking2481.projectmod.blocks.metadata.BlockDirts;
import com.viking2481.projectmod.blocks.metadata.BlockGrasses;
import com.viking2481.projectmod.blocks.metadata.BlockLeaf;
import com.viking2481.projectmod.blocks.metadata.BlockLogs;
import com.viking2481.projectmod.blocks.metadata.BlockOres;
import com.viking2481.projectmod.blocks.metadata.BlockPlank;
import com.viking2481.projectmod.blocks.metadata.BlockSaplings;
import com.viking2481.projectmod.blocks.metadata.PlasmaBlock;
import com.viking2481.projectmod.blocks.metadata.PlasmaLamp;
import com.viking2481.projectmod.blocks.metadata.Rust_Plasma;
import com.viking2481.projectmod.blocks.metadata.Merc_Cobble;
import com.viking2481.projectmod.blocks.metadata.Merc_Stone;
import com.viking2481.projectmod.blocks.metadata.Spire_Link;
import com.viking2481.projectmod.blocks.metadata.BlockOreBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	
	//Stones
	public static final Block MERC_STONE = new Merc_Stone("merc_stone", Material.ROCK);
	public static final Block MERC_COBBLE = new Merc_Cobble("merc_cobble", Material.ROCK);
	
	//Ground
	public static final Block SA_GRASS = new BlockGrasses("sa_grass");
	public static final Block SA_DIRT = new BlockDirts("sa_dirt");
	
	public static final Block P_GRASS = new BlockGrasses("p_grass");
	public static final Block P_DIRT = new BlockDirts("p_dirt");
	
	public static final Block SP_GRASS = new BlockGrasses("sp_grass");
	public static final Block SP_DIRT = new BlockDirts("sp_dirt");
	
	public static final Block M_GRASS = new BlockGrasses("m_grass");
	public static final Block M_DIRT = new BlockDirts("m_dirt");
	
	//Tree/wood
	public static final Block SA_LOG = new BlockLogs("sa_log");
	public static final Block SA_PLANK = new BlockPlank("sa_plank");
	public static final Block SA_LEAVES = new BlockLeaf("sa_leaves");
	public static final Block SA_SAPLING = new BlockSaplings("sa_sapling");
	
	public static final Block P_LOG = new BlockLogs("p_log");
	public static final Block P_PLANK = new BlockPlank("p_plank");
	public static final Block P_LEAVES = new BlockLeaf("p_leaves");
	public static final Block P_SAPLING = new BlockSaplings("p_sapling");
	
	public static final Block SP_LOG = new BlockLogs("sp_log");
	public static final Block SP_PLANK = new BlockPlank("sp_plank");
	public static final Block SP_LEAVES = new BlockLeaf("sp_leaves");
	public static final Block SP_SAPLING = new BlockSaplings("sp_sapling");
	
	public static final Block M_LOG = new BlockLogs("pm_log");
	public static final Block M_PLANK = new BlockPlank("pm_plank");
	public static final Block PM_LEAVES = new BlockLeaf("pm_leaves");
	public static final Block RM_LEAVES = new BlockLeaf("rm_leaves");
	public static final Block PM_SAPLING = new BlockSaplings("pm_sapling");
	public static final Block RM_SAPLING = new BlockSaplings("rm_sapling");
	
	//Ores
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
	public static final Block ORE_MERC = new BlockOres("ore_merc", "mercury");
	public static final Block ORE_SPIRE = new BlockOres("ore_spire", "spire");
	
	//Ore Blocks
	public static final Block SA_BLOCK = new BlockOreBlock("sa_block", Material.IRON);
	public static final Block PLASMA_BLOCK = new PlasmaBlock("plasma_block", Material.IRON);
	public static final Block PER_BLOCK = new BlockOreBlock("per_block", Material.IRON);
	public static final Block SP_BLOCK = new BlockOreBlock("sp_block", Material.IRON);
	public static final Block RUBE_BLOCK = new BlockOreBlock("rube_block", Material.IRON);
	public static final Block AQ_BLOCK = new BlockOreBlock("aq_block", Material.IRON);
	public static final Block AM_BLOCK = new BlockOreBlock("am_block", Material.IRON);
	public static final Block SPIRE_BLOCK = new BlockOreBlock("spire_block", Material.IRON);
	
	//Other
	public static final Block PLASMA_LAMP = new PlasmaLamp("plasma_lamp", Material.GLASS);
	public static final Block RUST_PLASMA = new Rust_Plasma("rust_plasma", Material.GLASS);
	public static final Block SPIRE_LINK = new Spire_Link("spire_link", Material.IRON);
	
	
	public static void init() {}
	public static void register() {}
	
}
