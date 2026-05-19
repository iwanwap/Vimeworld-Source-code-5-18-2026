/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  JPa
 *  Lz
 *  NTa
 *  gFa
 *  vRa
 */
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class tia_3
extends gFa {
    private double M;
    private double k;
    private double j;
    private bga J;
    private Gg A;
    private double I;

    public boolean f() {
        tia_3 tia_32 = this;
        if (!tia_32.A.e()) {
            return uSa.E != 0;
        }
        if (!tia_32.J.o()) {
            return uSa.E != 0;
        }
        if (!tia_32.A.j(new XF(tia_32.J.la, tia_32.J.J().j, (double)tia_32.J.A))) {
            return uSa.E != 0;
        }
        tia_3 a2 = tia_32.J();
        if (a2 == null) {
            return uSa.E != 0;
        }
        tia_3 tia_33 = tia_32;
        tia_3 tia_34 = a2;
        tia_32.M = ((Lz)a2).A;
        tia_33.I = ((Lz)tia_34).j;
        tia_33.j = ((Lz)tia_34).J;
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public tia_3(bga bga2, double d2) {
        void a2;
        Object c2 = bga2;
        tia_3 b2 = this;
        b2.J = c2;
        b2.k = a2;
        b2.A = ((bga)((Object)c2)).j;
        b2.J(vRa.d);
    }

    public boolean l() {
        tia_3 a2;
        if (!a2.J.J().f()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private Lz J() {
        int n2;
        tia_3 tia_32 = this;
        Random random = tia_32.J.J();
        XF xF2 = new XF(tia_32.J.la, tia_32.J.J().j, (double)tia_32.J.A);
        int n3 = n2 = uSa.E;
        while (n3 < NTa.C) {
            Object a2 = xF2.add(random.nextInt(kTa.j) - NTa.C, random.nextInt(uua.p) - yRa.d, random.nextInt(kTa.j) - NTa.C);
            if (!tia_32.A.j((XF)((Object)a2)) && tia_32.J.J((XF)((Object)a2)) < JPa.N) {
                return new Lz((double)a2.getX(), (double)a2.getY(), (double)a2.getZ());
            }
            n3 = ++n2;
        }
        return null;
    }

    public void l() {
        tia_3 a2;
        a2.J.J().J(a2.M, a2.I, a2.j, a2.k);
    }
}

