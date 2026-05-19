/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 *  HGa
 *  JPa
 *  LGa
 *  MQa
 *  Mda
 *  NCa
 *  Nha
 *  THa
 *  Waa
 *  Ypa
 *  dZ
 *  eAa
 *  ed
 *  gZ
 *  pqa
 *  qIa
 *  vL
 *  vRa
 *  vpa
 *  waa
 *  wga
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class kGa_3 {
    private static final qIa k;
    private static final Random j;
    private static final Nha J;
    private static final THa A;
    private static final pHa I;

    /*
     * WARNING - void declaration
     */
    private static void J(ed ed2, Mda[] mdaArray) {
        int b2;
        void a2;
        ed ed3 = ed2;
        int n2 = ((void)a2).length;
        int n3 = b2 = uSa.E;
        while (n3 < n2) {
            void var4_5 = a2[b2];
            kGa_3.J(ed3, (Mda)var4_5);
            n3 = ++b2;
        }
    }

    public static int J(Mda[] mdaArray, gZ gZ2) {
        gZ b2 = gZ2;
        Mda[] a2 = mdaArray;
        kGa_3.A.A = uSa.E;
        kGa_3.A.I = b2;
        kGa_3.J((ed)A, a2);
        if (kGa_3.A.A > kTa.g) {
            kGa_3.A.A = kTa.g;
        } else if (kGa_3.A.A < 0) {
            kGa_3.A.A = uSa.E;
        }
        return (kGa_3.A.A + vRa.d >> vRa.d) + j.nextInt((kGa_3.A.A >> vRa.d) + vRa.d);
    }

    static {
        j = new Random();
        A = new THa(null);
        J = new Nha(null);
        k = new qIa(null);
        I = new pHa(null);
    }

    public static Map<Integer, Integer> J(Mda mda2) {
        waa waa2;
        Mda mda3 = mda2;
        LinkedHashMap<Integer, Integer> linkedHashMap = Maps.newLinkedHashMap();
        waa waa3 = waa2 = mda3.J() == Gea.ha ? Gea.ha.J(mda3) : mda3.J();
        if (waa2 != null) {
            int a2;
            int n2 = a2 = uSa.E;
            while (n2 < waa2.J()) {
                waa waa4 = waa2;
                short s2 = waa4.J(a2).J(QTa.O);
                short s3 = waa4.J(a2).J(Jra.ca);
                linkedHashMap.put(Integer.valueOf(s2), Integer.valueOf(s3));
                n2 = ++a2;
            }
        }
        return linkedHashMap;
    }

    public static List<HGa> J(Random random, Mda mda2, int n2) {
        Object object;
        int a2;
        Map<Integer, HGa> b2;
        Random random2 = random;
        int c322 = b2.J().J();
        if (c322 <= 0) {
            return null;
        }
        c322 /= uqa.g;
        c322 = vRa.d + random2.nextInt((c322 >> vRa.d) + vRa.d) + random2.nextInt((c322 >> vRa.d) + vRa.d);
        a2 = c322 + a2;
        float c322 = (random2.nextFloat() + random2.nextFloat() - pqa.r) * VPa.i;
        if ((a2 = (int)((float)a2 * (pqa.r + c322) + MQa.L)) < vRa.d) {
            a2 = vRa.d;
        }
        ArrayList<Object> c322 = null;
        if ((b2 = kGa_3.J(a2, (Mda)b2)) != null && !b2.isEmpty() && (object = (HGa)dZ.J((Random)random2, b2.values())) != null) {
            c322 = Lists.newArrayList();
            Random random3 = random2;
            c322.add(object);
            while (random3.nextInt(vpa.o) <= a2) {
                Integer n3;
                object = b2.keySet().iterator();
                while (object.hasNext()) {
                    int n4;
                    block7: {
                        n3 = (Integer)object.next();
                        int n5 = vRa.d;
                        Iterator iterator = c322.iterator();
                        while (iterator.hasNext()) {
                            if (((HGa)iterator.next()).A.J(wga.J((int)n3))) continue;
                            n4 = n5 = uSa.E;
                            break block7;
                        }
                        n4 = n5;
                    }
                    if (n4 != 0) continue;
                    object.remove();
                }
                if (!b2.isEmpty()) {
                    n3 = (HGa)dZ.J((Random)random2, b2.values());
                    c322.add(n3);
                }
                a2 >>= vRa.d;
                random3 = random2;
            }
        }
        return c322;
    }

    public static void J(Map<Integer, Integer> map, Mda mda2) {
        Mda b2 = mda2;
        Map<Integer, Integer> a2 = map;
        waa waa2 = new waa();
        for (int n2 : a2.keySet()) {
            wga wga2 = wga.J((int)n2);
            if (wga2 == null) continue;
            Waa waa3 = new Waa();
            waa3.J(QTa.O, (short)n2);
            waa3.J(Jra.ca, (short)a2.get(n2).intValue());
            waa2.J((NCa)waa3);
            if (b2.J() != Gea.ha) continue;
            Gea.ha.J(b2, new HGa(wga2, a2.get(n2).intValue()));
        }
        if (waa2.J() > 0) {
            if (b2.J() != Gea.ha) {
                b2.J(Nta.ga, (NCa)waa2);
                return;
            }
        } else if (b2.M()) {
            b2.J().J(Nta.ga);
        }
    }

    public static boolean f(Gl a2) {
        if (kGa_3.J(wga.W.I, a2.J()) > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static int M(Gl a2) {
        return kGa_3.J(wga.c.I, a2.J());
    }

    /*
     * WARNING - void declaration
     */
    public static int J(Random random, int n2, int n3, Mda mda2) {
        void c2;
        int b2;
        Random d22 = mda2;
        Random a2 = random;
        if (d22.J().J() <= 0) {
            return uSa.E;
        }
        if (b2 > Ypa.A) {
            b2 = Ypa.A;
        }
        int d22 = a2.nextInt(Yqa.i) + vRa.d + (b2 >> vRa.d) + a2.nextInt(b2 + vRa.d);
        if (c2 == false) {
            return Math.max(d22 / yRa.d, vRa.d);
        }
        if (c2 == vRa.d) {
            return d22 * uqa.g / yRa.d + vRa.d;
        }
        return Math.max(d22, b2 * uqa.g);
    }

    public static Map<Integer, HGa> J(int n2, Mda mda2) {
        int n3;
        eAa a2;
        int n4 = n2;
        void v0 = a2;
        a2 = v0.J();
        HashMap<Integer, HGa> hashMap = null;
        int n5 = v0.J() == Gea.Qa ? vRa.d : uSa.E;
        wga[] wgaArray = wga.J;
        int n6 = wga.J.length;
        int n7 = n3 = uSa.E;
        while (n7 < n6) {
            wga b2 = wgaArray[n3];
            if (b2 != null && (b2.e.canEnchantItem(a2) || n5 != 0)) {
                int n8 = b2.l();
                while (n8 <= b2.f()) {
                    int n9;
                    if (n4 >= b2.J(n9) && n4 <= b2.f(n9)) {
                        if (hashMap == null) {
                            hashMap = Maps.newHashMap();
                        }
                        hashMap.put(b2.I, new HGa(b2, n9));
                    }
                    n8 = ++n9;
                }
            }
            n7 = ++n3;
        }
        return hashMap;
    }

    public static int e(Gl a2) {
        return kGa_3.J(wga.G.I, a2.J());
    }

    public static int f(vL a2) {
        return kGa_3.J(wga.B.I, a2.J());
    }

    public static boolean J(Gl a2) {
        if (kGa_3.J(wga.m.I, a2.J()) > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static int d(Gl a2) {
        return kGa_3.J(wga.K.I, a2.J());
    }

    public static int C(Gl a2) {
        return kGa_3.J(wga.H.I, a2.J());
    }

    public static int l(Gl a2) {
        return kGa_3.J(wga.q.I, a2.J());
    }

    public static int f(Gl a2) {
        return kGa_3.J(wga.F.I, a2.J());
    }

    public static void f(Gl gl2, vL vL2) {
        Gl a2;
        Gl b2 = vL2;
        kGa_3.I.A = a2 = gl2;
        kGa_3.I.I = b2;
        if (a2 != null) {
            kGa_3.J((ed)I, a2.J());
        }
        if (a2 instanceof Sx) {
            kGa_3.J((ed)I, a2.J());
        }
    }

    public kGa_3() {
        kGa_3 a2;
    }

    private static void J(ed ed2, Mda mda2) {
        ed b2 = mda2;
        ed a2 = ed2;
        if (b2 != null && (b2 = b2.J()) != null) {
            int n2;
            int n3 = n2 = uSa.E;
            while (n3 < b2.J()) {
                ed ed3 = b2;
                short s2 = ed3.J(n2).J(QTa.O);
                short s3 = ed3.J(n2).J(Jra.ca);
                if (wga.J((int)s2) != null) {
                    a2.J(wga.J((int)s2), (int)s3);
                }
                n3 = ++n2;
            }
        }
    }

    public static Mda J(wga wga2, Gl gl2) {
        int b2;
        Mda[] a2;
        wga wga3 = wga2;
        a2 = a2.J();
        int n2 = a2.length;
        int n3 = b2 = uSa.E;
        while (n3 < n2) {
            Mda mda2 = a2[b2];
            if (mda2 != null && kGa_3.J(wga3.I, mda2) > 0) {
                return mda2;
            }
            n3 = ++b2;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static Mda J(Random random, Mda mda2, int n2) {
        int n3;
        void b2;
        int c22 = n2;
        Random a2 = random;
        Object c22 = kGa_3.J(a2, (Mda)b2, c22);
        int n4 = n3 = b2.J() == Gea.Qa ? vRa.d : uSa.E;
        if (n3 != 0) {
            b2.J((eAa)Gea.ha);
        }
        if (c22 != null) {
            c22 = c22.iterator();
            while (c22.hasNext()) {
                HGa hGa2 = (HGa)c22.next();
                if (n3 != 0) {
                    Gea.ha.J((Mda)b2, hGa2);
                    continue;
                }
                HGa hGa3 = hGa2;
                b2.J(hGa3.A, hGa3.I);
            }
        }
        return b2;
    }

    public static void J(Gl gl2, vL vL2) {
        Gl b2 = vL2;
        Gl a2 = gl2;
        kGa_3.k.A = b2;
        kGa_3.k.I = a2;
        if (a2 != null) {
            kGa_3.J((ed)k, a2.J());
        }
        if (b2 instanceof Sx) {
            kGa_3.J((ed)k, a2.J());
        }
    }

    /*
     * WARNING - void declaration
     */
    public static int J(int n2, Mda[] mdaArray) {
        int n3;
        void a2;
        int n4 = n2;
        if (a2 == null) {
            return uSa.E;
        }
        int n5 = uSa.E;
        int n6 = ((void)a2).length;
        int n7 = n3 = uSa.E;
        while (n7 < n6) {
            void b22 = a2[n3];
            int b22 = kGa_3.J(n4, (Mda)b22);
            if (b22 > n5) {
                n5 = b22;
            }
            n7 = ++n3;
        }
        return n5;
    }

    public static int J(int n2, Mda mda2) {
        int n3;
        Mda b2 = mda2;
        int a2 = n2;
        if (b2 == null) {
            return uSa.E;
        }
        if ((b2 = b2.J()) == null) {
            return uSa.E;
        }
        int n4 = n3 = uSa.E;
        while (n4 < b2.J()) {
            Mda mda3 = b2;
            short s2 = mda3.J(n3).J(QTa.O);
            short s3 = mda3.J(n3).J(Jra.ca);
            if (s2 == a2) {
                return s3;
            }
            n4 = ++n3;
        }
        return uSa.E;
    }

    public static float J(Mda mda2, LGa lGa) {
        Mda b2 = lGa;
        Mda a2 = mda2;
        kGa_3.J.A = JPa.N;
        kGa_3.J.I = b2;
        kGa_3.J((ed)J, a2);
        return kGa_3.J.A;
    }

    public static int J(Gl a2) {
        return kGa_3.J(wga.g.I, a2.J());
    }

    public static int J(vL a2) {
        return kGa_3.J(wga.a.I, a2.J());
    }
}

