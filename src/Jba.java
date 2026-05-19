/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  JTa
 *  Mda
 *  NCa
 *  NTa
 *  URa
 *  Vda
 *  WSa
 *  Waa
 *  Xsa
 *  Ypa
 *  bRa
 *  kPa
 *  qta
 *  vRa
 *  waa
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Jba
implements UB {
    private Mda I;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(xFa xFa2, Gg gg2) {
        Jba c222;
        void b2;
        int n2;
        Jba jba2 = this;
        jba2.I = null;
        int a2 = uSa.E;
        int n3 = uSa.E;
        int n4 = uSa.E;
        int n5 = uSa.E;
        int n6 = uSa.E;
        int n7 = uSa.E;
        int n8 = n2 = uSa.E;
        while (n8 < b2.f()) {
            c222 = b2.J(n2);
            if (c222 != null) {
                if (c222.J() == Gea.xB) {
                    ++n3;
                } else if (c222.J() == Gea.OB) {
                    ++n5;
                } else if (c222.J() == Gea.Q) {
                    ++n4;
                } else if (c222.J() == Gea.LB) {
                    ++a2;
                } else if (c222.J() == Gea.Sa) {
                    ++n6;
                } else if (c222.J() == Gea.b) {
                    ++n6;
                } else if (c222.J() == Gea.j) {
                    ++n7;
                } else if (c222.J() == Gea.ia) {
                    ++n7;
                } else if (c222.J() == Gea.hc) {
                    ++n7;
                } else {
                    if (c222.J() != Gea.GB) {
                        return uSa.E != 0;
                    }
                    ++n7;
                }
            }
            n8 = ++n2;
        }
        n6 = n6 + n4 + n7;
        if (n3 <= yRa.d && a2 <= vRa.d) {
            if (n3 >= vRa.d && a2 == vRa.d && n6 == 0) {
                Jba jba3 = jba2;
                jba3.I = new Mda(Gea.Wa);
                if (n5 > 0) {
                    int n9;
                    Waa waa2 = new Waa();
                    c222 = new Waa();
                    waa waa3 = new waa();
                    int n10 = n9 = uSa.E;
                    while (n10 < b2.f()) {
                        Mda mda2 = b2.J(n9);
                        if (mda2 != null && mda2.J() == Gea.OB && mda2.M() && mda2.J().J(KPa.N, NTa.C)) {
                            waa3.J((NCa)mda2.J().J(KPa.N));
                        }
                        n10 = ++n9;
                    }
                    Jba jba4 = c222;
                    jba4.J(qta.v, (NCa)waa3);
                    jba4.J(Xsa.U, (byte)n3);
                    waa2.J(URa.O, (NCa)c222);
                    jba2.I.J(waa2);
                }
                return vRa.d != 0;
            }
            if (n3 == vRa.d && a2 == 0 && n5 == 0 && n4 > 0 && n7 <= vRa.d) {
                int n11;
                jba2.I = new Mda(Gea.OB);
                Waa waa4 = new Waa();
                c222 = new Waa();
                int n12 = uSa.E;
                ArrayList<Integer> arrayList = Lists.newArrayList();
                int n13 = n11 = uSa.E;
                while (n13 < b2.f()) {
                    Mda mda3 = b2.J(n11);
                    if (mda3 != null) {
                        if (mda3.J() == Gea.Q) {
                            arrayList.add(Vda.I[mda3.J() & Ypa.A]);
                        } else if (mda3.J() == Gea.Sa) {
                            c222.J(bRa.C, vRa.d != 0);
                        } else if (mda3.J() == Gea.b) {
                            c222.J(kPa.ja, vRa.d != 0);
                        } else if (mda3.J() == Gea.j) {
                            n12 = vRa.d;
                        } else if (mda3.J() == Gea.ia) {
                            n12 = AQa.P;
                        } else if (mda3.J() == Gea.hc) {
                            n12 = uqa.g;
                        } else if (mda3.J() == Gea.GB) {
                            n12 = yRa.d;
                        }
                    }
                    n13 = ++n11;
                }
                int[] nArray = new int[arrayList.size()];
                int n14 = n7 = uSa.E;
                while (n14 < nArray.length) {
                    int n15 = n7++;
                    nArray[n15] = (Integer)arrayList.get(n15);
                    n14 = n7;
                }
                Jba jba5 = c222;
                jba5.J(Iqa.s, nArray);
                jba5.J(JTa.Ga, (byte)n12);
                waa4.J(KPa.N, (NCa)c222);
                jba2.I.J(waa4);
                return vRa.d != 0;
            }
            if (n3 == 0 && a2 == 0 && n5 == vRa.d && n4 > 0 && n4 == n6) {
                int n16;
                int c222;
                ArrayList<Integer> arrayList = Lists.newArrayList();
                int n17 = c222 = uSa.E;
                while (n17 < b2.f()) {
                    Mda mda4 = b2.J(c222);
                    if (mda4 != null) {
                        if (mda4.J() == Gea.Q) {
                            arrayList.add(Vda.I[mda4.J() & Ypa.A]);
                        } else if (mda4.J() == Gea.OB) {
                            Jba jba6 = jba2;
                            jba6.I = mda4.J();
                            jba6.I.E = vRa.d;
                        }
                    }
                    n17 = ++c222;
                }
                int[] c222 = new int[arrayList.size()];
                int n18 = n16 = uSa.E;
                while (n18 < c222.length) {
                    int n19 = n16++;
                    c222[n19] = (Integer)arrayList.get(n19);
                    n18 = n16;
                }
                if (jba2.I != null && jba2.I.M()) {
                    Waa waa5 = jba2.I.J().J(KPa.N);
                    if (waa5 == null) {
                        return uSa.E != 0;
                    }
                    waa5.J(WSa.E, c222);
                    return vRa.d != 0;
                }
                return uSa.E != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public Jba() {
        Jba a2;
    }

    @Override
    public int J() {
        return NTa.C;
    }

    @Override
    public Mda J() {
        Jba a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Mda[] J(xFa xFa2) {
        int b2;
        void a2;
        Jba jba2 = this;
        Mda[] mdaArray = new Mda[a2.f()];
        int n2 = b2 = uSa.E;
        while (n2 < mdaArray.length) {
            Mda mda2 = a2.J(b2);
            if (mda2 != null && mda2.J().f()) {
                mdaArray[b2] = new Mda(mda2.J().f());
            }
            n2 = ++b2;
        }
        return mdaArray;
    }

    @Override
    public Mda J(xFa xFa2) {
        xFa b2 = xFa2;
        Jba a2 = this;
        return a2.I.J();
    }
}

