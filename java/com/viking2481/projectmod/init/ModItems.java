package com.viking2481.projectmod.init;

import java.util.ArrayList;
import java.util.List;

import com.viking2481.projectmod.items.ArmourBase;
import com.viking2481.projectmod.items.ItemBase;
import com.viking2481.projectmod.items.ItemPer;
import com.viking2481.projectmod.items.Tools.ToolAxe;
import com.viking2481.projectmod.items.Tools.ToolHoe;
import com.viking2481.projectmod.items.Tools.ToolPickaxe;
import com.viking2481.projectmod.items.Tools.ToolShovel;
import com.viking2481.projectmod.items.Tools.ToolSword;
import com.viking2481.projectmod.items.food.FoodBase;
import com.viking2481.projectmod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Material
	public static final ToolMaterial TOOL_SA = EnumHelper.addToolMaterial("tool_sa", 2, 100, 7.0F, 2.7F, 14);
	public static final ToolMaterial TOOL_PLASMA = EnumHelper.addToolMaterial("tool_plasma", 3, 2000, 8.5F, 3.5F, 10);
	public static final ToolMaterial TOOL_SP = EnumHelper.addToolMaterial("tool_sp", 4, 1700, 10.0F, 4.0F, 11);
	public static final ToolMaterial TOOL_RUBE = EnumHelper.addToolMaterial("tool_rube", 5, 1900, 11.5F, 4.5F, 12);
	public static final ToolMaterial TOOL_AQ = EnumHelper.addToolMaterial("tool_aq", 6, 2150, 13.0F, 5.0F, 13);
	public static final ToolMaterial TOOL_AM = EnumHelper.addToolMaterial("tool_am", 7, 3000, 14.5F, 5.5F, 14);
	public static final ToolMaterial TOOL_SPIRE = EnumHelper.addToolMaterial("tool_spire", 8, 5000, 16.0F, 6.0F, 15);
	
	public static final ArmorMaterial ARMOUR_SA = EnumHelper.addArmorMaterial("armour_sa", Reference.MOD_ID + ":sa", 33, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOUR_PLASMA = EnumHelper.addArmorMaterial("armour_plasma", Reference.MOD_ID + ":plasma", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ArmorMaterial ARMOUR_SP = EnumHelper.addArmorMaterial("armour_sp", Reference.MOD_ID + ":sp", 33, new int[]{4, 7, 9, 4}, 11, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial ARMOUR_RUBE = EnumHelper.addArmorMaterial("armour_rube", Reference.MOD_ID + ":rube", 33, new int[]{5, 8, 10, 5}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 6.0F);
	public static final ArmorMaterial ARMOUR_AQ = EnumHelper.addArmorMaterial("armour_aq", Reference.MOD_ID + ":aq", 33, new int[]{6, 9, 11, 6}, 13, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 8.0F);
	public static final ArmorMaterial ARMOUR_AM = EnumHelper.addArmorMaterial("armour_am", Reference.MOD_ID + ":am", 33, new int[]{7, 10, 12, 7}, 14, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 10.0F);
	public static final ArmorMaterial ARMOUR_SPIRE = EnumHelper.addArmorMaterial("armour_spire", Reference.MOD_ID + ":spire", 33, new int[]{8, 11, 13, 8}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 12.0F);
	
	//Items
	public static final Item SA_GEM = new ItemBase("sa_gem");
	public static final Item PLASMACORE = new ItemBase("plasmacore");
	public static final Item PER = new ItemPer("per");
	public static final Item SP_INGOT = new ItemBase("sp_ingot");
	public static final Item RUBE = new ItemBase("rube");
	public static final Item AQ_INGOT = new ItemBase("aq_ingot");
	public static final Item AM = new ItemBase("am");
	public static final Item SPIRE_GEM = new ItemBase("spire_gem");
	public static final Item IRON_RODE = new ItemBase("iron_rode");
	
	//Food
	public static final Item SA_N = new FoodBase("sa_n", 8, false);
	public static final Item SA_U = new FoodBase("sa_u", 20, false);
	public static final Item MOA_B = new FoodBase("moa_b", 3, false);
	public static final Item MOA_S = new FoodBase("moa_s", 8, false);
	public static final Item SP_RAW = new FoodBase("sp_raw", 2, false);
	public static final Item SP_BAKED = new FoodBase("sp_baked", 5, false);
	
	//Tools
	public static final Item SA_SHOVEL = new ToolShovel("sa_shovel", TOOL_SA);
	public static final Item SA_PICKAXE = new ToolPickaxe("sa_pickaxe", TOOL_SA);
	public static final Item SA_AXE = new ToolAxe("sa_axe", TOOL_SA);
	
	public static final Item P_SHOVEL = new ToolShovel("p_shovel", TOOL_PLASMA);
	public static final Item P_PICKAXE = new ToolPickaxe("p_pickaxe", TOOL_PLASMA);
	public static final Item P_AXE = new ToolAxe("p_axe", TOOL_PLASMA);
	
	public static final Item SP_SHOVEL = new ToolShovel("sp_shovel", TOOL_SP);
	public static final Item SP_PICKAXE = new ToolPickaxe("sp_pickaxe", TOOL_SP);
	public static final Item SP_AXE = new ToolAxe("sp_axe", TOOL_SP);
	
	public static final Item RUBE_SHOVEL = new ToolShovel("rube_shovel", TOOL_RUBE);
	public static final Item RUBE_PICKAXE = new ToolPickaxe("rube_pickaxe", TOOL_RUBE);
	public static final Item RUBE_AXE = new ToolAxe("rube_axe", TOOL_RUBE);
	
	public static final Item AQ_SHOVEL = new ToolShovel("aq_shovel", TOOL_AQ);
	public static final Item AQ_PICKAXE = new ToolPickaxe("aq_pickaxe", TOOL_AQ);
	public static final Item AQ_AXE = new ToolAxe("aq_axe", TOOL_AQ);
	
	public static final Item AM_SHOVEL = new ToolShovel("am_shovel", TOOL_AM);
	public static final Item AM_PICKAXE = new ToolPickaxe("am_pickaxe", TOOL_AM);
	public static final Item AM_AXE = new ToolAxe("am_axe", TOOL_AM);
	
	public static final Item SPIRE_SHOVEL = new ToolShovel("spire_shovel", TOOL_SPIRE);
	public static final Item SPIRE_PICKAXE = new ToolPickaxe("spire_pickaxe", TOOL_SPIRE);
	public static final Item SPIRE_AXE = new ToolAxe("spire_axe", TOOL_SPIRE);
	
	public static final Item SA_SWORD = new ToolSword("sa_sword", TOOL_SA);
	public static final Item P_SWORD = new ToolSword("p_sword", TOOL_PLASMA);
	public static final Item SP_SWORD = new ToolSword("sp_sword", TOOL_SP);
	public static final Item RUBE_SWORD = new ToolSword("rube_sword", TOOL_RUBE);
	public static final Item AQ_SWORD = new ToolSword("aq_sword", TOOL_AQ);
	public static final Item AM_SWORD = new ToolSword("am_sword", TOOL_AM);
	public static final Item SPIRE_SWORD = new ToolSword("spire_sword", TOOL_SPIRE);
	
	public static final Item SA_HOE = new ToolHoe("sa_hoe", TOOL_SA);
	public static final Item P_HOE = new ToolHoe("p_hoe", TOOL_PLASMA);
	public static final Item SP_HOE = new ToolHoe("sp_hoe", TOOL_SP);
	public static final Item RUBE_HOE = new ToolHoe("rube_hoe", TOOL_RUBE);
	public static final Item AQ_HOE = new ToolHoe("aq_hoe", TOOL_AQ);
	public static final Item AM_HOE = new ToolHoe("am_hoe", TOOL_AM);
	public static final Item SPIRE_HOE = new ToolHoe("spire_hoe", TOOL_SPIRE);
	
	//Armour
	public static final Item SA_HELMET = new ArmourBase("sa_helmet", ARMOUR_SA, 1, EntityEquipmentSlot.HEAD);
	public static final Item SA_CHEST = new ArmourBase("sa_chest", ARMOUR_SA, 1, EntityEquipmentSlot.CHEST);
	public static final Item SA_PANTS = new ArmourBase("sa_pants", ARMOUR_SA, 2, EntityEquipmentSlot.LEGS);
	public static final Item SA_BOOTS = new ArmourBase("sa_boots", ARMOUR_SA, 1, EntityEquipmentSlot.FEET);
	
	public static final Item PLASMA_HELMET = new ArmourBase("plasma_helmet", ARMOUR_PLASMA, 1, EntityEquipmentSlot.HEAD);
	public static final Item PLASMA_CHEST = new ArmourBase("plasma_chest", ARMOUR_PLASMA, 1, EntityEquipmentSlot.CHEST);
	public static final Item PLASMA_PANTS = new ArmourBase("plasma_pants", ARMOUR_PLASMA, 2, EntityEquipmentSlot.LEGS);
	public static final Item PLASMA_BOOTS = new ArmourBase("plasma_boots", ARMOUR_PLASMA, 1, EntityEquipmentSlot.FEET);
	
	public static final Item SP_HELMET = new ArmourBase("sp_helmet", ARMOUR_SP, 1, EntityEquipmentSlot.HEAD);
	public static final Item SP_CHEST = new ArmourBase("sp_chest", ARMOUR_SP, 1, EntityEquipmentSlot.CHEST);
	public static final Item SP_PANTS = new ArmourBase("sp_pants", ARMOUR_SP, 2, EntityEquipmentSlot.LEGS);
	public static final Item SP_BOOTS = new ArmourBase("sp_boots", ARMOUR_SP, 1, EntityEquipmentSlot.FEET);
	
	public static final Item RUBE_HELMET = new ArmourBase("rube_helmet", ARMOUR_RUBE, 1, EntityEquipmentSlot.HEAD);
	public static final Item RUBE_CHEST = new ArmourBase("rube_chest", ARMOUR_RUBE, 1, EntityEquipmentSlot.CHEST);
	public static final Item RUBE_PANTS = new ArmourBase("rube_pants", ARMOUR_RUBE, 2, EntityEquipmentSlot.LEGS);
	public static final Item RUBE_BOOTS = new ArmourBase("rube_boots", ARMOUR_RUBE, 1, EntityEquipmentSlot.FEET);
	
	public static final Item AQ_HELMET = new ArmourBase("aq_helmet", ARMOUR_AQ, 1, EntityEquipmentSlot.HEAD);
	public static final Item AQ_CHEST = new ArmourBase("aq_chest", ARMOUR_AQ, 1, EntityEquipmentSlot.CHEST);
	public static final Item AQ_PANTS = new ArmourBase("aq_pants", ARMOUR_AQ, 2, EntityEquipmentSlot.LEGS);
	public static final Item AQ_BOOTS = new ArmourBase("aq_boots", ARMOUR_AQ, 1, EntityEquipmentSlot.FEET);
	
	public static final Item AM_HELMET = new ArmourBase("am_helmet", ARMOUR_AM, 1, EntityEquipmentSlot.HEAD);
	public static final Item AM_CHEST = new ArmourBase("am_chest", ARMOUR_AM, 1, EntityEquipmentSlot.CHEST);
	public static final Item AM_PANTS = new ArmourBase("am_pants", ARMOUR_AM, 2, EntityEquipmentSlot.LEGS);
	public static final Item AM_BOOTS = new ArmourBase("am_boots", ARMOUR_AM, 1, EntityEquipmentSlot.FEET);
	
	public static final Item SPIRE_HELMET = new ArmourBase("spire_helmet", ARMOUR_SPIRE, 1, EntityEquipmentSlot.HEAD);
	public static final Item SPIRE_CHEST = new ArmourBase("spire_chest", ARMOUR_SPIRE, 1, EntityEquipmentSlot.CHEST);
	public static final Item SPIRE_PANTS = new ArmourBase("spire_pants", ARMOUR_SPIRE, 2, EntityEquipmentSlot.LEGS);
	public static final Item SPIRE_BOOTS = new ArmourBase("spire_boots", ARMOUR_SPIRE, 1, EntityEquipmentSlot.FEET);
	
	
	
	public static void init() {}
	public static void register() {}
	
}
