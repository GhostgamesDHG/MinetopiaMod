package com.ghostgamesdhg.minetopia.items;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class pepernoot extends Item {

    public pepernoot() {
        super(new Properties()
                .group(MinetopiaExtra.TAB4)
                .food(new Food.Builder()
                        .hunger(1)
                        .saturation(1.2f)
                        .build())
        );
    }
}