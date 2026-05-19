/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  EK
 *  ERa
 *  ISa
 *  JPa
 *  Lra
 *  MQa
 *  NQa
 *  Ppa
 *  XTa
 *  aSa
 *  bpa
 *  dN
 *  jH
 *  kpa
 *  mka
 *  pKa
 *  pqa
 *  pua
 *  uKa
 *  vRa
 *  xy
 */
public final class BH_3
extends jH {
    public kL j;
    public float J;
    public EK A;
    public float I;

    private void i() {
        BH_3 a2;
        BH_3 bH_3 = a2;
        bH_3.J = (float)BH_3.J((int)bH_3.A.M) / NQa.Y;
        bH_3.A.J(BH_3.l((int)a2.A.M, (int)CRa.L));
    }

    /*
     * WARNING - void declaration
     */
    public void J(long l2) {
        void a2;
        BH_3 bH_3 = this;
        if (!bH_3.J((long)a2)) {
            return;
        }
        BH_3 bH_32 = bH_3;
        bH_32.C((long)a2);
        bH_32.C();
        uKa.J(uSa.E != 0);
        uKa.B();
        uKa.f((int)Lra.k, (int)kpa.J);
        uKa.e();
        uKa.f((double)((double)bH_32.F.I.f() - RKa.k), (double)(aSa.V - RKa.C), (double)((double)bH_3.F.A.f() - RKa.f));
        float b2 = kTa.J;
        uKa.l((float)(-bH_32.f.I.f() * b2), (float)(-b2), (float)(-bH_3.f.A.f() * b2));
        uKa.e();
        b2 = fPa.a;
        uKa.J((float)(CRa.M * b2), (float)JPa.N, (float)(eua.C * b2));
        float f2 = b2;
        uKa.l((float)f2, (float)pqa.r, (float)f2);
        bH_32.J(BH_3.l((int)bH_32.A.J(), (int)ERa.C), uSa.E != 0);
        uKa.D();
        uKa.J((float)((float)(a2 / fta.d % nOa.Ka)), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)CRa.M, (float)JPa.N, (float)eua.C);
        uKa.e();
        bH_32.J(bH_32.A.J(), vRa.d != 0);
        uKa.D();
        uKa.e();
        uKa.J((float)MTa.y, (float)JPa.N, (float)Ppa.Ha);
        uKa.l((float)MQa.L, (float)pqa.r, (float)MQa.L);
        bH_32.J(BH_3.f((int)bH_32.A.J(), (int)Bpa.s), vRa.d != 0);
        uKa.D();
        uKa.D();
        bH_32.d();
    }

    /*
     * WARNING - void declaration
     */
    private void J(float f2, float f3, float f4, float f5) {
        void c2;
        void a2;
        void d2;
        void b2;
        BH_3 e2;
        BH_3 bH_3 = this;
        BH_3 bH_32 = e2 = pKa.J().J();
        void v1 = b2;
        BH_3 bH_33 = e2;
        bH_33.J(XTa.W, mka.M);
        bH_33.J((double)d2, (double)a2, aSa.V).M();
        e2.J((double)v1, (double)a2, aSa.V).M();
        bH_32.J((double)v1, (double)c2, aSa.V).M();
        bH_32.J((double)d2, (double)c2, aSa.V).M();
        pKa.J().J();
    }

    public void J(RN rN2) {
        Object b2 = rN2;
        BH_3 a2 = this;
        Object object = b2;
        super.J((RN)object);
        if (!((RN)object).hasEBeam()) {
            return;
        }
        if ((b2 = ((RN)b2).getEBeam()).hasColor()) {
            BH_3 bH_3 = a2;
            bH_3.A.J(b2.getColor());
            bH_3.i();
        }
        if (b2.hasHeight()) {
            a2.j.J(b2.getHeight());
            return;
        }
        if (b2.hasHeightAnim()) {
            BH_3 bH_3 = a2;
            a2.j.J(b2.getHeightAnim(), bH_3.i, bH_3.L);
        }
    }

    public void M() {
        BH_3 a2;
        double d2 = bpa.K * Math.max(a2.f.I.f(), a2.f.A.f());
        BH_3 bH_3 = a2;
        double d3 = d2;
        a2.e = new xy(-d2, aSa.V, -d2, d3, (double)(NQa.Y - a2.F.J.J()), d3).C((double)a2.F.I.J(), (double)a2.F.J.J(), (double)a2.F.A.J());
    }

    public void l() {
        BH_3 a2;
        a2.j = (kL)((float)(BH_3.J((double)(a2.C.A - (double)a2.F.I.J())) + BH_3.J((double)(a2.C.g - (double)a2.F.A.J()))));
    }

    /*
     * WARNING - void declaration
     */
    private void C(long l2) {
        void a22;
        BH_3 bH_3 = this;
        int b2 = (int)(a22 - bH_3.f);
        int a22 = (int)(bH_3.M - a22);
        if (b2 <= bH_3.l) {
            bH_3.I = (float)b2 / (float)bH_3.l;
            return;
        }
        if (a22 <= bH_3.G) {
            bH_3.I = (float)a22 / (float)bH_3.G;
            return;
        }
        bH_3.I = pqa.r;
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, boolean bl) {
        int n3;
        int c2 = n2;
        BH_3 b2 = this;
        uKa.z();
        uKa.m();
        int n4 = c2;
        BH_3.J((int)BH_3.l((int)n4, (int)((int)((float)BH_3.J((int)n4) * b2.I * b2.J))));
        c2 = Fsa.q;
        BH_3 bH_3 = b2;
        int n5 = (int)(bH_3.F.J.f() / NQa.Y * (float)c2);
        c2 = (int)((bH_3.F.J.f() + b2.j.f()) / NQa.Y * (float)c2);
        int n6 = n3 = uSa.E;
        while (n6 < AQa.P) {
            void a2;
            if (a2 != false) {
                uKa.e();
                int n7 = uSa.E;
                while (n7 < uqa.g) {
                    int n8;
                    uKa.J((float)pqa.r, (float)JPa.N, (float)JPa.N);
                    b2.J(vqa.T, -c2, pqa.r, -n5);
                    uKa.J((float)vqa.T, (float)JPa.N, (float)JPa.N);
                    uKa.J((float)ISa.a, (float)JPa.N, (float)pqa.r, (float)JPa.N);
                    n7 = ++n8;
                }
                uKa.D();
            }
            uKa.J((float)eua.C, (float)JPa.N, (float)JPa.N);
            b2.J(CRa.M, -c2, eua.C, -n5);
            uKa.J((float)eua.C, (float)JPa.N, (float)JPa.N);
            uKa.J((float)ISa.a, (float)JPa.N, (float)pqa.r, (float)JPa.N);
            n6 = ++n3;
        }
        uKa.H();
    }

    public BH_3(dN dN2) {
        BH_3 a2;
        BH_3 b2 = dN2;
        BH_3 bH_3 = a2 = this;
        super((dN)b2);
        BH_3 bH_32 = a2;
        a2.A = new EK(pua.o);
        bH_32.I = pqa.r;
        bH_3.j = kL.J();
        b2 = b2.getEBeamPartial();
        bH_3.A.J(b2.getColor());
        bH_3.j.J(b2.hasHeight() ? b2.getHeight() : NQa.Y - a2.F.J.J());
        a2.i();
    }
}

