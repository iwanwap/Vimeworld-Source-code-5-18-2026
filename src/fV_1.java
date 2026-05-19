/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  JPa
 *  KTa
 *  MD
 *  NTa
 *  QFa
 *  Uw
 *  Waa
 *  Xv
 *  mFa
 *  oA
 *  pqa
 *  pua
 *  vL
 *  vRa
 *  ysa
 */
import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockSandStone$EnumType;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public abstract class fV_1
extends uU {
    public int field_143015_k;
    private int villagersSpawned;
    private boolean isDesertVillage;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, Xv xv2, int n2, int n3, int n4, int n5, int n6, int n7, IBlockState iBlockState, IBlockState iBlockState2, boolean bl) {
        void a2;
        void d2;
        void e2;
        void f2;
        void g2;
        void h2;
        void i2;
        void j2;
        void k2;
        IBlockState l2;
        IBlockState c2;
        fV_1 b2;
        fV_1 fV_12 = iBlockState3;
        IBlockState iBlockState3 = iBlockState2;
        fV_1 fV_13 = b2 = fV_12;
        c2 = fV_13.J(c2);
        l2 = fV_13.J(l2);
        super.J((Gg)k2, (Xv)j2, (int)i2, (int)h2, (int)g2, (int)f2, (int)e2, (int)d2, c2, l2, (boolean)a2);
    }

    public fV_1() {
        fV_1 a2;
        a2.field_143015_k = pua.o;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Xv xv2, int n2, int n3, int n4, int n5) {
        void a2;
        fV_1 fV_12 = this;
        if (fV_12.villagersSpawned < a2) {
            int g2;
            int n6 = g2 = fV_12.villagersSpawned;
            while (n6 < a2) {
                void f2;
                mFa mFa2;
                void e2;
                void c2;
                void b2;
                void d2;
                fV_1 fV_13 = fV_12;
                int n7 = fV_13.J((int)(d2 + g2), (int)b2);
                int n8 = fV_13.J((int)c2);
                int n9 = fV_13.f((int)(d2 + g2), (int)b2);
                if (!e2.J((MD)new XF(n7, n8, n9))) {
                    return;
                }
                fV_12.villagersSpawned += vRa.d;
                mFa mFa3 = mFa2 = new mFa((Gg)f2);
                mFa3.f((double)n7 + kTa.B, (double)n8, (double)n9 + kTa.B, JPa.N, JPa.N);
                mFa3.J(f2.J(new XF((vL)mFa2)), (oA)null);
                mFa mFa4 = mFa2;
                mFa4.k(fV_12.l(++g2, mFa4.g()));
                f2.f((vL)mFa4);
                n6 = g2;
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public uU f(Uw uw2, List<uU> list, Random random, int n2, int n3) {
        int n4 = n3;
        fV_1 a2 = this;
        if (a2.coordBaseMode != null) {
            switch (zw.$SwitchMap$net$minecraft$util$EnumFacing[a2.coordBaseMode.ordinal()]) {
                case 1: {
                    void f2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    return pw.C((Uw)e2, (List)d2, (Random)c2, a2.boundingBox.minX - vRa.d, a2.boundingBox.minY + b2, a2.boundingBox.minZ + f2, DZ.WEST, a2.J());
                }
                case 2: {
                    void f2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    return pw.C((Uw)e2, (List)d2, (Random)c2, a2.boundingBox.minX - vRa.d, a2.boundingBox.minY + b2, a2.boundingBox.minZ + f2, DZ.WEST, a2.J());
                }
                case 3: {
                    void f2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    return pw.C((Uw)e2, (List)d2, (Random)c2, a2.boundingBox.minX + f2, a2.boundingBox.minY + b2, a2.boundingBox.minZ - vRa.d, DZ.NORTH, a2.J());
                }
                case 4: {
                    void f2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    return pw.C((Uw)e2, (List)d2, (Random)c2, a2.boundingBox.minX + f2, a2.boundingBox.minY + b2, a2.boundingBox.minZ - vRa.d, DZ.NORTH, a2.J());
                }
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, IBlockState iBlockState, int n2, int n3, int n4, Xv xv2) {
        void a2;
        void b2;
        void c2;
        void d2;
        void f2;
        fV_1 e2;
        Object g2 = iBlockState;
        fV_1 fV_12 = e2 = this;
        g2 = fV_12.J((IBlockState)g2);
        super.J((Gg)f2, (IBlockState)g2, (int)d2, (int)c2, (int)b2, (Xv)a2);
    }

    @Override
    public void f(Waa waa2) {
        fV_1 b2 = waa2;
        fV_1 a2 = this;
        fV_1 fV_12 = b2;
        fV_12.J(KTa.U, a2.field_143015_k);
        fV_12.J(Bta.Ka, a2.villagersSpawned);
        fV_12.J(pqa.V, a2.isDesertVillage);
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        fV_1 a2 = this;
        a2.isDesertVillage = b2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, IBlockState iBlockState, int n2, int n3, int n4, Xv xv2) {
        void a2;
        void b2;
        void c2;
        void d2;
        void f2;
        fV_1 e2;
        Object g2 = iBlockState;
        fV_1 fV_12 = e2 = this;
        g2 = fV_12.J((IBlockState)g2);
        super.f((Gg)f2, (IBlockState)g2, (int)d2, (int)c2, (int)b2, (Xv)a2);
    }

    public IBlockState J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        fV_1 a2 = this;
        if (a2.isDesertVillage) {
            if (b2.J() == QFa.UA || b2.J() == QFa.hf || b2.J() == QFa.nE) {
                return QFa.qC.J();
            }
            if (b2.J() == QFa.yB) {
                return QFa.qC.J(BlockSandStone$EnumType.DEFAULT.getMetadata());
            }
            if (b2.J() == QFa.L) {
                return QFa.qC.J(BlockSandStone$EnumType.SMOOTH.getMetadata());
            }
            if (b2.J() == QFa.WA) {
                return QFa.oa.J().J(BlockStairs.FACING, b2.J(BlockStairs.FACING));
            }
            if (b2.J() == QFa.We) {
                return QFa.oa.J().J(BlockStairs.FACING, b2.J(BlockStairs.FACING));
            }
            if (b2.J() == QFa.Q) {
                return QFa.qC.J();
            }
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    public fV_1(Uw uw2, int n2) {
        void a2;
        fV_1 c2 = uw2;
        fV_1 b2 = this;
        super((int)a2);
        b2.field_143015_k = pua.o;
        if (c2 != null) {
            b2.isDesertVillage = ((Uw)c2).inDesert;
        }
    }

    @Override
    public void J(Waa waa2) {
        fV_1 a2;
        fV_1 b2 = waa2;
        fV_1 fV_12 = a2 = this;
        fV_1 fV_13 = b2;
        a2.field_143015_k = fV_13.J(KTa.U);
        fV_12.villagersSpawned = fV_13.J(Bta.Ka);
        fV_12.isDesertVillage = b2.f(pqa.V);
    }

    public int l(int n2, int n3) {
        int c2 = n3;
        fV_1 a2 = this;
        return c2;
    }

    /*
     * WARNING - void declaration
     */
    public int J(Gg gg2, Xv xv2) {
        int n2;
        fV_1 fV_12 = this;
        int c2 = uSa.E;
        int n3 = uSa.E;
        zz zz2 = new zz();
        int n4 = n2 = fV_12.boundingBox.minZ;
        while (n4 <= fV_12.boundingBox.maxZ) {
            int n5 = fV_12.boundingBox.minX;
            while (n5 <= fV_12.boundingBox.maxX) {
                void a2;
                int n6;
                zz zz3 = zz2;
                zz3.func_181079_c(n6, ysa.s, n2);
                if (a2.J((MD)zz3)) {
                    void b2;
                    ++n3;
                    c2 += Math.max(b2.f((XF)zz2).getY(), b2.F.f());
                }
                n5 = ++n6;
            }
            n4 = ++n2;
        }
        if (n3 == 0) {
            return pua.o;
        }
        return c2 / n3;
    }

    public static boolean J(Xv a2) {
        if (a2 != null && a2.minY > NTa.C) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public uU J(Uw uw2, List<uU> list, Random random, int n2, int n3) {
        int n4 = n3;
        fV_1 a2 = this;
        if (a2.coordBaseMode != null) {
            switch (zw.$SwitchMap$net$minecraft$util$EnumFacing[a2.coordBaseMode.ordinal()]) {
                case 1: {
                    void f2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    return pw.C((Uw)e2, (List)d2, (Random)c2, a2.boundingBox.maxX + vRa.d, a2.boundingBox.minY + b2, a2.boundingBox.minZ + f2, DZ.EAST, a2.J());
                }
                case 2: {
                    void f2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    return pw.C((Uw)e2, (List)d2, (Random)c2, a2.boundingBox.maxX + vRa.d, a2.boundingBox.minY + b2, a2.boundingBox.minZ + f2, DZ.EAST, a2.J());
                }
                case 3: {
                    void f2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    return pw.C((Uw)e2, (List)d2, (Random)c2, a2.boundingBox.minX + f2, a2.boundingBox.minY + b2, a2.boundingBox.maxZ + vRa.d, DZ.SOUTH, a2.J());
                }
                case 4: {
                    void f2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    return pw.C((Uw)e2, (List)d2, (Random)c2, a2.boundingBox.minX + f2, a2.boundingBox.minY + b2, a2.boundingBox.maxZ + vRa.d, DZ.SOUTH, a2.J());
                }
            }
        }
        return null;
    }
}

