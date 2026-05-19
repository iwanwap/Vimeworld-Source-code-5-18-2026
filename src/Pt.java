/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AU
 *  CS
 *  EC
 *  LQa
 *  XSa
 *  ac
 *  jt
 *  uQa
 *  vRa
 */
public final class Pt
extends CS {
    private static final int C = 1;
    private static final int i = 4;
    private static final int M = 5;
    private static final int j = 2;
    private static final int J = 3;

    private static String e() {
        return Pt.J((String)zpa.C, (boolean)jt.b);
    }

    private static String d() {
        return Pt.J((String)LQa.G, (boolean)jt.k);
    }

    private static String C() {
        return Pt.J((String)uQa.n, (!jt.A ? vRa.d : uSa.E) != 0);
    }

    private static String l() {
        return Pt.J((String)KSa.y, (boolean)jt.f);
    }

    private static String f() {
        return new StringBuilder().insert(3 >> 2, XSa.X).append(jt.h.display).toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void f(ac ac2) {
        Pt b2 = ac2;
        Pt a2 = this;
        switch (((ac)b2).C) {
            case 1: {
                jt.k = !jt.k ? vRa.d : uSa.E;
                Pt pt2 = a2;
                ((ac)b2).i = Pt.d();
                AU.A();
                break;
            }
            case 2: {
                jt.b = !jt.b ? vRa.d : uSa.E;
                Pt pt2 = a2;
                ((ac)b2).i = Pt.e();
                break;
            }
            case 3: {
                jt.A = !jt.A ? vRa.d : uSa.E;
                Pt pt2 = a2;
                ((ac)b2).i = Pt.C();
                break;
            }
            case 4: {
                jt.h = jt.h.next();
                Pt pt2 = a2;
                ((ac)b2).i = Pt.f();
                break;
            }
            case 5: {
                jt.f = !jt.f ? vRa.d : uSa.E;
                Pt pt2 = a2;
                ((ac)b2).i = Pt.l();
                break;
            }
            default: {
                return;
            }
        }
        pt2.C = vRa.d;
    }

    public void J() {
        Pt a2;
        a2.J(vRa.d, Pt.d());
        a2.J(uqa.g, Pt.e());
        a2.J(yRa.d, Pt.C());
        a2.J(AQa.P, Pt.f());
        a2.J(tTa.h, Pt.l());
    }

    public Pt(EC eC2) {
        Pt b2 = eC2;
        Pt a2 = this;
        super((EC)b2, DPa.L);
    }
}

