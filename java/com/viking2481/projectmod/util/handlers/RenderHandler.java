package com.viking2481.projectmod.util.handlers;


import com.viking2481.projectmod.Entity.EntityMoa;
import com.viking2481.projectmod.Entity.Render.RenderMoa;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityMoa.class, new IRenderFactory<EntityMoa>()
		{
			@Override
			public Render<? super EntityMoa> createRenderFor(RenderManager manager) 
			{
				return new RenderMoa(manager);
			}
		});
	}
}