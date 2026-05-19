/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AG
 *  Bsa
 *  DW
 *  ERa
 *  IG
 *  JPa
 *  JQa
 *  KA
 *  Kh
 *  Ki
 *  Kna
 *  Kpa
 *  NH
 *  Pqa
 *  QSa
 *  Sf
 *  TPa
 *  TQa
 *  WSa
 *  XE
 *  XTa
 *  YG
 *  Ypa
 *  ZRa
 *  aSa
 *  cQa
 *  gG
 *  hG
 *  hra
 *  jRa
 *  kta
 *  lqa
 *  mka
 *  pqa
 *  pua
 *  q
 *  qy
 *  uKa
 *  vQa
 *  vRa
 *  wOa
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.font.GlyphMetrics;
import java.awt.font.GlyphVector;
import java.awt.font.LineMetrics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import optifine.Config;
import sun.java2d.NullSurfaceData;
import sun.java2d.SunGraphics2D;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class NH_2
implements P,
q {
    private float d;
    private final Graphics2D a;
    private final List<Fi> b;
    private float l;
    private final Map<Character, AG> e;
    private Font G;
    public final Queue<Ki> D;
    private final int f;
    private float F;
    public final boolean g;
    private int L;
    private float E;
    private float m;
    private Fi C;
    private static final int i = 1;
    public final boolean M;
    private static final int k = 1;
    private final Font j;
    private float J;
    private final boolean A;
    private float I;

    /*
     * Unable to fully structure code
     */
    @Override
    public int f(String var1_2) {
        var2_3 = this;
        if (a == null) {
            return uSa.E;
        }
        var4_4 = JPa.N;
        var7_5 = uSa.E;
        v0 = b = uSa.E;
        while (v0 < a.length()) {
            block11: {
                block12: {
                    block10: {
                        var5_8 = NH_2.J((String)a, b);
                        if (var5_8 <= 0) break block10;
                        b += var5_8 - vRa.d;
                        break block11;
                    }
                    v1 = a.charAt(b);
                    var5_8 = v1;
                    if (!Sf.J((char)v1)) break block12;
                    var6_9 = Sf.J((char)var5_8);
                    if (var6_9 != null) {
                        var4_4 += (float)(var2_3.f + Yqa.i) / kta.v;
                    }
                    break block11;
                }
                if (var5_8 != TPa.Aa || b + vRa.d >= a.length()) ** GOTO lbl-1000
                var6_10 = uSa.E;
                var3_6 = a.charAt(b + vRa.d);
                if (var3_6 == Jra.o) {
                    var7_5 = vRa.d;
                    v2 = var6_10 = vRa.d;
                } else {
                    if (var3_6 == WSa.o || var3_6 >= QSa.p && var3_6 <= KSa.x || var3_6 >= Hta.k && var3_6 <= jRa.v || var3_6 == sOa.D) {
                        var7_5 = uSa.E;
                        var6_10 = vRa.d;
                        if (var3_6 == sOa.D && a.length() - b - uqa.g >= 0 && (var3_7 = Kna.J((String)a.substring(b + uqa.g))) != null) {
                            b += uqa.g * var3_7.f();
                        }
                    }
                    v2 = var6_10;
                }
                if (v2 != 0) {
                    ++b;
                } else lbl-1000:
                // 2 sources

                {
                    var4_4 += var2_3.J((char)var5_8).E / var2_3.m;
                    if (var7_5 != 0) {
                        v3 = var2_3;
                        var4_4 += v3.E / v3.m;
                    }
                }
            }
            v0 = ++b;
        }
        return (int)var4_4;
    }

    public int J() {
        NH_2 a2;
        if (a2.g || a2.A) {
            return vRa.d;
        }
        return uSa.E;
    }

    @Override
    public void J() {
        Object a2;
        NH_2 nH_2 = this;
        if (nH_2.C != null) {
            Object[] objectArray = new Object[AQa.P];
            objectArray[uSa.E] = nH_2.j.getFontName();
            objectArray[vRa.d] = nH_2.f;
            objectArray[uqa.g] = Float.valueOf(nH_2.m / kta.v);
            objectArray[yRa.d] = nH_2.b.size();
            OT.J(lqa.U, objectArray);
        }
        Object object = a2 = nH_2.b.iterator();
        while (object.hasNext()) {
            Fi fi2 = (Fi)a2.next();
            object = a2;
            gLa.J(fi2.J);
            fi2.J = pua.o;
        }
        nH_2.b.clear();
        nH_2.C = null;
        nH_2.e.clear();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(String string, int n2, int n3, int n4, boolean bl) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        NH_2 nH_2 = this;
        if (e2 == null) {
            return;
        }
        NH_2 nH_22 = nH_2;
        nH_22.f();
        NH_2 f2 = nH_22.D.poll();
        Object object = f2;
        while (object != null) {
            NH_2 nH_23;
            if (((Ki)f2).A.M.J == pua.o) {
                nH_23 = nH_2;
            } else {
                NH_2 nH_24 = f2;
                ((Ki)nH_24).J.j = ((Ki)nH_24).A.M.J;
                NH_2 nH_25 = f2;
                gLa.J(((Ki)nH_24).J.j, ((Ki)nH_25).I, ((Ki)nH_25).A.I, ((Ki)f2).A.j, ((Ki)f2).A.k, ((Ki)f2).A.J);
                nH_23 = nH_2;
            }
            object = nH_23.D.poll();
        }
        uKa.H();
        NH_2 nH_26 = nH_2;
        DW.J((String)e2, (float)((float)d2), (float)((float)c2), (int)b2, (boolean)a2, (q)nH_26, (Object)nH_26.G);
    }

    /*
     * WARNING - void declaration
     */
    private static int J(int n2, int n3, int n4, int n5) {
        void b2;
        void c2;
        int d2 = n5;
        int a2 = n2;
        return (d2 << osa.c) + (a2 << ERa.C) + (c2 << Yqa.i) + b2;
    }

    @Override
    public int J(String string) {
        String b2 = string;
        NH_2 a2 = this;
        return a2.L;
    }

    /*
     * WARNING - void declaration
     */
    private void J(IG iG2, String string, float f2, float f3, int n2, boolean bl) {
        void c2;
        void d2;
        void f4;
        void e2;
        int n3;
        int b2;
        void a2;
        NH_2 nH_2 = this;
        if (a2 != false) {
            b2 = (b2 & sOa.fa) >> uqa.g | b2 & gsa.X;
        }
        int n4 = b2 >> osa.c & osa.Ja;
        int n5 = b2 >> ERa.C & osa.Ja;
        int n6 = b2 >> Yqa.i & osa.Ja;
        int n7 = b2 & osa.Ja;
        float f5 = nH_2.m;
        int n8 = uSa.E;
        float f6 = vqa.T;
        float f7 = vqa.T;
        float f8 = JPa.N;
        int n9 = n3 = uSa.E;
        while (n9 < e2.length()) {
            block26: {
                NH_2 g22;
                block30: {
                    block28: {
                        float f9;
                        float f10;
                        block29: {
                            int n10;
                            block27: {
                                block25: {
                                    n10 = NH_2.J((String)e2, n3);
                                    if (n10 <= 0) break block25;
                                    n3 += n10 - vRa.d;
                                    break block26;
                                }
                                char c3 = e2.charAt(n3);
                                n10 = c3;
                                if (c3 != TPa.Aa || n3 + vRa.d >= e2.length()) break block27;
                                char g22 = e2.charAt(n3 + vRa.d);
                                int n11 = UOa.q.indexOf(g22);
                                if (n11 >= 0 && n11 <= Ypa.A || g22 == sOa.D) {
                                    if (f6 != vqa.T) {
                                        nH_2.f((IG)f4, (float)d2, (float)c2, f6, f8, n5, n6, n7, n4);
                                        f6 = vqa.T;
                                    }
                                    if (f7 != vqa.T) {
                                        nH_2.J((IG)f4, (float)d2, (float)c2, f7, f8, n5, n6, n7, n4);
                                        f7 = vqa.T;
                                    }
                                    if (g22 == sOa.D) {
                                        qy qy2;
                                        if (e2.length() - n3 - uqa.g >= 0 && (qy2 = Kna.J((String)e2.substring(n3 + uqa.g))) != null) {
                                            if (a2 != false) {
                                                qy2 = qy2.J(Bsa.n);
                                            }
                                            qy qy3 = qy2;
                                            n5 = qy3.J();
                                            n6 = qy3.C();
                                            n7 = qy3.d();
                                            n3 += uqa.g * qy2.f();
                                        }
                                    } else {
                                        if (a2 != false) {
                                            n11 += 16;
                                        }
                                        int n12 = Kpa.J().Ea.W[n11];
                                        if (Config.Fa()) {
                                            n12 = XE.f((int)n11, (int)n12);
                                        }
                                        n5 = n12 >> ERa.C & osa.Ja;
                                        n6 = n12 >> Yqa.i & osa.Ja;
                                        n7 = n12 & osa.Ja;
                                    }
                                    n8 = uSa.E;
                                } else if (n11 == yta.Ka) {
                                    n8 = vRa.d;
                                } else if (n11 == yOa.B) {
                                    f6 = f8;
                                } else if (n11 == wOa.t) {
                                    f7 = f8;
                                } else if (n11 == wOa.h) {
                                    if (f6 != vqa.T) {
                                        nH_2.f((IG)f4, (float)d2, (float)c2, f6, f8, n5, n6, n7, n4);
                                        f6 = vqa.T;
                                    }
                                    if (f7 != vqa.T) {
                                        nH_2.J((IG)f4, (float)d2, (float)c2, f7, f8, n5, n6, n7, n4);
                                        f7 = vqa.T;
                                    }
                                    n5 = b2 >> ERa.C & osa.Ja;
                                    n6 = b2 >> Yqa.i & osa.Ja;
                                    n7 = b2 & osa.Ja;
                                    n8 = uSa.E;
                                }
                                ++n3;
                                break block26;
                            }
                            g22 = nH_2.J((char)n10);
                            if (((AG)g22).j == pua.o) break block28;
                            if (!Sf.J((char)n10)) break block29;
                            He he = Sf.J((char)n10);
                            if (he != null) {
                                void var20_26 = d2 + f8 / f5;
                                NH_2 nH_22 = nH_2;
                                f10 = (float)(nH_22.f + AQa.P) / kta.v;
                                f9 = (float)(nH_22.f + AQa.P) / kta.v;
                                void var17_20 = c2 + nH_2.J / f5 - f9 + vQa.q;
                                void v4 = f4;
                                v4.J(Kpa.J().J().J(he.J().J()).J());
                                KA.J((IG)v4, (int)((int)var20_26), (int)((int)var17_20), (float)he.l(), (float)he.J(), (int)he.C(), (int)he.f(), (int)((int)f10), (int)((int)f9), (float)he.J().f(), (float)he.J().J(), (int)n5, (int)n6, (int)n7, (int)n4);
                                f8 += f10 * f5;
                            }
                            break block26;
                        }
                        void var19_23 = d2 + (f8 + ((AG)g22).M) / f5;
                        void var20_27 = c2 + (((AG)g22).A + nH_2.J) / f5;
                        NH_2 nH_23 = g22;
                        f10 = (float)((AG)nH_23).I / f5;
                        f9 = (float)((AG)nH_23).i / f5;
                        void v6 = f4;
                        void v7 = var19_23;
                        void v8 = f4;
                        v8.J(((AG)g22).j);
                        v8.J((double)var19_23, (double)var20_27, aSa.V).J((double)((AG)g22).J, (double)((AG)g22).m).J(n5, n6, n7, n4).M();
                        f4.J((double)v7, (double)(var20_27 + f9), aSa.V).J((double)((AG)g22).J, (double)((AG)g22).k).J(n5, n6, n7, n4).M();
                        v6.J((double)(v7 + f10), (double)(var20_27 + f9), aSa.V).J((double)((AG)g22).C, (double)((AG)g22).k).J(n5, n6, n7, n4).M();
                        v6.J((double)(var19_23 + f10), (double)var20_27, aSa.V).J((double)((AG)g22).C, (double)((AG)g22).m).J(n5, n6, n7, n4).M();
                        if (n8 != 0) {
                            void v9 = f4;
                            void v10 = var19_23 += nH_2.E;
                            f4.J((double)var19_23, (double)var20_27, aSa.V).J((double)((AG)g22).J, (double)((AG)g22).m).J(n5, n6, n7, n4).M();
                            f4.J((double)v10, (double)(var20_27 + f9), aSa.V).J((double)((AG)g22).J, (double)((AG)g22).k).J(n5, n6, n7, n4).M();
                            v9.J((double)(v10 + f10), (double)(var20_27 + f9), aSa.V).J((double)((AG)g22).C, (double)((AG)g22).k).J(n5, n6, n7, n4).M();
                            v9.J((double)(var19_23 + f10), (double)var20_27, aSa.V).J((double)((AG)g22).C, (double)((AG)g22).m).J(n5, n6, n7, n4).M();
                        }
                        break block30;
                    }
                    DW.I = vRa.d;
                }
                f8 += ((AG)g22).E;
            }
            n9 = ++n3;
        }
        if (f6 != vqa.T) {
            nH_2.f((IG)f4, (float)d2, (float)c2, f6, f8, n5, n6, n7, n4);
        }
        if (f7 != vqa.T) {
            nH_2.J((IG)f4, (float)d2, (float)c2, f7, f8, n5, n6, n7, n4);
        }
    }

    /*
     * WARNING - void declaration
     */
    private hG J(int n2, int n3) {
        void a2;
        void b2;
        NH_2 nH_2 = this;
        NH_2 c2 = null;
        if (nH_2.C != null) {
            c2 = nH_2.C.J((int)b2, (int)a2);
        }
        if (c2 == null) {
            int n4 = hra.Ja;
            if ((float)nH_2.L * nH_2.m > ZRa.l) {
                n4 = cQa.z;
            }
            NH_2 nH_22 = nH_2;
            int n5 = n4;
            nH_22.C = new Fi(n5, n5, vRa.d != 0, uSa.E);
            nH_22.C.J = uKa.J();
            gLa.J(nH_22.C.J, nH_2.C.M, nH_2.C.j);
            gLa.J(nH_22.A, uSa.E != 0);
            gLa.J(vRa.d != 0);
            nH_22.b.add(nH_2.C);
            c2 = nH_2.C.J((int)b2, (int)a2);
        }
        return c2;
    }

    public NH_2(cG cG2) {
        NH_2 a2;
        cG b2 = cG2;
        NH_2 nH_2 = a2 = this;
        Object object = b2;
        NH_2 nH_22 = a2;
        NH_2 nH_23 = a2;
        a2.e = new HashMap<Character, AG>();
        nH_23.b = new ArrayList<Fi>();
        a2.D = new ConcurrentLinkedQueue<Ki>();
        nH_22.j = b2.j;
        nH_22.f = b2.I;
        a2.g = ((cG)object).k;
        nH_2.M = ((cG)object).M;
        a2.A = b2.A;
        nH_2.a = new SunGraphics2D(NullSurfaceData.theInstance, Color.WHITE, new Color(osa.Ja, osa.Ja, osa.Ja, uSa.E), a2.j);
        a2.a.setRenderingHint(RenderingHints.KEY_ANTIALIASING, a2.g ? RenderingHints.VALUE_ANTIALIAS_ON : RenderingHints.VALUE_ANTIALIAS_OFF);
        a2.a.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, a2.g ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
        a2.a.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, a2.M ? RenderingHints.VALUE_FRACTIONALMETRICS_ON : RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
        a2.f();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public String J(String var1_1, int var2_2, boolean var3_3) {
        d = var1_1;
        c = this;
        if (d.length() <= vRa.d) {
            return d;
        }
        if (a != false) {
            d = new StringBuilder((String)d).reverse().toString();
        }
        b = (int)((float)b * c.m);
        var4_4 = JPa.N;
        v0 = var5_5 = uSa.E;
        while (v0 < d.length()) {
            block9: {
                block8: {
                    var6_6 = NH_2.J((String)d, var5_5);
                    if (var6_6 <= 0) break block8;
                    var5_5 += var6_6 - vRa.d;
                    break block9;
                }
                v1 = d.charAt(var5_5);
                var6_6 = v1;
                if (v1 != TPa.Aa || var5_5 + vRa.d >= d.length()) ** GOTO lbl-1000
                var7_7 = d.charAt(var5_5 + vRa.d);
                v2 = var8_9 = var7_7 >= QSa.p && var7_7 <= WSa.o ? vRa.d : uSa.E;
                if (var7_7 == sOa.D && (var7_8 = Kna.J((String)d.substring(var5_5 + vRa.d))) != null) {
                    var5_5 += uqa.g * var7_8.f();
                }
                if (var8_9 != 0) {
                    ++var5_5;
                } else lbl-1000:
                // 2 sources

                {
                    var4_4 += c.J((char)var6_6).E;
                    if (v3 > (float)b) {
                        return d.substring(uSa.E, Math.max(vRa.d, var5_5 - vRa.d));
                    }
                }
            }
            v0 = ++var5_5;
        }
        if (a != false) {
            d = new StringBuilder((String)d).reverse().toString();
        }
        return d;
    }

    /*
     * WARNING - void declaration
     */
    private void f(IG iG2, float f2, float f3, float f4, float f5, int n2, int n3, int n4, int n5) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        void g2;
        void j2;
        void h2;
        void i2;
        float f6 = f4;
        NH_2 f7 = this;
        void v0 = i2;
        v0.f();
        NH_2 nH_2 = f7;
        NH_2 nH_22 = f7;
        Kh.J((double)((double)(h2 + j2 / f7.m)), (double)((double)(g2 + (nH_2.J + nH_2.l) / f7.m)), (double)((double)((e2 - j2) / f7.m)), (double)(nH_22.I / nH_22.m), (int)NH_2.J((int)d2, (int)c2, (int)b2, (int)a2));
        v0.J();
    }

    /*
     * WARNING - void declaration
     */
    public int J(String string, float f2, float f3, int n2, boolean bl) {
        void b2;
        void c2;
        void d2;
        void e2;
        void a2;
        NH_2 nH_2 = this;
        NH_2 f4 = new IG(XTa.W, mka.a);
        f4.J();
        if (a2 != false) {
            nH_2.J((IG)f4, (String)e2, (float)(d2 + pqa.r), (float)(c2 + pqa.r), (int)b2, vRa.d != 0);
        }
        nH_2.J((IG)f4, (String)e2, (float)d2, (float)c2, (int)b2, uSa.E != 0);
        f4.f();
        return uSa.E;
    }

    public void l() {
        Iterator<Fi> iterator;
        NH_2 nH_2 = this;
        Iterator<Fi> iterator2 = iterator = nH_2.b.iterator();
        while (iterator2.hasNext()) {
            Object a2;
            Object object = a2 = iterator.next();
            gLa.J(new StringBuilder().insert(3 >> 2, Bua.M).append(((Fi)a2).J).append(Pqa.q).append(((Fi)a2).M).append(rRa.X).append(((Fi)a2).j).toString(), ((Fi)a2).J, uSa.E, ((Fi)object).M, ((Fi)object).j);
            iterator2 = iterator;
        }
    }

    private void f() {
        NH_2 nH_2 = this;
        float a2 = eq.A.l();
        if (nH_2.m == a2) {
            return;
        }
        Object[] objectArray = new Object[yRa.d];
        objectArray[uSa.E] = nH_2.j.getFontName();
        objectArray[vRa.d] = nH_2.f;
        objectArray[uqa.g] = Float.valueOf(a2 / kta.v);
        OT.J(JQa.h, objectArray);
        NH_2 nH_22 = nH_2;
        NH_2 nH_23 = nH_2;
        nH_23.J();
        nH_22.m = a2;
        nH_22.G = nH_23.j.deriveFont(uSa.E, a2 / kta.v * (float)nH_2.f);
        nH_22.a.setFont(nH_2.G);
        LineMetrics lineMetrics = nH_22.G.getLineMetrics(Mqa.y, nH_2.a.getFontRenderContext());
        nH_22.l = lineMetrics.getStrikethroughOffset();
        nH_22.I = lineMetrics.getStrikethroughThickness();
        nH_22.d = lineMetrics.getUnderlineOffset();
        nH_22.F = lineMetrics.getUnderlineThickness();
        nH_22.J = lineMetrics.getAscent();
        nH_22.L = (int)(lineMetrics.getHeight() / a2);
        nH_22.E = nH_22.G.getSize2D() * Yqa.C / a2;
    }

    private static int J(String string, int n2) {
        int b2 = n2;
        String a2 = string;
        if (b2 + uqa.g >= a2.length()) {
            return uSa.E;
        }
        if (a2.charAt(b2) != TPa.Aa) {
            return uSa.E;
        }
        if (Character.toLowerCase(a2.charAt(b2 + vRa.d)) != Bsa.E) {
            return uSa.E;
        }
        if (a2.charAt(b2 + uqa.g) <= osa.Ja) {
            return uSa.E;
        }
        return yRa.d;
    }

    /*
     * WARNING - void declaration
     */
    private void J(IG iG2, float f2, float f3, float f4, float f5, int n2, int n3, int n4, int n5) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        void g2;
        void j2;
        void h2;
        void i2;
        float f6 = f4;
        NH_2 f7 = this;
        void v0 = i2;
        v0.f();
        NH_2 nH_2 = f7;
        NH_2 nH_22 = f7;
        Kh.J((double)((double)(h2 + j2 / f7.m)), (double)((double)(g2 + (nH_2.J + nH_2.d) / f7.m)), (double)((double)((e2 - j2) / f7.m)), (double)(nH_22.F / nH_22.m), (int)NH_2.J((int)d2, (int)c2, (int)b2, (int)a2));
        v0.J();
    }

    /*
     * WARNING - void declaration
     */
    private AG J(char c2) {
        void a2;
        NH_2 nH_2 = this;
        NH_2 b2 = nH_2.e.get(Character.valueOf((char)a2));
        if (b2 == null) {
            b2 = new AG();
            nH_2.e.put(Character.valueOf((char)a2), (AG)b2);
            NH_2 nH_22 = nH_2;
            int n2 = nH_22.J();
            GlyphVector glyphVector = nH_22.a.getFont().createGlyphVector(nH_2.a.getFontRenderContext(), Character.toString((char)a2));
            GlyphMetrics glyphMetrics = glyphVector.getGlyphMetrics(uSa.E);
            Rectangle rectangle = glyphMetrics.getBounds2D().getBounds();
            NH_2 nH_23 = b2;
            Rectangle rectangle2 = rectangle;
            ((AG)b2).E = glyphMetrics.getAdvanceX();
            ((AG)b2).M = rectangle2.x - n2;
            ((AG)nH_23).A = rectangle2.y - n2;
            int n3 = rectangle.width + n2 * uqa.g;
            n2 = rectangle.height + n2 * uqa.g;
            ((AG)nH_23).I = n3;
            ((AG)nH_23).i = n2;
            if (rectangle.width <= 0 || rectangle.height <= 0) {
                return b2;
            }
            hG hG2 = nH_2.J(n3 + vRa.d, n2 + vRa.d);
            if (hG2 == null) {
                OT.b.warn(new StringBuilder().insert(3 & 4, Nta.l).append((char)a2).append(aSa.fa).append(Integer.toHexString((int)a2)).append(TQa.u).append(n3).append(rRa.X).append(n2).toString());
                return b2;
            }
            hG hG3 = hG2;
            hG3.k -= vRa.d;
            hG3.J -= vRa.d;
            NH_2 nH_24 = b2;
            NH_2 nH_25 = b2;
            hG hG4 = hG2;
            ((AG)nH_25).J = ((float)hG2.I + WRa.e) / (float)hG4.M.M;
            hG hG5 = hG2;
            ((AG)nH_25).C = ((float)(hG4.I + hG5.k) - WRa.e) / (float)hG2.M.M;
            ((AG)nH_24).m = ((float)hG5.j + WRa.e) / (float)hG2.M.j;
            ((AG)nH_24).k = ((float)(hG2.j + hG2.J) - WRa.e) / (float)hG2.M.j;
            YG.l((gG)new gG((NH)nH_2, (AG)b2, hG2, glyphVector, rectangle));
        }
        return b2;
    }
}

