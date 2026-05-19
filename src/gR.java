/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EK
 *  JPa
 *  Kh
 *  Kna
 *  Kpa
 *  XM
 *  aSa
 *  fO
 *  k
 *  kta
 *  pqa
 *  pua
 *  sG
 *  vRa
 */
public final class gR
extends nP {
    public EK E;
    private long C;
    public String i;
    private float M;
    public EK k;
    public int j;
    private boolean J;
    public Kna I;

    /*
     * Unable to fully structure code
     */
    @Override
    public void J(long var1_2) {
        v0 = var3_4 = this;
        if (v0.J == v0.e) ** GOTO lbl11
        v1 = var3_4;
        v1.J = v1.e;
        if (v1.e) {
            v2 = var3_4;
            v3 = v2;
            v2.C = (long)(nua.M * (pqa.r - v2.M)) + a;
        } else {
            var3_4.C = (long)(nua.M * var3_4.M) + a;
lbl11:
            // 2 sources

            v3 = var3_4;
        }
        if (v3.C > a) {
            if (var3_4.e) {
                v4 = var3_4;
                v5 = v4;
                v4.M = pqa.r - Math.max(JPa.N, (float)(v4.C - a) / nua.M);
            } else {
                v5 = var3_4;
                var3_4.M = Math.min(pqa.r, (float)(var3_4.C - a) / nua.M);
            }
            b = sG.e((float)v5.M);
            v6 = var3_4;
        } else {
            var3_4.M = var3_4.e != false ? pqa.r : JPa.N;
            b = var3_4.M;
            v6 = var3_4;
        }
        a = v6.J();
        v7 = var3_4;
        var2_5 = v7.f();
        b = var2_5 * (ATa.r - xSa.la * b);
        Kh.J((double)aSa.V, (double)aSa.V, (double)a, (double)b, (int)var3_4.x.J);
        v8 = var3_4;
        Kh.J((double)aSa.V, (double)b, (double)a, (double)(var2_5 - b), (int)v8.f(v8.E.J()));
        Kna.f = uSa.E;
        v9 = var3_4;
        v7.I.J(var3_4.i, (a - (float)var3_4.j) / kta.v, (var2_5 - (float)var3_4.I.u) / kta.v, v9.f(v9.k.J()));
        Kna.f = vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public gR(k k2, XM xM2) {
        gR gR2;
        void a2;
        gR c2 = k2;
        gR b2 = this;
        super((k)c2, (XM)a2);
        gR gR3 = b2;
        b2.k = new EK(pua.o);
        gR3.E = new EK(pua.o);
        b2.I = Kpa.J().Ea;
        b2.M = JPa.N;
        b2.C = nqa.i;
        b2.J = uSa.E;
        b2.j = vRa.d;
        if (a2.hasHoverable()) {
            b2.j = a2.getHoverable() ? 1 : 0;
        }
        gR gR4 = c2 = a2.getEButton();
        b2.i = gR4.getText();
        if (gR4.hasTextColor()) {
            b2.k.J(c2.getTextColor());
        }
        if (c2.hasHoverColor()) {
            gR gR5 = b2;
            gR2 = gR5;
            gR5.E.J(c2.getHoverColor());
        } else {
            gR gR6 = b2;
            gR2 = gR6;
            gR6.E.J(gR.f(gR6.x.M, yRa.Y));
        }
        gR gR7 = b2;
        gR2.j = gR7.I.J(gR7.i);
    }

    @Override
    public void J(fO fO2) {
        Object object;
        Object b2 = fO2;
        gR a2 = this;
        gR gR2 = b2;
        super.J((fO)gR2);
        if (!gR2.hasEButton()) {
            return;
        }
        if (((zN)(b2 = b2.getEButton())).hasText()) {
            a2.i = ((zN)b2).getText();
            a2.j = a2.I.J(a2.i);
        }
        if (((zN)b2).hasTextColor()) {
            Object object2 = b2;
            object = object2;
            a2.k.J(((zN)object2).getTextColor());
        } else {
            if (((zN)b2).hasTextColorAnim()) {
                a2.k.J(((zN)b2).getTextColorAnim(), a2.L.C, a2.L.A);
            }
            object = b2;
        }
        if (((zN)object).hasHoverColor()) {
            a2.E.J(((zN)b2).getHoverColor());
            return;
        }
        if (((zN)b2).hasHoverColorAnim()) {
            a2.E.J(((zN)b2).getHoverColorAnim(), a2.L.C, a2.L.A);
        }
    }

    @Override
    public float e() {
        gR a2;
        return a2.j + tTa.h;
    }

    @Override
    public void f() {
        gR a2;
        gR gR2 = a2;
        super.f();
        a2.j = gR2.I.J(a2.i);
    }

    @Override
    public float d() {
        gR a2;
        return a2.I.u + uqa.g;
    }
}

