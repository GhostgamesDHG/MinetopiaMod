package com.ghostgamesdhg.minetopia.tileentity;

import com.ghostgamesdhg.minetopia.containers.OvenContainer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.SmokerContainer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.tileentity.AbstractFurnaceTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class OvenTileEntity extends AbstractFurnaceTileEntity {
   public OvenTileEntity() {
      super(TileEntityType.SMOKER, IRecipeType.SMOKING);
   }

   protected ITextComponent getDefaultName() {
      return new TranslationTextComponent("container.oven");
   }

   protected int getBurnTime(ItemStack fuel) {
      return super.getBurnTime(fuel) / 2;
   }

   protected Container createMenu(int id, PlayerInventory player) {
      return new OvenContainer(id, player, this, this.furnaceData);
   }
}