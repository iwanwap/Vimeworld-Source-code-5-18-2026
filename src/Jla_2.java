/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ISa
 *  JPa
 *  KTa
 *  Lra
 *  NQa
 *  Qsa
 *  aKa
 *  aSa
 *  id
 *  kta
 *  mka
 *  nLa
 *  pDa
 *  pKa
 *  pqa
 *  psa
 *  uKa
 *  vPa
 *  vRa
 */
import java.util.Random;

public final class Jla_2
implements id<pDa> {
    public boolean J() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(pDa pDa2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        void h22;
        float f9 = f8;
        Jla_2 a2 = this;
        if (h22.k > 0) {
            int c2;
            float e2;
            pKa g2 = pKa.J();
            aKa f10 = g2.J();
            nLa.C();
            float h22 = ((float)h22.k + e2) / Qsa.U;
            e2 = JPa.N;
            if (h22 > xSa.la) {
                e2 = (h22 - xSa.la) / psa.N;
            }
            Random d2 = new Random(gsa.k);
            uKa.z();
            uKa.F((int)gua.X);
            uKa.B();
            uKa.f((int)Lra.k, (int)vRa.d);
            uKa.c();
            uKa.h();
            uKa.J(uSa.E != 0);
            uKa.e();
            uKa.J((float)JPa.N, (float)vqa.T, (float)dua.ca);
            int n2 = c2 = uSa.E;
            while (true) {
                float f11 = h22;
                if (!((float)n2 < (f11 + f11 * f11) / kta.v * gua.l)) break;
                Random random = d2;
                uKa.J((float)(random.nextFloat() * CRa.ja), (float)pqa.r, (float)JPa.N, (float)JPa.N);
                uKa.J((float)(random.nextFloat() * CRa.ja), (float)JPa.N, (float)pqa.r, (float)JPa.N);
                uKa.J((float)(random.nextFloat() * CRa.ja), (float)JPa.N, (float)JPa.N, (float)pqa.r);
                uKa.J((float)(random.nextFloat() * CRa.ja), (float)pqa.r, (float)JPa.N, (float)JPa.N);
                uKa.J((float)(random.nextFloat() * CRa.ja), (float)JPa.N, (float)pqa.r, (float)JPa.N);
                uKa.J((float)(random.nextFloat() * CRa.ja + h22 * ISa.a), (float)JPa.N, (float)JPa.N, (float)pqa.r);
                float b2 = random.nextFloat() * eta.e + eua.C + e2 * FRa.Ga;
                float i2 = random.nextFloat() * kta.v + pqa.r + e2 * kta.v;
                aKa aKa2 = f10;
                aKa aKa3 = f10;
                aKa3.J(uua.p, mka.I);
                aKa3.J(aSa.V, aSa.V, aSa.V).J(osa.Ja, osa.Ja, osa.Ja, (int)(NQa.Y * (pqa.r - e2))).M();
                aKa2.J(KTa.M * (double)i2, (double)b2, (double)(vPa.b * i2)).J(osa.Ja, uSa.E, osa.Ja, uSa.E).M();
                aKa2.J(AQa.I * (double)i2, (double)b2, (double)(vPa.b * i2)).J(osa.Ja, uSa.E, osa.Ja, uSa.E).M();
                aKa2.J(aSa.V, (double)b2, (double)(pqa.r * i2)).J(osa.Ja, uSa.E, osa.Ja, uSa.E).M();
                aKa2.J(KTa.M * (double)i2, (double)b2, (double)(vPa.b * i2)).J(osa.Ja, uSa.E, osa.Ja, uSa.E).M();
                g2.J();
                n2 = ++c2;
            }
            uKa.D();
            uKa.J(vRa.d != 0);
            uKa.m();
            uKa.k();
            uKa.F((int)Zra.f);
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            uKa.H();
            uKa.K();
            nLa.f();
        }
    }

    public Jla_2() {
        Jla_2 a2;
    }
}

