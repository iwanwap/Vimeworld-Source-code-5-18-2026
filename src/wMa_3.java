/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  ac
 *  cQa
 *  pqa
 *  uKa
 *  vRa
 */
import net.minecraft.util.ResourceLocation;

public class wMa_3
extends ac {
    private final int L;
    private boolean i;
    private final ResourceLocation k;
    private final int A;

    public boolean f() {
        wMa_3 a2;
        return a2.i;
    }

    /*
     * WARNING - void declaration
     */
    public wMa_3(int n2, int n3, int n4, ResourceLocation resourceLocation, int n5, int n6) {
        void g2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        wMa_3 a2;
        int n7 = n6;
        wMa_3 wMa_32 = a2 = this;
        super((int)f2, (int)e2, (int)d2, cQa.o, cQa.o, Mqa.y);
        a2.k = c2;
        wMa_32.A = b2;
        wMa_32.L = g2;
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        wMa_3 a2 = this;
        a2.i = b2;
    }

    /*
     * Unable to fully structure code
     */
    public void J(Kpa var1_2, int var2_3, int var3_4) {
        block8: {
            d = var3_4;
            a = this;
            if (a.k == false) break block8;
            c.J().J(rma.J());
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            if (b < a.m || d < a.I) ** GOTO lbl-1000
            v0 = a;
            if (b >= v0.m + v0.j) ** GOTO lbl-1000
            v1 = a;
            if (d < v1.I + v1.E) {
                v2 = vRa.d;
            } else lbl-1000:
            // 3 sources

            {
                v2 = uSa.E;
            }
            a.M = v2;
            b = yRa.T;
            d = uSa.E;
            if (!a.J) {
                d += a.j * uqa.g;
                v3 = a;
            } else if (a.i) {
                d += a.j * vRa.d;
                v3 = a;
            } else {
                if (a.M) {
                    d += a.j * yRa.d;
                }
                v3 = a;
            }
            v4 = a;
            v5 = a;
            v3.f(v4.m, v4.I, d, b, v5.j, v5.E);
            if (!rma.J().equals(a.k)) {
                c.J().J(a.k);
            }
            v6 = a;
            v7 = a;
            v6.f(v6.m + uqa.g, a.I + uqa.g, v7.A, v7.L, yOa.B, yOa.B);
        }
    }
}

