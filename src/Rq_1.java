/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  Oz
 *  Ri
 *  bRa
 *  dQa
 *  pqa
 *  sG
 *  uOa
 *  vRa
 *  wI
 */
import org.lwjgl.input.Mouse;

public final class Rq_1
extends dQ {
    private boolean M;
    private float k;
    private float j;
    private final boolean J;
    private final wI A;
    private int I;

    /*
     * WARNING - void declaration
     */
    public Rq_1(Bp bp2, wI wI2) {
        void a2;
        Rq_1 b2;
        Bp c2 = bp2;
        Rq_1 rq_1 = b2 = this;
        super(c2);
        b2.j = vqa.T;
        b2.k = vqa.T;
        b2.A = a2;
        rq_1.J = b2.A.getBoolean(dQa.D, uSa.E != 0);
        rq_1.I = Math.round((c2.k.f() - pqa.r) * QTa.G);
    }

    @Override
    public boolean J(int n2) {
        int b22 = n2;
        Rq_1 a2 = this;
        if ((b22 = Oz.f((int)(a2.I + b22 * NTa.C), (int)a2.A.getInt(XOa.Q, bRa.L), (int)a2.A.getInt(Qra.O, ySa.T))) == a2.I) {
            return vRa.d != 0;
        }
        Rq_1 rq_1 = a2;
        rq_1.I = b22;
        float b22 = pqa.r + (float)b22 / QTa.G;
        rq_1.I.k.J(b22, Jpa.Ha, sG.A);
        rq_1.I.J.J(b22, Jpa.Ha, sG.A);
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(int n2, int n3, long l2, boolean bl) {
        void d22;
        int e22 = n3;
        Rq_1 c2 = this;
        if (c2.j == vqa.T || c2.k == vqa.T) {
            void a2;
            Rq_1 rq_1 = c2;
            rq_1.j = (float)d22;
            rq_1.k = e22;
            c2.M = a2;
        }
        if (Mouse.isButtonDown(uSa.E)) {
            float d22 = (float)d22 - c2.j;
            float e22 = (float)e22 - c2.k;
            int b2 = eq.A.l();
            Rq_1 rq_1 = c2;
            float f2 = rq_1.I.d.f();
            float a2 = rq_1.I.b.f();
            if (rq_1.J && !c2.M) {
                return uSa.E != 0;
            }
            Rq_1 rq_12 = c2;
            rq_12.I.d.J(f2 + d22 / (float)b2);
            rq_12.I.b.J(a2 + e22 / (float)b2);
        } else {
            Rq_1 rq_1 = c2;
            rq_1.j = vqa.T;
            rq_1.k = vqa.T;
            rq_1.M = uSa.E;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(int n2, int n3, int n4) {
        void a2;
        void b2;
        void c2;
        Rq_1 rq_1;
        Rq_1 rq_12 = rq_1 = this;
        Ri ri = rq_12.I.J(OT.e);
        Rq_1 d2 = new wI();
        d2.put(Wqa.fa, Fsa.c);
        d2.put(hpa.e, Mouse.getEventButton());
        d2.put(rRa.X, (int)(((float)eq.m - ri.I) / rq_1.I.k.f()));
        d2.put(uOa.Ja, (int)(((float)eq.E - ri.A) / rq_1.I.J.f()));
        OT.J((wI)d2);
        return super.J((int)c2, (int)b2, (int)a2);
    }
}

