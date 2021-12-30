package com.ghostgamesdhg.minetopia.blocks.crops;

import com.ghostgamesdhg.minetopia.init.ModFood;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class StrawberryBlock extends CropsBlock {
    private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), //0 (GrowStage)
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D), //1
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), //2
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D), //3
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D)}; //4


    public StrawberryBlock(Properties builder) {
        super(builder);
    }

    @Override
    public int getMaxAge() {
        return 4;
    }

    @Override
    protected IItemProvider getSeedsItem() {
        return ModFood.STRAWBERRY_SEEDS.get();
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE_BY_AGE[state.get(this.getAgeProperty())];
    }
}
