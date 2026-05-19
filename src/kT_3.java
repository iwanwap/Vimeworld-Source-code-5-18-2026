/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CS
 *  EC
 *  Uta
 *  ZOa
 *  ac
 *  gT
 *  jt
 *  mS
 *  vRa
 */
import java.util.Iterator;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class kT_3
extends CS {
    private static final int m = 2;
    private static final int C = 1;
    private static final int i = 3;
    private static final int M = 4;
    private static final int j = 5;
    private static final int J = 6;

    private static String C() {
        return new StringBuilder().insert(3 & 4, Jsa.v).append(jt.o == vRa.d ? Uta.ja : WPa.h).toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void f(ac ac2) {
        kT_3 b2 = ac2;
        kT_3 a2 = this;
        switch (((ac)b2).C) {
            case 1: {
                jt.K = !jt.K ? vRa.d : uSa.E;
                kT_3 kT_32 = a2;
                kT_3 kT_33 = kT_32;
                ((ac)b2).i = kT_3.f();
                kT_32.f();
                mS.D();
                break;
            }
            case 2: {
                jt.l.J((Bp)mS.C);
                kT_3 kT_33 = a2;
                ((ac)b2).i = kT_3.J((Bp)mS.C);
                break;
            }
            case 3: {
                jt.v = jt.v == vRa.d ? uqa.g : vRa.d;
                kT_3 kT_33 = a2;
                ((ac)b2).i = kT_3.l();
                mS.D();
                break;
            }
            case 4: {
                jt.G = ((gT)b2).I.L;
                kT_3 kT_33 = a2;
                break;
            }
            case 5: {
                jt.o = jt.o == vRa.d ? uqa.g : vRa.d;
                kT_3 kT_33 = a2;
                ((ac)b2).i = kT_3.C();
                break;
            }
            case 6: {
                jt.C = (jt.C + vRa.d) % yRa.d;
                kT_3 kT_34 = a2;
                kT_3 kT_33 = kT_34;
                ((ac)b2).i = kT_3.J((int)jt.C);
                kT_34.f();
                break;
            }
            default: {
                return;
            }
        }
        kT_33.C = vRa.d;
    }

    private void f() {
        kT_3 kT_32 = this;
        Iterator a2 = kT_32.E.iterator();
        block0: while (true) {
            Iterator iterator = a2;
            while (iterator.hasNext()) {
                ac ac2 = (ac)a2.next();
                if (ac2.C == vRa.d) continue block0;
                if (ac2.C == ZOa.x) {
                    iterator = a2;
                    continue;
                }
                if (!jt.K) {
                    iterator = a2;
                    kT_3.J((ac)ac2, uSa.E != 0);
                    continue;
                }
                if (jt.C != 0 && ac2.C == AQa.P) {
                    iterator = a2;
                    kT_3.J((ac)ac2, uSa.E != 0);
                    continue;
                }
                kT_3.J((ac)ac2, vRa.d != 0);
                iterator = a2;
            }
            break;
        }
    }

    private static String l() {
        return new StringBuilder().insert(3 & 4, TOa.e).append(jt.v == vRa.d ? Uta.ja : WPa.h).toString();
    }

    public void J() {
        kT_3 a2;
        a2.J(vRa.d, kT_3.f());
        a2.J(uqa.g, kT_3.J((Bp)mS.C));
        a2.J(yRa.d, kT_3.l(), AQa.P);
        a2.J(AQa.P, jt.G);
        a2.J(tTa.h, kT_3.C(), uqa.g);
        a2.J(uua.p, kT_3.J((int)jt.C));
        a2.f();
    }

    private static String f() {
        return kT_3.J((String)kra.ia, (boolean)jt.K);
    }

    public kT_3(EC eC2) {
        kT_3 b2 = eC2;
        kT_3 a2 = this;
        super((EC)b2, kra.ia);
    }
}

