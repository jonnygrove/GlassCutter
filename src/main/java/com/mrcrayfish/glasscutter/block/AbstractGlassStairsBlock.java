package com.mrcrayfish.glasscutter.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import sun.security.provider.SHA;

import java.util.function.Supplier;

/**
 * Author: MrCrayfish
 */
public class AbstractGlassStairsBlock extends StairsBlock
{
    private Supplier<BlockState> state;

    public AbstractGlassStairsBlock(Supplier<BlockState> state, Properties properties)
    {
        super(state, properties);
        this.state = state;
    }

    public boolean isTransparent(BlockState state)
    {
        return true;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public boolean isSideInvisible(BlockState state, BlockState adjacentState, Direction side)
    {
        if(adjacentState.getBlock() == this && adjacentState.get(HALF) == state.get(HALF))
        {
            if(adjacentState.get(FACING) != state.get(FACING).getOpposite())
            {
                return true;
            }
        }
        if(adjacentState.getBlock() == this.state.get().getBlock())
        {
            return true;
        }
        return super.isSideInvisible(state, adjacentState, side);
    }

    @OnlyIn(Dist.CLIENT)
    public float getAmbientOcclusionLightValue(BlockState state, IBlockReader worldIn, BlockPos pos)
    {
        return 1.0F;
    }

    @Override
    public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos)
    {
        return true;
    }

    @Override
    public boolean causesSuffocation(BlockState state, IBlockReader worldIn, BlockPos pos)
    {
        return false;
    }

    @Override
    public boolean isNormalCube(BlockState state, IBlockReader worldIn, BlockPos pos)
    {
        return false;
    }

    @Override
    public boolean canEntitySpawn(BlockState state, IBlockReader worldIn, BlockPos pos, EntityType<?> type)
    {
        return false;
    }
}
