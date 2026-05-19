/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AJa
 *  Cla
 *  ERa
 *  Eoa
 *  JPa
 *  Oz
 *  Yra
 *  hqa
 *  jpa
 *  pua
 *  vL
 *  vRa
 */
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class PA_1 {
    /*
     * WARNING - void declaration
     */
    public static Iterator<Cla> J(Eoa eoa, double d2, vL vL2, int n2, AJa aJa2) {
        void a2;
        void b22;
        float f2;
        Eoa eoa2 = eoa;
        float e2 = pA.J();
        if (f2 > JPa.N && e2 < (float)((b22 - vRa.d) * ERa.C)) {
            XF c2;
            void d222;
            int n3 = Oz.f((float)(e2 / Yra.i)) + vRa.d;
            float f3 = eoa2.d((float)d222);
            e2 = pA.rB * Bua.ga;
            float d222 = f3 > jpa.f && f3 < hqa.Y ? f3 + pua.j : f3;
            float f4 = -Oz.d((float)d222);
            float f5 = Oz.C((float)d222) * Oz.C((float)e2);
            e2 = -Oz.C((float)d222) * Oz.d((float)e2);
            XF xF2 = new XF(Oz.f((double)((vL)c2).la) >> AQa.P, Oz.f((double)((vL)c2).Z) >> AQa.P, Oz.f((double)((vL)c2).A) >> AQa.P);
            c2 = xF2.add(-f4 * (float)n3, -f5 * (float)n3, -e2 * (float)n3);
            XF b22 = xF2.add(f4 * (float)b22, f5 * (float)b22, e2 * (float)b22);
            int n4 = n3;
            return new lc((AJa)a2, c2, b22, n4, n4);
        }
        List<Cla> list = Arrays.asList(a2.j);
        Iterator<Cla> iterator = list.iterator();
        return iterator;
    }

    public PA_1() {
        PA_1 a2;
    }
}

