/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Ey
 *  JTa
 *  Mda
 *  NCa
 *  Pqa
 *  Tpa
 *  Uqa
 *  Vda
 *  WQa
 *  WSa
 *  Waa
 *  bRa
 *  eAa
 *  iea
 *  kPa
 *  vRa
 */
import java.util.List;

public final class uFa
extends eAa {
    /*
     * WARNING - void declaration
     */
    public static void J(Waa waa2, List<String> list) {
        boolean bl;
        boolean b22;
        int[] nArray;
        int n2;
        int n3;
        int n4;
        int n5;
        Object object;
        void a2;
        Waa waa3;
        Waa waa4 = waa2;
        byte by2 = waa4.J(JTa.Ga);
        if (by2 >= 0 && by2 <= AQa.P) {
            waa3 = waa4;
            a2.add(Ey.f((String)(Wqa.ba + by2)).trim());
        } else {
            a2.add(Ey.f((String)LPa.M).trim());
            waa3 = waa4;
        }
        int[] nArray2 = waa3.J(Iqa.s);
        if (nArray2.length > 0) {
            int n6 = vRa.d;
            Object b22 = Mqa.y;
            object = nArray2;
            int n7 = nArray2.length;
            int n8 = n5 = uSa.E;
            while (n8 < n7) {
                int n9;
                block16: {
                    n4 = object[n5];
                    if (n6 == 0) {
                        b22 = new StringBuilder().insert(5 >> 3, (String)b22).append(TOa.n).toString();
                    }
                    n6 = uSa.E;
                    n3 = uSa.E;
                    int n10 = uSa.E;
                    while (n10 < Vda.I.length) {
                        if (n4 == Vda.I[n2]) {
                            n3 = vRa.d;
                            b22 = new StringBuilder().insert(2 & 5, (String)b22).append(Ey.f((String)new StringBuilder().insert(5 >> 3, iSa.H).append(iea.byDyeDamage((int)n2).getUnlocalizedName()).toString())).toString();
                            n9 = n3;
                            break block16;
                        }
                        n10 = ++n2;
                    }
                    n9 = n3;
                }
                if (n9 == 0) {
                    b22 = new StringBuilder().insert(3 >> 2, (String)b22).append(Ey.f((String)WQa.W)).toString();
                }
                n8 = ++n5;
            }
            a2.add(b22);
        }
        if ((nArray = waa4.J(WSa.E)).length > 0) {
            int b22 = vRa.d;
            object = new StringBuilder().insert(5 >> 3, Ey.f((String)uqa.r)).append(Tpa.E).toString();
            int[] nArray3 = nArray;
            n5 = nArray.length;
            int n11 = n4 = uSa.E;
            while (n11 < n5) {
                int n12;
                block17: {
                    n3 = nArray3[n4];
                    if (b22 == 0) {
                        object = new StringBuilder().insert(5 >> 3, (String)object).append(TOa.n).toString();
                    }
                    b22 = uSa.E;
                    n2 = uSa.E;
                    int n13 = uSa.E;
                    while (n13 < ERa.C) {
                        int n14;
                        if (n3 == Vda.I[n14]) {
                            n2 = vRa.d;
                            object = new StringBuilder().insert(3 ^ 3, (String)object).append(Ey.f((String)new StringBuilder().insert(3 ^ 3, iSa.H).append(iea.byDyeDamage((int)n14).getUnlocalizedName()).toString())).toString();
                            n12 = n2;
                            break block17;
                        }
                        n13 = ++n14;
                    }
                    n12 = n2;
                }
                if (n12 == 0) {
                    object = new StringBuilder().insert(3 & 4, (String)object).append(Ey.f((String)WQa.W)).toString();
                }
                n11 = ++n4;
            }
            a2.add(object);
        }
        if (b22 = waa4.f(kPa.ja)) {
            a2.add(Ey.f((String)WOa.a));
        }
        if (bl = waa4.f(bRa.C)) {
            a2.add(Ey.f((String)Pqa.P));
        }
    }

    /*
     * WARNING - void declaration
     */
    public static NCa J(Mda mda2, String string) {
        Mda b2;
        Mda mda3 = mda2;
        if (mda3.M() && (b2 = mda3.J().J(KPa.N)) != null) {
            void a2;
            return b2.J((String)a2);
        }
        return null;
    }

    public int J(Mda mda2, int n2) {
        int n3;
        int a2;
        Object c2 = mda2;
        uFa b2 = this;
        if (a2 != vRa.d) {
            return super.J((Mda)c2, a2);
        }
        if (!((c2 = uFa.J((Mda)c2, Iqa.s)) instanceof OAa)) {
            return vRa.h;
        }
        int[] nArray = ((OAa)((Object)c2)).J();
        c2 = nArray;
        if (nArray.length == vRa.d) {
            return (int)c2[uSa.E];
        }
        a2 = uSa.E;
        int n4 = uSa.E;
        int n5 = uSa.E;
        Object object = c2;
        int n6 = ((uFa)object).length;
        int n7 = n3 = uSa.E;
        while (n7 < n6) {
            uFa uFa2 = object[n3];
            a2 += (uFa2 & Zqa.E) >> ERa.C;
            n4 += (uFa2 & Uqa.Q) >> Yqa.i;
            n5 += (uFa2 & osa.Ja) >> uSa.E;
            n7 = ++n3;
        }
        return (a2 /= ((uFa)c2).length) << ERa.C | (n4 /= ((uFa)c2).length) << Yqa.i | (n5 /= ((uFa)c2).length);
    }

    public uFa() {
        uFa a2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Mda mda2, Sx sx2, List<String> list, boolean bl) {
        uFa e2 = mda2;
        uFa d2 = this;
        if (e2.M() && (e2 = e2.J().J(KPa.N)) != null) {
            void b2;
            uFa.J((Waa)e2, (List<String>)b2);
        }
    }
}

