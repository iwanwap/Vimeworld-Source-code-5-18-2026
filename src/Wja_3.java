/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  GC
 *  KTa
 *  Lra
 *  MQa
 *  XTa
 *  Ypa
 *  aKa
 *  aSa
 *  bpa
 *  cEa
 *  mka
 *  pKa
 *  pPa
 *  uKa
 *  vRa
 */
import java.util.Random;
import net.minecraft.util.ResourceLocation;

public final class Wja_3
extends GC<cEa> {
    public Wja_3(oLa oLa2) {
        Object b2 = oLa2;
        Wja_3 a2 = this;
        super((oLa)b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(cEa cEa2, double d2, double d3, double d4, float f2, float f3) {
        int n2;
        void f4;
        Wja_3 wja_3 = this;
        pKa b2 = pKa.J();
        aKa a2 = b2.J();
        uKa.z();
        uKa.L();
        uKa.B();
        uKa.f((int)Lra.k, (int)vRa.d);
        double[] dArray = new double[Yqa.i];
        double[] dArray2 = new double[Yqa.i];
        double d5 = aSa.V;
        double d6 = aSa.V;
        Random random = new Random(f4.J);
        int n3 = n2 = XTa.W;
        while (n3 >= 0) {
            int n4 = n2--;
            dArray[n4] = d5;
            dArray2[n4] = d6;
            d5 += (double)(random.nextInt(pPa.f) - tTa.h);
            d6 += (double)(random.nextInt(pPa.f) - tTa.h);
            n3 = n2;
        }
        int n5 = n2 = uSa.E;
        while (n5 < AQa.P) {
            random = new Random(f4.J);
            int n6 = uSa.E;
            while (n6 < yRa.d) {
                int n7;
                int g2 = XTa.W;
                int n8 = uSa.E;
                if (n7 > 0) {
                    g2 = XTa.W - n7;
                }
                if (n7 > 0) {
                    n8 = g2 - uqa.g;
                }
                double d7 = dArray[g2] - d5;
                double d8 = dArray2[g2] - d6;
                int n9 = g2 = g2;
                while (n9 >= n8) {
                    aKa aKa2;
                    double d9 = d7;
                    double d10 = d8;
                    if (n7 == 0) {
                        d7 += (double)(random.nextInt(pPa.f) - tTa.h);
                        d8 += (double)(random.nextInt(pPa.f) - tTa.h);
                        aKa2 = a2;
                    } else {
                        d7 += (double)(random.nextInt(tua.U) - Ypa.A);
                        d8 += (double)(random.nextInt(tua.U) - Ypa.A);
                        aKa2 = a2;
                    }
                    aKa2.J(tTa.h, mka.I);
                    double d11 = tpa.k + (double)n2 * iSa.P;
                    if (n7 == 0) {
                        d11 *= (double)g2 * tpa.k + oua.i;
                    }
                    double d12 = tpa.k + (double)n2 * iSa.P;
                    if (n7 == 0) {
                        d12 *= (double)(g2 - vRa.d) * tpa.k + oua.i;
                    }
                    int n10 = uSa.E;
                    while (n10 < tTa.h) {
                        void d13;
                        int n11;
                        void c2;
                        void e2;
                        void var34_26 = e2 + kTa.B - d11;
                        void var36_27 = c2 + kTa.B - d11;
                        if (n11 == vRa.d || n11 == uqa.g) {
                            var34_26 += d11 * KPa.y;
                        }
                        if (n11 == uqa.g || n11 == yRa.d) {
                            var36_27 += d11 * KPa.y;
                        }
                        void var38_28 = e2 + kTa.B - d12;
                        void var40_29 = c2 + kTa.B - d12;
                        if (n11 == vRa.d || n11 == uqa.g) {
                            var38_28 += d12 * KPa.y;
                        }
                        if (n11 == uqa.g || n11 == yRa.d) {
                            var40_29 += d12 * KPa.y;
                        }
                        a2.J((double)(var38_28 + d7), (double)(d13 + (double)(g2 * ERa.C)), (double)(var40_29 + d8)).J(KTa.r, KTa.r, MQa.L, bpa.K).M();
                        a2.J((double)(var34_26 + d9), (double)(d13 + (double)((g2 + vRa.d) * ERa.C)), (double)(var36_27 + d10)).J(KTa.r, KTa.r, MQa.L, bpa.K).M();
                        n10 = ++n11;
                    }
                    b2.J();
                    n9 = --g2;
                }
                n6 = ++n7;
            }
            n5 = ++n2;
        }
        uKa.k();
        uKa.P();
        uKa.H();
    }

    public ResourceLocation J(cEa cEa2) {
        Wja_3 b2 = cEa2;
        Wja_3 a2 = this;
        return null;
    }
}

