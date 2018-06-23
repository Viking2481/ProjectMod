package com.viking2481.projectmod.blocks.metadata;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Rust_Plasma extends BlockOreBlock
{
	public Rust_Plasma(String name, Material material)
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(40.0F);
		setResistance(4000.0F);
		setHarvestLevel("pickaxe",2);
	}
	
}

