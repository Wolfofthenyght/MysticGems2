package com.nyghtwolf.MysticGems2.block;

import com.nyghtwolf.MysticGems2.entity.TileEntityMysticInfuser;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockMysticInfuser extends BlockContainer{

    public static final PropertyDirection FACING = BlockHorizontal.FACING;

    @SideOnly(Side.CLIENT)
    public BlockMysticInfuser(){

        super(Material.iron);
        this.setStepSound(SoundType.METAL);
        this.setHardness(2.0F);
        this.setResistance(8.0F);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        //this.setCreativeTab(CreativeTabMysticGems2.MysticGemsTab);
    }

    public int getRenderType(){
        return -1;
    }

    public boolean isOpaqueCube(){
        return false;
    }

    @Override
    public Block setUnlocalizedName(String MysticInfuser) {
        return super.setUnlocalizedName(MysticInfuser);
    }

    @Override
    public TileEntity createNewTileEntity(World var1, int var2){
        return new TileEntityMysticInfuser();
    }
}