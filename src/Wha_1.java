/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Aaa
 *  FPa
 *  Lz
 *  OEa
 *  gFa
 *  jy
 *  pua
 *  vL
 *  vRa
 *  vpa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Wha_1
extends gFa {
    private int j;
    private int J;
    private bga A;
    private jy I;

    public Wha_1(bga bga2) {
        Object b2 = bga2;
        Wha_1 a2 = this;
        a2.J = pua.o;
        a2.j = pua.o;
        a2.A = b2;
        a2.J(vRa.d);
    }

    public boolean f() {
        Wha_1 wha_1 = this;
        Object a2 = new XF((vL)wha_1.A);
        if ((!wha_1.A.j.e() || wha_1.A.j.l() && !wha_1.A.j.J((XF)((Object)a2)).J()) && !wha_1.A.j.F.f()) {
            Aaa aaa2;
            if (wha_1.A.J().nextInt(vpa.o) != 0) {
                return uSa.E != 0;
            }
            if (wha_1.J != pua.o) {
                Wha_1 wha_12 = wha_1;
                if (wha_12.A.f(wha_12.J, wha_1.A.Z, wha_1.j) < FPa.T) {
                    return uSa.E != 0;
                }
            }
            if ((aaa2 = wha_1.A.j.J().J((XF)((Object)a2), hpa.Z)) == null) {
                return uSa.E != 0;
            }
            wha_1.I = aaa2.J((XF)((Object)a2));
            if (wha_1.I != null) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public boolean l() {
        Wha_1 a2;
        if (!a2.A.J().f()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void l() {
        Wha_1 wha_1;
        Wha_1 wha_12 = wha_1 = this;
        wha_12.J = pua.o;
        Object a2 = wha_12.I.J();
        int n2 = a2.getX();
        int n3 = a2.getY();
        int n4 = a2.getZ();
        if (wha_12.A.J((XF)((Object)a2)) > ZSa.o) {
            a2 = OEa.l((bga)wha_1.A, (int)hpa.Z, (int)yRa.d, (Lz)new Lz((double)n2 + kTa.B, (double)n3, (double)n4 + kTa.B));
            if (a2 != null) {
                wha_1.A.J().J(((Lz)a2).A, ((Lz)a2).j, ((Lz)a2).J, oua.i);
                return;
            }
        } else {
            wha_1.A.J().J((double)n2 + kTa.B, n3, (double)n4 + kTa.B, oua.i);
        }
    }

    public void J() {
        Wha_1 a2;
        a2.J = a2.I.J().getX();
        a2.j = a2.I.J().getZ();
        a2.I = null;
    }
}

