package com.viking2481.projectmod.init;

import com.viking2481.projectmod.Main;
import com.viking2481.projectmod.Entity.EntityMoa;
import com.viking2481.projectmod.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntity
{
	public static void registerEntities()
	{
		registerEntity("moa", EntityMoa.class, Reference.ENTITY_MOA, 50, 5398119, 13457558);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}