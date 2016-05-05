package com.nyghtwolf.MysticGems2;

//import com.nyghtwolf.MysticGems2.init.ModBlocks;
import com.nyghtwolf.MysticGems2.init.ModItems;
import com.nyghtwolf.MysticGems2.init.ModRecipes;
import com.nyghtwolf.MysticGems2.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import com.nyghtwolf.MysticGems2.reference.Reference;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = "MysticGems2", version= "1.9-0.1a")

public class MysticGems2 {
    @Mod.Instance(Reference.MOD_ID)
    public static MysticGems2 instance;

    public static final String modid = "MysticGems2";
    public static int GuiMysticfuser = 1;
    //public Mysticgems2GUIHandler guiHandler = new Mysticgems2GUIHandler();

    @SidedProxy(clientSide = "com.nyghtwolf.MysticGems2.proxy.ClientProxy", serverSide = "com.nyghtwolf.MysticGems2.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        //Items Init
        ModItems.init();

        //Block Init
        //ModBlocks.init();

        //Entity Init
        //ModTileEntities.init();

        //Recipes Init
        ModRecipes.init();

        //Renders Init
        //proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        this.proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        this.proxy.postInit(event);
    }


}
