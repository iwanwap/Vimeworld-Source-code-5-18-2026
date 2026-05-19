/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EC
 *  ERa
 *  Epa
 *  FPa
 *  GNa
 *  ISa
 *  JSa
 *  SOa
 *  ac
 *  bua
 *  cra
 *  loa
 *  pPa
 *  pua
 *  uV
 *  ura
 *  vLa
 *  vRa
 *  vpa
 *  zNa
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class vLa_3
extends EC {
    private uV m;
    private final zNa C;
    private ac i;
    private ac M;
    private String k;
    private String j;
    private String J;
    private ac A;
    private loa I;

    public static /* synthetic */ uV J(vLa a2) {
        return a2.m;
    }

    public void J(ac ac2) throws IOException {
        vLa_3 vLa_32;
        vLa_3 b2 = ac2;
        vLa_3 a2 = this;
        int n2 = a2.m.J().size() - a2.I.j - vRa.d;
        if (((ac)b2).C == vRa.d) {
            vLa_3 vLa_33 = a2;
            vLa_32 = vLa_33;
            a2.g.J((EC)vLa_33.C);
        } else if (((ac)b2).C == 0) {
            vLa_3 vLa_34 = a2;
            vLa_32 = vLa_34;
            a2.C.k = vLa_34.f();
            a2.g.J((EC)a2.C);
        } else if (((ac)b2).C == tTa.h) {
            vLa_3 vLa_35 = a2;
            vLa_32 = vLa_35;
            vLa_35.g.J((EC)new GNa((vLa)a2));
        } else {
            if (((ac)b2).C == AQa.P && a2.d()) {
                a2.m.J().remove(n2);
                a2.I.j = Math.min(a2.I.j, a2.m.J().size() - vRa.d);
            }
            vLa_32 = a2;
        }
        vLa_32.m.J();
        a2.J();
    }

    public String f() {
        vLa_3 a2;
        return a2.m.toString();
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void a2;
        void b2;
        void c2;
        vLa_3 vLa_32;
        vLa_3 vLa_33 = vLa_32 = this;
        vLa_33.i();
        vLa_33.I.J((int)c2, (int)b2, (float)a2);
        vLa_3.J((String)vLa_33.J, (int)(vLa_32.A / uqa.g), (int)Yqa.i, (int)pua.o);
        reference d2 = vLa_33.A / uqa.g - iSa.ca - ERa.C;
        vLa_3.f((String)vLa_33.j, (int)d2, (int)fPa.i, (int)pua.o);
        vLa_3 vLa_34 = vLa_32;
        vLa_3.f((String)vLa_33.k, (int)(d2 + uqa.g + xra.ja - vLa_34.L.J(vLa_34.k)), (int)fPa.i, (int)pua.o);
        super.J((int)c2, (int)b2, (float)a2);
    }

    public void d() throws IOException {
        vLa_3 a2;
        vLa_3 vLa_32 = a2;
        super.d();
        vLa_32.I.f();
    }

    public void J(String string) {
        Object b2 = string;
        vLa_3 a2 = this;
        a2.m = uV.J((String)b2);
    }

    private boolean d() {
        vLa_3 a2;
        if (a2.I.j > pua.o && a2.I.j < a2.m.J().size()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void A() {
        vLa_3 a2;
        a2.E.clear();
        a2.J = oha.J(eua.Ha, new Object[uSa.E]);
        a2.j = oha.J(ura.X, new Object[uSa.E]);
        a2.k = oha.J(JSa.N, new Object[uSa.E]);
        a2.I = new loa((vLa)a2);
        a2.i = new ac(uqa.g, (int)(a2.A / uqa.g - Epa.u), (int)(a2.I - FPa.F), ySa.T, kTa.j, oha.J(ISa.p, new Object[uSa.E]) + bua.F);
        a2.E.add(a2.i);
        a2.A = new ac(yRa.d, (int)(a2.A / uqa.g - vpa.o), (int)(a2.I - FPa.F), ySa.T, kTa.j, oha.J(gQa.q, new Object[uSa.E]) + bua.F);
        a2.E.add(a2.A);
        a2.M = new ac(AQa.P, (int)(a2.A / uqa.g - BQa.Q), (int)(a2.I - FPa.F), Jpa.Ha, kTa.j, oha.J(vpa.p, new Object[uSa.E]));
        a2.E.add(a2.M);
        a2.E.add(new ac(uSa.E, (int)(a2.A / uqa.g - BQa.Q), (int)(a2.I - EPa.O), Jpa.Ha, kTa.j, oha.J(cra.g, new Object[uSa.E])));
        a2.E.add(new ac(tTa.h, (int)(a2.A / uqa.g + tTa.h), (int)(a2.I - FPa.F), Jpa.Ha, kTa.j, oha.J(pPa.M, new Object[uSa.E])));
        a2.E.add(new ac(vRa.d, (int)(a2.A / uqa.g + tTa.h), (int)(a2.I - EPa.O), Jpa.Ha, kTa.j, oha.J(SOa.l, new Object[uSa.E])));
        vLa_3 vLa_32 = a2;
        vLa_32.i.k = vLa_32.A.k = uSa.E;
        vLa_3 vLa_33 = a2;
        vLa_33.m.J();
        vLa_33.J();
    }

    /*
     * WARNING - void declaration
     */
    public vLa_3(zNa zNa2, String string) {
        void b2;
        Object c2 = string;
        vLa_3 a2 = this;
        a2.m = uV.J();
        a2.C = b2;
        a2.J((String)c2);
    }

    public void J() {
        boolean a2;
        vLa_3 vLa_32 = this;
        vLa_32.M.J = a2 = vLa_32.d();
        vLa_32.A.J = a2;
        vLa_32.A.J = uSa.E;
        vLa_32.i.J = uSa.E;
    }
}

