/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EMa
 *  ISa
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
 *  voa
 *  wra
 */
import com.google.common.collect.Lists;
import java.util.Iterator;

public final class Ima
extends EMa {
    public final /* synthetic */ cna C;

    public String J(int n2) {
        int b2 = n2;
        Ima a2 = this;
        if (b2 == vRa.d) {
            return vqa.J;
        }
        if (b2 == uqa.g) {
            return RPa.c;
        }
        return ISa.f;
    }

    public Ima(cna cna2, Kpa kpa2) {
        Iterator a2;
        Object c2 = cna2;
        Ima b2 = this;
        b2.C = c2;
        super((cna)((Object)c2), (Kpa)a2);
        b2.I = Lists.newArrayList();
        for (lX lX2 : Tz.v) {
            int n2;
            int n3 = uSa.E;
            int n4 = eAa.J((eAa)lX2.J());
            if (cna.J((cna)((Object)c2)).J((aX)lX2) > 0) {
                n2 = n3 = vRa.d;
            } else if (Tz.l[n4] != null && cna.J((cna)((Object)c2)).J(Tz.l[n4]) > 0) {
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
        b2.m = new voa(b2, (cna)((Object)c2));
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, pKa pKa2) {
        Ima ima;
        Ima ima2;
        void a2;
        void c2;
        Ima b2;
        int d2 = n3;
        Ima ima3 = b2 = this;
        super.J((int)c2, d2, (pKa)a2);
        if (ima3.j == 0) {
            Ima ima4 = b2;
            ima2 = ima4;
            cna.J(ima4.C, (int)(c2 + pta.ba - yOa.B + vRa.d), d2 + vRa.d + vRa.d, Eqa.Ka, yOa.B);
        } else {
            Ima ima5 = b2;
            ima2 = ima5;
            cna.J(ima5.C, (int)(c2 + pta.ba - yOa.B), d2 + vRa.d, Eqa.Ka, yOa.B);
        }
        if (ima2.j == vRa.d) {
            Ima ima6 = b2;
            ima = ima6;
            cna.J(ima6.C, (int)(c2 + Yqa.o - yOa.B + vRa.d), d2 + vRa.d + vRa.d, yOa.B, yOa.B);
        } else {
            Ima ima7 = b2;
            ima = ima7;
            cna.J(ima7.C, (int)(c2 + Yqa.o - yOa.B), d2 + vRa.d, yOa.B, yOa.B);
        }
        if (ima.j == uqa.g) {
            cna.J(b2.C, (int)(c2 + QSa.w - yOa.B + vRa.d), d2 + vRa.d + vRa.d, Qsa.Ha, yOa.B);
            return;
        }
        cna.J(b2.C, (int)(c2 + QSa.w - yOa.B), d2 + vRa.d, Qsa.Ha, yOa.B);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5, int n6, int n7) {
        void d2;
        void e2;
        void f2;
        Ima b2;
        int n8 = n6;
        Ima ima = b2 = this;
        lX c2 = ima.J((int)f2);
        eAa g22 = c2.J();
        cna.J(ima.C, (int)(e2 + wra.P), (int)d2, g22);
        int g22 = eAa.J((eAa)g22);
        ima.J(Tz.l[g22], (int)(e2 + pta.ba), (int)d2, (f2 % uqa.g == false ? vRa.d : uSa.E) != 0);
        b2.J(Tz.c[g22], (int)(e2 + Yqa.o), (int)d2, (f2 % uqa.g == false ? vRa.d : uSa.E) != 0);
        b2.J((aX)c2, (int)(e2 + QSa.w), (int)d2, (f2 % uqa.g == false ? vRa.d : uSa.E) != 0);
    }
}

