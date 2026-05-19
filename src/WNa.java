/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bsa
 *  SOa
 *  TPa
 *  ac
 *  isa
 *  l
 *  pua
 *  vRa
 *  vpa
 *  wOa
 */
import java.io.IOException;

public final class WNa
extends Vma {
    private final String k;
    private final String J;
    private boolean A;
    private final String I;

    public void f() {
        WNa a2;
        WNa.C((String)a2.J);
    }

    @Override
    public void A() {
        WNa a2;
        WNa wNa2 = a2;
        super.A();
        wNa2.E.clear();
        wNa2.E.add(new ac(uSa.E, a2.A / uqa.g - vpa.o - xua.S, (int)(a2.I / uua.p + zua.m), ySa.T, kTa.j, a2.C));
        a2.E.add(new ac(uqa.g, a2.A / uqa.g - vpa.o, (int)(a2.I / uua.p + zua.m), ySa.T, kTa.j, a2.I));
        a2.E.add(new ac(vRa.d, a2.A / uqa.g - vpa.o + xua.S, (int)(a2.I / uua.p + zua.m), ySa.T, kTa.j, a2.j));
    }

    public void J() {
        a.A = uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public WNa(l l2, String string, int n2, boolean bl) {
        void b2;
        void c2;
        void e2;
        void d2;
        boolean bl2 = bl;
        WNa a2 = this;
        super((l)d2, oha.J(e2 != false ? TPa.U : Bsa.B, new Object[uSa.E]), (String)c2, (int)b2);
        WNa wNa2 = a2;
        wNa2.A = vRa.d;
        wNa2.C = oha.J(e2 != false ? wOa.ja : dsa.Ha, new Object[uSa.E]);
        a2.j = oha.J(e2 != false ? SOa.l : MTa.P, new Object[uSa.E]);
        a2.I = oha.J(isa.i, new Object[uSa.E]);
        a2.k = oha.J(rRa.u, new Object[uSa.E]);
        a2.J = c2;
    }

    @Override
    public void J(ac ac2) throws IOException {
        WNa wNa2;
        boolean bl;
        WNa b2 = ac2;
        WNa a2 = this;
        if (((ac)b2).C == uqa.g) {
            a2.f();
        }
        l l2 = a2.i;
        if (((ac)b2).C == 0) {
            bl = vRa.d;
            wNa2 = a2;
        } else {
            bl = uSa.E;
            wNa2 = a2;
        }
        l2.J(bl, (int)wNa2.J);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3, float f2) {
        void b2;
        void c2;
        WNa a2;
        float d2 = f2;
        WNa wNa2 = a2 = this;
        super.J((int)c2, (int)b2, d2);
        if (wNa2.A) {
            WNa.J((String)a2.k, (int)(a2.A / uqa.g), (int)Iqa.M, (int)pua.o);
        }
    }
}

