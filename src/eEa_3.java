/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 *  Oz
 *  Yda
 *  gFa
 *  pua
 *  vL
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class eEa_3
extends gFa {
    private Yda I;

    public eEa_3(Yda yda2) {
        eEa_3 a2;
        eEa_3 b2 = yda2;
        eEa_3 eEa_32 = a2 = this;
        eEa_32.I = b2;
        eEa_32.J(uqa.g);
    }

    public boolean f() {
        return vRa.d != 0;
    }

    public void f() {
        double d2;
        eEa_3 eEa_32 = this;
        if (eEa_32.I.C() == null) {
            eEa_3 eEa_33 = eEa_32;
            eEa_33.I.ba = eEa_33.I.X = -((float)Oz.f((double)eEa_32.I.i, (double)eEa_32.I.f)) * Hra.Ga / pua.j;
            return;
        }
        eEa_3 a2 = eEa_32.I.C();
        double d3 = d2 = ypa.X;
        if (a2.J((vL)eEa_32.I) < d3 * d3) {
            eEa_3 eEa_34 = a2;
            d2 = ((Gl)eEa_34).la - eEa_32.I.la;
            double d4 = ((Gl)eEa_34).A - eEa_32.I.A;
            eEa_32.I.ba = eEa_32.I.X = -((float)Oz.f((double)d2, (double)d4)) * Hra.Ga / pua.j;
        }
    }
}

