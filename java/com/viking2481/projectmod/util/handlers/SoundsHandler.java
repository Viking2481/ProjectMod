package com.viking2481.projectmod.util.handlers;

import com.viking2481.projectmod.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler 
{
	public static SoundEvent ENTITY_MOA_AMBIENT, ENTITY_MOA_HURT, ENTITY_MOA_DEATH, ITEM_TOOL_EQUIP, ITEM_TOOL_SWING, ITEM_TOOL_IDLE;
	
	public static void registerSounds()
	{
		ENTITY_MOA_AMBIENT = registerSound("entity.moa.ambient");
		ENTITY_MOA_HURT = registerSound("entity.moa.hurt");
		ENTITY_MOA_DEATH = registerSound("entity.moa.death");
		
		ITEM_TOOL_EQUIP = registerSound("item.tool.equip");
		ITEM_TOOL_IDLE = registerSound("item.tool.idle");
		ITEM_TOOL_SWING = registerSound("item.tool.swing");
	}
	
	private static SoundEvent registerSound(String name)
	{
		ResourceLocation location = new ResourceLocation(Reference.MOD_ID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
}