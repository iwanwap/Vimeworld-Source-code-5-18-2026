/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bb
 *  Bea
 *  Ega
 *  GEa
 *  Gg
 *  HA
 *  HGa
 *  ISa
 *  Mda
 *  QFa
 *  TQa
 *  Tz
 *  Uqa
 *  Vua
 *  Ypa
 *  eAa
 *  iea
 *  kGa
 *  kea
 *  nQa
 *  pua
 *  uOa
 *  vRa
 */
import java.util.List;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class GEa_3
extends Ega {
    public int i;
    private Random M;
    public int[] k;
    private Gg j;
    public int[] J;
    public HA A;
    private XF I;

    /*
     * WARNING - void declaration
     */
    public void J(Sx sx2) {
        void a2;
        GEa_3 gEa_3;
        GEa_3 gEa_32 = gEa_3 = this;
        super.J((Sx)a2);
        if (!gEa_32.j.e) {
            int b2;
            int n2 = b2 = uSa.E;
            while (n2 < gEa_3.A.f()) {
                Mda mda2 = gEa_3.A.f(b2);
                if (mda2 != null) {
                    a2.J(mda2, uSa.E != 0);
                }
                n2 = ++b2;
            }
        }
    }

    public void f(Bb bb2) {
        GEa_3 a2;
        GEa_3 b2 = bb2;
        GEa_3 gEa_3 = a2 = this;
        GEa_3 gEa_32 = b2;
        super.f((Bb)gEa_32);
        GEa_3 gEa_33 = b2;
        GEa_3 gEa_34 = b2;
        GEa_3 gEa_35 = a2;
        gEa_34.J(gEa_35, uSa.E, gEa_35.J[uSa.E]);
        GEa_3 gEa_36 = a2;
        gEa_34.J(gEa_36, vRa.d, gEa_36.J[vRa.d]);
        GEa_3 gEa_37 = a2;
        gEa_34.J(gEa_37, uqa.g, gEa_37.J[uqa.g]);
        GEa_3 gEa_38 = a2;
        gEa_34.J(gEa_38, yRa.d, gEa_38.i & nQa.u);
        GEa_3 gEa_39 = a2;
        gEa_33.J(gEa_39, AQa.P, gEa_39.k[uSa.E]);
        gEa_33.J(a2, tTa.h, a2.k[vRa.d]);
        gEa_32.J(gEa_3, uua.p, a2.k[uqa.g]);
    }

    /*
     * Unable to fully structure code
     */
    public Mda J(Sx var1_1, int var2_2) {
        block10: {
            block13: {
                block12: {
                    block11: {
                        var3_3 = this;
                        var5_4 = null;
                        var4_5 = (sEa)var3_3.A.get((int)a);
                        if (var4_5 == null || !var4_5.J()) break block10;
                        c = var4_5.J();
                        var5_4 = c.J();
                        if (a != false) break block11;
                        if (!var3_3.J((Mda)c, uqa.g, ISa.E, (boolean)vRa.d)) {
                            return null;
                        }
                        ** GOTO lbl32
                    }
                    if (a != vRa.d) break block12;
                    if (!var3_3.J((Mda)c, uqa.g, ISa.E, (boolean)vRa.d)) {
                        return null;
                    }
                    ** GOTO lbl32
                }
                if (c.J() != Gea.Q || iea.byDyeDamage((int)c.J()) != iea.BLUE) break block13;
                if (!var3_3.J((Mda)c, vRa.d, uqa.g, (boolean)vRa.d)) {
                    return null;
                }
                ** GOTO lbl32
            }
            if (((sEa)var3_3.A.get(uSa.E)).J() || !((sEa)var3_3.A.get(uSa.E)).J((Mda)c)) {
                return null;
            }
            if (c.M() && c.E == vRa.d) {
                ((sEa)var3_3.A.get(uSa.E)).J(c.J());
                v0 = c;
                c.E = uSa.E;
            } else {
                if (c.E >= vRa.d) {
                    ((sEa)var3_3.A.get(uSa.E)).J(new Mda(c.J(), vRa.d, c.J()));
                    c.E -= vRa.d;
                }
lbl32:
                // 6 sources

                v0 = c;
            }
            v1 = var4_5;
            if (v0.E == 0) {
                v1.J((Mda)null);
                v2 = c;
            } else {
                v1.J();
                v2 = c;
            }
            if (v2.E == var5_4.E) {
                return null;
            }
            var4_5.J((Sx)b, (Mda)c);
        }
        return var5_4;
    }

    public void J() {
        int n2;
        GEa_3 gEa_3 = this;
        super.J();
        int n3 = n2 = uSa.E;
        while (n3 < gEa_3.I.size()) {
            GEa_3 a2;
            GEa_3 gEa_32 = a2 = (Bb)gEa_3.I.get(n2);
            GEa_3 gEa_33 = a2;
            GEa_3 gEa_34 = gEa_3;
            gEa_33.J(gEa_34, uSa.E, gEa_34.J[uSa.E]);
            GEa_3 gEa_35 = gEa_3;
            gEa_33.J(gEa_35, vRa.d, gEa_35.J[vRa.d]);
            GEa_3 gEa_36 = gEa_3;
            gEa_33.J(gEa_36, uqa.g, gEa_36.J[uqa.g]);
            GEa_3 gEa_37 = gEa_3;
            gEa_33.J(gEa_37, yRa.d, gEa_37.i & nQa.u);
            GEa_3 gEa_38 = gEa_3;
            gEa_33.J(gEa_38, AQa.P, gEa_38.k[uSa.E]);
            GEa_3 gEa_39 = gEa_3;
            gEa_32.J(gEa_39, tTa.h, gEa_39.k[vRa.d]);
            gEa_32.J(gEa_3, uua.p, gEa_3.k[uqa.g]);
            n3 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Sx sx2, int n2) {
        void b2;
        GEa_3 a2;
        int c22 = n2;
        GEa_3 gEa_3 = a2 = this;
        Mda mda2 = gEa_3.A.J(uSa.E);
        Mda mda3 = gEa_3.A.J(vRa.d);
        int n3 = c22 + vRa.d;
        if (!(mda3 != null && mda3.E >= n3 || b2.h.f())) {
            return uSa.E != 0;
        }
        if (a2.J[c22] > 0 && mda2 != null && (b2.j >= n3 && b2.j >= a2.J[c22] || b2.h.f())) {
            if (!a2.j.e) {
                int n4;
                GEa_3 gEa_32 = a2;
                List<HGa> c22 = gEa_32.J(mda2, c22, gEa_32.J[c22]);
                int n5 = n4 = mda2.J() == Gea.Qa ? vRa.d : uSa.E;
                if (c22 != null) {
                    int n6;
                    b2.D(n3);
                    if (n4 != 0) {
                        mda2.J((eAa)Gea.ha);
                    }
                    int n7 = n6 = uSa.E;
                    while (n7 < c22.size()) {
                        HGa hGa2 = c22.get(n6);
                        if (n4 != 0) {
                            Gea.ha.J(mda2, hGa2);
                        } else {
                            HGa hGa3 = hGa2;
                            mda2.J(hGa3.A, hGa3.I);
                        }
                        n7 = ++n6;
                    }
                    if (!b2.h.f()) {
                        Mda mda4 = mda3;
                        mda4.E -= n3;
                        if (mda4.E <= 0) {
                            a2.A.J(vRa.d, (Mda)null);
                        }
                    }
                    b2.J(Tz.g);
                    GEa_3 gEa_33 = a2;
                    gEa_33.A.f();
                    a2.i = b2.I();
                    a2.J(gEa_33.A);
                }
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public GEa_3(kea kea2, Gg gg2, XF xF2) {
        void c2;
        void a2;
        GEa_3 b2;
        GEa_3 d22 = gg2;
        GEa_3 gEa_3 = b2 = this;
        GEa_3 gEa_32 = b2;
        b2.A = new tea((GEa)b2, Uqa.t, vRa.d != 0, uqa.g);
        gEa_32.M = new Random();
        gEa_3.J = new int[yRa.d];
        int[] nArray = new int[yRa.d];
        nArray[uSa.E] = pua.o;
        nArray[vRa.d] = pua.o;
        nArray[uqa.g] = pua.o;
        gEa_3.k = nArray;
        gEa_3.j = d22;
        b2.I = a2;
        b2.i = c2.k.I();
        GEa_3 gEa_33 = b2;
        b2.J(new OFa((GEa)gEa_33, gEa_33.A, uSa.E, Ypa.A, uOa.F));
        GEa_3 gEa_34 = b2;
        gEa_34.J((sEa)new Bea((GEa)gEa_34, b2.A, vRa.d, TQa.ca, uOa.F));
        int d22 = uSa.E;
        int n2 = d22;
        while (n2 < yRa.d) {
            int n3 = uSa.E;
            while (n3 < WOa.fa) {
                int n4 = a2 + d22 * WOa.fa + WOa.fa;
                int n5 = Yqa.i + a2 * yOa.B;
                b2.J(new sEa((HA)c2, n4, n5, Vua.J + d22 * yOa.B));
                n3 = ++a2;
            }
            n2 = ++d22;
        }
        int n6 = d22 = uSa.E;
        while (n6 < WOa.fa) {
            int n7 = d22++;
            b2.J(new sEa((HA)c2, n7, Yqa.i + n7 * yOa.B, Fsa.D));
            n6 = d22;
        }
    }

    public int J() {
        GEa_3 gEa_3 = this;
        GEa_3 a2 = gEa_3.A.J(vRa.d);
        if (a2 == null) {
            return uSa.E;
        }
        return ((Mda)a2).E;
    }

    /*
     * WARNING - void declaration
     */
    private List<HGa> J(Mda mda2, int n2, int n3) {
        void a2;
        void c2;
        GEa_3 b2;
        int d22 = n2;
        GEa_3 gEa_3 = b2 = this;
        b2.M.setSeed(gEa_3.i + d22);
        List d22 = kGa.J((Random)gEa_3.M, (Mda)c2, (int)a2);
        if (c2.J() == Gea.Qa && d22 != null && d22.size() > vRa.d) {
            List list = d22;
            list.remove(b2.M.nextInt(list.size()));
        }
        return d22;
    }

    /*
     * WARNING - void declaration
     */
    public GEa_3(kea kea2, Gg gg2) {
        void b2;
        GEa_3 c2 = gg2;
        GEa_3 a2 = this;
        a2((kea)b2, (Gg)c2, XF.ORIGIN);
    }

    public void J(HA hA2) {
        Mda a2;
        GEa_3 gEa_3 = this;
        if (a2 == gEa_3.A) {
            if ((a2 = a2.J(uSa.E)) != null && a2.G()) {
                if (!gEa_3.j.e) {
                    int b2;
                    int n2 = uSa.E;
                    int n3 = b2 = pua.o;
                    while (n3 <= vRa.d) {
                        int n4 = pua.o;
                        while (n4 <= vRa.d) {
                            int n5;
                            if (b2 != 0 || n5 != 0) {
                                GEa_3 gEa_32 = gEa_3;
                                if (gEa_32.j.J(gEa_32.I.add(n5, uSa.E, b2))) {
                                    GEa_3 gEa_33 = gEa_3;
                                    if (gEa_33.j.J(gEa_33.I.add(n5, vRa.d, b2))) {
                                        GEa_3 gEa_34 = gEa_3;
                                        if (gEa_34.j.J(gEa_34.I.add(n5 * uqa.g, uSa.E, b2 * uqa.g)).J() == QFa.gA) {
                                            ++n2;
                                        }
                                        GEa_3 gEa_35 = gEa_3;
                                        if (gEa_35.j.J(gEa_35.I.add(n5 * uqa.g, vRa.d, b2 * uqa.g)).J() == QFa.gA) {
                                            ++n2;
                                        }
                                        if (n5 != 0 && b2 != 0) {
                                            GEa_3 gEa_36 = gEa_3;
                                            if (gEa_36.j.J(gEa_36.I.add(n5 * uqa.g, uSa.E, b2)).J() == QFa.gA) {
                                                ++n2;
                                            }
                                            GEa_3 gEa_37 = gEa_3;
                                            if (gEa_37.j.J(gEa_37.I.add(n5 * uqa.g, vRa.d, b2)).J() == QFa.gA) {
                                                ++n2;
                                            }
                                            GEa_3 gEa_38 = gEa_3;
                                            if (gEa_38.j.J(gEa_38.I.add(n5, uSa.E, b2 * uqa.g)).J() == QFa.gA) {
                                                ++n2;
                                            }
                                            GEa_3 gEa_39 = gEa_3;
                                            if (gEa_39.j.J(gEa_39.I.add(n5, vRa.d, b2 * uqa.g)).J() == QFa.gA) {
                                                ++n2;
                                            }
                                        }
                                    }
                                }
                            }
                            n4 = ++n5;
                        }
                        n3 = ++b2;
                    }
                    GEa_3 gEa_310 = gEa_3;
                    gEa_310.M.setSeed(gEa_310.i);
                    int n6 = b2 = uSa.E;
                    while (n6 < yRa.d) {
                        GEa_3 gEa_311 = gEa_3;
                        GEa_3 gEa_312 = gEa_3;
                        gEa_311.J[b2] = kGa.J((Random)gEa_312.M, (int)b2, (int)n2, (Mda)a2);
                        gEa_312.k[b2] = pua.o;
                        if (gEa_311.J[b2] < b2 + vRa.d) {
                            gEa_3.J[b2] = uSa.E;
                        }
                        n6 = ++b2;
                    }
                    int n7 = b2 = uSa.E;
                    while (n7 < yRa.d) {
                        if (gEa_3.J[b2] > 0) {
                            GEa_3 gEa_313 = gEa_3;
                            List<HGa> list = gEa_313.J(a2, b2, gEa_313.J[b2]);
                            if (list != null && !list.isEmpty()) {
                                List<HGa> list2 = list;
                                HGa hGa2 = list2.get(gEa_3.M.nextInt(list2.size()));
                                gEa_3.k[b2] = hGa2.A.I | hGa2.I << Yqa.i;
                            }
                        }
                        n7 = ++b2;
                    }
                    gEa_3.J();
                    return;
                }
            } else {
                int n8;
                int n9 = n8 = uSa.E;
                while (n9 < yRa.d) {
                    GEa_3 gEa_314 = gEa_3;
                    gEa_314.J[n8] = uSa.E;
                    gEa_314.k[n8++] = pua.o;
                    n9 = n8;
                }
            }
        }
    }

    public boolean J(Sx sx2) {
        GEa_3 a2;
        Object b2 = sx2;
        GEa_3 gEa_3 = a2 = this;
        if (gEa_3.j.J(gEa_3.I).J() != QFa.rC) {
            return uSa.E != 0;
        }
        if (b2.f((double)a2.I.getX() + kTa.B, (double)a2.I.getY() + kTa.B, (double)a2.I.getZ() + kTa.B) <= ypa.X) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void a2;
        int c2 = n2;
        GEa_3 b2 = this;
        if (c2 >= 0 && c2 <= uqa.g) {
            b2.J[c2] = a2;
            return;
        }
        if (c2 == yRa.d) {
            b2.i = a2;
            return;
        }
        if (c2 >= AQa.P && c2 <= uua.p) {
            b2.k[c2 - AQa.P] = a2;
            return;
        }
        super.J(c2, (int)a2);
    }
}

