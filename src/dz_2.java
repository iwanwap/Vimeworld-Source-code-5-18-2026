/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ega
 *  HA
 *  Mda
 *  NCa
 *  NTa
 *  Qqa
 *  Waa
 *  cRa
 *  fFa
 *  kea
 *  pua
 *  vRa
 *  vX
 *  waa
 *  ysa
 */
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class dz_2
extends vX
implements HA {
    private static final Random J = new Random();
    private Mda[] A = new Mda[WOa.fa];
    public String I;

    public int J(int n2) {
        int b2 = n2;
        dz_2 a2 = this;
        return uSa.E;
    }

    public boolean J(Sx sx2) {
        dz_2 a2;
        Object b2 = sx2;
        dz_2 dz_22 = a2 = this;
        if (dz_22.worldObj.J(dz_22.pos) != a2) {
            return uSa.E != 0;
        }
        if (b2.f((double)a2.pos.getX() + kTa.B, (double)a2.pos.getY() + kTa.B, (double)a2.pos.getZ() + kTa.B) <= ypa.X) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int J() {
        return uSa.E;
    }

    public dz_2() {
        dz_2 a2;
    }

    public void f(Sx object) {
        Object b2 = object;
        object = this;
    }

    public void J(Sx object) {
        Object b2 = object;
        object = this;
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(int n2, int n3) {
        int c2 = n2;
        dz_2 b2 = this;
        if (b2.A[c2] != null) {
            void a2;
            if (b2.A[c2].E <= a2) {
                dz_2 dz_22 = b2;
                Mda mda2 = dz_22.A[c2];
                dz_22.A[c2] = null;
                dz_22.f();
                return mda2;
            }
            dz_2 dz_23 = b2;
            Mda mda3 = dz_23.A[c2].J((int)a2);
            if (dz_23.A[c2].E == 0) {
                b2.A[c2] = null;
            }
            b2.f();
            return mda3;
        }
        return null;
    }

    public int f() {
        return WOa.fa;
    }

    /*
     * WARNING - void declaration
     */
    public int J(Mda mda2) {
        int b2;
        dz_2 dz_22 = this;
        int n2 = b2 = uSa.E;
        while (n2 < dz_22.A.length) {
            if (dz_22.A[b2] == null || dz_22.A[b2].J() == null) {
                void a2;
                dz_22.J(b2, (Mda)a2);
                return b2;
            }
            n2 = ++b2;
        }
        return pua.o;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Waa waa2) {
        int b2;
        void a2;
        dz_2 dz_22 = this;
        super.J((Waa)a2);
        waa waa3 = new waa();
        int n2 = b2 = uSa.E;
        while (n2 < dz_22.A.length) {
            if (dz_22.A[b2] != null) {
                Waa waa4 = new Waa();
                waa4.J(kua.E, (byte)b2);
                dz_22.A[b2].J(waa4);
                waa3.J((NCa)waa4);
            }
            n2 = ++b2;
        }
        a2.J(rua.la, (NCa)waa3);
        if (dz_22.J()) {
            a2.J(cRa.k, dz_22.I);
        }
    }

    public void J(String string) {
        Object b2 = string;
        dz_2 a2 = this;
        a2.I = b2;
    }

    public Mda J(int n2) {
        int b2 = n2;
        dz_2 a2 = this;
        return a2.A[b2];
    }

    public String J() {
        dz_2 a2;
        if (a2.J()) {
            return a2.I;
        }
        return yOa.T;
    }

    public void l() {
        int a2;
        dz_2 dz_22 = this;
        int n2 = a2 = uSa.E;
        while (n2 < dz_22.A.length) {
            dz_22.A[a2++] = null;
            n2 = a2;
        }
    }

    public boolean J() {
        dz_2 a2;
        if (a2.I != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public Ega J(kea kea2, Sx sx2) {
        dz_2 c2 = kea2;
        dz_2 b2 = this;
        return new fFa((HA)c2, (HA)b2);
    }

    public boolean J(int n2, Mda mda2) {
        dz_2 c2 = mda2;
        dz_2 a2 = this;
        return vRa.d != 0;
    }

    public int d() {
        int a2;
        dz_2 dz_22 = this;
        int n2 = pua.o;
        int n3 = vRa.d;
        int n4 = a2 = uSa.E;
        while (n4 < dz_22.A.length) {
            if (dz_22.A[a2] != null) {
                int n5 = J.nextInt(n3);
                ++n3;
                if (n5 == 0) {
                    n2 = a2;
                }
            }
            n4 = ++a2;
        }
        return n2;
    }

    public int l() {
        return ysa.s;
    }

    public String f() {
        return Qqa.n;
    }

    public void J(int n2, int n3) {
        int c2 = n3;
        dz_2 dz_22 = this;
    }

    public void f(Waa waa2) {
        int n2;
        dz_2 a2;
        dz_2 b2 = waa2;
        dz_2 dz_22 = a2 = this;
        super.f((Waa)b2);
        waa waa3 = b2.J(rua.la, NTa.C);
        dz_22.A = new Mda[dz_22.f()];
        int n3 = n2 = uSa.E;
        while (n3 < waa3.J()) {
            Waa waa4 = waa3.J(n2);
            int n4 = waa4.J(kua.E) & osa.Ja;
            if (n4 >= 0 && n4 < a2.A.length) {
                a2.A[n4] = Mda.J((Waa)waa4);
            }
            n3 = ++n2;
        }
        if (b2.J(cRa.k, Yqa.i)) {
            a2.I = b2.J(cRa.k);
        }
    }

    public void J(int n2, Mda mda2) {
        dz_2 c2 = mda2;
        dz_2 a2 = this;
        a2.A[b] = c2;
        if (a2.A[b] != null && ((Mda)c2).E > a2.l()) {
            ((Mda)c2).E = a2.l();
        }
        a2.f();
    }

    public Mda f(int n2) {
        int b2 = n2;
        dz_2 a2 = this;
        if (a2.A[b2] != null) {
            dz_2 dz_22 = a2;
            Mda mda2 = dz_22.A[b2];
            dz_22.A[b2] = null;
            return mda2;
        }
        return null;
    }
}

