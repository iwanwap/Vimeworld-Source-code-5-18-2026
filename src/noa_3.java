/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  Wc
 *  ac
 *  vRa
 *  zf
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class noa_3
implements Wc {
    private final ac J;
    private final ac A;
    private final Kpa I;

    /*
     * WARNING - void declaration
     */
    public noa_3(ac ac2, ac ac3) {
        void b2;
        noa_3 a2;
        noa_3 c2 = ac3;
        noa_3 noa_32 = a2 = this;
        a2.I = Kpa.J();
        noa_32.A = b2;
        noa_32.J = c2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5, int n6, int n7) {
        void e2;
        int g2 = n4;
        noa_3 d2 = this;
        if (d2.A != null) {
            d2.A.J((int)e2, g2);
        }
        if (d2.J != null) {
            d2.J.J((int)e2, g2);
        }
    }

    public void J(int n2, int n3, int n4) {
        int d2 = n4;
        noa_3 noa_32 = this;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl) {
        void i2;
        void c2;
        void f2;
        int n9 = n8;
        noa_3 b2 = this;
        if (b2.A != null) {
            b2.A.I = f2;
            b2.A.J(b2.I, (int)c2, (int)i2);
        }
        if (b2.J != null) {
            b2.J.I = f2;
            b2.J.J(b2.I, (int)c2, (int)i2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2, int n3, int n4, int n5, int n6, int n7) {
        void e2;
        noa_3 d2;
        int g2 = n4;
        noa_3 noa_32 = d2 = this;
        if (noa_32.A.J(noa_32.I, (int)e2, g2)) {
            if (d2.A instanceof zf) {
                d2.I.z.f(((zf)d2.A).f(), vRa.d);
                d2.A.i = d2.I.z.J(Fha.getEnumOptions(d2.A.C));
            }
            return vRa.d != 0;
        }
        if (d2.J != null) {
            noa_3 noa_33 = d2;
            if (noa_33.J.J(noa_33.I, (int)e2, g2)) {
                if (d2.J instanceof zf) {
                    d2.I.z.f(((zf)d2.J).f(), vRa.d);
                    d2.J.i = d2.I.z.J(Fha.getEnumOptions(d2.J.C));
                }
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }
}

