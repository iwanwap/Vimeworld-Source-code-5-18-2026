/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AZ
 *  BRa
 *  Gg
 *  Jy
 *  NTa
 *  QFa
 *  Ypa
 *  aSa
 *  cga
 *  psa
 *  vRa
 *  vpa
 */
import java.util.Random;
import net.minecraft.block.BlockFlower$EnumFlowerType;
import net.minecraft.block.material.Material;

public final class wZ
extends Jy {
    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Random random, oz oz2, int n2, int n3, double d2) {
        void a2;
        void e2;
        void f2;
        wZ wZ2;
        void d3;
        void b2;
        void c2;
        block3: {
            double d4;
            wZ wZ3 = this;
            double d5 = h.J((double)c2 * VPa.W, (double)b2 * VPa.W);
            if (d4 > aSa.V) {
                int g;
                int n4 = c2 & Ypa.A;
                int n5 = b2 & Ypa.A;
                int n6 = g = osa.Ja;
                while (n6 >= 0) {
                    if (d3.J(n5, g, n4).J().J() != Material.air) {
                        if (g != ITa.V || d3.J(n5, g, n4).J() == QFa.sc) break;
                        d3.J(n5, g, n4, QFa.sc.J());
                        if (!(d5 < BRa.Y)) break;
                        wZ2 = wZ3;
                        d3.J(n5, g + vRa.d, n4, QFa.pB.J());
                        break block3;
                    }
                    n6 = --g;
                }
            }
            wZ2 = wZ3;
        }
        wZ2.f((Gg)f2, (Random)e2, (oz)d3, (int)c2, (int)b2, (double)a2);
    }

    public BlockFlower$EnumFlowerType J(Random random, XF xF) {
        Object c2 = xF;
        wZ a2 = this;
        return BlockFlower$EnumFlowerType.BLUE_ORCHID;
    }

    public int J(XF xF) {
        Object b2 = xF;
        wZ a2 = this;
        return vpa.h;
    }

    public int f(XF xF) {
        Object b2 = xF;
        wZ a2 = this;
        if (h.J((double)b2.getX() * psa.C, (double)b2.getZ() * psa.C) < Upa.N) {
            return Iqa.C;
        }
        return vpa.h;
    }

    public wZ(int n2) {
        wZ a2;
        int b2 = n2;
        wZ wZ2 = a2 = this;
        super(b2);
        wZ2.A.h = uqa.g;
        wZ2.A.C = vRa.d;
        wZ2.A.W = vRa.d;
        wZ2.A.d = Yqa.i;
        wZ2.A.H = NTa.C;
        wZ2.A.B = vRa.d;
        wZ2.A.F = AQa.P;
        wZ2.A.c = uSa.E;
        wZ2.A.m = uSa.E;
        wZ2.A.T = tTa.h;
        wZ2.t = NTa.l;
        wZ2.ga.add(new AZ(cga.class, vRa.d, vRa.d, vRa.d));
    }

    public bV J(Random random) {
        Object b2 = random;
        wZ a2 = this;
        return a2.ka;
    }
}

