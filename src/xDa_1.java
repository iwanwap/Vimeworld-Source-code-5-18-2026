/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  Waa
 *  gZ
 *  kqa
 *  lqa
 *  vL
 *  vRa
 */
public final class xDa_1
extends oEa {
    public int A;

    @Override
    public void J(RY rY2) {
        Object b2 = rY2;
        xDa_1 a2 = this;
        if (!a2.j.e) {
            if (((RY)b2).J != null) {
                xDa_1 xDa_12 = a2;
                ((RY)b2).J.J(gZ.J((oEa)xDa_12, (vL)xDa_12.G), lqa.ga);
                xDa_1 xDa_13 = a2;
                xDa_13.J(xDa_13.G, ((RY)b2).J);
            }
            xDa_1 xDa_14 = a2;
            boolean bl = b2 = xDa_14.j.J().f(kqa.N);
            xDa_14.j.J((vL)null, a2.la, a2.Z, (double)a2.A, (float)a2.A, bl, bl);
            a2.k();
        }
    }

    @Override
    public void f(Waa waa2) {
        xDa_1 b2 = waa2;
        xDa_1 a2 = this;
        xDa_1 xDa_12 = b2;
        super.f((Waa)xDa_12);
        xDa_12.J(UOa.Ha, a2.A);
    }

    /*
     * WARNING - void declaration
     */
    public xDa_1(Gg gg2, double d2, double d3, double d4, double d5, double d6, double d7) {
        void a2;
        void b2;
        void c2;
        void d8;
        void e2;
        void f2;
        xDa_1 h = gg2;
        xDa_1 g2 = this;
        super((Gg)h, (double)f2, (double)e2, (double)d8, (double)c2, (double)b2, (double)a2);
        g2.A = vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public xDa_1(Gg gg2, Gl gl2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        void e2;
        xDa_1 f2 = gl2;
        xDa_1 d5 = this;
        super((Gg)e2, (Gl)f2, (double)c2, (double)b2, (double)a2);
        d5.A = vRa.d;
    }

    @Override
    public void J(Waa waa2) {
        xDa_1 b2 = waa2;
        xDa_1 a2 = this;
        xDa_1 xDa_12 = b2;
        super.J((Waa)xDa_12);
        if (xDa_12.J(UOa.Ha, zOa.v)) {
            a2.A = b2.J(UOa.Ha);
        }
    }

    public xDa_1(Gg gg2) {
        xDa_1 b2 = gg2;
        xDa_1 a2 = this;
        super((Gg)b2);
        a2.A = vRa.d;
    }
}

