/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  KA
 *  Kna
 *  Kpa
 *  Lra
 *  Mda
 *  Mt
 *  RR
 *  SQa
 *  XTa
 *  aKa
 *  aSa
 *  aT
 *  jt
 *  kpa
 *  lqa
 *  mka
 *  nLa
 *  pKa
 *  pqa
 *  pua
 *  qu
 *  uKa
 *  uw
 *  vRa
 *  wOa
 *  ysa
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class qu_3
extends aT {
    private final List<Mt> i;
    private int M;
    private int k;
    public static final String j = "##TArmorStatusHud";
    public static final qu J = new qu_3();
    private final Kpa A = Kpa.J();
    private static final int I = 2;

    /*
     * WARNING - void declaration
     */
    private void f(long l2, Mda mda2, int n2, int n3) {
        void a2;
        void b2;
        qu_3 e2 = mda2;
        qu_3 c2 = this;
        if (jt.d && ((Mda)e2).E > vRa.d) {
            void d2;
            uKa.L();
            uKa.u();
            uKa.k();
            String string = String.valueOf(((Mda)e2).E);
            Kpa kpa2 = Kpa.J();
            Kna kna2 = kpa2.Ea;
            String string2 = string;
            c2.J((long)d2, string2, (float)(b2 + wOa.t - uqa.g - kna2.J(string2)), (float)(a2 + uua.p + yRa.d), pqa.r, uSa.E != 0, jt.x, jt.e, vRa.d != 0);
            uKa.P();
            uKa.J();
        }
        boolean bl = e2.A();
        if (jt.E && bl) {
            int n4 = (int)Math.round(SQa.t - (double)e2.f() * SQa.t / (double)e2.l());
            int n5 = (int)Math.round(pqa.o - (double)e2.f() * pqa.o / (double)e2.l());
            uKa.L();
            uKa.u();
            uKa.z();
            uKa.c();
            uKa.k();
            qu_3.J((int)(b2 + uqa.g), (int)(a2 + uua.s), uua.s, uqa.g, uSa.E, uSa.E, uSa.E, osa.Ja);
            qu_3.J((int)(b2 + uqa.g), (int)(a2 + uua.s), lqa.s, vRa.d, (osa.Ja - n5) / AQa.P, ysa.s, uSa.E, osa.Ja);
            qu_3.J((int)(b2 + uqa.g), (int)(a2 + uua.s), n4, vRa.d, osa.Ja - n5, n5, uSa.E, osa.Ja);
            uKa.B();
            uKa.K();
            uKa.H();
            uKa.P();
            uKa.J();
        }
        nLa.C();
        uKa.u();
        uKa.c();
    }

    public static void A() {
        RR.J((Bp)J, (jt.j != 0 ? vRa.d : uSa.E) != 0);
    }

    public static /* synthetic */ int f(qu a2) {
        return a2.M;
    }

    public float e() {
        qu_3 a2;
        return a2.M;
    }

    public float d() {
        qu_3 a2;
        return a2.k;
    }

    public static /* synthetic */ Kpa J(qu a2) {
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public void J(long l2) {
        block13: {
            void a2;
            int n2;
            qu_3 qu_32 = this;
            if (uw.O) {
                return;
            }
            qu_32.i.clear();
            int n3 = n2 = yRa.d;
            while (n3 >= pua.o) {
                Mda mda2;
                Object b2222 = null;
                if (n2 >= 0) {
                    mda2 = qu_32.A.c.K.A[n2];
                } else {
                    void b2222;
                    if (jt.j == uqa.g) {
                        Mda b2222 = qu_32.A.c.f();
                    }
                    mda2 = b2222;
                }
                if (mda2 != null) {
                    void b2222;
                    qu_32.i.add(new Mt((qu)qu_32, (Mda)b2222, ERa.C, ERa.C));
                }
                n3 = --n2;
            }
            qu_32.M = uSa.E;
            qu_32.k = uSa.E;
            for (Mt b2222 : qu_32.i) {
                if (jt.M) {
                    if (Mt.J((Mt)b2222) > qu_32.M) {
                        qu_32.M = Mt.J((Mt)b2222);
                    }
                    qu_32.k += Mt.f((Mt)b2222);
                    continue;
                }
                qu_32.M += Mt.J((Mt)b2222);
                if (Mt.f((Mt)b2222) <= qu_32.k) continue;
                qu_32.k = Mt.f((Mt)b2222);
            }
            qu_32.M = qu_32.M + (jt.M ? uqa.g * (jt.m == 0 ? vRa.d : uqa.g) : uqa.g * (qu_32.i.size() + vRa.d));
            if (qu_32.i.size() <= 0) break block13;
            if (jt.M) {
                Iterator<Mt> b2222;
                int n4 = uSa.E;
                Iterator<Mt> iterator = b2222 = qu_32.i.iterator();
                while (iterator.hasNext()) {
                    Mt mt2 = b2222.next();
                    iterator = b2222;
                    mt2.J((long)a2, uSa.E, n4);
                    n4 += Mt.f((Mt)mt2);
                }
            } else {
                Iterator<Mt> b2222;
                int n5 = uqa.g;
                Iterator<Mt> iterator = b2222 = qu_32.i.iterator();
                while (iterator.hasNext()) {
                    Mt mt3 = b2222.next();
                    iterator = b2222;
                    mt3.J((long)a2, n5, uSa.E);
                    n5 += Mt.J((Mt)mt3) + uqa.g;
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(long l2, Mda mda2, int n2, int n3) {
        void e2;
        void b2;
        void c2;
        int n4 = n3;
        qu_3 a2 = this;
        Kpa d2 = Kpa.J();
        uKa.J();
        nLa.J();
        Kpa kpa2 = d2;
        kpa2.J().f((Mda)c2, (int)b2, (int)e2);
        nLa.C();
        uKa.u();
        kpa2.J().J(KA.A);
        uKa.J((int)Lra.k, (int)kpa.J, (int)uSa.E, (int)vRa.d);
        uKa.F((int)gua.X);
    }

    /*
     * WARNING - void declaration
     */
    private static void J(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        void f2;
        void e2;
        void a2;
        void b2;
        void c2;
        void d2;
        void g2;
        aKa h2;
        int n10 = n2;
        pKa pKa2 = pKa.J();
        aKa aKa2 = h2 = pKa2.J();
        int n11 = n10;
        aKa aKa3 = h2;
        aKa3.J(XTa.W, mka.I);
        aKa3.J((double)n10, (double)g2, aSa.V).J((int)d2, (int)c2, (int)b2, (int)a2).M();
        h2.J((double)n11, (double)(g2 + e2), aSa.V).J((int)d2, (int)c2, (int)b2, (int)a2).M();
        aKa2.J((double)(n11 + f2), (double)(g2 + e2), aSa.V).J((int)d2, (int)c2, (int)b2, (int)a2).M();
        aKa2.J((double)(n10 + f2), (double)g2, aSa.V).J((int)d2, (int)c2, (int)b2, (int)a2).M();
        pKa2.J();
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(qu qu2, long l2, Mda mda2, int n2, int n3) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n4 = n3;
        qu a2 = qu2;
        super.J((long)d2, (Mda)c2, (int)b2, (int)e2);
    }

    public static /* synthetic */ int J(qu a2) {
        return a2.k;
    }

    private qu_3() {
        super(sra.Q);
        qu_3 a2;
        qu_3 qu_32 = a2;
        qu_32.i = new ArrayList<Mt>();
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(qu qu2, long l2, Mda mda2, int n2, int n3) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n4 = n3;
        qu a2 = qu2;
        super.f((long)d2, (Mda)c2, (int)b2, (int)e2);
    }
}

