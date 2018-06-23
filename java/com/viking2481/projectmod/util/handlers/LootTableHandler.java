package com.viking2481.projectmod.util.handlers;

import com.viking2481.projectmod.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class LootTableHandler 
{
	public static final ResourceLocation MOA = LootTableList.register(new ResourceLocation(Reference.MOD_ID, "moa"));
}