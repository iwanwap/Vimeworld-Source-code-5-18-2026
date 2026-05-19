/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FPa
 *  Gg
 *  Gl
 *  Hda
 *  MQa
 *  Mda
 *  NCa
 *  NTa
 *  Waa
 *  Zta
 *  bSa
 *  bpa
 *  eAa
 *  kba
 *  nEa
 *  vL
 *  vRa
 *  xy
 */
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class kDa_2
extends nEa {
    private Mda I;

    public int J() {
        kDa_2 a2;
        if (a2.I == null) {
            kDa_2 kDa_22 = a2;
            kDa_22.I = new Mda((eAa)Gea.aa, vRa.d, uSa.E);
        }
        return a2.I.J();
    }

    /*
     * WARNING - void declaration
     */
    public kDa_2(Gg gg2, Gl gl2, Mda mda2) {
        void b2;
        void c2;
        kDa_2 d2 = mda2;
        kDa_2 a2 = this;
        super((Gg)c2, (Gl)b2);
        a2.I = d2;
    }

    public float M() {
        return Lsa.X;
    }

    public float f() {
        return MQa.L;
    }

    public kDa_2(Gg gg2) {
        kDa_2 b2 = gg2;
        kDa_2 a2 = this;
        super((Gg)b2);
    }

    public void M(int n2) {
        int b2 = n2;
        kDa_2 a2 = this;
        if (a2.I == null) {
            kDa_2 kDa_22 = a2;
            kDa_22.I = new Mda((eAa)Gea.aa, vRa.d, uSa.E);
        }
        a2.I.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    public kDa_2(Gg gg2, double d2, double d3, double d4, int n2) {
        void f2;
        void b2;
        void c2;
        void d5;
        void e2;
        int n3 = n2;
        kDa_2 a2 = this;
        a2((Gg)e2, (double)d5, (double)c2, (double)b2, new Mda((eAa)Gea.aa, vRa.d, (int)f2));
    }

    /*
     * WARNING - void declaration
     */
    public void J(RY rY2) {
        kDa_2 kDa_22 = this;
        if (!kDa_22.j.e) {
            List<kba> list = Gea.aa.J(kDa_22.I);
            if (list != null && !list.isEmpty()) {
                kDa_2 kDa_23 = kDa_22;
                Object b2 = kDa_23.J().f(FPa.T, KPa.y, FPa.T);
                if (!(b2 = kDa_23.j.J(Gl.class, (xy)b2)).isEmpty()) {
                    b2 = b2.iterator();
                    while (b2.hasNext()) {
                        void a2;
                        double d2;
                        Gl gl2 = (Gl)b2.next();
                        double d3 = kDa_22.J((vL)gl2);
                        if (!(d2 < Zta.ba)) continue;
                        d3 = oua.i - Math.sqrt(d3) / FPa.T;
                        if (gl2 == a2.J) {
                            d3 = oua.i;
                        }
                        for (kba kba2 : list) {
                            int n2 = kba2.f();
                            if (Hda.A[n2].l()) {
                                kDa_2 kDa_24 = kDa_22;
                                Hda.A[n2].J((vL)kDa_24, (vL)kDa_24.J(), gl2, kba2.J(), d3);
                                continue;
                            }
                            int n3 = (int)(d3 * (double)kba2.l() + kTa.B);
                            if (n3 <= kTa.j) continue;
                            gl2.J(new kba(n2, n3, kba2.J()));
                        }
                    }
                }
            }
            kDa_2 kDa_25 = kDa_22;
            kDa_25.j.f(bpa.e, new XF((vL)kDa_22), kDa_22.J());
            kDa_25.k();
        }
    }

    public void f(Waa waa2) {
        kDa_2 a2;
        kDa_2 b2 = waa2;
        kDa_2 kDa_22 = a2 = this;
        super.f((Waa)b2);
        if (kDa_22.I != null) {
            b2.J(bSa.g, (NCa)a2.I.J(new Waa()));
        }
    }

    /*
     * WARNING - void declaration
     */
    public kDa_2(Gg gg2, double d2, double d3, double d4, Mda mda2) {
        kDa_2 f2;
        void b2;
        void c2;
        void d5;
        void e2;
        kDa_2 kDa_22 = kDa_23;
        kDa_2 kDa_23 = mda2;
        kDa_2 a2 = kDa_22;
        super((Gg)e2, (double)d5, (double)c2, (double)b2);
        a2.I = f2;
    }

    /*
     * WARNING - void declaration
     */
    public kDa_2(Gg gg2, Gl gl2, int n2) {
        void b2;
        void c2;
        int d2 = n2;
        kDa_2 a2 = this;
        a2((Gg)c2, (Gl)b2, new Mda((eAa)Gea.aa, vRa.d, d2));
    }

    public float J() {
        return Yqa.C;
    }

    public void J(Waa waa2) {
        kDa_2 kDa_22;
        kDa_2 b2 = waa2;
        kDa_2 a2 = this;
        kDa_2 kDa_23 = b2;
        super.J((Waa)kDa_23);
        if (kDa_23.J(bSa.g, NTa.C)) {
            kDa_22 = a2;
            a2.I = Mda.J((Waa)b2.J(bSa.g));
        } else {
            kDa_2 kDa_24 = a2;
            kDa_22 = kDa_24;
            kDa_24.M(b2.J(NSa.y));
        }
        if (kDa_22.I == null) {
            a2.k();
        }
    }
}

