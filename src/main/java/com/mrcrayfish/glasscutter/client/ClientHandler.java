package com.mrcrayfish.glasscutter.client;

import com.mrcrayfish.glasscutter.client.gui.screen.inventory.GlasscutterScreen;
import com.mrcrayfish.glasscutter.init.ModBlocks;
import com.mrcrayfish.glasscutter.init.ModContainers;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.model.BlockModel;
//import net.minecraft.client.renderer.RenderType;
//import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.util.BlockRenderLayer;

/**
 * Author: MrCrayfish
 */
public class ClientHandler
{
    public static void setup()
    {
    	
    	/*
        RenderTypeLookup.setRenderLayer(ModBlocks.GLASSCUTTER, RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.GLASS_STAIRS, RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.GLASS_SLAB, RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_STAINED_GLASS_STAIRS, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_STAINED_GLASS_STAIRS, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_STAINED_GLASS_STAIRS, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_STAINED_GLASS_STAIRS, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_STAINED_GLASS_STAIRS, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_STAINED_GLASS_STAIRS, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_STAINED_GLASS_STAIRS, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYAN_STAINED_GLASS_STAIRS, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_STAINED_GLASS_STAIRS, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_STAINED_GLASS_STAIRS, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_STAINED_GLASS_STAIRS, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_STAINED_GLASS_STAIRS, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.RED_STAINED_GLASS_STAIRS, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_STAINED_GLASS_STAIRS, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_STAINED_GLASS_SLAB, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_STAINED_GLASS_SLAB, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_STAINED_GLASS_SLAB, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_STAINED_GLASS_SLAB, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_STAINED_GLASS_SLAB, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_STAINED_GLASS_SLAB, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_STAINED_GLASS_SLAB, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYAN_STAINED_GLASS_SLAB, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_STAINED_GLASS_SLAB, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_STAINED_GLASS_SLAB, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_STAINED_GLASS_SLAB, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_STAINED_GLASS_SLAB, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.RED_STAINED_GLASS_SLAB, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_STAINED_GLASS_SLAB, RenderType.translucent());
        */
        ScreenManager.registerFactory(ModContainers.GLASSCUTTER, GlasscutterScreen::new);
    }
}
