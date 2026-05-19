/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  NTa
 *  Oz
 *  Ypa
 *  qta
 *  vL
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.BlockBasePressurePlate;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockPressurePlateWeighted
extends BlockBasePressurePlate {
    private final int field_150068_a;
    public static final PropertyInteger POWER = PropertyInteger.J(APa.S, uSa.E, Ypa.A);

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockPressurePlateWeighted a2 = this;
        return a2.J().J(POWER, b2);
    }

    @Override
    public BlockState J() {
        BlockPressurePlateWeighted a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = POWER;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    public BlockPressurePlateWeighted(Material material, int n2, MapColor mapColor) {
        void b2;
        void c2;
        BlockPressurePlateWeighted a2;
        MapColor d2 = mapColor;
        BlockPressurePlateWeighted blockPressurePlateWeighted = a2 = this;
        super((Material)c2, d2);
        blockPressurePlateWeighted.J(blockPressurePlateWeighted.blockState.J().J(POWER, uSa.E));
        blockPressurePlateWeighted.field_150068_a = b2;
    }

    @Override
    public int J(Gg gg2) {
        BlockPressurePlateWeighted b2 = gg2;
        BlockPressurePlateWeighted a2 = this;
        return NTa.C;
    }

    /*
     * WARNING - void declaration
     */
    public BlockPressurePlateWeighted(Material material, int n2) {
        void b2;
        int c2 = n2;
        BlockPressurePlateWeighted a2 = this;
        void v0 = b2;
        a2((Material)v0, c2, v0.J());
    }

    @Override
    public int d(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockPressurePlateWeighted a2 = this;
        return b2.J(POWER);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(IBlockState iBlockState, int n2) {
        void b2;
        int c2 = n2;
        BlockPressurePlateWeighted a2 = this;
        return b2.J(POWER, c2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int l(Gg gg2, XF xF) {
        void a2;
        BlockPressurePlateWeighted c22 = gg2;
        BlockPressurePlateWeighted b2 = this;
        int c22 = Math.min(c22.J(vL.class, b2.J((XF)a2)).size(), b2.field_150068_a);
        if (c22 > 0) {
            return Oz.f((float)((float)Math.min(b2.field_150068_a, c22) / (float)b2.field_150068_a * qta.D));
        }
        return uSa.E;
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockPressurePlateWeighted a2 = this;
        return b2.J(POWER);
    }
}

