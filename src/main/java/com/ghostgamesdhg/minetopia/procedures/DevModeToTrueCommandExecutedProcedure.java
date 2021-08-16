package com.ghostgamesdhg.minetopia.procedures;

import com.ghostgamesdhg.minetopia.GMMElements;
import com.ghostgamesdhg.minetopia.GmmModVariables;
import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.Util;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.IWorld;
import net.minecraftforge.fml.server.ServerLifecycleHooks;

import java.util.Map;

@GMMElements.ModElement.Tag
public class DevModeToTrueCommandExecutedProcedure extends GMMElements.ModElement {
	public DevModeToTrueCommandExecutedProcedure(GMMElements instance) {
		super(instance, 13);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MinetopiaExtra.LOGGER.warn("Failed to load dependency world for procedure DevModeToTrueCommandExecuted!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		GmmModVariables.MapVariables.get(world).devmode = (boolean) (true);
		GmmModVariables.MapVariables.get(world).syncData(world);
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent("DevMode is set to True!"), ChatType.SYSTEM, Util.DUMMY_UUID);
		}
	}
}