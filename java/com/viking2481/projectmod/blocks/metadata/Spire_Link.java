package com.viking2481.projectmod.blocks.metadata;

import com.viking2481.projectmod.Main;
import com.viking2481.projectmod.init.ModBlocks;
import com.viking2481.projectmod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class Spire_Link extends BlockBase
{
	public static final AxisAlignedBB SPIRE_LINK_AABB = new AxisAlignedBB(0.25D, 0.5, 0.25D, 0.75D, 0.5D, 0.75D);
	
	public Spire_Link(String name, Material material)
	{
		super(name, material);
		setSoundType(SoundType.GLASS);
		setHardness(5.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe",2);
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) 
	{
		return false;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) 
	{
		return SPIRE_LINK_AABB;
	}
}
