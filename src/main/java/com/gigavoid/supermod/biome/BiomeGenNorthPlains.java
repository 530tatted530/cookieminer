package com.gigavoid.supermod.biome;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

/**
 * Created by Rasmus on 2014-11-03.
 */
public class BiomeGenNorthPlains extends BiomeGenBase {
    public BiomeGenNorthPlains(){
        super(43);

        setBiomeName("Northrend Plains");
        setHeight(new BiomeGenBase.Height(.2f, .05f));
        waterColorMultiplier = 0xFFFFFF;
        topBlock = Block.getBlockFromName("snow");
        fillerBlock = Block.getBlockFromName("snow");
        temperature = 0.0f;
        rainfall = 1.0f;
    }
}