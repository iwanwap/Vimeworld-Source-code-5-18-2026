/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  JPa
 *  Kpa
 *  NQa
 *  XM
 *  XTa
 *  aKa
 *  aSa
 *  gna
 *  k
 *  mka
 *  pKa
 *  pqa
 *  uKa
 *  vRa
 */
public final class Qp
extends Bp {
    private final Kpa I;

    /*
     * WARNING - void declaration
     */
    public Qp(k k2, XM xM) {
        void b2;
        Qp a2;
        Qp c2 = xM;
        Qp qp = a2 = this;
        super((k)b2, (XM)c2);
        qp.I = Kpa.J();
        qp.A();
    }

    @Override
    public void J(long a2) {
        Qp b2;
        Qp qp = b2;
        qp.f(qp.x.J);
        uKa.u();
        uKa.J(uSa.E != 0);
        uKa.f((int)vRa.d, (int)Wqa.w);
        qp.I.J().J(gna.h);
        aKa aKa2 = a2 = pKa.J().J();
        aKa aKa3 = a2;
        aKa3.J(XTa.W, mka.A);
        aKa3.J(aSa.V, (double)b2.s.f(), AQa.K).J(aSa.V, oua.i).M();
        aKa2.J((double)b2.s.J(), (double)b2.s.f(), AQa.K).J(oua.i, oua.i).M();
        aKa2.J((double)b2.s.J(), aSa.V, AQa.K).J(oua.i, aSa.V).M();
        aKa2.J(aSa.V, aSa.V, AQa.K).J(aSa.V, aSa.V).M();
        pKa.J().J();
        uKa.J(vRa.d != 0);
        uKa.J();
    }

    @Override
    public float e() {
        Qp a2;
        return a2.s.J();
    }

    private void A() {
        Qp a2;
        Qp qp = a2;
        qp.c = yG.TOP_LEFT;
        qp.d.J(JPa.N);
        qp.b.J(JPa.N);
    }

    @Override
    public float d() {
        Qp a2;
        return a2.s.f();
    }

    private void f(int n2) {
        int b22 = n2;
        Qp a2 = this;
        float f2 = (float)(b22 >> osa.c & osa.Ja) / NQa.Y;
        float f3 = (float)(b22 >> ERa.C & osa.Ja) / NQa.Y * f2;
        float f4 = (float)(b22 >> Yqa.i & osa.Ja) / NQa.Y * f2;
        float b22 = (float)(b22 & osa.Ja) / NQa.Y * f2;
        uKa.f((float)f3, (float)f4, (float)b22, (float)pqa.r);
    }
}

