/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EK
 *  JPa
 *  Kh
 *  NTa
 *  Op
 *  XM
 *  YO
 *  aSa
 *  fO
 *  fi
 *  ir
 *  k
 *  pua
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class nP
extends Bp {
    public EK m;
    public EK C;
    public kL i;
    public kL M;
    private boolean k;
    private boolean J;
    public kL I;

    @Override
    public float J() {
        nP a2;
        return a2.i();
    }

    @Override
    public float d() {
        nP a2;
        return a2.M();
    }

    public static b f(Bp bp2, float f2) {
        float b2 = f2;
        Bp a2 = bp2;
        if (nP.equals(b2, dua.ca)) {
            k k2 = a2.s;
            k2.getClass();
            return ir.J((k)k2);
        }
        if (nP.equals(b2, vqa.T)) {
            Bp bp3 = a2;
            bp3.getClass();
            return YO.J((Bp)bp3);
        }
        return fi.J((float)b2);
    }

    public static b J(Bp bp2, float f2) {
        float b2 = f2;
        Bp a2 = bp2;
        if (nP.equals(b2, dua.ca)) {
            k k2 = a2.s;
            k2.getClass();
            return uO.J(k2);
        }
        if (nP.equals(b2, vqa.T)) {
            Bp bp3 = a2;
            bp3.getClass();
            return Op.J((Bp)bp3);
        }
        return fi.J((float)b2);
    }

    @Override
    public boolean J(long a2) {
        nP b2;
        nP nP2 = b2;
        nP2.o += b2.M.i + b2.i.i;
        return super.J(a2);
    }

    /*
     * WARNING - void declaration
     */
    public nP(k k2, String string, float f2, float f3) {
        void e2;
        void b2;
        void c2;
        void d2;
        nP a2;
        float f4 = f3;
        nP nP2 = a2 = this;
        super((k)d2, (String)c2);
        nP2.M = kL.J();
        nP2.i = kL.J();
        nP2.I = kL.J();
        nP2.M.J(nP.J(a2, (float)b2));
        nP2.i.J(nP.f(a2, (float)e2));
    }

    @Override
    public void J(long a22) {
        nP b2;
        if (b2.C != null) {
            nP nP2 = b2;
            int a22 = nP2.C.J();
            int n2 = nP2.m.J();
            if (nP2.x.J != pua.o) {
                a22 = EK.f((int)a22, (int)b2.x.J);
                n2 = EK.f((int)n2, (int)b2.x.J);
            }
            Kh.J((double)aSa.V, (double)aSa.V, (double)b2.J(), (double)b2.f(), (int)a22, (int)n2, (double)b2.I.f());
            return;
        }
        Kh.J((double)aSa.V, (double)aSa.V, (double)b2.J(), (double)b2.f(), (int)b2.x.J, (double)b2.I.f());
    }

    private float i() {
        nP nP2 = this;
        if (nP2.k) {
            return JPa.N;
        }
        nP2.k = vRa.d;
        float a2 = nP2.M.f();
        nP2.k = uSa.E;
        return a2;
    }

    @Override
    public float f() {
        nP a2;
        return a2.M();
    }

    @Override
    public float e() {
        nP a2;
        return a2.i();
    }

    @Override
    public void J(fO fO2) {
        nP nP2;
        nP nP3;
        nP nP4;
        nP b2 = fO2;
        nP a2 = this;
        nP nP5 = b2;
        super.J((fO)nP5);
        if (!nP5.hasERectangle()) {
            return;
        }
        if ((b2 = b2.getERectangle()).hasWidth()) {
            nP nP6 = b2;
            nP4 = nP6;
            a2.M.J(nP.J(a2, nP6.getWidth()));
        } else if (b2.hasWidthExpr()) {
            nP nP7 = b2;
            nP4 = nP7;
            a2.M.J(RJ.f(a2, nP7.getWidthExpr()));
        } else if (b2.hasWidthAnim()) {
            nP nP8 = b2;
            nP4 = nP8;
            a2.M.J(nP.J(a2, nP8.getWidthAnim()), a2.L.C, a2.L.A);
        } else {
            if (b2.hasWidthExprAnim()) {
                a2.M.J(RJ.f(a2, b2.getWidthExprAnim()), a2.L.C, a2.L.A);
            }
            nP4 = b2;
        }
        if (nP4.hasHeight()) {
            nP nP9 = b2;
            nP3 = nP9;
            a2.i.J(nP.f(a2, nP9.getHeight()));
        } else if (b2.hasHeightExpr()) {
            nP nP10 = b2;
            nP3 = nP10;
            a2.i.J(RJ.J(a2, nP10.getHeightExpr()));
        } else if (b2.hasHeightAnim()) {
            nP nP11 = b2;
            nP3 = nP11;
            a2.i.J(nP.f(a2, nP11.getHeightAnim()), a2.L.C, a2.L.A);
        } else {
            if (b2.hasHeightExprAnim()) {
                a2.i.J(RJ.J(a2, b2.getHeightExprAnim()), a2.L.C, a2.L.A);
            }
            nP3 = b2;
        }
        if (nP3.hasRadius()) {
            nP nP12 = b2;
            nP2 = nP12;
            a2.I.J(nP12.getRadius());
        } else {
            if (b2.hasRadiusAnim()) {
                a2.I.J(b2.getRadiusAnim(), a2.L.C, a2.L.A);
            }
            nP2 = b2;
        }
        if (nP2.getGradientCount() == uqa.g) {
            if (a2.C == null) {
                nP nP13 = a2;
                a2.C = new EK(b2.getGradient(uSa.E));
                a2.m = new EK(b2.getGradient(vRa.d));
                return;
            }
            a2.C.J(b2.getGradient(uSa.E));
            a2.m.J(b2.getGradient(vRa.d));
            return;
        }
        if (b2.getGradientAnimCount() == uqa.g) {
            if (a2.C == null) {
                a2.C = new EK(a2.x.J());
                a2.m = new EK(a2.x.J());
            }
            nP nP14 = a2;
            nP14.C.J(b2.getGradientAnim(uSa.E), a2.L.C, a2.L.A);
            nP14.m.J(b2.getGradientAnim(vRa.d), a2.L.C, a2.L.A);
        }
    }

    /*
     * WARNING - void declaration
     */
    public nP(k k2, XM xM2, int n2) {
        nP nP2;
        void a2;
        nP nP3;
        void b2;
        nP d2 = k2;
        nP c2 = this;
        super((k)d2, (XM)b2);
        c2.M = kL.J();
        c2.i = kL.J();
        c2.I = kL.J();
        d2 = b2.getERectangle();
        if (d2.hasWidthExpr()) {
            nP nP4 = d2;
            nP3 = nP4;
            c2.M.J(RJ.f(c2, nP4.getWidthExpr()));
        } else if (d2.hasWidth()) {
            nP nP5 = d2;
            nP3 = nP5;
            c2.M.J(nP.J(c2, nP5.getWidth()));
        } else {
            c2.M.J(nP.J(c2, (float)a2));
            nP3 = d2;
        }
        if (nP3.hasHeightExpr()) {
            nP nP6 = d2;
            nP2 = nP6;
            c2.i.J(RJ.J(c2, nP6.getHeightExpr()));
        } else {
            nP nP7 = c2;
            if (d2.hasHeight()) {
                nP7.i.J(nP.f(c2, d2.getHeight()));
                nP2 = d2;
            } else {
                nP7.i.J(nP.f(c2, (float)a2));
                nP2 = d2;
            }
        }
        if (nP2.hasRadius()) {
            c2.I.J(d2.getRadius());
        }
        if (d2.getGradientCount() == uqa.g) {
            nP nP8 = c2;
            nP8.C = new EK(d2.getGradient(uSa.E));
            nP8.m = new EK(d2.getGradient(vRa.d));
        }
    }

    /*
     * WARNING - void declaration
     */
    public nP(k k2, XM xM2) {
        void b2;
        nP c2 = xM2;
        nP a2 = this;
        a2((k)b2, (XM)c2, vRa.d);
    }

    private float M() {
        nP nP2 = this;
        if (nP2.J) {
            return JPa.N;
        }
        nP2.J = vRa.d;
        float a2 = nP2.i.f();
        nP2.J = uSa.E;
        return a2;
    }

    private static boolean equals(float f2, float f3) {
        float a2 = f2;
        float b2 = f3;
        if (Math.abs(a2 - b2) < NTa.ia) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

