/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CS
 *  JPa
 *  Kpa
 *  Lra
 *  Oz
 *  PNa
 *  ac
 *  cRa
 *  kpa
 *  pQa
 *  pqa
 *  sT
 *  uKa
 *  vRa
 *  wNa
 */
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class gT_1
extends ac {
    public final /* synthetic */ CS k;
    public boolean j;
    public float J;
    public final String A;
    public final sT I;

    public int J(boolean bl) {
        boolean b2 = bl;
        gT_1 a2 = this;
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Kpa kpa2, int n2, int n3) {
        void a2;
        void c2;
        gT_1 b2 = this;
        int d2 = n2;
        if (super.J((Kpa)c2, d2, (int)a2)) {
            b2.f(d2);
            b2.j = vRa.d;
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public gT_1(CS cS2, sT sT2, int n2, int n3, int n4, int n5, int n6, String string, float f2) {
        void j2;
        void b2;
        void h;
        void c2;
        void d2;
        void e2;
        void f3;
        void g;
        void i2;
        float f4 = f2;
        gT_1 a2 = this;
        a2.k = i2;
        super((int)g, (int)f3, (int)e2, (int)d2, (int)c2, null);
        a2.I = h;
        a2.A = b2;
        a2.J = j2;
        a2.f();
    }

    public void J(int n2, int n3) {
        int c2 = n3;
        gT_1 a2 = this;
        if (a2.j) {
            CS.f((CS)a2.k).J().J((X)PNa.J((ResourceLocation)new ResourceLocation(cRa.u), (float)pqa.r));
        }
        a2.j = uSa.E;
    }

    public void f(int n2) {
        int b22 = n2;
        gT_1 a2 = this;
        float b22 = (float)(b22 - (a2.m + AQa.P)) / (float)(a2.j - Yqa.i);
        if (a2.J != (b22 = Oz.J((float)b22, (float)JPa.N, (float)pqa.r))) {
            gT_1 gT_12 = a2;
            gT_12.J = b22;
            gT_12.I.J();
            gT_12.f();
            gT_12.k.f((ac)a2);
        }
    }

    public void f() {
    }

    public void J(wNa object) {
        gT_1 b2 = object;
        object = this;
    }

    /*
     * Unable to fully structure code
     */
    public void J(Kpa var1_2, int var2_3, int var3_5) {
        block5: {
            d = var2_3;
            b = this;
            if (b.k == false) break block5;
            if (d < b.m || a < b.I) ** GOTO lbl-1000
            v0 = b;
            if (d >= v0.m + v0.j) ** GOTO lbl-1000
            v1 = b;
            if (a < v1.I + v1.E) {
                v2 = vRa.d;
            } else lbl-1000:
            // 3 sources

            {
                v2 = uSa.E;
            }
            b.M = v2;
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            uKa.B();
            uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
            uKa.f((int)Lra.k, (int)kpa.J);
            v3 = b;
            v4 = b;
            v5 = b;
            v6 = b;
            gT_1.J((int)v4.m, (int)v4.I, (int)(v5.m + v5.j), (int)(v6.I + v6.E), (int)uua.n);
            v3.J();
            v3.f((Kpa)c, d, (int)a);
            d = pQa.P;
            if (v3.J == false) {
                d = xra.R;
                v7 = b;
            } else {
                if (b.M) {
                    d = tTa.A;
                }
                v7 = b;
            }
            v8 = b;
            v9 = b;
            v7.f(c.Ea, v8.i, v8.m + b.j / uqa.g, (int)(v9.I + (v9.E - Yqa.i) / uqa.g), d);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void f(Kpa kpa2, int n2, int n3) {
        gT_1 d22 = kpa2;
        gT_1 c2 = this;
        if (c2.k != false) {
            if (c2.j) {
                void b2;
                c2.f((int)b2);
            }
            gT_1 gT_12 = c2;
            int d22 = gT_12.m + (int)(gT_12.J * (float)(c2.j - AQa.P));
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            int n4 = d22;
            gT_1 gT_13 = c2;
            gT_1.J((int)n4, (int)c2.I, (int)(n4 + AQa.P), (int)(gT_13.I + gT_13.E), (int)vqa.F);
            gT_1 gT_14 = c2;
            gT_1.J((int)(d22 + vRa.d), (int)(c2.I + vRa.d), (int)(d22 + yRa.d), (int)(gT_14.I + gT_14.E - vRa.d), (int)vqa.F);
        }
    }

    public void J() {
    }
}

