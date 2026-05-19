/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AY
 *  Bsa
 *  CR
 *  Cra
 *  ERa
 *  Ez
 *  FPa
 *  FTa
 *  Fpa
 *  Gl
 *  HA
 *  Hda
 *  Hma
 *  JPa
 *  JQa
 *  KA
 *  Kna
 *  Kpa
 *  LQa
 *  Lra
 *  MQa
 *  Mda
 *  NPa
 *  NQa
 *  NTa
 *  Oz
 *  QFa
 *  QSa
 *  Qsa
 *  Sqa
 *  Ssa
 *  TPa
 *  Tpa
 *  Vua
 *  WQa
 *  Wsa
 *  XE
 *  XTa
 *  YSa
 *  Yaa
 *  Ypa
 *  ZRa
 *  Zta
 *  aKa
 *  aSa
 *  asa
 *  bSa
 *  bpa
 *  bqa
 *  cQa
 *  cRa
 *  dQa
 *  eAa
 *  fTa
 *  gna
 *  ica
 *  if
 *  jba
 *  kPa
 *  kpa
 *  kta
 *  lPa
 *  ld
 *  lqa
 *  mca
 *  mka
 *  nLa
 *  pKa
 *  pY
 *  pma
 *  pqa
 *  psa
 *  pua
 *  qca
 *  sMa
 *  uKa
 *  uX
 *  ura
 *  uw
 *  vL
 *  vO
 *  vPa
 *  vQa
 *  vRa
 *  wOa
 *  wra
 *  xKa
 *  ysa
 */
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class gna_1
extends KA {
    private int v;
    private final xKa o;
    public static final ResourceLocation h = new ResourceLocation(wsa.z);
    public float K;
    private final Kpa H;
    private boolean c;
    private int B;
    private final mna d;
    private int a;
    private static final String b = "CL_00000661";
    private static final ResourceLocation l = new ResourceLocation(LQa.aa);
    private String e;
    private int G;
    private int D;
    private String f;
    private long F;
    private int g;
    private static final ResourceLocation L = new ResourceLocation(POa.e);
    private int E;
    private int m;
    private String C;
    private final Random i;
    private int M;
    private final Hma k;
    private final pma j;
    private final Sma J;
    private Mda A;
    private long I;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void J(int var1_3, int var2_5, int var3_6, float var4_7, Sx var5_8) {
        block7: {
            v0 = this /* !! */ ;
            this /* !! */  = var5_8;
            a = v0;
            e = f /* !! */ .K.j[e];
            if (e == null) break block7;
            b = (float)e.i - b;
            if (v1 > JPa.N) {
                uKa.e();
                f = pqa.r + b / eua.C;
                uKa.J((float)((float)(d + Yqa.i)), (float)((float)(c + lqa.s)), (float)JPa.N);
                uKa.l((float)(pqa.r / f), (float)((f + pqa.r) / kta.v), (float)pqa.r);
                uKa.J((float)((float)(-(d + Yqa.i))), (float)((float)(-(c + lqa.s))), (float)JPa.N);
            }
            if ((f = e.J()) == null) ** GOTO lbl35
            var6_9 = f.J(Gta.q);
            if (var6_9 != 0) {
                uKa.L();
                uKa.u();
                var7_10 = f.J(kra.c);
                if (var7_10 == aSa.V) {
                    v2 = d;
                    gna_1.J((int)v2, (int)c, (int)(v2 + ERa.C), (int)(c + ERa.C), (int)gna_1.J(var6_9, (boolean)uSa.E));
                } else {
                    a.J((int)d, (int)c, ERa.C, Zta.ba * var7_10, gna_1.J(var6_9, (boolean)uSa.E));
                }
                uKa.P();
                uKa.J();
                v3 = a;
            } else {
                var7_11 = f.J(wOa.L);
                if (var7_11 != 0) {
                    uKa.L();
                    uKa.u();
                    a.J((int)d, (int)c, ERa.C, gna_1.J(var7_11, (boolean)vRa.d));
                    uKa.P();
                    uKa.J();
                }
lbl35:
                // 4 sources

                v3 = a;
            }
            v3.o.f(e, (int)d, (int)c);
            if (b > JPa.N) {
                uKa.D();
            }
            v4 = a;
            v4.o.J(v4.H.Ea, e, (int)d, (int)c);
        }
    }

    public void J(String string) {
        Object b2 = string;
        gna_1 a2 = this;
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = b2;
        a2.J(oha.J(BQa.E, objectArray), vRa.d != 0);
    }

    /*
     * WARNING - void declaration
     */
    private void J(ica ica2, sMa sMa2) {
        void a2;
        gna_1 gna_12;
        Object object;
        void b2;
        gna_1 gna_13 = this;
        qca qca2 = b2.J();
        Collection collection = qca2.J((ica)b2);
        Object c22 = Lists.newArrayList(Iterables.filter(collection, new KMa((gna)gna_13)));
        if (((ArrayList)c22).size() > Ypa.A) {
            object = Lists.newArrayList(Iterables.skip(c22, collection.size() - Ypa.A));
            gna_12 = gna_13;
        } else {
            object = c22;
            gna_12 = gna_13;
        }
        int n2 = gna_12.J().J(b2.f());
        c22 = ((ArrayList)object).iterator();
        Object object2 = c22;
        while (object2.hasNext()) {
            Object e2 = c22.next();
            mca mca2 = qca2.l(((jba)e2).J());
            String string = mca.J((Yaa)mca2, (String)((jba)e2).J()) + Xpa.E + pY.RED + ((jba)e2).J();
            n2 = Math.max(n2, gna_13.J().J(string));
            object2 = c22;
        }
        int c22 = ((ArrayList)object).size() * gna_13.J().u;
        int n3 = a2.J() / uqa.g + c22 / yRa.d;
        int n4 = yRa.d;
        int n5 = a2.f() - n2 - n4;
        c22 = uSa.E;
        Iterator iterator = ((ArrayList)object).iterator();
        while (iterator.hasNext()) {
            Object object3 = iterator.next();
            String string = mca.J((Yaa)qca2.l(((jba)object3).J()), (String)((jba)object3).J());
            object3 = pY.RED + Mqa.y + ((jba)object3).J();
            int n6 = n3 - ++c22 * gna_13.J().u;
            int n7 = a2.f() - n4 + uqa.g;
            int n8 = n6;
            gna_1.J((int)(n5 - uqa.g), (int)n8, (int)n7, (int)(n8 + gna_13.J().u), (int)zOa.fa);
            gna_13.J().J(string, n5, n6, STa.Ha);
            Object object4 = object3;
            gna_13.J().J(object4, n7 - gna_13.J().J(object4), n6, STa.Ha);
            if (c22 != ((ArrayList)object).size()) continue;
            object3 = b2.f();
            gna_1.J((int)(n5 - uqa.g), (int)(n6 - gna_13.J().u - vRa.d), (int)n7, (int)(n6 - vRa.d), (int)DPa.ga);
            gna_1.J((int)(n5 - uqa.g), (int)(n6 - vRa.d), (int)n7, (int)n6, (int)zOa.fa);
            Object object5 = object3;
            gna_13.J().J(object5, n5 + n2 / uqa.g - gna_13.J().J(object5) / uqa.g, n6 - gna_13.J().u, STa.Ha);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void C(sMa sMa2) {
        gna_1 gna_12;
        gna_1 gna_13 = gna_12 = this;
        gna_13.H.U.J(sSa.Ha);
        if (gna_13.E > 0 && gna_12.A != null) {
            int n2;
            void a22;
            gna_1 gna_14 = gna_12;
            Object b2 = gna_14.A.J();
            if (gna_14.A.l()) {
                b2 = pY.ITALIC + (String)b2;
            }
            void v2 = a22;
            int a22 = (v2.f() - gna_12.J().J((String)b2)) / uqa.g;
            int n3 = v2.J() - lPa.p;
            n3 += uw.T;
            if (!gna_12.H.L.d()) {
                n3 += 14;
            }
            if ((n2 = (int)((float)gna_12.E * Fpa.q / FRa.Ga)) > osa.Ja) {
                n2 = osa.Ja;
            }
            if (n2 > 0) {
                uKa.e();
                uKa.B();
                uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
                gna_12.J().J((String)b2, (float)a22, (float)n3, pua.o + (n2 << osa.c));
                uKa.k();
                uKa.D();
            }
        }
        gna_12.H.U.f();
    }

    private void l(sMa sMa2) {
        aKa aKa2;
        gna_1 b2 = sMa2;
        gna_1 a2 = this;
        uKa.u();
        uKa.J(uSa.E != 0);
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        uKa.c();
        a2.H.J().J(L);
        pKa pKa2 = pKa.J();
        aKa aKa3 = aKa2 = pKa2.J();
        aKa aKa4 = aKa2;
        aKa4.J(XTa.W, mka.A);
        aKa4.J(aSa.V, (double)b2.J(), AQa.K).J(aSa.V, oua.i).M();
        aKa3.J((double)b2.f(), (double)b2.J(), AQa.K).J(oua.i, oua.i).M();
        aKa3.J((double)b2.f(), aSa.V, AQa.K).J(oua.i, aSa.V).M();
        aKa3.J(aSa.V, aSa.V, AQa.K).J(aSa.V, aSa.V).M();
        pKa2.J();
        uKa.J(vRa.d != 0);
        uKa.J();
        uKa.K();
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
    }

    public pma J() {
        gna_1 a2;
        return a2.j;
    }

    public gna_1(Kpa kpa2) {
        gna_1 a2;
        gna_1 b2 = kpa2;
        gna_1 gna_12 = a2 = this;
        gna_1 gna_13 = a2;
        a2.i = new Random();
        gna_13.C = Mqa.y;
        a2.K = pqa.r;
        a2.f = Mqa.y;
        a2.e = Mqa.y;
        a2.G = uSa.E;
        a2.B = uSa.E;
        a2.I = nqa.i;
        a2.F = nqa.i;
        gna_12.H = b2;
        a2.o = b2.J();
        gna_12.k = new Hma((Kpa)b2);
        a2.d = new mna((Kpa)b2);
        a2.j = new pma((Kpa)b2);
        a2.J = new Sma((Kpa)b2, (gna)a2);
        a2.J();
    }

    /*
     * WARNING - void declaration
     */
    private void f(float f2, sMa sMa2) {
        void a2;
        aKa aKa2;
        float c2 = f2;
        gna_1 b2 = this;
        if (c2 < pqa.r) {
            float f3 = c2;
            c2 = f3 * f3;
            c2 *= c2;
            c2 = c2 * xSa.la + psa.N;
        }
        uKa.c();
        uKa.u();
        uKa.J(uSa.E != 0);
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)c2);
        gna_1 gna_12 = b2;
        gna_12.H.J().J(WKa.C);
        KLa kLa2 = gna_12.H.J().J().J(QFa.rF.J());
        c2 = kLa2.l();
        float f4 = kLa2.J();
        float f5 = kLa2.C();
        float f6 = kLa2.f();
        pKa pKa2 = pKa.J();
        aKa aKa3 = aKa2 = pKa2.J();
        aKa aKa4 = aKa2;
        aKa4.J(XTa.W, mka.A);
        aKa4.J(aSa.V, (double)a2.J(), AQa.K).J((double)c2, (double)f6).M();
        aKa3.J((double)a2.f(), (double)a2.J(), AQa.K).J((double)f5, (double)f6).M();
        aKa3.J((double)a2.f(), aSa.V, AQa.K).J((double)f5, (double)f4).M();
        aKa3.J(aSa.V, aSa.V, AQa.K).J((double)c2, (double)f4).M();
        pKa2.J();
        uKa.J(vRa.d != 0);
        uKa.J();
        uKa.K();
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
    }

    /*
     * WARNING - void declaration
     */
    public void f(sMa sMa2) {
        void a2;
        gna_1 gna_12;
        gna_1 gna_13;
        gna_1 gna_14 = gna_13 = this;
        gna_14.H.U.J(tSa.fa);
        Object b2 = Mqa.y;
        if (gna_14.H.Ta.l() >= ZRa.J) {
            b2 = oha.J(NPa.X, new Object[uSa.E]);
            gna_12 = gna_13;
        } else {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = Ez.J((int)((int)(ZRa.J - gna_13.H.Ta.l())));
            b2 = oha.J(cRa.Ka, objectArray);
            gna_12 = gna_13;
        }
        int n2 = gna_12.J().J((String)b2);
        gna_13.J().J((String)b2, (float)(a2.f() - n2 - NTa.C), eua.C, pua.o);
        gna_13.H.U.f();
    }

    public void C() {
        block3: {
            gna_1 a2;
            block5: {
                gna_1 gna_12;
                gna_1 gna_13;
                block7: {
                    block6: {
                        block4: {
                            gna_13 = this;
                            if (gna_13.m > 0) {
                                gna_13.m -= vRa.d;
                            }
                            if (gna_13.g > 0) {
                                gna_1 gna_14 = gna_13;
                                gna_14.g -= vRa.d;
                                if (gna_14.g <= 0) {
                                    gna_1 gna_15 = gna_13;
                                    gna_15.f = Mqa.y;
                                    gna_15.e = Mqa.y;
                                }
                            }
                            gna_1 gna_16 = gna_13;
                            gna_16.a += vRa.d;
                            if (gna_16.H.c == null) break block3;
                            a2 = gna_13.H.c.K.f();
                            if (a2 != null) break block4;
                            gna_12 = gna_13;
                            gna_13.E = uSa.E;
                            break block5;
                        }
                        if (gna_13.A == null || a2.J() != gna_13.A.J() || !Mda.f((Mda)a2, (Mda)gna_13.A) || !a2.d() && a2.J() != gna_13.A.J()) break block6;
                        if (gna_13.E <= 0) break block7;
                        gna_1 gna_17 = gna_13;
                        gna_12 = gna_17;
                        gna_17.E -= vRa.d;
                        break block5;
                    }
                    gna_13.E = wra.P;
                }
                gna_12 = gna_13;
            }
            gna_12.A = a2;
        }
    }

    public Sma J() {
        gna_1 a2;
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2) {
        int a2222;
        gna_1 gna_12;
        gna_1 gna_13;
        int n2;
        float f3;
        void a2222;
        gna_1 gna_14;
        gna_1 gna_15 = this;
        sMa sMa2 = new sMa(gna_15.H);
        int n3 = sMa2.f();
        int n4 = sMa2.J();
        uKa.B();
        if (Config.U()) {
            gna_1 gna_16 = gna_15;
            gna_14 = gna_16;
            gna_16.J(gna_16.H.c.J((float)a2222), sMa2);
        } else {
            uKa.J();
            uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
            gna_14 = gna_15;
        }
        gna_1 b222 = gna_14.H.c.K.l(yRa.d);
        if (gna_15.H.z.ld == 0 && b222 != null && b222.J() == eAa.J((Block)QFa.s)) {
            gna_15.l(sMa2);
        }
        OT.i.F.J(CR.BEFORE_HUD);
        if (!gna_15.H.c.J(Hda.D)) {
            float f4;
            float b222 = gna_15.H.c.x + (gna_15.H.c.J - gna_15.H.c.x) * a2222;
            if (f4 > JPa.N) {
                gna_15.f(b222, sMa2);
            }
        }
        if (gna_15.H.L.f()) {
            gna_15.d.J(sMa2, (float)a2222);
        } else {
            gna_15.J(sMa2, (float)a2222);
        }
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        gna_1 gna_17 = gna_15;
        gna_17.H.J().J((ResourceLocation)A);
        uKa.B();
        if (gna_17.J() && gna_15.H.z.ld < vRa.d) {
            uKa.J((int)qQa.C, (int)Wqa.w, (int)vRa.d, (int)uSa.E);
            uKa.K();
            if (!uw.b) {
                gna_15.f(n3 / uqa.g - XTa.W, n4 / uqa.g - XTa.W, uSa.E, uSa.E, ERa.C, ERa.C);
            }
        }
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        gna_1 gna_18 = gna_15;
        gna_18.H.U.J(WQa.R);
        gna_18.f();
        gna_18.H.U.f();
        if (gna_18.H.L.d()) {
            gna_15.J(sMa2);
        }
        uKa.k();
        if (gna_15.H.c.H() > 0) {
            float f5;
            gna_1 gna_19 = gna_15;
            gna_19.H.U.J(fqa.ha);
            uKa.u();
            uKa.c();
            int b222 = gna_19.H.c.H();
            f3 = (float)b222 / QTa.G;
            if (f5 > pqa.r) {
                f3 = pqa.r - (float)(b222 - ySa.T) / FRa.Ga;
            }
            n2 = (int)(Sqa.q * f3) << osa.c | dsa.ha;
            gna_1.J((int)uSa.E, (int)uSa.E, (int)n3, (int)n4, (int)n2);
            uKa.K();
            uKa.J();
            gna_15.H.U.f();
        }
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        int b222 = n3 / uqa.g - rRa.R;
        gna_1 gna_110 = gna_15;
        if (gna_15.H.c.T()) {
            gna_110.J(sMa2, b222);
            gna_13 = gna_15;
        } else {
            if (gna_110.H.L.e()) {
                gna_15.f(sMa2, b222);
            }
            gna_13 = gna_15;
        }
        if (gna_13.H.z.D && !gna_15.H.L.f()) {
            gna_1 gna_111 = gna_15;
            gna_12 = gna_111;
            gna_111.C(sMa2);
        } else {
            if (gna_15.H.c.t()) {
                gna_15.d.J(sMa2);
            }
            gna_12 = gna_15;
        }
        if (gna_12.H.A()) {
            gna_15.f(sMa2);
        }
        if (gna_15.H.z.t) {
            gna_15.k.J(sMa2);
        }
        if (gna_15.m > 0) {
            gna_1 gna_112 = gna_15;
            gna_112.H.U.J(Ora.l);
            f3 = (float)gna_112.m - a2222;
            n2 = (int)(f3 * NQa.Y / eta.e);
            if (n2 > osa.Ja) {
                n2 = osa.Ja;
            }
            if (n2 > Yqa.i) {
                uKa.e();
                uKa.J((float)(n3 / uqa.g), (float)(n4 - WPa.L), (float)JPa.N);
                uKa.B();
                uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
                b222 = Wsa.K;
                if (gna_15.c) {
                    b222 = Oz.f((float)(f3 / SPa.b), (float)ZSa.q, (float)Ora.D) & Wsa.K;
                }
                gna_15.J().J(gna_15.C, -gna_15.J().J(gna_15.C) / uqa.g, pta.a, b222 + (n2 << osa.c & gsa.X));
                uKa.k();
                uKa.D();
            }
            gna_15.H.U.f();
        }
        if (gna_15.g > 0) {
            gna_1 gna_113 = gna_15;
            gna_113.H.U.J(NSa.Ha);
            f3 = (float)gna_113.g - a2222;
            n2 = osa.Ja;
            gna_1 gna_114 = gna_15;
            if (gna_113.g > gna_114.M + gna_114.D) {
                gna_1 gna_115 = gna_15;
                float b222 = (float)(gna_115.v + gna_115.D + gna_15.M) - f3;
                n2 = (int)(b222 * NQa.Y / (float)gna_15.v);
            }
            gna_1 gna_116 = gna_15;
            if (gna_116.g <= gna_116.M) {
                n2 = (int)(f3 * NQa.Y / (float)gna_15.M);
            }
            if ((n2 = Oz.f((int)n2, (int)uSa.E, (int)osa.Ja)) > Yqa.i) {
                uKa.e();
                uKa.J((float)(n3 / uqa.g), (float)(n4 / uqa.g), (float)JPa.N);
                uKa.B();
                uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
                uKa.e();
                uKa.l((float)YSa.G, (float)YSa.G, (float)YSa.G);
                int b222 = n2 << osa.c & gsa.X;
                gna_15.J().l(gna_15.f, (float)(-gna_15.J().J(gna_15.f) / uqa.g), Cra.fa, pua.o | b222, vRa.d != 0);
                uKa.D();
                uKa.e();
                uKa.l((float)kta.v, (float)kta.v, (float)kta.v);
                gna_15.J().l(gna_15.e, (float)(-gna_15.J().J(gna_15.e) / uqa.g), eua.C, pua.o | b222, vRa.d != 0);
                uKa.D();
                uKa.k();
                uKa.D();
            }
            gna_15.H.U.f();
        }
        qca qca2 = gna_15.H.Ta.J();
        ica ica2 = null;
        Object b222 = qca2.l(gna_15.H.c.J());
        if (b222 != null && (a2222 = b222.J().getColorIndex()) >= 0) {
            ica2 = qca2.J(yRa.d + a2222);
        }
        ica ica3 = a2222 = ica2 != null ? ica2 : qca2.J(vRa.d);
        if (a2222 != null) {
            gna_15.J(a2222, sMa2);
        }
        OT.i.F.J(CR.BEFORE_CHAT);
        uKa.B();
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        uKa.c();
        uKa.e();
        uKa.J((float)JPa.N, (float)(n4 - QSa.p), (float)JPa.N);
        gna_1 gna_117 = gna_15;
        gna_117.H.U.J(IPa.Ja);
        gna_1 gna_118 = gna_15;
        gna_117.j.l(gna_118.a);
        gna_118.H.U.f();
        uKa.D();
        ica a2222 = qca2.J(uSa.E);
        if (uw.q || !gna_15.H.z.q.isKeyDown() || gna_15.H.d() && gna_15.H.c.F.J().size() <= vRa.d && a2222 == null) {
            gna_15.J.J(uSa.E != 0);
        } else {
            gna_1 gna_119 = gna_15;
            gna_119.J.J(vRa.d != 0);
            gna_119.J.J(n3, qca2, a2222);
        }
        OT.i.F.J(CR.HUD);
        vO.J();
        if (vO.I.J() > 0) {
            a2222 = new sMa(gna_15.H);
            float f6 = vO.I.J() / (float)vO.J();
            ica ica4 = a2222;
            int a2222 = (int)((float)ica4.f() * (vQa.q - kta.v * f6));
            int n5 = (int)((float)ica4.J() * (vQa.q - kta.v * f6));
            n3 = ica4.f() / uqa.g - a2222 / uqa.g;
            n4 = ica4.J() / uqa.g - n5 / uqa.g;
            b222 = vO.J;
            uKa.f((float)((Color)b222).getRed(), (float)((Color)b222).getGreen(), (float)((Color)b222).getBlue(), (float)((Color)b222).getAlpha());
            uKa.K();
            uKa.B();
            uKa.f((int)vRa.d, (int)Wqa.w);
            gna_15.H.J().J(h);
            if.J((double)n3, (double)n4, (double)a2222, (double)n5);
            uKa.k();
        }
        WF.A();
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        uKa.L();
        uKa.K();
    }

    /*
     * WARNING - void declaration
     */
    public void J(ld ld2, boolean bl2) {
        void b2;
        boolean c2 = bl2;
        gna_1 a2 = this;
        a2.J(b2.f(), c2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(sMa sMa2) {
        gna_1 gna_12 = this;
        if (gna_12.H.J() instanceof Sx) {
            vL vL2;
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            void a22;
            int n7;
            Sx sx2 = (Sx)gna_12.H.J();
            int n8 = Oz.f((float)sx2.f());
            int n9 = n7 = gna_12.F > (long)gna_12.a && (gna_12.F - (long)gna_12.a) / Bra.I % kra.G == dQa.Ga ? vRa.d : uSa.E;
            if (n8 < gna_12.G && sx2.Fa > 0) {
                gna_12.I = Kpa.J();
                gna_12.F = gna_12.a + kTa.j;
            } else if (n8 > gna_12.G && sx2.Fa > 0) {
                gna_12.I = Kpa.J();
                gna_12.F = gna_12.a + NTa.C;
            }
            if (Kpa.J() - gna_12.I > asa.fa) {
                gna_1 gna_13 = gna_12;
                gna_13.G = n8;
                gna_13.B = n8;
                gna_13.I = Kpa.J();
            }
            gna_1 gna_14 = gna_12;
            gna_14.G = n8;
            int n10 = gna_14.B;
            gna_14.i.setSeed((long)gna_12.a * tTa.B);
            int n11 = uSa.E;
            Sx sx3 = sx2;
            uX uX2 = sx3.J();
            int n12 = uX2.J();
            int n13 = uX2.f();
            void v5 = a22;
            int a22 = v5.f() / uqa.g - rRa.R;
            int n14 = v5.f() / uqa.g + rRa.R;
            int n15 = v5.J() - CRa.L;
            float f2 = (float)sx3.J(Kha.M).f();
            float f3 = sx3.A();
            int n16 = Oz.f((float)((f2 + f3) / kta.v / FRa.Ga));
            int n17 = Math.max(NTa.C - (n16 - uqa.g), yRa.d);
            n16 = n15 - (n16 - vRa.d) * n17 - NTa.C;
            float f4 = f3;
            int n18 = sx3.f();
            int n19 = pua.o;
            if (sx3.J(Hda.t)) {
                n19 = gna_12.a % Oz.f((float)(f2 + eua.C));
            }
            gna_12.H.U.J(Ypa.R);
            if (!uw.F) {
                int n20 = n6 = uSa.E;
                while (n20 < NTa.C) {
                    if (n18 > 0) {
                        n5 = a22 + n6 * Yqa.i;
                        if (n6 * uqa.g + vRa.d < n18) {
                            gna_12.f(n5, n16, Tpa.z, WOa.fa, WOa.fa, WOa.fa);
                        }
                        if (n6 * uqa.g + vRa.d == n18) {
                            gna_12.f(n5, n16, kTa.g, WOa.fa, WOa.fa, WOa.fa);
                        }
                        if (n6 * uqa.g + vRa.d > n18) {
                            gna_12.f(n5, n16, ERa.C, WOa.fa, WOa.fa, WOa.fa);
                        }
                    }
                    n20 = ++n6;
                }
            }
            gna_12.H.U.f(fTa.U);
            if (!uw.v) {
                int n21 = n6 = Oz.f((float)((f2 + f3) / kta.v)) - vRa.d;
                while (n21 >= 0) {
                    n5 = ERa.C;
                    if (sx2.J(Hda.c)) {
                        n5 += 36;
                    } else if (sx2.J(Hda.H)) {
                        n5 += 72;
                    }
                    n18 = uSa.E;
                    if (n7 != 0) {
                        n18 = vRa.d;
                    }
                    n4 = Oz.f((float)((float)(n6 + vRa.d) / FRa.Ga)) - vRa.d;
                    int b2 = a22 + n6 % NTa.C * Yqa.i;
                    n3 = n15 - n4 * n17;
                    if (n8 <= AQa.P) {
                        n3 += gna_12.i.nextInt(uqa.g);
                    }
                    if (n6 == n19) {
                        n3 -= 2;
                    }
                    n2 = uSa.E;
                    if (sx2.j.J().d()) {
                        n2 = tTa.h;
                    }
                    gna_12.f(b2, n3, ERa.C + n18 * WOa.fa, WOa.fa * n2, WOa.fa, WOa.fa);
                    if (n7 != 0) {
                        if (n6 * uqa.g + vRa.d < n10) {
                            gna_12.f(b2, n3, n5 + GPa.C, WOa.fa * n2, WOa.fa, WOa.fa);
                        }
                        if (n6 * uqa.g + vRa.d == n10) {
                            gna_12.f(b2, n3, n5 + Ssa.u, WOa.fa * n2, WOa.fa, WOa.fa);
                        }
                    }
                    if (f4 <= JPa.N) {
                        if (n6 * uqa.g + vRa.d < n8) {
                            gna_12.f(b2, n3, n5 + Qsa.Ha, WOa.fa * n2, WOa.fa, WOa.fa);
                        }
                        if (n6 * uqa.g + vRa.d == n8) {
                            gna_12.f(b2, n3, n5 + wra.e, WOa.fa * n2, WOa.fa, WOa.fa);
                        }
                    } else {
                        float f5;
                        if (f4 == f3 && f3 % kta.v == pqa.r) {
                            f5 = f4;
                            gna_12.f(b2, n3, n5 + Pua.k, WOa.fa * n2, WOa.fa, WOa.fa);
                        } else {
                            gna_12.f(b2, n3, n5 + FTa.A, WOa.fa * n2, WOa.fa, WOa.fa);
                            f5 = f4;
                        }
                        f4 = f5 - kta.v;
                    }
                    n21 = --n6;
                }
            }
            if ((vL2 = sx2.ja) == null) {
                gna_12.H.U.f(ySa.L);
                if (!uw.m) {
                    int n22 = n5 = uSa.E;
                    while (n22 < NTa.C) {
                        n18 = n15;
                        n4 = ERa.C;
                        int b2 = uSa.E;
                        if (sx2.J(Hda.L)) {
                            b2 = uua.s;
                            n4 += 36;
                        }
                        if (sx2.J().J() <= JPa.N && gna_12.a % (n12 * yRa.d + vRa.d) == 0) {
                            n18 = n15 + (gna_12.i.nextInt(yRa.d) - vRa.d);
                        }
                        if (n11 != 0) {
                            b2 = vRa.d;
                        }
                        n3 = n14 - n5 * Yqa.i - WOa.fa;
                        gna_12.f(n3, n18, ERa.C + b2 * WOa.fa, Lra.e, WOa.fa, WOa.fa);
                        if (n11 != 0) {
                            if (n5 * uqa.g + vRa.d < n13) {
                                gna_12.f(n3, n18, n4 + GPa.C, Lra.e, WOa.fa, WOa.fa);
                            }
                            if (n5 * uqa.g + vRa.d == n13) {
                                gna_12.f(n3, n18, n4 + Ssa.u, Lra.e, WOa.fa, WOa.fa);
                            }
                        }
                        if (n5 * uqa.g + vRa.d < n12) {
                            gna_12.f(n3, n18, n4 + Qsa.Ha, Lra.e, WOa.fa, WOa.fa);
                        }
                        if (n5 * uqa.g + vRa.d == n12) {
                            gna_12.f(n3, n18, n4 + wra.e, Lra.e, WOa.fa, WOa.fa);
                        }
                        n22 = ++n5;
                    }
                }
            } else if (vL2 instanceof Gl && !uw.G) {
                gna_12.H.U.f(ura.h);
                Gl gl2 = (Gl)vL2;
                n18 = (int)Math.ceil(gl2.f());
                float f6 = gl2.J();
                int b2 = (int)(f6 + MQa.L) / uqa.g;
                if (b2 > Fsa.d) {
                    b2 = Fsa.d;
                }
                n3 = n15;
                n2 = uSa.E;
                int n23 = b2;
                while (n23 > 0) {
                    a22 = Math.min(b2, NTa.C);
                    b2 -= a22;
                    int n24 = uSa.E;
                    while (n24 < a22) {
                        n7 = FPa.F;
                        n10 = uSa.E;
                        if (n11 != 0) {
                            n10 = vRa.d;
                        }
                        n12 = n14 - n8 * Yqa.i - WOa.fa;
                        gna_12.f(n12, n3, n7 + n10 * WOa.fa, WOa.fa, WOa.fa, WOa.fa);
                        if (n8 * uqa.g + vRa.d + n2 < n18) {
                            gna_12.f(n12, n3, n7 + Qsa.Ha, WOa.fa, WOa.fa, WOa.fa);
                        }
                        if (n8 * uqa.g + vRa.d + n2 == n18) {
                            gna_12.f(n12, n3, n7 + wra.e, WOa.fa, WOa.fa, WOa.fa);
                        }
                        n24 = ++n8;
                    }
                    n3 -= 10;
                    n23 = b2;
                    n2 += 20;
                }
            }
            if (!uw.w) {
                gna_12.H.U.f(BPa.h);
                if (sx2.J(Material.water)) {
                    int b2;
                    int n25 = gna_12.H.c.i();
                    n18 = Oz.J((double)((double)(n25 - uqa.g) * Wqa.m / dua.d));
                    int n26 = Oz.J((double)((double)n25 * Wqa.m / dua.d)) - n18;
                    int n27 = b2 = uSa.E;
                    while (n27 < n18 + n26) {
                        if (b2 < n18) {
                            gna_12.f(n14 - b2 * Yqa.i - WOa.fa, n16, ERa.C, yOa.B, WOa.fa, WOa.fa);
                        } else {
                            gna_12.f(n14 - b2 * Yqa.i - WOa.fa, n16, kTa.g, yOa.B, WOa.fa, WOa.fa);
                        }
                        n27 = ++b2;
                    }
                }
            }
            gna_12.H.U.f();
        }
    }

    public boolean J() {
        gna_1 gna_12 = this;
        if (gna_12.H.z.t && !gna_12.H.c.W() && !gna_12.H.z.Na) {
            return uSa.E != 0;
        }
        if (gna_12.H.L.f()) {
            if (gna_12.H.V != null) {
                return vRa.d != 0;
            }
            if (gna_12.H.Oa != null && gna_12.H.Oa.A == AY.BLOCK) {
                gna_1 gna_13 = gna_12;
                Object a2 = gna_13.H.Oa.J();
                return gna_13.H.Ta.J((XF)((Object)a2)) instanceof HA;
            }
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void f(sMa sMa2, int n2) {
        int n3;
        void b22;
        int n4;
        gna_1 gna_12 = this;
        if (uw.c) {
            return;
        }
        gna_1 gna_13 = gna_12;
        gna_13.H.U.J(TPa.R);
        gna_13.H.J().J(KA.A);
        if (gna_13.H.c.D() > 0) {
            void a2;
            n4 = Bsa.H;
            gna_1 gna_14 = gna_12;
            int c2 = (int)(gna_14.H.c.A * (float)(n4 + vRa.d));
            n3 = b22.J() - fPa.i + yRa.d;
            gna_14.f((int)a2, n3, uSa.E, ysa.s, n4, tTa.h);
            if (c2 > 0) {
                gna_12.f((int)a2, n3, uSa.E, Cra.S, c2, tTa.h);
            }
        }
        gna_1 gna_15 = gna_12;
        gna_15.H.U.f();
        if (gna_15.H.c.j > 0) {
            gna_12.H.U.J(ROa.c);
            n4 = JQa.c;
            if (Config.Fa()) {
                n4 = XE.C((int)n4);
            }
            Object c2 = new StringBuilder().insert(3 & 4, Mqa.y).append(gna_12.H.c.j).toString();
            void v3 = b22;
            gna_1 gna_16 = gna_12;
            n3 = (v3.f() - gna_16.J().J((String)c2)) / uqa.g;
            int b22 = v3.J() - tua.U - AQa.P;
            gna_16.J().J((String)c2, n3 + vRa.d, b22, uSa.E);
            gna_12.J().J((String)c2, n3 - vRa.d, b22, uSa.E);
            gna_12.J().J((String)c2, n3, b22 + vRa.d, uSa.E);
            gna_12.J().J((String)c2, n3, b22 - vRa.d, uSa.E);
            gna_12.J().J((String)c2, n3, b22, n4);
            gna_12.H.U.f();
        }
    }

    public void l() {
        gna_1 a2;
        a2.J.J();
    }

    private void f() {
        gna_1 gna_12 = this;
        if (KFa.J != null && KFa.I > 0) {
            KFa.I -= vRa.d;
            gna_1 gna_13 = gna_12;
            Kna cfr_ignored_0 = gna_13.H.Ea;
            gna_1 gna_14 = gna_12;
            int n2 = new sMa(gna_14.H).f();
            int n3 = Bsa.H;
            int a2 = n2 / uqa.g - n3 / uqa.g;
            int n4 = (int)(KFa.A * (float)(n3 + vRa.d));
            int n5 = lqa.s;
            gna_14.f(a2, n5, uSa.E, bqa.Ga, n3, tTa.h);
            gna_13.f(a2, n5, uSa.E, bqa.Ga, n3, tTa.h);
            if (n4 > 0) {
                gna_12.f(a2, n5, uSa.E, vPa.Ka, n4, tTa.h);
            }
            String string = KFa.J;
            a2 = Wsa.K;
            if (Config.Fa()) {
                a2 = XE.f((int)a2);
            }
            String string2 = string;
            gna_12.J().J(string2, (float)(n2 / uqa.g - gna_12.J().J(string2) / uqa.g), (float)(n5 - NTa.C), a2);
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            gna_12.H.J().J((ResourceLocation)A);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(sMa sMa2, int n2) {
        void a2;
        gna_1 c322 = sMa2;
        gna_1 b2 = this;
        if (uw.C) {
            return;
        }
        gna_1 gna_12 = b2;
        gna_12.H.U.J(bpa.H);
        gna_12.H.J().J(KA.A);
        float c322 = gna_12.H.c.I();
        int n3 = Bsa.H;
        int c322 = (int)(c322 * (float)(n3 + vRa.d));
        int n4 = c322.J() - fPa.i + yRa.d;
        b2.f((int)a2, n4, uSa.E, Vua.J, n3, tTa.h);
        if (c322 > 0) {
            b2.f((int)a2, n4, uSa.E, bSa.Da, c322, tTa.h);
        }
        b2.H.U.f();
    }

    public static int J(int n2, boolean bl2) {
        int b2 = bl2 ? 1 : 0;
        int a2 = n2;
        if (b2 != 0) {
            b2 = a2 >> osa.c & osa.Ja;
            b2 = (int)((double)b2 * LQa.E);
            a2 = (a2 & Wsa.K) + (b2 << osa.c);
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    private void J(float f2, sMa sMa2) {
        void a2;
        gna_1 gna_12;
        gna_1 gna_13;
        float b2;
        gna_1 gna_14 = this;
        if (!Config.U()) {
            uKa.J();
            uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
            return;
        }
        b2 = pqa.r - b2;
        b2 = Oz.J((float)b2, (float)JPa.N, (float)pqa.r);
        PX pX2 = gna_14.H.Ta.J();
        float c2 = (float)pX2.J((vL)gna_14.H.c);
        PX pX3 = pX2;
        double d2 = Math.min(pX2.l() * (double)pX3.f() * Tpa.M, Math.abs(pX2.G() - pX2.A()));
        d2 = Math.max((double)pX3.J(), d2);
        if ((double)c2 < d2) {
            c2 = pqa.r - (float)((double)c2 / d2);
            gna_13 = gna_14;
        } else {
            c2 = JPa.N;
            gna_13 = gna_14;
        }
        gna_13.K = (float)((double)gna_14.K + (double)(b2 - gna_14.K) * SPa.x);
        uKa.u();
        uKa.J(uSa.E != 0);
        uKa.J((int)uSa.E, (int)Wqa.w, (int)vRa.d, (int)uSa.E);
        if (c2 > JPa.N) {
            float f3 = c2;
            uKa.f((float)JPa.N, (float)f3, (float)f3, (float)pqa.r);
            gna_12 = gna_14;
        } else {
            gna_1 gna_15 = gna_14;
            gna_12 = gna_15;
            uKa.f((float)gna_15.K, (float)gna_15.K, (float)gna_14.K, (float)pqa.r);
        }
        gna_12.H.J().J(h);
        pKa pKa2 = pKa.J();
        aKa aKa2 = b2 = pKa2.J();
        aKa aKa3 = b2;
        aKa3.J(XTa.W, mka.A);
        aKa3.J(aSa.V, (double)a2.J(), AQa.K).J(aSa.V, oua.i).M();
        aKa2.J((double)a2.f(), (double)a2.J(), AQa.K).J(oua.i, oua.i).M();
        aKa2.J((double)a2.f(), aSa.V, AQa.K).J(oua.i, aSa.V).M();
        aKa2.J(aSa.V, aSa.V, AQa.K).J(aSa.V, aSa.V).M();
        pKa2.J();
        uKa.J(vRa.d != 0);
        uKa.J();
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, String string2, int n2, int n3, int n4) {
        void f2;
        void b2;
        void c2;
        void d2;
        void e2;
        int n5 = n4;
        gna_1 a2 = this;
        if (e2 == null && d2 == null && c2 < 0 && b2 < 0 && f2 < 0) {
            gna_1 gna_12 = a2;
            gna_12.f = Mqa.y;
            gna_12.e = Mqa.y;
            gna_12.g = uSa.E;
            return;
        }
        if (e2 != null) {
            a2.f = e2;
            a2.g = a2.v + a2.D + a2.M;
            return;
        }
        if (d2 != null) {
            a2.e = d2;
            return;
        }
        if (c2 >= 0) {
            a2.v = c2;
        }
        if (b2 >= 0) {
            a2.D = b2;
        }
        if (f2 >= 0) {
            a2.M = f2;
        }
        if (a2.g > 0) {
            gna_1 gna_13 = a2;
            a2.g = gna_13.v + gna_13.D + a2.M;
        }
    }

    public void J() {
        gna_1 a2;
        gna_1 gna_12 = a2;
        gna_12.v = NTa.C;
        gna_12.D = NPa.e;
        gna_12.M = kTa.j;
    }

    public mna J() {
        gna_1 a2;
        return a2.d;
    }

    public Kna J() {
        gna_1 a2;
        return a2.H.Ea;
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, boolean bl2) {
        void b2;
        gna_1 a2;
        boolean c2 = bl2;
        gna_1 gna_12 = a2 = this;
        gna_12.C = b2;
        gna_12.m = Psa.M;
        gna_12.c = c2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(sMa sMa2, float f2) {
        gna_1 gna_12 = this;
        if (uw.n) {
            return;
        }
        if (gna_12.H.J() instanceof Sx) {
            void b2;
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            gna_1 gna_13 = gna_12;
            gna_13.H.J().J(l);
            Sx sx2 = (Sx)gna_13.H.J();
            int c2 = b2.f() / uqa.g;
            gna_1 gna_14 = gna_12;
            long l2 = gna_12.I;
            gna_14.I = (long)kPa.Ha;
            gna_14.f(c2 - rRa.R, b2.J() - cQa.o, uSa.E, uSa.E, Bsa.H, cQa.o);
            gna_14.f(c2 - rRa.R - vRa.d + sx2.K.J * kTa.j, b2.J() - cQa.o - vRa.d, uSa.E, cQa.o, osa.c, cQa.o);
            gna_14.I = l2;
            uKa.o();
            uKa.B();
            uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
            nLa.J();
            int n2 = c2 = uSa.E;
            while (n2 < WOa.fa) {
                void a2;
                void v3 = b2;
                int n3 = v3.f() / uqa.g - Jsa.ha + c2 * kTa.j + uqa.g;
                int n4 = v3.J() - ERa.C - yRa.d;
                gna_12.J(c2++, n3, n4, (float)a2, sx2);
                n2 = c2;
            }
            nLa.C();
            uKa.E();
            uKa.k();
        }
    }

    public int J() {
        gna_1 a2;
        return a2.a;
    }
}

