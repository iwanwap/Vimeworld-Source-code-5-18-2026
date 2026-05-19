/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Aaa
 *  ERa
 *  Hba
 *  fpa
 *  gFa
 *  jy
 *  vL
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class vHa_1
extends gFa {
    private bga A;
    private jy I;

    public void l() {
        vHa_1 a2;
        ((Hba)a2.A.J()).d(uSa.E != 0);
        ((Hba)a2.A.J()).l(uSa.E != 0);
    }

    public vHa_1(bga bga2) {
        Object b2 = bga2;
        vHa_1 a2 = this;
        a2.A = b2;
        if (!(a2.A.J() instanceof Hba)) {
            throw new IllegalArgumentException(xra.f);
        }
    }

    public boolean f() {
        vHa_1 vHa_12 = this;
        if (vHa_12.A.j.e()) {
            return uSa.E != 0;
        }
        Object a2 = new XF((vL)vHa_12.A);
        Aaa aaa2 = vHa_12.A.j.J().J((XF)((Object)a2), ERa.C);
        if (aaa2 == null) {
            return uSa.E != 0;
        }
        vHa_12.I = aaa2.f((XF)((Object)a2));
        if (vHa_12.I == null) {
            return uSa.E != 0;
        }
        if ((double)vHa_12.I.f((XF)((Object)a2)) < fpa.o) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void f() {
        vHa_1 a2;
        a2.I.J();
    }

    public boolean l() {
        vHa_1 a2;
        if (a2.A.j.e()) {
            return uSa.E != 0;
        }
        if (!a2.I.J() && a2.I.J(new XF((vL)a2.A))) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J() {
        vHa_1 a2;
        ((Hba)a2.A.J()).d(vRa.d != 0);
        ((Hba)a2.A.J()).l(vRa.d != 0);
        a2.I = null;
    }
}

