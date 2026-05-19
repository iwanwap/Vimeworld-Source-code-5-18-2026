/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AY
 *  DQa
 *  Gg
 *  Lz
 *  MQa
 *  Mda
 *  Oz
 *  QFa
 *  Tz
 *  Wda
 *  YSa
 *  eAa
 *  pqa
 *  pua
 *  vL
 *  vRa
 */
public final class wfa
extends eAa {
    public wfa() {
        wfa a2;
        wfa wfa2 = a2;
        wfa2.i = vRa.d;
        wfa2.J(yGa.f);
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(Mda mda2, Gg gg2, Sx sx2) {
        vL vL2;
        void c2;
        void b2;
        void a2;
        wfa wfa2 = this;
        float f2 = pqa.r;
        void v0 = a2;
        void v1 = a2;
        double d2 = v0.o + (v1.d - a2.o) * f2;
        void v2 = a2;
        float f3 = v0.s + (v2.X - v2.s) * f2;
        float f4 = v1.c + (a2.la - a2.c) * (double)f2;
        double d3 = v0.ba + (a2.Z - a2.ba) * (double)f2 + (double)a2.l();
        double d4 = v0.r + (a2.A - a2.r) * (double)f2;
        Lz lz2 = new Lz((double)f4, d3, d4);
        float f5 = Oz.C((float)(-f3 * Bua.ga - pua.j));
        f3 = Oz.d((float)(-f3 * Bua.ga - pua.j));
        float f6 = -Oz.C((float)(-d2 * Bua.ga));
        d2 = Oz.d((float)(-d2 * Bua.ga));
        float d52 = f5 * f6;
        f4 = (float)DQa.S;
        Object object = lz2.f((double)(f3 *= f6) * f4, (double)d2 * f4, (double)d52 * f4);
        if ((object = b2.J(lz2, (Lz)object, vRa.d != 0)) == null) {
            return c2;
        }
        Object object2 = a2.J(f2);
        int n2 = uSa.E;
        d52 = pqa.r;
        void v3 = a2;
        object2 = b2.f((vL)v3, v3.J().l(((Lz)object2).A * f4, ((Lz)object2).j * f4, ((Lz)object2).J * f4).f((double)d52, (double)d52, (double)d52));
        int n3 = d52 = uSa.E;
        while (n3 < object2.size()) {
            vL2 = (vL)object2.get(d52);
            if (vL2.E()) {
                vL vL3 = vL2;
                float f7 = vL3.C();
                if (vL3.J().f((double)f7, (double)f7, (double)f7).J(lz2)) {
                    n2 = vRa.d;
                }
            }
            n3 = ++d52;
        }
        if (n2 != 0) {
            return c2;
        }
        if (((RY)object).A == AY.BLOCK) {
            XF d52 = ((RY)object).J();
            if (b2.J(d52).J() == QFa.gC) {
                d52 = d52.down();
            }
            vL2 = new Wda((Gg)b2, (double)((float)d52.getX() + MQa.L), (double)((float)d52.getY() + pqa.r), (double)((float)d52.getZ() + MQa.L));
            vL2.X = ((Oz.f((double)((double)(a2.X * YSa.G / CRa.ja) + kTa.B)) & yRa.d) - vRa.d) * Jsa.ha;
            if (!b2.J(vL2, vL2.J().f(Upa.N, Upa.N, Upa.N)).isEmpty()) {
                return c2;
            }
            if (!b2.e) {
                b2.f(vL2);
            }
            if (!a2.h.f()) {
                c2.E -= vRa.d;
            }
            a2.J(Tz.H[eAa.J((eAa)wfa2)]);
        }
        return c2;
    }
}

