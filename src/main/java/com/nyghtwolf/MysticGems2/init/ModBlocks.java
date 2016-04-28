package com.nyghtwolf.MysticGems2.init;

import com.nyghtwolf.MysticGems2.block.BlockMysticInfuser;
import com.nyghtwolf.MysticGems2.reference.Reference;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)

public class ModBlocks {
    public static final BlockMysticInfuser MysticInfuser = new BlockMysticInfuser();

    public static void init(){
        //GameRegistry.registerBlock(MysticInfuser, "MysticInfuser");
    }
}
