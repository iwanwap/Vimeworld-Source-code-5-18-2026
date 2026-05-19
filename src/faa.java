/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  JPa
 *  Jy
 *  Pv
 *  QFa
 *  aSa
 *  jW
 *  kpa
 *  pDa
 *  rY
 *  vL
 */
public final class faa
extends rY {
    public jW A;

    public faa() {
        faa a2;
        faa faa2 = a2;
        faa2.A = new Pv(QFa.hd);
    }

    public void J(Jy jy) {
        faa a2;
        faa b22 = jy;
        faa faa2 = a2 = this;
        faa2.J();
        if (faa2.L.nextInt(tTa.h) == 0) {
            faa faa3 = a2;
            int b22 = faa3.L.nextInt(ERa.C) + Yqa.i;
            int n2 = faa3.L.nextInt(ERa.C) + Yqa.i;
            faa faa4 = a2;
            faa faa5 = a2;
            faa3.A.J(faa4.v, faa4.L, faa5.v.f(faa5.N.add(b22, uSa.E, n2)));
        }
        if (a2.N.getX() == 0 && a2.N.getZ() == 0) {
            pDa b22 = new pDa(a2.v);
            b22.f(aSa.V, kpa.t, aSa.V, a2.L.nextFloat() * CRa.ja, JPa.N);
            a2.v.f((vL)b22);
        }
    }
}

