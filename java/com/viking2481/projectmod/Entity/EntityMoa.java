package com.viking2481.projectmod.Entity;

import java.util.Set;

import com.google.common.collect.Sets;
import com.viking2481.projectmod.init.ModItems;
import com.viking2481.projectmod.util.handlers.LootTableHandler;
import com.viking2481.projectmod.util.handlers.SoundsHandler;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class EntityMoa extends EntityChicken
{
	public EntityMoa(World worldIn)
	{
		super(worldIn);
		this.setSize(0.7F, 2.0F);
	}
	
	 private static final Set<Item> TEMPTATION_ITEMS = Sets.newHashSet(ModItems.SA_N, ModItems.SA_U, ModItems.MOA_S, ModItems.MOA_B);
	 public float wingRotation;
	   public float destPos;
	   public float oFlapSpeed;
	   public float oFlap;
	   public float wingRotDelta = 1.0F;
	   public int timeUntilNextEgg;
	
	@Override
	protected void initEntityAI()
	{
		this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 1.8D));
        this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(3, new EntityAITempt(this, 1.0D, false, TEMPTATION_ITEMS));
        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.1D));
        this.tasks.addTask(5, new EntityAIWanderAvoidWater(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
	}
	
	public boolean isBreedingItem(ItemStack stack)
    {
        return TEMPTATION_ITEMS.contains(stack.getItem());
    }
	
	@Override
	protected void applyEntityAttributes() 
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30D);
	}
	
	@Override
	public float getEyeHeight()
	{
		return 2.0F;
	}
	
	@Override
	public EntityChicken createChild(EntityAgeable ageable) 
	{
		return new EntityMoa(world);
	}
	
	protected SoundEvent getAmbientSound()
    {
       return SoundsHandler.ENTITY_MOA_AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return SoundsHandler.ENTITY_MOA_HURT;
    }

    protected SoundEvent getDeathSound()
    {
        return SoundsHandler.ENTITY_MOA_DEATH;
    }
    
    protected SoundEvent getStepSound()
    {
        return SoundEvents.ENTITY_PARROT_STEP;
    }
    
    @Override
    protected ResourceLocation getLootTable()
    {
    	return LootTableHandler.MOA;
    }
    
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
        this.oFlap = this.wingRotation;
        this.oFlapSpeed = this.destPos;
        this.destPos = (float)((double)this.destPos + (double)(this.onGround ? -1 : 4) * 0.3D);
        this.destPos = MathHelper.clamp(this.destPos, 0.0F, 1.0F);

        if (!this.onGround && this.wingRotDelta < 1.0F)
        {
            this.wingRotDelta = 1.0F;
        }

        this.wingRotDelta = (float)((double)this.wingRotDelta * 0.9D);

        if (!this.onGround && this.motionY < 0.0D)
        {
            this.motionY *= 0.6D;
        }
}
}