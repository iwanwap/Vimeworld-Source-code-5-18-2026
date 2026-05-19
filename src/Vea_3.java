/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ega
 *  Gg
 *  HA
 *  MQa
 *  Mda
 *  Mfa
 *  NCa
 *  NTa
 *  Qsa
 *  Waa
 *  Yea
 *  Ypa
 *  aSa
 *  gZ
 *  vL
 *  vRa
 *  waa
 *  ysa
 *  zC
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class Vea_3
extends Yea
implements zC {
    private boolean A;
    private Mda[] I;

    public Mda f(int n2) {
        int b2 = n2;
        Vea_3 a2 = this;
        if (a2.I[b2] != null) {
            Vea_3 vea_3 = a2;
            Mda mda2 = vea_3.I[b2];
            vea_3.I[b2] = null;
            return mda2;
        }
        return null;
    }

    public String J() {
        Vea_3 a2;
        if (a2.J()) {
            return a2.e();
        }
        return PRa.s;
    }

    public boolean J(int n2, Mda mda2) {
        Vea_3 c2 = mda2;
        Vea_3 a2 = this;
        return vRa.d != 0;
    }

    public void J(Sx object) {
        Object b2 = object;
        object = this;
    }

    public Vea_3(Gg gg2) {
        Vea_3 b2 = gg2;
        Vea_3 a2 = this;
        super((Gg)b2);
        a2.I = new Mda[Qsa.Ha];
        a2.A = vRa.d;
    }

    public void J(int n2, int n3) {
        int c2 = n3;
        Vea_3 vea_3 = this;
    }

    public void f(int n2) {
        int b2 = n2;
        Vea_3 a2 = this;
        a2.A = uSa.E;
        super.f(b2);
    }

    /*
     * WARNING - void declaration
     */
    public void f(Waa waa2) {
        int b2;
        void a2;
        Vea_3 vea_3 = this;
        super.f((Waa)a2);
        waa waa3 = new waa();
        int n2 = b2 = uSa.E;
        while (n2 < vea_3.I.length) {
            if (vea_3.I[b2] != null) {
                Waa waa4 = new Waa();
                waa4.J(kua.E, (byte)b2);
                vea_3.I[b2].J(waa4);
                waa3.J((NCa)waa4);
            }
            n2 = ++b2;
        }
        a2.J(rua.la, (NCa)waa3);
    }

    public void J(int n2, Mda mda2) {
        Vea_3 c2 = mda2;
        Vea_3 a2 = this;
        a2.I[b] = c2;
        if (a2.I[b] != null && ((Mda)c2).E > a2.l()) {
            ((Mda)c2).E = a2.l();
        }
    }

    public int J(int n2) {
        int b2 = n2;
        Vea_3 a2 = this;
        return uSa.E;
    }

    public boolean l(Sx sx2) {
        Sx b2 = sx2;
        Vea_3 a2 = this;
        if (!a2.j.e) {
            b2.J((HA)a2);
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(int n2, int n3) {
        int c2 = n2;
        Vea_3 b2 = this;
        if (b2.I[c2] != null) {
            void a2;
            if (b2.I[c2].E <= a2) {
                Vea_3 vea_3 = b2;
                Mda mda2 = vea_3.I[c2];
                vea_3.I[c2] = null;
                return mda2;
            }
            Vea_3 vea_3 = b2;
            Mda mda3 = vea_3.I[c2].J((int)a2);
            if (vea_3.I[c2].E == 0) {
                b2.I[c2] = null;
            }
            return mda3;
        }
        return null;
    }

    public void J(gZ gZ2) {
        Vea_3 a2;
        Vea_3 b2 = gZ2;
        Vea_3 vea_3 = a2 = this;
        super.J((gZ)b2);
        if (vea_3.j.J().f(qQa.y)) {
            Vea_3 vea_32 = a2;
            Mfa.J((Gg)a2.j, (vL)vea_32, (HA)vea_32);
        }
    }

    public void l() {
        int a2;
        Vea_3 vea_3 = this;
        int n2 = a2 = uSa.E;
        while (n2 < vea_3.I.length) {
            vea_3.I[a2++] = null;
            n2 = a2;
        }
    }

    public int l() {
        return ysa.s;
    }

    public void J(Iaa object) {
        Object b2 = object;
        object = this;
    }

    public Iaa J() {
        return Iaa.A;
    }

    public boolean J(Sx sx2) {
        Object b2 = sx2;
        Vea_3 a2 = this;
        if (a2.J) {
            return uSa.E != 0;
        }
        if (b2.J((vL)a2) <= ypa.X) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public Mda J(int n2) {
        int b2 = n2;
        Vea_3 a2 = this;
        return a2.I[b2];
    }

    public int J() {
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public Vea_3(Gg gg2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        Vea_3 e2 = gg2;
        Vea_3 d5 = this;
        super((Gg)e2, (double)c2, (double)b2, (double)a2);
        d5.I = new Mda[Qsa.Ha];
        d5.A = vRa.d;
    }

    public void A() {
        Vea_3 vea_3 = this;
        int a22 = Ypa.A - Ega.J((HA)vea_3);
        float a22 = MQa.d + (float)a22 * ZSa.r;
        Vea_3 vea_32 = vea_3;
        vea_32.f(vea_32.i * (double)a22);
        vea_32.J(vea_32.Ea * aSa.V);
        vea_32.l(vea_32.f * (double)a22);
    }

    public void k() {
        Vea_3 a2;
        if (a2.A) {
            Vea_3 vea_3 = a2;
            Mfa.J((Gg)a2.j, (vL)vea_3, (HA)vea_3);
        }
        super.k();
    }

    public void f(Sx object) {
        Object b2 = object;
        object = this;
    }

    public void J(Waa waa2) {
        int n2;
        Vea_3 a2;
        Vea_3 b2 = waa2;
        Vea_3 vea_3 = a2 = this;
        super.J((Waa)b2);
        b2 = b2.J(rua.la, NTa.C);
        vea_3.I = new Mda[vea_3.f()];
        int n3 = n2 = uSa.E;
        while (n3 < b2.J()) {
            Waa waa3 = b2.J(n2);
            int n4 = waa3.J(kua.E) & osa.Ja;
            if (n4 >= 0 && n4 < a2.I.length) {
                a2.I[n4] = Mda.J((Waa)waa3);
            }
            n3 = ++n2;
        }
    }

    public void f() {
    }

    public boolean l() {
        return uSa.E != 0;
    }
}

