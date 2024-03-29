package com.ghostgamesdhg.minetopia.init;

import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGeneration {

    public static void generateOres(final BiomeLoadingEvent event) {
        if(!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            generateOres(event.getGeneration(),
                    ModBlocks.BLUE_CRYSTAL_ORE.get().getDefaultState(), 4, 9, 30, 5);
        }

        if(!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            generateOres(event.getGeneration(),
                    ModBlocks.PCB_DUST_ORE.get().getDefaultState(), 3, 8, 15, 6);
        }

        if(!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            generateOres(event.getGeneration(),
                    ModBlocks.COPPER_ORE.get().getDefaultState(), 4, 12, 40, 8);
        }
    }

    private static void generateOres(BiomeGenerationSettingsBuilder Settings, BlockState state, int veinSize,
                                     int minHeight, int maxHeight, int amount) {
        Settings.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, state, veinSize)).withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
                        .square().func_242731_b(amount));
    }
}
