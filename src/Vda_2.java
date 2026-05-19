/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  ERa
 *  Gg
 *  Gl
 *  I
 *  KTa
 *  Mda
 *  NQa
 *  NTa
 *  QFa
 *  UZ
 *  Uqa
 *  VQa
 *  XTa
 *  Ypa
 *  ZFa
 *  Zta
 *  eAa
 *  hqa
 *  iea
 *  lqa
 *  pPa
 *  vRa
 */
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class Vda_2
extends eAa {
    public static final int[] I;

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Sx sx2, Gl gl2) {
        Vda_2 d2 = gl2;
        Vda_2 a2 = this;
        if (d2 instanceof ZFa) {
            void c2;
            ZFa b2 = (ZFa)d2;
            d2 = iea.byDyeDamage((int)c2.J());
            if (!b2.v() && b2.J() != d2) {
                b2.J((iea)d2);
                c2.E -= vRa.d;
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Sx sx2, Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4) {
        void f5;
        void h2;
        IBlockState d2;
        Object i2;
        void g2;
        Vda_2 vda_2 = object;
        Object object = xF2;
        Vda_2 e2 = vda_2;
        if (!g2.J(((XF)((Object)i2)).offset((DZ)((Object)d2)), (DZ)((Object)d2), (Mda)h2)) {
            return uSa.E != 0;
        }
        Object object2 = iea.byDyeDamage((int)h2.J());
        if (object2 == iea.WHITE) {
            if (Vda_2.J((Mda)h2, (Gg)f5, (XF)((Object)i2))) {
                if (!f5.e) {
                    f5.f(BRa.v, (XF)((Object)i2), uSa.E);
                }
                return vRa.d != 0;
            }
        } else if (object2 == iea.BROWN && (object2 = f5.J((XF)((Object)i2))).J() == QFa.UA && object2.J(BlockPlanks.VARIANT) == BlockPlanks$EnumType.JUNGLE) {
            if (d2 == DZ.DOWN) {
                return uSa.E != 0;
            }
            if (d2 == DZ.UP) {
                return uSa.E != 0;
            }
            if (f5.J((XF)((Object)(i2 = ((XF)((Object)i2)).offset((DZ)((Object)d2)))))) {
                void a2;
                void b2;
                void c2;
                d2 = QFa.p.J((Gg)f5, (XF)((Object)i2), (DZ)((Object)d2), (float)c2, (float)b2, (float)a2, uSa.E, (Gl)g2);
                f5.J((XF)((Object)i2), d2, uqa.g);
                if (!g2.h.f()) {
                    h2.E -= vRa.d;
                }
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        Object d2 = yGa2;
        Vda_2 b2 = this;
        int n2 = d2 = uSa.E;
        while (n2 < ERa.C) {
            void c2;
            void a2;
            a2.add(new Mda((eAa)c2, vRa.d, d2++));
            n2 = d2;
        }
    }

    public static void J(Gg gg2, XF xF2, int n2) {
        Block block;
        int a2;
        Object c2 = xF2;
        Gg b2 = gg2;
        if (a2 == 0) {
            a2 = Ypa.A;
        }
        if ((block = b2.J((XF)((Object)c2)).J()).J() != Material.air) {
            int n3;
            block.J((I)b2, (XF)((Object)c2));
            int n4 = n3 = uSa.E;
            while (n4 < a2) {
                double d2 = M.nextGaussian() * GPa.g;
                double d3 = M.nextGaussian() * GPa.g;
                double d4 = M.nextGaussian() * GPa.g;
                int n5 = --1;
                b2.J(UZ.VILLAGER_HAPPY, (double)((float)c2.getX() + M.nextFloat()), (double)c2.getY() + (double)M.nextFloat() * block.C(), (double)((float)c2.getZ() + M.nextFloat()), d2, d3, d4, new int[uSa.E]);
                n4 = ++n3;
            }
        }
    }

    public String C(Mda mda2) {
        Vda_2 b22 = mda2;
        Vda_2 a2 = this;
        int b22 = b22.J();
        return new StringBuilder().insert(2 & 5, super.J()).append(VQa.ja).append(iea.byDyeDamage((int)b22).getUnlocalizedName()).toString();
    }

    static {
        int[] nArray = new int[ERa.C];
        nArray[uSa.E] = Zta.d;
        nArray[vRa.d] = Bua.T;
        nArray[uqa.g] = WOa.q;
        nArray[yRa.d] = Jta.Aa;
        nArray[AQa.P] = vua.Ma;
        nArray[tTa.h] = ypa.ja;
        nArray[uua.p] = kua.ca;
        nArray[XTa.W] = cPa.b;
        nArray[Yqa.i] = Uqa.la;
        nArray[WOa.fa] = Zra.k;
        nArray[NTa.C] = hqa.Aa;
        nArray[pPa.f] = WRa.O;
        nArray[lqa.s] = UOa.f;
        nArray[uua.s] = NQa.B;
        nArray[hpa.Z] = KTa.A;
        nArray[Ypa.A] = SPa.s;
        I = nArray;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(Mda mda2, Gg gg2, XF xF2) {
        void a2;
        void b2;
        Mda mda3 = mda2;
        IBlockState c2 = b2.J((XF)a2);
        if (c2.J() instanceof IGrowable) {
            IGrowable iGrowable = (IGrowable)((Object)c2.J());
            void v0 = b2;
            if (iGrowable.J((Gg)v0, (XF)a2, c2, v0.e)) {
                if (!b2.e) {
                    void v1 = b2;
                    if (iGrowable.J((Gg)v1, v1.v, (XF)a2, c2)) {
                        void v2 = b2;
                        iGrowable.J((Gg)v2, v2.v, (XF)a2, c2);
                    }
                    mda3.E -= vRa.d;
                }
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }

    public Vda_2() {
        Vda_2 a2;
        Vda_2 vda_2 = a2;
        vda_2.J(vRa.d != 0);
        a2.f(uSa.E);
        a2.J(yGa.E);
    }
}

