package com.viking2481.projectmod.tabs;

import com.viking2481.projectmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ProjectCombat extends CreativeTabs{

	public ProjectCombat(String label) {
		super("projectcombat");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.P_SWORD);
	}

}
