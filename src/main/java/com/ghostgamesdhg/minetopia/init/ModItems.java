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

public class ModItems {
    
    //This class registers the items in the mod.
    
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MinetopiaExtra.MOD_ID);

    // Items place
    public static final RegistryObject<Item> BLACK_PHONE = ITEMS.register("black_phone", ItemBase::new);
    public static final RegistryObject<Item> PINK_PHONE = ITEMS.register("pink_phone", ItemBase::new);
    public static final RegistryObject<Item> YELLOW_PHONE = ITEMS.register("yellow_phone", ItemBase::new);
    public static final RegistryObject<Item> GREEN_PHONE = ITEMS.register("green_phone", ItemBase::new);
    public static final RegistryObject<Item> BLUE_PHONE = ITEMS.register("blue_phone", ItemBase::new);
    public static final RegistryObject<Item> RED_PHONE = ITEMS.register("red_phone", ItemBase::new);
    public static final RegistryObject<Item> SLEUTEL = ITEMS.register("sleutel", ItemBase::new);
    public static final RegistryObject<Item> MONEY1 = ITEMS.register("0.10euro", ItemBase::new);
    public static final RegistryObject<Item> MONEY2 = ITEMS.register("1euro", ItemBase::new);
    public static final RegistryObject<Item> MONEY3 = ITEMS.register("5euro", ItemBase::new);
    public static final RegistryObject<Item> MONEY4 = ITEMS.register("10euro", ItemBase::new);
    public static final RegistryObject<Item> MONEY5 = ITEMS.register("20euro", ItemBase::new);
    public static final RegistryObject<Item> MONEY6 = ITEMS.register("50euro", ItemBase::new);
    public static final RegistryObject<Item> MONEY7 = ITEMS.register("100euro", ItemBase::new);
    public static final RegistryObject<Item> MONEY8 = ITEMS.register("200euro", ItemBase::new);
    public static final RegistryObject<Item> MONEY9 = ITEMS.register("500euro", ItemBase::new);
    public static final RegistryObject<Item> MONEY10 = ITEMS.register("1000euro", ItemBase::new);
    public static final RegistryObject<Item> MONEY11 = ITEMS.register("100dollard", ItemBase::new);
    public static final RegistryObject<Item> MONEY12 = ITEMS.register("1000dollard", ItemBase::new);
    public static final RegistryObject<Item> MONEY13 = ITEMS.register("5000dollard", ItemBase::new);
    public static final RegistryObject<Item> MONEY14 = ITEMS.register("10000dollard", ItemBase::new);
    public static final RegistryObject<Item> MONEY15 = ITEMS.register("25000dollard", ItemBase::new);
    public static final RegistryObject<Item> MONEY16 = ITEMS.register("50000dollard", ItemBase::new);
    public static final RegistryObject<Item> INGBANKPAS = ITEMS.register("ingbankpas", ItemBase::new);
    public static final RegistryObject<Item> BLUE_CRYSTAL = ITEMS.register("blue_crystal", ItemBase::new);
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", ItemBase::new);
    public static final RegistryObject<Item> BALLON_ROZE = ITEMS.register("ballon_roze", ItemBase::new);
    public static final RegistryObject<Item> BALLON_ROOD = ITEMS.register("ballon_rood", ItemBase::new);
    public static final RegistryObject<Item> BALLON_ORANJE = ITEMS.register("ballon_oranje", ItemBase::new);
    public static final RegistryObject<Item> BALLON_GROEN = ITEMS.register("ballon_groen", ItemBase::new);
    public static final RegistryObject<Item> BALLON_GEEL = ITEMS.register("ballon_geel", ItemBase::new);
    public static final RegistryObject<Item> BALLON_BLAUW = ITEMS.register("ballon_blauw", ItemBase::new);
    public static final RegistryObject<Item> SPORTHORLOGE = ITEMS.register("sporthorloge", ItemBase::new);
    public static final RegistryObject<Item> WANDELTAK = ITEMS.register("wandeltak", ItemBase::new);
    public static final RegistryObject<Item> WANDELSTOK = ITEMS.register("wandelstok", ItemBase::new);
    public static final RegistryObject<Item> RING = ITEMS.register("ring", ItemBase::new);
    public static final RegistryObject<Item> PARAPLU_BLAUWWIT = ITEMS.register("paraplu_blauwwit", ItemBase::new);
    public static final RegistryObject<Item> PARAPLU_RAINBOW = ITEMS.register("paraplu_rainbow", ItemBase::new);
    public static final RegistryObject<Item> PARAPLU_ROODWIT = ITEMS.register("paraplu_roodwit", ItemBase::new);
    public static final RegistryObject<Item> STONE_SLEUTEL = ITEMS.register("stone_sleutel", ItemBase::new);
    public static final RegistryObject<Item> MINETOPIABAG = ITEMS.register("minetopiabag", ItemBase::new);
    public static final RegistryObject<Item> POMPOENLANTAARN = ITEMS.register("pompoenlantaarn", ItemBase::new);
    public static final RegistryObject<Item> NEKTASJE = ITEMS.register("nektasje", ItemBase::new);
    public static final RegistryObject<Item> DUIKFLES = ITEMS.register("duikfles", ItemBase::new);
    public static final RegistryObject<Item> PEPPERSPRAY = ITEMS.register("pepperspray", ItemBase::new);
    public static final RegistryObject<Item> HORLOGE = ITEMS.register("horloge", ItemBase::new);
    public static final RegistryObject<Item> WHEELCOIN = ITEMS.register("wheelcoin", ItemBase::new);
    public static final RegistryObject<Item> LUCKYSHARD = ITEMS.register("luckyshard", ItemBase::new);
    public static final RegistryObject<Item> BRONZE_PRISONCOIN = ITEMS.register("bronze_prisoncoin", ItemBase::new);
    public static final RegistryObject<Item> ZILVEREN_PRISONCOIN = ITEMS.register("zilveren_prisoncoin", ItemBase::new);
    public static final RegistryObject<Item> GRAYCOIN = ITEMS.register("graycoin", ItemBase::new);
    public static final RegistryObject<Item> MTCASINO_BLAUW = ITEMS.register("mtcasino_blauw", ItemBase::new);
    public static final RegistryObject<Item> MTCASINO_GOLD = ITEMS.register("mtcasino_gold", ItemBase::new);
    public static final RegistryObject<Item> MTCASINO_GROEN = ITEMS.register("mtcasino_groen", ItemBase::new);
    public static final RegistryObject<Item> MTCASINO_ORANJE = ITEMS.register("mtcasino_oranje", ItemBase::new);
    public static final RegistryObject<Item> MTCASINO_ROOD = ITEMS.register("mtcasino_rood", ItemBase::new);
    public static final RegistryObject<Item> MTCASINO_SILVER = ITEMS.register("mtcasino_silver", ItemBase::new);
    public static final RegistryObject<Item> LEGEND_50 = ITEMS.register("legend_50", ItemBase::new);
    public static final RegistryObject<Item> LEGEND_1 = ITEMS.register("legend_1", ItemBase::new);
    public static final RegistryObject<Item> EPIC_10 = ITEMS.register("epic_10", ItemBase::new);
    public static final RegistryObject<Item> EPIC_5 = ITEMS.register("epic_5", ItemBase::new);
    public static final RegistryObject<Item> EPIC_1 = ITEMS.register("epic_1", ItemBase::new);
    public static final RegistryObject<Item> COMMON_50 = ITEMS.register("common_50", ItemBase::new);
    public static final RegistryObject<Item> COMMON_10 = ITEMS.register("common_10", ItemBase::new);
    public static final RegistryObject<Item> COMMON_1 = ITEMS.register("common_1", ItemBase::new);
    public static final RegistryObject<Item> MODERN_WANDELSTOK = ITEMS.register("modern_wandelstok", ItemBase::new);
    public static final RegistryObject<Item> ZAK_PARAPLU = ITEMS.register("zak_paraplu", ItemBase::new);
    public static final RegistryObject<Item> SKISTOKKEN = ITEMS.register("skistokken", ItemBase::new);
    public static final RegistryObject<Item> MAGICWAND = ITEMS.register("magicwand", ItemBase::new);
    public static final RegistryObject<Item> MAGICWAND_BLUE = ITEMS.register("magicwand_blue", ItemBase::new);
    public static final RegistryObject<Item> MAGICWAND_GREEN = ITEMS.register("magicwand_green", ItemBase::new);
    public static final RegistryObject<Item> MAGICWAND_RED = ITEMS.register("magicwand_red", ItemBase::new);
    public static final RegistryObject<Item> MAGICWAND_YELLOW = ITEMS.register("magicwand_yellow", ItemBase::new);
    public static final RegistryObject<Item> JETPACK_DIAMOND = ITEMS.register("jetpack_diamond", ItemBase::new);
    public static final RegistryObject<Item> JETPACK_GOLD = ITEMS.register("jetpack_gold", ItemBase::new);
    public static final RegistryObject<Item> JETPACK_GRIJS = ITEMS.register("jetpack_grijs", ItemBase::new);
    public static final RegistryObject<Item> JETPACK_IRON = ITEMS.register("jetpack_iron", ItemBase::new);
    public static final RegistryObject<Item> KEY_DOBBELSTEEN_BRONZE = ITEMS.register("key_dobbelsteen_bronze", ItemBase::new);
    public static final RegistryObject<Item> KEY_DOBBELSTEEN_DIAMOND = ITEMS.register("key_dobbelsteen_diamond", ItemBase::new);
    public static final RegistryObject<Item> KEY_DOBBELSTEEN_EMERALD = ITEMS.register("key_dobbelsteen_emerald", ItemBase::new);
    public static final RegistryObject<Item> KEY_DOBBELSTEEN_GOLD = ITEMS.register("key_dobbelsteen_gold", ItemBase::new);
    public static final RegistryObject<Item> KEY_DOBBELSTEEN_MYSTIC = ITEMS.register("key_dobbelsteen_mystic", ItemBase::new);
    public static final RegistryObject<Item> KEY_DOBBELSTEEN_REDSTONE = ITEMS.register("key_dobbelsteen_redstone", ItemBase::new);
    public static final RegistryObject<Item> KEY_DOBBELSTEEN_SILVER = ITEMS.register("key_dobbelsteen_silver", ItemBase::new);
    public static final RegistryObject<Item> KEY_HAMER_BRONZE = ITEMS.register("key_hamer_bronze", ItemBase::new);
    public static final RegistryObject<Item> KEY_HAMER_DIAMOND = ITEMS.register("key_hamer_diamond", ItemBase::new);
    public static final RegistryObject<Item> KEY_HAMER_EMERALD = ITEMS.register("key_hamer_emerald", ItemBase::new);
    public static final RegistryObject<Item> KEY_HAMER_GOLD = ITEMS.register("key_hamer_gold", ItemBase::new);
    public static final RegistryObject<Item> KEY_HAMER_MYSTIC = ITEMS.register("key_hamer_mystic", ItemBase::new);
    public static final RegistryObject<Item> KEY_HAMER_REDSTONE = ITEMS.register("key_hamer_redstone", ItemBase::new);
    public static final RegistryObject<Item> KEY_HAMER_SILVER = ITEMS.register("key_hamer_silver", ItemBase::new);
    public static final RegistryObject<Item> PARAPLU_BLACK = ITEMS.register("paraplu_black", ItemBase::new);
    public static final RegistryObject<Item> PARAPLU_BLUE = ITEMS.register("paraplu_blue", ItemBase::new);
    public static final RegistryObject<Item> PARAPLU_CYAN = ITEMS.register("paraplu_cyan", ItemBase::new);
    public static final RegistryObject<Item> PARAPLU_LIME = ITEMS.register("paraplu_lime", ItemBase::new);
    public static final RegistryObject<Item> PARAPLU_GREEN = ITEMS.register("paraplu_green", ItemBase::new);
    public static final RegistryObject<Item> PARAPLU_PURPLE = ITEMS.register("paraplu_purple", ItemBase::new);
    public static final RegistryObject<Item> PARAPLU_RED = ITEMS.register("paraplu_red", ItemBase::new);
    public static final RegistryObject<Item> PARAPLU_WHITE = ITEMS.register("paraplu_white", ItemBase::new);
    public static final RegistryObject<Item> PARAPLU_YELLOW = ITEMS.register("paraplu_yellow", ItemBase::new);
    public static final RegistryObject<Item> RACECOIN1 = ITEMS.register("racecoin1", ItemBase::new);
    public static final RegistryObject<Item> RACECOIN10 = ITEMS.register("racecoin10", ItemBase::new);
    public static final RegistryObject<Item> RACECOIN50 = ITEMS.register("racecoin50", ItemBase::new);
    public static final RegistryObject<Item> RACECOIN100 = ITEMS.register("racecoin100", ItemBase::new);
    public static final RegistryObject<Item> RACECOIN500 = ITEMS.register("racecoin500", ItemBase::new);
    public static final RegistryObject<Item> RACECOIN1000 = ITEMS.register("racecoin1000", ItemBase::new);
    public static final RegistryObject<Item> RACECOIN2500 = ITEMS.register("racecoin2500", ItemBase::new);
    public static final RegistryObject<Item> RACECOIN5000 = ITEMS.register("racecoin5000", ItemBase::new);
    public static final RegistryObject<Item> ROLEX_GOLD = ITEMS.register("rolex_gold", ItemBase::new);
    public static final RegistryObject<Item> ROLEX_DIAMOND = ITEMS.register("rolex_diamond", ItemBase::new);
    public static final RegistryObject<Item> ROLEX_SILVER = ITEMS.register("rolex_silver", ItemBase::new);
    public static final RegistryObject<Item> APPLE_WATCH = ITEMS.register("apple_watch", ItemBase::new);
    public static final RegistryObject<Item> AIRPODS = ITEMS.register("airpods", ItemBase::new);
    public static final RegistryObject<Item> ARMBAND = ITEMS.register("armband", ItemBase::new);
    public static final RegistryObject<Item> ARMBAND2 = ITEMS.register("armband2", ItemBase::new);
    public static final RegistryObject<Item> TABLET = ITEMS.register("tablet", ItemBase::new);
    public static final RegistryObject<Item> ZWARTE_VLIEGENMEPPER = ITEMS.register("zwarte_vliegenmepper", ItemBase::new);
    public static final RegistryObject<Item> GOLDEN_VLIEGENMEPPER = ITEMS.register("golden_vliegenmepper", ItemBase::new);

    //Items (Not in tab) (/give command only)
    public static final RegistryObject<DiamondCore> DIAMONDCORE = ITEMS.register("diamondcore", DiamondCore::new);
    public static final RegistryObject<EmeraldCoin> EMERALDCOIN = ITEMS.register("emeraldcoin", EmeraldCoin::new);
}
