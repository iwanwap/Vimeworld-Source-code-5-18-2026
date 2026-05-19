/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ISa
 *  JPa
 *  Kh
 *  Kpa
 *  Lra
 *  XM
 *  YQ
 *  ZOa
 *  aN
 *  aSa
 *  cI
 *  cP
 *  k
 *  pQ
 *  pqa
 *  pua
 *  uKa
 *  uRa
 *  ur
 *  vRa
 */
public final class cP_3
extends nP {
    private boolean E;
    private float m;
    private boolean C;
    private final vC i;
    private YQ M;
    private float k;
    private AR j;
    private float J;
    private float A;
    private float I;

    private boolean l() {
        cP_3 cP_32 = this;
        float f2 = (float)Kpa.J().N.f() + Kpa.J().w.j.J();
        float a2 = (f2 - cP_32.I) / eta.e;
        cP_32.I = f2;
        if (cP_32.j.l()) {
            pQ.J();
            cP_32.j.J(a2);
            pQ.J();
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(cP a2) {
        Kh.J((double)aSa.V, (double)aSa.V, (double)a2.J(), (double)a2.f(), (int)pua.o);
    }

    /*
     * Unable to fully structure code
     */
    private void J(boolean var1_2) {
        b = var1_2;
        a = this;
        if (a.E == b) ** GOTO lbl16
        a.E = b;
        if (a.E) {
            v0 = a;
            v1 = v0;
            v0.i.J(ZOa.Ja, uRa.I);
        } else {
            a.i.e(aSa.V);
            a.i.C(aSa.V);
            a.i.J(aSa.V);
lbl16:
            // 2 sources

            v1 = a;
        }
        v1.i.J();
        if (b && a.i.l() >= ZOa.Ja) {
            a.i.e(aSa.V);
            a.i.J(ZOa.Ja, uRa.I);
        }
    }

    @Override
    public void J() {
        cP_3 a2;
        cP_3 cP_32 = a2;
        super.J();
        cP_32.C = vRa.d;
        if (cP_32.M != null) {
            a2.M.i -= vRa.d;
            a2.M.A = OT.e;
            a2.M = null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public cP_3(k k2, XM xM2) {
        void a2;
        cP_3 c2 = k2;
        cP_3 b2 = this;
        super((k)c2, (XM)a2);
        cP_3 cP_32 = b2;
        b2.i = new vC();
        cP_32.A = pqa.r;
        b2.k = JPa.N;
        b2.m = JPa.N;
        b2.J = JPa.N;
        b2.C = uSa.E;
        if (!a2.hasHoverable()) {
            b2.j = (AR)vRa.d;
        }
        if ((a2 = OT.i.C.J(a2 = (c2 = a2.getEModel()).getResource())) != null) {
            OT.i.f.J().J(a2, yr.J((cP)b2, (aN)c2));
        }
        if (c2.hasScale()) {
            b2.A = c2.getScale();
        }
        if (c2.hasOffsetX()) {
            b2.k = c2.getOffsetX();
        }
        if (c2.hasOffsetY()) {
            b2.m = c2.getOffsetY();
        }
        if (c2.hasOffsetZ()) {
            b2.J = c2.getOffsetZ();
        }
    }

    @Override
    public void J(long a22) {
        cP_3 b2;
        cP_3 cP_32 = b2;
        cI.J((Runnable)ur.J((cP)cP_32));
        if (cP_32.M != null) {
            cP_3 cP_33 = b2;
            boolean a22 = cP_33.l();
            cP_33.J(cP_33.e);
            uKa.e();
            float f2 = cP_33.A / eua.C;
            uKa.l((float)f2, (float)f2, (float)f2);
            cP_3 cP_34 = b2;
            uKa.J((float)cP_33.k, (float)cP_34.m, (float)cP_34.J);
            double d2 = cP_33.J() * (pqa.r / f2);
            double d3 = cP_33.f() * (pqa.r / f2);
            cP_33.M.J(null, b2.i.J(), JPa.N, (int)(d2 / KPa.y), (int)(d3 - ypa.X), JPa.N, JPa.N, ISa.a, JPa.N);
            uKa.D();
            if (a22) {
                b2.j.J();
            }
        }
        cI.J();
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(cP cP2, aN aN2, YQ yQ2) {
        void a2;
        Object c2 = aN2;
        cP b2 = cP2;
        if (b2.C) {
            return;
        }
        b2.M = a2;
        b2.M.i += vRa.d;
        b2.M.A = OT.e;
        cP cP3 = b2;
        b2.j = new AR((YQ)a2);
        b2.I = (float)Kpa.J().N.f() + Kpa.J().w.j.J();
        String string = Lra.W;
        if (c2.hasAnimationId()) {
            string = c2.getAnimationId();
        }
        if ((c2 = a2.J(string)) != null) {
            b2.j.J((pp)c2, vRa.d != 0, pqa.r);
        }
    }
}

