/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  di
 *  vRa
 *  zg
 */
public final class Ii
implements P {
    public boolean k;
    public zg j;
    public boolean J;
    public P A;
    public boolean I;

    @Override
    public int f(String string) {
        String b2 = string;
        Ii a2 = this;
        return a2.A.f(b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public String J(String string, int n2, boolean bl) {
        void b2;
        void c2;
        boolean d2 = bl;
        Ii a2 = this;
        return a2.A.J((String)c2, (int)b2, d2);
    }

    public Ii(P p) {
        P b2 = p;
        Ii a2 = this;
        a2.A = b2;
        a2.k = vRa.d;
    }

    @Override
    public int J(String string) {
        String b2 = string;
        Ii a2 = this;
        return a2.A.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(String string, int n2, int n3, int n4, boolean bl) {
        void f2;
        void b2;
        void c2;
        void d2;
        void e2;
        boolean bl2 = bl;
        Ii a2 = this;
        a2.A.J((String)e2, (int)d2, (int)c2, (int)b2, (boolean)f2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void J() {
        Ii ii2 = this;
        if (ii2.I) {
            return;
        }
        Object a2 = di.C;
        synchronized (a2) {
            block6: {
                if (!ii2.I) break block6;
                return;
            }
            ii2.I = vRa.d;
            if (ii2.j != null) {
                ii2.j.J -= vRa.d;
                ii2.j.I = OT.e;
            }
            return;
        }
    }
}

