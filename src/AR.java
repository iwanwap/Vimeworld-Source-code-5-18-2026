/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ar
 *  CP
 *  JPa
 *  MQa
 *  Oz
 *  VO
 *  Wq
 *  YQ
 *  hq
 *  kta
 *  pQ
 *  pqa
 *  psa
 *  vQa
 *  vRa
 *  zO
 *  zp
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class AR {
    private final YQ E;
    private boolean m;
    private float C;
    private float i;
    private List<hq> M;
    private pp k;
    private float j;
    private float J;
    private static final float A = 0.2f;
    private float I;

    public boolean l() {
        AR a2;
        if (a2.f() || !a2.M.isEmpty()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static float J(float f2, float f3, float f4) {
        void b2;
        float a2;
        float c2 = f4;
        float f5 = a2 = f2;
        return f5 + (b2 - f5) * c2;
    }

    /*
     * WARNING - void declaration
     */
    private static float J(float f2, float f3, float f4, float f5, float f6) {
        void a2;
        void d2;
        void b2;
        void c2;
        float f7 = f2;
        float e2 = (c2 - f7) * MQa.L;
        b2 = (b2 - d2) * MQa.L;
        void v0 = a2;
        void var6_6 = v0 * v0;
        void var7_7 = a2 * var6_6;
        return (kta.v * d2 - kta.v * c2 + e2 + b2) * var7_7 + (TOa.p * d2 + vQa.q * c2 - kta.v * e2 - b2) * var6_6 + e2 * a2 + d2;
    }

    /*
     * WARNING - void declaration
     */
    private static void f(VO vO2, Ar ar, CP cP2, CP cP3, float f2) {
        void d2;
        void a2;
        b[] c22;
        b[] e22 = cP3;
        VO b2 = vO2;
        void v0 = c22;
        c22 = v0.f();
        e22 = e22.J();
        K[] kArray = v0.J();
        float c22 = AR.J(c22[uSa.E].J(), e22[uSa.E].J(), kArray[uSa.E].J((float)a2));
        float f3 = AR.J(c22[vRa.d].J(), e22[vRa.d].J(), kArray[vRa.d].J((float)a2));
        float e22 = AR.J(c22[uqa.g].J(), e22[uqa.g].J(), kArray[uqa.g].J((float)a2));
        AR.J(b2.J(), (Ar)d2, c22, f3, e22);
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, boolean bl, float f2) {
        void a2;
        void b2;
        Object d2 = string;
        AR c2 = this;
        if (c2.E == null) {
            return;
        }
        if ((d2 = c2.E.J((String)d2)) == null) {
            return;
        }
        c2.J((pp)d2, (boolean)b2, (float)a2);
    }

    public pp J() {
        AR a2;
        return a2.k;
    }

    public float f() {
        AR a2;
        return a2.i;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(zp zp2, Ar ar, float f2, float f3, float f4) {
        void d2;
        float f5 = f4;
        zp a2 = zp2;
        switch (Wq.I[d2.ordinal()]) {
            case 1: {
                void e2;
                void b2;
                void c2;
                zp zp3 = a2;
                while (false) {
                }
                zp3.f = zp3.h + c2;
                zp3.C = zp3.b - b2;
                zp3.k = zp3.c + e2;
                return;
            }
            case 2: {
                void e2;
                void b2;
                void c2;
                zp zp4 = a2;
                zp4.g = zp4.e + Bua.ga * c2;
                zp4.D = zp4.l + Bua.ga * b2;
                zp4.A = zp4.v + Bua.ga * e2;
                return;
            }
            case 3: {
                void e2;
                void b2;
                void c2;
                zp zp5 = a2;
                zp5.F = c2;
                zp5.d = b2;
                a2.L = e2;
            }
        }
    }

    public void l() {
        AR a2;
        a2.C = JPa.N;
        a2.M.clear();
    }

    public void f() {
        AR a2;
        a2.k = null;
        a2.M.clear();
    }

    /*
     * WARNING - void declaration
     */
    private static void J(VO vO2, Ar ar, CP cP2, CP cP3, float f2) {
        void d2;
        void a2;
        b[] c22;
        b[] e22 = cP3;
        VO b2 = vO2;
        c22 = c22.f();
        e22 = e22.J();
        float c22 = AR.J(c22[uSa.E].J(), e22[uSa.E].J(), (float)a2);
        float f3 = AR.J(c22[vRa.d].J(), e22[vRa.d].J(), (float)a2);
        float e22 = AR.J(c22[uqa.g].J(), e22[uqa.g].J(), (float)a2);
        AR.J(b2.J(), (Ar)d2, c22, f3, e22);
    }

    /*
     * WARNING - void declaration
     */
    private static void J(VO vO2, Ar ar, CP cP2, CP cP3, CP cP4, CP cP5, float f2) {
        void f3;
        float a2;
        b[] b2;
        b[] c2;
        b[] e22;
        b[] g22 = cP3;
        VO d2 = vO2;
        int n2 = uqa.g;
        if (e22 != g22) {
            ++n2;
        }
        if (c2 != b2) {
            ++n2;
        }
        a2 = (a2 + (float)(e22 != g22 ? vRa.d : uSa.E)) / (float)(n2 - vRa.d);
        float f4 = (float)(n2 - vRa.d) * a2;
        a2 = f4 - (float)Oz.J((float)f4);
        e22 = e22.f();
        g22 = g22.f();
        c2 = c2.J();
        b2 = b2.J();
        float e22 = AR.J(e22[uSa.E].J(), g22[uSa.E].J(), c2[uSa.E].J(), b2[uSa.E].J(), a2);
        float f5 = AR.J(e22[vRa.d].J(), g22[vRa.d].J(), c2[vRa.d].J(), b2[vRa.d].J(), a2);
        float g22 = AR.J(e22[uqa.g].J(), g22[uqa.g].J(), c2[uqa.g].J(), b2[uqa.g].J(), a2);
        AR.J(d2.J(), (Ar)f3, e22, f5, g22);
    }

    public boolean f() {
        block2: {
            block3: {
                AR a2;
                if (a2.k == null) break block2;
                if (a2.m) break block3;
                AR aR = a2;
                if (!(aR.J < aR.k.J())) break block2;
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Deprecated
    private boolean J() {
        AR a2;
        if (a2.m && a2.k != null && a2.k.J() == JPa.N) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public float J() {
        AR a2;
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    public void J(pp pp2, boolean bl, float f2) {
        void a2;
        void b2;
        void c2;
        AR aR = this;
        if (aR.k != null) {
            AR aR2 = aR;
            aR2.J(JPa.N);
            HashSet<zp> hashSet = new HashSet<zp>();
            ArrayList<hq> arrayList = new ArrayList<hq>();
            for (VO d2 : aR2.k.J()) {
                if (!hashSet.add(d2.J())) continue;
                arrayList.add(new hq(d2.J()));
            }
            if (c2 != null) {
                for (VO d2 : c2.J()) {
                    if (!hashSet.add(d2.J())) continue;
                    arrayList.add(new hq(d2.J()));
                }
            }
            for (hq d2 : aR.M) {
                if (!hashSet.add(hq.J((hq)d2))) continue;
                arrayList.add(new hq(hq.J((hq)d2)));
            }
            aR.M = arrayList;
            aR.C = aR.j + psa.N;
        }
        AR aR3 = aR;
        AR aR4 = aR;
        aR.k = c2;
        aR4.m = b2;
        aR3.I = a2;
        aR4.J = JPa.N;
        aR3.i = JPa.N;
    }

    public void J() {
        Object a2;
        AR aR = this;
        Object object = a2 = aR.E.m.iterator();
        while (object.hasNext()) {
            ((zp)a2.next()).J();
            object = a2;
        }
    }

    public AR(YQ yQ2) {
        AR b2 = yQ2;
        AR a2 = this;
        a2.M = Collections.emptyList();
        a2.E = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2) {
        float f3;
        void a22;
        AR aR;
        AR aR2 = aR = this;
        AR aR3 = aR;
        aR2.i = a22 * aR3.I;
        aR3.j += a22;
        aR2.J += aR.i;
        if (aR2.J >= aR.k.J() && !aR.J()) {
            float f4;
            if (aR.m) {
                AR aR4 = aR;
                f4 = aR4.J % aR4.k.J();
            } else {
                f4 = aR.k.J();
            }
            aR.J = f4;
        }
        pQ.j = aR;
        for (VO vO2 : pQ.j.k.J()) {
            for (AR b2 : vO2.J()) {
                int n2;
                block18: {
                    int n3 = uSa.E;
                    int n4 = uSa.E;
                    while (n4 < b2.J().size()) {
                        CP cP2;
                        int n5;
                        CP cP3 = (CP)b2.J().get(n5);
                        if (cP2.J() > aR.J) {
                            if (n5 == 0) {
                                AR.J(vO2.J(), b2.J(), cP3.J()[uSa.E].J(), cP3.J()[vRa.d].J(), cP3.J()[uqa.g].J());
                            } else {
                                b[] bArray;
                                b[] bArray2 = (b[])b2.J().get(n5 - vRa.d);
                                float f5 = (aR.J - bArray2.J()) / (cP3.J() - bArray2.J());
                                if (bArray2.J() == zO.CATMULLROM) {
                                    bArray = n5 > uqa.g ? (CP)b2.J().get(n5 - uqa.g) : bArray2;
                                    CP cP4 = n5 + vRa.d < b2.J().size() ? (CP)b2.J().get(n5 + vRa.d) : cP3;
                                    AR.J(vO2, b2.J(), (CP)bArray, (CP)bArray2, cP3, cP4, f5);
                                } else if (bArray2.J() == zO.BEZIER || cP3.J() == zO.BEZIER) {
                                    AR.f(vO2, b2.J(), (CP)bArray2, cP3, f5);
                                } else if (bArray2.J() == zO.STEP) {
                                    bArray = bArray2.f();
                                    AR.J(vO2.J(), b2.J(), bArray[uSa.E].J(), bArray[vRa.d].J(), bArray[uqa.g].J());
                                } else {
                                    AR.J(vO2, b2.J(), (CP)bArray2, cP3, f5);
                                }
                            }
                            n2 = n3 = vRa.d;
                            break block18;
                        }
                        n4 = ++n5;
                    }
                    n2 = n3;
                }
                if (n2 != 0) continue;
                CP cP5 = (CP)b2.J().get(b2.J().size() - vRa.d);
                AR.J(vO2.J(), b2.J(), cP5.f()[uSa.E].J(), cP5.f()[vRa.d].J(), cP5.f()[uqa.g].J());
            }
        }
        AR aR5 = aR;
        float a22 = aR5.C - aR5.j;
        if (f3 > JPa.N) {
            float f6 = pqa.r - a22 / psa.N;
            Iterator<Object> iterator = aR.M.iterator();
            Iterator<Object> iterator2 = iterator;
            while (iterator2.hasNext()) {
                AR b2;
                b2 = (hq)iterator.next();
                zp zp2 = hq.J((hq)b2);
                iterator2 = iterator;
                AR aR6 = b2;
                zp2.F = AR.J(hq.e((hq)aR6), zp2.F, f6);
                zp2.d = AR.J(hq.M((hq)aR6), zp2.d, f6);
                zp2.L = AR.J(hq.i((hq)aR6), zp2.L, f6);
                zp2.g = AR.J(hq.d((hq)aR6), zp2.g, f6);
                zp2.D = AR.J(hq.J((hq)aR6), zp2.D, f6);
                zp2.A = AR.J(hq.A((hq)aR6), zp2.A, f6);
                zp2.f = AR.J(hq.C((hq)aR6), zp2.f, f6);
                zp2.C = AR.J(hq.f((hq)aR6), zp2.C, f6);
                zp2.k = AR.J(hq.l((hq)aR6), zp2.k, f6);
            }
        } else {
            aR.M.clear();
        }
    }
}

