package com.nyghtwolf.MysticGems2;

//import com.nyghtwolf.MysticGems2.init.ModBlocks;
import com.nyghtwolf.MysticGems2.init.ModItems;
import com.nyghtwolf.MysticGems2.init.ModRecipes;
import com.nyghtwolf.MysticGems2.init.ModTileEntities;
import com.nyghtwolf.MysticGems2.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import com.nyghtwolf.MysticGems2.reference.Reference;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = "Mysticgems2", version= "1.9-0.1a")

public class Mysticgems2 {
    @Mod.Instance(Reference.MOD_ID)
    public static Mysticgems2 instance;

    public static final String modid = "Mysticgems2";
    public static int GuiMysticfuser = 1;
    //public Mysticgems2GUIHandler guiHandler = new Mysticgems2GUIHandler();

    @SidedProxy(clientSide = "com.nyghtwolf.Mysticgems2.proxy.ClientProxy", serverSide = "com.nyghtwolf.Mysticgems2.proxy.CommonProxy")
    public static CommonProxy WolfProxy;

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
        //WolfProxy.registerRenderThings();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        //NetworkRegistry.INSTANCE.registerGuiHandler(instance, new Mysticgems2GUIHandler());
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
