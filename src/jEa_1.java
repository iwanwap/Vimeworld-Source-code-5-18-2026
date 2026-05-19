/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  CZ
 *  Ega
 *  HA
 *  Mda
 *  Qea
 *  kea
 *  ld
 *  vRa
 *  zC
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class jEa_1
implements zC {
    private String J;
    private zC A;
    private zC I;

    public boolean J(HA hA2) {
        jEa_1 b2 = hA2;
        jEa_1 a2 = this;
        if (a2.I == b2 || a2.A == b2) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String J() {
        jEa_1 a2;
        if (a2.I.J()) {
            return a2.I.J();
        }
        if (a2.A.J()) {
            return a2.A.J();
        }
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    public jEa_1(String string, zC zC2, zC zC3) {
        jEa_1 b2;
        void c2;
        jEa_1 d2 = zC3;
        jEa_1 a2 = this;
        a2.J = c2;
        if (b2 == null) {
            b2 = d2;
        }
        if (d2 == null) {
            d2 = b2;
        }
        a2.I = b2;
        a2.A = d2;
        if (b2.l()) {
            d2.J(b2.J());
            return;
        }
        if (d2.l()) {
            b2.J(d2.J());
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, Mda mda2) {
        void a2;
        int c2 = n2;
        jEa_1 b2 = this;
        if (c2 >= b2.I.f()) {
            b2.A.J(c2 - b2.I.f(), (Mda)a2);
            return;
        }
        b2.I.J(c2, (Mda)a2);
    }

    public boolean J(Sx sx2) {
        Object b2 = sx2;
        jEa_1 a2 = this;
        if (a2.I.J((Sx)((Object)b2)) && a2.A.J((Sx)((Object)b2))) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String f() {
        jEa_1 a2;
        return a2.I.f();
    }

    public void f(Sx sx2) {
        jEa_1 a2;
        Object b2 = sx2;
        jEa_1 jEa_12 = a2 = this;
        jEa_12.I.f((Sx)((Object)b2));
        jEa_12.A.f((Sx)((Object)b2));
    }

    public boolean J(int n2, Mda mda2) {
        jEa_1 c2 = mda2;
        jEa_1 a2 = this;
        return vRa.d != 0;
    }

    public void f() {
        jEa_1 a2;
        jEa_1 jEa_12 = a2;
        jEa_12.I.f();
        jEa_12.A.f();
    }

    public int J(int n2) {
        int b2 = n2;
        jEa_1 a2 = this;
        return uSa.E;
    }

    public int f() {
        jEa_1 a2;
        return a2.I.f() + a2.A.f();
    }

    /*
     * WARNING - void declaration
     */
    public Ega J(kea kea2, Sx sx2) {
        void b2;
        Object c2 = sx2;
        jEa_1 a2 = this;
        return new Qea((HA)b2, (HA)a2, (Sx)((Object)c2));
    }

    public void J(Sx sx2) {
        jEa_1 a2;
        Object b2 = sx2;
        jEa_1 jEa_12 = a2 = this;
        jEa_12.I.J((Sx)((Object)b2));
        jEa_12.A.J((Sx)((Object)b2));
    }

    public int l() {
        jEa_1 a2;
        return a2.I.l();
    }

    public Mda f(int n2) {
        int b2 = n2;
        jEa_1 a2 = this;
        if (b2 >= a2.I.f()) {
            return a2.A.f(b2 - a2.I.f());
        }
        return a2.I.f(b2);
    }

    public int J() {
        return uSa.E;
    }

    public Mda J(int n2) {
        int b2 = n2;
        jEa_1 a2 = this;
        if (b2 >= a2.I.f()) {
            return a2.A.J(b2 - a2.I.f());
        }
        return a2.I.J(b2);
    }

    public Iaa J() {
        jEa_1 a2;
        return a2.I.J();
    }

    public void J(int n2, int n3) {
        int c2 = n3;
        jEa_1 jEa_12 = this;
    }

    public void l() {
        jEa_1 a2;
        jEa_1 jEa_12 = a2;
        jEa_12.I.l();
        jEa_12.A.l();
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(int n2, int n3) {
        void a2;
        int c2 = n2;
        jEa_1 b2 = this;
        if (c2 >= b2.I.f()) {
            return b2.A.J(c2 - b2.I.f(), (int)a2);
        }
        return b2.I.J(c2, (int)a2);
    }

    public boolean J() {
        jEa_1 a2;
        if (a2.I.J() || a2.A.J()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(Iaa iaa2) {
        jEa_1 a2;
        Iaa b2 = iaa2;
        jEa_1 jEa_12 = a2 = this;
        jEa_12.I.J(b2);
        jEa_12.A.J(b2);
    }

    public boolean l() {
        jEa_1 a2;
        if (a2.I.l() || a2.A.l()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public ld J() {
        jEa_1 a2;
        if (a2.J()) {
            return new CY(a2.J());
        }
        return new CZ(a2.J(), new Object[uSa.E]);
    }
}

