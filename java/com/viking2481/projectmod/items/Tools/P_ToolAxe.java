package com.viking2481.projectmod.items.Tools;

import java.util.Set;

import com.google.common.collect.Sets;
import com.viking2481.projectmod.Main;
import com.viking2481.projectmod.init.ModBlocks;
import com.viking2481.projectmod.init.ModItems;
import com.viking2481.projectmod.util.IHasModel;
import com.viking2481.projectmod.util.handlers.SoundsHandler;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemTool;
import net.minecraft.util.DamageSource;
import net.minecraftforge.client.event.sound.SoundEvent;

public class P_ToolAxe extends ItemTool implements IHasModel
{

	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE, ModBlocks.SA_LOG, ModBlocks.SA_PLANK, ModBlocks.P_LOG, ModBlocks.P_PLANK, ModBlocks.SP_LOG, ModBlocks.SP_PLANK, ModBlocks.M_LOG, ModBlocks.M_PLANK);
	
	
	public P_ToolAxe(String name, ToolMaterial material)
	{
		super(material, EFFECTIVE_ON);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.projecttools);
		
		ModItems.ITEMS.add(this);
	}
	
	protected net.minecraft.util.SoundEvent getItemUseAction()
    {
       return SoundsHandler.ITEM_TOOL_SWING;
    }

    protected net.minecraft.util.SoundEvent getAmbiemtSound()
    {
        return SoundsHandler.ITEM_TOOL_IDLE;
    }

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
