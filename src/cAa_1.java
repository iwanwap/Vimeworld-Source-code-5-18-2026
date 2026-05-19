/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  I
 *  JPa
 *  MQa
 *  aAa
 *  kta
 *  vL
 *  vRa
 *  yCa
 *  zAa
 */
public final class cAa_1 {
    private aAa[] J;
    private Ex A;
    private zAa I;

    /*
     * WARNING - void declaration
     */
    private yCa J(aAa aAa2, aAa aAa3) {
        aAa aAa4;
        void a2;
        aAa[] c2;
        aAa[] aAaArray = this;
        int b2 = vRa.d;
        aAa[] aAaArray2 = c2 = a2;
        while (aAaArray2.J != null) {
            aAaArray2 = c2.J;
            ++b2;
        }
        aAa[] aAaArray3 = new aAa[b2];
        c2 = aAaArray3;
        aAa aAa5 = aAa4 = a2;
        c2[--b2] = a2;
        while (aAa5.J != null) {
            --b2;
            aAa5 = aAa4 = aAa4.J;
        }
        return new yCa(c2);
    }

    /*
     * WARNING - void declaration
     */
    private yCa J(vL vL2, aAa aAa2, aAa aAa3, float f2) {
        void b2;
        void c2;
        cAa_1 cAa_12;
        cAa_1 cAa_13 = cAa_12 = this;
        void v1 = c2;
        void v2 = c2;
        v2.M = JPa.N;
        v2.j = v1.f((aAa)b2);
        v1.m = v1.j;
        cAa_13.I.J();
        cAa_13.I.J((aAa)c2);
        aAa aAa4 = c2;
        while (!cAa_12.I.J()) {
            void a2;
            void d2;
            aAa aAa5 = cAa_12.I.J();
            if (aAa5.equals((Object)b2)) {
                return cAa_12.J((aAa)c2, (aAa)b2);
            }
            if (aAa5.f((aAa)b2) < aAa4.f((aAa)b2)) {
                aAa4 = aAa5;
            }
            aAa5.A = vRa.d;
            cAa_1 cAa_14 = cAa_12;
            int n2 = cAa_14.A.J(cAa_14.J, (vL)d2, aAa5, (aAa)b2, (float)a2);
            int n3 = uSa.E;
            while (n3 < n2) {
                float f3;
                int n4;
                cAa_1 e2 = cAa_12.J[n4];
                float f4 = aAa5.M + aAa5.f((aAa)e2);
                if (f3 < a2 * kta.v && (!e2.J() || f4 < ((aAa)e2).M)) {
                    cAa_1 cAa_15 = e2;
                    cAa_1 cAa_16 = e2;
                    ((aAa)e2).J = aAa5;
                    ((aAa)cAa_16).M = f4;
                    ((aAa)cAa_16).j = cAa_15.f((aAa)b2);
                    if (cAa_15.J()) {
                        cAa_1 cAa_17 = e2;
                        cAa_12.I.J((aAa)cAa_17, ((aAa)e2).M + ((aAa)cAa_17).j);
                    } else {
                        cAa_1 cAa_18 = e2;
                        ((aAa)cAa_18).m = ((aAa)cAa_18).M + ((aAa)cAa_18).j;
                        cAa_12.I.J((aAa)e2);
                    }
                }
                n3 = ++n4;
            }
        }
        if (aAa4 == c2) {
            return null;
        }
        return cAa_12.J((aAa)c2, aAa4);
    }

    public cAa_1(Ex ex2) {
        Ex b2 = ex2;
        cAa_1 a2 = this;
        cAa_1 cAa_12 = a2;
        a2.I = new zAa();
        cAa_12.J = new aAa[fPa.i];
        a2.A = b2;
    }

    /*
     * WARNING - void declaration
     */
    public yCa J(I i2, vL vL2, vL vL3, float f2) {
        void a2;
        void c2;
        void d2;
        cAa_1 e2 = vL3;
        cAa_1 b2 = this;
        return b2.J((I)d2, (vL)c2, ((vL)e2).la, e2.J().j, ((vL)e2).A, (float)a2);
    }

    /*
     * WARNING - void declaration
     */
    private yCa J(I i2, vL vL2, double d2, double d3, double d4, float f2) {
        void a2;
        void b2;
        void c2;
        void d222;
        void e2;
        cAa_1 f3;
        cAa_1 g2 = i2;
        cAa_1 cAa_12 = f3 = this;
        cAa_12.I.J();
        cAa_12.A.J((I)g2, (vL)e2);
        g2 = cAa_12.A.J((vL)e2);
        aAa d222 = cAa_12.A.J((vL)e2, (double)d222, (double)c2, (double)b2);
        g2 = cAa_12.J((vL)e2, (aAa)g2, d222, (float)a2);
        cAa_12.A.J();
        return g2;
    }

    /*
     * WARNING - void declaration
     */
    public yCa J(I i2, vL vL2, XF xF2, float f2) {
        void a2;
        void c2;
        void d2;
        Object e2 = xF2;
        cAa_1 b2 = this;
        return b2.J((I)d2, (vL)c2, (float)e2.getX() + MQa.L, (float)e2.getY() + MQa.L, (float)e2.getZ() + MQa.L, (float)a2);
    }
}

