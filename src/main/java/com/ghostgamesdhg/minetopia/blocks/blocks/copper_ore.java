package com.ghostgamesdhg.minetopia.blocks.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class copper_ore extends OreBlock {
    public copper_ore() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(4.0f, 2.0f)
                .sound(SoundType.STONE)
                .setRequiresTool()
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE));
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return 1;
    }
}
