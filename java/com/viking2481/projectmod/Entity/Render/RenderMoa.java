package com.viking2481.projectmod.Entity.Render;

import com.viking2481.projectmod.Entity.EntityMoa;
import com.viking2481.projectmod.Entity.Model.ModelMoa;
import com.viking2481.projectmod.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMoa extends RenderLiving<EntityMoa>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/moa.png");
	
	public RenderMoa(RenderManager manager)
	{
		super(manager, new ModelMoa(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityMoa entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityMoa entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}