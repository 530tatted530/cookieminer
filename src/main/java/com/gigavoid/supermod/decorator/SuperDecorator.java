package com.gigavoid.supermod.decorator;

import net.minecraft.world.World;

import java.util.Random;

public class SuperDecorator {

    public static enum GenType {EMERALD_FOREST};

    public GenType gtype;

    public int emeraldFlowersPerChunk;
    public int emeraldBigTreesPerChunk;
    public int emeraldTreesPerChunk;
    public int northTreesPerChunk;

    public boolean emeraldTreeHead[] = new boolean[7 * 7 * 3];
    public boolean northTreeHead[] = new boolean[5 * 5];

    public SuperDecorator(){
        setEmeraldTreeHead();
        setNorthTreeHead();
    }

    public void decorate(World p_76728_1_, Random p_76728_2_, int p_76728_3_, int p_76728_4_)
    {
        boolean doGen = gtype == GenType.EMERALD_FOREST;
        if(doGen) {
            genDecorations(p_76728_1_, p_76728_2_, p_76728_3_, p_76728_4_);
        }
    }

    public void genDecorations(World p_76728_1_, Random p_76728_2_, int p_76728_3_, int p_76728_4_){}

    public void setEmeraldTreeHead(){
        //FirstLayer
        emeraldTreeHead[2] = emeraldTreeHead[46] = true;
        emeraldTreeHead[3] = emeraldTreeHead[45] = true;
        emeraldTreeHead[4] = emeraldTreeHead[44] = true;
        emeraldTreeHead[8] = emeraldTreeHead[40] = true;
        emeraldTreeHead[9] = emeraldTreeHead[39] = true;
        emeraldTreeHead[10] = emeraldTreeHead[38] = true;
        emeraldTreeHead[11] = emeraldTreeHead[37] = true;
        emeraldTreeHead[12] = emeraldTreeHead[36] = true;

        for (int i = 14; i < 35; i++)
            emeraldTreeHead[i] = true;

        //Second layer
        emeraldTreeHead[59] = emeraldTreeHead[87] = true;
        emeraldTreeHead[65] = emeraldTreeHead[81] = true;
        emeraldTreeHead[66] = emeraldTreeHead[80] = true;
        emeraldTreeHead[67] = emeraldTreeHead[79] = true;
        emeraldTreeHead[71] = true;
        emeraldTreeHead[72] = true;
        emeraldTreeHead[73] = true;
        emeraldTreeHead[74] = true;
        emeraldTreeHead[75] = true;

        //Third layer
        emeraldTreeHead[115] = emeraldTreeHead[129] = true;
        emeraldTreeHead[121] = true;
        emeraldTreeHead[122] = true;
        emeraldTreeHead[123] = true;
    }

    public void setNorthTreeHead(){
        northTreeHead[1] = northTreeHead[23] = true;
        northTreeHead[2] = northTreeHead[22] = true;
        northTreeHead[3] = northTreeHead[21] = true;

        for(int i = 5; i < 20; i++){
            northTreeHead[i] = true;
        }
    }
}
