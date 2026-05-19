/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EMa
 *  Kpa
 *  QSa
 *  Qsa
 *  RPa
 *  Tz
 *  aX
 *  eAa
 *  lX
 *  pKa
 *  vRa
 *  wra
 */
import com.google.common.collect.Lists;
import java.util.Iterator;

public final class DMa
extends EMa {
    public final /* synthetic */ cna C;

    public DMa(cna cna2, Kpa kpa2) {
        Iterator a2;
        Object c2 = cna2;
        DMa b2 = this;
        b2.C = c2;
        super((cna)((Object)c2), (Kpa)a2);
        b2.I = Lists.newArrayList();
        for (lX lX2 : Tz.Ka) {
            int n2;
            int n3 = uSa.E;
            int n4 = eAa.J((eAa)lX2.J());
            if (cna.J((cna)((Object)c2)).J((aX)lX2) > 0) {
                n2 = n3 = vRa.d;
            } else if (Tz.H[n4] != null && cna.J((cna)((Object)c2)).J(Tz.H[n4]) > 0) {
                n2 = n3 = vRa.d;
            } else {
                if (Tz.c[n4] != null && cna.J((cna)((Object)c2)).J(Tz.c[n4]) > 0) {
                    n3 = vRa.d;
                }
                n2 = n3;
            }
            if (n2 == 0) continue;
            b2.I.add(lX2);
        }
        b2.m = new Zma(b2, (cna)((Object)c2));
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, pKa pKa2) {
        DMa dMa2;
        DMa dMa3;
        void a2;
        void c2;
        DMa b2;
        int d2 = n3;
        DMa dMa4 = b2 = this;
        super.J((int)c2, d2, (pKa)a2);
        if (dMa4.j == 0) {
            DMa dMa5 = b2;
            dMa3 = dMa5;
            cna.J(dMa5.C, (int)(c2 + pta.ba - yOa.B + vRa.d), d2 + vRa.d + vRa.d, yOa.B, yOa.B);
        } else {
            DMa dMa6 = b2;
            dMa3 = dMa6;
            cna.J(dMa6.C, (int)(c2 + pta.ba - yOa.B), d2 + vRa.d, yOa.B, yOa.B);
        }
        if (dMa3.j == vRa.d) {
            DMa dMa7 = b2;
            dMa2 = dMa7;
            cna.J(dMa7.C, (int)(c2 + Yqa.o - yOa.B + vRa.d), d2 + vRa.d + vRa.d, Qsa.Ha, yOa.B);
        } else {
            DMa dMa8 = b2;
            dMa2 = dMa8;
            cna.J(dMa8.C, (int)(c2 + Yqa.o - yOa.B), d2 + vRa.d, Qsa.Ha, yOa.B);
        }
        if (dMa2.j == uqa.g) {
            cna.J(b2.C, (int)(c2 + QSa.w - yOa.B + vRa.d), d2 + vRa.d + vRa.d, GPa.C, yOa.B);
            return;
        }
        cna.J(b2.C, (int)(c2 + QSa.w - yOa.B), d2 + vRa.d, GPa.C, yOa.B);
    }

    public String J(int n2) {
        int b2 = n2;
        DMa a2 = this;
        if (b2 == 0) {
            return vqa.J;
        }
        if (b2 == vRa.d) {
            return RPa.c;
        }
        return Fsa.j;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5, int n6, int n7) {
        void d2;
        void e2;
        void f2;
        DMa b2;
        int n8 = n6;
        DMa dMa2 = b2 = this;
        lX c2 = dMa2.J((int)f2);
        eAa g22 = c2.J();
        cna.J(dMa2.C, (int)(e2 + wra.P), (int)d2, g22);
        int g22 = eAa.J((eAa)g22);
        dMa2.J(Tz.c[g22], (int)(e2 + pta.ba), (int)d2, (f2 % uqa.g == false ? vRa.d : uSa.E) != 0);
        b2.J(Tz.H[g22], (int)(e2 + Yqa.o), (int)d2, (f2 % uqa.g == false ? vRa.d : uSa.E) != 0);
        b2.J((aX)c2, (int)(e2 + QSa.w), (int)d2, (f2 % uqa.g == false ? vRa.d : uSa.E) != 0);
    }
}

