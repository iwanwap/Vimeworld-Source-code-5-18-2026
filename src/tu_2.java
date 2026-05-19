/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CS
 *  EC
 *  FTa
 *  JQa
 *  NTa
 *  Uta
 *  XTa
 *  Ysa
 *  ZOa
 *  ac
 *  bua
 *  gT
 *  jt
 *  pS
 *  vRa
 */
import java.util.Iterator;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class tu_2
extends CS {
    private static final int F = 1;
    private static final int g = 3;
    private static final int L = 8;
    private static final int E = 4;
    private static final int m = 2;
    private static final int C = 5;
    private static final int i = 6;
    private static final int M = 10;
    private static final int j = 9;
    private static final int J = 7;

    /*
     * Enabled aggressive block sorting
     */
    public void f(ac ac2) {
        tu_2 b2 = ac2;
        tu_2 a2 = this;
        switch (((ac)b2).C) {
            case 1: {
                jt.B = (jt.B + vRa.d) % yRa.d;
                tu_2 tu_22 = a2;
                tu_2 tu_23 = tu_22;
                ((ac)b2).i = tu_2.M();
                tu_22.f();
                pS.A();
                break;
            }
            case 2: {
                jt.l.J((Bp)pS.M);
                tu_2 tu_23 = a2;
                ((ac)b2).i = tu_2.J((Bp)pS.M);
                break;
            }
            case 3: {
                jt.J = !jt.J ? vRa.d : uSa.E;
                tu_2 tu_23 = a2;
                ((ac)b2).i = tu_2.e();
                break;
            }
            case 4: {
                jt.a = !jt.a ? vRa.d : uSa.E;
                tu_2 tu_23 = a2;
                ((ac)b2).i = tu_2.f();
                break;
            }
            case 5: {
                jt.H = !jt.H ? vRa.d : uSa.E;
                tu_2 tu_23 = a2;
                ((ac)b2).i = tu_2.C();
                break;
            }
            case 6: {
                jt.L = !jt.L ? vRa.d : uSa.E;
                tu_2 tu_23 = a2;
                ((ac)b2).i = tu_2.l();
                break;
            }
            case 7: {
                jt.D = ((gT)b2).I.L;
                tu_2 tu_23 = a2;
                break;
            }
            case 8: {
                jt.c = !jt.c ? vRa.d : uSa.E;
                tu_2 tu_23 = a2;
                ((ac)b2).i = tu_2.d();
                break;
            }
            case 9: {
                jt.I = (jt.I + vRa.d) % yRa.d;
                tu_2 tu_24 = a2;
                tu_2 tu_23 = tu_24;
                ((ac)b2).i = tu_2.J((int)jt.I);
                tu_24.f();
                break;
            }
            case 10: {
                jt.F = !jt.F ? vRa.d : uSa.E;
                tu_2 tu_23 = a2;
                ((ac)b2).i = tu_2.i();
                break;
            }
            default: {
                return;
            }
        }
        tu_23.C = vRa.d;
    }

    private static String i() {
        return tu_2.J((String)FTa.ga, (boolean)jt.F);
    }

    public tu_2(EC eC2) {
        tu_2 b2 = eC2;
        tu_2 a2 = this;
        super((EC)b2, Ysa.Ja);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String M() {
        String string = null;
        switch (jt.B) {
            case 0: {
                string = bua.Ga;
                return new StringBuilder().insert(3 & 4, PRa.n).append(string).toString();
            }
            case 1: {
                string = Uta.ja;
                return new StringBuilder().insert(3 & 4, PRa.n).append(string).toString();
            }
            case 2: {
                string = WPa.h;
                return new StringBuilder().insert(3 & 4, PRa.n).append(string).toString();
            }
        }
        return new StringBuilder().insert(3 & 4, PRa.n).append(string).toString();
    }

    private static String e() {
        return tu_2.J((String)NTa.Da, (boolean)jt.J);
    }

    public void J() {
        tu_2 a2;
        a2.J(vRa.d, tu_2.M());
        a2.J(uqa.g, tu_2.J((Bp)pS.M));
        a2.J(yRa.d, tu_2.e());
        a2.J(AQa.P, tu_2.f());
        a2.J(tTa.h, tu_2.C());
        a2.J(uua.p, tu_2.l(), yRa.d);
        a2.J(XTa.W, jt.D);
        a2.J(Yqa.i, tu_2.d(), uqa.g);
        a2.J(WOa.fa, tu_2.J((int)jt.I), uqa.g);
        a2.J(NTa.C, tu_2.i());
        a2.f();
    }

    private static String d() {
        return tu_2.J((String)pta.Ma, (boolean)jt.c);
    }

    private static String C() {
        return tu_2.J((String)JQa.l, (boolean)jt.H);
    }

    private static String l() {
        return tu_2.J((String)kra.h, (boolean)jt.L);
    }

    private static String f() {
        return tu_2.J((String)zua.s, (boolean)jt.a);
    }

    private void f() {
        tu_2 tu_22 = this;
        Iterator a2 = tu_22.E.iterator();
        block0: while (true) {
            Iterator iterator = a2;
            while (iterator.hasNext()) {
                ac ac2 = (ac)a2.next();
                if (ac2.C == vRa.d) continue block0;
                if (ac2.C == ZOa.x) {
                    iterator = a2;
                    continue;
                }
                if (jt.B == 0) {
                    iterator = a2;
                    tu_2.J((ac)ac2, uSa.E != 0);
                    continue;
                }
                if (jt.I != 0 && ac2.C == XTa.W) {
                    iterator = a2;
                    tu_2.J((ac)ac2, uSa.E != 0);
                    continue;
                }
                tu_2.J((ac)ac2, vRa.d != 0);
                iterator = a2;
            }
            break;
        }
    }
}

