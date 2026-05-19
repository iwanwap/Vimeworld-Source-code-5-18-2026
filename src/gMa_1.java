/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bsa
 *  CY
 *  CZ
 *  EC
 *  Lqa
 *  SOa
 *  Tpa
 *  WQa
 *  WSa
 *  XSa
 *  ZRa
 *  aSa
 *  ac
 *  aqa
 *  dpa
 *  jRa
 *  ld
 *  pua
 *  vRa
 *  vpa
 *  zTa
 */
import java.io.IOException;

public final class gMa_1
extends EC {
    private String k;
    private ac j;
    private ac J;
    private final EC A;
    private boolean I;

    public gMa_1(EC eC2) {
        gMa_1 b2 = eC2;
        gMa_1 a2 = this;
        a2.k = APa.k;
        a2.A = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void b2;
        void c2;
        float d2 = f2;
        gMa_1 a2 = this;
        a2.i();
        gMa_1.J((String)oha.J(dpa.w, new Object[uSa.E]), (int)(a2.A / uqa.g), (int)vpa.o, (int)pua.o);
        gMa_1.J((String)oha.J(Bsa.Ja, new Object[uSa.E]), (int)(a2.A / uqa.g), (int)aqa.Aa, (int)pua.o);
        super.J((int)c2, (int)b2, d2);
    }

    public void J(ac ac2) throws IOException {
        Object b2 = ac2;
        gMa_1 a2 = this;
        if (((ac)b2).C == jRa.v) {
            gMa_1 gMa_12 = a2;
            gMa_12.g.J(gMa_12.A);
            return;
        }
        if (((ac)b2).C == Lqa.h) {
            gMa_1 gMa_13;
            if (a2.k.equals(aSa.N)) {
                gMa_13 = a2;
                a2.k = mPa.P;
            } else if (a2.k.equals(mPa.P)) {
                a2.k = tSa.G;
                gMa_13 = a2;
            } else {
                gMa_1 gMa_14 = a2;
                if (a2.k.equals(tSa.G)) {
                    gMa_14.k = APa.k;
                    gMa_13 = a2;
                } else {
                    gMa_14.k = aSa.N;
                    gMa_13 = a2;
                }
            }
            gMa_13.J();
            return;
        }
        if (((ac)b2).C == Bsa.E) {
            a2.I = !a2.I ? vRa.d : uSa.E;
            a2.J();
            return;
        }
        if (((ac)b2).C == zTa.C) {
            gMa_1 gMa_15;
            CY cY2;
            a2.g.J((EC)null);
            b2 = a2.g.J().J(Daa.getByName(a2.k), a2.I);
            if (b2 != null) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = b2;
                cY2 = new CZ(WSa.la, objectArray);
                gMa_15 = a2;
            } else {
                cY2 = new CY(XSa.K);
                gMa_15 = a2;
            }
            gMa_15.g.Ya.J().J((ld)cY2);
        }
    }

    public void A() {
        gMa_1 a2;
        gMa_1 gMa_12 = a2;
        gMa_12.E.clear();
        gMa_12.E.add(new ac(zTa.C, (int)(a2.A / uqa.g - BQa.Q), a2.I - EPa.O, Jpa.Ha, kTa.j, oha.J(Qra.Ga, new Object[uSa.E])));
        a2.E.add(new ac(jRa.v, (int)(a2.A / uqa.g + tTa.h), a2.I - EPa.O, Jpa.Ha, kTa.j, oha.J(SOa.l, new Object[uSa.E])));
        a2.J = new ac(Lqa.h, (int)(a2.A / uqa.g - BQa.Q), ySa.T, Jpa.Ha, kTa.j, oha.J(ZRa.ja, new Object[uSa.E]));
        a2.E.add(a2.J);
        a2.j = new ac(Bsa.E, (int)(a2.A / uqa.g + tTa.h), ySa.T, Jpa.Ha, kTa.j, oha.J(qsa.X, new Object[uSa.E]));
        a2.E.add(a2.j);
        a2.J();
    }

    private void J() {
        gMa_1 a2;
        a2.J.i = oha.J(ZRa.ja, new Object[uSa.E]) + Tpa.E + oha.J(new StringBuilder().insert(5 >> 3, WQa.H).append(a2.k).toString(), new Object[uSa.E]);
        a2.j.i = oha.J(qsa.X, new Object[uSa.E]) + Tpa.E;
        if (a2.I) {
            a2.j.i = new StringBuilder().insert(5 >> 3, a2.j.i).append(oha.J(ppa.H, new Object[uSa.E])).toString();
            return;
        }
        a2.j.i = new StringBuilder().insert(3 & 4, a2.j.i).append(oha.J(tSa.Ha, new Object[uSa.E])).toString();
    }
}

