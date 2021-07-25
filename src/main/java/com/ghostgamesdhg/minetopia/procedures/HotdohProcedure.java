package com.ghostgamesdhg.minetopia.procedures;

import com.ghostgamesdhg.minetopia.GMMElements;
import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.Map;

@GMMElements.ModElement.Tag
public class HotdohProcedure extends GMMElements.ModElement {
	public HotdohProcedure(GMMElements instance) {
		super(instance, 16);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MinetopiaExtra.LOGGER.warn("Failed to load dependency entity for procedure Hotdoh!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(Items.IRON_INGOT, (int) (1))) : false)) {
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(Items.IRON_INGOT, (int) (1));
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"give @s gmm:hotdog 10");
				}
			}
		}
	}
}