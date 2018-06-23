package com.viking2481.projectmod.blocks.metadata;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Merc_Cobble extends BlockBase
{

	public Merc_Cobble(String name, Material material)
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(2.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe",0);
	}
	
}
