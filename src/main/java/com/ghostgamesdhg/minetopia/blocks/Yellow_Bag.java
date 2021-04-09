package com.ghostgamesdhg.minetopia.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public class Yellow_Bag extends Block {

    private static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(-0.10997161290320534, -0.02273, 3.9168416129032266, 16.090028387096798, 0.87727, 11.949211612903227),
            Block.makeCuboidShape(-0.008971612903204473, 4.77375, 12.774581612903226, 15.988028387096797, 6.77375, 13.774581612903226),
            Block.makeCuboidShape(-0.008971612903204473, 5.88478, 3.4601016129032267, 15.988028387096797, 7.88478, 4.460101612903227),
            Block.makeCuboidShape(0.9900283870967961, 6.38478, 3.160101612903226, 14.990028387096796, 8.08478, 3.4601016129032267),
            Block.makeCuboidShape(0.9900283870967961, 6.38478, 12.318621612903227, 14.990028387096796, 8.08478, 12.618621612903226),
            Block.makeCuboidShape(0.9900283870967961, 6.56568, 12.056361612903228, 14.990028387096796, 7.06568, 12.756361612903227),
            Block.makeCuboidShape(-0.009971612903203919, 0.18478, 11.360101612903227, 15.990028387096796, 2.18478, 12.360101612903227),
            Block.makeCuboidShape(-0.10997161290320534, 0.08478, 12.060101612903226, 16.090028387096798, 0.93478, 12.510101612903227),
            Block.makeCuboidShape(-0.10997161290320534, -0.08388, 3.6580216129032266, 16.090028387096798, 0.76612, 4.108021612903226),
            Block.makeCuboidShape(-0.009971612903203919, 0.18478, 3.4601016129032267, 15.990028387096796, 2.18478, 4.460101612903227),
            Block.makeCuboidShape(12.490028387096796, 0.88478, 3.360101612903227, 13.990028387096796, 2.18478, 4.460101612903227),
            Block.makeCuboidShape(12.490028387096796, 0.88478, 11.318621612903227, 13.990028387096796, 2.18478, 12.418621612903227),
            Block.makeCuboidShape(12.490028387096796, 1.87905, 3.023091612903226, 13.990028387096796, 6.19896, 4.123091612903227),
            Block.makeCuboidShape(12.490028387096796, 1.87905, 11.655631612903226, 13.990028387096796, 6.19896, 12.755631612903226),
            Block.makeCuboidShape(12.490028387096796, 5.939, 3.2299716129032277, 13.990028387096796, 7.939, 4.3299716129032255),
            Block.makeCuboidShape(12.490028387096796, 5.939, 11.448751612903227, 13.990028387096796, 7.939, 12.548751612903226),
            Block.makeCuboidShape(12.490028387096796, 6.339, 2.929971612903227, 13.990028387096796, 8.139, 4.3299716129032255),
            Block.makeCuboidShape(12.740028387096796, 5.339, 2.929971612903227, 13.740028387096796, 6.389, 3.0799716129032273),
            Block.makeCuboidShape(2.290028387096797, 5.339, 2.929971612903227, 3.290028387096797, 6.389, 3.0799716129032273),
            Block.makeCuboidShape(12.790028387096797, 6.939, 2.929971612903227, 13.690028387096795, 7.339, 3.1299716129032262),
            Block.makeCuboidShape(2.3400283870967957, 6.939, 2.929971612903227, 3.240028387096796, 7.339, 3.1299716129032262),
            Block.makeCuboidShape(2.3400283870967957, 7.139, 2.8299716129032273, 3.240028387096796, 7.339, 2.929971612903227),
            Block.makeCuboidShape(12.740028387096796, 7.139, 2.8299716129032273, 13.740028387096796, 7.339, 2.929971612903227),
            Block.makeCuboidShape(12.790028387096797, 6.439, 2.7299716129032277, 13.690028387096795, 6.639, 2.929971612903227),
            Block.makeCuboidShape(2.3400283870967957, 6.439, 2.7299716129032277, 3.240028387096796, 6.639, 2.929971612903227),
            Block.makeCuboidShape(12.790028387096797, 5.939, 2.8299716129032273, 13.690028387096795, 6.139, 3.1299716129032262),
            Block.makeCuboidShape(2.3400283870967957, 5.939, 2.8299716129032273, 3.240028387096796, 6.139, 3.1299716129032262),
            Block.makeCuboidShape(13.690028387096795, 5.939, 2.8299716129032273, 13.790028387096797, 7.339, 3.1299716129032262),
            Block.makeCuboidShape(3.240028387096796, 5.939, 2.8299716129032273, 3.3400283870967957, 7.339, 3.1299716129032262),
            Block.makeCuboidShape(12.690028387096795, 5.939, 2.8299716129032273, 12.790028387096797, 7.339, 3.1299716129032262),
            Block.makeCuboidShape(2.240028387096796, 5.939, 2.8299716129032273, 2.3400283870967957, 7.339, 3.1299716129032262),
            Block.makeCuboidShape(12.490028387096796, 6.339, 11.448751612903227, 13.990028387096796, 8.139, 12.848751612903227),
            Block.makeCuboidShape(12.490028387096796, 8.54693, 3.9901316129032267, 13.990028387096796, 8.74693, 7.090131612903226),
            Block.makeCuboidShape(12.490028387096796, 8.75, 8.711041612903227, 13.990028387096796, 8.95, 11.811041612903226),
            Block.makeCuboidShape(12.490028387096796, 9.33555, 6.654791612903226, 13.990028387096796, 9.53555, 8.867301612903226),
            Block.makeCuboidShape(4.490028387096796, 9.33555, 7.104791612903227, 11.490028387096796, 9.53555, 8.417301612903227),
            Block.makeCuboidShape(5.740028387096796, 9.23555, 7.004791612903226, 10.240028387096796, 9.63555, 8.517301612903227),
            Block.makeCuboidShape(3.207088387096796, 9.33555, 8.000311612903227, 4.707088387096796, 9.53555, 8.612821612903227),
            Block.makeCuboidShape(11.607088387096798, 9.33555, 6.800311612903226, 13.107088387096798, 9.53555, 7.412821612903226),
            Block.makeCuboidShape(3.207088387096796, 9.33555, 6.900311612903227, 4.707088387096796, 9.53555, 7.5128216129032275),
            Block.makeCuboidShape(11.207088387096796, 9.33555, 8.000311612903227, 12.707088387096796, 9.53555, 8.612821612903227),
            Block.makeCuboidShape(12.490028387096796, 7.74672, 3.5878316129032264, 13.990028387096796, 8.3463, 12.190891612903227),
            Block.makeCuboidShape(1.990028387096796, 0.88478, 3.360101612903227, 3.490028387096796, 2.18478, 4.460101612903227),
            Block.makeCuboidShape(1.990028387096796, 0.88478, 11.318621612903227, 3.490028387096796, 2.18478, 12.418621612903227),
            Block.makeCuboidShape(1.990028387096796, 1.87905, 3.023091612903226, 3.490028387096796, 6.19896, 4.123091612903227),
            Block.makeCuboidShape(1.990028387096796, 1.87905, 11.655631612903226, 3.490028387096796, 6.19896, 12.755631612903226),
            Block.makeCuboidShape(1.990028387096796, 5.939, 3.2299716129032277, 3.490028387096796, 7.939, 4.3299716129032255),
            Block.makeCuboidShape(1.990028387096796, 5.939, 11.448751612903227, 3.490028387096796, 7.939, 12.548751612903226),
            Block.makeCuboidShape(1.990028387096796, 6.339, 2.929971612903227, 3.490028387096796, 8.139, 4.3299716129032255),
            Block.makeCuboidShape(1.990028387096796, 6.339, 11.448751612903227, 3.490028387096796, 8.139, 12.848751612903227),
            Block.makeCuboidShape(1.990028387096796, 6.47022, 11.437331612903227, 3.490028387096796, 6.97022, 12.837331612903228),
            Block.makeCuboidShape(12.490028387096796, 6.47022, 11.437331612903227, 13.990028387096796, 6.97022, 12.837331612903228),
            Block.makeCuboidShape(1.990028387096796, 8.54693, 3.9901316129032267, 3.490028387096796, 8.74693, 7.090131612903226),
            Block.makeCuboidShape(1.990028387096796, 8.75, 8.711041612903227, 3.490028387096796, 8.95, 11.811041612903226),
            Block.makeCuboidShape(1.990028387096796, 9.33555, 6.654791612903226, 3.490028387096796, 9.53555, 8.867301612903226),
            Block.makeCuboidShape(1.990028387096796, 7.74672, 3.5878316129032264, 3.490028387096796, 8.3463, 12.190891612903227),
            Block.makeCuboidShape(-0.009971612903203919, 1.91732, 11.704731612903228, 15.990028387096796, 6.15224, 12.704731612903228),
            Block.makeCuboidShape(-0.009971612903203919, 1.91732, 3.104731612903226, 15.990028387096796, 6.15224, 4.104731612903226),
            Block.makeCuboidShape(-0.009971612903203919, 0, 3.8808516129032267, 15.990028387096796, 8, 11.939361612903227),
            Block.makeCuboidShape(15.992028387096799, 4, 3.1808516129032274, 15.992028387096799, 6, 12.639361612903226),
            Block.makeCuboidShape(-0.010971612903205141, 4, 3.1808516129032274, -0.010971612903205141, 6, 12.639361612903226),
            Block.makeCuboidShape(0.9900283870967961, 8, 3.6802216129032264, 14.990028387096796, 8.29958, 12.106821612903227)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(4.05078838709678, -0.02273, -0.10997161290319468, 12.08315838709678, 0.87727, 16.090028387096808),
            Block.makeCuboidShape(2.2254183870967807, 4.77375, -0.008971612903193815, 3.2254183870967807, 6.77375, 15.988028387096808),
            Block.makeCuboidShape(11.53989838709678, 5.88478, -0.008971612903193815, 12.53989838709678, 7.88478, 15.988028387096808),
            Block.makeCuboidShape(12.53989838709678, 6.38478, 0.9900283870968067, 12.839898387096781, 8.08478, 14.990028387096807),
            Block.makeCuboidShape(3.381378387096781, 6.38478, 0.9900283870968067, 3.68137838709678, 8.08478, 14.990028387096807),
            Block.makeCuboidShape(3.24363838709678, 6.56568, 0.9900283870968067, 3.9436383870967795, 7.06568, 14.990028387096807),
            Block.makeCuboidShape(3.63989838709678, 0.18478, -0.009971612903193261, 4.63989838709678, 2.18478, 15.990028387096807),
            Block.makeCuboidShape(3.4898983870967797, 0.08478, -0.10997161290319468, 3.9398983870967808, 0.93478, 16.090028387096808),
            Block.makeCuboidShape(11.891978387096781, -0.08388, -0.10997161290319468, 12.34197838709678, 0.76612, 16.090028387096808),
            Block.makeCuboidShape(11.53989838709678, 0.18478, -0.009971612903193261, 12.53989838709678, 2.18478, 15.990028387096807),
            Block.makeCuboidShape(11.53989838709678, 0.88478, 12.490028387096807, 12.639898387096782, 2.18478, 13.990028387096807),
            Block.makeCuboidShape(3.5813783870967804, 0.88478, 12.490028387096807, 4.68137838709678, 2.18478, 13.990028387096807),
            Block.makeCuboidShape(11.87690838709678, 1.87905, 12.490028387096807, 12.976908387096781, 6.19896, 13.990028387096807),
            Block.makeCuboidShape(3.244368387096781, 1.87905, 12.490028387096807, 4.344368387096781, 6.19896, 13.990028387096807),
            Block.makeCuboidShape(11.670028387096782, 5.939, 12.490028387096807, 12.77002838709678, 7.939, 13.990028387096807),
            Block.makeCuboidShape(3.451248387096781, 5.939, 12.490028387096807, 4.551248387096781, 7.939, 13.990028387096807),
            Block.makeCuboidShape(11.670028387096782, 6.339, 12.490028387096807, 13.07002838709678, 8.139, 13.990028387096807),
            Block.makeCuboidShape(12.920028387096782, 5.339, 12.740028387096807, 13.07002838709678, 6.389, 13.740028387096807),
            Block.makeCuboidShape(12.920028387096782, 5.339, 2.2900283870968074, 13.07002838709678, 6.389, 3.2900283870968074),
            Block.makeCuboidShape(12.87002838709678, 6.939, 12.790028387096807, 13.07002838709678, 7.339, 13.690028387096806),
            Block.makeCuboidShape(12.87002838709678, 6.939, 2.3400283870968064, 13.07002838709678, 7.339, 3.2400283870968067),
            Block.makeCuboidShape(13.07002838709678, 7.139, 2.3400283870968064, 13.170028387096782, 7.339, 3.2400283870968067),
            Block.makeCuboidShape(13.07002838709678, 7.139, 12.740028387096807, 13.170028387096782, 7.339, 13.740028387096807),
            Block.makeCuboidShape(13.07002838709678, 6.439, 12.790028387096807, 13.27002838709678, 6.639, 13.690028387096806),
            Block.makeCuboidShape(13.07002838709678, 6.439, 2.3400283870968064, 13.27002838709678, 6.639, 3.2400283870968067),
            Block.makeCuboidShape(12.87002838709678, 5.939, 12.790028387096807, 13.170028387096782, 6.139, 13.690028387096806),
            Block.makeCuboidShape(12.87002838709678, 5.939, 2.3400283870968064, 13.170028387096782, 6.139, 3.2400283870968067),
            Block.makeCuboidShape(12.87002838709678, 5.939, 13.690028387096806, 13.170028387096782, 7.339, 13.790028387096807),
            Block.makeCuboidShape(12.87002838709678, 5.939, 3.2400283870968067, 13.170028387096782, 7.339, 3.3400283870968064),
            Block.makeCuboidShape(12.87002838709678, 5.939, 12.690028387096806, 13.170028387096782, 7.339, 12.790028387096807),
            Block.makeCuboidShape(12.87002838709678, 5.939, 2.2400283870968067, 13.170028387096782, 7.339, 2.3400283870968064),
            Block.makeCuboidShape(3.1512483870967802, 6.339, 12.490028387096807, 4.551248387096781, 8.139, 13.990028387096807),
            Block.makeCuboidShape(8.909868387096783, 8.54693, 12.490028387096807, 12.00986838709678, 8.74693, 13.990028387096807),
            Block.makeCuboidShape(4.188958387096781, 8.75, 12.490028387096807, 7.2889583870967805, 8.95, 13.990028387096807),
            Block.makeCuboidShape(7.132698387096781, 9.33555, 12.490028387096807, 9.345208387096779, 9.53555, 13.990028387096807),
            Block.makeCuboidShape(7.58269838709678, 9.33555, 4.490028387096807, 8.89520838709678, 9.53555, 11.490028387096807),
            Block.makeCuboidShape(7.482698387096779, 9.23555, 5.740028387096807, 8.995208387096781, 9.63555, 10.240028387096807),
            Block.makeCuboidShape(7.387178387096778, 9.33555, 3.2070883870968068, 7.9996883870967785, 9.53555, 4.707088387096807),
            Block.makeCuboidShape(8.587178387096781, 9.33555, 11.607088387096809, 9.199688387096781, 9.53555, 13.107088387096809),
            Block.makeCuboidShape(8.48717838709678, 9.33555, 3.2070883870968068, 9.09968838709678, 9.53555, 4.707088387096807),
            Block.makeCuboidShape(7.387178387096778, 9.33555, 11.207088387096807, 7.9996883870967785, 9.53555, 12.707088387096807),
            Block.makeCuboidShape(3.8091083870967797, 7.74672, 12.490028387096807, 12.41216838709678, 8.3463, 13.990028387096807),
            Block.makeCuboidShape(11.53989838709678, 0.88478, 1.9900283870968067, 12.639898387096782, 2.18478, 3.4900283870968067),
            Block.makeCuboidShape(3.5813783870967804, 0.88478, 1.9900283870968067, 4.68137838709678, 2.18478, 3.4900283870968067),
            Block.makeCuboidShape(11.87690838709678, 1.87905, 1.9900283870968067, 12.976908387096781, 6.19896, 3.4900283870968067),
            Block.makeCuboidShape(3.244368387096781, 1.87905, 1.9900283870968067, 4.344368387096781, 6.19896, 3.4900283870968067),
            Block.makeCuboidShape(11.670028387096782, 5.939, 1.9900283870968067, 12.77002838709678, 7.939, 3.4900283870968067),
            Block.makeCuboidShape(3.451248387096781, 5.939, 1.9900283870968067, 4.551248387096781, 7.939, 3.4900283870968067),
            Block.makeCuboidShape(11.670028387096782, 6.339, 1.9900283870968067, 13.07002838709678, 8.139, 3.4900283870968067),
            Block.makeCuboidShape(3.1512483870967802, 6.339, 1.9900283870968067, 4.551248387096781, 8.139, 3.4900283870968067),
            Block.makeCuboidShape(3.1626683870967796, 6.47022, 1.9900283870968067, 4.56266838709678, 6.97022, 3.4900283870968067),
            Block.makeCuboidShape(3.1626683870967796, 6.47022, 12.490028387096807, 4.56266838709678, 6.97022, 13.990028387096807),
            Block.makeCuboidShape(8.909868387096783, 8.54693, 1.9900283870968067, 12.00986838709678, 8.74693, 3.4900283870968067),
            Block.makeCuboidShape(4.188958387096781, 8.75, 1.9900283870968067, 7.2889583870967805, 8.95, 3.4900283870968067),
            Block.makeCuboidShape(7.132698387096781, 9.33555, 1.9900283870968067, 9.345208387096779, 9.53555, 3.4900283870968067),
            Block.makeCuboidShape(3.8091083870967797, 7.74672, 1.9900283870968067, 12.41216838709678, 8.3463, 3.4900283870968067),
            Block.makeCuboidShape(3.2952683870967796, 1.91732, -0.009971612903193261, 4.29526838709678, 6.15224, 15.990028387096807),
            Block.makeCuboidShape(11.895268387096781, 1.91732, -0.009971612903193261, 12.895268387096781, 6.15224, 15.990028387096807),
            Block.makeCuboidShape(4.06063838709678, 0, -0.009971612903193261, 12.119148387096782, 8, 15.990028387096807),
            Block.makeCuboidShape(3.360638387096781, 4, 15.99202838709681, 12.819148387096778, 6, 15.99202838709681),
            Block.makeCuboidShape(3.360638387096781, 4, -0.010971612903194483, 12.819148387096778, 6, -0.010971612903194483),
            Block.makeCuboidShape(3.89317838709678, 8, 0.9900283870968067, 12.319778387096779, 8.29958, 14.990028387096807)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(-0.09002838709677974, -0.02273, 4.050788387096777, 16.109971612903223, 0.87727, 12.083158387096777),
            Block.makeCuboidShape(0.011971612903220574, 4.77375, 2.225418387096777, 16.008971612903224, 6.77375, 3.225418387096777),
            Block.makeCuboidShape(0.011971612903220574, 5.88478, 11.539898387096777, 16.008971612903224, 7.88478, 12.539898387096777),
            Block.makeCuboidShape(1.0099716129032217, 6.38478, 12.539898387096777, 15.009971612903222, 8.08478, 12.839898387096778),
            Block.makeCuboidShape(1.0099716129032217, 6.38478, 3.3813783870967775, 15.009971612903222, 8.08478, 3.6813783870967764),
            Block.makeCuboidShape(1.0099716129032217, 6.56568, 3.2436383870967767, 15.009971612903222, 7.06568, 3.943638387096776),
            Block.makeCuboidShape(0.009971612903221683, 0.18478, 3.6398983870967765, 16.00997161290322, 2.18478, 4.6398983870967765),
            Block.makeCuboidShape(-0.09002838709677974, 0.08478, 3.489898387096776, 16.109971612903223, 0.93478, 3.939898387096777),
            Block.makeCuboidShape(-0.09002838709677974, -0.08388, 11.891978387096778, 16.109971612903223, 0.76612, 12.341978387096777),
            Block.makeCuboidShape(0.009971612903221683, 0.18478, 11.539898387096777, 16.00997161290322, 2.18478, 12.539898387096777),
            Block.makeCuboidShape(2.0099716129032217, 0.88478, 11.539898387096777, 3.5099716129032217, 2.18478, 12.639898387096778),
            Block.makeCuboidShape(2.0099716129032217, 0.88478, 3.581378387096777, 3.5099716129032217, 2.18478, 4.6813783870967764),
            Block.makeCuboidShape(2.0099716129032217, 1.87905, 11.876908387096776, 3.5099716129032217, 6.19896, 12.976908387096778),
            Block.makeCuboidShape(2.0099716129032217, 1.87905, 3.2443683870967774, 3.5099716129032217, 6.19896, 4.344368387096777),
            Block.makeCuboidShape(2.0099716129032217, 5.939, 11.670028387096778, 3.5099716129032217, 7.939, 12.770028387096776),
            Block.makeCuboidShape(2.0099716129032217, 5.939, 3.4512483870967774, 3.5099716129032217, 7.939, 4.551248387096777),
            Block.makeCuboidShape(2.0099716129032217, 6.339, 11.670028387096778, 3.5099716129032217, 8.139, 13.070028387096777),
            Block.makeCuboidShape(2.2599716129032217, 5.339, 12.920028387096778, 3.2599716129032217, 6.389, 13.070028387096777),
            Block.makeCuboidShape(12.709971612903221, 5.339, 12.920028387096778, 13.709971612903221, 6.389, 13.070028387096777),
            Block.makeCuboidShape(2.3099716129032224, 6.939, 12.870028387096777, 3.209971612903221, 7.339, 13.070028387096777),
            Block.makeCuboidShape(12.759971612903222, 6.939, 12.870028387096777, 13.659971612903222, 7.339, 13.070028387096777),
            Block.makeCuboidShape(12.759971612903222, 7.139, 13.070028387096777, 13.659971612903222, 7.339, 13.170028387096778),
            Block.makeCuboidShape(2.2599716129032217, 7.139, 13.070028387096777, 3.2599716129032217, 7.339, 13.170028387096778),
            Block.makeCuboidShape(2.3099716129032224, 6.439, 13.070028387096777, 3.209971612903221, 6.639, 13.270028387096776),
            Block.makeCuboidShape(12.759971612903222, 6.439, 13.070028387096777, 13.659971612903222, 6.639, 13.270028387096776),
            Block.makeCuboidShape(2.3099716129032224, 5.939, 12.870028387096777, 3.209971612903221, 6.139, 13.170028387096778),
            Block.makeCuboidShape(12.759971612903222, 5.939, 12.870028387096777, 13.659971612903222, 6.139, 13.170028387096778),
            Block.makeCuboidShape(2.209971612903221, 5.939, 12.870028387096777, 2.3099716129032224, 7.339, 13.170028387096778),
            Block.makeCuboidShape(12.659971612903222, 5.939, 12.870028387096777, 12.759971612903222, 7.339, 13.170028387096778),
            Block.makeCuboidShape(3.209971612903221, 5.939, 12.870028387096777, 3.3099716129032224, 7.339, 13.170028387096778),
            Block.makeCuboidShape(13.659971612903222, 5.939, 12.870028387096777, 13.759971612903222, 7.339, 13.170028387096778),
            Block.makeCuboidShape(2.0099716129032217, 6.339, 3.1512483870967767, 3.5099716129032217, 8.139, 4.551248387096777),
            Block.makeCuboidShape(2.0099716129032217, 8.54693, 8.909868387096779, 3.5099716129032217, 8.74693, 12.009868387096777),
            Block.makeCuboidShape(2.0099716129032217, 8.75, 4.188958387096777, 3.5099716129032217, 8.95, 7.288958387096777),
            Block.makeCuboidShape(2.0099716129032217, 9.33555, 7.132698387096777, 3.5099716129032217, 9.53555, 9.345208387096775),
            Block.makeCuboidShape(4.509971612903222, 9.33555, 7.582698387096777, 11.509971612903222, 9.53555, 8.895208387096776),
            Block.makeCuboidShape(5.759971612903222, 9.23555, 7.482698387096775, 10.259971612903222, 9.63555, 8.995208387096778),
            Block.makeCuboidShape(11.292911612903222, 9.33555, 7.387178387096775, 12.792911612903222, 9.53555, 7.999688387096775),
            Block.makeCuboidShape(2.8929116129032195, 9.33555, 8.587178387096777, 4.3929116129032195, 9.53555, 9.199688387096778),
            Block.makeCuboidShape(11.292911612903222, 9.33555, 8.487178387096776, 12.792911612903222, 9.53555, 9.099688387096776),
            Block.makeCuboidShape(3.2929116129032217, 9.33555, 7.387178387096775, 4.792911612903222, 9.53555, 7.999688387096775),
            Block.makeCuboidShape(2.0099716129032217, 7.74672, 3.809108387096776, 3.5099716129032217, 8.3463, 12.412168387096777),
            Block.makeCuboidShape(12.509971612903222, 0.88478, 11.539898387096777, 14.009971612903222, 2.18478, 12.639898387096778),
            Block.makeCuboidShape(12.509971612903222, 0.88478, 3.581378387096777, 14.009971612903222, 2.18478, 4.6813783870967764),
            Block.makeCuboidShape(12.509971612903222, 1.87905, 11.876908387096776, 14.009971612903222, 6.19896, 12.976908387096778),
            Block.makeCuboidShape(12.509971612903222, 1.87905, 3.2443683870967774, 14.009971612903222, 6.19896, 4.344368387096777),
            Block.makeCuboidShape(12.509971612903222, 5.939, 11.670028387096778, 14.009971612903222, 7.939, 12.770028387096776),
            Block.makeCuboidShape(12.509971612903222, 5.939, 3.4512483870967774, 14.009971612903222, 7.939, 4.551248387096777),
            Block.makeCuboidShape(12.509971612903222, 6.339, 11.670028387096778, 14.009971612903222, 8.139, 13.070028387096777),
            Block.makeCuboidShape(12.509971612903222, 6.339, 3.1512483870967767, 14.009971612903222, 8.139, 4.551248387096777),
            Block.makeCuboidShape(12.509971612903222, 6.47022, 3.162668387096776, 14.009971612903222, 6.97022, 4.562668387096776),
            Block.makeCuboidShape(2.0099716129032217, 6.47022, 3.162668387096776, 3.5099716129032217, 6.97022, 4.562668387096776),
            Block.makeCuboidShape(12.509971612903222, 8.54693, 8.909868387096779, 14.009971612903222, 8.74693, 12.009868387096777),
            Block.makeCuboidShape(12.509971612903222, 8.75, 4.188958387096777, 14.009971612903222, 8.95, 7.288958387096777),
            Block.makeCuboidShape(12.509971612903222, 9.33555, 7.132698387096777, 14.009971612903222, 9.53555, 9.345208387096775),
            Block.makeCuboidShape(12.509971612903222, 7.74672, 3.809108387096776, 14.009971612903222, 8.3463, 12.412168387096777),
            Block.makeCuboidShape(0.009971612903221683, 1.91732, 3.295268387096776, 16.00997161290322, 6.15224, 4.295268387096776),
            Block.makeCuboidShape(0.009971612903221683, 1.91732, 11.895268387096777, 16.00997161290322, 6.15224, 12.895268387096777),
            Block.makeCuboidShape(0.009971612903221683, 0, 4.060638387096777, 16.00997161290322, 8, 12.119148387096779),
            Block.makeCuboidShape(0.007971612903219238, 4, 3.3606383870967775, 0.007971612903219238, 6, 12.819148387096774),
            Block.makeCuboidShape(16.010971612903223, 4, 3.3606383870967775, 16.010971612903223, 6, 12.819148387096774),
            Block.makeCuboidShape(1.0099716129032217, 8, 3.8931783870967767, 15.009971612903222, 8.29958, 12.319778387096775)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(3.9168416129032266, -0.02273, -0.09002838709677796, 11.949211612903227, 0.87727, 16.109971612903223),
            Block.makeCuboidShape(12.774581612903226, 4.77375, 0.01197161290322235, 13.774581612903226, 6.77375, 16.008971612903224),
            Block.makeCuboidShape(3.4601016129032267, 5.88478, 0.01197161290322235, 4.460101612903227, 7.88478, 16.008971612903224),
            Block.makeCuboidShape(3.160101612903226, 6.38478, 1.0099716129032235, 3.4601016129032267, 8.08478, 15.009971612903223),
            Block.makeCuboidShape(12.318621612903227, 6.38478, 1.0099716129032235, 12.618621612903226, 8.08478, 15.009971612903223),
            Block.makeCuboidShape(12.056361612903228, 6.56568, 1.0099716129032235, 12.756361612903227, 7.06568, 15.009971612903223),
            Block.makeCuboidShape(11.360101612903227, 0.18478, 0.009971612903223459, 12.360101612903227, 2.18478, 16.00997161290322),
            Block.makeCuboidShape(12.060101612903226, 0.08478, -0.09002838709677796, 12.510101612903227, 0.93478, 16.109971612903223),
            Block.makeCuboidShape(3.6580216129032266, -0.08388, -0.09002838709677796, 4.108021612903226, 0.76612, 16.109971612903223),
            Block.makeCuboidShape(3.4601016129032267, 0.18478, 0.009971612903223459, 4.460101612903227, 2.18478, 16.00997161290322),
            Block.makeCuboidShape(3.3601016129032253, 0.88478, 2.0099716129032235, 4.460101612903227, 2.18478, 3.5099716129032235),
            Block.makeCuboidShape(11.318621612903227, 0.88478, 2.0099716129032235, 12.418621612903227, 2.18478, 3.5099716129032235),
            Block.makeCuboidShape(3.023091612903226, 1.87905, 2.0099716129032235, 4.123091612903227, 6.19896, 3.5099716129032235),
            Block.makeCuboidShape(11.655631612903226, 1.87905, 2.0099716129032235, 12.755631612903226, 6.19896, 3.5099716129032235),
            Block.makeCuboidShape(3.2299716129032277, 5.939, 2.0099716129032235, 4.3299716129032255, 7.939, 3.5099716129032235),
            Block.makeCuboidShape(11.448751612903227, 5.939, 2.0099716129032235, 12.548751612903226, 7.939, 3.5099716129032235),
            Block.makeCuboidShape(2.929971612903227, 6.339, 2.0099716129032235, 4.3299716129032255, 8.139, 3.5099716129032235),
            Block.makeCuboidShape(2.929971612903227, 5.339, 2.2599716129032235, 3.0799716129032255, 6.389, 3.2599716129032235),
            Block.makeCuboidShape(2.929971612903227, 5.339, 12.709971612903223, 3.0799716129032255, 6.389, 13.709971612903223),
            Block.makeCuboidShape(2.929971612903227, 6.939, 2.309971612903224, 3.1299716129032262, 7.339, 3.2099716129032227),
            Block.makeCuboidShape(2.929971612903227, 6.939, 12.759971612903223, 3.1299716129032262, 7.339, 13.659971612903224),
            Block.makeCuboidShape(2.8299716129032255, 7.139, 12.759971612903223, 2.929971612903227, 7.339, 13.659971612903224),
            Block.makeCuboidShape(2.8299716129032255, 7.139, 2.2599716129032235, 2.929971612903227, 7.339, 3.2599716129032235),
            Block.makeCuboidShape(2.7299716129032277, 6.439, 2.309971612903224, 2.929971612903227, 6.639, 3.2099716129032227),
            Block.makeCuboidShape(2.7299716129032277, 6.439, 12.759971612903223, 2.929971612903227, 6.639, 13.659971612903224),
            Block.makeCuboidShape(2.8299716129032255, 5.939, 2.309971612903224, 3.1299716129032262, 6.139, 3.2099716129032227),
            Block.makeCuboidShape(2.8299716129032255, 5.939, 12.759971612903223, 3.1299716129032262, 6.139, 13.659971612903224),
            Block.makeCuboidShape(2.8299716129032255, 5.939, 2.2099716129032227, 3.1299716129032262, 7.339, 2.309971612903224),
            Block.makeCuboidShape(2.8299716129032255, 5.939, 12.659971612903224, 3.1299716129032262, 7.339, 12.759971612903223),
            Block.makeCuboidShape(2.8299716129032255, 5.939, 3.2099716129032227, 3.1299716129032262, 7.339, 3.309971612903224),
            Block.makeCuboidShape(2.8299716129032255, 5.939, 13.659971612903224, 3.1299716129032262, 7.339, 13.759971612903223),
            Block.makeCuboidShape(11.448751612903227, 6.339, 2.0099716129032235, 12.848751612903227, 8.139, 3.5099716129032235),
            Block.makeCuboidShape(3.9901316129032267, 8.54693, 2.0099716129032235, 7.090131612903225, 8.74693, 3.5099716129032235),
            Block.makeCuboidShape(8.711041612903227, 8.75, 2.0099716129032235, 11.811041612903226, 8.95, 3.5099716129032235),
            Block.makeCuboidShape(6.654791612903228, 9.33555, 2.0099716129032235, 8.867301612903226, 9.53555, 3.5099716129032235),
            Block.makeCuboidShape(7.104791612903227, 9.33555, 4.5099716129032235, 8.417301612903227, 9.53555, 11.509971612903223),
            Block.makeCuboidShape(7.004791612903226, 9.23555, 5.7599716129032235, 8.517301612903228, 9.63555, 10.259971612903223),
            Block.makeCuboidShape(8.000311612903229, 9.33555, 11.292911612903223, 8.612821612903229, 9.53555, 12.792911612903223),
            Block.makeCuboidShape(6.800311612903226, 9.33555, 2.8929116129032213, 7.412821612903226, 9.53555, 4.392911612903221),
            Block.makeCuboidShape(6.900311612903227, 9.33555, 11.292911612903223, 7.5128216129032275, 9.53555, 12.792911612903223),
            Block.makeCuboidShape(8.000311612903229, 9.33555, 3.2929116129032234, 8.612821612903229, 9.53555, 4.792911612903223),
            Block.makeCuboidShape(3.5878316129032264, 7.74672, 2.0099716129032235, 12.190891612903227, 8.3463, 3.5099716129032235),
            Block.makeCuboidShape(3.3601016129032253, 0.88478, 12.509971612903223, 4.460101612903227, 2.18478, 14.009971612903223),
            Block.makeCuboidShape(11.318621612903227, 0.88478, 12.509971612903223, 12.418621612903227, 2.18478, 14.009971612903223),
            Block.makeCuboidShape(3.023091612903226, 1.87905, 12.509971612903223, 4.123091612903227, 6.19896, 14.009971612903223),
            Block.makeCuboidShape(11.655631612903226, 1.87905, 12.509971612903223, 12.755631612903226, 6.19896, 14.009971612903223),
            Block.makeCuboidShape(3.2299716129032277, 5.939, 12.509971612903223, 4.3299716129032255, 7.939, 14.009971612903223),
            Block.makeCuboidShape(11.448751612903227, 5.939, 12.509971612903223, 12.548751612903226, 7.939, 14.009971612903223),
            Block.makeCuboidShape(2.929971612903227, 6.339, 12.509971612903223, 4.3299716129032255, 8.139, 14.009971612903223),
            Block.makeCuboidShape(11.448751612903227, 6.339, 12.509971612903223, 12.848751612903227, 8.139, 14.009971612903223),
            Block.makeCuboidShape(11.437331612903227, 6.47022, 12.509971612903223, 12.837331612903228, 6.97022, 14.009971612903223),
            Block.makeCuboidShape(11.437331612903227, 6.47022, 2.0099716129032235, 12.837331612903228, 6.97022, 3.5099716129032235),
            Block.makeCuboidShape(3.9901316129032267, 8.54693, 12.509971612903223, 7.090131612903225, 8.74693, 14.009971612903223),
            Block.makeCuboidShape(8.711041612903227, 8.75, 12.509971612903223, 11.811041612903226, 8.95, 14.009971612903223),
            Block.makeCuboidShape(6.654791612903228, 9.33555, 12.509971612903223, 8.867301612903226, 9.53555, 14.009971612903223),
            Block.makeCuboidShape(3.5878316129032264, 7.74672, 12.509971612903223, 12.190891612903227, 8.3463, 14.009971612903223),
            Block.makeCuboidShape(11.704731612903228, 1.91732, 0.009971612903223459, 12.704731612903228, 6.15224, 16.00997161290322),
            Block.makeCuboidShape(3.104731612903226, 1.91732, 0.009971612903223459, 4.104731612903226, 6.15224, 16.00997161290322),
            Block.makeCuboidShape(3.880851612903225, 0, 0.009971612903223459, 11.939361612903227, 8, 16.00997161290322),
            Block.makeCuboidShape(3.180851612903229, 4, 0.007971612903221015, 12.639361612903226, 6, 0.007971612903221015),
            Block.makeCuboidShape(3.180851612903229, 4, 16.010971612903226, 12.639361612903226, 6, 16.010971612903226),
            Block.makeCuboidShape(3.680221612903228, 8, 1.0099716129032235, 12.106821612903227, 8.29958, 15.009971612903223)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public Yellow_Bag() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(3.5f, 4.0f)
                .harvestLevel(0)
                .sound(SoundType.CLOTH)
                .setRequiresTool());
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch (state.get(FACING)) {
            case NORTH:
                return SHAPE_N;
            case EAST:
                return  SHAPE_E;
            case SOUTH:
                return SHAPE_S;
            case WEST:
                return SHAPE_W;
            default:
                return SHAPE_N;
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

    @Override
    public float getAmbientOcclusionLightValue(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return 0.6f;
    }
}
