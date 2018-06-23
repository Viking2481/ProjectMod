package com.viking2481.projectmod.tabs;

import com.viking2481.projectmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ProjectTools extends CreativeTabs{

	public ProjectTools(String label) {
		super("projecttools");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.P_AXE);
	}

}
