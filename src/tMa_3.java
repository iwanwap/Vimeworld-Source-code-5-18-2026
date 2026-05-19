/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GNa
 *  KA
 *  LQa
 *  Mda
 *  XTa
 *  cb
 *  eAa
 *  hra
 *  jNa
 *  mka
 *  nLa
 *  pKa
 *  pqa
 *  pua
 *  uKa
 *  vRa
 */
public final class tMa_3
extends cb {
    public final /* synthetic */ GNa A;
    public int I;

    /*
     * WARNING - void declaration
     */
    private void C(int n2, int n3, int n4, int n5) {
        void a2;
        void b2;
        void c2;
        void d2;
        tMa_3 e2;
        tMa_3 tMa_32 = this;
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        tMa_32.B.J().J(KA.j);
        pKa pKa2 = pKa.J();
        tMa_3 tMa_33 = e2 = pKa2.J();
        void v2 = d2;
        tMa_3 tMa_34 = e2;
        tMa_34.J(XTa.W, mka.A);
        tMa_34.J((double)(d2 + uSa.E), (double)(c2 + yOa.B), tMa_32.A.I).J((double)((float)(b2 + uSa.E) * hra.Ka), (double)((float)(a2 + yOa.B) * hra.Ka)).M();
        e2.J((double)(v2 + yOa.B), (double)(c2 + yOa.B), tMa_32.A.I).J((double)((float)(b2 + yOa.B) * hra.Ka), (double)((float)(a2 + yOa.B) * hra.Ka)).M();
        tMa_33.J((double)(v2 + yOa.B), (double)(c2 + uSa.E), tMa_32.A.I).J((double)((float)(b2 + yOa.B) * hra.Ka), (double)((float)(a2 + uSa.E) * hra.Ka)).M();
        tMa_33.J((double)(d2 + uSa.E), (double)(c2 + uSa.E), tMa_32.A.I).J((double)((float)(b2 + uSa.E) * hra.Ka), (double)((float)(a2 + uSa.E) * hra.Ka)).M();
        pKa2.J();
    }

    /*
     * WARNING - void declaration
     */
    private void C(int n2, int n3) {
        void b2;
        int c2 = n3;
        tMa_3 a2 = this;
        a2.C((int)b2, c2, uSa.E, uSa.E);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5, int n6, int n7) {
        void d2;
        void e2;
        int g22 = n2;
        tMa_3 f2 = this;
        jNa g22 = (jNa)GNa.J().get(g22);
        tMa_3 tMa_32 = f2;
        jNa jNa2 = g22;
        tMa_32.J((int)e2, (int)d2, jNa2.J, jNa2.j);
        tMa_32.A.L.J(g22.A, (int)(e2 + yOa.B + tTa.h), (int)(d2 + uua.p), pua.o);
    }

    public tMa_3(GNa gNa2) {
        tMa_3 b2 = gNa2;
        tMa_3 a2 = this;
        a2.A = b2;
        tMa_3 tMa_32 = b2;
        super(((GNa)b2).g, ((GNa)tMa_32).A, ((GNa)tMa_32).I, Fua.J, ((GNa)b2).I - LQa.c, osa.c);
        a2.I = pua.o;
    }

    public boolean f(int n2) {
        int b2 = n2;
        tMa_3 a2 = this;
        if (b2 == a2.I) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(int n2, boolean bl, int n3, int n4) {
        tMa_3 d2;
        int e2 = n2;
        tMa_3 tMa_32 = d2 = this;
        tMa_32.I = e2;
        tMa_32.A.J();
        GNa.J((GNa)tMa_32.A).f(((jNa)GNa.J().get((int)GNa.J((GNa)d2.A).I)).I);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, int n3, eAa eAa2, int n4) {
        void a2;
        void b2;
        void d2;
        tMa_3 c2;
        int e2 = n3;
        tMa_3 tMa_32 = c2 = this;
        tMa_32.C((int)(d2 + vRa.d), e2 + vRa.d);
        uKa.o();
        nLa.J();
        tMa_32.A.m.J(new Mda((eAa)b2, vRa.d, (int)a2), (int)(d2 + uqa.g), e2 + uqa.g);
        nLa.C();
        uKa.E();
    }

    public void l() {
    }

    public int e() {
        return GNa.J().size();
    }
}

