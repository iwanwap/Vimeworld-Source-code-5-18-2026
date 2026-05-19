/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  FPa
 *  JPa
 *  KA
 *  Kpa
 *  Lra
 *  NNa
 *  NPa
 *  NQa
 *  NTa
 *  Oz
 *  Qsa
 *  Tpa
 *  Vna
 *  Yaa
 *  ZRa
 *  Zta
 *  asa
 *  dQa
 *  gna
 *  ica
 *  kPa
 *  kpa
 *  kta
 *  ld
 *  mca
 *  pPa
 *  pY
 *  pda
 *  pqa
 *  pua
 *  qca
 *  uKa
 *  vPa
 *  vQa
 *  vRa
 *  vpa
 */
import com.google.common.collect.Ordering;
import com.mojang.authlib.GameProfile;
import java.util.Iterator;
import java.util.List;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Sma
extends KA {
    private static final Ordering<Vna> i = Ordering.from(new NNa(null));
    private final Kpa M;
    private long k;
    private ld j;
    private ld J;
    private final gna A;
    private boolean I;

    public ld f() {
        Sma a2;
        return a2.j;
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        Sma a2 = this;
        if (b2 && !a2.I) {
            a2.k = Kpa.J();
        }
        a2.I = b2;
    }

    public ld J() {
        Sma a2;
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, Vna vna) {
        void b2;
        void d2;
        void c2;
        Sma sma;
        void a2;
        Sma sma2 = this;
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        sma2.M.J().J((ResourceLocation)A);
        int n5 = uSa.E;
        int e2 = uSa.E;
        if (a2.f() < 0) {
            e2 = tTa.h;
            sma = sma2;
        } else if (a2.f() < Jpa.Ha) {
            e2 = uSa.E;
            sma = sma2;
        } else if (a2.f() < vpa.Ja) {
            e2 = vRa.d;
            sma = sma2;
        } else if (a2.f() < Jpa.z) {
            e2 = uqa.g;
            sma = sma2;
        } else if (a2.f() < PRa.U) {
            e2 = yRa.d;
            sma = sma2;
        } else {
            e2 = AQa.P;
            sma = sma2;
        }
        sma.I += QTa.G;
        Sma sma3 = sma2;
        sma3.f((int)(c2 + d2 - pPa.f), (int)b2, uSa.E + n5 * NTa.C, MTa.U + e2 * Yqa.i, NTa.C, Yqa.i);
        sma3.I -= QTa.G;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, qca qca2, ica ica2) {
        int n3;
        int n4;
        String string;
        Iterator iterator;
        void c2;
        int n5;
        int n6;
        int n7;
        int n8;
        int b22;
        int n9;
        void a2;
        Sma sma = this;
        Object object = sma.M.c.F;
        object = i.sortedCopy(object.J());
        int n10 = uSa.E;
        int n11 = uSa.E;
        Iterator iterator2 = object.iterator();
        while (iterator2.hasNext()) {
            void b22;
            Vna vna = (Vna)iterator2.next();
            int d2 = sma.M.Ea.J(sma.J(vna));
            n10 = Math.max(n10, d2);
            if (a2 == null || a2.J() == kBa.HEARTS) continue;
            d2 = sma.M.Ea.J(new StringBuilder().insert(5 >> 3, Tpa.E).append(b22.J(vna.J().getName(), (ica)a2).J()).toString());
            n11 = Math.max(n11, d2);
        }
        object = object.subList(uSa.E, Math.min(object.size(), Fua.J));
        int n12 = n9 = object.size();
        int d2 = vRa.d;
        int n13 = n12;
        while (n13 > kTa.j) {
            n13 = (n9 + ++d2 - vRa.d) / d2;
        }
        int n14 = b22 = sma.M.d() || sma.M.J().J().l() ? vRa.d : uSa.E;
        if (a2 != null) {
            if (a2.J() == kBa.HEARTS) {
                n8 = Jsa.ha;
                n7 = d2;
            } else {
                n8 = n11;
                n7 = d2;
            }
        } else {
            n8 = uSa.E;
            n7 = d2;
        }
        if (b22 != 0) {
            n6 = WOa.fa;
            n5 = n10;
        } else {
            n6 = uSa.E;
            n5 = n10;
        }
        n11 = Math.min(n7 * (n6 + n5 + n8 + uua.s), (int)(c2 - vpa.o)) / d2;
        void var11_16 = c2 / uqa.g - (n11 * d2 + (d2 - vRa.d) * tTa.h) / uqa.g;
        int n15 = NTa.C;
        d2 = n11 * d2 + (d2 - vRa.d) * tTa.h;
        List list = null;
        List list2 = null;
        if (sma.J != null) {
            list = sma.M.Ea.J(sma.J.l(), (int)(c2 - vpa.o));
            Iterator iterator3 = iterator = list.iterator();
            while (iterator3.hasNext()) {
                string = (String)iterator.next();
                d2 = Math.max(d2, sma.M.Ea.J(string));
                iterator3 = iterator;
            }
        }
        if (sma.j != null) {
            list2 = sma.M.Ea.J(sma.j.l(), (int)(c2 - vpa.o));
            iterator = list2.iterator();
            Iterator iterator4 = iterator;
            while (iterator4.hasNext()) {
                string = (String)iterator.next();
                d2 = Math.max(d2, sma.M.Ea.J(string));
                iterator4 = iterator;
            }
        }
        if (list != null) {
            Sma.J((int)(c2 / uqa.g - d2 / uqa.g - vRa.d), (int)(n15 - vRa.d), (int)(c2 / uqa.g + d2 / uqa.g + vRa.d), (int)(n15 + list.size() * sma.M.Ea.u), (int)ypa.L);
            iterator = list.iterator();
            Iterator iterator5 = iterator;
            while (iterator5.hasNext()) {
                string = (String)iterator.next();
                iterator5 = iterator;
                Sma sma2 = sma;
                n4 = sma2.M.Ea.J(string);
                sma2.M.Ea.J(string, (float)(c2 / uqa.g - n4 / uqa.g), (float)n15, pua.o);
                n15 += sma.M.Ea.u;
            }
            ++n15;
        }
        Sma.J((int)(c2 / uqa.g - d2 / uqa.g - vRa.d), (int)(n15 - vRa.d), (int)(c2 / uqa.g + d2 / uqa.g + vRa.d), (int)(n15 + n12 * WOa.fa), (int)ypa.L);
        int n16 = n3 = uSa.E;
        while (n16 < n9) {
            int n17 = n3 / n12;
            n4 = n3 % n12;
            void var13_19 = var11_16 + n17 * n11 + n17 * tTa.h;
            int n18 = n15 + n4 * WOa.fa;
            void v10 = var13_19;
            Sma.J((int)v10, (int)n18, (int)(v10 + n11), (int)(n18 + Yqa.i), (int)STa.Ha);
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            uKa.K();
            uKa.B();
            uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
            if (n3 < object.size()) {
                void var22_33;
                void v11;
                int n19;
                Vna vna = (Vna)object.get(n3);
                String string2 = sma.J(vna);
                GameProfile gameProfile = vna.J();
                if (b22 != 0) {
                    Sx sx = sma.M.Ta.J(gameProfile.getId());
                    n19 = sx != null && sx.J(pda.CAPE) && (gameProfile.getName().equals(NSa.W) || gameProfile.getName().equals(iSa.Z)) ? vRa.d : uSa.E;
                    sma.M.J().J(vna.J());
                    int n20 = Yqa.i + (n19 != 0 ? Yqa.i : uSa.E);
                    int n21 = Yqa.i * (n19 != 0 ? pua.o : vRa.d);
                    KA.J((int)var13_19, (int)n18, (float)Qsa.k, (float)n20, (int)Yqa.i, (int)n21, (int)Yqa.i, (int)Yqa.i, (float)EPa.r, (float)EPa.r);
                    if (sx != null && sx.J(pda.HAT)) {
                        n20 = Yqa.i + (n19 != 0 ? Yqa.i : uSa.E);
                        n21 = Yqa.i * (n19 != 0 ? pua.o : vRa.d);
                        KA.J((int)var13_19, (int)n18, (float)ZRa.l, (float)n20, (int)Yqa.i, (int)n21, (int)Yqa.i, (int)Yqa.i, (float)EPa.r, (float)EPa.r);
                    }
                    var13_19 += 9;
                }
                if (vna.J() == Daa.SPECTATOR) {
                    string2 = pY.ITALIC + string2;
                    v11 = a2;
                    sma.M.Ea.J(string2, (float)var13_19, (float)n18, Zta.T);
                } else {
                    sma.M.Ea.J(string2, (float)var13_19, (float)n18, pua.o);
                    v11 = a2;
                }
                if (v11 != null && vna.J() != Daa.SPECTATOR && (n19 = (var22_33 = var13_19 + n10 + vRa.d) + n8) - var22_33 > tTa.h) {
                    sma.J((ica)a2, n18, gameProfile.getName(), (int)var22_33, n19, vna);
                }
                sma.J(n11, (int)(var13_19 - (b22 != 0 ? WOa.fa : uSa.E)), n18, vna);
            }
            n16 = ++n3;
        }
        if (list2 != null) {
            Iterator iterator6;
            n15 = n15 + n12 * WOa.fa + vRa.d;
            Sma.J((int)(c2 / uqa.g - d2 / uqa.g - vRa.d), (int)(n15 - vRa.d), (int)(c2 / uqa.g + d2 / uqa.g + vRa.d), (int)(n15 + list2.size() * sma.M.Ea.u), (int)ypa.L);
            Iterator iterator7 = iterator6 = list2.iterator();
            while (iterator7.hasNext()) {
                String string3 = (String)iterator6.next();
                iterator7 = iterator6;
                Sma sma3 = sma;
                n4 = sma3.M.Ea.J(string3);
                sma3.M.Ea.J(string3, (float)(c2 / uqa.g - n4 / uqa.g), (float)n15, pua.o);
                n15 += sma.M.Ea.u;
            }
        }
    }

    public void f(ld ld2) {
        Sma b2 = ld2;
        Sma a2 = this;
        a2.j = b2;
    }

    /*
     * WARNING - void declaration
     */
    public Sma(Kpa kpa2, gna gna2) {
        void b2;
        Sma a2;
        Sma c2 = gna2;
        Sma sma = a2 = this;
        sma.M = b2;
        sma.A = c2;
    }

    public boolean J() {
        Sma a2;
        return a2.I;
    }

    public void J() {
        Sma a2;
        Sma sma = a2;
        sma.J = null;
        sma.j = null;
    }

    public void J(ld ld2) {
        Sma b2 = ld2;
        Sma a2 = this;
        a2.J = b2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void J(ica ica2, int n2, String string, int n3, int n4, Vna vna) {
        void e2;
        int n5;
        int g2;
        float f2;
        void c2;
        int n6;
        int n7;
        int d22;
        void a22;
        int f222;
        Sma sma;
        block16: {
            void b2;
            String d22;
            void f222;
            sma = this;
            void v0 = f222;
            f222 = f222.J().J(d22, (ica)v0).J();
            if (v0.J() == kBa.HEARTS) {
                float f3;
                Sma sma2 = sma;
                sma2.M.J().J((ResourceLocation)A);
                if (sma2.k == a22.l()) {
                    if (f222 < a22.l()) {
                        void v2 = a22;
                        v2.l(Kpa.J());
                        v2.J((long)(sma.A.J() + kTa.j));
                    } else if (f222 > a22.l()) {
                        void v3 = a22;
                        v3.l(Kpa.J());
                        v3.J((long)(sma.A.J() + NTa.C));
                    }
                }
                if (Kpa.J() - a22.J() > asa.fa || sma.k != a22.l()) {
                    void v4 = a22;
                    v4.f(f222);
                    v4.J(f222);
                    a22.l(Kpa.J());
                }
                void v5 = a22;
                int n8 = f222;
                a22.f(sma.k);
                v5.f(n8);
                d22 = Oz.f((float)((float)Math.max(n8, a22.J()) / kta.v));
                n7 = Math.max(Oz.f((float)(f222 / uqa.g)), Math.max(Oz.f((float)(a22.J() / uqa.g)), NTa.C));
                int n9 = n6 = v5.f() > (long)sma.A.J() && (a22.f() - (long)sma.A.J()) / Bra.I % kra.G == dQa.Ga ? vRa.d : uSa.E;
                if (d22 <= 0) return;
                f2 = Math.min((float)(b2 - c2 - AQa.P) / (float)n7, kPa.S);
                if (f3 > vQa.q) {
                    n5 = g2 = d22;
                    break block16;
                } else {
                    float g2 = Oz.J((float)((float)f222 / eta.e), (float)JPa.N, (float)pqa.r);
                    int a22 = (int)((pqa.r - g2) * NQa.Y) << ERa.C | (int)(g2 * NQa.Y) << Yqa.i;
                    String string2 = new StringBuilder().insert(3 ^ 3, Mqa.y).append((float)f222 / kta.v).toString();
                    if (b2 - sma.M.Ea.J(new StringBuilder().insert(5 >> 3, string2).append(yOa.X).toString()) >= c2) {
                        string2 = new StringBuilder().insert(3 & 4, string2).append(yOa.X).toString();
                    }
                    String string3 = string2;
                    sma.M.Ea.J(string3, (float)((b2 + c2) / uqa.g - sma.M.Ea.J(string3) / uqa.g), (float)e2, a22);
                    return;
                }
            }
            String string4 = d22 = pY.YELLOW + Mqa.y + f222;
            sma.M.Ea.J(string4, (float)(b2 - sma.M.Ea.J(string4)), (float)e2, pua.o);
            return;
        }
        while (n5 < n7) {
            sma.J((float)c2 + (float)g2 * f2, (float)e2, n6 != 0 ? kTa.g : ERa.C, uSa.E, WOa.fa, WOa.fa);
            n5 = ++g2;
        }
        int n10 = g2 = uSa.E;
        while (n10 < d22) {
            sma.J((float)c2 + (float)g2 * f2, (float)e2, n6 != 0 ? kTa.g : ERa.C, uSa.E, WOa.fa, WOa.fa);
            if (n6 != 0) {
                if (g2 * uqa.g + vRa.d < a22.J()) {
                    sma.J((float)c2 + (float)g2 * f2, (float)e2, NPa.e, uSa.E, WOa.fa, WOa.fa);
                }
                if (g2 * uqa.g + vRa.d == a22.J()) {
                    sma.J((float)c2 + (float)g2 * f2, (float)e2, vPa.Ka, uSa.E, WOa.fa, WOa.fa);
                }
            }
            if (g2 * uqa.g + vRa.d < f222) {
                sma.J((float)c2 + (float)g2 * f2, (float)e2, g2 >= NTa.C ? rRa.f : FPa.F, uSa.E, WOa.fa, WOa.fa);
            }
            if (g2 * uqa.g + vRa.d == f222) {
                sma.J((float)c2 + (float)g2 * f2, (float)e2, g2 >= NTa.C ? SPa.l : tua.w, uSa.E, WOa.fa, WOa.fa);
            }
            n10 = ++g2;
        }
    }

    public String J(Vna vna) {
        Sma b2 = vna;
        Sma a2 = this;
        if (b2.J() != null) {
            return b2.J().l();
        }
        return mca.J((Yaa)b2.J(), (String)b2.J().getName());
    }
}

