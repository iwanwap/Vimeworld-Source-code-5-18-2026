/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GR
 *  Ip
 *  JPa
 *  Kh
 *  Kpa
 *  Lra
 *  NPa
 *  Qq
 *  Ri
 *  Rua
 *  k
 *  kpa
 *  pPa
 *  pqa
 *  pua
 *  rr
 *  tp
 *  uKa
 *  vRa
 *  vpa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class vP_2 {
    public boolean k;
    private final OT j;
    public boolean J;
    public boolean A;
    private Qq I;

    public vP_2(OT oT2) {
        vP_2 a2;
        OT b2 = oT2;
        vP_2 vP_22 = a2 = this;
        vP_22.J = vRa.d;
        vP_22.A = uSa.E;
        vP_22.j = b2;
    }

    /*
     * Unable to fully structure code
     */
    private void f(Bp var1_2) {
        block5: {
            var2_3 = this;
            var6_4 = JPa.N;
            var7_5 = JPa.N;
            var4_6 = pqa.r;
            var5_7 = pqa.r;
            v0 = b = a;
            while (v0.s != null) {
                if (b == a || !(b instanceof tp)) ** GOTO lbl16
                var3_8 = (tp)b;
                if (var3_8.o == Tq.VERTICAL) {
                    var7_5 -= var3_8.f.f();
                    v1 = b;
                } else {
                    if (var3_8.o == Tq.HORIZONTAL) {
                        var6_4 -= var3_8.f.f();
                    }
lbl16:
                    // 4 sources

                    v1 = b;
                }
                var3_8 = v1.J();
                v2 = b;
                var6_4 = v2.k.f() * var6_4 + var3_8.I;
                var7_5 = v2.J.f() * var7_5 + var3_8.A;
                var4_6 *= b.k.f();
                v3 = b;
                var5_7 *= v3.J.f();
                if (!(v3.s instanceof Bp)) {
                    v4 = a;
                    break block5;
                }
                v0 = (Bp)b.s;
            }
            v4 = a;
        }
        b = v4.J() * var4_6;
        var3_9 = a.f() * var5_7;
        uKa.B();
        uKa.f((int)Lra.k, (int)kpa.J);
        Kh.J((double)var6_4, (double)var7_5, (double)b, (double)var3_9, (int)QTa.H);
        uKa.k();
    }

    public static String J(Bp a2) {
        if (a2 instanceof Ip) {
            return vpa.C;
        }
        if (a2 instanceof rr) {
            return WRa.x;
        }
        if (a2 instanceof tp) {
            return pta.l;
        }
        if (a2 instanceof GR) {
            return Iqa.W;
        }
        if (a2 instanceof nP) {
            return osa.M;
        }
        return xqa.X;
    }

    public void l() {
    }

    public void J(Bp bp2) {
        Bp b2 = bp2;
        vP_2 a2 = this;
        if (!a2.k || !a2.J) {
            return;
        }
        a2.I.J().J(b2);
    }

    public Bp J() {
        vP_2 a2;
        if (!a2.k) {
            return null;
        }
        return a2.I.J().f();
    }

    public void f() {
        vP_2 a2;
        a2.k = !a2.k ? vRa.d : uSa.E;
        int n2 = a2.k ? 1 : 0;
        if (a2.k && a2.I == null) {
            vP_2 vP_22 = a2;
            a2.I = new Qq((k)a2.j.F, Mqa.o);
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(boolean bl, int n2) {
        vP_2 vP_22 = this;
        if (!vP_22.k) {
            return uSa.E != 0;
        }
        if (vP_22.I.e) {
            void a2;
            void b22;
            int c2 = uSa.E;
            if (b22 != false) {
                vP_2 vP_23 = vP_22;
                Ri b22 = vP_23.I.J(OT.e);
                c2 = vP_23.I.J((int)((float)eq.m - b22.I), (int)((float)eq.E - b22.A), uSa.E) ? 1 : 0;
            }
            if (a2 != false) {
                c2 = c2 != 0 || vP_22.I.J((int)a2) ? vRa.d : uSa.E;
            }
            return c2 != 0;
        }
        return uSa.E != 0;
    }

    public void J() {
        vP_2 vP_22;
        vP_2 vP_23 = this;
        if (!vP_23.k) {
            return;
        }
        Object a2 = vP_23.I.J(OT.e);
        if (Kpa.J().ta != null) {
            vP_2 vP_24 = vP_23;
            vP_22 = vP_24;
            vP_24.I.J((int)((float)eq.m - ((Ri)a2).I), (int)((float)eq.E - ((Ri)a2).A), OT.e);
        } else {
            vP_2 vP_25 = vP_23;
            vP_22 = vP_25;
            vP_25.I.J(rta.n, rta.n, OT.e);
        }
        a2 = vP_22.I.J().l();
        if (a2 != null) {
            vP_23.f((Bp)a2);
        }
        vP_23.I.f(OT.e);
    }

    public static int J(Bp a2) {
        if (a2 instanceof Ip) {
            return dua.I;
        }
        if (a2 instanceof rr) {
            return pPa.ga;
        }
        if (a2 instanceof tp) {
            return QTa.u;
        }
        if (a2 instanceof GR) {
            return Rua.c;
        }
        if (a2 instanceof nP) {
            return NPa.D;
        }
        return pua.o;
    }
}

