package com.ghostgamesdhg.minetopia.blocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import javax.annotation.Nullable;

public class kerst_slingers extends Block {

    private static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    public kerst_slingers() {
        super(Properties.create(Material.LEAVES)
                .hardnessAndResistance(3.5f, 4.0f)
                .sound(SoundType.PLANT));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
        Vector3d offset = state.getOffset(world, pos);
        switch ((Direction) state.get(FACING)) {
            case NORTH :
            default :
                return VoxelShapes.or(
                        makeCuboidShape(-0.93015, 7.37849, 12, 5.06985, 11.37849, 16),
                        makeCuboidShape(10.93015, 7.37849, 12, 16.93015, 11.37849, 16),
                        makeCuboidShape(4, 6, 12, 12, 10, 16)
                ).withOffset(offset.x, offset.y, offset.z);
            case EAST :
                return VoxelShapes.or(
                        makeCuboidShape(-0.93015, 7.37849, -1, 3.06985, 11.37849, 5),
                        makeCuboidShape(-0.93015, 7.37849, 10.8603, 3.06985, 11.37849, 16.8603),
                        makeCuboidShape(-0.93015, 6, 3.93015, 3.06985, 10, 11.93015)
                ).withOffset(offset.x, offset.y, offset.z);
            case SOUTH:
                return VoxelShapes.or(
                        makeCuboidShape(11.06985, 7.37849, -1, 17.06985, 11.37849, 3),
                        makeCuboidShape(-0.79045, 7.37849, -1, 5.20955, 11.37849, 3),
                        makeCuboidShape(4.1397, 6, -1, 12.1397, 10, 3)
                ).withOffset(offset.x, offset.y, offset.z);
            case WEST :
                return VoxelShapes.or(
                        makeCuboidShape(13.06985, 7.37849, 11, 17.06985, 11.37849, 17),
                        makeCuboidShape(13.06985, 7.37849, -0.8603, 17.06985, 11.37849, 5.1397),
                        makeCuboidShape(13.06985, 6, 4.06985, 17.06985, 10, 12.06985)
                ).withOffset(offset.x, offset.y, offset.z);
        }
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this .getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
