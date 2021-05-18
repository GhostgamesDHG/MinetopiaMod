package com.ghostgamesdhg.minetopia.init;

import com.ghostgamesdhg.minetopia.MinetopiaExtra;
import com.ghostgamesdhg.minetopia.blocks.BlockInvis;
import com.ghostgamesdhg.minetopia.blocks.BlockItemBase;
import com.ghostgamesdhg.minetopia.blocks.BlockItemItemBase;
import com.ghostgamesdhg.minetopia.blocks.BlockTrophies;
import com.ghostgamesdhg.minetopia.items.*;
import com.ghostgamesdhg.minetopia.util.enums.ModArmorMaterial;
import com.ghostgamesdhg.minetopia.util.enums.ModItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModHats {

    //This class registers the items in the mod.

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MinetopiaExtra.MOD_ID);

    //Hats
    public static final RegistryObject<Item> DOLLARBRIL = ITEMS.register("dollarbril", ItemHats::new);
    public static final RegistryObject<Item> SOMBRERO = ITEMS.register("sombrero", ItemHats::new);
    public static final RegistryObject<Item> BEERHEAD = ITEMS.register("beerhead", ItemHats::new);
    public static final RegistryObject<Item> IJSBEERHEAD = ITEMS.register("ijsbeerhead", ItemHats::new);
    public static final RegistryObject<Item> DROLHOED = ITEMS.register("drolhoed", ItemHats::new);
    public static final RegistryObject<Item> GOKUHAIR = ITEMS.register("gokuhair", ItemHats::new);
    public static final RegistryObject<Item> BLUEGOKUHAIR = ITEMS.register("bluegokuhair", ItemHats::new);
    public static final RegistryObject<Item> ORANGEGOKUHAIR = ITEMS.register("orangegokuhair", ItemHats::new);
    public static final RegistryObject<Item> PINKGOKUHAIR = ITEMS.register("pinkgokuhair", ItemHats::new);
    public static final RegistryObject<Item> GREENGOKUHAIR = ITEMS.register("greengokuhair", ItemHats::new);
    public static final RegistryObject<Item> BOUWHELM = ITEMS.register("bouwhelm", ItemHats::new);
    public static final RegistryObject<Item> DUIKBRIL_BLAUW = ITEMS.register("duikbril_blauw", ItemHats::new);
    public static final RegistryObject<Item> DUIKBRIL_GEEL = ITEMS.register("duikbril_geel", ItemHats::new);
    public static final RegistryObject<Item> DUIKBRIL_GROEN = ITEMS.register("duikbril_groen", ItemHats::new);
    public static final RegistryObject<Item> DUIKBRIL_ROZE = ITEMS.register("duikbril_roze", ItemHats::new);
    public static final RegistryObject<Item> HEKSENHOED = ITEMS.register("heksenhoed", ItemHats::new);
    public static final RegistryObject<Item> ELFENHOED = ITEMS.register("elfenhoed", ItemHats::new);
    public static final RegistryObject<Item> TIARA = ITEMS.register("tiara", ItemHats::new);
    public static final RegistryObject<Item> PLANGA_GEEL = ITEMS.register("planga_geel", ItemHats::new);
    public static final RegistryObject<Item> PLANGA_GOUD = ITEMS.register("planga_goud", ItemHats::new);
    public static final RegistryObject<Item> PLANGA_GRIJS = ITEMS.register("planga_grijs", ItemHats::new);
    public static final RegistryObject<Item> PLANGA_GROEN = ITEMS.register("planga_groen", ItemHats::new);
    public static final RegistryObject<Item> PLANGA_MAGENTA = ITEMS.register("planga_magenta", ItemHats::new);
    public static final RegistryObject<Item> PLANGA_ORANJE = ITEMS.register("planga_oranje", ItemHats::new);
    public static final RegistryObject<Item> PLANGA_PAARS = ITEMS.register("planga_paars", ItemHats::new);
    public static final RegistryObject<Item> PLANGA_ROOD = ITEMS.register("planga_rood", ItemHats::new);
    public static final RegistryObject<Item> PLANGA_ROZE = ITEMS.register("planga_roze", ItemHats::new);
    public static final RegistryObject<Item> PLANGA_WIT = ITEMS.register("planga_wit", ItemHats::new);
    public static final RegistryObject<Item> HELO = ITEMS.register("helo", ItemHats::new);
    public static final RegistryObject<Item> KERSTMUTS = ITEMS.register("kerstmuts", ItemHats::new);
    public static final RegistryObject<Item> EENHOORNHEAD = ITEMS.register("eenhoornhead", ItemHats::new);
    public static final RegistryObject<Item> HOLLANDBRIL = ITEMS.register("hollandbril", ItemHats::new);
    public static final RegistryObject<Item> HALLOWEEN_MASK = ITEMS.register("halloween_mask", ItemHats::new);
    public static final RegistryObject<Item> HEADSET = ITEMS.register("headset", ItemHats::new);
    public static final RegistryObject<Item> PINGUINHEAD = ITEMS.register("pinguinhead", ItemHats::new);
    public static final RegistryObject<Item> WOLFHEAD = ITEMS.register("wolfhead", ItemHats::new);
    public static final RegistryObject<Item> PYROS_HEAD = ITEMS.register("pyros_head", ItemHats::new);
    public static final RegistryObject<Item> ROBOTA_HEAD = ITEMS.register("robota_head", ItemHats::new);
    public static final RegistryObject<Item> BLACK_KNIGHT_HEAD = ITEMS.register("black_knight_head", ItemHats::new);
    public static final RegistryObject<Item> ENGEL_HEAD = ITEMS.register("engel_head", ItemHats::new);
    public static final RegistryObject<Item> RED_KNIGHT_HEAD = ITEMS.register("red_knight_head", ItemHats::new);
    public static final RegistryObject<Item> PHOENIX_HEAD = ITEMS.register("phoenix_head", ItemHats::new);
    public static final RegistryObject<Item> WITTESTRIK = ITEMS.register("wittestrik", ItemHats::new);
    public static final RegistryObject<Item> WITTEBRIL = ITEMS.register("wittebril", ItemHats::new);
    public static final RegistryObject<Item> VERREKIJKER = ITEMS.register("verrekijker", ItemHats::new);
    public static final RegistryObject<Item> TWBRIL = ITEMS.register("twbril", ItemHats::new);
    public static final RegistryObject<Item> THUGLIFEBRIL = ITEMS.register("thuglifebril", ItemHats::new);
    public static final RegistryObject<Item> STERREBRIL = ITEMS.register("sterrebril", ItemHats::new);
    public static final RegistryObject<Item> ORANJEPET = ITEMS.register("oranjepet", ItemHats::new);
    public static final RegistryObject<Item> BLAUWEHELM = ITEMS.register("blauwehelm", ItemHats::new);
    public static final RegistryObject<Item> BLAUWESTRIK = ITEMS.register("blauwestrik", ItemHats::new);
    public static final RegistryObject<Item> GELEHELM = ITEMS.register("gelehelm", ItemHats::new);
    public static final RegistryObject<Item> RENDIERHEAD = ITEMS.register("rendierhead", ItemHats::new);
    public static final RegistryObject<Item> KERSTMANHEAD = ITEMS.register("kerstmanhead", ItemHats::new);
    public static final RegistryObject<Item> GOUDEHEADSET = ITEMS.register("goudeheadset", ItemHats::new);
    public static final RegistryObject<Item> SMILLEYMASK = ITEMS.register("smilleymask", ItemHats::new);
    public static final RegistryObject<Item> ROZEPET = ITEMS.register("rozepet", ItemHats::new);
    public static final RegistryObject<Item> GESLAAGDHOED = ITEMS.register("geslaagdhoed", ItemHats::new);
    public static final RegistryObject<Item> KOALAHEAD = ITEMS.register("koalahead", ItemHats::new);
    public static final RegistryObject<Item> NIGHTRIDERHELM = ITEMS.register("nightriderhelm", ItemHats::new);
    public static final RegistryObject<Item> ONSTOPPERHEAD = ITEMS.register("onstopperhead", ItemHats::new);
    public static final RegistryObject<Item> ZWARTE_PET = ITEMS.register("zwarte_pet", ItemHats::new);
    public static final RegistryObject<Item> ZWARTE_PET_BACK = ITEMS.register("zwarte_pet_back", ItemHats::new);
    public static final RegistryObject<Item> POKEMONPET = ITEMS.register("pokemonpet", ItemHats::new);
    public static final RegistryObject<Item> POKEMONPET_BACK = ITEMS.register("pokemonpet_back", ItemHats::new);
    public static final RegistryObject<Item> PROPELLORPET = ITEMS.register("propellorpet", ItemHats::new);
    public static final RegistryObject<Item> RODEHELM = ITEMS.register("rodehelm", ItemHats::new);
    public static final RegistryObject<Item> RODEHOGEHOED = ITEMS.register("rodehogehoed", ItemHats::new);
    public static final RegistryObject<Item> PUMPKINMASK = ITEMS.register("pumpkinmask", ItemHats::new);
    public static final RegistryObject<Item> RODESTRIK = ITEMS.register("rodestrik", ItemHats::new);
    public static final RegistryObject<Item> GIRAFFE_PET = ITEMS.register("giraffe_pet", ItemHats::new);
    public static final RegistryObject<Item> MINING_HELMET = ITEMS.register("mining_helmet", ItemHats::new);
    public static final RegistryObject<Item> DARTHVADERHEAD = ITEMS.register("darthvaderhead", ItemHats::new);
    public static final RegistryObject<Item> AMONGUSHEAD = ITEMS.register("amongushead", ItemHats::new);
    public static final RegistryObject<Item> DEMONHEAD = ITEMS.register("demonhead", ItemHats::new);
    public static final RegistryObject<Item> MARIOHEAD = ITEMS.register("mariohead", ItemHats::new);
    public static final RegistryObject<Item> PANDAHEAD = ITEMS.register("pandahead", ItemHats::new);
    public static final RegistryObject<Item> SORTINGHAT = ITEMS.register("sortinghat", ItemHats::new);
    public static final RegistryObject<Item> SKIBRIL_ROOD = ITEMS.register("skibril_rood", ItemHats::new);
    public static final RegistryObject<Item> MINI_MOUSE = ITEMS.register("mini_mouse", ItemHats::new);
    public static final RegistryObject<Item> MICKEY_MOUSE = ITEMS.register("mickey_mouse", ItemHats::new);
    public static final RegistryObject<Item> HOGEHOED = ITEMS.register("hogehoed", ItemHats::new);
    public static final RegistryObject<Item> DOGEARS = ITEMS.register("dogears", ItemHats::new);
    public static final RegistryObject<Item> GOLFPET = ITEMS.register("golfpet", ItemHats::new);
    public static final RegistryObject<Item> SNOR = ITEMS.register("snor", ItemHats::new);
    public static final RegistryObject<Item> VISSERSHOEDJE = ITEMS.register("vissershoedje", ItemHats::new);
    public static final RegistryObject<Item> VISSERSHOEDJE_BLAUW = ITEMS.register("vissershoedje_blauw", ItemHats::new);
    public static final RegistryObject<Item> VISSERSHOEDJE_GEEL = ITEMS.register("vissershoedje_geel", ItemHats::new);
    public static final RegistryObject<Item> VISSERSHOEDJE_GROEN = ITEMS.register("vissershoedje_groen", ItemHats::new);
    public static final RegistryObject<Item> VISSERSHOEDJE_ORANJE = ITEMS.register("vissershoedje_oranje", ItemHats::new);
    public static final RegistryObject<Item> VISSERSHOEDJE_PAARS = ITEMS.register("vissershoedje_paars", ItemHats::new);
    public static final RegistryObject<Item> VISSERSHOEDJE_ROOD = ITEMS.register("vissershoedje_rood", ItemHats::new);
    public static final RegistryObject<Item> VISSERSHOEDJE_ROZE = ITEMS.register("vissershoedje_roze", ItemHats::new);
    public static final RegistryObject<Item> PANAMA_BRUIN = ITEMS.register("panama_bruin", ItemHats::new);
    public static final RegistryObject<Item> PANAMA_GRIJS = ITEMS.register("panama_grijs", ItemHats::new);
    public static final RegistryObject<Item> PANAMA_WIT = ITEMS.register("panama_wit", ItemHats::new);
    public static final RegistryObject<Item> PANAMA_ZWART = ITEMS.register("panama_zwart", ItemHats::new);
    public static final RegistryObject<Item> GOUDZWART_ZONNEBRIL = ITEMS.register("goudzwart_zonnebril", ItemHats::new);
    public static final RegistryObject<Item> ZWARTE_ZONNEBRIL = ITEMS.register("zwarte_zonnebril", ItemHats::new);
}