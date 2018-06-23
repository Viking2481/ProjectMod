package com.viking2481.projectmod.tabs;

import com.viking2481.projectmod.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ProjectBlocks extends CreativeTabs{

	public ProjectBlocks(String label) {
		super("projectblocks");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModBlocks.SA_LOG);
	}

}
