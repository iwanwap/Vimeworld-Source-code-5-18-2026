/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  bpa
 *  cra
 *  nEa
 *  vL
 *  zEa
 */
public final class CDa_1
extends nEa {
    public float J() {
        return cra.S;
    }

    public float f() {
        return ZSa.q;
    }

    public float M() {
        return Lsa.X;
    }

    public CDa_1(Gg gg2) {
        CDa_1 b2 = gg2;
        CDa_1 a2 = this;
        super((Gg)b2);
    }

    /*
     * WARNING - void declaration
     */
    public CDa_1(Gg gg2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        CDa_1 e2 = gg2;
        CDa_1 d5 = this;
        super((Gg)e2, (double)c2, (double)b2, (double)a2);
    }

    public void J(RY rY2) {
        Object b2 = rY2;
        CDa_1 a2 = this;
        if (!a2.j.e) {
            a2.j.f(bpa.e, new XF((vL)a2), uSa.E);
            int n2 = b2 = yRa.d + a2.j.v.nextInt(tTa.h) + a2.j.v.nextInt(tTa.h);
            while (n2 > 0) {
                int n3 = zEa.J((int)b2);
                n2 = b2 - n3;
                CDa_1 cDa_1 = a2;
                a2.j.f((vL)new zEa(cDa_1.j, cDa_1.la, a2.Z, a2.A, n3));
            }
            a2.k();
        }
    }

    /*
     * WARNING - void declaration
     */
    public CDa_1(Gg gg2, Gl gl2) {
        void b2;
        CDa_1 c2 = gl2;
        CDa_1 a2 = this;
        super((Gg)b2, (Gl)c2);
    }
}

