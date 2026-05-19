/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cia
 *  EC
 *  Gua
 *  HB
 *  KA
 *  Kna
 *  NTa
 *  Nc
 *  RB
 *  UC
 *  Usa
 *  VQa
 *  Vua
 *  XTa
 *  ZOa
 *  aPa
 *  ac
 *  asa
 *  cg
 *  cra
 *  dd
 *  dpa
 *  pPa
 *  pua
 *  vRa
 *  wOa
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class bB
extends HB {
    private boolean g;
    public static final String L = "<profile>";
    private int E;
    private String m;
    public static final String C = "<empty>";
    private String i;
    private EC M;
    public static final String k = "*";
    public String j;
    private int J;
    private long A;
    private Cia I;

    /*
     * WARNING - void declaration
     */
    public void J(ac ac2) {
        void a2;
        bB bB2 = this;
        if (a2.J) {
            RB[] rBArray;
            if (a2.C < ZOa.x && a2 instanceof dd) {
                bB bB3;
                rBArray = (RB[])a2;
                bB b2 = rBArray.J();
                if (b2 instanceof UC) {
                    String string = b2.e();
                    bB bB4 = bB2;
                    bB bB5 = new bB((EC)bB4, bB4.I, string);
                    bB2.g.J((EC)bB5);
                    return;
                }
                if (bB.l()) {
                    bB3 = bB2;
                    b2.f();
                } else {
                    b2.J();
                    bB3 = bB2;
                }
                bB3.J();
                bB2.g = vRa.d;
            }
            if (a2.C == Tqa.K) {
                int b2;
                rBArray = pA.J(pA.J());
                int n2 = b2 = uSa.E;
                while (n2 < rBArray.length) {
                    RB rB2 = rBArray[b2];
                    rB2.f();
                    bB2.g = vRa.d;
                    n2 = ++b2;
                }
                bB2.J();
            }
            if (a2.C == ZOa.x) {
                if (bB2.g) {
                    pA.B();
                    bB2.g = uSa.E;
                    pA.J();
                }
                bB bB6 = bB2;
                bB6.g.J(bB6.M);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, int n3, List list) {
        int d222 = n2;
        bB c2 = this;
        int n4 = BQa.t;
        if (System.currentTimeMillis() >= c2.A + (long)n4) {
            String a2;
            void var5_9;
            int b2;
            bB bB2 = c2;
            n4 = (int)(bB2.A / uqa.g - Jpa.Ha);
            reference var5_8 = bB2.I / uua.p - XTa.W;
            if (b2 <= var5_8 + dpa.A) {
                var5_9 += 105;
            }
            int n5 = n4 + Jpa.Ha + Jpa.Ha;
            void var7_11 = var5_9 + Vua.J + NTa.C;
            String[] d222 = bB.J((List)((Object)a2), (int)d222, (int)b2);
            if (d222 instanceof dd) {
                d222 = ((dd)d222).J();
                if ((d222 = c2.J((RB)d222, n5 - n4)) == null) {
                    return;
                }
                c2.J(n4, (int)var5_9, n5, (int)var7_11, xua.q, xua.q);
                int n6 = b2 = uSa.E;
                while (n6 < d222.length) {
                    a2 = d222[b2];
                    n5 = Gta.d;
                    if (a2.endsWith(dqa.O)) {
                        n5 = rRa.F;
                    }
                    void v2 = var5_9 + tTa.h + b2 * pPa.f;
                    c2.L.J(a2, (float)(n4 + tTa.h), (float)v2, n5);
                    n6 = ++b2;
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private String[] J(int n2, List<String> list) {
        void a2;
        int n3;
        bB bB2 = this;
        Kna kna2 = Config.J().Ea;
        ArrayList<String> arrayList = new ArrayList<String>();
        int n4 = n3 = uSa.E;
        while (n4 < a2.size()) {
            Object c2 = (String)a2.get(n3);
            if (c2 != null && ((String)c2).length() > 0) {
                void b2;
                c2 = kna2.J((String)c2, (int)b2).iterator();
                Object object = c2;
                while (object.hasNext()) {
                    Object e2 = c2.next();
                    arrayList.add((String)e2);
                    object = c2;
                }
            }
            n4 = ++n3;
        }
        ArrayList<String> arrayList2 = arrayList;
        String[] stringArray = arrayList2.toArray(new String[arrayList2.size()]);
        return stringArray;
    }

    public void f(ac ac2) {
        bB b2 = ac2;
        bB a2 = this;
        if (b2 instanceof dd) {
            bB bB2;
            b2 = ((dd)b2).J();
            if (bB.l()) {
                bB2 = a2;
                b2.f();
            } else {
                b2.l();
                bB2 = a2;
            }
            bB2.J();
            a2.g = vRa.d;
        }
    }

    private void J() {
        bB bB2 = this;
        for (bB a2 : bB2.E) {
            if (!(a2 instanceof dd)) continue;
            RB rB2 = (a2 = (dd)a2).J();
            if (rB2 instanceof Nc) {
                ((Nc)rB2).d();
            }
            ((dd)a2).i = bB2.J(rB2, a2.J());
        }
    }

    /*
     * WARNING - void declaration
     */
    public bB(EC eC, Cia cia, String string) {
        void b2;
        void c2;
        Object d2 = string;
        bB a2 = this;
        a2((EC)c2, (Cia)b2);
        a2.i = d2;
        if (a2.i != null) {
            bB bB2 = a2;
            bB2.m = pA.J(asa.u + (String)d2, (String)d2);
        }
    }

    public void A() {
        bB bB2 = this;
        bB2.j = oha.J(wOa.p, new Object[uSa.E]);
        int n2 = ySa.T;
        int n3 = uSa.E;
        int n4 = Fsa.d;
        int n5 = kTa.j;
        bB bB3 = bB2;
        long cfr_ignored_0 = bB3.A - GPa.G;
        int n6 = sOa.D;
        int n7 = kTa.j;
        int a2 = uqa.g;
        RB[] rBArray = pA.J(bB3.i);
        if (rBArray != null) {
            int n8;
            if (rBArray.length > yOa.B) {
                a2 = rBArray.length / WOa.fa + vRa.d;
            }
            int n9 = n8 = uSa.E;
            while (n9 < rBArray.length) {
                RB rB2 = rBArray[n8];
                if (rB2 != null && rB2.l()) {
                    int n10 = n8 % a2;
                    int n11 = n8 / a2;
                    bB bB4 = bB2;
                    int n12 = Math.min((int)(bB2.A / a2), ZOa.x);
                    n3 = (int)((bB4.A - n12 * a2) / uqa.g);
                    n10 = n10 * n12 + tTa.h + n3;
                    n11 = n4 + n11 * n5;
                    String string = bB4.J(rB2, n12 -= NTa.C);
                    dd dd2 = new dd(n2 + n8, n10, n11, n12, n7, rB2, string);
                    new dd(n2 + n8, n10, n11, n12, n7, rB2, string).J = rB2.C();
                    bB4.E.add(dd2);
                }
                n9 = ++n8;
            }
        }
        bB2.E.add(new ac(Tqa.K, (int)(bB2.A / uqa.g - n6 - kTa.j), (int)(bB2.I / uua.p + tua.i + pPa.f), n6, n7, oha.J(zOa.U, new Object[uSa.E])));
        bB2.E.add(new ac(ZOa.x, (int)(bB2.A / uqa.g + kTa.j), (int)(bB2.I / uua.p + tua.i + pPa.f), n6, n7, oha.J(cra.g, new Object[uSa.E])));
    }

    public void M() {
        bB a2;
        bB bB2 = a2;
        super.M();
        if (bB2.g) {
            pA.B();
            a2.g = uSa.E;
            pA.J();
        }
    }

    /*
     * WARNING - void declaration
     */
    private String J(RB rB2, int n2) {
        String string;
        void a2;
        Kna kna2;
        String b2;
        bB bB2 = this;
        void v0 = b2;
        Object c2 = v0.l();
        if (v0 instanceof UC) {
            UC uC2 = (UC)b2;
            return new StringBuilder().insert(5 >> 3, (String)c2).append(Usa.E).toString();
        }
        Kna kna3 = kna2 = Config.J().Ea;
        Kna kna4 = kna3;
        int n3 = kna3.J(Xpa.E + Kg.f()) + tTa.h;
        while (kna4.J((String)c2) + n3 >= a2 && ((String)c2).length() > 0) {
            Object object = c2;
            c2 = ((String)object).substring(uSa.E, ((String)object).length() - vRa.d);
            kna4 = kna2;
        }
        if (b2.J()) {
            void v4 = b2;
            string = v4.f(v4.d());
        } else {
            string = Mqa.y;
        }
        String string2 = string;
        void v6 = b2;
        b2 = v6.J(v6.d());
        return new StringBuilder().insert(3 >> 2, (String)c2).append(Xpa.E).append(string2).append(b2).toString();
    }

    /*
     * WARNING - void declaration
     */
    public bB(EC eC, Cia cia) {
        void b2;
        bB a2;
        bB c2 = cia;
        bB bB2 = a2 = this;
        bB bB3 = a2;
        bB bB4 = a2;
        a2.J = uSa.E;
        a2.E = uSa.E;
        a2.A = nqa.i;
        bB4.i = null;
        bB3.m = null;
        bB4.g = uSa.E;
        bB3.j = gsa.B;
        bB2.M = b2;
        bB2.I = c2;
    }

    /*
     * WARNING - void declaration
     */
    private String[] J(RB rB2, int n2) {
        void a2;
        Object c2;
        void b2;
        bB bB2 = this;
        if (b2 instanceof Nc) {
            return null;
        }
        void v0 = b2;
        String string = v0.l();
        String[] stringArray = Config.J(v0.M()).trim();
        stringArray = bB2.J((String)stringArray);
        String string2 = null;
        if (!string.equals(b2.e()) && bB2.I.aa) {
            string2 = new StringBuilder().insert(2 & 5, aPa.C).append(Kg.J(Bta.a)).append(Xpa.E).append(b2.e()).toString();
        }
        String string3 = null;
        if (b2.f() != null && bB2.I.aa) {
            string3 = new StringBuilder().insert(3 >> 2, aPa.C).append(Kg.J(Zqa.P)).append(Xpa.E).append(Config.J(b2.f())).toString();
        }
        String string4 = null;
        if (b2.J() != null && bB2.I.aa) {
            String string5;
            if (b2.C()) {
                void v1 = b2;
                string5 = v1.J(v1.J());
            } else {
                string5 = Kg.J(Gua.y);
            }
            c2 = string5;
            string4 = new StringBuilder().insert(3 ^ 3, aPa.C).append(Kg.C()).append(Xpa.E).append((String)c2).toString();
        }
        c2 = new ArrayList();
        c2.add(string);
        c2.addAll(Arrays.asList(stringArray));
        if (string2 != null) {
            c2.add(string2);
        }
        if (string3 != null) {
            c2.add(string3);
        }
        if (string4 != null) {
            c2.add(string4);
        }
        return bB2.J((int)a2, (List<String>)c2);
    }

    private String[] J(String string) {
        int n2;
        Object b2 = string;
        bB a2 = this;
        if (((String)b2).length() <= 0) {
            return new String[uSa.E];
        }
        b2 = cg.l((String)b2, (String)dua.G);
        b2 = ((String)b2).split(nOa.Aa);
        int n3 = n2 = uSa.E;
        while (n3 < ((Object)b2).length) {
            int n4 = n2;
            int n5 = n2;
            Object object = b2;
            object[n4] = TOa.T + ((String)object[n2]).trim();
            Object object2 = b2;
            String string2 = cg.J((String)object2[n2], (String)VQa.ja);
            object2[n4] = string2;
            n3 = ++n2;
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void a2;
        void c2;
        bB bB2;
        bB b2;
        int d2 = n3;
        bB bB3 = b2 = this;
        bB3.i();
        if (bB3.m != null) {
            bB bB4 = b2;
            bB2 = bB4;
            KA.J((String)b2.m, (int)(bB4.A / uqa.g), (int)yta.Ka, (int)pua.o);
        } else {
            bB bB5 = b2;
            bB2 = bB5;
            KA.J((String)bB5.j, (int)(bB5.A / uqa.g), (int)yta.Ka, (int)pua.o);
        }
        super.J((int)c2, d2, (float)a2);
        if (Math.abs((int)(c2 - b2.J)) <= tTa.h && Math.abs(d2 - b2.E) <= tTa.h) {
            bB bB6 = b2;
            bB6.J((int)c2, d2, (List)bB6.E);
            return;
        }
        bB bB7 = b2;
        bB7.J = c2;
        bB7.E = d2;
        b2.A = System.currentTimeMillis();
    }
}

