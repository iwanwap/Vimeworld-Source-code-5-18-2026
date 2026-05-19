/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CS
 *  EC
 *  NOa
 *  XSa
 *  XTa
 *  ZOa
 *  aSa
 *  ac
 *  bSa
 *  bua
 *  dQa
 *  dpa
 *  gT
 *  jt
 *  kpa
 *  qu
 *  vRa
 *  xOa
 */
import java.util.Iterator;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Ms_3
extends CS {
    private ac F;
    private static final int g = 6;
    private static final int L = 4;
    private static final int E = 3;
    private static final int m = 2;
    private static final int C = 9;
    private static final int i = 1;
    private static final int M = 5;
    private static final int j = 7;
    private static final int J = 8;

    private static String M() {
        return new StringBuilder().insert(3 >> 2, Jqa.I).append(jt.M ? iSa.i : Zra.E).toString();
    }

    private static String e() {
        return Ms_3.J((String)bSa.Ja, (boolean)jt.d);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String d() {
        String string = null;
        switch (jt.m) {
            case 0: {
                string = XSa.d;
                return new StringBuilder().insert(2 & 5, dQa.s).append(string).toString();
            }
            case 1: {
                string = NOa.f;
                return new StringBuilder().insert(2 & 5, dQa.s).append(string).toString();
            }
            case 2: {
                string = xOa.fa;
                return new StringBuilder().insert(2 & 5, dQa.s).append(string).toString();
            }
        }
        return new StringBuilder().insert(2 & 5, dQa.s).append(string).toString();
    }

    private void f() {
        Ms_3 ms_3 = this;
        Iterator iterator = ms_3.E.iterator();
        block0: while (true) {
            Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                Ms_3 a2 = (ac)iterator.next();
                if (((ac)a2).C == vRa.d) continue block0;
                if (((ac)a2).C == ZOa.x) {
                    iterator2 = iterator;
                    continue;
                }
                if (jt.j == 0) {
                    iterator2 = iterator;
                    Ms_3.J((ac)a2, uSa.E != 0);
                    continue;
                }
                if (jt.x != 0 && ((ac)a2).C == tTa.h) {
                    iterator2 = iterator;
                    Ms_3.J((ac)a2, uSa.E != 0);
                    continue;
                }
                if (((ac)a2).C == tTa.h || ((ac)a2).C == Yqa.i || ((ac)a2).C == WOa.fa) {
                    Ms_3.J((ac)a2, (jt.m != 0 || jt.d ? vRa.d : uSa.E) != 0);
                    iterator2 = iterator;
                    continue;
                }
                Ms_3.J((ac)a2, vRa.d != 0);
                iterator2 = iterator;
            }
            break;
        }
    }

    public Ms_3(EC eC2) {
        Ms_3 b2 = eC2;
        Ms_3 a2 = this;
        super((EC)b2, ypa.s);
    }

    public void J() {
        Ms_3 a2;
        a2.J(vRa.d, Ms_3.C());
        a2.J(uqa.g, Ms_3.J((Bp)qu.J));
        a2.J(yRa.d, Ms_3.M());
        a2.J(AQa.P, Ms_3.f(), yRa.d);
        a2.J(tTa.h, jt.e);
        a2.J(uua.p, Ms_3.d(), uqa.g);
        a2.J(XTa.W, Ms_3.e(), uqa.g);
        a2.J(Yqa.i, Ms_3.J((int)jt.x), uqa.g);
        Ms_3 ms_3 = a2;
        ms_3.F = ms_3.J(WOa.fa, Ms_3.l());
        ms_3.f();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String C() {
        String string = null;
        switch (jt.j) {
            case 0: {
                string = bua.Ga;
                return new StringBuilder().insert(3 & 4, uua.v).append(string).toString();
            }
            case 1: {
                string = aSa.z;
                return new StringBuilder().insert(3 & 4, uua.v).append(string).toString();
            }
            case 2: {
                string = dpa.U;
                return new StringBuilder().insert(3 & 4, uua.v).append(string).toString();
            }
        }
        return new StringBuilder().insert(3 & 4, uua.v).append(string).toString();
    }

    private static String l() {
        String string = jt.M ? (jt.i ? Qra.V : kpa.W) : (jt.i ? osa.k : XSa.S);
        return new StringBuilder().insert(3 >> 2, tua.d).append(string).toString();
    }

    private static String f() {
        return Ms_3.J((String)Bta.Ja, (boolean)jt.E);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void f(ac ac2) {
        Ms_3 b2 = ac2;
        Ms_3 a2 = this;
        switch (((ac)b2).C) {
            case 1: {
                jt.j = (jt.j + vRa.d) % yRa.d;
                Ms_3 ms_3 = a2;
                Ms_3 ms_32 = ms_3;
                ((ac)b2).i = Ms_3.C();
                ms_3.f();
                qu.A();
                break;
            }
            case 2: {
                jt.l.J((Bp)qu.J);
                Ms_3 ms_32 = a2;
                ((ac)b2).i = Ms_3.J((Bp)qu.J);
                break;
            }
            case 3: {
                jt.M = !jt.M ? vRa.d : uSa.E;
                Ms_3 ms_32 = a2;
                ((ac)b2).i = Ms_3.M();
                a2.F.i = Ms_3.l();
                break;
            }
            case 4: {
                jt.E = !jt.E ? vRa.d : uSa.E;
                Ms_3 ms_32 = a2;
                ((ac)b2).i = Ms_3.f();
                break;
            }
            case 5: {
                jt.e = ((gT)b2).I.L;
                Ms_3 ms_32 = a2;
                break;
            }
            case 6: {
                jt.m = (jt.m + vRa.d) % yRa.d;
                Ms_3 ms_3 = a2;
                Ms_3 ms_32 = ms_3;
                ((ac)b2).i = Ms_3.d();
                ms_3.f();
                break;
            }
            case 7: {
                jt.d = !jt.d ? vRa.d : uSa.E;
                Ms_3 ms_3 = a2;
                Ms_3 ms_32 = ms_3;
                ((ac)b2).i = Ms_3.e();
                ms_3.f();
                break;
            }
            case 8: {
                jt.x = (jt.x + vRa.d) % yRa.d;
                Ms_3 ms_3 = a2;
                Ms_3 ms_32 = ms_3;
                ((ac)b2).i = Ms_3.J((int)jt.x);
                ms_3.f();
                break;
            }
            case 9: {
                jt.i = !jt.i ? vRa.d : uSa.E;
                Ms_3 ms_32 = a2;
                ((ac)b2).i = Ms_3.l();
                break;
            }
            default: {
                return;
            }
        }
        ms_32.C = vRa.d;
    }
}

