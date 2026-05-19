/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bb
 *  Ega
 *  Gg
 *  HA
 *  JSa
 *  Lra
 *  Mda
 *  NPa
 *  QFa
 *  Qqa
 *  Vua
 *  Xea
 *  kGa
 *  kea
 *  lqa
 *  uOa
 *  vRa
 *  wga
 *  wra
 */
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class rda
extends Ega {
    private XF E;
    private int m;
    private boolean C;
    private static final Logger i = LogManager.getLogger();
    private HA M;
    private final Sx k;
    public int j;
    private Gg J;
    private HA A;
    private String I;

    /*
     * WARNING - void declaration
     */
    public rda(kea kea2, Gg gg2, XF xF, Sx sx2) {
        void d2;
        void a2;
        void b2;
        rda c2;
        rda e22 = gg2;
        rda rda2 = c2 = this;
        rda rda3 = c2;
        rda2.A = new Xea();
        rda2.M = new qfa(c2, JSa.O, vRa.d != 0, uqa.g);
        rda2.E = b2;
        c2.J = e22;
        c2.k = a2;
        c2.J(new sEa(c2.M, uSa.E, Lra.e, uOa.F));
        rda rda4 = c2;
        rda4.J(new sEa(rda4.M, vRa.d, NPa.i, uOa.F));
        rda rda5 = c2;
        rda5.J(new mea(rda5, c2.A, uqa.g, Qqa.Ja, uOa.F, (Gg)e22, (XF)b2));
        int e22 = uSa.E;
        int n2 = e22;
        while (n2 < yRa.d) {
            int n3 = uSa.E;
            while (n3 < WOa.fa) {
                int n4 = b2 + e22 * WOa.fa + WOa.fa;
                int n5 = Yqa.i + b2 * yOa.B;
                c2.J(new sEa((HA)d2, n4, n5, Vua.J + e22 * yOa.B));
                n3 = ++b2;
            }
            n2 = ++e22;
        }
        int n6 = e22 = uSa.E;
        while (n6 < WOa.fa) {
            int n7 = e22++;
            c2.J(new sEa((HA)d2, n7, Yqa.i + n7 * yOa.B, Fsa.D));
            n6 = e22;
        }
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(Sx sx2, int n2) {
        void a2;
        rda rda2 = this;
        Mda mda2 = null;
        sEa sEa2 = (sEa)rda2.A.get((int)a2);
        if (sEa2 != null && sEa2.J()) {
            void b2;
            rda rda3;
            rda rda4;
            rda c2 = sEa2.J();
            mda2 = c2.J();
            if (a2 == uqa.g) {
                if (!rda2.J((Mda)c2, yRa.d, CRa.L, vRa.d != 0)) {
                    return null;
                }
                sEa2.J((Mda)c2, mda2);
                rda4 = c2;
            } else {
                if (a2 != false && a2 != vRa.d ? a2 >= yRa.d && a2 < CRa.L && !rda2.J((Mda)c2, uSa.E, uqa.g, uSa.E != 0) : !rda2.J((Mda)c2, yRa.d, CRa.L, uSa.E != 0)) {
                    return null;
                }
                rda4 = c2;
            }
            sEa sEa3 = sEa2;
            if (((Mda)rda4).E == 0) {
                sEa3.J((Mda)null);
                rda3 = c2;
            } else {
                sEa3.J();
                rda3 = c2;
            }
            if (((Mda)rda3).E == mda2.E) {
                return null;
            }
            sEa2.J((Sx)b2, (Mda)c2);
        }
        return mda2;
    }

    public void J(HA hA2) {
        rda a2;
        rda b2 = hA2;
        rda rda2 = a2 = this;
        rda rda3 = b2;
        super.J((HA)rda3);
        if (rda3 == rda2.M) {
            a2.l();
        }
    }

    public static /* synthetic */ int J(rda a2) {
        return a2.m;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void l() {
        int n2;
        Map map;
        Mda mda2;
        rda a2;
        int n3;
        int n4;
        int n5;
        rda rda2;
        block31: {
            rda rda3;
            block30: {
                Mda mda3;
                block29: {
                    rda rda4;
                    block27: {
                        block25: {
                            int n6;
                            int n7;
                            int n8;
                            block26: {
                                int n9;
                                rda2 = this;
                                if (rda2.C) {
                                    return;
                                }
                                mda3 = rda2.M.J(uSa.E);
                                rda2.j = vRa.d;
                                n5 = uSa.E;
                                n4 = uSa.E;
                                n3 = uSa.E;
                                if (mda3 == null) {
                                    rda2.A.J(uSa.E, (Mda)null);
                                    rda2.j = uSa.E;
                                    return;
                                }
                                a2 = mda3.J();
                                mda2 = rda2.M.J(vRa.d);
                                map = kGa.J((Mda)a2);
                                n8 = uSa.E;
                                n4 = n4 + mda3.d() + (mda2 == null ? uSa.E : mda2.d());
                                rda2.m = uSa.E;
                                if (mda2 == null) break block25;
                                int n10 = n8 = mda2.J() == Gea.ha && Gea.ha.J(mda2).J() > 0 ? vRa.d : uSa.E;
                                if (!a2.d() || !a2.J().J(mda3, mda2)) break block26;
                                n2 = Math.min(a2.f(), a2.l() / AQa.P);
                                if (n2 <= 0) {
                                    rda2.A.J(uSa.E, (Mda)null);
                                    rda2.j = uSa.E;
                                    return;
                                }
                                int n11 = n2;
                                for (n9 = uSa.E; n11 > 0 && n9 < mda2.E; ++n5, ++n9) {
                                    rda rda5 = a2;
                                    int n12 = rda5.f() - n2;
                                    rda5.J(n12);
                                    n11 = n2 = Math.min(rda5.f(), a2.l() / AQa.P);
                                }
                                rda4 = rda2;
                                rda2.m = n9;
                                break block27;
                            }
                            if (!(n8 != 0 || a2.J() == mda2.J() && a2.d())) {
                                rda2.A.J(uSa.E, (Mda)null);
                                rda2.j = uSa.E;
                                return;
                            }
                            if (a2.d() && n8 == 0) {
                                int n13 = mda3.l() - mda3.f();
                                int n14 = mda2.l() - mda2.f();
                                rda rda6 = a2;
                                n7 = n14 + rda6.l() * lqa.s / ySa.T;
                                int n15 = n13 + n7;
                                n6 = rda6.l() - n15;
                                if (n6 < 0) {
                                    n6 = uSa.E;
                                }
                                if (n6 < a2.J()) {
                                    n5 += 2;
                                    a2.J(n6);
                                }
                            }
                            Map map2 = kGa.J((Mda)mda2);
                            Iterator iterator = map2.keySet().iterator();
                            while (iterator.hasNext()) {
                                int n16;
                                int n17;
                                int n18;
                                block28: {
                                    n7 = (Integer)iterator.next();
                                    wga wga2 = wga.J((int)n7);
                                    if (wga2 == null) continue;
                                    n6 = map.containsKey(n7) ? (Integer)map.get(n7) : uSa.E;
                                    n18 = n6 == (n18 = ((Integer)map2.get(n7)).intValue()) ? ++n18 : Math.max(n18, n6);
                                    int n19 = wga2.J(mda3);
                                    if (rda2.k.h.f() || mda3.J() == Gea.ha) {
                                        n19 = vRa.d;
                                    }
                                    Iterator iterator2 = map.keySet().iterator();
                                    while (iterator2.hasNext()) {
                                        n17 = (Integer)iterator2.next();
                                        if (n17 == n7 || wga2.J(wga.J((int)n17))) continue;
                                        ++n5;
                                        n19 = uSa.E;
                                    }
                                    if (n19 == 0) continue;
                                    if (n18 > wga2.f()) {
                                        n18 = wga2.f();
                                    }
                                    map.put(n7, n18);
                                    n17 = uSa.E;
                                    switch (wga2.J()) {
                                        case 1: {
                                            n17 = Yqa.i;
                                            n16 = n8;
                                            break block28;
                                        }
                                        case 2: {
                                            n17 = AQa.P;
                                        }
                                        default: {
                                            break;
                                        }
                                        case 5: {
                                            n17 = uqa.g;
                                            n16 = n8;
                                            break block28;
                                        }
                                        case 10: {
                                            n17 = vRa.d;
                                        }
                                    }
                                    n16 = n8;
                                }
                                if (n16 != 0) {
                                    n17 = Math.max(vRa.d, n17 / uqa.g);
                                }
                                n5 += n17 * n18;
                            }
                        }
                        rda4 = rda2;
                    }
                    if (!StringUtils.isBlank(rda4.I)) break block29;
                    if (!mda3.l()) break block30;
                    n3 = vRa.d;
                    n5 += n3;
                    rda3 = rda2;
                    a2.J();
                    break block31;
                }
                if (!rda2.I.equals(mda3.J())) {
                    n3 = vRa.d;
                    n5 += n3;
                    a2.J(rda2.I);
                }
            }
            rda3 = rda2;
        }
        rda3.j = n4 + n5;
        if (n5 <= 0) {
            a2 = null;
        }
        if (n3 == n5 && n3 > 0 && rda2.j >= wra.P) {
            rda2.j = CRa.L;
        }
        if (rda2.j >= wra.P && !rda2.k.h.f()) {
            a2 = null;
        }
        if (a2 != null) {
            n2 = a2.d();
            if (mda2 != null && n2 < mda2.d()) {
                n2 = mda2.d();
            }
            n2 = n2 * uqa.g + vRa.d;
            rda rda7 = a2;
            rda7.f(n2);
            kGa.J((Map)map, (Mda)rda7);
        }
        rda rda8 = rda2;
        rda8.A.J(uSa.E, (Mda)a2);
        rda8.J();
    }

    public static /* synthetic */ HA J(rda a2) {
        return a2.M;
    }

    /*
     * Unable to fully structure code
     */
    public void J(String var1_1) {
        var2_2 = this;
        var2_2.I = a;
        if (var2_2.C) {
            return;
        }
        if (!var2_2.J(uqa.g).J()) ** GOTO lbl13
        b = var2_2.J(uqa.g).J();
        if (StringUtils.isBlank((CharSequence)a)) {
            v0 = var2_2;
            b.J();
        } else {
            b.J(var2_2.I);
lbl13:
            // 2 sources

            v0 = var2_2;
        }
        v0.l();
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        int c2 = n3;
        rda a2 = this;
        if (b2 == false) {
            a2.j = c2;
        }
        if (b2 == vRa.d) {
            a2.C = c2 == vRa.d ? vRa.d : uSa.E;
        }
    }

    public boolean J(Sx sx2) {
        rda a2;
        Object b2 = sx2;
        rda rda2 = a2 = this;
        if (rda2.J.J(rda2.E).J() != QFa.Sb) {
            return uSa.E != 0;
        }
        if (b2.f((double)a2.E.getX() + kTa.B, (double)a2.E.getY() + kTa.B, (double)a2.E.getZ() + kTa.B) <= ypa.X) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public rda(kea kea2, Gg gg2, Sx sx2) {
        void b2;
        void c2;
        Object d2 = sx2;
        rda a2 = this;
        a2((kea)c2, (Gg)b2, XF.ORIGIN, (Sx)((Object)d2));
    }

    public void f(Bb bb2) {
        rda a2;
        rda b2 = bb2;
        rda rda2 = a2 = this;
        rda rda3 = b2;
        super.f((Bb)rda3);
        rda3.J(rda2, uSa.E, a2.j);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Sx sx2) {
        void a2;
        rda rda2;
        rda rda3 = rda2 = this;
        super.J((Sx)a2);
        if (!rda3.J.e) {
            int b2;
            int n2 = b2 = uSa.E;
            while (n2 < rda2.M.f()) {
                Mda mda2 = rda2.M.f(b2);
                if (mda2 != null) {
                    a2.J(mda2, uSa.E != 0);
                }
                n2 = ++b2;
            }
        }
    }
}

