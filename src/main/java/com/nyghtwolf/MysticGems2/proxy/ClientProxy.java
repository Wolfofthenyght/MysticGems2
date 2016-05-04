package com.nyghtwolf.MysticGems2.proxy;

//import com.nyghtwolf.MysticGems2.entity.TileEntityMysticInfuser;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

    public void registerRenderThings(){
        //Gem Fuser Render
     //   TileEntitySpecialRenderer render = new RenderGemFuser();
        //   ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGemFuser.class, render);

        //Mystic Infuser Render
        //TileEntitySpecialRenderer render2 = new RenderMysticInfuser();
        //ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMysticInfuser.class, render2);
    }
    //Mystic Core Armor Render
    //public int addArmor(String armor){
    //  return RenderingRegistry.addNewArmourRendererPrefix(armor);
    //}

    public void registerTileTEntitySpecialRenderer(){

    }
}