/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Rb
 *  ac
 *  qC
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ZB_2
extends ac {
    private Rb I;

    /*
     * WARNING - void declaration
     */
    public ZB_2(Rb rb, int n2, int n3, int n4, int n5) {
        void a2;
        void b2;
        void c2;
        void d2;
        ZB_2 e2;
        ZB_2 f2 = rb;
        ZB_2 zB_2 = e2 = this;
        super(f2.ordinal(), (int)d2, (int)c2, (int)b2, (int)a2, ZB_2.J((Rb)f2));
        zB_2.I = null;
        zB_2.I = f2;
    }

    private static String J(Rb rb) {
        Rb rb2 = rb;
        Object a2 = oha.J(rb2.getResourceKey(), new Object[uSa.E]) + Xpa.E;
        switch (qC.I[rb2.ordinal()]) {
            case 1: {
                return new StringBuilder().insert(2 & 5, (String)a2).append(xC.J(pA.tA)).toString();
            }
            case 2: {
                return new StringBuilder().insert(3 ^ 3, (String)a2).append(xC.J(pA.DA)).toString();
            }
            case 3: {
                return new StringBuilder().insert(3 & 4, (String)a2).append(xC.J(pA.hA)).toString();
            }
            case 4: {
                return new StringBuilder().insert(3 ^ 3, (String)a2).append(xC.J(pA.w)).toString();
            }
            case 5: {
                return new StringBuilder().insert(3 ^ 3, (String)a2).append(xC.J(pA.Oa)).toString();
            }
            case 6: {
                return new StringBuilder().insert(5 >> 3, (String)a2).append(xC.f(pA.oB)).toString();
            }
            case 7: {
                return new StringBuilder().insert(3 >> 2, (String)a2).append(xC.J(pA.ib)).toString();
            }
            case 8: {
                return new StringBuilder().insert(3 & 4, (String)a2).append(pA.fc.C()).toString();
            }
            case 9: {
                return new StringBuilder().insert(3 >> 2, (String)a2).append(pA.uB.C()).toString();
            }
            case 10: {
                return new StringBuilder().insert(0, (String)a2).append(xC.J(pA.e)).toString();
            }
            case 11: {
                return new StringBuilder().insert(0, (String)a2).append(xC.J(pA.yb)).toString();
            }
        }
        return new StringBuilder().insert(0, (String)a2).append(pA.J(rb2)).toString();
    }

    public Rb J() {
        ZB_2 a2;
        return a2.I;
    }

    public void J() {
        ZB_2 a2;
        a2.i = ZB_2.J(a2.I);
    }
}

