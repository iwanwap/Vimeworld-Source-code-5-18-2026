/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BD
 *  F
 *  JQa
 *  Kpa
 *  ND
 *  Spa
 *  aSa
 *  ad
 *  ef
 *  hTa
 *  hqa
 *  pua
 *  vRa
 *  xe
 *  zU
 */
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class UE_3
extends ad
implements F {
    private int L;
    private final BD E;
    private final BD m;
    private final BD C;
    private final BD i;
    private final ef M;
    private final Xe k;
    private final xe j;
    private final ND J;
    private final BD A;
    private final BD I;

    private void J(BD bD2) {
        UE_3 b2 = bD2;
        UE_3 a2 = this;
        if (!zU.M.f((MiniDotItem)b2.f()) && !Kpa.J().d()) {
            b2.J(null);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public BD J(int n2) {
        int b2 = n2;
        UE_3 a2 = this;
        switch (b2) {
            case 0: 
            case 1: {
                return a2.E;
            }
            case 2: {
                return a2.I;
            }
            case 3: {
                return a2.m;
            }
            case 4: {
                return a2.i;
            }
            case 5: {
                return a2.C;
            }
            case 6: {
                return a2.A;
            }
        }
        return null;
    }

    public BD J() {
        UE_3 a2;
        UE_3 uE_3 = a2;
        return uE_3.J(uE_3.L);
    }

    public UE_3(Xe xe2) {
        UE_3 a2;
        Object b2 = xe2;
        UE_3 uE_3 = a2 = this;
        a2.L = pua.o;
        a2.k = b2;
        UE_3 uE_32 = a2;
        uE_3.J = new ND((Xe)((Object)b2));
        uE_32.j = (xe)hqa.w;
        uE_3.k = (Xe)JQa.T;
        uE_3.j = new xe((Xe)((Object)b2));
        uE_3.M = new ef((Xe)((Object)b2));
        uE_3.E = new BD((Xe)((Object)b2), vRa.d);
        uE_3.I = new BD((Xe)((Object)b2), uqa.g);
        uE_3.m = new BD((Xe)((Object)b2), yRa.d);
        uE_3.i = new BD((Xe)((Object)b2), AQa.P);
        uE_3.C = new BD((Xe)((Object)b2), tTa.h);
        uE_3.A = new BD((Xe)((Object)b2), uua.p);
    }

    public ND J() {
        UE_3 a2;
        return a2.J;
    }

    public void J() {
        UE_3 a2;
        UE_3 uE_3 = a2;
        uE_3.J(uE_3.E);
        uE_3.J(uE_3.I);
        uE_3.J(uE_3.m);
        uE_3.J(uE_3.i);
        uE_3.J(uE_3.C);
        uE_3.J(uE_3.A);
        uE_3.J.e();
    }

    public void J(int n2) {
        int b2 = n2;
        UE_3 a2 = this;
        if (a2.L == b2) {
            return;
        }
        if (a2.L != pua.o) {
            UE_3 uE_3 = a2;
            uE_3.J(uE_3.L).J(uSa.E != 0);
        }
        a2.L = b2;
        if (b2 != pua.o) {
            a2.J(b2).J(vRa.d != 0);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        UE_3 a2;
        int c2 = n3;
        UE_3 uE_3 = a2 = this;
        uE_3.k = (Xe)JC.J(JQa.T, hTa.Aa, oua.i - a2.k.f().l());
        uE_3.j = (xe)JC.J(hqa.w, Spa.c, oua.i - a2.k.f().l());
        uE_3.I = (BD)((double)uE_3.k.J() / KPa.y - a2.k / KPa.y - a2.k * JC.f(aSa.V, oQa.fa, a2.k.l().l()));
        uE_3.J = (ND)((double)uE_3.k.f() / KPa.y - a2.j / KPa.y);
        uE_3.E.C((double)(a2.I + a2.k / KPa.y - a2.E.l() / KPa.y));
        uE_3.E.l((double)(a2.J + a2.j - a2.E.J()));
        uE_3.i.C((double)(a2.I + a2.k / KPa.y - a2.E.l() / KPa.y));
        uE_3.i.l((double)a2.J);
        uE_3.I.C((double)(a2.I + a2.k - a2.I.l()));
        uE_3.I.l((double)(a2.J + a2.j - Asa.y - a2.I.J()));
        uE_3.m.C((double)(a2.I + a2.k - a2.I.l()));
        uE_3.m.l((double)(a2.J + Asa.y));
        uE_3.C.C((double)a2.I);
        uE_3.C.l((double)(a2.J + Asa.y));
        uE_3.A.C((double)a2.I);
        uE_3.A.l((double)(a2.J + a2.j - Asa.y - a2.A.J()));
        uE_3.E.J((int)b2, c2);
        uE_3.I.J((int)b2, c2);
        uE_3.m.J((int)b2, c2);
        uE_3.i.J((int)b2, c2);
        uE_3.C.J((int)b2, c2);
        uE_3.A.J((int)b2, c2);
        uE_3.j.J((int)b2, c2);
        uE_3.M.J((int)b2, c2);
        uE_3.J.J((int)b2, c2);
    }

    public ef J() {
        UE_3 a2;
        return a2.M;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl2) {
        void e2;
        void b2;
        void c2;
        void d2;
        boolean bl3 = bl2;
        UE_3 a2 = this;
        if (a2.E.f()) {
            a2.E.J((int)d2, (int)c2, (int)b2, (boolean)e2);
        }
        if (a2.I.f()) {
            a2.I.J((int)d2, (int)c2, (int)b2, (boolean)e2);
        }
        if (a2.m.f()) {
            a2.m.J((int)d2, (int)c2, (int)b2, (boolean)e2);
        }
        if (a2.i.f()) {
            a2.i.J((int)d2, (int)c2, (int)b2, (boolean)e2);
        }
        if (a2.C.f()) {
            a2.C.J((int)d2, (int)c2, (int)b2, (boolean)e2);
        }
        if (a2.A.f()) {
            a2.A.J((int)d2, (int)c2, (int)b2, (boolean)e2);
        }
        if (a2.j.f()) {
            a2.j.J((int)d2, (int)c2, (int)b2, (boolean)e2);
        }
        if (a2.J.f() || a2.J.J().f()) {
            a2.J.J((int)d2, (int)c2, (int)b2, (boolean)e2);
        }
    }
}

