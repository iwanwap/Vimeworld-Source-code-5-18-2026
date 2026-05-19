/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EC
 *  JPa
 *  Lra
 *  Moa
 *  Qsa
 *  Ssa
 *  ac
 *  lqa
 *  pua
 *  uOa
 *  vRa
 *  vpa
 *  zf
 */
import java.io.IOException;

public final class VLa_2
extends EC {
    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void b2;
        void c2;
        VLa_2 a2;
        float d2 = f2;
        VLa_2 vLa_2 = a2 = this;
        a2.i();
        VLa_2.J((String)vpa.J, (int)(a2.A / uqa.g), (int)(a2.I / AQa.P - Psa.M + kTa.j), (int)pua.o);
        VLa_2.f((String)rpa.e, (int)(a2.A / uqa.g - Bua.v), (int)(a2.I / AQa.P - Psa.M + Psa.M + uSa.E), (int)xra.R);
        VLa_2.f((String)pta.ha, (int)(a2.A / uqa.g - Bua.v), (int)(a2.I / AQa.P - Psa.M + Psa.M + yOa.B), (int)xra.R);
        VLa_2.f((String)Jpa.Fa, (int)(a2.A / uqa.g - Bua.v), (int)(a2.I / AQa.P - Psa.M + Psa.M + Lra.e), (int)xra.R);
        VLa_2.f((String)oua.Y, (int)(a2.A / uqa.g - Bua.v), (int)(a2.I / AQa.P - Psa.M + Psa.M + Qsa.Ha), (int)xra.R);
        VLa_2.f((String)PRa.O, (int)(a2.A / uqa.g - Bua.v), (int)(a2.I / AQa.P - Psa.M + Psa.M + GPa.C), (int)xra.R);
        VLa_2.f((String)uOa.n, (int)(a2.A / uqa.g - Bua.v), (int)(a2.I / AQa.P - Psa.M + Psa.M + Ssa.u), (int)xra.R);
        VLa_2.f((String)Hra.U, (int)(a2.A / uqa.g - Bua.v), (int)(a2.I / AQa.P - Psa.M + Psa.M + Eqa.Ka), (int)xra.R);
        VLa_2.f((String)wta.C, (int)(a2.A / uqa.g - Bua.v), (int)(a2.I / AQa.P - Psa.M + Psa.M + csa.A), (int)xra.R);
        super.J((int)c2, (int)b2, d2);
    }

    public VLa_2() {
        VLa_2 a2;
    }

    public void J(ac ac2) throws IOException {
        VLa_2 b2 = ac2;
        VLa_2 a2 = this;
        if (((ac)b2).C == 0) {
            a2.g.J((EC)new Moa());
            return;
        }
        if (((ac)b2).C == vRa.d) {
            a2.g.L();
        }
    }

    public void J(char c2, int n2) throws IOException {
        int c3 = n2;
        VLa_2 vLa_2 = this;
    }

    public void A() {
        VLa_2 a2;
        VLa_2 vLa_2 = a2;
        vLa_2.E.clear();
        vLa_2.E.add(new zf(uSa.E, a2.A / uqa.g - BQa.Q, a2.I / AQa.P + sOa.D + lqa.s, oha.J(Lsa.u, new Object[uSa.E])));
        a2.E.add(new zf(vRa.d, a2.A / uqa.g - BQa.Q + rRa.f, a2.I / AQa.P + sOa.D + lqa.s, oha.J(JPa.r, new Object[uSa.E])));
    }
}

