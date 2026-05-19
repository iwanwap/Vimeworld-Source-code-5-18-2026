/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AMa
 *  Ad
 *  Gl
 *  JPa
 *  Oz
 *  Yra
 *  aSa
 *  cT
 *  id
 *  jea
 *  kta
 *  nLa
 *  pqa
 *  uKa
 *  vL
 */
import java.util.Random;

public final class Nla
implements id<Gl> {
    private final Ad I;

    public boolean J() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gl gl2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        Random h2;
        float f9 = f6;
        Nla c2 = this;
        int g2 = h2.J();
        if (g2 > 0) {
            int d2;
            void v0 = h2;
            jea f10 = new jea(v0.j, v0.la, ((Gl)h2).Z, ((Gl)h2).A);
            h2 = new Random(h2.M());
            nLa.C();
            int n2 = d2 = uSa.E;
            while (n2 < g2) {
                void e2;
                uKa.e();
                cT i22 = c2.I.J().J(h2);
                AMa b22 = (AMa)i22.cubeList.get(h2.nextInt(i22.cubeList.size()));
                Random random = h2;
                i22.l(rRa.T);
                float i22 = h2.nextFloat();
                float a2 = random.nextFloat();
                float f11 = random.nextFloat();
                AMa aMa = b22;
                float f12 = (b22.C + (aMa.j - b22.C) * i22) / Yra.i;
                AMa aMa2 = b22;
                float f13 = (aMa.M + (aMa2.J - aMa2.M) * a2) / Yra.i;
                AMa aMa3 = b22;
                float b22 = (aMa.i + (aMa3.m - aMa3.i) * f11) / Yra.i;
                uKa.J((float)f12, (float)f13, (float)b22);
                i22 = i22 * kta.v - pqa.r;
                a2 = a2 * kta.v - pqa.r;
                f11 = f11 * kta.v - pqa.r;
                a2 *= vqa.T;
                float f14 = i22 *= vqa.T;
                float f15 = f11 *= vqa.T;
                b22 = Oz.J((float)(f14 * f14 + f15 * f15));
                f10.s = f10.X = (float)(Math.atan2(i22, f11) * kta.Da / lQa.f);
                jea jea2 = f10;
                jea2.o = jea2.d = (float)(Math.atan2(a2, b22) * kta.Da / lQa.f);
                double d3 = aSa.V;
                double d4 = aSa.V;
                double d5 = aSa.V;
                c2.I.J().J((vL)f10, d3, d4, d5, JPa.N, (float)e2);
                uKa.D();
                n2 = ++d2;
            }
            nLa.f();
        }
    }

    public Nla(Ad ad2) {
        Nla b2 = ad2;
        Nla a2 = this;
        a2.I = b2;
    }
}

