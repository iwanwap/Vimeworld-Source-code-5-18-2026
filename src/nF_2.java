/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  B
 *  Bc
 *  EC
 *  KA
 *  NTa
 *  Vua
 *  XTa
 *  ac
 *  dpa
 *  if
 *  pPa
 *  pua
 *  vRa
 *  zna
 */
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class nF_2 {
    private EC j;
    private int J;
    private long A;
    private int I;

    private static String[] J(Fha a2) {
        return nF_2.J(a2.getEnumString());
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, List list) {
        void b2;
        void c2;
        nF_2 nF_22 = this;
        if (Math.abs((int)(c2 - nF_22.J)) <= tTa.h && Math.abs((int)(b2 - nF_22.I)) <= tTa.h) {
            int d2 = BQa.t;
            if (System.currentTimeMillis() >= nF_22.A + (long)d2) {
                String[] a2;
                nF_2 nF_23 = nF_22;
                d2 = nF_23.j.A / uqa.g - Jpa.Ha;
                int n4 = nF_23.j.I / uua.p - XTa.W;
                if (b2 <= n4 + dpa.A) {
                    n4 += 105;
                }
                int n5 = d2 + Jpa.Ha + Jpa.Ha;
                int n6 = n4 + Vua.J + NTa.C;
                if ((a2 = nF_22.J((int)c2, (int)b2, (List)a2)) instanceof B) {
                    if ((a2 = nF_2.J(((B)a2).J())) == null) {
                        return;
                    }
                    if.C((double)d2, (double)n4, (double)(n5 - d2), (double)(n6 - n4), (Color)Bc.Ja, (Color)Bc.Ga);
                    int n7 = n5 = uSa.E;
                    while (n7 < a2.length) {
                        String string = a2[n5];
                        int n8 = pua.o;
                        if (string.endsWith(dqa.O)) {
                            n8 = Color.RED.getRGB();
                        }
                        int n9 = n5 * pPa.f;
                        KA.f((String)string, (int)(d2 + tTa.h), (int)(n4 + tTa.h + n9), (int)n8);
                        n7 = ++n5;
                    }
                }
            }
        } else {
            nF_2 nF_24 = nF_22;
            nF_24.J = c2;
            nF_24.I = b2;
            nF_22.A = System.currentTimeMillis();
        }
    }

    /*
     * WARNING - void declaration
     */
    private ac J(int n2, int n3, List list) {
        void a2;
        int n4;
        nF_2 nF_22 = this;
        int n5 = n4 = uSa.E;
        while (n5 < a2.size()) {
            void b2;
            void c2;
            int n6;
            nF_2 d2 = (ac)a2.get(n4);
            int n7 = zna.J((ac)d2);
            int n8 = zna.f((ac)d2);
            int n9 = n6 = c2 >= ((ac)d2).m && b2 >= ((ac)d2).I && c2 < ((ac)d2).m + n7 && b2 < ((ac)d2).I + n8 ? vRa.d : uSa.E;
            if (n6 != 0) {
                return d2;
            }
            n5 = ++n4;
        }
        return null;
    }

    private static String[] J(String string) {
        ArrayList arrayList;
        ArrayList a2;
        block3: {
            int n2;
            String string2 = string;
            a2 = new ArrayList();
            int n3 = n2 = uSa.E;
            while (n3 < NTa.C) {
                String string3 = Kg.J(new StringBuilder().insert(5 >> 3, string2).append(MTa.f).append(n2 + vRa.d).toString(), (String)null);
                if (string3 == null) {
                    arrayList = a2;
                    break block3;
                }
                a2.add(string3);
                n3 = ++n2;
            }
            arrayList = a2;
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        Object object = a2;
        String[] stringArray = object.toArray(new String[object.size()]);
        return stringArray;
    }

    public nF_2(EC eC2) {
        nF_2 a2;
        nF_2 b2 = eC2;
        nF_2 nF_22 = a2 = this;
        a2.j = null;
        a2.J = uSa.E;
        nF_22.I = uSa.E;
        nF_22.A = nqa.i;
        nF_22.j = b2;
    }
}

