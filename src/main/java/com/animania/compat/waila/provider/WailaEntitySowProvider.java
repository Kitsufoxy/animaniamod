package com.animania.compat.waila.provider;

import java.util.List;

import com.animania.common.entities.pigs.EntitySowBase;

import mcp.mobius.waila.api.IWailaConfigHandler;
import mcp.mobius.waila.api.IWailaEntityAccessor;
import net.minecraft.entity.Entity;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.translation.I18n;

public class WailaEntitySowProvider extends WailaEntityAnimalProviderMateable
{

	@Override
	public List<String> getWailaBody(Entity entity, List<String> currenttip, IWailaEntityAccessor accessor, IWailaConfigHandler config)
	{
		
		EntitySowBase thisEntity = (EntitySowBase)entity;
		boolean played = thisEntity.getPlayed();

		if (played)
			currenttip.add(I18n.translateToLocal("text.waila.played"));
		else
			currenttip.add(I18n.translateToLocal("text.waila.bored"));
		
		currenttip = super.getWailaBody(entity, currenttip, accessor, config);
		if (accessor.getPlayer().isSneaking())
		{

			if (thisEntity.getHasKids())
				currenttip.add(I18n.translateToLocal("text.waila.milkable"));

			if (thisEntity.getFertile() && !thisEntity.getPregnant())
			{
				currenttip.add(I18n.translateToLocal("text.waila.fertile1"));
			} 

			if (thisEntity.getPregnant())
			{
				if (thisEntity.getGestation() > 0) {
					int bob = thisEntity.getGestation();
					currenttip.add(I18n.translateToLocal("text.waila.pregnant1") + " (" + bob + " " + I18n.translateToLocal("text.waila.pregnant2") + ")" );
				} else {
					currenttip.add(I18n.translateToLocal("text.waila.pregnant1"));
				}
			} 


		}
		return currenttip;
	}


}
