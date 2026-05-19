/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  I
 *  JPa
 *  MQa
 *  UZ
 *  aga
 *  eAa
 *  pqa
 *  psa
 *  vL
 *  vRa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class BlockDragonEgg
extends Block {
    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        void c2;
        BlockDragonEgg d2;
        BlockDragonEgg e2 = gg2;
        BlockDragonEgg blockDragonEgg = d2 = this;
        e2.J((XF)c2, blockDragonEgg, blockDragonEgg.J((Gg)e2));
    }

    /*
     * WARNING - void declaration
     */
    private void l(Gg gg2, XF xF2) {
        void a2;
        BlockDragonEgg c2 = gg2;
        BlockDragonEgg b2 = this;
        IBlockState iBlockState = c2.J((XF)a2);
        if (iBlockState.J() == b2) {
            int n2;
            int n3 = n2 = uSa.E;
            while (n3 < PRa.U) {
                XF xF3 = a2.add(((Gg)c2).v.nextInt(ERa.C) - ((Gg)c2).v.nextInt(ERa.C), ((Gg)c2).v.nextInt(Yqa.i) - ((Gg)c2).v.nextInt(Yqa.i), ((Gg)c2).v.nextInt(ERa.C) - ((Gg)c2).v.nextInt(ERa.C));
                if (c2.J((XF)xF3).J().blockMaterial == Material.air) {
                    if (((Gg)c2).e) {
                        int n4;
                        int n5 = n4 = uSa.E;
                        while (n5 < XOa.h) {
                            BlockDragonEgg blockDragonEgg = c2;
                            BlockDragonEgg blockDragonEgg2 = c2;
                            double d2 = ((Gg)blockDragonEgg2).v.nextDouble();
                            float f2 = (((Gg)blockDragonEgg2).v.nextFloat() - MQa.L) * psa.N;
                            float f3 = (((Gg)blockDragonEgg).v.nextFloat() - MQa.L) * psa.N;
                            float f4 = (((Gg)blockDragonEgg).v.nextFloat() - MQa.L) * psa.N;
                            XF xF4 = xF3;
                            double d3 = (double)xF4.getX() + (double)(a2.getX() - xF3.getX()) * d2 + (((Gg)c2).v.nextDouble() - kTa.B) * oua.i + kTa.B;
                            double d4 = (double)xF4.getY() + (double)(a2.getY() - xF3.getY()) * d2 + ((Gg)c2).v.nextDouble() * oua.i - kTa.B;
                            d2 = (double)xF3.getZ() + (double)(a2.getZ() - xF3.getZ()) * d2 + (((Gg)c2).v.nextDouble() - kTa.B) * oua.i + kTa.B;
                            int n6 = 4 ^ 5;
                            blockDragonEgg.J(UZ.PORTAL, d3, d4, d2, f2, f3, f4, new int[uSa.E]);
                            n5 = ++n4;
                        }
                    } else {
                        c2.J(xF3, iBlockState, uqa.g);
                        c2.G((XF)a2);
                    }
                    return;
                }
                n3 = ++n2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void f(Gg gg2, XF xF2) {
        void b2;
        Object c2 = xF2;
        BlockDragonEgg a2 = this;
        if (BlockFalling.l((Gg)b2, ((XF)((Object)c2)).down()) && c2.getY() >= 0) {
            int n2 = fPa.i;
            if (!BlockFalling.fallInstantly) {
                int n3 = n2;
                if (b2.J(((XF)((Object)c2)).add(-n2, -n2, -n2), ((XF)((Object)c2)).add(n3, n3, n3))) {
                    void v1 = b2;
                    void v2 = b2;
                    v2.f((vL)new aga((Gg)v2, (double)((float)c2.getX() + MQa.L), (double)c2.getY(), (double)((float)c2.getZ() + MQa.L), a2.J()));
                    return;
                }
            }
            void v3 = b2;
            void v4 = v3;
            v3.G((XF)((Object)c2));
            while (BlockFalling.l((Gg)v4, (XF)((Object)c2)) && c2.getY() > 0) {
                c2 = ((XF)((Object)c2)).down();
                v4 = b2;
            }
            if (c2.getY() > 0) {
                b2.J((XF)((Object)c2), a2.J(), uqa.g);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, Sx sx2) {
        void c2;
        Object d2 = xF2;
        BlockDragonEgg b2 = this;
        b2.l((Gg)c2, (XF)((Object)d2));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        void d2;
        Object e2 = xF2;
        BlockDragonEgg c2 = this;
        c2.f((Gg)d2, (XF)((Object)e2));
    }

    @Override
    public boolean J(I i2, XF xF2, DZ dZ2) {
        Object d2 = dZ2;
        BlockDragonEgg a2 = this;
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, Sx sx2, DZ dZ2, float f2, float f3, float f4) {
        void h2;
        Object i2 = xF2;
        BlockDragonEgg g2 = this;
        g2.l((Gg)h2, (XF)((Object)i2));
        return vRa.d != 0;
    }

    public BlockDragonEgg() {
        BlockDragonEgg a2;
        BlockDragonEgg blockDragonEgg = a2;
        super(Material.dragonEgg, MapColor.blackColor);
        blockDragonEgg.J(rRa.T, JPa.N, rRa.T, pqa.Ha, pqa.r, pqa.Ha);
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    @Override
    public eAa J(Gg gg2, XF xF2) {
        Object c2 = xF2;
        BlockDragonEgg a2 = this;
        return null;
    }

    @Override
    public int J(Gg gg2) {
        BlockDragonEgg b2 = gg2;
        BlockDragonEgg a2 = this;
        return tTa.h;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        BlockDragonEgg c2;
        BlockDragonEgg d2 = gg2;
        BlockDragonEgg blockDragonEgg = c2 = this;
        d2.J((XF)b2, blockDragonEgg, blockDragonEgg.J((Gg)d2));
    }
}

