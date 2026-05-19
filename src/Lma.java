/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Fpa
 *  JPa
 *  VJa
 *  XTa
 *  YSa
 *  Yra
 *  aKa
 *  aPa
 *  aSa
 *  dMa
 *  dW
 *  kpa
 *  kta
 *  mka
 *  pKa
 *  pqa
 *  roa
 *  uKa
 *  vQa
 *  vRa
 *  vz
 */
import net.minecraft.block.material.MapColor;
import net.minecraft.util.ResourceLocation;

public final class Lma {
    public final /* synthetic */ dMa k;
    private final dW j;
    private final VJa J;
    private final ResourceLocation A;
    private final int[] I;

    public static /* synthetic */ void J(Lma a2) {
        a2.J();
    }

    public static /* synthetic */ ResourceLocation J(Lma a2) {
        return a2.A;
    }

    public static /* synthetic */ void J(Lma lma, boolean bl) {
        boolean b2 = bl;
        Lma a2 = lma;
        a2.J(b2);
    }

    private void J() {
        int a2;
        Lma lma = this;
        int n2 = a2 = uSa.E;
        while (n2 < qQa.O) {
            int n3 = lma.j.j[a2] & osa.Ja;
            if (n3 / AQa.P == 0) {
                int n4 = a2;
                lma.I[n4] = (n4 + n4 / XOa.h & vRa.d) * Yqa.i + ERa.C << osa.c;
            } else {
                lma.I[a2] = MapColor.mapColorArray[n3 / AQa.P].J(n3 & yRa.d);
            }
            n2 = ++a2;
        }
        lma.J.f();
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ Lma(dMa dMa2, dW dW2, roa roa2) {
        void c2;
        Lma d2 = dW2;
        Lma b2 = this;
        b2((dMa)c2, (dW)d2);
    }

    /*
     * WARNING - void declaration
     */
    private Lma(dMa dMa2, dW dW2) {
        void a2;
        Lma c2 = dMa2;
        Lma b2 = this;
        b2.k = c2;
        b2.j = a2;
        Lma lma = b2;
        b2.J = new VJa(XOa.h, XOa.h);
        b2.I = b2.J.J();
        b2.A = dMa.J((dMa)c2).J(new StringBuilder().insert(3 & 4, tpa.B).append(a2.mapName).toString(), b2.J);
        int n2 = c2 = uSa.E;
        while (n2 < b2.I.length) {
            b2.I[c2++] = uSa.E;
            n2 = c2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(boolean bl) {
        Lma lma = this;
        int n2 = uSa.E;
        int n3 = uSa.E;
        pKa pKa2 = pKa.J();
        aKa aKa2 = pKa2.J();
        float b22 = JPa.N;
        dMa.J((dMa)lma.k).J(lma.A);
        uKa.B();
        uKa.J((int)vRa.d, (int)kpa.J, (int)uSa.E, (int)vRa.d);
        uKa.c();
        aKa aKa3 = aKa2;
        int n4 = n2;
        aKa2.J(XTa.W, mka.A);
        aKa2.J((double)((float)(n4 + uSa.E) + b22), (double)((float)(n3 + XOa.h) - b22), aua.L).J(aSa.V, oua.i).M();
        aKa3.J((double)((float)(n4 + XOa.h) - b22), (double)((float)(n3 + XOa.h) - b22), aua.L).J(oua.i, oua.i).M();
        aKa3.J((double)((float)(n2 + XOa.h) - b22), (double)((float)(n3 + uSa.E) + b22), aua.L).J(oua.i, aSa.V).M();
        aKa3.J((double)((float)(n2 + uSa.E) + b22), (double)((float)(n3 + uSa.E) + b22), aua.L).J(aSa.V, aSa.V).M();
        pKa2.J();
        uKa.K();
        uKa.k();
        Lma lma2 = lma;
        dMa.J((dMa)lma2.k).J(dMa.J());
        int b22 = uSa.E;
        for (vz vz2 : lma2.j.A.values()) {
            void a2;
            if (a2 != false && vz2.l() != vRa.d) continue;
            uKa.e();
            uKa.J((float)((float)n2 + (float)vz2.C() / kta.v + EPa.r), (float)((float)n3 + (float)vz2.f() / kta.v + EPa.r), (float)YSa.Ja);
            vz vz3 = vz2;
            uKa.J((float)((float)(vz3.J() * aPa.Y) / Yra.i), (float)JPa.N, (float)JPa.N, (float)pqa.r);
            uKa.l((float)YSa.G, (float)YSa.G, (float)vQa.q);
            uKa.J((float)dsa.K, (float)Mqa.N, (float)JPa.N);
            byte by = vz3.l();
            float f2 = (float)(by % AQa.P + uSa.E) / YSa.G;
            float f3 = (float)(by / AQa.P + uSa.E) / YSa.G;
            float f4 = (float)(by % AQa.P + vRa.d) / YSa.G;
            float f5 = (float)(by / AQa.P + vRa.d) / YSa.G;
            aKa aKa4 = aKa2;
            aKa2.J(XTa.W, mka.A);
            aKa4.J(pqa.q, oua.i, (double)((float)b22 * tTa.z)).J((double)f2, (double)f3).M();
            aKa4.J(oua.i, oua.i, (double)((float)b22 * tTa.z)).J((double)f4, (double)f3).M();
            aKa4.J(oua.i, pqa.q, (double)((float)b22 * tTa.z)).J((double)f4, (double)f5).M();
            aKa aKa5 = aKa4.J(pqa.q, pqa.q, (double)((float)b22 * tTa.z)).J((double)f2, (double)f5);
            ++b22;
            aKa5.M();
            pKa2.J();
            uKa.D();
        }
        uKa.e();
        uKa.J((float)JPa.N, (float)JPa.N, (float)Fpa.w);
        uKa.l((float)pqa.r, (float)pqa.r, (float)pqa.r);
        uKa.D();
    }
}

