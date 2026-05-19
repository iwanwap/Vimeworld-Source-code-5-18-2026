/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  I
 *  JPa
 *  Mda
 *  Yra
 *  eAa
 *  iea
 *  pqa
 *  vRa
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockCarpet
extends Block {
    public static final PropertyEnum<iea> COLOR = PropertyEnum.J(Zra.L, iea.class);

    /*
     * WARNING - void declaration
     */
    private boolean l(Gg gg2, XF xF2) {
        void b2;
        XF c2 = xF2;
        BlockCarpet a2 = this;
        if (!b2.J(c2.down())) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public void f() {
        BlockCarpet a2;
        a2.J(uSa.E);
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockCarpet a2 = this;
        return b2.J(COLOR).getMetadata();
    }

    @Override
    public BlockState J() {
        BlockCarpet a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = COLOR;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    public void J(int n2) {
        int b22 = n2;
        BlockCarpet a2 = this;
        b22 = uSa.E;
        float b22 = (float)(vRa.d * (vRa.d + b22)) / Yra.i;
        a2.J(JPa.N, JPa.N, JPa.N, pqa.r, b22, pqa.r);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(I i2, XF xF2, DZ dZ2) {
        void b2;
        void c2;
        Object d2 = dZ2;
        BlockCarpet a2 = this;
        if (d2 == DZ.UP) {
            return vRa.d != 0;
        }
        return super.J((I)c2, (XF)b2, (DZ)((Object)d2));
    }

    @Override
    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockCarpet a2 = this;
        return b2.J(COLOR).getMapColor();
    }

    public BlockCarpet() {
        BlockCarpet a2;
        BlockCarpet blockCarpet = a2;
        super(Material.carpet);
        blockCarpet.J(blockCarpet.blockState.J().J(COLOR, iea.WHITE));
        blockCarpet.J(JPa.N, JPa.N, JPa.N, pqa.r, rRa.T, pqa.r);
        blockCarpet.J(vRa.d != 0);
        a2.J(yGa.a);
        a2.J(uSa.E);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2) {
        void b2;
        BlockCarpet a2 = this;
        Object c2 = xF2;
        if (super.J((Gg)b2, (XF)((Object)c2)) && a2.l((Gg)b2, (XF)((Object)c2))) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public void J(I i2, XF xF2) {
        Object c2 = xF2;
        BlockCarpet a2 = this;
        a2.J(uSa.E);
    }

    @Override
    public int C(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockCarpet a2 = this;
        return b2.J(COLOR).getMetadata();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        yGa d2 = yGa2;
        BlockCarpet b2 = this;
        int n2 = d2 = uSa.E;
        while (n2 < ERa.C) {
            void c2;
            void a2;
            a2.add(new Mda((eAa)c2, vRa.d, d2++));
            n2 = d2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(Gg gg2, XF xF2, IBlockState iBlockState) {
        void c2;
        BlockCarpet b2 = this;
        Object d2 = xF2;
        if (!b2.l((Gg)c2, (XF)((Object)d2))) {
            void a2;
            void v0 = c2;
            b2.J((Gg)v0, (XF)((Object)d2), (IBlockState)a2, uSa.E);
            v0.G((XF)((Object)d2));
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        void c2;
        void d2;
        IBlockState e2 = iBlockState;
        BlockCarpet b2 = this;
        b2.J((Gg)d2, (XF)c2, e2);
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockCarpet a2 = this;
        return a2.J().J(COLOR, iea.byMetadata((int)b2));
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }
}

