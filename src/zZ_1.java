/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CZ
 *  FBa
 *  Gg
 *  JPa
 *  Mda
 *  QY
 *  WSa
 *  Yra
 *  ZRa
 *  dQa
 *  ld
 *  uQa
 *  vRa
 *  zsa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class zZ_1
extends QY {
    private int j;
    private boolean J;
    private boolean A;
    private int I;

    public zZ_1(Gg gg2) {
        zZ_1 b2 = gg2;
        zZ_1 a2 = this;
        super((Gg)b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(XF xF, DZ dZ2) {
        void b2;
        Object c2 = dZ2;
        zZ_1 a2 = this;
        if (a2.J) {
            a2.l();
            return;
        }
        super.J((XF)b2, (DZ)((Object)c2));
    }

    public void f() {
        zZ_1 a2;
        zZ_1 zZ_12 = a2;
        super.f();
        zZ_12.I += vRa.d;
        long l2 = zZ_12.C.l();
        long l3 = l2 / dua.Aa + dQa.Ga;
        if (!zZ_12.A && a2.I > kTa.j) {
            a2.A = vRa.d;
            a2.J.I.J((KC)new FBa(tTa.h, JPa.N));
        }
        int n2 = (a2.J = l2 > ZRa.J ? vRa.d : uSa.E) ? 1 : 0;
        if (a2.J) {
            a2.j += vRa.d;
        }
        if (l2 % dua.Aa == zsa.R) {
            if (l3 <= lTa.h) {
                a2.J.J((ld)new CZ(new StringBuilder().insert(5 >> 3, fqa.X).append(l3).toString(), new Object[uSa.E]));
                return;
            }
        } else if (l3 == dQa.Ga) {
            if (l2 == WSa.Ia) {
                a2.J.I.J((KC)new FBa(tTa.h, cPa.ha));
                return;
            }
            if (l2 == fqa.J) {
                a2.J.I.J((KC)new FBa(tTa.h, uQa.G));
                return;
            }
            if (l2 == DPa.o) {
                a2.J.I.J((KC)new FBa(tTa.h, vRa.m));
                return;
            }
        } else if (l3 == Yra.t && l2 % dua.Aa == tua.Q) {
            a2.J.J((ld)new CZ(EPa.w, new Object[uSa.E]));
        }
    }

    public void J(XF xF) {
        Object b2 = xF;
        zZ_1 a2 = this;
        if (!a2.J) {
            super.J((XF)((Object)b2));
        }
    }

    private void l() {
        zZ_1 a2;
        if (a2.j > ySa.T) {
            a2.J.J((ld)new CZ(BPa.x, new Object[uSa.E]));
            a2.j = uSa.E;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Sx sx2, Gg gg2, Mda mda2) {
        void b2;
        void c2;
        zZ_1 d2 = mda2;
        zZ_1 a2 = this;
        if (a2.J) {
            a2.l();
            return uSa.E != 0;
        }
        return super.J((Sx)c2, (Gg)b2, (Mda)d2);
    }

    public boolean J(XF xF) {
        Object b2 = xF;
        zZ_1 a2 = this;
        if (a2.J) {
            return uSa.E != 0;
        }
        return super.J((XF)((Object)b2));
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Sx sx2, Gg gg2, Mda mda2, XF xF, DZ dZ2, float f2, float f3, float f4) {
        void i2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f5;
        void g2;
        void h2;
        float f6 = f4;
        zZ_1 a2 = this;
        if (a2.J) {
            a2.l();
            return uSa.E != 0;
        }
        return super.J((Sx)h2, (Gg)g2, (Mda)f5, (XF)e2, (DZ)d2, (float)c2, (float)b2, (float)i2);
    }
}

