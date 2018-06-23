package com.viking2481.projectmod.tabs;

import com.viking2481.projectmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ProjectItems extends CreativeTabs{

	public ProjectItems(String label) {
		super("projectitems");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.SA_GEM);
	}

}
