/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DQa
 *  F
 *  Ke
 *  Le
 *  NPa
 *  PF
 *  Qsa
 *  Tpa
 *  aSa
 *  ad
 *  if
 *  lE
 *  pua
 *  uKa
 *  uRa
 *  vRa
 */
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class kC_1
extends ad
implements F {
    public final Ke L;
    public boolean E;
    public boolean m;
    public lE C;
    public int i;
    public int M;
    public Color k;
    private i j;
    public boolean J;
    public String A;
    public PF I;

    public int J() {
        kC_1 a2;
        return a2.i;
    }

    /*
     * WARNING - void declaration
     */
    public kC_1(Ke ke, int n2, String string) {
        void b2;
        void c2;
        kC_1 a2;
        Object d2 = string;
        kC_1 kC_12 = a2 = this;
        kC_1 kC_13 = a2;
        a2.M = Qsa.Ha;
        a2.I = PF.VIME_ART;
        a2.C = lE.REGULAR;
        kC_13.i = pua.o;
        kC_13.E = uSa.E;
        kC_13.L = c2;
        kC_12.M = b2;
        kC_12.A = d2;
    }

    /*
     * WARNING - void declaration
     */
    public kC_1(Ke ke, int n2, String string, Color color, boolean bl) {
        void f2;
        void b2;
        void c2;
        void d2;
        void e2;
        kC_1 a2;
        boolean bl2 = bl;
        kC_1 kC_12 = a2 = this;
        kC_1 kC_13 = a2;
        kC_1 kC_14 = a2;
        a2.M = Qsa.Ha;
        a2.I = PF.VIME_ART;
        a2.C = lE.REGULAR;
        kC_14.i = pua.o;
        kC_14.E = uSa.E;
        kC_14.L = e2;
        kC_13.M = d2;
        kC_13.A = c2;
        kC_12.k = b2;
        kC_12.m = f2;
    }

    /*
     * WARNING - void declaration
     */
    public kC_1(int n2, int n3, int n4, int n5, Ke ke, String string) {
        Object g2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        kC_1 a2;
        kC_1 kC_12 = object;
        Object object = string;
        kC_1 kC_13 = a2 = kC_12;
        super((int)f2, (int)e2, (int)d2, (int)c2);
        a2.M = Qsa.Ha;
        a2.I = PF.VIME_ART;
        a2.C = lE.REGULAR;
        a2.i = pua.o;
        a2.E = uSa.E;
        kC_13.L = b2;
        kC_13.A = g2;
    }

    public double d() {
        kC_1 a2;
        return a2.M;
    }

    public i J() {
        kC_1 a2;
        return a2.j;
    }

    /*
     * WARNING - void declaration
     */
    public kC_1(int n2, int n3, int n4, int n5, Ke ke, int n6, String string, Color color, boolean bl) {
        void j2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        void h2;
        void i2;
        kC_1 a2;
        boolean bl2 = bl;
        kC_1 kC_12 = a2 = this;
        kC_1 kC_13 = a2;
        kC_1 kC_14 = a2;
        super((int)i2, (int)h2, (int)g2, (int)f2);
        a2.M = Qsa.Ha;
        a2.I = PF.VIME_ART;
        a2.C = lE.REGULAR;
        kC_14.i = pua.o;
        kC_14.E = uSa.E;
        kC_14.L = e2;
        kC_13.M = d2;
        kC_13.A = c2;
        kC_12.k = b2;
        kC_12.m = j2;
    }

    public void J(Color color) {
        Object b2 = color;
        kC_1 a2 = this;
        a2.k = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void e2;
        void b2;
        void c2;
        void d2;
        boolean bl2 = bl;
        kC_1 a2 = this;
        if (a2.j == null) {
            return;
        }
        a2.j.J((int)d2, (int)c2, (int)b2, (boolean)e2);
    }

    /*
     * WARNING - void declaration
     */
    public kC_1(int n2, int n3, Ke ke, int n4, PF pF2, String string, Color color, boolean bl) {
        void i2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        void h2;
        kC_1 a2;
        boolean bl2 = bl;
        kC_1 kC_12 = a2 = this;
        kC_1 kC_13 = a2;
        kC_1 kC_14 = a2;
        super((int)h2, (int)g2);
        a2.M = Qsa.Ha;
        a2.I = PF.VIME_ART;
        a2.C = lE.REGULAR;
        a2.i = pua.o;
        a2.E = uSa.E;
        kC_14.L = f2;
        kC_14.M = e2;
        kC_13.I = d2;
        kC_13.A = c2;
        kC_12.k = b2;
        kC_12.m = i2;
    }

    /*
     * WARNING - void declaration
     */
    public kC_1(int n2, int n3, int n4, int n5, Ke ke, int n6, PF pF2, String string, Color color, boolean bl, boolean bl2, i i2) {
        Object m2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        void h2;
        void i3;
        void j2;
        void k2;
        void l2;
        kC_1 a2;
        kC_1 kC_12 = object;
        Object object = i2;
        kC_1 kC_13 = a2 = kC_12;
        kC_1 kC_14 = a2;
        kC_1 kC_15 = a2;
        kC_1 kC_16 = a2;
        super((int)l2, (int)k2, (int)j2, (int)i3);
        a2.M = Qsa.Ha;
        a2.I = PF.VIME_ART;
        a2.C = lE.REGULAR;
        a2.i = pua.o;
        a2.E = uSa.E;
        kC_16.L = h2;
        kC_16.M = g2;
        kC_15.I = f2;
        kC_15.A = e2;
        kC_14.k = d2;
        kC_14.J = c2;
        kC_13.m = b2;
        kC_13.j = m2;
    }

    /*
     * WARNING - void declaration
     */
    public kC_1(int n2, int n3, Ke ke, String string, Color color) {
        Object f2;
        void b2;
        void c2;
        void d2;
        void e2;
        kC_1 a2;
        kC_1 kC_12 = object;
        Object object = color;
        kC_1 kC_13 = a2 = kC_12;
        kC_1 kC_14 = a2;
        super((int)e2, (int)d2);
        a2.M = Qsa.Ha;
        a2.I = PF.VIME_ART;
        a2.C = lE.REGULAR;
        kC_14.i = pua.o;
        kC_14.E = uSa.E;
        kC_14.L = c2;
        kC_13.A = b2;
        kC_13.k = f2;
    }

    public void l(boolean bl) {
        boolean b2 = bl;
        kC_1 a2 = this;
        a2.m = b2;
    }

    public String J() {
        kC_1 a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public kC_1(int n2, int n3, Ke ke, int n4, String string, Color color, boolean bl) {
        void h2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        kC_1 a2;
        boolean bl2 = bl;
        kC_1 kC_12 = a2 = this;
        kC_1 kC_13 = a2;
        kC_1 kC_14 = a2;
        super((int)g2, (int)f2);
        a2.M = Qsa.Ha;
        a2.I = PF.VIME_ART;
        a2.C = lE.REGULAR;
        kC_14.i = pua.o;
        kC_14.E = uSa.E;
        kC_14.L = e2;
        kC_13.M = d2;
        kC_13.A = c2;
        kC_12.k = b2;
        kC_12.m = h2;
    }

    /*
     * WARNING - void declaration
     */
    public kC_1(int n2, int n3, int n4, int n5, Ke ke, int n6, String string) {
        Object h2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        kC_1 a2;
        kC_1 kC_12 = object;
        Object object = string;
        kC_1 kC_13 = a2 = kC_12;
        kC_1 kC_14 = a2;
        super((int)g2, (int)f2, (int)e2, (int)d2);
        a2.M = Qsa.Ha;
        a2.I = PF.VIME_ART;
        a2.C = lE.REGULAR;
        kC_14.i = pua.o;
        kC_14.E = uSa.E;
        kC_14.L = c2;
        kC_13.M = b2;
        kC_13.A = h2;
    }

    /*
     * WARNING - void declaration
     */
    public kC_1(int n2, int n3, int n4, int n5, Ke ke, String string, Color color) {
        Object h2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        kC_1 a2;
        kC_1 kC_12 = object;
        Object object = color;
        kC_1 kC_13 = a2 = kC_12;
        kC_1 kC_14 = a2;
        super((int)g2, (int)f2, (int)e2, (int)d2);
        a2.M = Qsa.Ha;
        a2.I = PF.VIME_ART;
        a2.C = lE.REGULAR;
        kC_14.i = pua.o;
        kC_14.E = uSa.E;
        kC_14.L = c2;
        kC_13.A = b2;
        kC_13.k = h2;
    }

    public void f(int n2) {
        int b2 = n2;
        kC_1 a2 = this;
        a2.M = b2;
    }

    public void J(PF pF2) {
        kC_1 b2 = pF2;
        kC_1 a2 = this;
        a2.I = b2;
    }

    public void J(int n2) {
        int b2 = n2;
        kC_1 a2 = this;
        a2.i = b2;
    }

    public void J(i i2) {
        Object b2 = i2;
        kC_1 a2 = this;
        a2.j = b2;
    }

    public void J(String string) {
        Object b2 = string;
        kC_1 a2 = this;
        a2.A = b2;
    }

    public boolean C() {
        kC_1 a2;
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    public kC_1(int n2, int n3, int n4, int n5, Ke ke, int n6, PF pF2, String string, Color color, boolean bl) {
        void k2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        void h2;
        void i2;
        void j2;
        kC_1 a2;
        boolean bl2 = bl;
        kC_1 kC_12 = a2 = this;
        kC_1 kC_13 = a2;
        kC_1 kC_14 = a2;
        super((int)j2, (int)i2, (int)h2, (int)g2);
        a2.M = Qsa.Ha;
        a2.I = PF.VIME_ART;
        a2.C = lE.REGULAR;
        a2.i = pua.o;
        a2.E = uSa.E;
        kC_14.L = f2;
        kC_14.M = e2;
        kC_13.I = d2;
        kC_13.A = c2;
        kC_12.k = b2;
        kC_12.m = k2;
    }

    public void f(boolean bl) {
        boolean b2 = bl;
        kC_1 a2 = this;
        a2.J = b2;
    }

    /*
     * WARNING - void declaration
     */
    public kC_1(Ke ke, String string) {
        void b2;
        kC_1 a2;
        Object c2 = string;
        kC_1 kC_12 = a2 = this;
        a2.M = Qsa.Ha;
        a2.I = PF.VIME_ART;
        a2.C = lE.REGULAR;
        a2.i = pua.o;
        a2.E = uSa.E;
        kC_12.L = b2;
        kC_12.A = c2;
    }

    public lE J() {
        kC_1 a2;
        return a2.C;
    }

    public void J(lE lE2) {
        kC_1 b2 = lE2;
        kC_1 a2 = this;
        a2.C = b2;
    }

    /*
     * WARNING - void declaration
     */
    public kC_1(int n2, int n3, Ke ke, int n4, String string, Color color) {
        Object g2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        kC_1 a2;
        kC_1 kC_12 = object;
        Object object = color;
        kC_1 kC_13 = a2 = kC_12;
        kC_1 kC_14 = a2;
        super((int)f2, (int)e2);
        a2.M = Qsa.Ha;
        a2.I = PF.VIME_ART;
        a2.C = lE.REGULAR;
        a2.i = pua.o;
        a2.E = uSa.E;
        kC_14.L = d2;
        kC_14.M = c2;
        kC_13.A = b2;
        kC_13.k = g2;
    }

    /*
     * WARNING - void declaration
     */
    public kC_1(int n2, int n3, Ke ke, String string) {
        Object e2;
        void b2;
        void c2;
        void d2;
        kC_1 a2;
        kC_1 kC_12 = object;
        Object object = string;
        kC_1 kC_13 = a2 = kC_12;
        super((int)d2, (int)c2);
        a2.M = Qsa.Ha;
        a2.I = PF.VIME_ART;
        a2.C = lE.REGULAR;
        a2.i = pua.o;
        a2.E = uSa.E;
        kC_13.L = b2;
        kC_13.A = e2;
    }

    /*
     * WARNING - void declaration
     */
    public kC_1(Ke ke, int n2, PF pF2, String string, Color color, boolean bl, boolean bl2, i i2) {
        Object i3;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        void h2;
        kC_1 a2;
        kC_1 kC_12 = object;
        Object object = i2;
        kC_1 kC_13 = a2 = kC_12;
        kC_1 kC_14 = a2;
        kC_1 kC_15 = a2;
        kC_1 kC_16 = a2;
        a2.M = Qsa.Ha;
        a2.I = PF.VIME_ART;
        a2.C = lE.REGULAR;
        a2.i = pua.o;
        a2.E = uSa.E;
        kC_16.L = h2;
        kC_16.M = g2;
        kC_15.I = f2;
        kC_15.A = e2;
        kC_14.k = d2;
        kC_14.J = c2;
        kC_13.m = b2;
        kC_13.j = i3;
    }

    /*
     * WARNING - void declaration
     */
    public kC_1(Ke ke, int n2, PF pF2, String string, Color color, boolean bl) {
        void g2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        kC_1 a2;
        boolean bl2 = bl;
        kC_1 kC_12 = a2 = this;
        kC_1 kC_13 = a2;
        kC_1 kC_14 = a2;
        a2.M = Qsa.Ha;
        a2.I = PF.VIME_ART;
        a2.C = lE.REGULAR;
        a2.i = pua.o;
        a2.E = uSa.E;
        kC_14.L = f2;
        kC_14.M = e2;
        kC_13.I = d2;
        kC_13.A = c2;
        kC_12.k = b2;
        kC_12.m = g2;
    }

    /*
     * WARNING - void declaration
     */
    public kC_1(int n2, int n3, int n4, int n5, Ke ke, int n6, String string, Color color) {
        Object i2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        void h2;
        kC_1 a2;
        kC_1 kC_12 = object;
        Object object = color;
        kC_1 kC_13 = a2 = kC_12;
        kC_1 kC_14 = a2;
        super((int)h2, (int)g2, (int)f2, (int)e2);
        a2.M = Qsa.Ha;
        a2.I = PF.VIME_ART;
        a2.C = lE.REGULAR;
        a2.i = pua.o;
        a2.E = uSa.E;
        kC_14.L = d2;
        kC_14.M = c2;
        kC_13.A = b2;
        kC_13.k = i2;
    }

    public boolean l() {
        kC_1 a2;
        return a2.m;
    }

    /*
     * WARNING - void declaration
     */
    public kC_1(int n2, int n3, Ke ke, int n4, PF pF2, String string, Color color, boolean bl, boolean bl2, i i2) {
        Object k2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        void h2;
        void i3;
        void j2;
        kC_1 a2;
        kC_1 kC_12 = object;
        Object object = i2;
        kC_1 kC_13 = a2 = kC_12;
        kC_1 kC_14 = a2;
        kC_1 kC_15 = a2;
        kC_1 kC_16 = a2;
        super((int)j2, (int)i3);
        a2.M = Qsa.Ha;
        a2.I = PF.VIME_ART;
        a2.C = lE.REGULAR;
        a2.i = pua.o;
        a2.E = uSa.E;
        kC_16.L = h2;
        kC_16.M = g2;
        kC_15.I = f2;
        kC_15.A = e2;
        kC_14.k = d2;
        kC_14.J = c2;
        kC_13.m = b2;
        kC_13.j = k2;
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        kC_1 a2 = this;
        a2.E = b2;
    }

    public Color J() {
        kC_1 a2;
        return a2.k;
    }

    /*
     * WARNING - void declaration
     */
    public kC_1(Ke ke, String string, Color color) {
        void b2;
        void c2;
        kC_1 a2;
        Object d2 = color;
        kC_1 kC_12 = a2 = this;
        kC_1 kC_13 = a2;
        a2.M = Qsa.Ha;
        a2.I = PF.VIME_ART;
        a2.C = lE.REGULAR;
        kC_13.i = pua.o;
        kC_13.E = uSa.E;
        kC_13.L = c2;
        kC_12.A = b2;
        kC_12.k = d2;
    }

    /*
     * WARNING - void declaration
     */
    public kC_1(int n2, int n3, Ke ke, int n4, String string) {
        Object f2;
        void b2;
        void c2;
        void d2;
        void e2;
        kC_1 a2;
        kC_1 kC_12 = object;
        Object object = string;
        kC_1 kC_13 = a2 = kC_12;
        kC_1 kC_14 = a2;
        super((int)e2, (int)d2);
        a2.M = Qsa.Ha;
        a2.I = PF.VIME_ART;
        a2.C = lE.REGULAR;
        kC_14.i = pua.o;
        kC_14.E = uSa.E;
        kC_14.L = c2;
        kC_13.M = b2;
        kC_13.A = f2;
    }

    /*
     * WARNING - void declaration
     */
    public kC_1(Ke ke, int n2, String string, Color color) {
        Object e2;
        void b2;
        void c2;
        void d2;
        kC_1 a2;
        kC_1 kC_12 = object;
        Object object = color;
        kC_1 kC_13 = a2 = kC_12;
        kC_1 kC_14 = a2;
        a2.M = Qsa.Ha;
        a2.I = PF.VIME_ART;
        a2.C = lE.REGULAR;
        a2.i = pua.o;
        a2.E = uSa.E;
        kC_14.L = d2;
        kC_14.M = c2;
        kC_13.A = b2;
        kC_13.k = e2;
    }

    public void J(int n2, int n3) {
        String[] stringArray;
        int a2;
        int b2;
        kC_1 kC_12 = this;
        if (kC_12.k == null) {
            kC_12.k = Color.WHITE;
        }
        kC_1 kC_13 = kC_12;
        kC_1 kC_14 = kC_12;
        Ii c2 = Le.J((PF)kC_13.I, (lE)kC_13.C, (int)kC_14.M);
        super.J(b2, a2);
        uKa.K();
        if (!kC_13.E) {
            kC_1 kC_15 = kC_12;
            String[] stringArray2 = kC_15.A.split(DQa.R);
            double d2 = aSa.V;
            if (kC_15.i != pua.o) {
                int n4;
                double d3 = aSa.V;
                b2 = kC_12.k.getRGB();
                a2 = uSa.E;
                String[] stringArray3 = stringArray2;
                int n5 = stringArray2.length;
                int n6 = n4 = uSa.E;
                while (n6 < n5) {
                    String string = stringArray3[n4];
                    String[] stringArray4 = string.split(Tpa.E);
                    double d4 = aSa.V;
                    String[] stringArray5 = stringArray4;
                    int n7 = stringArray4.length;
                    int n8 = uSa.E;
                    while (n8 < n7) {
                        int n9;
                        String string2 = stringArray5[n9];
                        Ii ii2 = c2;
                        int n10 = ii2.f(string2 + Tpa.E);
                        if (d4 + (double)n10 > (double)kC_12.i) {
                            d4 = aSa.V;
                            ++a2;
                            d2 += (double)c2.J(string2);
                        }
                        c2.J(string2, (int)(kC_12.I + d4), kC_12.J + d2, b2, kC_12.m);
                        d3 = Math.max(d3, d4 += (double)n10);
                        n8 = ++n9;
                    }
                    ++a2;
                    d2 += (double)c2.J(string);
                    n6 = ++n4;
                }
                kC_12.k = (Color)d3;
                kC_12.j = (i)((double)(c2.J(Mqa.y) * a2));
                return;
            }
            double d5 = aSa.V;
            int n11 = kC_12.k.getRGB();
            String[] stringArray6 = stringArray2;
            b2 = stringArray2.length;
            int n12 = a2 = uSa.E;
            while (n12 < b2) {
                String string = stringArray6[a2];
                Ii ii3 = c2;
                double d6 = ii3.f(string);
                d5 = Math.max(d5, d6);
                ii3.J(string, (int)(kC_12.I - (kC_12.J ? d6 / KPa.y : aSa.V)), kC_12.J - oua.i - (double)(kC_12.J ? c2.J(string) * stringArray2.length / uqa.g : uSa.E) + d2, n11, kC_12.m);
                d2 += (double)c2.J(string);
                n12 = ++a2;
            }
            kC_12.k = (Color)d5;
            kC_12.j = (i)d2;
            return;
        }
        double d7 = aSa.V;
        double d8 = aSa.V;
        kC_1 kC_16 = kC_12;
        int n13 = kC_16.k.getRGB();
        String[] stringArray7 = stringArray = kC_16.A.split(DQa.R);
        b2 = stringArray7.length;
        int n14 = a2 = uSa.E;
        while (n14 < b2) {
            int n15;
            String[] stringArray8;
            String[] stringArray9;
            String string;
            String string3 = stringArray7[a2];
            d7 = aSa.V;
            Pattern pattern = Pattern.compile(NPa.d);
            Matcher matcher = pattern.matcher(string3);
            int n16 = uSa.E;
            Matcher matcher2 = matcher;
            while (matcher2.find()) {
                double d9;
                string = string3.substring(n16, matcher.start());
                stringArray9 = matcher.group(vRa.d);
                if (!string.isEmpty()) {
                    if (kC_12.i != pua.o) {
                        String[] stringArray10 = stringArray8 = string.split(Tpa.E);
                        n15 = stringArray10.length;
                        int n17 = uSa.E;
                        while (n17 < n15) {
                            int n18;
                            String string4 = stringArray10[n18];
                            int n19 = c2.f(new StringBuilder().insert(3 >> 2, string4).append(Tpa.E).toString());
                            if (d7 + (double)n19 > (double)kC_12.i) {
                                d7 = aSa.V;
                                d8 += (double)c2.J(string4);
                            }
                            c2.J(string4, (int)(kC_12.I + d7), kC_12.J + d8, n13, kC_12.m);
                            d7 += (double)n19;
                            n17 = ++n18;
                        }
                    } else {
                        c2.J(string, (int)(kC_12.I - (kC_12.J ? (double)(kC_12.k / KPa.y) : aSa.V) + d7), kC_12.J - oua.i - (kC_12.J ? (double)(kC_12.j / KPa.y) : aSa.V) + d8, n13, kC_12.m);
                        d7 += (double)c2.f(string);
                    }
                }
                if (kC_12.i != pua.o) {
                    if (d7 + (double)kC_12.M / KPa.y > (double)kC_12.i) {
                        d7 = aSa.V;
                        d8 += (double)c2.J(Mqa.y);
                    }
                    if.J((String)stringArray9, (double)((int)(kC_12.I + d7)), (double)(kC_12.J + d8 + uRa.I), (double)(kC_12.M / uqa.g), (double)(kC_12.M / uqa.g), (int)kC_12.k.getRGB());
                    d9 = d7;
                } else {
                    if.J((String)stringArray9, (double)((int)(kC_12.I - (kC_12.J ? (double)(kC_12.k / KPa.y) : aSa.V) + d7)), (double)(kC_12.J + uRa.I - (kC_12.J ? (double)(kC_12.j / KPa.y) : aSa.V) + d8), (double)(kC_12.M / uqa.g), (double)(kC_12.M / uqa.g), (int)kC_12.k.getRGB());
                    d9 = d7;
                }
                d7 = d9 + (double)kC_12.M / KPa.y;
                Matcher matcher3 = matcher;
                matcher2 = matcher3;
                n16 = matcher3.end();
            }
            string = string3.substring(n16);
            if (!string.isEmpty()) {
                if (kC_12.i != pua.o) {
                    stringArray8 = stringArray9 = string.split(Tpa.E);
                    int n20 = stringArray8.length;
                    int n21 = uSa.E;
                    while (n21 < n20) {
                        String string5 = stringArray8[n15];
                        int n22 = c2.f(new StringBuilder().insert(3 >> 2, string5).append(Tpa.E).toString());
                        if (d7 + (double)n22 > (double)kC_12.i) {
                            d7 = aSa.V;
                            d8 += (double)c2.J(string5);
                        }
                        c2.J(string5, (int)(kC_12.I + d7), kC_12.J + d8, n13, kC_12.m);
                        d7 += (double)n22;
                        n21 = ++n15;
                    }
                } else {
                    c2.J(string, (int)(kC_12.I - (kC_12.J ? (double)(kC_12.k / KPa.y) : aSa.V) + d7), kC_12.J - oua.i - (kC_12.J ? (double)(kC_12.j / KPa.y) : aSa.V) + d8, n13, kC_12.m);
                    d7 += (double)c2.f(string);
                }
            }
            d8 += (double)c2.J(string3);
            n14 = ++a2;
        }
        kC_12.k = (Color)((double)((int)d7));
        kC_12.j = (i)((double)((int)d8));
    }

    public boolean J() {
        kC_1 a2;
        return a2.E;
    }
}

