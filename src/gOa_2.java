/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EC
 *  Eoa
 *  Moa
 *  NTa
 *  PTa
 *  QSa
 *  Spa
 *  XTa
 *  Ypa
 *  ac
 *  dpa
 *  nQa
 *  nna
 *  pua
 *  vRa
 *  wca
 *  wra
 */
import java.io.IOException;

public final class gOa_2
extends EC {
    private int j;
    private int J;

    /*
     * Enabled aggressive block sorting
     */
    public void J(ac ac2) throws IOException {
        gOa_2 b2 = ac2;
        gOa_2 a2 = this;
        switch (((ac)b2).C) {
            case 0: {
                gOa_2 gOa_22 = a2;
                a2.g.J((EC)new nna((EC)gOa_22, gOa_22.g.z));
                return;
            }
            case 1: {
                ((ac)b2).J = uSa.E;
                gOa_2 gOa_23 = a2;
                gOa_23.g.Ta.D();
                gOa_23.g.J((Eoa)null);
                if (a2.g.d()) {
                    a2.g.J((EC)new Moa());
                    return;
                }
                a2.g.J((EC)new uLa((EC)new Moa()));
            }
            default: {
                return;
            }
            case 4: {
                a2.g.J((EC)null);
                a2.g.C();
                return;
            }
            case 5: {
                gOa_2 gOa_24 = a2;
                a2.g.J((EC)new nNa(gOa_24, gOa_24.g.c.J()));
                return;
            }
            case 6: {
                gOa_2 gOa_25 = a2;
                a2.g.J((EC)new cna(gOa_25, gOa_25.g.c.J()));
                return;
            }
            case 8: 
        }
        gOa_2 gOa_26 = a2;
        gOa_26.g.J(null);
        gOa_26.g.C();
        gOa_26.g.J().J((KC)new wca(Spa.Ka));
    }

    public void A() {
        gOa_2 gOa_22;
        gOa_2 gOa_23 = gOa_22 = this;
        gOa_23.J = uSa.E;
        gOa_23.E.clear();
        int a2 = nQa.u;
        if (gOa_23.g.d()) {
            gOa_22.E.add(new ac(vRa.d, gOa_22.A / uqa.g - ySa.T, gOa_22.I / AQa.P + sOa.D + a2, oha.J(DPa.f, new Object[uSa.E])));
        }
        if (!gOa_22.g.d()) {
            gOa_22.E.add(new ac(Yqa.i, gOa_22.A / uqa.g - ySa.T, gOa_22.I / AQa.P + sOa.D + a2, dpa.A, kTa.j, oha.J(PTa.E, new Object[uSa.E])));
            gOa_22.E.add(new ac(vRa.d, gOa_22.A / uqa.g + uqa.g, gOa_22.I / AQa.P + sOa.D + a2, dpa.A, kTa.j, oha.J(qQa.U, new Object[uSa.E])));
        }
        gOa_22.E.add(new ac(AQa.P, gOa_22.A / uqa.g - ySa.T, gOa_22.I / AQa.P + osa.c + a2, oha.J(gsa.I, new Object[uSa.E])));
        gOa_22.E.add(new ac(uSa.E, gOa_22.A / uqa.g - ySa.T, gOa_22.I / AQa.P + zua.m + a2, dpa.A, kTa.j, oha.J(zpa.q, new Object[uSa.E])));
        ac ac2 = new ac(XTa.W, gOa_22.A / uqa.g + uqa.g, gOa_22.I / AQa.P + zua.m + a2, dpa.A, kTa.j, oha.J(NTa.O, new Object[uSa.E]));
        gOa_22.E.add(ac2);
        gOa_22.E.add(new ac(tTa.h, gOa_22.A / uqa.g - ySa.T, gOa_22.I / AQa.P + QSa.p + a2, dpa.A, kTa.j, oha.J(Ypa.f, new Object[uSa.E])));
        gOa_22.E.add(new ac(uua.p, gOa_22.A / uqa.g + uqa.g, gOa_22.I / AQa.P + QSa.p + a2, dpa.A, kTa.j, oha.J(ZSa.U, new Object[uSa.E])));
        ac2.J = gOa_22.g.f() && !gOa_22.g.J().z() ? vRa.d : uSa.E;
    }

    public void l() {
        gOa_2 a2;
        gOa_2 gOa_22 = a2;
        super.l();
        gOa_22.j += vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void a2;
        void b2;
        void c2;
        gOa_2 gOa_22 = this;
        gOa_22.i();
        Object d2 = oha.J(GPa.Y, new Object[uSa.E]);
        gOa_2 gOa_23 = gOa_22;
        gOa_2.J((String)d2, (int)(gOa_23.A / uqa.g), (int)wra.P, (int)pua.o);
        super.J((int)c2, (int)b2, (float)a2);
    }

    public gOa_2() {
        gOa_2 a2;
    }
}

