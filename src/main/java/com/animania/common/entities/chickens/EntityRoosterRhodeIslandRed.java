package com.animania.common.entities.chickens;

import com.animania.common.handler.ItemHandler;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityRoosterRhodeIslandRed extends EntityRoosterBase
{

	public EntityRoosterRhodeIslandRed(World worldIn)
	{
		super(worldIn);
		this.type = ChickenType.RHODE_ISLAND_RED;
		this.resourceLocation = new ResourceLocation("animania:textures/entity/chickens/rooster_red.png");
		this.resourceLocationBlink = new ResourceLocation("animania:textures/entity/chickens/rooster_red_blink.png");
		this.oldDropRaw = ItemHandler.rawRhodeIslandRedChicken;
		this.oldDropCooked = ItemHandler.cookedRhodeIslandRedChicken;
		this.dropRaw = ItemHandler.rawPrimeChicken;
		this.dropCooked = ItemHandler.cookedPrimeChicken;
	}
	
	@Override
	public int getPrimaryEggColor()
	{
		return 13668724;
	}
	
	@Override
	public int getSecondaryEggColor()
	{
		return 12480342;
	}
}