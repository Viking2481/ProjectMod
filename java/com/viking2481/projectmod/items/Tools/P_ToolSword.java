package com.viking2481.projectmod.items.Tools;

import com.viking2481.projectmod.Main;
import com.viking2481.projectmod.init.ModItems;
import com.viking2481.projectmod.util.IHasModel;
import com.viking2481.projectmod.util.handlers.SoundsHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class P_ToolSword extends ItemSword implements IHasModel{

	public P_ToolSword(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.projectcombat);
		
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
