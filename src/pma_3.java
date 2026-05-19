/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  JPa
 *  JTa
 *  KA
 *  Kpa
 *  Oz
 *  Vua
 *  Xoa
 *  ZOa
 *  aSa
 *  cQa
 *  cRa
 *  jsa
 *  kFa
 *  ld
 *  pqa
 *  pua
 *  sMa
 *  uKa
 *  vQa
 *  vRa
 *  wra
 */
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class pma_3
extends KA {
    private final List<ama> i;
    private static final Logger M = LogManager.getLogger();
    private final List<String> k;
    private final Kpa j;
    private int J;
    private boolean A;
    private final List<ama> I;

    public boolean J() {
        pma_3 a2;
        return a2.j.ta instanceof Xoa;
    }

    public static int f(float f2) {
        float f3 = f2;
        int n2 = cRa.n;
        int a2 = kTa.j;
        return Oz.J((float)(f3 * (float)(n2 - a2) + (float)a2));
    }

    public static int J(float f2) {
        float f3 = f2;
        int n2 = cQa.Z;
        int a2 = wra.P;
        return Oz.J((float)(f3 * (float)(n2 - a2) + (float)a2));
    }

    public int l() {
        pma_3 a2;
        return pma_3.J(a2.j.z.Sd);
    }

    /*
     * WARNING - void declaration
     */
    public void l(int n2) {
        pma_3 pma_32 = this;
        if (pma_32.j.z.qa != kFa.HIDDEN) {
            pma_3 pma_33 = pma_32;
            int n3 = pma_33.f();
            int n4 = uSa.E;
            int n5 = uSa.E;
            int n6 = pma_33.i.size();
            float f2 = pma_33.j.z.xa * ATa.r + Nra.e;
            if (n6 > 0) {
                int n7;
                int n8;
                int n9;
                if (pma_32.J()) {
                    n4 = vRa.d;
                }
                pma_3 pma_34 = pma_32;
                float b22 = pma_34.J();
                int n10 = Oz.f((float)((float)pma_34.l() / b22));
                uKa.e();
                uKa.J((float)vQa.q, (float)vqa.A, (float)JPa.N);
                float f3 = b22;
                uKa.l((float)f3, (float)f3, (float)pqa.r);
                int n11 = b22 = uSa.E;
                while (n11 + pma_32.J < pma_32.i.size() && b22 < n3) {
                    void a2;
                    ama ama2 = pma_32.i.get(b22 + pma_32.J);
                    if (ama2 != null && ((n9 = a2 - ama2.J()) < ZOa.x || n4 != 0)) {
                        double d2 = (double)n9 / jsa.Ka;
                        d2 = oua.i - d2;
                        d2 *= Wqa.m;
                        d2 = Oz.J((double)d2, (double)aSa.V, (double)oua.i);
                        d2 *= d2;
                        n8 = (int)(pqa.o * d2);
                        if (n4 != 0) {
                            n8 = osa.Ja;
                        }
                        ++n5;
                        if ((n8 = (int)((float)n8 * f2)) > yRa.d) {
                            n7 = uSa.E;
                            int n12 = -b22 * WOa.fa;
                            int n13 = n7;
                            pma_3.J((int)n13, (int)(n12 - WOa.fa), (int)(n13 + n10 + AQa.P), (int)n12, (int)(n8 / uqa.g << osa.c));
                            String string = ama2.J().l();
                            uKa.B();
                            pma_32.j.Ea.J(string, (float)n7, (float)(n12 - Yqa.i), pua.o + (n8 << osa.c));
                            uKa.c();
                            uKa.k();
                        }
                    }
                    n11 = ++b22;
                }
                if (n4 != 0) {
                    pma_3 pma_35 = pma_32;
                    int b22 = pma_35.j.Ea.u;
                    uKa.J((float)TOa.p, (float)JPa.N, (float)JPa.N);
                    int n14 = n6 * b22 + n6;
                    n9 = n5 * b22 + n5;
                    int n15 = pma_35.J * n9 / n6;
                    int n16 = n9;
                    int n17 = n16 * n16 / n14;
                    if (n14 != n9) {
                        n8 = n15 > 0 ? JTa.M : zua.m;
                        n7 = pma_32.A ? oua.H : Ira.Ia;
                        pma_3.J((int)uSa.E, (int)(-n15), (int)uqa.g, (int)(-n15 - n17), (int)(n7 + (n8 << osa.c)));
                        pma_3.J((int)uqa.g, (int)(-n15), (int)vRa.d, (int)(-n15 - n17), (int)(lQa.H + (n8 << osa.c)));
                    }
                }
                uKa.D();
            }
        }
    }

    public void l() {
        pma_3 a2;
        pma_3 pma_32 = a2;
        pma_32.i.clear();
        pma_32.I.clear();
        pma_32.k.clear();
    }

    /*
     * WARNING - void declaration
     */
    private void J(ld ld2, int n2, int n3, boolean bl) {
        void a2;
        void b2;
        void d2;
        void c2;
        pma_3 pma_32 = this;
        if (c2 != false) {
            pma_32.f((int)c2);
        }
        Object e2 = OMa.J((ld)d2, Oz.J((float)((float)pma_32.l() / pma_32.J())), pma_32.j.Ea, uSa.E != 0, uSa.E != 0);
        boolean bl2 = pma_32.J();
        e2 = e2.iterator();
        Object object = e2;
        while (object.hasNext()) {
            ld ld3 = (ld)e2.next();
            if (bl2 && pma_32.J > 0) {
                pma_32.A = vRa.d;
                pma_32.J(vRa.d);
            }
            pma_32.i.add(uSa.E, new ama((int)b2, ld3, (int)c2));
            object = e2;
        }
        pma_3 pma_33 = pma_32;
        while (pma_33.i.size() > ySa.T) {
            pma_3 pma_34 = pma_32;
            pma_33 = pma_34;
            pma_32.i.remove(pma_34.i.size() - vRa.d);
        }
        if (a2 == false) {
            pma_3 pma_35 = pma_32;
            pma_3 pma_36 = pma_35;
            pma_35.I.add(uSa.E, new ama((int)b2, (ld)d2, (int)c2));
            while (pma_36.I.size() > ySa.T) {
                pma_3 pma_37 = pma_32;
                pma_36 = pma_37;
                pma_32.I.remove(pma_37.I.size() - vRa.d);
            }
        }
    }

    public pma_3(Kpa kpa2) {
        pma_3 a2;
        pma_3 b2 = kpa2;
        pma_3 pma_32 = a2 = this;
        a2.k = Lists.newArrayList();
        pma_32.I = Lists.newArrayList();
        pma_32.i = Lists.newArrayList();
        pma_32.j = b2;
    }

    public void f() {
        int n2;
        pma_3 pma_32;
        pma_3 pma_33 = pma_32 = this;
        pma_33.i.clear();
        pma_33.J();
        int n3 = n2 = pma_33.I.size() - vRa.d;
        while (n3 >= 0) {
            ama a2 = pma_32.I.get(n2);
            pma_32.J(a2.J(), a2.f(), a2.J(), vRa.d != 0);
            n3 = --n2;
        }
    }

    public void J() {
        pma_3 a2;
        pma_3 pma_32 = a2;
        pma_32.J = uSa.E;
        pma_32.A = uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public void f(int n2) {
        void a2;
        pma_3 pma_32 = this;
        Object b2 = pma_32.i.iterator();
        while (b2.hasNext()) {
            if (((ama)b2.next()).f() != a2) continue;
            b2.remove();
        }
        b2 = pma_32.I.iterator();
        while (b2.hasNext()) {
            if (((ama)b2.next()).f() != a2) continue;
            b2.remove();
            return;
        }
    }

    public void J(String string) {
        block3: {
            pma_3 a2;
            Object b2;
            block2: {
                b2 = string;
                a2 = this;
                if (a2.k.isEmpty()) break block2;
                pma_3 pma_32 = a2;
                if (pma_32.k.get(pma_32.k.size() - vRa.d).equals(b2)) break block3;
            }
            a2.k.add((String)b2);
        }
    }

    public void J(int n2) {
        pma_3 a2;
        int b2 = n2;
        pma_3 pma_32 = a2 = this;
        pma_32.J += b2;
        b2 = pma_32.i.size();
        if (pma_32.J > b2 - a2.f()) {
            a2.J = b2 - a2.f();
        }
        if (a2.J <= 0) {
            pma_3 pma_33 = a2;
            pma_33.J = uSa.E;
            pma_33.A = uSa.E;
        }
    }

    public int f() {
        pma_3 a2;
        return a2.J() / WOa.fa;
    }

    public List<String> J() {
        pma_3 a2;
        return a2.k;
    }

    public void J(ld ld2) {
        pma_3 b2 = ld2;
        pma_3 a2 = this;
        a2.J((ld)b2, uSa.E);
    }

    /*
     * WARNING - void declaration
     */
    public void J(ld ld2, int n2) {
        void a2;
        pma_3 b2;
        pma_3 c2 = ld2;
        pma_3 pma_32 = b2 = this;
        pma_32.J((ld)c2, (int)a2, pma_32.j.Ya.J(), uSa.E != 0);
        M.info(new StringBuilder().insert(3 >> 2, Vua.Q).append(c2.f()).toString());
    }

    public int J() {
        pma_3 a2;
        return pma_3.f(a2.J() ? a2.j.z.va : a2.j.z.GB);
    }

    public float J() {
        pma_3 a2;
        return a2.j.z.X;
    }

    public ld J(int n2, int n3) {
        int b2;
        int c22 = n3;
        pma_3 a2 = this;
        if (!a2.J()) {
            return null;
        }
        int n4 = new sMa(a2.j).l();
        float f2 = a2.J();
        b2 = b2 / n4 - yRa.d;
        c22 = c22 / n4 - ITa.A;
        b2 = Oz.J((float)((float)b2 / f2));
        c22 = Oz.J((float)((float)c22 / f2));
        if (b2 >= 0 && c22 >= 0) {
            n4 = Math.min(a2.f(), a2.i.size());
            if (b2 <= Oz.J((float)((float)a2.l() / a2.J())) && c22 < a2.j.Ea.u * n4 + n4) {
                if ((c22 = c22 / a2.j.Ea.u + a2.J) >= 0 && c22 < a2.i.size()) {
                    ama c22 = a2.i.get(c22);
                    n4 = uSa.E;
                    for (ld ld2 : c22.J()) {
                        if (!(ld2 instanceof CY) || (n4 += a2.j.Ea.J(OMa.J(((CY)ld2).C(), uSa.E != 0))) <= b2) continue;
                        return ld2;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }
}

