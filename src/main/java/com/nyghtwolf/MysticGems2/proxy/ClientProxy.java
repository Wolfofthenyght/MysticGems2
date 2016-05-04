package com.nyghtwolf.MysticGems2.proxy;

//import com.nyghtwolf.MysticGems2.entity.TileEntityMysticInfuser;
import com.nyghtwolf.MysticGems2.Mysticgems2;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

    public void registerRenders(Mysticgems2 reg){

        reg.ItemEnergizedMysticGem.registerRenders();
        //Gem Fuser Render
        //TileEntitySpecialRenderer render = new RenderGemFuser();
        //ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGemFuser.class, render);

        //Mystic Infuser Render
        //TileEntitySpecialRenderer render2 = new RenderMysticInfuser();
        //ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMysticInfuser.class, render2);
    }

    public void registerTileTEntitySpecialRenderer(){

    }
}