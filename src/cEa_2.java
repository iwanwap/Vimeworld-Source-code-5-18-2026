/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  JPa
 *  MQa
 *  NTa
 *  QFa
 *  UFa
 *  Waa
 *  bpa
 *  cEa
 *  kta
 *  lPa
 *  psa
 *  uRa
 *  vL
 *  vRa
 *  xy
 */
import net.minecraft.block.material.Material;

public final class cEa_2
extends UFa {
    private int j;
    public long J;
    private int A;

    /*
     * Unable to fully structure code
     */
    public void d() {
        v0 = a;
        super.d();
        if (v0.j == uqa.g) {
            v1 = a;
            a.j.J(v1.la, a.Z, (double)a.A, BQa.i, Ura.v, xSa.la + a.R.nextFloat() * psa.N);
            v1.j.J(a.la, a.Z, (double)a.A, sOa.r, kta.v, MQa.L + a.R.nextFloat() * psa.N);
        }
        v2 = a;
        v2.j -= vRa.d;
        if (v2.j >= 0) ** GOTO lbl25
        if (a.A == 0) {
            v3 = a;
            v4 = v3;
            v3.k();
        } else {
            v5 = a;
            if (v5.j < -v5.R.nextInt(NTa.C)) {
                v6 = a;
                v6.A -= vRa.d;
                v6.j = vRa.d;
                v6.J = v6.R.nextLong();
                var1_1 = new XF((vL)a);
                if (!v6.j.e && a.j.J().f(bpa.Da) && a.j.J(var1_1, NTa.C) && a.j.J(var1_1).J().J() == Material.air && QFa.ic.J((Gg)a.j, var1_1)) {
                    a.j.J(var1_1, QFa.ic.J());
                }
            }
lbl25:
            // 6 sources

            v4 = a;
        }
        if (v4.j >= 0) {
            if (a.j.e) {
                a.j.l(uqa.g);
                return;
            }
            var1_2 = uRa.I;
            v7 = a;
            v8 = a;
            var1_3 = a.j.f((vL)v8, new xy(v8.la - var1_2, a.Z - var1_2, (double)(a.A - var1_2), a.la + var1_2, a.Z + lPa.K + var1_2, (double)(a.A + var1_2)));
            v9 = var2_4 = uSa.E;
            while (v9 < var1_3.size()) {
                v10 = var1_3.get(var2_4);
                ((vL)v10).J((cEa)a);
                v9 = ++var2_4;
            }
        }
    }

    public void J() {
    }

    /*
     * WARNING - void declaration
     */
    public cEa_2(Gg gg2, double d2, double d3, double d4) {
        void a2;
        void b22;
        void c22;
        cEa_2 d5;
        cEa_2 e2 = gg2;
        cEa_2 cEa_22 = d5 = this;
        cEa_2 cEa_23 = d5;
        super((Gg)e2);
        cEa_23.f((double)c22, (double)b22, (double)a2, JPa.N, JPa.N);
        cEa_22.j = uqa.g;
        cEa_22.J = cEa_22.R.nextLong();
        cEa_22.A = cEa_22.R.nextInt(yRa.d) + vRa.d;
        XF c22 = new XF((vL)d5);
        if (!((Gg)e2).e && e2.J().f(bpa.Da) && (e2.J() == sZ.NORMAL || e2.J() == sZ.HARD) && e2.J(c22, NTa.C)) {
            int n2;
            if (e2.J(c22).J().J() == Material.air && QFa.ic.J((Gg)e2, c22)) {
                e2.J(c22, QFa.ic.J());
            }
            int n3 = n2 = uSa.E;
            while (n3 < AQa.P) {
                XF b22 = c22.add(d5.R.nextInt(yRa.d) - vRa.d, d5.R.nextInt(yRa.d) - vRa.d, d5.R.nextInt(yRa.d) - vRa.d);
                if (e2.J(b22).J().J() == Material.air && QFa.ic.J((Gg)e2, b22)) {
                    e2.J(b22, QFa.ic.J());
                }
                n3 = ++n2;
            }
        }
    }

    public void J(Waa object) {
        cEa_2 b2 = object;
        object = this;
    }

    public void f(Waa object) {
        cEa_2 b2 = object;
        object = this;
    }
}

