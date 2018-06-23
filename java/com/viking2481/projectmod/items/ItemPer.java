package com.viking2481.projectmod.items;

import com.viking2481.projectmod.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemPer extends Item
{
    public ItemPer(String string)
    {
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        setCreativeTab(Main.projectblocks);
    }
    public String getUnlocalizedName(ItemStack stack)
    {
        return stack.getMetadata() == 1 ? "item.charcoal" : "item.coal";
    }
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
    {
        if (this.isInCreativeTab(tab))
        {
            items.add(new ItemStack(this, 1, 0));
            items.add(new ItemStack(this, 1, 1));
        }
    }
}