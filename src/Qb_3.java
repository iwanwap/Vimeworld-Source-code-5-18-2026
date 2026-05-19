/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  Qx
 *  Vw
 *  cb
 *  hTa
 *  pua
 *  vRa
 *  zTa
 */
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Qb_3
extends cb {
    private int i;
    public final xC j;
    private long J;
    private final Map<String, Qx> A;
    private ArrayList<String> I;

    public int i() {
        Qb_3 a2;
        return a2.i;
    }

    public void l() {
    }

    public void C() {
        Qb_3 qb_3;
        block2: {
            Qb_3 qb_32 = this;
            qb_32.I = pA.J();
            qb_32.i = uSa.E;
            int a2 = uSa.E;
            int n2 = qb_32.I.size();
            int n3 = a2;
            while (n3 < n2) {
                if (qb_32.I.get(a2).equals(pA.Ea)) {
                    qb_3 = qb_32;
                    qb_32.i = a2;
                    break block2;
                }
                n3 = ++a2;
            }
            qb_3 = qb_32;
        }
        qb_3.A.clear();
    }

    public int l() {
        Qb_3 a2;
        return a2.E - kTa.j;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5, int n6, int n7) {
        void d2;
        Qb_3 qb_3;
        int g22 = n2;
        Qb_3 f2 = this;
        String g22 = f2.I.get(g22);
        if (g22.equals(pA.Zb)) {
            g22 = Kg.J(hTa.e);
            qb_3 = f2;
        } else if (g22.equals(pA.md)) {
            g22 = Kg.J(yta.m);
            qb_3 = f2;
        } else {
            Qx e2 = f2.A.computeIfAbsent(g22, Md.J());
            switch (TA.I[e2.ordinal()]) {
                case 1: {
                    g22 = new StringBuilder().insert(3 & 4, g22).append(zTa.B).toString();
                    qb_3 = f2;
                    break;
                }
                case 2: {
                    g22 = new StringBuilder().insert(3 ^ 3, WOa.Ka).append(g22).append(Ura.j).toString();
                    qb_3 = f2;
                    break;
                }
                case 3: {
                    g22 = new StringBuilder().insert(3 ^ 3, g22).append(WOa.V).toString();
                }
                default: {
                    qb_3 = f2;
                }
            }
        }
        xC cfr_ignored_0 = qb_3.j;
        xC.J((String)g22, (int)(f2.E / uqa.g), (int)(d2 + vRa.d), (int)pua.o);
    }

    public int e() {
        Qb_3 a2;
        return a2.I.size();
    }

    public boolean f(int n2) {
        int b2 = n2;
        Qb_3 a2 = this;
        if (b2 == a2.i) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int C() {
        Qb_3 a2;
        return a2.e() * yOa.B;
    }

    public int M() {
        Qb_3 a2;
        return a2.E - uua.p;
    }

    public void J(int n2, boolean bl2, int n3, int n4) {
        int e2 = n2;
        Qb_3 d2 = this;
        if (e2 != d2.i || d2.a != d2.J) {
            pA.f(d2.I.get(e2));
            pA.J();
            if (Objects.equals(pA.Ea, d2.I.get(e2))) {
                d2.i = e2;
                d2.J = d2.a;
            }
            d2.j.J();
        }
    }

    /*
     * WARNING - void declaration
     */
    public Qb_3(xC xC2, int n2, int n3, int n4, int n5, int n6) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        xC g22 = xC2;
        Qb_3 f2 = this;
        super(g22.J(), (int)e2, (int)d2, (int)c2, (int)b2, (int)a2);
        Qb_3 qb_3 = f2;
        qb_3.A = new HashMap<String, Qx>();
        f2.J = nqa.i;
        f2.j = g22;
        f2.C();
        f2.i = (int)JPa.N;
        int g22 = f2.i * a2;
        e2 = (b2 - c2) / uqa.g;
        if (g22 > e2) {
            f2.J(g22 - e2);
        }
    }

    public static /* synthetic */ Qx J(String a2) {
        return Vw.J().f(new File(pA.HB, a2));
    }
}

