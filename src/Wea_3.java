/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Hba
 *  JPa
 *  cga
 *  gFa
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Wea_3
extends gFa {
    private cga I;

    public void f() {
        Wea_3 a2;
        if (a2.I.J().nextFloat() < xSa.la) {
            a2.I.J().J();
        }
        ((wea)a2.I.J()).J(JPa.ja);
    }

    public Wea_3(cga cga2) {
        Wea_3 b2 = cga2;
        Wea_3 a2 = this;
        a2.I = b2;
        a2.J(tTa.h);
        ((Hba)a2.I.J()).f(vRa.d != 0);
    }

    public boolean f() {
        Wea_3 a2;
        if (a2.I.L() || a2.I.H()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

