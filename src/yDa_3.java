/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  CZ
 *  HA
 *  Mda
 *  hc
 *  ld
 *  vRa
 *  yDa
 *  ysa
 */
import com.google.common.collect.Lists;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class yDa_3
implements HA {
    private int k;
    private List<hc> j;
    private Mda[] J;
    private boolean A;
    private String I;

    public void f(Sx object) {
        Object b2 = object;
        object = this;
    }

    public int J(int n2) {
        int b2 = n2;
        yDa_3 a2 = this;
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public yDa_3(ld ld2, int n2) {
        void b2;
        int c2 = n2;
        yDa_3 a2 = this;
        a2(b2.f(), vRa.d != 0, c2);
    }

    public boolean J(Sx sx2) {
        Object b2 = sx2;
        yDa_3 a2 = this;
        return vRa.d != 0;
    }

    public void f(hc hc2) {
        yDa_3 b2 = hc2;
        yDa_3 a2 = this;
        if (a2.j == null) {
            a2.j = Lists.newArrayList();
        }
        a2.j.add((hc)b2);
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(Mda mda2) {
        int n2;
        void a2;
        yDa_3 yDa_32 = this;
        yDa_3 b2 = a2.J();
        int n3 = n2 = uSa.E;
        while (n3 < yDa_32.k) {
            Mda mda3 = yDa_32.J(n2);
            if (mda3 == null) {
                yDa_3 yDa_33 = yDa_32;
                yDa_33.J(n2, (Mda)b2);
                yDa_33.f();
                return null;
            }
            if (Mda.l((Mda)mda3, (Mda)b2)) {
                int n4 = Math.min(yDa_32.l(), mda3.e());
                if ((n4 = Math.min(((Mda)b2).E, n4 - mda3.E)) > 0) {
                    yDa_3 yDa_34 = b2;
                    mda3.E += n4;
                    ((Mda)yDa_34).E -= n4;
                    if (((Mda)yDa_34).E <= 0) {
                        yDa_32.f();
                        return null;
                    }
                }
            }
            n3 = ++n2;
        }
        if (((Mda)b2).E != a2.E) {
            yDa_32.f();
        }
        return b2;
    }

    public void J(String string) {
        yDa_3 a2;
        String b2 = string;
        yDa_3 yDa_32 = a2 = this;
        yDa_32.A = vRa.d;
        yDa_32.I = b2;
    }

    public boolean J(int n2, Mda mda2) {
        yDa_3 c2 = mda2;
        yDa_3 a2 = this;
        return vRa.d != 0;
    }

    public void J(int n2, Mda mda2) {
        yDa_3 c2 = mda2;
        yDa_3 a2 = this;
        a2.J[b] = c2;
        if (a2.J[b] != null && ((Mda)c2).E > a2.l()) {
            ((Mda)c2).E = a2.l();
        }
        a2.f();
    }

    public void J(hc hc2) {
        yDa_3 b2 = hc2;
        yDa_3 a2 = this;
        a2.j.remove(b2);
    }

    public Mda f(int n2) {
        int b2 = n2;
        yDa_3 a2 = this;
        if (a2.J[b2] != null) {
            yDa_3 yDa_32 = a2;
            Mda mda2 = yDa_32.J[b2];
            yDa_32.J[b2] = null;
            return mda2;
        }
        return null;
    }

    public void l() {
        int a2;
        yDa_3 yDa_32 = this;
        int n2 = a2 = uSa.E;
        while (n2 < yDa_32.J.length) {
            yDa_32.J[a2++] = null;
            n2 = a2;
        }
    }

    public int J() {
        return uSa.E;
    }

    public String J() {
        yDa_3 a2;
        return a2.I;
    }

    public void J(Sx object) {
        Object b2 = object;
        object = this;
    }

    /*
     * WARNING - void declaration
     */
    public yDa_3(String string, boolean bl, int n2) {
        void b2;
        void c2;
        yDa_3 a2;
        int d2 = n2;
        yDa_3 yDa_32 = a2 = this;
        yDa_3 yDa_33 = a2;
        yDa_33.I = c2;
        yDa_33.A = b2;
        yDa_32.k = d2;
        yDa_32.J = new Mda[d2];
    }

    public ld J() {
        yDa_3 a2;
        if (a2.J()) {
            return new CY(a2.J());
        }
        return new CZ(a2.J(), new Object[uSa.E]);
    }

    public int f() {
        yDa_3 a2;
        return a2.k;
    }

    public boolean J() {
        yDa_3 a2;
        return a2.A;
    }

    public int l() {
        return ysa.s;
    }

    public Mda J(int n2) {
        int b2 = n2;
        yDa_3 a2 = this;
        if (b2 >= 0 && b2 < a2.J.length) {
            return a2.J[b2];
        }
        return null;
    }

    public void f() {
        yDa_3 yDa_32 = this;
        if (yDa_32.j != null) {
            int a2;
            int n2 = a2 = uSa.E;
            while (n2 < yDa_32.j.size()) {
                hc hc2 = yDa_32.j.get(a2);
                hc2.J((yDa)yDa_32);
                n2 = ++a2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(int n2, int n3) {
        int c2 = n2;
        yDa_3 b2 = this;
        if (b2.J[c2] != null) {
            void a2;
            if (b2.J[c2].E <= a2) {
                yDa_3 yDa_32 = b2;
                Mda mda2 = yDa_32.J[c2];
                yDa_32.J[c2] = null;
                yDa_32.f();
                return mda2;
            }
            yDa_3 yDa_33 = b2;
            Mda mda3 = yDa_33.J[c2].J((int)a2);
            if (yDa_33.J[c2].E == 0) {
                b2.J[c2] = null;
            }
            b2.f();
            return mda3;
        }
        return null;
    }

    public void J(int n2, int n3) {
        int c2 = n3;
        yDa_3 yDa_32 = this;
    }
}

