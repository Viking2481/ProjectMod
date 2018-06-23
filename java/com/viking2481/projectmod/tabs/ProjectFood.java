package com.viking2481.projectmod.tabs;

import com.viking2481.projectmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ProjectFood extends CreativeTabs{

	public ProjectFood(String label) {
		super("projectfood");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.SA_N);
	}

}
