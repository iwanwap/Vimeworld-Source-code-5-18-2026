/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  NTa
 *  Rda
 *  Yea
 *  vL
 *  vRa
 */
public final class ZEa
extends Yea {
    public Rda J() {
        return Rda.RIDEABLE;
    }

    public boolean l(Sx sx) {
        Object b2 = sx;
        ZEa a2 = this;
        if (a2.Aa != null && a2.Aa instanceof Sx && a2.Aa != b2) {
            return vRa.d != 0;
        }
        if (a2.Aa != null && a2.Aa != b2) {
            return uSa.E != 0;
        }
        if (!a2.j.e) {
            b2.l((vL)a2);
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void e2;
        boolean bl2 = bl;
        ZEa a2 = this;
        if (e2 != false) {
            if (a2.Aa != null) {
                a2.Aa.l((vL)null);
            }
            if (a2.G() == 0) {
                ZEa zEa = a2;
                zEa.i(-zEa.D());
                zEa.A(NTa.C);
                zEa.l(SPa.b);
                zEa.i();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public ZEa(Gg gg2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        ZEa e2 = gg2;
        ZEa d5 = this;
        super((Gg)e2, (double)c2, (double)b2, (double)a2);
    }

    public ZEa(Gg gg2) {
        ZEa b2 = gg2;
        ZEa a2 = this;
        super((Gg)b2);
    }
}

