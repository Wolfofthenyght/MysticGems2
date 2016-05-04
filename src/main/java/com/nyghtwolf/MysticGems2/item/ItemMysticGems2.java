package com.nyghtwolf.MysticGems2.item;

import com.nyghtwolf.MysticGems2.creativetab.CreativeTabMysticGems2;
import com.nyghtwolf.MysticGems2.reference.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemMysticGems2 extends Item {

    public ItemMysticGems2(){
        super();
        this.setCreativeTab(CreativeTabMysticGems2.MysticGems2_Tab);
    }

    @Override
    public String getUnlocalizedName(){
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack){
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName (String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
