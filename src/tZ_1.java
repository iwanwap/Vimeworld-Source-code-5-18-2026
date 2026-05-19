/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  JPa
 *  JTa
 *  Mda
 *  NCa
 *  NTa
 *  Uqa
 *  Waa
 *  Ypa
 *  fda
 *  iea
 *  uY
 *  vRa
 *  waa
 */
import com.google.common.collect.Lists;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class tZ_1
extends uY {
    private List<Bz> M;
    private String k;
    private List<iea> j;
    private int J;
    private boolean A;
    private waa I;

    public KC J() {
        tZ_1 tZ_12 = this;
        tZ_1 a2 = new Waa();
        tZ_12.J((Waa)a2);
        return new fda(tZ_12.pos, uua.p, (Waa)a2);
    }

    public static int f(Mda mda2) {
        Mda mda3 = mda2;
        Mda a2 = mda3.J(uua.M, uSa.E != 0);
        if (a2 != null && a2.J(wta.M)) {
            return a2.J(wta.M, NTa.C).J();
        }
        return uSa.E;
    }

    public String J() {
        tZ_1 a2;
        tZ_1 tZ_12 = a2;
        tZ_12.J();
        return tZ_12.k;
    }

    public waa J() {
        tZ_1 a2;
        return a2.I;
    }

    public void f(Waa waa2) {
        tZ_1 a2;
        tZ_1 b2 = waa2;
        tZ_1 tZ_12 = a2 = this;
        tZ_1 tZ_13 = a2;
        tZ_1 tZ_14 = b2;
        super.f((Waa)b2);
        a2.J = tZ_14.J(Cra.g);
        tZ_13.I = tZ_14.J(wta.M, NTa.C);
        tZ_13.M = null;
        tZ_12.j = null;
        tZ_12.k = null;
        tZ_12.A = vRa.d;
    }

    public static void f(Mda mda2) {
        Mda mda3 = mda2;
        Mda a2 = mda3.J(uua.M, uSa.E != 0);
        if (a2 != null && a2.J(wta.M, WOa.fa) && (a2 = a2.J(wta.M, NTa.C)).J() > 0) {
            Mda mda4 = a2;
            mda4.J(mda4.J() - vRa.d);
            if (mda4.J()) {
                Mda mda5 = mda3;
                mda5.J().J(uua.M);
                if (mda5.J().J()) {
                    mda3.J((Waa)null);
                }
            }
        }
    }

    public static int J(Mda mda2) {
        Mda mda3 = mda2;
        Mda a2 = mda3.J(uua.M, uSa.E != 0);
        if (a2 != null && a2.J(Cra.g)) {
            return a2.J(Cra.g);
        }
        return mda3.J();
    }

    /*
     * WARNING - void declaration
     */
    public static void J(Waa waa2, int n2, waa waa3) {
        void b2;
        Waa c2 = waa3;
        Waa a2 = waa2;
        a2.J(Cra.g, (int)b2);
        if (c2 != null) {
            a2.J(wta.M, (NCa)c2);
        }
    }

    public void J(Waa waa2) {
        tZ_1 a2;
        tZ_1 b2 = waa2;
        tZ_1 tZ_12 = a2 = this;
        tZ_1 tZ_13 = b2;
        super.J((Waa)tZ_13);
        tZ_1.J((Waa)tZ_13, tZ_12.J, a2.I);
    }

    public tZ_1() {
        tZ_1 a2;
    }

    public int J() {
        tZ_1 a2;
        return a2.J;
    }

    public List<iea> f() {
        tZ_1 a2;
        tZ_1 tZ_12 = a2;
        tZ_12.J();
        return tZ_12.j;
    }

    public void J(Mda mda2) {
        tZ_1 b2 = mda2;
        tZ_1 a2 = this;
        a2.I = null;
        if (b2.M() && b2.J().J(uua.M, NTa.C)) {
            Waa waa2 = b2.J().J(uua.M);
            if (waa2.J(wta.M)) {
                a2.I = (waa)waa2.J(wta.M, NTa.C).J();
            }
            a2.J = waa2.J(Cra.g, zOa.v) ? waa2.J(Cra.g) : b2.J() & Ypa.A;
        } else {
            a2.J = b2.J() & Ypa.A;
        }
        tZ_1 tZ_12 = a2;
        tZ_1 tZ_13 = a2;
        tZ_13.M = null;
        tZ_12.j = null;
        tZ_13.k = Mqa.y;
        tZ_12.A = vRa.d;
    }

    public List<Bz> J() {
        tZ_1 a2;
        tZ_1 tZ_12 = a2;
        tZ_12.J();
        return tZ_12.M;
    }

    private void J() {
        tZ_1 tZ_12 = this;
        if (tZ_12.M == null || tZ_12.j == null || tZ_12.k == null) {
            if (!tZ_12.A) {
                tZ_12.k = Mqa.y;
                return;
            }
            tZ_1 tZ_13 = tZ_12;
            tZ_13.M = Lists.newArrayList();
            tZ_13.j = Lists.newArrayList();
            tZ_13.M.add(Bz.BASE);
            tZ_1 tZ_14 = tZ_12;
            tZ_14.j.add(iea.byDyeDamage((int)tZ_14.J));
            tZ_1 tZ_15 = tZ_12;
            tZ_12.k = JTa.Z + tZ_12.J;
            if (tZ_13.I != null) {
                int n2;
                int n3 = n2 = uSa.E;
                while (n3 < tZ_12.I.J()) {
                    tZ_1 a22 = tZ_12.I.J(n2);
                    Bz bz2 = Bz.getPatternByID(a22.J(Uqa.y));
                    if (bz2 != null) {
                        tZ_12.M.add(bz2);
                        int a22 = a22.J(JPa.ca);
                        tZ_12.j.add(iea.byDyeDamage((int)a22));
                        tZ_12.k = new StringBuilder().insert(3 ^ 3, tZ_12.k).append(bz2.getPatternID()).append(a22).toString();
                    }
                    n3 = ++n2;
                }
            }
        }
    }
}

