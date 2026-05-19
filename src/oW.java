/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DQa
 *  Eoa
 *  Gy
 *  Kpa
 *  NTa
 *  OU
 *  PV
 *  vDa
 *  vL
 *  vRa
 *  vx
 */
import java.util.Iterator;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class oW {
    public static OU j;
    private static List<Object> J;
    private static final PV A;
    private static final PV I;

    private static long J() {
        vx vx2;
        Gy gy2 = Kpa.J().w;
        vx vx3 = vx2 = new vx(null);
        Gy gy3 = gy2;
        vx vx4 = vx2;
        Gy gy4 = gy2;
        vx vx5 = vx2;
        vx5.J(gy2.I.J());
        vx5.J(gy2.M.f());
        vx2.J(gy4.J.f());
        vx4.J(gy4.k.f());
        vx4.J(gy2.C.f());
        vx2.J(gy3.j.J());
        vx3.J(gy3.i.J());
        vx3.J(gy2.A.J());
        return vx3.J();
    }

    public static void C() {
        j.J(uSa.E != 0);
        vx vx2 = oW.J();
        I.f(vx2.J());
        J = vx.J((vx)vx2);
    }

    public static void l() {
        if (A.f() != oW.J()) {
            throw new RuntimeException(DQa.a);
        }
    }

    private static vx J() {
        vL vL2;
        Iterator iterator;
        Kpa kpa2 = Kpa.J();
        Eoa eoa = kpa2.Ta;
        vx vx2 = new vx(null);
        if (eoa == null) {
            return vx2;
        }
        Iterator iterator2 = iterator = eoa.Q.iterator();
        while (iterator2.hasNext()) {
            vL2 = (vL)iterator.next();
            iterator2 = iterator;
            vx2.J(vL2.F);
        }
        iterator = eoa.w.iterator();
        Iterator iterator3 = iterator;
        while (iterator3.hasNext()) {
            vL2 = (vL)iterator.next();
            iterator3 = iterator;
            vx2.J(vL2.u);
        }
        vx vx3 = vx2;
        Kpa kpa3 = kpa2;
        vx vx4 = vx2;
        Kpa kpa4 = kpa2;
        vx vx5 = vx2;
        Kpa kpa5 = kpa2;
        vx vx6 = vx2;
        Kpa kpa6 = kpa2;
        vx vx7 = vx2;
        Kpa kpa7 = kpa2;
        vx vx8 = vx2;
        Kpa kpa8 = kpa2;
        vx vx9 = vx2;
        Kpa kpa9 = kpa2;
        vx vx10 = vx2;
        vx vx11 = vx2;
        Kpa kpa10 = kpa2;
        vx vx12 = vx2;
        vx12.J(kpa2.c.h.l());
        vx12.J(kpa2.c.h.J());
        vx2.J(kpa10.c.h.f());
        vx11.J(kpa10.c.h.J());
        vx10.J(kpa2.c.h.f());
        vx11.J(vDa.m.J());
        vx10.J(vDa.C.J());
        vx10.J(vDa.M.J());
        vx10.J(vDa.i.J());
        vx10.J(vDa.J.J());
        vx2.J(kpa9.c.ha);
        vx9.J(kpa9.c.Ia);
        vx9.J(kpa2.c.da);
        vx2.J(kpa8.c.D);
        vx8.J(kpa8.c.la);
        vx8.J(kpa2.c.Z);
        vx2.J(kpa7.c.A);
        vx7.J(kpa7.c.i);
        vx7.J(kpa2.c.Ea);
        vx2.J(kpa6.c.f);
        vx6.J(kpa6.c.Ka);
        vx6.J(kpa2.c.P);
        vx2.J(kpa5.c.j());
        vx5.J(kpa5.c.t);
        vx5.J(kpa2.i);
        vx2.J(kpa4.Wa);
        vx4.J(kpa4.g);
        vx4.J(kpa2.oa);
        vx2.J(kpa3.L.A);
        vx3.J(kpa3.L.i);
        vx3.J(kpa2.L.J().getID());
        return vx2;
    }

    public oW() {
        oW a2;
    }

    public static void f() {
        j.J(vRa.d != 0);
        vx vx2 = oW.J();
        if (I.f() != vx2.J()) {
            throw new RuntimeException(new StringBuilder().insert(2 & 5, POa.ca).append(J).append(TOa.n).append(vx.J((vx)vx2)).append(hpa.b).toString());
        }
    }

    static {
        I = new PV(nqa.i, NTa.C);
        J = null;
        j = new OU(vRa.d != 0, kTa.j);
        A = new PV(nqa.i, NTa.C);
    }

    public static void J() {
        A.f(oW.J());
    }
}

