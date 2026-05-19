/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CZ
 *  Fpa
 *  Gg
 *  Lga
 *  MQa
 *  Mha
 *  OCa
 *  Oz
 *  Qc
 *  Rha
 *  TQa
 *  Uqa
 *  Yaa
 *  aGa
 *  aSa
 *  bpa
 *  eHa
 *  fia
 *  ld
 *  oGa
 *  qta
 *  vL
 *  vRa
 *  zsa
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public final class qga_2
extends Mha {
    /*
     * WARNING - void declaration
     */
    private wha[] func_110670_a(Random random, int n2, double d2, double d3, double d4, double d5) {
        int n3;
        int g22 = n2;
        qga_2 e2 = this;
        wha[] g22 = new wha[g22];
        int n4 = n3 = uSa.E;
        while (n4 < g22.length) {
            void a2;
            void b2;
            void c2;
            void d6;
            void f2;
            wha wha2 = new wha();
            wha2.J((Random)f2, (double)d6, (double)c2, (double)b2, (double)a2);
            g22[n3++] = wha2;
            n4 = n3;
        }
        return g22;
    }

    /*
     * WARNING - void declaration
     */
    private void func_110669_a(u u2, List<vL> list, wha wha2, double d2, double d3, Gg gg2, boolean bl) throws oGa {
        void g2;
        void b2;
        double d4;
        double d5;
        int n2;
        void f22;
        void a2;
        double c2;
        void e2;
        wha[] whaArray = this;
        Random random = new Random();
        void v0 = e2;
        double d6 = v0.A - c2;
        double d7 = v0.I - c2;
        double d8 = v0.A + c2;
        c2 = v0.I + c2;
        if (a2 != false) {
            n2 = whaArray.func_110667_a((List<vL>)f22);
            d5 = d6;
        } else {
            n2 = f22.size();
            d5 = d6;
        }
        wha[] h2 = whaArray.func_110670_a(random, n2, d5, d7, d8, c2);
        int f22 = super.func_110668_a((wha)e2, d4, (Gg)b2, random, d6, d7, d8, c2, h2, (boolean)a2);
        d4 = super.func_110671_a((List<vL>)f22, (Gg)b2, h2, (boolean)a2);
        wha[] whaArray2 = whaArray;
        Object[] objectArray = new Object[yRa.d];
        objectArray[uSa.E] = h2.length;
        objectArray[vRa.d] = e2.A;
        objectArray[uqa.g] = e2.I;
        qga_2.notifyOperators((u)g2, (Qc)whaArray, (String)(bpa.v + (a2 != false ? fPa.v : TQa.Ka)), (Object[])objectArray);
        if (h2.length > vRa.d) {
            Object[] objectArray2 = new Object[uqa.g];
            Object[] objectArray3 = new Object[vRa.d];
            objectArray3[uSa.E] = d4;
            objectArray2[uSa.E] = String.format(zsa.fa, objectArray3);
            objectArray2[vRa.d] = f22;
            g2.J((ld)new CZ(new StringBuilder().insert(5 >> 3, xSa.P).append(a2 != false ? fPa.v : TQa.Ka).toString(), objectArray2));
        }
    }

    public int getRequiredPermissionLevel() {
        return uqa.g;
    }

    public String getCommandUsage(u u2) {
        Object b2 = u2;
        qga_2 a2 = this;
        return aua.k;
    }

    /*
     * WARNING - void declaration
     */
    public List<String> addTabCompletionOptions(u u2, String[] stringArray, XF xF2) {
        String[] d2 = stringArray;
        String[] b2 = this;
        if (d2.length >= vRa.d && d2.length <= uqa.g) {
            void a2;
            return qga_2.func_181043_b((String[])d2, (int)uSa.E, (XF)a2);
        }
        return null;
    }

    public qga_2() {
        qga_2 a2;
    }

    private int func_110667_a(List<vL> list) {
        Iterator a2;
        qga_2 qga_22 = this;
        HashSet b2 = Sets.newHashSet();
        a2 = a2.iterator();
        while (a2.hasNext()) {
            vL vL2 = (vL)a2.next();
            if (vL2 instanceof Sx) {
                b2.add(((Sx)vL2).J());
                continue;
            }
            b2.add(null);
        }
        return b2.size();
    }

    public String getCommandName() {
        return Fpa.Z;
    }

    /*
     * WARNING - void declaration
     */
    private int func_110668_a(wha wha2, double d2, Gg gg2, Random random, double d3, double d4, double d5, double d6, wha[] whaArray, boolean bl) throws oGa {
        void b2;
        int n2;
        qga_2 qga_22 = this;
        int n3 = vRa.d;
        double d7 = qta.Ka;
        int n4 = n2 = uSa.E;
        while (n4 < Uqa.G && n3 != 0) {
            void c2;
            void d8;
            void e2;
            void f2;
            void g2;
            wha wha3;
            int n5;
            n3 = uSa.E;
            d7 = qta.Ka;
            int n6 = uSa.E;
            while (n6 < ((void)b2).length) {
                int n7;
                qga_2 k2 = b2[n7];
                n5 = uSa.E;
                wha3 = new wha();
                int n8 = uSa.E;
                while (n8 < ((void)b2).length) {
                    int n9;
                    if (n7 != n9) {
                        void i2;
                        void var25_22 = b2[n9];
                        double d9 = ((wha)((Object)k2)).J((wha)var25_22);
                        d7 = Math.min(d9, d7);
                        if (d9 < i2) {
                            wha wha4 = wha3;
                            ++n5;
                            wha4.A += var25_22.A - ((wha)((Object)k2)).A;
                            wha4.I += var25_22.I - ((wha)((Object)k2)).I;
                        }
                    }
                    n8 = ++n9;
                }
                if (n5 > 0) {
                    double d10;
                    wha wha5 = wha3;
                    wha5.A /= (double)n5;
                    wha5.I /= (double)n5;
                    double d11 = wha5.J();
                    if (d10 > aSa.V) {
                        wha wha6 = wha3;
                        wha6.J();
                        ((wha)((Object)k2)).J(wha6);
                    } else {
                        ((wha)((Object)k2)).J((Random)g2, (double)f2, (double)e2, (double)d8, (double)c2);
                    }
                    n3 = vRa.d;
                }
                if (((wha)((Object)k2)).J((double)f2, (double)e2, (double)d8, (double)c2)) {
                    n3 = vRa.d;
                }
                n6 = ++n7;
            }
            if (n3 == 0) {
                void var20_17 = b2;
                int k2 = ((void)var20_17).length;
                int n10 = uSa.E;
                while (n10 < k2) {
                    void h2;
                    wha3 = var20_17[n5];
                    if (!wha3.J((Gg)h2)) {
                        wha3.J((Random)g2, (double)f2, (double)e2, (double)d8, (double)c2);
                        n3 = vRa.d;
                    }
                    n10 = ++n5;
                }
            }
            n4 = ++n2;
        }
        if (n2 >= Uqa.G) {
            void a2;
            void j2;
            Object[] objectArray = new Object[AQa.P];
            objectArray[uSa.E] = ((void)b2).length;
            objectArray[vRa.d] = j2.A;
            objectArray[uqa.g] = j2.I;
            Object[] objectArray2 = new Object[vRa.d];
            objectArray2[uSa.E] = d7;
            objectArray[yRa.d] = String.format(zsa.fa, objectArray2);
            throw new oGa(new StringBuilder().insert(2 & 5, UTa.Ka).append(a2 != false ? fPa.v : TQa.Ka).toString(), objectArray);
        }
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    public void processCommand(u u2, String[] stringArray) throws oGa {
        void b2;
        void a2;
        qga_2 qga_22 = this;
        if (((void)a2).length < uua.p) {
            throw new eHa(aua.k, new Object[uSa.E]);
        }
        int n2 = uSa.E;
        XF xF2 = b2.J();
        double d2 = qga_2.parseDouble((double)xF2.getX(), (String)a2[n2], vRa.d != 0);
        double d3 = d2;
        void v2 = a2;
        double d4 = qga_2.parseDouble((double)xF2.getZ(), (String)v2[++n2], vRa.d != 0);
        double d5 = d4;
        void v4 = a2;
        double d6 = qga_2.parseDouble((String)v4[++n2], (double)aSa.V);
        double d7 = d6;
        void v6 = v4[++n2];
        double d8 = qga_2.parseDouble((String)v6, (double)(d7 + oua.i));
        boolean bl = qga_2.parseBoolean((String)v2[++n2]);
        ++n2;
        ArrayList c2 = Lists.newArrayList();
        while (n2 < ((void)a2).length) {
            List list;
            void var14_10 = a2[n2];
            ++n2;
            if (fia.J((String)var14_10)) {
                list = fia.J((u)b2, (String)var14_10, vL.class);
                if (list.size() == 0) {
                    throw new Lga();
                }
                c2.addAll(list);
                continue;
            }
            list = OCa.J().J().J((String)var14_10);
            if (list == null) {
                throw new aGa();
            }
            c2.add(list);
        }
        b2.J(Rha.AFFECTED_ENTITIES, c2.size());
        if (c2.isEmpty()) {
            throw new Lga();
        }
        Object[] objectArray = new Object[tTa.h];
        objectArray[uSa.E] = c2.size();
        objectArray[vRa.d] = d8;
        objectArray[uqa.g] = d3;
        objectArray[yRa.d] = d5;
        objectArray[AQa.P] = d7;
        b2.J((ld)new CZ(new StringBuilder().insert(5 >> 3, rta.x).append(bl ? fPa.v : TQa.Ka).toString(), objectArray));
        qga_22.func_110669_a((u)b2, c2, new wha(d3, d5), d7, d8, ((vL)c2.get((int)uSa.E)).j, bl);
    }

    /*
     * WARNING - void declaration
     */
    private double func_110671_a(List<vL> list, Gg gg2, wha[] whaArray, boolean bl) {
        void d2;
        int n2;
        qga_2 qga_22 = this;
        double d3 = aSa.V;
        int n3 = uSa.E;
        HashMap<Yaa, void> hashMap = Maps.newHashMap();
        int n4 = n2 = uSa.E;
        while (n4 < d2.size()) {
            void c2;
            qga_2 qga_23;
            wha wha2;
            void b2;
            void a2;
            qga_2 e2 = (vL)d2.get(n2);
            if (a2 != false) {
                Yaa yaa2;
                Yaa yaa3 = yaa2 = e2 instanceof Sx ? ((Sx)((Object)e2)).J() : null;
                if (!hashMap.containsKey(yaa2)) {
                    hashMap.put(yaa2, b2[n3]);
                    ++n3;
                }
                wha2 = (wha)hashMap.get(yaa2);
                qga_23 = e2;
            } else {
                wha2 = b2[n3];
                qga_23 = e2;
                ++n3;
            }
            qga_23.C((float)Oz.f((double)wha2.A) + MQa.L, wha2.J((Gg)c2), (double)Oz.f((double)wha2.I) + kTa.B);
            double d4 = Bra.o;
            int n5 = uSa.E;
            while (n5 < ((void)b2).length) {
                if (wha2 != b2[e2]) {
                    d4 = Math.min(wha2.J((wha)b2[e2]), d4);
                }
                n5 = ++e2;
            }
            d3 += d4;
            n4 = ++n2;
        }
        return d3 /= (double)d2.size();
    }
}

