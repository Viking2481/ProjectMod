package com.viking2481.projectmod.blocks.metadata;

import com.viking2481.projectmod.Main;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PlasmaLamp extends BlockBase
{

	public PlasmaLamp(String name, Material material)
	{
		super(name, material);
		setSoundType(SoundType.GLASS);
		setHardness(5.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe",2);
		setCreativeTab(Main.projectdecor);
		setLightLevel(1.0F);
	}
	
}
