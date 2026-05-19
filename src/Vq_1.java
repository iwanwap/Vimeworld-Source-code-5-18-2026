/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Iq
 *  JPa
 *  Kh
 *  Lp
 *  Lqa
 *  Qsa
 *  Uqa
 *  Zua
 *  aSa
 *  dQa
 *  k
 *  kPa
 *  kta
 *  pua
 *  vP
 *  vRa
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Vq_1
extends Bp {
    private final vP L;
    private int E;
    private Lp m;
    private float C;
    private final List<Lp> i;
    private Lp M;
    private final Set<String> k;
    private final P j;
    private int J;
    private static final int A = 8;
    private long I;

    @Override
    public void f() {
        Vq_1 a2;
        Vq_1 vq_1 = a2;
        super.f();
        vq_1.E = vq_1.j.J(Mqa.y);
    }

    public Bp l() {
        Vq_1 a2;
        if (a2.J > 0) {
            Vq_1 vq_1 = a2;
            if (vq_1.J < vq_1.i.size()) {
                Vq_1 vq_12 = a2;
                return Lp.J((Lp)vq_12.i.get(vq_12.J));
            }
        }
        return null;
    }

    private void A() {
        Vq_1 vq_1 = this;
        if (vq_1.I == OT.e) {
            return;
        }
        vq_1.I = OT.e;
        if (vq_1.m == null) {
            vq_1.m = new Lp(null, (Bp)new Iq());
            Lp.J((Lp)vq_1.m, vRa.d != 0);
        }
        if (!vq_1.L.A) {
            vq_1.k.clear();
        }
        Vq_1 vq_12 = vq_1;
        vq_12.J(vq_12.m, OT.i.F, vRa.d);
        vq_12.i.clear();
        vq_12.J(vq_12.m);
        vq_12.C = JPa.N;
        for (Lp a222 : vq_12.i) {
            float f2;
            float a222 = Lp.J((Lp)a222) * Yqa.i + vq_1.j.f((String)Lp.J((Lp)a222).I);
            if (!(f2 > vq_1.C)) continue;
            vq_1.C = a222;
        }
        vq_1.C += FRa.Ga;
    }

    public Bp f() {
        Vq_1 a2;
        if (a2.M == null) {
            return null;
        }
        return Lp.J((Lp)a2.M);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(long l2) {
        int n2;
        Vq_1 vq_1 = this;
        if (vq_1.M != null && Lp.J((Lp)vq_1.M).i < OT.e) {
            vq_1.M = null;
        }
        Vq_1 vq_12 = vq_1;
        vq_12.A();
        vq_12.o += dQa.Ga;
        int n3 = n2 = uSa.E;
        while (n3 < vq_1.i.size()) {
            Vq_1 vq_13;
            int n4;
            void a2;
            void var5_4;
            Vq_1 b2 = vq_1.i.get(n2);
            if (Lp.f((Lp)b2) > Lp.f((Lp)vq_1.m) && (var5_4 = a2 - Lp.f((Lp)b2)) < WOa.D) {
                n4 = (int)((dua.d - (double)var5_4) * kTa.B);
                Kh.J((double)aSa.V, (double)(n2 * vq_1.E), (double)vq_1.J(), (double)vq_1.E, (int)(Uqa.Q | n4 << osa.c));
            }
            if (Lp.J((Lp)b2) > nqa.i && (var5_4 = a2 - Lp.J((Lp)b2)) < WOa.D) {
                n4 = (int)((dua.d - (double)var5_4) * kTa.B);
                Kh.J((double)aSa.V, (double)(n2 * vq_1.E), (double)vq_1.J(), (double)vq_1.E, (int)(Jra.Y | n4 << osa.c));
            }
            if (vq_1.M == b2) {
                Kh.J((double)aSa.V, (double)(n2 * vq_1.E), (double)vq_1.J(), (double)vq_1.E, (int)Zua.Y);
            }
            if (vq_1.J == n2) {
                Kh.J((double)aSa.V, (double)(n2 * vq_1.E), (double)vq_1.J(), (double)vq_1.E, (int)Lqa.I);
            }
            if (b2.J()) {
                String string = Lp.J((Lp)b2) ? UTa.d : BQa.Ja;
                Vq_1 vq_14 = vq_1;
                vq_13 = vq_14;
                vq_14.j.J(string, Lp.J((Lp)b2) * Yqa.i - uua.p, n2 * vq_1.E, pua.o, uSa.E != 0);
            } else {
                float f2 = kPa.S;
                Vq_1 vq_15 = b2;
                Kh.J((double)((float)(Lp.J((Lp)vq_15) * Yqa.i) - f2), (double)(n2 * vq_1.E), (double)hpa.y, (double)vq_1.E, (int)vP.J((Bp)Lp.J((Lp)b2)));
                String string = vP.J((Bp)Lp.J((Lp)vq_15));
                float f3 = vq_1.j.f(string);
                n4 = (int)((float)(Lp.J((Lp)vq_15) * Yqa.i) - f2 + (Qsa.k - f3) / kta.v);
                Vq_1 vq_16 = vq_1;
                vq_13 = vq_16;
                vq_16.j.J(string, n4, n2 * vq_1.E + vRa.d, pua.o, uSa.E != 0);
            }
            int n5 = n2 * vq_1.E;
            vq_13.j.J((String)Lp.J((Lp)b2).I, Lp.J((Lp)b2) * Yqa.i, n5, pua.o, uSa.E != 0);
            n3 = ++n2;
        }
    }

    @Override
    public float e() {
        Vq_1 a2;
        return a2.C;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3, long l2) {
        void a2;
        void c2;
        Vq_1 b2;
        int d2 = n3;
        Vq_1 vq_1 = b2 = this;
        super.J((int)c2, d2, (long)a2);
        if (!vq_1.e) {
            b2.J = pua.o;
            return;
        }
        b2.J = d2 / b2.E;
    }

    private void J(Lp lp2) {
        Object b2 = lp2;
        Vq_1 a2 = this;
        Vq_1 vq_1 = b2;
        a2.i.add((Lp)vq_1);
        if (Lp.J((Lp)vq_1)) {
            Object object = b2 = Lp.J((Lp)b2).iterator();
            while (object.hasNext()) {
                Lp lp3 = (Lp)b2.next();
                object = b2;
                a2.J(lp3);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(Lp lp2, k k2, int n2) {
        void c2;
        Iterator b2;
        Vq_1 vq_1 = this;
        ArrayList<Vq_1> arrayList = new ArrayList<Vq_1>();
        for (Bp bp2 : b2.J()) {
            void a2;
            Vq_1 vq_12;
            Vq_1 d2;
            block4: {
                d2 = null;
                for (Lp lp3 : Lp.J((Lp)c2)) {
                    if (Lp.J((Lp)lp3) != bp2) continue;
                    vq_12 = d2 = lp3;
                    break block4;
                }
                vq_12 = d2;
            }
            if (vq_12 == null) {
                d2 = new Lp((Lp)c2, bp2);
                Lp.J((Lp)d2, (int)a2);
                if (vq_1.L.A) {
                    Vq_1 vq_13 = d2;
                    Lp.J((Lp)vq_13, (boolean)vq_1.k.contains(vq_13.J()));
                }
            }
            arrayList.add(d2);
            if (!(bp2 instanceof k)) continue;
            vq_1.J((Lp)d2, (k)bp2, (int)(a2 + vRa.d));
        }
        Lp.J((Lp)c2, arrayList);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Bp bp2) {
        Vq_1 vq_1 = this;
        for (Lp lp2 : vq_1.i) {
            void a2;
            if (Lp.J((Lp)lp2) != a2) continue;
            Lp.J((Lp)lp2, (long)OT.e);
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public Vq_1(k k2, String string) {
        void b2;
        Vq_1 a2;
        String c2 = string;
        Vq_1 vq_1 = a2 = this;
        super((k)b2, c2);
        vq_1.L = OT.i.k;
        vq_1.I = nqa.i;
        vq_1.J = pua.o;
        vq_1.C = JPa.N;
        Vq_1 vq_12 = a2;
        vq_1.k = new HashSet<String>();
        vq_1.j = (P)vRa.d;
        vq_1.j = new Eh();
        vq_1.i = new ArrayList<Lp>();
        vq_1.f();
    }

    @Override
    public float d() {
        Vq_1 a2;
        Vq_1 vq_1 = a2;
        vq_1.A();
        return vq_1.E * a2.i.size();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean J(int var1_3, int var2_4, int var3_6) {
        block2: {
            block4: {
                block3: {
                    d = var2_4;
                    b = this;
                    if (b.J <= 0) break block2;
                    v0 = b;
                    if (v0.J >= v0.i.size()) break block2;
                    v1 = b;
                    d = v1.i.get(v1.J);
                    if (!d.J() || c >= Lp.J((Lp)d) * Yqa.i) break block3;
                    v2 = d;
                    Lp.J((Lp)v2, (boolean)(Lp.J((Lp)v2) == false ? vRa.d : uSa.E));
                    if (!b.L.A) ** GOTO lbl21
                    if (Lp.J((Lp)d)) {
                        v3 = b;
                        v4 = v3;
                        v3.k.add(d.J());
                    } else {
                        b.k.remove(d.J());
lbl21:
                        // 2 sources

                        v4 = b;
                    }
                    v4.I = nqa.i;
                    b.A();
                    break block4;
                }
                b.M = b.M == d ? null : d;
            }
            return (boolean)vRa.d;
        }
        return (boolean)uSa.E;
    }
}

