package com.nyghtwolf.MysticGems2.init;

import com.nyghtwolf.MysticGems2.item.ItemMysticGems2;
import com.nyghtwolf.MysticGems2.reference.Reference;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)

public class ModItems {
    public static final ItemMysticGems2 EnergizedMysticGem = new com.nyghtwolf.MysticGems2.item.ItemEnergizedMysticGem();
    //public static final ItemMysticGems2 ProsperousMysticGem = new com.nyghtwolf.MysticGems2.item.ItemProsperousMysticGem();
    //public static final ItemMysticGems2 ShimmeringMysticGem = new com.nyghtwolf.MysticGems2.item.ItemShimmeringMysticGem();
    //public static final ItemMysticGems2 TimelessMysticGem = new com.nyghtwolf.MysticGems2.item.ItemTimelessMysticGem();
    //public static final ItemMysticGems2 MysticCoreGem = new com.nyghtwolf.MysticGems2.item.ItemMysticCoreGem();

    //Define Swords
    //public static final SwordMysticCore SwordMysticCore = new SwordMysticCore();

    //Define Lance
    //public static final LanceMysticCore LanceMysticCore = new LanceMysticCore();

    //Define Shields
    //public static final ShieldeMysticCore ShieldeMysticCore = new ShieldeMysticCore();

    //Define Mystic Arrows

    public static void init()
    {
        //Register Items
        //GameRegistry.makeItemStack(SwordMysticCore, 0, 1, "SwordMysticCore");

        //Register Armor

        //Register Mystic Arrows

    }

}
