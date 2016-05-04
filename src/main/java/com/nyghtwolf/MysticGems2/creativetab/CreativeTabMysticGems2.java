package com.nyghtwolf.MysticGems2.creativetab;

import com.nyghtwolf.MysticGems2.init.ModItems;
import com.nyghtwolf.MysticGems2.reference.Reference;
import com.sun.org.apache.xpath.internal.operations.String;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabMysticGems2 {

    public static final CreativeTabs MysticGems2_Tab = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.EnergizedMysticGem;
        }

        @Override
        public java.lang.String getTranslatedTabLabel()
        {
            return "Mystic Gems 2";
        }
    };
}
