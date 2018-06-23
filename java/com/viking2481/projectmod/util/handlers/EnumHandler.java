package com.viking2481.projectmod.util.handlers;

import net.minecraft.util.IStringSerializable;

public class EnumHandler
{
	public static enum EnumType implements IStringSerializable
	{
		PLASMA(0, "plasma"),
		SA(1, "sa"),
		SPIRE(2, "spire"),
		SP(4, "sp"),
		PER(5, "per"),
		RUBE(6, "rube"),
		AQ(7, "aq"),
		AM(8, "am");
		
		
		private static final EnumType[] META_LOOKUP = new EnumType[values().length];
		private final int meta;
		private final String name, unlocalizedName;

		private EnumType(int meta, String name)
		{
			this(meta, name, name);
		}
		
		private EnumType(int meta, String name, String unlocalizedName) 
		{
			this.meta = meta;
			this.name = name;
			this.unlocalizedName = unlocalizedName;
		}
		
		@Override
		public String getName()
		{
			return this.name;
		}
		
		public int getMeta()
		{
			return this.meta;
		}
		
		public String getUnlocalizedName()
		{
			return this.unlocalizedName;
		}
		
		public static EnumType byMetadata(int meta)
		{
			return META_LOOKUP[meta];
		}
		
		static
		{
			for(EnumType enumtype : values())
			{
				META_LOOKUP[enumtype.getMeta()] = enumtype;
			}
		}
	}
}
