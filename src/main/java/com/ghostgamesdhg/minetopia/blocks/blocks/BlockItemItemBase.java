package com.ghostgamesdhg.minetopia.blocks.blocks;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class BlockItemItemBase extends BlockItem {
    public BlockItemItemBase(Block block) {
        super(block, new Properties().group(MinetopiaExtra.TAB));
    }
}
