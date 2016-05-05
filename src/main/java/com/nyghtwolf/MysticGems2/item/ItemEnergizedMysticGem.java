package com.nyghtwolf.MysticGems2.item;

import com.nyghtwolf.MysticGems2.creativetab.CreativeTabMysticGems2;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

public class ItemEnergizedMysticGem extends ItemMysticGems2{
    public ItemEnergizedMysticGem() {
        super();
        this.setUnlocalizedName("EnergizedMysticGem");
        this.maxStackSize = 64;
        this.setNoRepair();
        this.setCreativeTab(CreativeTabMysticGems2.MysticGems2_Tab);
    }

}