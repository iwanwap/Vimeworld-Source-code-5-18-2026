/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  Hba
 *  I
 *  MQa
 *  NTa
 *  Oz
 *  Ppa
 *  QFa
 *  fpa
 *  gFa
 *  vL
 *  vRa
 *  vfa
 */
import net.minecraft.block.Block;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class rGa_3
extends gFa {
    private boolean m;
    private Gl C;
    private double i;
    public float M;
    public Gg k;
    public float j;
    private vfa J;
    private int A;
    private xaa I;

    public void f() {
        rGa_3 rGa_32;
        rGa_3 rGa_33 = rGa_32 = this;
        rGa_32.J.J().J((vL)rGa_33.C, FRa.Ga, (float)rGa_32.J.F());
        if (!rGa_33.J.v() && (rGa_32.A -= vRa.d) <= 0) {
            rGa_32.A = NTa.C;
            rGa_3 rGa_34 = rGa_32;
            if (!rGa_32.I.J((vL)rGa_34.C, rGa_34.i) && !rGa_32.J.S()) {
                rGa_3 rGa_35 = rGa_32;
                if (rGa_35.J.J((vL)rGa_35.C) >= fpa.a) {
                    int a2;
                    rGa_3 rGa_36 = rGa_32;
                    int n2 = Oz.f((double)rGa_36.C.la) - uqa.g;
                    int n3 = Oz.f((double)rGa_36.C.A) - uqa.g;
                    int n4 = Oz.f((double)rGa_36.C.J().j);
                    int n5 = a2 = uSa.E;
                    while (n5 <= AQa.P) {
                        int n6 = uSa.E;
                        while (n6 <= AQa.P) {
                            int n7;
                            if ((a2 < vRa.d || n7 < vRa.d || a2 > yRa.d || n7 > yRa.d) && Gg.J((I)rGa_32.k, (XF)new XF(n2 + a2, n4 - vRa.d, n3 + n7))) {
                                if (rGa_32.J(new XF(n2 + a2, n4, n3 + n7)) && rGa_32.J(new XF(n2 + a2, n4 + vRa.d, n3 + n7))) {
                                    rGa_3 rGa_37 = rGa_32;
                                    rGa_37.J.f((double)((float)(n2 + a2) + MQa.L), (double)n4, (double)((float)(n3 + n7) + MQa.L), rGa_32.J.X, rGa_32.J.d);
                                    rGa_37.I.f();
                                    return;
                                }
                            }
                            n6 = ++n7;
                        }
                        n5 = ++a2;
                    }
                }
            }
        }
    }

    public boolean f() {
        rGa_3 rGa_32 = this;
        rGa_3 a2 = rGa_32.J.d();
        if (a2 == null) {
            return uSa.E != 0;
        }
        if (a2 instanceof Sx && ((Sx)((Object)a2)).t()) {
            return uSa.E != 0;
        }
        if (rGa_32.J.v()) {
            return uSa.E != 0;
        }
        rGa_3 rGa_33 = rGa_32;
        if (rGa_32.J.J((vL)a2) < (double)(rGa_33.j * rGa_33.j)) {
            return uSa.E != 0;
        }
        rGa_32.C = a2;
        return vRa.d != 0;
    }

    public void J() {
        rGa_3 a2;
        rGa_3 rGa_32 = a2;
        rGa_32.C = null;
        rGa_32.I.f();
        ((Hba)rGa_32.J.J()).J(vRa.d != 0);
    }

    public void l() {
        rGa_3 a2;
        a2.A = uSa.E;
        a2.m = ((Hba)a2.J.J()).C();
        ((Hba)a2.J.J()).J(uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public rGa_3(vfa vfa2, double d2, float f2, float f3) {
        void a2;
        void b2;
        void c2;
        rGa_3 d3;
        rGa_3 e2 = vfa2;
        rGa_3 rGa_32 = d3 = this;
        rGa_3 rGa_33 = d3;
        rGa_33.J = e2;
        rGa_33.k = ((vfa)e2).j;
        rGa_32.i = c2;
        rGa_32.I = e2.J();
        d3.j = b2;
        d3.M = a2;
        d3.J(yRa.d);
        if (!(e2.J() instanceof Hba)) {
            throw new IllegalArgumentException(Ppa.u);
        }
    }

    private boolean J(XF xF2) {
        Object b2 = xF2;
        rGa_3 a2 = this;
        if ((b2 = a2.k.J((XF)((Object)b2)).J()) == QFa.HF) {
            return vRa.d != 0;
        }
        if (!((Block)b2).l()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean l() {
        rGa_3 a2;
        if (!a2.I.f()) {
            rGa_3 rGa_32 = a2;
            rGa_3 rGa_33 = a2;
            if (rGa_32.J.J((vL)rGa_32.C) > (double)(rGa_33.M * rGa_33.M) && !a2.J.v()) {
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }
}

