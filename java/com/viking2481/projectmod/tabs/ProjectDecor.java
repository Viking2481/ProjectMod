package com.viking2481.projectmod.tabs;

import com.viking2481.projectmod.blocks.metadata.BlockLeaf;
import com.viking2481.projectmod.init.ModBlocks;
import com.viking2481.projectmod.util.handlers.EnumHandler;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ProjectDecor extends CreativeTabs{

	public ProjectDecor(String label) {
		super("projectdecor");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModBlocks.PM_LEAVES);
	}

}
