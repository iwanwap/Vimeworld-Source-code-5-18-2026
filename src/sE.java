/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Xd
 *  aSa
 *  eD
 *  kf
 *  pqa
 *  qta
 *  vRa
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class sE {
    private double m;
    private final List<kf> C;
    private kf i;
    private kf M;
    private double k;
    private boolean j;
    private kf J;
    private double A;
    private final eD I;

    public kf l() {
        sE a2;
        return a2.M;
    }

    public boolean J() {
        sE a2;
        return a2.j;
    }

    public double l() {
        sE a2;
        return a2.m;
    }

    public eD J() {
        sE a2;
        return a2.I;
    }

    public double f() {
        sE a2;
        return a2.k;
    }

    public Xd J(Xd xd2) {
        sE b2 = xd2;
        sE a2 = this;
        if (a2.i != null && a2.i.J() != null) {
            return a2.i.J();
        }
        return b2;
    }

    public sE(eD eD2) {
        sE a2;
        sE b2 = eD2;
        sE sE2 = a2 = this;
        sE sE3 = a2;
        a2.C = new ArrayList<kf>();
        sE3.A = qta.Ka;
        a2.m = qta.Ka;
        sE2.k = aSa.V;
        sE2.j = vRa.d;
        sE2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Xd xd2, float f2) {
        void b2;
        float c2 = f2;
        sE a2 = this;
        if (a2.i != null) {
            a2.i.f((Xd)b2, c2);
        }
        if (a2.M != null && a2.M.f()) {
            a2.M.J((Xd)b2, pqa.r - a2.M.f(c2));
        }
        for (kf kf2 : a2.C) {
            if (kf2.f()) {
                kf kf3 = kf2;
                kf3.J((Xd)b2, pqa.r - kf3.f(c2));
                continue;
            }
            kf2.f((Xd)b2, c2);
        }
    }

    public kf f() {
        sE a2;
        return a2.J;
    }

    public void f(Sx sx2) {
        Object b2 = sx2;
        sE a2 = this;
        if (a2.A == qta.Ka) {
            sE sE2 = a2;
            sE2.A = ((Sx)((Object)b2)).la;
            sE2.m = ((Sx)((Object)b2)).A;
        }
        sE sE3 = a2;
        sE3.J((Sx)((Object)b2));
        if (sE3.i != null) {
            a2.i.l();
        }
        if (a2.M != null) {
            a2.M.l();
        }
        b2 = a2.C.iterator();
        while (b2.hasNext()) {
            kf kf2 = (kf)b2.next();
            kf2.l();
            if (!kf2.l()) continue;
            kf2.f();
            b2.remove();
        }
    }

    public void J(Sx sx2) {
        Object b2 = sx2;
        sE a2 = this;
        if (a2.J != null) {
            sE sE2 = a2;
            sE2.J(sE2.J);
        }
        sE sE3 = a2;
        Object object = b2;
        sE sE4 = a2;
        sE4.A = ((Sx)((Object)b2)).la;
        sE4.m = ((Sx)((Object)b2)).A;
        sE3.k = ((Sx)((Object)object)).Ea;
        sE3.j = ((Sx)((Object)object)).ha;
    }

    public double J() {
        sE a2;
        return a2.A;
    }

    public List<kf> J() {
        sE a2;
        return a2.C;
    }

    public kf J() {
        sE a2;
        return a2.i;
    }

    public void f(kf kf2) {
        sE b2 = kf2;
        sE a2 = this;
        if (b2 != null) {
            a2.J = b2;
            return;
        }
        if (a2.J != null) {
            a2.J = null;
        }
    }

    public void J(kf kf2) {
        sE b2 = kf2;
        sE a2 = this;
        if (a2.i == b2 || b2 == null) {
            return;
        }
        if (a2.i != null && b2.J() < a2.i.J()) {
            return;
        }
        if (a2.i != null) {
            sE sE2 = a2;
            sE2.M = sE2.i;
            sE2.M.J();
        }
        a2.i = b2;
        a2.i.C();
    }
}

