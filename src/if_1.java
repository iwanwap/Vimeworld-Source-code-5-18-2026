/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  ERa
 *  JPa
 *  KA
 *  Kd
 *  Kh
 *  Kpa
 *  Le
 *  Lra
 *  NQa
 *  PF
 *  PH
 *  Qsa
 *  XTa
 *  aJa
 *  aKa
 *  aSa
 *  kpa
 *  kta
 *  lE
 *  lqa
 *  mka
 *  pKa
 *  pqa
 *  uKa
 *  uRa
 *  vQa
 *  vRa
 */
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.awt.Color;
import java.util.concurrent.TimeUnit;

public final class if_1 {
    private static final Cache<String, PH> I = CacheBuilder.newBuilder().expireAfterAccess(yRa.W, TimeUnit.MINUTES).build();

    /*
     * WARNING - void declaration
     */
    public static void D(double d2, double d3, double d4, double d5, Color color, Kd kd) {
        double c2;
        double d6;
        double e2;
        double f2;
        void a2;
        Color color2 = color;
        aJa b2 = Kpa.J().J();
        double d7 = a2.getSize();
        f2 = Math.round(f2);
        e2 = Math.round(e2);
        d6 = Math.round(d6);
        c2 = Math.round(c2);
        b2.J(a2.getFill());
        uKa.f((float)((float)color2.getRed() / NQa.Y), (float)((float)color2.getGreen() / NQa.Y), (float)((float)color2.getBlue() / NQa.Y), (float)((float)color2.getAlpha() / NQa.Y));
        uKa.K();
        uKa.B();
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        KA.J((int)((int)f2), (int)((int)e2), (float)((int)d7), (float)((int)d7), (int)((int)d7), (int)((int)d7), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        KA.J((int)((int)(f2 + d6 - d7)), (int)((int)e2), (float)((int)d7), (float)((int)d7), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        if_1.f(f2 + d7, e2, d6 - d7 * KPa.y, d7, color2);
        if_1.f(f2, e2 + d7, d6, c2 - d7, color2);
    }

    /*
     * WARNING - void declaration
     */
    public static void f(double d2, double d3, double d4, double d5, Color color, Kd kd, Kd kd2) {
        double d6;
        double e2;
        double f2;
        double g2;
        void a2;
        void b2;
        Color color2 = color;
        if (b2 == null && a2 == null) {
            if_1.J(g2, f2, e2, d6, oua.i, color2);
            return;
        }
        if (b2 == null) {
            if_1.M(g2, f2, e2, d6, color2, (Kd)a2);
            return;
        }
        if (a2 == null) {
            if_1.i(g2, f2, e2, d6, color2, (Kd)b2);
            return;
        }
        aJa aJa2 = Kpa.J().J();
        void v0 = b2;
        double d7 = v0.getSize();
        double d8 = a2.getSize();
        int c2 = v0.getBorderWidth();
        g2 = Math.round(g2);
        f2 = Math.round(f2);
        e2 = Math.round(e2);
        d6 = Math.round(d6);
        aJa2.J(b2.getBorder());
        uKa.f((float)((float)color2.getRed() / NQa.Y), (float)((float)color2.getGreen() / NQa.Y), (float)((float)color2.getBlue() / NQa.Y), (float)((float)color2.getAlpha() / NQa.Y));
        uKa.K();
        uKa.B();
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        KA.J((int)((int)g2), (int)((int)f2), (float)((int)d7), (float)((int)d7), (int)((int)d7), (int)((int)d7), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        KA.J((int)((int)g2), (int)((int)(f2 + d6 - d7)), (float)((int)d7), (float)((int)d7), (int)((int)d7), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        aJa2.J(a2.getBorder());
        KA.J((int)((int)(g2 + e2 - d8)), (int)((int)f2), (float)((int)d8), (float)((int)d8), (int)((int)(-d8)), (int)((int)d8), (int)((int)d8), (int)((int)d8), (float)((int)d8), (float)((int)d8));
        KA.J((int)((int)(g2 + e2 - d8)), (int)((int)(f2 + d6 - d8)), (float)((int)d8), (float)((int)d8), (int)((int)(-d8)), (int)((int)(-d8)), (int)((int)d8), (int)((int)d8), (float)((int)d8), (float)((int)d8));
        if_1.f(g2 + d7, f2, e2 - d7 - d8, c2, color2);
        if_1.f(g2 + d7, f2 + d6 - (double)c2, e2 - d7 - d8, c2, color2);
        if_1.f(g2, f2 + d7, c2, d6 - d7 * KPa.y, color2);
        if_1.f(g2 + e2 - (double)c2, f2 + d8, c2, d6 - d8 * KPa.y, color2);
    }

    private static void f(double g2, double f2, double e2, double d2, double c2, double b2, Color a2) {
        if_1.f(g2 + c2 + b2, f2 + d2 - b2, e2 - c2 * KPa.y - b2 * KPa.y, b2, a2);
        if_1.f(g2 + b2, f2 + d2 - c2 - b2, c2, b2, a2);
        double d3 = b2;
        if_1.f(g2 + c2, f2 + d2 - c2, d3, c2 - d3, a2);
        if_1.f(g2 + e2 - c2 - b2, f2 + d2 - c2 - b2, c2, b2, a2);
        double d4 = b2;
        if_1.f(g2 + e2 - c2 - b2, f2 + d2 - c2, d4, c2 - d4, a2);
    }

    public static void C(double e2, double d2, double c2, double b2, Color a2) {
        if_1.J(e2, d2, c2, b2, KPa.y, a2);
    }

    /*
     * WARNING - void declaration
     */
    public static void d(double d2, double d3, double d4, double d5, Color color, Color color2, Kd kd) {
        void b2;
        double d6;
        double e2;
        double f2;
        double g2;
        void a2;
        Color color3 = color;
        aJa aJa2 = Kpa.J().J();
        void v0 = a2;
        double d7 = v0.getSize();
        int c2 = v0.getBorderWidth();
        g2 = Math.round(g2);
        f2 = Math.round(f2);
        e2 = Math.round(e2);
        d6 = Math.round(d6);
        aJa2.J(a2.getFill());
        uKa.f((float)((float)color3.getRed() / NQa.Y), (float)((float)color3.getGreen() / NQa.Y), (float)((float)color3.getBlue() / NQa.Y), (float)((float)color3.getAlpha() / NQa.Y));
        uKa.K();
        uKa.B();
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        KA.J((int)((int)g2), (int)((int)f2), (float)((int)d7), (float)((int)d7), (int)((int)d7), (int)((int)d7), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        KA.J((int)((int)(g2 + e2 - d7)), (int)((int)f2), (float)((int)d7), (float)((int)d7), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        if_1.f(g2 + d7, f2, e2 - d7 * KPa.y, d7, color3);
        if_1.f(g2, f2 + d7, e2, d6 - d7, color3);
        aJa2.J(a2.getBorder());
        uKa.f((float)((float)b2.getRed() / NQa.Y), (float)((float)b2.getGreen() / NQa.Y), (float)((float)b2.getBlue() / NQa.Y), (float)((float)b2.getAlpha() / NQa.Y));
        KA.J((int)((int)g2), (int)((int)f2), (float)((int)d7), (float)((int)d7), (int)((int)d7), (int)((int)d7), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        KA.J((int)((int)(g2 + e2 - d7)), (int)((int)f2), (float)((int)d7), (float)((int)d7), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        if_1.f(g2 + (double)c2, f2 + d6 - (double)c2, e2 - (double)(c2 * uqa.g), c2, (Color)b2);
        if_1.f(g2, f2 + d7, c2, d6 - d7, (Color)b2);
        if_1.f(g2 + e2 - (double)c2, f2 + d7, c2, d6 - d7, (Color)b2);
        if_1.f(g2 + d7, f2, e2 - d7 * KPa.y, c2, (Color)b2);
    }

    /*
     * WARNING - void declaration
     */
    public static void J(double d2, double d3, double d4, double d5, Color color, Kd kd, boolean bl) {
        void a2;
        double d6;
        double e2;
        double f2;
        double g2;
        void b2;
        Color color2 = color;
        void v0 = b2;
        double d7 = v0.getSize();
        int c2 = v0.getBorderWidth();
        g2 = Math.round(g2);
        f2 = Math.round(f2);
        e2 = Math.round(e2);
        d6 = Math.round(d6);
        Kpa.J().J().J(a2 != false ? b2.getFill() : b2.getFillNoBorder());
        uKa.f((float)((float)color2.getRed() / NQa.Y), (float)((float)color2.getGreen() / NQa.Y), (float)((float)color2.getBlue() / NQa.Y), (float)((float)color2.getAlpha() / NQa.Y));
        uKa.K();
        uKa.B();
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        KA.J((int)((int)g2), (int)((int)f2), (float)((int)d7), (float)((int)d7), (int)((int)d7), (int)((int)d7), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        KA.J((int)((int)(g2 + e2 - d7)), (int)((int)f2), (float)((int)d7), (float)((int)d7), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        KA.J((int)((int)g2), (int)((int)(f2 + d6 - d7)), (float)((int)d7), (float)((int)d7), (int)((int)d7), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        KA.J((int)((int)(g2 + e2 - d7)), (int)((int)(f2 + d6 - d7)), (float)((int)d7), (float)((int)d7), (int)((int)(-d7)), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        if_1.f(g2 + d7, f2 + (double)(a2 != false ? uSa.E : c2), e2 - d7 * KPa.y, d7 - (double)(a2 != false ? uSa.E : c2), color2);
        if_1.f(g2 + (double)(a2 != false ? uSa.E : c2), f2 + d7, e2 - (double)(a2 != false ? uSa.E : c2 * uqa.g), d6 - d7 * KPa.y, color2);
        if_1.f(g2 + d7, f2 + d6 - d7, e2 - d7 * KPa.y, d7 - (double)(a2 != false ? uSa.E : c2), color2);
    }

    /*
     * WARNING - void declaration
     */
    public static void A(double d2, double d3, double d4, double d5, Color color, Kd kd) {
        double c2;
        double d6;
        double e2;
        double f2;
        void a2;
        Color color2 = color;
        aJa b22 = Kpa.J().J();
        void v0 = a2;
        int b22 = v0.getBorderWidth();
        double d7 = v0.getSize();
        f2 = Math.round(f2);
        e2 = Math.round(e2);
        d6 = Math.round(d6);
        c2 = Math.round(c2);
        b22.J(a2.getBorder());
        uKa.f((float)((float)color2.getRed() / NQa.Y), (float)((float)color2.getGreen() / NQa.Y), (float)((float)color2.getBlue() / NQa.Y), (float)((float)color2.getAlpha() / NQa.Y));
        uKa.K();
        uKa.B();
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        KA.J((int)((int)f2), (int)((int)e2), (float)((int)d7), (float)((int)d7), (int)((int)d7), (int)((int)d7), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        KA.J((int)((int)(f2 + d6 - d7)), (int)((int)e2), (float)((int)d7), (float)((int)d7), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        KA.J((int)((int)f2), (int)((int)(e2 + c2 - d7)), (float)((int)d7), (float)((int)d7), (int)((int)d7), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        KA.J((int)((int)(f2 + d6 - d7)), (int)((int)(e2 + c2 - d7)), (float)((int)d7), (float)((int)d7), (int)((int)(-d7)), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        if_1.f(f2 + d7, e2, d6 - d7 * KPa.y, b22, color2);
        if_1.f(f2 + d7, e2 + c2 - (double)b22, d6 - d7 * KPa.y, b22, color2);
        if_1.f(f2, e2 + d7, b22, c2 - d7 * KPa.y, color2);
        if_1.f(f2 + d6 - (double)b22, e2 + d7, b22, c2 - d7 * KPa.y, color2);
    }

    public static void l(double e2, double d2, double c2, double b2, Color a2) {
        if_1.A(e2, d2, c2, b2, a2, Kd.S);
    }

    /*
     * WARNING - void declaration
     */
    public static void J(double d2, double d3, double d4, double d5, Color color, boolean bl) {
        void b2;
        void c2;
        void d6;
        void e2;
        double f2;
        boolean bl2 = bl;
        Color a2 = color;
        if_1.J(f2, (double)e2, (double)d6, (double)c2, a2, Kd.S, (boolean)b2);
    }

    /*
     * WARNING - void declaration
     */
    public static void f(double d2, double d3, double d4, double d5, Color color) {
        void b2;
        void c2;
        void d6;
        double e2;
        Color color2 = color;
        pKa pKa2 = pKa.J();
        aKa a2 = pKa2.J();
        uKa.B();
        uKa.z();
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        aKa aKa2 = a2;
        uKa.f((float)((float)color2.getRed() / NQa.Y), (float)((float)color2.getGreen() / NQa.Y), (float)((float)color2.getBlue() / NQa.Y), (float)((float)color2.getAlpha() / NQa.Y));
        aKa2.J(XTa.W, mka.M);
        Kh.J((aKa)aKa2, (double)e2, (double)d6, (double)c2, (double)b2);
        pKa2.J();
        uKa.H();
    }

    /*
     * WARNING - void declaration
     */
    public static void i(double d2, double d3, double d4, double d5, Color color, Kd kd) {
        double c2;
        double d6;
        double e2;
        double f2;
        void a2;
        Color color2 = color;
        aJa b22 = Kpa.J().J();
        void v0 = a2;
        double d7 = v0.getSize();
        int b22 = v0.getBorderWidth();
        f2 = Math.round(f2);
        e2 = Math.round(e2);
        d6 = Math.round(d6);
        c2 = Math.round(c2);
        b22.J(a2.getBorder());
        uKa.f((float)((float)color2.getRed() / NQa.Y), (float)((float)color2.getGreen() / NQa.Y), (float)((float)color2.getBlue() / NQa.Y), (float)((float)color2.getAlpha() / NQa.Y));
        uKa.K();
        uKa.B();
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        KA.J((int)((int)f2), (int)((int)e2), (float)((int)d7), (float)((int)d7), (int)((int)d7), (int)((int)d7), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        KA.J((int)((int)f2), (int)((int)(e2 + c2 - d7)), (float)((int)d7), (float)((int)d7), (int)((int)d7), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        if_1.f(f2, e2 + d7, b22, c2 - d7 * KPa.y, color2);
        if_1.f(f2 + d7, e2, d6 - d7, b22, color2);
        if_1.f(f2 + d7, e2 + c2 - (double)b22, d6 - d7, b22, color2);
        if_1.f(f2, e2, b22, c2, color2);
    }

    public static void J(double d2, double c2, double b2, double a2) {
        aKa aKa2;
        pKa pKa2 = pKa.J();
        aKa aKa3 = aKa2 = pKa2.J();
        double d3 = d2;
        aKa aKa4 = aKa2;
        aKa4.J(XTa.W, mka.A);
        aKa4.J(d2, c2 + a2, aSa.V).J(aSa.V, oua.i).M();
        aKa2.J(d3 + b2, c2 + a2, aSa.V).J(oua.i, oua.i).M();
        aKa3.J(d3 + b2, c2, aSa.V).J(oua.i, aSa.V).M();
        aKa3.J(d2, c2, aSa.V).J(aSa.V, aSa.V).M();
        pKa2.J();
    }

    /*
     * WARNING - void declaration
     */
    public static void M(double d2, double d3, double d4, double d5, Color color, Kd kd) {
        double c2;
        double d6;
        double e2;
        double f2;
        void a2;
        Color color2 = color;
        aJa b22 = Kpa.J().J();
        void v0 = a2;
        double d7 = v0.getSize();
        int b22 = v0.getBorderWidth();
        f2 = Math.round(f2);
        e2 = Math.round(e2);
        d6 = Math.round(d6);
        c2 = Math.round(c2);
        b22.J(a2.getBorder());
        uKa.f((float)((float)color2.getRed() / NQa.Y), (float)((float)color2.getGreen() / NQa.Y), (float)((float)color2.getBlue() / NQa.Y), (float)((float)color2.getAlpha() / NQa.Y));
        uKa.K();
        uKa.B();
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        KA.J((int)((int)(f2 + d6 - d7)), (int)((int)e2), (float)((int)d7), (float)((int)d7), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        KA.J((int)((int)(f2 + d6 - d7)), (int)((int)(e2 + c2 - d7)), (float)((int)d7), (float)((int)d7), (int)((int)(-d7)), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        if_1.f(f2 + d6 - (double)b22, e2 + d7, b22, c2 - d7 * KPa.y, color2);
        if_1.f(f2, e2, d6 - d7, b22, color2);
        if_1.f(f2, e2 + c2 - (double)b22, d6 - d7, b22, color2);
        if_1.f(f2 + d6 - d7, e2, b22, c2, color2);
    }

    /*
     * WARNING - void declaration
     */
    public static void e(double d2, double d3, double d4, double d5, Color color, Kd kd) {
        double c2;
        double d6;
        double e2;
        double f2;
        void a2;
        Color color2 = color;
        aJa b2 = Kpa.J().J();
        void v0 = a2;
        double d7 = v0.getSize();
        v0.getBorderWidth();
        f2 = Math.round(f2);
        e2 = Math.round(e2);
        d6 = Math.round(d6);
        c2 = Math.round(c2);
        b2.J(a2.getFill());
        uKa.f((float)((float)color2.getRed() / NQa.Y), (float)((float)color2.getGreen() / NQa.Y), (float)((float)color2.getBlue() / NQa.Y), (float)((float)color2.getAlpha() / NQa.Y));
        uKa.K();
        uKa.B();
        KA.J((int)((int)f2), (int)((int)e2), (float)((int)d7), (float)((int)d7), (int)((int)d7), (int)((int)d7), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        KA.J((int)((int)f2), (int)((int)(e2 + c2 - d7)), (float)((int)d7), (float)((int)d7), (int)((int)d7), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        double d8 = d7;
        if_1.f(f2, e2 + d7, d8, c2 - d8 * KPa.y, color2);
        if_1.f(f2 + d7, e2, d6 - d7, c2, color2);
    }

    /*
     * WARNING - void declaration
     */
    public static void d(double d2, double d3, double d4, double d5, Color color, Kd kd) {
        double c2;
        double d6;
        double e2;
        double f2;
        void a2;
        Color color2 = color;
        aJa b2 = Kpa.J().J();
        void v0 = a2;
        double d7 = v0.getSize();
        v0.getBorderWidth();
        f2 = Math.round(f2);
        e2 = Math.round(e2);
        d6 = Math.round(d6);
        c2 = Math.round(c2);
        b2.J(a2.getFill());
        uKa.f((float)((float)color2.getRed() / NQa.Y), (float)((float)color2.getGreen() / NQa.Y), (float)((float)color2.getBlue() / NQa.Y), (float)((float)color2.getAlpha() / NQa.Y));
        uKa.K();
        uKa.B();
        KA.J((int)((int)f2), (int)((int)(e2 + c2 - d7)), (float)((int)d7), (float)((int)d7), (int)((int)d7), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        KA.J((int)((int)(f2 + d6 - d7)), (int)((int)(e2 + c2 - d7)), (float)((int)d7), (float)((int)d7), (int)((int)(-d7)), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        if_1.f(f2, e2, d6, c2 - d7, color2);
        if_1.f(f2 + d7, e2 + c2 - d7, d6 - d7 * KPa.y, d7, color2);
    }

    /*
     * WARNING - void declaration
     */
    public static void C(double d2, double d3, double d4, double d5, Color color, Kd kd) {
        void b2;
        void c2;
        void d6;
        void e2;
        double f2;
        Color color2 = color;
        color = kd;
        Color a2 = color2;
        if_1.J(f2, (double)e2, (double)d6, (double)c2, a2, (Kd)b2, vRa.d != 0);
    }

    /*
     * WARNING - void declaration
     */
    public static void C(double d2, double d3, double d4, double d5, Color color, Color color2, Kd kd) {
        void b2;
        double d6;
        double e2;
        double f2;
        double g2;
        void a2;
        Color color3 = color;
        aJa aJa2 = Kpa.J().J();
        void v0 = a2;
        double d7 = v0.getSize();
        int c2 = v0.getBorderWidth();
        g2 = Math.round(g2);
        f2 = Math.round(f2);
        e2 = Math.round(e2);
        d6 = Math.round(d6);
        aJa2.J(a2.getFill());
        uKa.f((float)((float)color3.getRed() / NQa.Y), (float)((float)color3.getGreen() / NQa.Y), (float)((float)color3.getBlue() / NQa.Y), (float)((float)color3.getAlpha() / NQa.Y));
        uKa.K();
        uKa.B();
        KA.J((int)((int)g2), (int)((int)(f2 + d6 - d7)), (float)((int)d7), (float)((int)d7), (int)((int)d7), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        if_1.f(g2, f2, e2, d6 - d7, color3);
        if_1.f(g2 + d7, f2 + d6 - d7, e2 - d7, d7, color3);
        aJa2.J(a2.getBorder());
        uKa.f((float)((float)b2.getRed() / NQa.Y), (float)((float)b2.getGreen() / NQa.Y), (float)((float)b2.getBlue() / NQa.Y), (float)((float)b2.getAlpha() / NQa.Y));
        KA.J((int)((int)g2), (int)((int)(f2 + d6 - d7)), (float)((int)d7), (float)((int)d7), (int)((int)d7), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        if_1.f(g2, f2, e2, c2, (Color)b2);
        if_1.f(g2, f2 + (double)c2, c2, d6 - d7 - (double)c2, (Color)b2);
        if_1.f(g2 + e2 - (double)c2, f2 + (double)c2, c2, d6 - (double)(c2 * uqa.g), (Color)b2);
        if_1.f(g2 + d7, f2 + d6 - (double)c2, e2 - d7, c2, (Color)b2);
    }

    /*
     * WARNING - void declaration
     */
    public static void J(double d2, double d3, double d4, double d5, double d6, Color color, Color color2) {
        void b2;
        void c2;
        void d7;
        void e2;
        void f2;
        double g2;
        Color color3 = color;
        color = color2;
        Color a2 = color3;
        if_1.J(g2, (double)f2, (double)e2, (double)d7, (double)c2, (Color)b2);
        if_1.f(g2 + c2, (double)(f2 + c2), (double)(e2 - c2 * KPa.y), (double)(d7 - c2 * KPa.y), a2);
    }

    /*
     * WARNING - void declaration
     */
    public static void l(double d2, double d3, double d4, double d5, Color color, Kd kd) {
        double c2;
        double d6;
        double e2;
        double f2;
        void a2;
        Color color2 = color;
        aJa b22 = Kpa.J().J();
        void v0 = a2;
        double d7 = v0.getSize();
        int b22 = v0.getBorderWidth();
        f2 = Math.round(f2);
        e2 = Math.round(e2);
        d6 = Math.round(d6);
        c2 = Math.round(c2);
        b22.J(a2.getBorder());
        uKa.f((float)((float)color2.getRed() / NQa.Y), (float)((float)color2.getGreen() / NQa.Y), (float)((float)color2.getBlue() / NQa.Y), (float)((float)color2.getAlpha() / NQa.Y));
        uKa.K();
        uKa.B();
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        KA.J((int)((int)f2), (int)((int)e2), (float)((int)d7), (float)((int)d7), (int)((int)d7), (int)((int)d7), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        KA.J((int)((int)(f2 + d6 - d7)), (int)((int)e2), (float)((int)d7), (float)((int)d7), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        if_1.f(f2 + d7, e2, d6 - d7 * KPa.y, b22, color2);
        if_1.f(f2, e2 + d7, b22, c2 - d7, color2);
        if_1.f(f2 + d6 - (double)b22, e2 + d7, b22, c2 - d7, color2);
        if_1.f(f2, e2, d6, b22, color2);
    }

    /*
     * WARNING - void declaration
     */
    public static void C(double d2, double d3, double d4, double d5, Color color, Color color2) {
        void b2;
        void c2;
        void d6;
        void e2;
        double f2;
        Color color3 = color;
        color = color2;
        Color a2 = color3;
        if_1.J(f2, (double)e2, (double)d6, (double)c2, a2, (Color)b2, Kd.S);
    }

    /*
     * WARNING - void declaration
     */
    public static void f(double d2, double d3, double d4, double d5, Color color, Kd kd) {
        double c2;
        double d6;
        double e2;
        double f2;
        void a2;
        Color color2 = color;
        aJa b22 = Kpa.J().J();
        void v0 = a2;
        double d7 = v0.getSize();
        int b22 = v0.getBorderWidth();
        f2 = Math.round(f2);
        e2 = Math.round(e2);
        d6 = Math.round(d6);
        c2 = Math.round(c2);
        b22.J(a2.getBorder());
        uKa.f((float)((float)color2.getRed() / NQa.Y), (float)((float)color2.getGreen() / NQa.Y), (float)((float)color2.getBlue() / NQa.Y), (float)((float)color2.getAlpha() / NQa.Y));
        uKa.K();
        uKa.B();
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        KA.J((int)((int)f2), (int)((int)(e2 + c2 - d7)), (float)((int)d7), (float)((int)d7), (int)((int)d7), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        KA.J((int)((int)(f2 + d6 - d7)), (int)((int)(e2 + c2 - d7)), (float)((int)d7), (float)((int)d7), (int)((int)(-d7)), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        if_1.f(f2 + d7, e2 + c2 - (double)b22, d6 - d7 * KPa.y, b22, color2);
        if_1.f(f2, e2, b22, c2 - d7, color2);
        if_1.f(f2 + d6 - (double)b22, e2, b22, c2 - d7, color2);
        if_1.f(f2, e2 + c2 - (double)b22, d6, b22, color2);
    }

    public static void J(String c2, double b2, double a2) {
        if_1.J(c2, b2, a2, pqa.r, uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public static void J(double d2, double d3, double d4, double d5, Color color, Kd kd) {
        double c2;
        double d6;
        double e2;
        double f2;
        void a2;
        Color color2 = color;
        aJa b2 = Kpa.J().J();
        void v0 = a2;
        double d7 = v0.getSize();
        v0.getBorderWidth();
        f2 = Math.round(f2);
        e2 = Math.round(e2);
        d6 = Math.round(d6);
        c2 = Math.round(c2);
        b2.J(a2.getFill());
        uKa.f((float)((float)color2.getRed() / NQa.Y), (float)((float)color2.getGreen() / NQa.Y), (float)((float)color2.getBlue() / NQa.Y), (float)((float)color2.getAlpha() / NQa.Y));
        uKa.K();
        uKa.B();
        KA.J((int)((int)(f2 + d6 - d7)), (int)((int)e2), (float)((int)d7), (float)((int)d7), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        KA.J((int)((int)(f2 + d6 - d7)), (int)((int)(e2 + c2 - d7)), (float)((int)d7), (float)((int)d7), (int)((int)(-d7)), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        if_1.f(f2, e2, d6 - d7, c2, color2);
        double d8 = d7;
        if_1.f(f2 + d6 - d7, e2 + d7, d8, c2 - d8 * KPa.y, color2);
    }

    /*
     * WARNING - void declaration
     */
    public static void J(String string, double d2, double d3, double d4, double d5, int n2) {
        void b2;
        void c2;
        void d6;
        void e2;
        void f322;
        int n3 = n2;
        String a2 = string;
        float f2 = (float)(f322 >> osa.c & osa.Ja) / NQa.Y;
        float f4 = (float)(f322 >> ERa.C & osa.Ja) / NQa.Y;
        float f5 = (float)(f322 >> Yqa.i & osa.Ja) / NQa.Y;
        float f322 = (float)(f322 & osa.Ja) / NQa.Y;
        uKa.f((float)f4, (float)f5, (float)f322, (float)f2);
        PH f322 = I.getIfPresent(a2);
        if (f322 == null) {
            f322 = new PH(a2, uSa.E != 0);
            I.put(a2, f322);
        }
        f322 = f322.J(null);
        uKa.C((int)f322.I);
        uKa.B();
        uKa.K();
        KA.J((int)((int)e2), (int)((int)d6), (float)(f322.A + Qsa.k), (float)(f322.j + Qsa.k), (int)Yqa.i, (int)Yqa.i, (int)((int)c2), (int)((int)b2), (float)EPa.r, (float)EPa.r);
    }

    /*
     * WARNING - void declaration
     */
    public static void l(double d2, double d3, double d4, double d5, Color color, Color color2) {
        void b2;
        void c2;
        void d6;
        void e2;
        double f2;
        Color color3 = color;
        color = color2;
        Color a2 = color3;
        if_1.l(f2, (double)e2, (double)d6, (double)c2, a2, (Color)b2, Kd.S);
    }

    /*
     * WARNING - void declaration
     */
    public static void f(String string, double d2, double d3, float f2, float f3, boolean bl) {
        void v7;
        rc rc2;
        void v3;
        rc rc3;
        void b2;
        void d4;
        void e2;
        void a2;
        void f4;
        float f5 = f2;
        String c2 = string;
        uKa.K();
        Ii ii2 = Le.J((PF)PF.VIME_ART, (lE)lE.THIN, (int)((int)(bsa.la * f4)));
        double d5 = c2.length() == vRa.d ? zOa.y : (double)(lqa.s + ii2.f(c2));
        double d6 = zOa.y;
        if (a2 != false) {
            d4 += (double)f4 * uRa.I;
        }
        if_1.f((double)e2, (double)d4, d5, d6, (double)f4, (Color)Bc.Ja.transparent((float)b2));
        double d7 = (double)f4;
        double d8 = (double)f4;
        if (a2 != false) {
            rc3 = Bc.Da;
            v3 = b2;
        } else {
            rc3 = Bc.Ga;
            v3 = b2;
        }
        if_1.J((double)e2, (double)d4, d5, d6, d7, d8, (Color)rc3.transparent((float)v3));
        d5 += (double)(f4 * kta.v);
        if (a2 == false) {
            if_1.f((double)(e2 - (double)f4), (double)(d4 + d6), d5, (double)f4, (double)f4, (double)f4, Bc.Ea.transparent((float)b2));
            if_1.f((double)(e2 - (double)f4), (double)(d4 + d6 + (double)f4), d5, (double)f4, (double)f4, (double)f4, Bc.c.transparent((float)b2));
        }
        int n2 = (int)(e2 + d5 / KPa.y - (double)ii2.f(c2) * JPa.ja / KPa.y);
        int n3 = (int)(d4 + d6 / KPa.y - (double)ii2.J(c2) / KPa.y - oua.i);
        if (a2 != false) {
            rc2 = Bc.H;
            v7 = b2;
        } else {
            rc2 = Bc.Ba;
            v7 = b2;
        }
        ii2.J(c2, n2, n3, rc2.transparent((float)v7).getRGB(), uSa.E != 0);
        uKa.c();
    }

    /*
     * WARNING - void declaration
     */
    public static void f(double d2, double d3, double d4, double d5, Color color, Color color2) {
        void b2;
        void c2;
        void e2;
        void d6;
        double f2;
        aKa aKa2;
        Color color3 = color;
        color = color2;
        Color a2 = color3;
        uKa.z();
        uKa.B();
        uKa.c();
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        uKa.F((int)gua.X);
        pKa pKa2 = pKa.J();
        aKa aKa3 = aKa2 = pKa2.J();
        double d7 = f2;
        aKa aKa4 = aKa2;
        aKa4.J(XTa.W, mka.I);
        aKa4.J(f2 + d6, (double)e2, oua.i).J(a2.getRed(), a2.getGreen(), a2.getBlue(), a2.getAlpha()).M();
        aKa2.J(d7, (double)e2, oua.i).J(a2.getRed(), a2.getGreen(), a2.getBlue(), a2.getAlpha()).M();
        aKa3.J(d7, (double)(e2 + c2), oua.i).J(b2.getRed(), b2.getGreen(), b2.getBlue(), b2.getAlpha()).M();
        aKa3.J(f2 + d6, (double)(e2 + c2), oua.i).J(b2.getRed(), b2.getGreen(), b2.getBlue(), b2.getAlpha()).M();
        pKa2.J();
        uKa.F((int)Zra.f);
        uKa.K();
        uKa.H();
    }

    /*
     * WARNING - void declaration
     */
    public static void J(String string, double d2, double d3, float f2) {
        void d4;
        void b2;
        void c2;
        float f3 = f2;
        String a2 = string;
        if_1.J(a2, (double)c2, (double)b2, (float)d4, uSa.E != 0);
    }

    public static void f(double f2, double e2, double d2, double c2, double b2, Color a2) {
        if_1.f(f2 + b2, e2, d2 - b2 * KPa.y, b2, a2);
        if_1.f(f2, e2 + b2, d2, c2 - b2 * KPa.y, a2);
        if_1.f(f2 + b2, e2 + c2 - b2, d2 - b2 * KPa.y, b2, a2);
    }

    /*
     * WARNING - void declaration
     */
    public static void f(double d2, double d3, double d4, double d5, Color color, Kd kd, Kd kd2, boolean bl) {
        void d6;
        double e2;
        double f2;
        double g2;
        double h;
        void b2;
        void c2;
        boolean bl2 = bl;
        Color a2 = color;
        if (c2 == null && b2 == null) {
            if_1.f(h, g2, f2, e2, a2);
            return;
        }
        if (c2 == null) {
            if_1.d(h, g2, f2, e2, a2, (Kd)b2);
            return;
        }
        if (b2 == null) {
            if_1.D(h, g2, f2, e2, a2, (Kd)c2);
            return;
        }
        aJa aJa2 = Kpa.J().J();
        void v0 = c2;
        double d7 = v0.getSize();
        double d8 = b2.getSize();
        int n2 = v0.getBorderWidth();
        h = Math.round(h);
        g2 = Math.round(g2);
        f2 = Math.round(f2);
        e2 = Math.round(e2);
        void v1 = c2;
        aJa2.J(d6 != false ? v1.getFill() : v1.getFillNoBorder());
        uKa.f((float)((float)a2.getRed() / NQa.Y), (float)((float)a2.getGreen() / NQa.Y), (float)((float)a2.getBlue() / NQa.Y), (float)((float)a2.getAlpha() / NQa.Y));
        uKa.K();
        uKa.B();
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        KA.J((int)((int)h), (int)((int)g2), (float)((int)d7), (float)((int)d7), (int)((int)d7), (int)((int)d7), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        KA.J((int)((int)(h + f2 - d7)), (int)((int)g2), (float)((int)d7), (float)((int)d7), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        void v2 = b2;
        aJa2.J(d6 != false ? v2.getFill() : v2.getFillNoBorder());
        KA.J((int)((int)h), (int)((int)(g2 + e2 - d8)), (float)((int)d8), (float)((int)d8), (int)((int)d8), (int)((int)(-d8)), (int)((int)d8), (int)((int)d8), (float)((int)d8), (float)((int)d8));
        KA.J((int)((int)(h + f2 - d8)), (int)((int)(g2 + e2 - d8)), (float)((int)d8), (float)((int)d8), (int)((int)(-d8)), (int)((int)(-d8)), (int)((int)d8), (int)((int)d8), (float)((int)d8), (float)((int)d8));
        if_1.f(h + d7, g2 + (double)(d6 != false ? uSa.E : n2), f2 - d7 * KPa.y, d7 - (double)(d6 != false ? uSa.E : n2), a2);
        if_1.f(h + (double)(d6 != false ? uSa.E : n2), g2 + d7, f2 - (double)(d6 != false ? uSa.E : n2 * uqa.g), e2 - d7 - d8, a2);
        if_1.f(h + d8, g2 + e2 - d8, f2 - d8 * KPa.y, d8 - (double)(d6 != false ? uSa.E : n2), a2);
    }

    /*
     * WARNING - void declaration
     */
    public static void J(double d2, double d3, double d4, double d5, Color color, Color color2) {
        void b2;
        void c2;
        void d6;
        void e2;
        double f2;
        Color color3 = color;
        color = color2;
        Color a2 = color3;
        if_1.d(f2, (double)e2, (double)d6, (double)c2, a2, (Color)b2, Kd.S);
    }

    /*
     * WARNING - void declaration
     */
    public static void J(String string, double d2, double d3, float f2, float f3, boolean bl) {
        void v7;
        rc rc2;
        void v3;
        rc rc3;
        void b2;
        void d4;
        void e2;
        void a2;
        void f4;
        float f5 = f2;
        String c2 = string;
        uKa.K();
        Ii ii2 = Le.J((PF)PF.VIME_ART, (lE)lE.THIN, (int)((int)(bsa.la * f4)));
        double d5 = c2.length() == vRa.d ? vQa.c : (double)(uua.p + ii2.f(c2));
        double d6 = hQa.x;
        if (a2 != false) {
            d4 += (double)f4 * uRa.I;
        }
        if_1.f((double)e2, (double)d4, d5, d6, (double)f4, (Color)Bc.Ja.transparent((float)b2));
        double d7 = (double)f4;
        double d8 = (double)f4;
        if (a2 != false) {
            rc3 = Bc.Da;
            v3 = b2;
        } else {
            rc3 = Bc.Ga;
            v3 = b2;
        }
        if_1.J((double)e2, (double)d4, d5, d6, d7, d8, (Color)rc3.transparent((float)v3));
        d5 += (double)(f4 * kta.v);
        if (a2 == false) {
            if_1.f((double)(e2 - (double)f4), (double)(d4 + d6), d5, (double)f4, (double)f4, (double)f4, Bc.Ea.transparent((float)b2));
            if_1.f((double)(e2 - (double)f4), (double)(d4 + d6 + (double)f4), d5, (double)f4, (double)f4, (double)f4, Bc.c.transparent((float)b2));
        }
        int n2 = (int)(e2 + d5 / KPa.y - (double)ii2.f(c2) * JPa.ja / KPa.y);
        int n3 = (int)(d4 + d6 / KPa.y - (double)ii2.J(c2) / KPa.y - oua.i);
        if (a2 != false) {
            rc2 = Bc.H;
            v7 = b2;
        } else {
            rc2 = Bc.Ba;
            v7 = b2;
        }
        ii2.J(c2, n2, n3, rc2.transparent((float)v7).getRGB(), uSa.E != 0);
        uKa.c();
    }

    public static void J(double g2, double f2, double e2, double d2, double c2, double b2, Color a2) {
        if_1.f(g2 + c2, f2, e2 - c2 * KPa.y, b2, a2);
        if_1.f(g2 + c2, f2 + d2 - b2, e2 - c2 * KPa.y, b2, a2);
        if_1.f(g2, f2 + c2, b2, d2 - c2 * KPa.y, a2);
        if_1.f(g2 + e2 - b2, f2 + c2, b2, d2 - c2 * KPa.y, a2);
        if_1.f(g2 + b2, f2 + c2, c2, b2, a2);
        double d3 = b2;
        if_1.f(g2 + c2, f2 + b2, d3, c2 - d3, a2);
        if_1.f(g2 + e2 - c2 - b2, f2 + c2, c2, b2, a2);
        double d4 = b2;
        if_1.f(g2 + e2 - c2 - b2, f2 + b2, d4, c2 - d4, a2);
        if_1.f(g2 + b2, f2 + d2 - c2 - b2, c2, b2, a2);
        double d5 = b2;
        if_1.f(g2 + c2, f2 + d2 - c2, d5, c2 - d5, a2);
        if_1.f(g2 + e2 - c2 - b2, f2 + d2 - c2 - b2, c2, b2, a2);
        double d6 = b2;
        if_1.f(g2 + e2 - c2 - b2, f2 + d2 - c2, d6, c2 - d6, a2);
    }

    /*
     * WARNING - void declaration
     */
    public static void l(double d2, double d3, double d4, double d5, Color color, Color color2, Kd kd) {
        void b2;
        double d6;
        double e2;
        double f2;
        double g2;
        void a2;
        Color color3 = color;
        aJa aJa2 = Kpa.J().J();
        void v0 = a2;
        double d7 = v0.getSize();
        int c2 = v0.getBorderWidth();
        g2 = Math.round(g2);
        f2 = Math.round(f2);
        e2 = Math.round(e2);
        d6 = Math.round(d6);
        aJa2.J(a2.getFill());
        uKa.f((float)((float)color3.getRed() / NQa.Y), (float)((float)color3.getGreen() / NQa.Y), (float)((float)color3.getBlue() / NQa.Y), (float)((float)color3.getAlpha() / NQa.Y));
        uKa.K();
        uKa.B();
        KA.J((int)((int)g2), (int)((int)(f2 + d6 - d7)), (float)((int)d7), (float)((int)d7), (int)((int)d7), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        KA.J((int)((int)(g2 + e2 - d7)), (int)((int)(f2 + d6 - d7)), (float)((int)d7), (float)((int)d7), (int)((int)(-d7)), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        if_1.f(g2, f2, e2, d6 - d7, color3);
        if_1.f(g2 + d7, f2 + d6 - d7, e2 - d7 * KPa.y, d7, color3);
        aJa2.J(a2.getBorder());
        uKa.f((float)((float)b2.getRed() / NQa.Y), (float)((float)b2.getGreen() / NQa.Y), (float)((float)b2.getBlue() / NQa.Y), (float)((float)b2.getAlpha() / NQa.Y));
        KA.J((int)((int)g2), (int)((int)(f2 + d6 - d7)), (float)((int)d7), (float)((int)d7), (int)((int)d7), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        KA.J((int)((int)(g2 + e2 - d7)), (int)((int)(f2 + d6 - d7)), (float)((int)d7), (float)((int)d7), (int)((int)(-d7)), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        if_1.f(g2, f2, e2, c2, (Color)b2);
        if_1.f(g2, f2 + (double)c2, c2, d6 - d7 - (double)c2, (Color)b2);
        if_1.f(g2 + e2 - (double)c2, f2 + (double)c2, c2, d6 - d7 - (double)c2, (Color)b2);
        if_1.f(g2 + d7, f2 + d6 - (double)c2, e2 - d7 * KPa.y, c2, (Color)b2);
    }

    /*
     * WARNING - void declaration
     */
    public static void J(double d2, double d3, double d4, double d5, Color color, Kd kd, Kd kd2) {
        double d6;
        double e2;
        double f2;
        double g2;
        void a2;
        void b2;
        Color color2 = color;
        if (b2 == null && a2 == null) {
            if_1.J(g2, f2, e2, d6, oua.i, color2);
            return;
        }
        if (b2 == null) {
            if_1.f(g2, f2, e2, d6, color2, (Kd)a2);
            return;
        }
        if (a2 == null) {
            if_1.l(g2, f2, e2, d6, color2, (Kd)b2);
            return;
        }
        aJa aJa2 = Kpa.J().J();
        void v0 = b2;
        double d7 = v0.getSize();
        double d8 = a2.getSize();
        int c2 = v0.getBorderWidth();
        g2 = Math.round(g2);
        f2 = Math.round(f2);
        e2 = Math.round(e2);
        d6 = Math.round(d6);
        aJa2.J(b2.getBorder());
        uKa.f((float)((float)color2.getRed() / NQa.Y), (float)((float)color2.getGreen() / NQa.Y), (float)((float)color2.getBlue() / NQa.Y), (float)((float)color2.getAlpha() / NQa.Y));
        uKa.K();
        uKa.B();
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        KA.J((int)((int)g2), (int)((int)f2), (float)((int)d7), (float)((int)d7), (int)((int)d7), (int)((int)d7), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        KA.J((int)((int)(g2 + e2 - d7)), (int)((int)f2), (float)((int)d7), (float)((int)d7), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        aJa2.J(a2.getBorder());
        KA.J((int)((int)g2), (int)((int)(f2 + d6 - d8)), (float)((int)d8), (float)((int)d8), (int)((int)d8), (int)((int)(-d8)), (int)((int)d8), (int)((int)d8), (float)((int)d8), (float)((int)d8));
        KA.J((int)((int)(g2 + e2 - d8)), (int)((int)(f2 + d6 - d8)), (float)((int)d8), (float)((int)d8), (int)((int)(-d8)), (int)((int)(-d8)), (int)((int)d8), (int)((int)d8), (float)((int)d8), (float)((int)d8));
        if_1.f(g2 + d7, f2, e2 - d7 * KPa.y, c2, color2);
        if_1.f(g2 + d8, f2 + d6 - (double)c2, e2 - d8 * KPa.y, c2, color2);
        if_1.f(g2, f2 + d7, c2, d6 - d7 - d8, color2);
        if_1.f(g2 + e2 - (double)c2, f2 + d7, c2, d6 - d7 - d8, color2);
    }

    public static void J(double e2, double d2, double c2, double b2, Color a2) {
        if_1.J(e2, d2, c2, b2, a2, Kd.S, vRa.d != 0);
    }

    /*
     * WARNING - void declaration
     */
    public static void J(String string, double d2, double d3, float f2, boolean bl) {
        void e2;
        void b2;
        void c2;
        void d4;
        boolean bl2 = bl;
        String a2 = string;
        if_1.f(a2, (double)d4, (double)c2, (float)b2, pqa.r, (boolean)e2);
    }

    /*
     * WARNING - void declaration
     */
    public static void f(double d2, double d3, double d4, double d5, Color color, Color color2, Kd kd, Kd kd2) {
        void d6;
        double e2;
        double f2;
        double g2;
        double h;
        void a2;
        void b2;
        Color color3 = color;
        color = color2;
        Color c2 = color3;
        if (b2 == null && a2 == null) {
            if_1.J(h, g2, f2, e2, KPa.y, c2, (Color)d6);
            return;
        }
        if (b2 == null) {
            aJa aJa2 = Kpa.J().J();
            void v1 = a2;
            double d7 = v1.getSize();
            int n2 = v1.getBorderWidth();
            h = Math.round(h);
            g2 = Math.round(g2);
            f2 = Math.round(f2);
            e2 = Math.round(e2);
            aJa2.J(a2.getFill());
            uKa.f((float)((float)c2.getRed() / NQa.Y), (float)((float)c2.getGreen() / NQa.Y), (float)((float)c2.getBlue() / NQa.Y), (float)((float)c2.getAlpha() / NQa.Y));
            uKa.K();
            uKa.B();
            uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
            KA.J((int)((int)h), (int)((int)(g2 + e2 - d7)), (float)((int)d7), (float)((int)d7), (int)((int)d7), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
            KA.J((int)((int)(h + f2 - d7)), (int)((int)(g2 + e2 - d7)), (float)((int)d7), (float)((int)d7), (int)((int)(-d7)), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
            if_1.f(h, g2, f2, e2 - d7, c2);
            if_1.f(h + d7, g2 + e2 - d7, f2 - d7 * KPa.y, d7, c2);
            aJa2.J(a2.getBorder());
            uKa.f((float)((float)d6.getRed() / NQa.Y), (float)((float)d6.getGreen() / NQa.Y), (float)((float)d6.getBlue() / NQa.Y), (float)((float)d6.getAlpha() / NQa.Y));
            KA.J((int)((int)h), (int)((int)(g2 + e2 - d7)), (float)((int)d7), (float)((int)d7), (int)((int)d7), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
            KA.J((int)((int)(h + f2 - d7)), (int)((int)(g2 + e2 - d7)), (float)((int)d7), (float)((int)d7), (int)((int)(-d7)), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
            if_1.f(h, g2, f2, n2, (Color)d6);
            if_1.f(h, g2 + (double)n2, n2, e2 - d7 - (double)n2, (Color)d6);
            if_1.f(h + f2 - (double)n2, g2 + (double)n2, n2, e2 - d7 - (double)n2, (Color)d6);
            if_1.f(h + d7, g2 + e2 - (double)n2, f2 - d7 * KPa.y, n2, (Color)d6);
            return;
        }
        if (a2 == null) {
            aJa aJa3 = Kpa.J().J();
            void v2 = b2;
            double d8 = v2.getSize();
            int n3 = v2.getBorderWidth();
            h = Math.round(h);
            g2 = Math.round(g2);
            f2 = Math.round(f2);
            e2 = Math.round(e2);
            aJa3.J(b2.getFill());
            uKa.f((float)((float)c2.getRed() / NQa.Y), (float)((float)c2.getGreen() / NQa.Y), (float)((float)c2.getBlue() / NQa.Y), (float)((float)c2.getAlpha() / NQa.Y));
            uKa.K();
            uKa.B();
            uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
            KA.J((int)((int)h), (int)((int)g2), (float)((int)d8), (float)((int)d8), (int)((int)d8), (int)((int)d8), (int)((int)d8), (int)((int)d8), (float)((int)d8), (float)((int)d8));
            KA.J((int)((int)(h + f2 - d8)), (int)((int)g2), (float)((int)d8), (float)((int)d8), (int)((int)(-d8)), (int)((int)d8), (int)((int)d8), (int)((int)d8), (float)((int)d8), (float)((int)d8));
            if_1.f(h + d8, g2, f2 - d8 * KPa.y, d8, c2);
            if_1.f(h, g2 + d8, f2, e2 - d8, c2);
            aJa3.J(b2.getBorder());
            uKa.f((float)((float)d6.getRed() / NQa.Y), (float)((float)d6.getGreen() / NQa.Y), (float)((float)d6.getBlue() / NQa.Y), (float)((float)d6.getAlpha() / NQa.Y));
            KA.J((int)((int)h), (int)((int)g2), (float)((int)d8), (float)((int)d8), (int)((int)d8), (int)((int)d8), (int)((int)d8), (int)((int)d8), (float)((int)d8), (float)((int)d8));
            KA.J((int)((int)(h + f2 - d8)), (int)((int)g2), (float)((int)d8), (float)((int)d8), (int)((int)(-d8)), (int)((int)d8), (int)((int)d8), (int)((int)d8), (float)((int)d8), (float)((int)d8));
            if_1.f(h + d8, g2, f2 - d8 * KPa.y, n3, (Color)d6);
            if_1.f(h, g2 + d8, n3, e2 - d8, (Color)d6);
            if_1.f(h + f2 - (double)n3, g2 + d8, n3, e2 - d8, (Color)d6);
            if_1.f(h, g2 + e2 - (double)n3, f2, n3, (Color)d6);
            return;
        }
        aJa aJa4 = Kpa.J().J();
        void v3 = b2;
        double d9 = v3.getSize();
        double d10 = a2.getSize();
        int n4 = v3.getBorderWidth();
        h = Math.round(h);
        g2 = Math.round(g2);
        f2 = Math.round(f2);
        e2 = Math.round(e2);
        aJa aJa5 = aJa4;
        double d11 = h;
        aJa4.J(b2.getFill());
        uKa.f((float)((float)c2.getRed() / NQa.Y), (float)((float)c2.getGreen() / NQa.Y), (float)((float)c2.getBlue() / NQa.Y), (float)((float)c2.getAlpha() / NQa.Y));
        uKa.K();
        uKa.B();
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        KA.J((int)((int)d11), (int)((int)g2), (float)((int)d9), (float)((int)d9), (int)((int)d9), (int)((int)d9), (int)((int)d9), (int)((int)d9), (float)((int)d9), (float)((int)d9));
        KA.J((int)((int)(h + f2 - d9)), (int)((int)g2), (float)((int)d9), (float)((int)d9), (int)((int)(-d9)), (int)((int)d9), (int)((int)d9), (int)((int)d9), (float)((int)d9), (float)((int)d9));
        aJa5.J(a2.getFill());
        KA.J((int)((int)d11), (int)((int)(g2 + e2 - d10)), (float)((int)d10), (float)((int)d10), (int)((int)d10), (int)((int)(-d10)), (int)((int)d10), (int)((int)d10), (float)((int)d10), (float)((int)d10));
        KA.J((int)((int)(h + f2 - d10)), (int)((int)(g2 + e2 - d10)), (float)((int)d10), (float)((int)d10), (int)((int)(-d10)), (int)((int)(-d10)), (int)((int)d10), (int)((int)d10), (float)((int)d10), (float)((int)d10));
        if_1.f(h + d9, g2, f2 - d9 * KPa.y, d9, c2);
        if_1.f(h, g2 + d9, f2, e2 - d9 - d10, c2);
        if_1.f(h + d10, g2 + e2 - d10, f2 - d10 * KPa.y, d10, c2);
        aJa5.J(b2.getBorder());
        uKa.f((float)((float)d6.getRed() / NQa.Y), (float)((float)d6.getGreen() / NQa.Y), (float)((float)d6.getBlue() / NQa.Y), (float)((float)d6.getAlpha() / NQa.Y));
        KA.J((int)((int)h), (int)((int)g2), (float)((int)d9), (float)((int)d9), (int)((int)d9), (int)((int)d9), (int)((int)d9), (int)((int)d9), (float)((int)d9), (float)((int)d9));
        KA.J((int)((int)(h + f2 - d9)), (int)((int)g2), (float)((int)d9), (float)((int)d9), (int)((int)(-d9)), (int)((int)d9), (int)((int)d9), (int)((int)d9), (float)((int)d9), (float)((int)d9));
        aJa4.J(a2.getBorder());
        KA.J((int)((int)h), (int)((int)(g2 + e2 - d10)), (float)((int)d10), (float)((int)d10), (int)((int)d10), (int)((int)(-d10)), (int)((int)d10), (int)((int)d10), (float)((int)d10), (float)((int)d10));
        KA.J((int)((int)(h + f2 - d10)), (int)((int)(g2 + e2 - d10)), (float)((int)d10), (float)((int)d10), (int)((int)(-d10)), (int)((int)(-d10)), (int)((int)d10), (int)((int)d10), (float)((int)d10), (float)((int)d10));
        if_1.f(h + d9, g2, f2 - d9 * KPa.y, n4, (Color)d6);
        if_1.f(h, g2 + d9, n4, e2 - d9 - d10, (Color)d6);
        if_1.f(h + f2 - (double)n4, g2 + d9, n4, e2 - d9 - d10, (Color)d6);
        if_1.f(h + d10, g2 + e2 - (double)n4, f2 - d10 * KPa.y, n4, (Color)d6);
    }

    /*
     * WARNING - void declaration
     */
    public static void J(double d2, double d3, double d4, double d5, Color color, Color color2, Kd kd, Kd kd2) {
        void d6;
        double e2;
        double f2;
        double g2;
        double h;
        void a2;
        void b2;
        Color color3 = color;
        color = color2;
        Color c2 = color3;
        if (b2 == null && a2 == null) {
            if_1.J(h, g2, f2, e2, KPa.y, c2, (Color)d6);
            return;
        }
        if (b2 == null) {
            aJa aJa2 = Kpa.J().J();
            void v1 = a2;
            double d7 = v1.getSize();
            int n2 = v1.getBorderWidth();
            h = Math.round(h);
            g2 = Math.round(g2);
            f2 = Math.round(f2);
            e2 = Math.round(e2);
            aJa2.J(a2.getFill());
            uKa.f((float)((float)c2.getRed() / NQa.Y), (float)((float)c2.getGreen() / NQa.Y), (float)((float)c2.getBlue() / NQa.Y), (float)((float)c2.getAlpha() / NQa.Y));
            uKa.K();
            uKa.B();
            uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
            KA.J((int)((int)(h + f2 - d7)), (int)((int)g2), (float)((int)d7), (float)((int)d7), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
            KA.J((int)((int)(h + f2 - d7)), (int)((int)(g2 + e2 - d7)), (float)((int)d7), (float)((int)d7), (int)((int)(-d7)), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
            if_1.f(h, g2, f2 - d7, e2, c2);
            double d8 = d7;
            if_1.f(h + f2 - d7, g2 + d7, d8, e2 - d8 * KPa.y, c2);
            aJa2.J(a2.getBorder());
            uKa.f((float)((float)d6.getRed() / NQa.Y), (float)((float)d6.getGreen() / NQa.Y), (float)((float)d6.getBlue() / NQa.Y), (float)((float)d6.getAlpha() / NQa.Y));
            KA.J((int)((int)(h + f2 - d7)), (int)((int)g2), (float)((int)d7), (float)((int)d7), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
            KA.J((int)((int)(h + f2 - d7)), (int)((int)(g2 + e2 - d7)), (float)((int)d7), (float)((int)d7), (int)((int)(-d7)), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
            if_1.f(h, g2, f2 - d7, n2, (Color)d6);
            if_1.f(h, g2 + (double)n2, n2, e2 - (double)(n2 * uqa.g), (Color)d6);
            if_1.f(h + f2 - (double)n2, g2 + (double)n2, n2, e2 - (double)(n2 * uqa.g), (Color)d6);
            if_1.f(h + d7, g2 + e2 - (double)n2, f2 - d7 * KPa.y, n2, (Color)d6);
            return;
        }
        if (a2 == null) {
            aJa aJa3 = Kpa.J().J();
            void v3 = b2;
            double d9 = v3.getSize();
            int n3 = v3.getBorderWidth();
            h = Math.round(h);
            g2 = Math.round(g2);
            f2 = Math.round(f2);
            e2 = Math.round(e2);
            aJa3.J(b2.getFill());
            uKa.f((float)((float)c2.getRed() / NQa.Y), (float)((float)c2.getGreen() / NQa.Y), (float)((float)c2.getBlue() / NQa.Y), (float)((float)c2.getAlpha() / NQa.Y));
            uKa.K();
            uKa.B();
            uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
            KA.J((int)((int)h), (int)((int)g2), (float)((int)d9), (float)((int)d9), (int)((int)d9), (int)((int)d9), (int)((int)d9), (int)((int)d9), (float)((int)d9), (float)((int)d9));
            KA.J((int)((int)h), (int)((int)(g2 + e2 - d9)), (float)((int)d9), (float)((int)d9), (int)((int)d9), (int)((int)(-d9)), (int)((int)d9), (int)((int)d9), (float)((int)d9), (float)((int)d9));
            double d10 = d9;
            if_1.f(h, g2 + d9, d10, e2 - d10 * KPa.y, c2);
            if_1.f(h + d9, g2, f2 - d9, e2, c2);
            aJa3.J(b2.getBorder());
            uKa.f((float)((float)d6.getRed() / NQa.Y), (float)((float)d6.getGreen() / NQa.Y), (float)((float)d6.getBlue() / NQa.Y), (float)((float)d6.getAlpha() / NQa.Y));
            KA.J((int)((int)h), (int)((int)g2), (float)((int)d9), (float)((int)d9), (int)((int)d9), (int)((int)d9), (int)((int)d9), (int)((int)d9), (float)((int)d9), (float)((int)d9));
            KA.J((int)((int)h), (int)((int)(g2 + e2 - d9)), (float)((int)d9), (float)((int)d9), (int)((int)d9), (int)((int)(-d9)), (int)((int)d9), (int)((int)d9), (float)((int)d9), (float)((int)d9));
            if_1.f(h + d9, g2, f2 - d9, n3, (Color)d6);
            if_1.f(h + d9, g2 + e2 - (double)n3, f2 - d9, n3, (Color)d6);
            if_1.f(h + f2 - (double)n3, g2 + (double)n3, n3, e2 - (double)(n3 * uqa.g), (Color)d6);
            return;
        }
        aJa aJa4 = Kpa.J().J();
        void v5 = b2;
        double d11 = v5.getSize();
        double d12 = a2.getSize();
        int n4 = v5.getBorderWidth();
        h = Math.round(h);
        g2 = Math.round(g2);
        f2 = Math.round(f2);
        e2 = Math.round(e2);
        aJa aJa5 = aJa4;
        double d13 = h;
        aJa4.J(b2.getFill());
        uKa.f((float)((float)c2.getRed() / NQa.Y), (float)((float)c2.getGreen() / NQa.Y), (float)((float)c2.getBlue() / NQa.Y), (float)((float)c2.getAlpha() / NQa.Y));
        uKa.K();
        uKa.B();
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        KA.J((int)((int)d13), (int)((int)g2), (float)((int)d11), (float)((int)d11), (int)((int)d11), (int)((int)d11), (int)((int)d11), (int)((int)d11), (float)((int)d11), (float)((int)d11));
        KA.J((int)((int)h), (int)((int)(g2 + e2 - d11)), (float)((int)d11), (float)((int)d11), (int)((int)d11), (int)((int)(-d11)), (int)((int)d11), (int)((int)d11), (float)((int)d11), (float)((int)d11));
        aJa5.J(a2.getFill());
        KA.J((int)((int)(d13 + f2 - d12)), (int)((int)g2), (float)((int)d12), (float)((int)d12), (int)((int)(-d12)), (int)((int)d12), (int)((int)d12), (int)((int)d12), (float)((int)d12), (float)((int)d12));
        KA.J((int)((int)(h + f2 - d12)), (int)((int)(g2 + e2 - d12)), (float)((int)d12), (float)((int)d12), (int)((int)(-d12)), (int)((int)(-d12)), (int)((int)d12), (int)((int)d12), (float)((int)d12), (float)((int)d12));
        double d14 = d11;
        if_1.f(h, g2 + d11, d14, e2 - d14 * KPa.y, c2);
        if_1.f(h + d11, g2, f2 - d11 - d12, e2, c2);
        double d15 = d12;
        if_1.f(h + f2 - d12, g2 + d12, d15, e2 - d15 * KPa.y, c2);
        aJa5.J(b2.getBorder());
        uKa.f((float)((float)d6.getRed() / NQa.Y), (float)((float)d6.getGreen() / NQa.Y), (float)((float)d6.getBlue() / NQa.Y), (float)((float)d6.getAlpha() / NQa.Y));
        KA.J((int)((int)h), (int)((int)g2), (float)((int)d11), (float)((int)d11), (int)((int)d11), (int)((int)d11), (int)((int)d11), (int)((int)d11), (float)((int)d11), (float)((int)d11));
        KA.J((int)((int)h), (int)((int)(g2 + e2 - d11)), (float)((int)d11), (float)((int)d11), (int)((int)d11), (int)((int)(-d11)), (int)((int)d11), (int)((int)d11), (float)((int)d11), (float)((int)d11));
        aJa4.J(a2.getBorder());
        KA.J((int)((int)(h + f2 - d12)), (int)((int)g2), (float)((int)d12), (float)((int)d12), (int)((int)(-d12)), (int)((int)d12), (int)((int)d12), (int)((int)d12), (float)((int)d12), (float)((int)d12));
        KA.J((int)((int)(h + f2 - d12)), (int)((int)(g2 + e2 - d12)), (float)((int)d12), (float)((int)d12), (int)((int)(-d12)), (int)((int)(-d12)), (int)((int)d12), (int)((int)d12), (float)((int)d12), (float)((int)d12));
        if_1.f(h + d11, g2, f2 - d11 - d12, n4, (Color)d6);
        if_1.f(h + d11, g2 + e2 - (double)n4, f2 - d11 - d12, n4, (Color)d6);
    }

    public static void J(double f2, double e2, double d2, double c2, double b2, Color a2) {
        if_1.f(f2, e2, d2, b2, a2);
        double d3 = b2;
        if_1.f(f2, e2 + b2, d3, c2 - d3 * KPa.y, a2);
        double d4 = b2;
        if_1.f(f2 + d2 - b2, e2 + b2, d4, c2 - d4 * KPa.y, a2);
        if_1.f(f2, e2 + c2 - b2, d2, b2, a2);
    }

    /*
     * WARNING - void declaration
     */
    public static void f(double d2, double d3, double d4, double d5, Color color, Color color2, Kd kd) {
        void b2;
        double d6;
        double e2;
        double f2;
        double g2;
        void a2;
        Color color3 = color;
        aJa aJa2 = Kpa.J().J();
        void v0 = a2;
        double d7 = v0.getSize();
        int c2 = v0.getBorderWidth();
        g2 = Math.round(g2);
        f2 = Math.round(f2);
        e2 = Math.round(e2);
        d6 = Math.round(d6);
        aJa2.J(a2.getFill());
        uKa.f((float)((float)color3.getRed() / NQa.Y), (float)((float)color3.getGreen() / NQa.Y), (float)((float)color3.getBlue() / NQa.Y), (float)((float)color3.getAlpha() / NQa.Y));
        uKa.K();
        uKa.B();
        KA.J((int)((int)(g2 + e2 - d7)), (int)((int)(f2 + d6 - d7)), (float)((int)d7), (float)((int)d7), (int)((int)(-d7)), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        if_1.f(g2, f2, e2, d6 - d7, color3);
        if_1.f(g2, f2 + d6 - d7, e2 - d7, d7, color3);
        aJa2.J(a2.getBorder());
        uKa.f((float)((float)b2.getRed() / NQa.Y), (float)((float)b2.getGreen() / NQa.Y), (float)((float)b2.getBlue() / NQa.Y), (float)((float)b2.getAlpha() / NQa.Y));
        KA.J((int)((int)(g2 + e2 - d7)), (int)((int)(f2 + d6 - d7)), (float)((int)d7), (float)((int)d7), (int)((int)(-d7)), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        if_1.f(g2, f2, e2, c2, (Color)b2);
        if_1.f(g2, f2 + (double)c2, c2, d6 - (double)(c2 * uqa.g), (Color)b2);
        if_1.f(g2 + e2 - (double)c2, f2 + (double)c2, c2, d6 - d7 - (double)c2, (Color)b2);
        if_1.f(g2, f2 + d6 - (double)c2, e2 - d7, c2, (Color)b2);
    }

    /*
     * WARNING - void declaration
     */
    public static void J(double d2, double d3, double d4, double d5, Color color, Color color2, Kd kd) {
        void b2;
        void c2;
        void d6;
        void e2;
        void f2;
        double g2;
        Color color3 = color;
        color = kd;
        Color a2 = color3;
        if_1.J(g2, (double)f2, (double)e2, (double)d6, a2, (Kd)c2, uSa.E != 0);
        if_1.A(g2, (double)f2, (double)e2, (double)d6, (Color)b2, (Kd)c2);
    }

    /*
     * WARNING - void declaration
     */
    public static void J(double d2, double d3, double d4, double d5, Color color, Kd kd, Kd kd2, boolean bl) {
        void d6;
        double e2;
        double f2;
        double g2;
        double h;
        void b2;
        void c2;
        boolean bl2 = bl;
        Color a2 = color;
        if (c2 == null && b2 == null) {
            if_1.f(h, g2, f2, e2, a2);
            return;
        }
        if (c2 == null) {
            if_1.J(h, g2, f2, e2, a2, (Kd)b2);
            return;
        }
        if (b2 == null) {
            if_1.e(h, g2, f2, e2, a2, (Kd)c2);
            return;
        }
        aJa aJa2 = Kpa.J().J();
        void v0 = c2;
        double d7 = v0.getSize();
        double d8 = b2.getSize();
        int n2 = v0.getBorderWidth();
        h = Math.round(h);
        g2 = Math.round(g2);
        f2 = Math.round(f2);
        e2 = Math.round(e2);
        void v1 = c2;
        aJa2.J(d6 != false ? v1.getFill() : v1.getFillNoBorder());
        uKa.f((float)((float)a2.getRed() / NQa.Y), (float)((float)a2.getGreen() / NQa.Y), (float)((float)a2.getBlue() / NQa.Y), (float)((float)a2.getAlpha() / NQa.Y));
        uKa.K();
        uKa.B();
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        KA.J((int)((int)h), (int)((int)g2), (float)((int)d7), (float)((int)d7), (int)((int)d7), (int)((int)d7), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        KA.J((int)((int)h), (int)((int)(g2 + e2 - d7)), (float)((int)d7), (float)((int)d7), (int)((int)d7), (int)((int)(-d7)), (int)((int)d7), (int)((int)d7), (float)((int)d7), (float)((int)d7));
        void v2 = b2;
        aJa2.J(d6 != false ? v2.getFill() : v2.getFillNoBorder());
        KA.J((int)((int)(h + f2 - d8)), (int)((int)g2), (float)((int)d8), (float)((int)d8), (int)((int)(-d8)), (int)((int)d8), (int)((int)d8), (int)((int)d8), (float)((int)d8), (float)((int)d8));
        KA.J((int)((int)(h + f2 - d8)), (int)((int)(g2 + e2 - d8)), (float)((int)d8), (float)((int)d8), (int)((int)(-d8)), (int)((int)(-d8)), (int)((int)d8), (int)((int)d8), (float)((int)d8), (float)((int)d8));
        if_1.f(h + (double)(d6 != false ? uSa.E : n2), g2 + d7, d7 - (double)(d6 != false ? uSa.E : n2 * uqa.g), e2 - d7 * KPa.y, a2);
        if_1.f(h + (double)(d6 != false ? uSa.E : n2) + d7 - (double)(d6 != false ? uSa.E : n2 * uqa.g), g2 + (double)(d6 != false ? uSa.E : n2), f2 - d7 - d8 - (double)(d6 != false ? uSa.E : n2 * uqa.g), e2 - (double)(d6 != false ? uSa.E : n2 * uqa.g), a2);
        if_1.f(h + f2 - d8, g2 + d8, d8 - (double)(d6 != false ? uSa.E : n2 * uqa.g), e2 - d8 * KPa.y, a2);
    }

    public if_1() {
        if_1 a2;
    }
}

