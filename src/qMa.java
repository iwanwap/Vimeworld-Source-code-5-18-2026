/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  Wc
 *  cb
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class qMa
extends cb {
    public boolean f(int n2) {
        int b2 = n2;
        qMa a2 = this;
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5, int n6, int n7) {
        void a2;
        void c2;
        void d2;
        void e2;
        void b2;
        int g = n2;
        qMa f2 = this;
        void v0 = b2;
        f2.J(g).J(g, (int)e2, (int)d2, f2.l(), (int)c2, (int)v0, (int)a2, (f2.J((int)v0, (int)a2) == g ? vRa.d : uSa.E) != 0);
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(int n2, int n3, int n4) {
        int d2;
        qMa qMa2 = this;
        int n5 = d2 = uSa.E;
        while (n5 < qMa2.e()) {
            void a2;
            void b2;
            void c2;
            qMa qMa3 = qMa2;
            qMa qMa4 = qMa2;
            int n6 = qMa3.A + qMa4.E / uqa.g - qMa2.l() / uqa.g + uqa.g;
            int n7 = qMa3.M + AQa.P - qMa2.f() + d2 * qMa2.D + qMa2.G;
            n6 = c2 - n6;
            n7 = b2 - n7;
            qMa4.J(d2).J(d2++, (int)c2, (int)b2, (int)a2, n6, n7);
            n5 = d2;
        }
        qMa2.J(vRa.d != 0);
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) {
        void a2;
        void b2;
        int d2 = n2;
        qMa c2 = this;
        c2.J(d2).J(d2, (int)b2, (int)a2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2, int n3, int n4) {
        void c2;
        int n5;
        void b2;
        qMa qMa2 = this;
        if (qMa2.J((int)b2) && (n5 = qMa2.J((int)c2, (int)b2)) >= 0) {
            void a2;
            qMa qMa3 = qMa2;
            qMa qMa4 = qMa2;
            int n6 = qMa3.A + qMa4.E / uqa.g - qMa2.l() / uqa.g + uqa.g;
            int d2 = qMa3.M + AQa.P - qMa2.f() + n5 * qMa2.D + qMa2.G;
            n6 = c2 - n6;
            d2 = b2 - d2;
            if (qMa4.J(n5).J(n5, (int)c2, (int)b2, (int)a2, n6, d2)) {
                qMa2.J(uSa.E != 0);
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public qMa(Kpa kpa2, int n2, int n3, int n4, int n5, int n6) {
        void g;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        int n7 = n6;
        qMa a2 = this;
        super((Kpa)f2, (int)e2, (int)d2, (int)c2, (int)b2, (int)g);
    }

    public abstract Wc J(int var1);

    public void l() {
    }

    public void J(int n2, boolean bl, int n3, int n4) {
        int n5 = n4;
        qMa a2 = this;
    }
}

