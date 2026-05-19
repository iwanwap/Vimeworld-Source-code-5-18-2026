/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bsa
 *  Cra
 *  ERa
 *  HX
 *  Hda
 *  ISa
 *  JPa
 *  Lra
 *  NQa
 *  NTa
 *  QSa
 *  RQa
 *  SQa
 *  VQa
 *  XE
 *  XTa
 *  Ypa
 *  aqa
 *  bua
 *  cQa
 *  hTa
 *  iPa
 *  kba
 *  lqa
 *  mra
 *  oqa
 *  pPa
 *  pqa
 *  pua
 *  uQa
 *  uRa
 *  vPa
 *  vRa
 *  wOa
 *  wra
 *  zTa
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Qca {
    public static final String b = "-0+3-4+13";
    public static final String l = "+0-1+2+3+13&4-4";
    private static final Map e;
    public static final String G = "-0-1+2-3&4-4+13";
    public static final String D;
    public static final String f = "+0-1+2-3&4-4+13";
    public static final String F = "-5+6-7";
    private static final Map g;
    private static final String L = "CL_00000078";
    public static final String E = "+0+1-2-3&4-4+13";
    public static final String m = "+5-6-7";
    public static final String C = "+14&13-13";
    private static final String[] i;
    public static final String M = "+0-1-2+3&4-4+13";
    public static final String k = "+0+1-2+3&4-4+13";
    public static final String j = "+0-1-2-3&4-4+13";
    public static final String J = "-0+1-2-3&4-4+13";
    public static final String A = "-0+1+2-3+13&4-4";
    private static final Map I;

    private static int f(int n2, int n3) {
        int a2 = n2;
        int b2 = n3;
        if (Qca.J(a2, b2)) {
            return vRa.d;
        }
        return uSa.E;
    }

    public static int J(Collection collection) {
        Collection collection2 = collection;
        int n2 = rua.e;
        if (collection2 != null && !collection2.isEmpty()) {
            float f2 = JPa.N;
            float f3 = JPa.N;
            float f4 = JPa.N;
            float a2 = JPa.N;
            for (kba kba2 : collection2) {
                if (!kba2.J()) continue;
                int n3 = Hda.A[kba2.f()].l();
                if (Config.Fa()) {
                    n3 = XE.J((int)kba2.f(), (int)n3);
                }
                int n4 = uSa.E;
                while (n4 <= kba2.J()) {
                    int n5;
                    f2 += (float)(n3 >> ERa.C & osa.Ja) / NQa.Y;
                    f3 += (float)(n3 >> Yqa.i & osa.Ja) / NQa.Y;
                    f4 += (float)(n3 >> uSa.E & osa.Ja) / NQa.Y;
                    a2 += pqa.r;
                    n4 = ++n5;
                }
            }
            if (a2 == JPa.N) {
                return uSa.E;
            }
            f2 = f2 / a2 * NQa.Y;
            f3 = f3 / a2 * NQa.Y;
            f4 = f4 / a2 * NQa.Y;
            return (int)f2 << ERa.C | (int)f3 << Yqa.i | (int)f4;
        }
        if (Config.Fa()) {
            n2 = XE.J((int)uSa.E, (int)n2);
        }
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    private static int J(boolean bl, boolean bl2, boolean bl3, int n2, int n3, int n4, int n5) {
        void g2;
        void e2;
        void v0;
        block3: {
            void f2;
            block7: {
                void c2;
                void a2;
                block4: {
                    void d2;
                    block6: {
                        block5: {
                            block2: {
                                boolean bl4 = bl;
                                int g2 = uSa.E;
                                if (!bl4) break block2;
                                g2 = Qca.J((int)a2, (int)c2);
                                v0 = f2;
                                break block3;
                            }
                            if (d2 == pua.o) break block4;
                            if (d2 != false || Qca.f((int)a2) != c2) break block5;
                            int g2 = vRa.d;
                            v0 = f2;
                            break block3;
                        }
                        if (d2 != vRa.d || Qca.f((int)a2) <= c2) break block6;
                        int g2 = vRa.d;
                        v0 = f2;
                        break block3;
                    }
                    if (d2 != uqa.g || Qca.f((int)a2) >= c2) break block7;
                    int g2 = vRa.d;
                    v0 = f2;
                    break block3;
                }
                int g2 = Qca.f((int)a2, (int)c2);
            }
            v0 = f2;
        }
        if (v0 != false) {
            void b2;
            void g2;
            g2 = g2 * b2;
        }
        if (e2 != false) {
            void g2;
            g2 = g2 * pua.o;
        }
        return (int)g2;
    }

    public static void J() {
        e.clear();
    }

    static {
        D = null;
        I = Maps.newHashMap();
        g = Maps.newHashMap();
        e = Maps.newHashMap();
        String[] stringArray = new String[fPa.i];
        stringArray[uSa.E] = bua.y;
        stringArray[vRa.d] = uRa.t;
        stringArray[uqa.g] = yta.D;
        stringArray[yRa.d] = xra.Ha;
        stringArray[AQa.P] = Iqa.z;
        stringArray[tTa.h] = MTa.V;
        stringArray[uua.p] = dua.S;
        stringArray[XTa.W] = lqa.g;
        stringArray[Yqa.i] = ypa.Aa;
        stringArray[WOa.fa] = sOa.ja;
        stringArray[NTa.C] = ATa.ia;
        stringArray[pPa.f] = rta.j;
        stringArray[lqa.s] = nua.L;
        stringArray[uua.s] = Yqa.I;
        stringArray[hpa.Z] = Hra.Ia;
        stringArray[Ypa.A] = DPa.K;
        stringArray[ERa.C] = ATa.k;
        stringArray[yta.Ka] = Mqa.fa;
        stringArray[yOa.B] = Eqa.C;
        stringArray[wOa.t] = VQa.v;
        stringArray[kTa.j] = hpa.J;
        stringArray[wOa.h] = Cra.T;
        stringArray[cQa.o] = uQa.fa;
        stringArray[AQa.ba] = ITa.G;
        stringArray[osa.c] = zTa.j;
        stringArray[kTa.g] = Eqa.G;
        stringArray[ITa.E] = xSa.Z;
        stringArray[Lra.e] = FRa.f;
        stringArray[EPa.O] = vPa.O;
        stringArray[ITa.A] = SQa.Fa;
        stringArray[Fsa.d] = oqa.d;
        stringArray[tua.U] = aqa.T;
        i = stringArray;
        I.put(Hda.t.J(), mra.z);
        I.put(Hda.o.J(), iPa.B);
        I.put(Hda.G.J(), hTa.M);
        I.put(Hda.W.J(), tpa.E);
        I.put(Hda.c.J(), Bsa.t);
        I.put(Hda.Q.J(), eta.L);
        I.put(Hda.q.J(), QTa.R);
        I.put(Hda.N.J(), RQa.Y);
        I.put(Hda.l.J(), bsa.f);
        I.put(Hda.w.J(), EPa.c);
        I.put(Hda.k.J(), fqa.d);
        I.put(Hda.E.J(), JPa.f);
        I.put(Hda.e.J(), vTa.A);
        g.put(Hda.o.J(), XOa.U);
        g.put(Hda.f.J(), XOa.U);
        g.put(Hda.l.J(), XOa.U);
        g.put(Hda.t.J(), XOa.U);
        g.put(Hda.q.J(), XOa.U);
        g.put(Hda.W.J(), XOa.U);
        g.put(Hda.u.J(), XOa.U);
        g.put(Hda.c.J(), XOa.U);
        g.put(Hda.e.J(), XOa.U);
    }

    /*
     * WARNING - void declaration
     */
    public static int J(int n2, String string) {
        void a2;
        int n3 = n2;
        int n4 = uSa.E;
        int n5 = a2.length();
        int n6 = uSa.E;
        int n7 = uSa.E;
        int n8 = uSa.E;
        int n9 = uSa.E;
        int b2 = uSa.E;
        int n10 = n4 = n4;
        while (n10 < n5) {
            char c2 = a2.charAt(n4);
            if (c2 >= QSa.p && c2 <= KSa.x) {
                b2 *= NTa.C;
                b2 += c2 - QSa.p;
                n6 = vRa.d;
            } else if (c2 == Zqa.G) {
                if (n6 != 0) {
                    n3 = Qca.J(n3, b2, n8 != 0, n7 != 0, n9 != 0);
                    n9 = uSa.E;
                    n7 = uSa.E;
                    n8 = uSa.E;
                    n6 = uSa.E;
                    b2 = uSa.E;
                }
                n7 = vRa.d;
            } else if (c2 == wra.e) {
                if (n6 != 0) {
                    n3 = Qca.J(n3, b2, n8 != 0, n7 != 0, n9 != 0);
                    n9 = uSa.E;
                    n7 = uSa.E;
                    n8 = uSa.E;
                    n6 = uSa.E;
                    b2 = uSa.E;
                }
                n8 = vRa.d;
            } else if (c2 == iSa.x) {
                if (n6 != 0) {
                    n3 = Qca.J(n3, b2, n8 != 0, n7 != 0, n9 != 0);
                    n9 = uSa.E;
                    n7 = uSa.E;
                    n8 = uSa.E;
                    n6 = uSa.E;
                    b2 = uSa.E;
                }
            } else if (c2 == ISa.E) {
                if (n6 != 0) {
                    n3 = Qca.J(n3, b2, n8 != 0, n7 != 0, n9 != 0);
                    n9 = uSa.E;
                    n7 = uSa.E;
                    n8 = uSa.E;
                    n6 = uSa.E;
                    b2 = uSa.E;
                }
                n9 = vRa.d;
            }
            n10 = ++n4;
        }
        if (n6 != 0) {
            n3 = Qca.J(n3, b2, n8 != 0, n7 != 0, n9 != 0);
        }
        return n3 & BQa.h;
    }

    /*
     * WARNING - void declaration
     */
    public static List J(int n2, boolean bl) {
        int n3;
        int n4 = n2;
        ArrayList<Hda> arrayList = null;
        Hda[] hdaArray = Hda.A;
        int n5 = Hda.A.length;
        int n6 = n3 = uSa.E;
        while (n6 < n5) {
            String b22;
            void a2;
            Hda hda = hdaArray[n3];
            if (!(hda == null || hda.J() && a2 == false || (b22 = (String)I.get(hda.J())) == null)) {
                String string = b22;
                int b22 = Qca.J(string, uSa.E, string.length(), n4);
                if (b22 > 0) {
                    ArrayList<Hda> arrayList2;
                    int n7 = uSa.E;
                    String string2 = (String)g.get(hda.J());
                    if (string2 != null) {
                        String string3 = string2;
                        n7 = Qca.J(string3, uSa.E, string3.length(), n4);
                        if (n7 < 0) {
                            n7 = uSa.E;
                        }
                    }
                    if (hda.l()) {
                        b22 = vRa.d;
                        arrayList2 = arrayList;
                    } else {
                        b22 = PRa.ga * (b22 * yRa.d + (b22 - vRa.d) * uqa.g);
                        b22 >>= n7;
                        b22 = (int)Math.round((double)b22 * hda.J());
                        if ((n4 & qQa.O) != 0) {
                            b22 = (int)Math.round((double)b22 * Bsa.x + kTa.B);
                        }
                        arrayList2 = arrayList;
                    }
                    if (arrayList2 == null) {
                        arrayList = Lists.newArrayList();
                    }
                    hda = new kba(hda.J(), b22, n7);
                    if ((n4 & qQa.O) != 0) {
                        hda.f(vRa.d != 0);
                    }
                    arrayList.add(hda);
                }
            }
            n6 = ++n3;
        }
        return arrayList;
    }

    public Qca() {
        Qca a2;
    }

    private static int f(int n2) {
        int n3 = n2;
        int a2 = uSa.E;
        int n4 = n3;
        while (n4 > 0) {
            int n5 = n3;
            ++a2;
            n4 = n3 = n5 & n5 - vRa.d;
        }
        return a2;
    }

    private static int J(int n2, int n3) {
        int a2 = n2;
        int b2 = n3;
        if (Qca.J(a2, b2)) {
            return uSa.E;
        }
        return vRa.d;
    }

    public static String J(int n2) {
        int n3 = n2;
        int a2 = Qca.J(n3);
        return i[a2];
    }

    /*
     * WARNING - void declaration
     */
    private static int J(int n2, int n3, boolean bl, boolean bl2, boolean bl3) {
        void a2;
        int e2 = n3;
        int d2 = n2;
        if (a2 != false) {
            if (!Qca.J(d2, e2)) {
                return uSa.E;
            }
        } else {
            void b2;
            void c2;
            if (c2 != false) {
                return d2 &= vRa.d << e2 ^ pua.o;
            }
            if (b2 != false) {
                int n4 = d2;
                if ((d2 & vRa.d << e2) == 0) {
                    d2 = n4 | vRa.d << e2;
                    return d2;
                }
                d2 = n4 & (vRa.d << e2 ^ pua.o);
                return d2;
            }
            d2 |= vRa.d << e2;
        }
        return d2;
    }

    public static int J(int a2) {
        return Qca.J(a2, tTa.h, AQa.P, yRa.d, uqa.g, vRa.d);
    }

    /*
     * WARNING - void declaration
     */
    private static int J(String string, int n2, int n3, int n4) {
        void b2;
        void c2;
        String string2 = string;
        if (c2 < string2.length() && b2 >= 0 && c2 < b2) {
            void a2;
            int d2 = string2.indexOf(cPa.Ea, (int)c2);
            if (d2 >= 0 && d2 < b2) {
                int n5 = Qca.J(string2, (int)c2, d2 - vRa.d, (int)a2);
                if (n5 > 0) {
                    return n5;
                }
                int n6 = Qca.J(string2, d2 + vRa.d, (int)b2, (int)a2);
                if (n6 > 0) {
                    return n6;
                }
                return uSa.E;
            }
            int n7 = string2.indexOf(ISa.E, (int)c2);
            if (n7 >= 0 && n7 < b2) {
                int n8 = Qca.J(string2, (int)c2, n7 - vRa.d, (int)a2);
                if (n8 <= 0) {
                    return uSa.E;
                }
                d2 = Qca.J(string2, n7 + vRa.d, (int)b2, (int)a2);
                if (d2 <= 0) {
                    return uSa.E;
                }
                if (n8 > d2) {
                    return n8;
                }
                return d2;
            }
            int n9 = uSa.E;
            d2 = uSa.E;
            n7 = uSa.E;
            int n10 = uSa.E;
            int n11 = uSa.E;
            int n12 = pua.o;
            int n13 = uSa.E;
            int n14 = uSa.E;
            int n15 = uSa.E;
            void v0 = c2 = c2;
            while (v0 < b2) {
                char c3 = string2.charAt((int)c2);
                if (c3 >= QSa.p && c3 <= KSa.x) {
                    if (n9 != 0) {
                        n14 = c3 - QSa.p;
                        d2 = vRa.d;
                    } else {
                        n13 *= NTa.C;
                        n13 += c3 - QSa.p;
                        n7 = vRa.d;
                    }
                } else if (c3 == cQa.i) {
                    n9 = vRa.d;
                } else if (c3 == Zqa.G) {
                    if (n7 != 0) {
                        n15 += Qca.J(n10 != 0, d2 != 0, n11 != 0, n12, n13, n14, (int)a2);
                        n10 = uSa.E;
                        n11 = uSa.E;
                        n9 = uSa.E;
                        d2 = uSa.E;
                        n7 = uSa.E;
                        n14 = uSa.E;
                        n13 = uSa.E;
                        n12 = pua.o;
                    }
                    n10 = vRa.d;
                } else if (c3 == wra.e) {
                    if (n7 != 0) {
                        n15 += Qca.J(n10 != 0, d2 != 0, n11 != 0, n12, n13, n14, (int)a2);
                        n10 = uSa.E;
                        n11 = uSa.E;
                        n9 = uSa.E;
                        d2 = uSa.E;
                        n7 = uSa.E;
                        n14 = uSa.E;
                        n13 = uSa.E;
                        n12 = pua.o;
                    }
                    n11 = vRa.d;
                } else if (c3 != tua.w && c3 != Psa.M && c3 != ITa.V) {
                    if (c3 == iSa.x && n7 != 0) {
                        n15 += Qca.J(n10 != 0, d2 != 0, n11 != 0, n12, n13, n14, (int)a2);
                        n10 = uSa.E;
                        n11 = uSa.E;
                        n9 = uSa.E;
                        d2 = uSa.E;
                        n7 = uSa.E;
                        n14 = uSa.E;
                        n13 = uSa.E;
                        n12 = pua.o;
                    }
                } else {
                    if (n7 != 0) {
                        n15 += Qca.J(n10 != 0, d2 != 0, n11 != 0, n12, n13, n14, (int)a2);
                        n10 = uSa.E;
                        n11 = uSa.E;
                        n9 = uSa.E;
                        d2 = uSa.E;
                        n7 = uSa.E;
                        n14 = uSa.E;
                        n13 = uSa.E;
                        n12 = pua.o;
                    }
                    if (c3 == tua.w) {
                        n12 = uSa.E;
                    } else if (c3 == Psa.M) {
                        n12 = uqa.g;
                    } else if (c3 == ITa.V) {
                        n12 = vRa.d;
                    }
                }
                v0 = ++c2;
            }
            if (n7 != 0) {
                n15 += Qca.J(n10 != 0, d2 != 0, n11 != 0, n12, n13, n14, (int)a2);
            }
            return n15;
        }
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public static int J(int n2, int n3, int n4, int n5, int n6, int n7) {
        int f2;
        void b2;
        void c2;
        void d2;
        int n8;
        int n9;
        void e2;
        int n10 = n2;
        n2 = n7;
        int a2 = n10;
        if (Qca.J(a2, (int)e2)) {
            n9 = ERa.C;
            n8 = a2;
        } else {
            n9 = uSa.E;
            n8 = a2;
        }
        return n9 | (Qca.J(n8, (int)d2) ? Yqa.i : uSa.E) | (Qca.J(a2, (int)c2) ? AQa.P : uSa.E) | (Qca.J(a2, (int)b2) ? uqa.g : uSa.E) | (Qca.J(a2, f2) ? vRa.d : uSa.E);
    }

    public static boolean J(Collection collection) {
        Collection collection2 = collection;
        Iterator a2 = collection2.iterator();
        while (a2.hasNext()) {
            if (((kba)a2.next()).f()) continue;
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    public static boolean J(int n2, int n3) {
        int a2 = n2;
        int b2 = n3;
        if ((a2 & vRa.d << b2) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static int J(int n2, boolean bl) {
        int a2;
        int n3 = n2;
        Integer b2 = HX.J((int)n3);
        if (a2 == 0) {
            if (e.containsKey(b2)) {
                return (Integer)e.get(b2);
            }
            a2 = Qca.J(Qca.J((int)b2, uSa.E != 0));
            e.put(b2, a2);
            return a2;
        }
        return Qca.J(Qca.J((int)b2, vRa.d != 0));
    }
}

