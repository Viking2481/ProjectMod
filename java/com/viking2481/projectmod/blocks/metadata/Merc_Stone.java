package com.viking2481.projectmod.blocks.metadata;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Merc_Stone extends BlockBase
{

	public Merc_Stone(String name, Material material)
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe",0);
	}
	
}
