/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  F
 *  KA
 *  Oqa
 *  ZRa
 *  aSa
 *  ad
 *  cI
 *  gra
 *  npa
 *  pua
 *  sB
 *  vRa
 *  yqa
 *  zQa
 */
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.input.Mouse;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class jb
extends ad
implements F {
    public int c;
    public zQa B;
    public Color d;
    public Oqa a;
    public boolean b;
    public double l;
    public boolean e;
    public Oqa G;
    public vC D;
    public double f;
    public int F;
    public int g;
    public int L;
    public double E;
    public boolean m;
    public final List<ad> C;
    public gra i;
    public boolean M;
    public int k;
    public int j;
    public boolean J;
    public boolean I;

    public boolean d() {
        jb a2;
        return a2.I;
    }

    public void A(int n2) {
        jb a2;
        int b2 = n2;
        jb jb2 = a2 = this;
        jb2.L = b2;
        jb2.F = b2;
        jb2.M = vRa.d;
    }

    public zQa J() {
        jb a2;
        return a2.B;
    }

    public void e() {
        jb a2;
        KA.J((int)(a2.I ? 1 : 0), (int)(a2.J ? 1 : 0), (int)(a2.I + a2.k), (int)(a2.J + a2.j), (int)a2.d.getRGB());
    }

    public void i(int n2) {
        jb a2;
        int b2 = n2;
        jb jb2 = a2 = this;
        jb2.c = b2;
        jb2.M = vRa.d;
    }

    public void d() {
        jb a2;
        KA.J((int)(a2.I ? 1 : 0), (int)(a2.J ? 1 : 0), (int)(a2.I + a2.k), (int)(a2.J + a2.j), (int)pua.o);
    }

    public void M(int n2) {
        jb a2;
        int b2 = n2;
        jb jb2 = a2 = this;
        jb2.L = b2;
        jb2.M = vRa.d;
    }

    public int e() {
        jb a2;
        return a2.k;
    }

    public void e(boolean bl) {
        boolean b2 = bl;
        jb a2 = this;
        a2.m = b2;
    }

    public void d(boolean bl) {
        jb a2;
        boolean b2 = bl;
        jb jb2 = a2 = this;
        jb2.J = b2;
        jb2.M = vRa.d;
    }

    public int d() {
        jb a2;
        return a2.j;
    }

    public int C() {
        jb a2;
        return a2.g;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void a2;
        void b2;
        jb jb2;
        jb jb3 = jb2 = this;
        jb3.D.J();
        if (jb3.e && !jb2.f().isEmpty()) {
            int c2;
            if (-jb2.D.l() < (double)jb2.k && jb2.D.f()) {
                jb jb4 = jb2;
                jb4.D.e(jb4.k);
                jb jb5 = jb2;
                jb5.D.C(jb5.k);
                jb jb6 = jb2;
                jb6.D.J((double)jb6.k);
            }
            if (jb2.f() && (c2 = Mouse.getDWheel()) != 0) {
                double d2;
                double d3 = jb2.D.d() + (c2 > 0 ? jb2.l : -jb2.l);
                if (-d2 > jb2.j - (double)jb2.k) {
                    d3 = -jb2.j + (double)jb2.k;
                }
                jb jb7 = jb2;
                jb7.D.J(Math.min((double)jb7.k, d3), iSa.P, sB.x);
            }
        }
        if (jb2.M) {
            jb2.l();
            jb2.M = uSa.E;
        }
        if (jb2.m) {
            cI.J((Runnable)npa.J((jb)jb2));
        }
        if (jb2.d != null && jb2.d.getAlpha() > 0) {
            jb2.e();
        }
        jb jb8 = jb2;
        super.J((int)b2, (int)a2);
        Iterator<ad> c2 = jb8.C.iterator();
        Object object = c2;
        while (object.hasNext()) {
            ad ad2 = (ad)c2.next();
            object = c2;
            ad2.J((int)b2, (int)a2);
        }
        jb jb9 = jb2;
        jb9.C();
        if (jb9.m) {
            cI.J();
        }
    }

    public void e(int n2) {
        jb a2;
        int b2 = n2;
        jb jb2 = a2 = this;
        jb2.A(b2);
        jb2.C(b2);
    }

    public void C() {
    }

    public void J(Color color) {
        Object b2 = color;
        jb a2 = this;
        a2.d = b2;
    }

    public vC J() {
        jb a2;
        return a2.D;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void a2;
        void b2;
        void c2;
        void d2;
        jb jb2 = this;
        jb e2 = jb2.J();
        if (e2 == null) {
            return;
        }
        ((F)e2).J((int)d2, (int)c2, (int)b2, (boolean)a2);
    }

    /*
     * WARNING - void declaration
     */
    public jb(int n2, int n3, Oqa oqa2, int n4, int n5) {
        void f2;
        void b2;
        void c2;
        void d2;
        void e2;
        jb a2;
        int n6 = n5;
        jb jb2 = a2 = this;
        jb jb3 = a2;
        jb jb4 = a2;
        jb jb5 = a2;
        super((int)e2, (int)d2);
        jb jb6 = a2;
        a2.C = new ArrayList<ad>();
        jb6.G = Oqa.ROW;
        a2.l = ZRa.r;
        a2.D = new vC();
        a2.j = uSa.E;
        a2.k = uSa.E;
        a2.L = uSa.E;
        a2.F = uSa.E;
        a2.g = uSa.E;
        a2.c = uSa.E;
        a2.i = gra.FLEX_START;
        a2.B = zQa.FLEX_START;
        jb5.M = vRa.d;
        jb5.I = uSa.E;
        jb5.a = c2;
        jb4.j = b2;
        jb4.k = f2;
        jb3.L = b2;
        jb3.F = f2;
        jb2.g = b2;
        jb2.c = f2;
    }

    public List<ad> f() {
        jb a2;
        return a2.C;
    }

    /*
     * WARNING - void declaration
     */
    public jb(int n2, int n3, int n4, int n5, Oqa oqa2, int n6, int n7) {
        void h2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        jb a2;
        int n8 = n7;
        jb jb2 = a2 = this;
        jb jb3 = a2;
        jb jb4 = a2;
        jb jb5 = a2;
        super((int)g2, (int)f2, (int)e2, (int)d2);
        jb jb6 = a2;
        a2.C = new ArrayList<ad>();
        jb6.G = Oqa.ROW;
        a2.l = ZRa.r;
        a2.D = new vC();
        a2.j = uSa.E;
        a2.k = uSa.E;
        a2.L = uSa.E;
        a2.F = uSa.E;
        a2.g = uSa.E;
        a2.c = uSa.E;
        a2.i = gra.FLEX_START;
        a2.B = zQa.FLEX_START;
        jb5.M = vRa.d;
        jb5.I = uSa.E;
        jb5.a = c2;
        jb4.j = b2;
        jb4.k = h2;
        jb3.L = b2;
        jb3.F = h2;
        jb2.g = b2;
        jb2.c = h2;
    }

    public ad J() {
        int n2;
        jb jb2 = this;
        int n3 = n2 = jb2.C.size();
        while (n3 > 0) {
            jb a2 = jb2.C.get(n2 - vRa.d);
            if (a2 instanceof F && a2.f()) {
                if (a2 instanceof jb) {
                    return a2.J();
                }
                return a2;
            }
            n3 = --n2;
        }
        return null;
    }

    public boolean C() {
        jb a2;
        return a2.e;
    }

    public void J(zQa zQa2) {
        jb a2;
        jb b2 = zQa2;
        jb jb2 = a2 = this;
        jb2.B = b2;
        jb2.M = vRa.d;
    }

    public void d(double a2) {
        b.l = a2;
    }

    public Color J() {
        jb a2;
        return a2.d;
    }

    public void d(int n2) {
        jb a2;
        int b2 = n2;
        jb jb2 = a2 = this;
        jb2.j = b2;
        jb2.M = vRa.d;
    }

    public void C(boolean bl) {
        jb a2;
        boolean b2 = bl;
        jb jb2 = a2 = this;
        jb2.b = b2;
        jb2.M = vRa.d;
    }

    public void l(boolean bl) {
        jb a2;
        boolean b2 = bl;
        jb jb2 = a2 = this;
        jb2.I = b2;
        jb2.M = vRa.d;
    }

    public void f(ad ad2) {
        jb b2 = ad2;
        jb a2 = this;
        a2.C.add(b2);
        a2.M = vRa.d;
    }

    public void C(int n2) {
        jb a2;
        int b2 = n2;
        jb jb2 = a2 = this;
        jb2.g = b2;
        jb2.c = b2;
        jb2.M = vRa.d;
    }

    public void J(ad ad2) {
        jb b2 = ad2;
        jb a2 = this;
        a2.C.remove((Object)b2);
        a2.M = vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public jb(Oqa oqa2, int n2, int n3) {
        void b2;
        void c2;
        jb a2;
        int d2 = n3;
        jb jb2 = a2 = this;
        jb jb3 = a2;
        jb jb4 = a2;
        jb jb5 = a2;
        jb jb6 = a2;
        a2.C = new ArrayList<ad>();
        jb6.G = Oqa.ROW;
        a2.l = ZRa.r;
        a2.D = new vC();
        a2.j = uSa.E;
        a2.k = uSa.E;
        a2.L = uSa.E;
        a2.F = uSa.E;
        a2.g = uSa.E;
        a2.c = uSa.E;
        a2.i = gra.FLEX_START;
        a2.B = zQa.FLEX_START;
        jb5.M = vRa.d;
        jb5.I = uSa.E;
        jb5.a = c2;
        jb4.j = b2;
        jb4.k = d2;
        jb3.L = b2;
        jb3.F = d2;
        jb2.g = b2;
        jb2.c = d2;
    }

    public void J(gra gra2) {
        jb a2;
        jb b2 = gra2;
        jb jb2 = a2 = this;
        jb2.i = b2;
        jb2.M = vRa.d;
    }

    public int l() {
        jb a2;
        return a2.c;
    }

    public void l(int n2) {
        jb a2;
        int b2 = n2;
        jb jb2 = a2 = this;
        jb2.k = b2;
        jb2.M = vRa.d;
    }

    public gra J() {
        jb a2;
        return a2.i;
    }

    public int f() {
        jb a2;
        return a2.L;
    }

    public boolean l() {
        jb a2;
        return a2.m;
    }

    public void J(Oqa oqa2) {
        jb a2;
        jb b2 = oqa2;
        jb jb2 = a2 = this;
        jb2.a = b2;
        jb2.M = vRa.d;
    }

    public void f(int n2) {
        jb a2;
        int b2 = n2;
        jb jb2 = a2 = this;
        jb2.F = b2;
        jb2.M = vRa.d;
    }

    public void J(int n2) {
        jb a2;
        int b2 = n2;
        jb jb2 = a2 = this;
        jb2.g = b2;
        jb2.M = vRa.d;
    }

    public List<ad> J() {
        Iterator<ad> iterator;
        jb jb2 = this;
        ArrayList a2 = new ArrayList();
        Iterator<ad> iterator2 = iterator = jb2.C.iterator();
        while (iterator2.hasNext()) {
            ad ad2 = iterator.next();
            if (ad2 instanceof jb) {
                a2.addAll(((jb)ad2).J());
            }
            a2.add(ad2);
            iterator2 = iterator;
        }
        return a2;
    }

    public void f(boolean bl) {
        boolean b2 = bl;
        jb a2 = this;
        a2.e = b2;
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public void l() {
        var23_1 = this;
        if (var23_1.a == null) {
            var23_1.a = Oqa.COLUMN;
        }
        if (var23_1.C.isEmpty()) {
            return;
        }
        for (ad var2_4 : var23_1.C) {
            if (!(var2_4 instanceof jb)) continue;
            ((jb)var2_4).M = vRa.d;
            ((jb)var2_4).l();
        }
        var1_3 = aSa.V;
        var3_5 = aSa.V;
        var5_6 = var23_1.C.size();
        v0 = var6_7 = uSa.E;
        while (v0 < var5_6) {
            var7_8 = var23_1.C.get(var6_7);
            if (var23_1.a.isHorizontal()) {
                var1_3 += var7_8.l();
                if (var6_7 < var5_6 - vRa.d) {
                    var1_3 += (double)var23_1.j;
                }
                var3_5 = Math.max(var3_5, var7_8.J());
            } else {
                var3_5 += var7_8.J();
                if (var6_7 < var5_6 - vRa.d) {
                    var3_5 += (double)var23_1.k;
                }
                var1_3 = Math.max(var1_3, var7_8.l());
            }
            v0 = ++var6_7;
        }
        v1 = var23_1;
        var6_7 = v1.L;
        var7_9 = v1.F;
        var5_6 = v1.g;
        var8_10 = v1.c;
        var9_11 = v1.I + (double)var6_7;
        var11_12 = v1.J + (double)var7_9;
        var13_13 = new ArrayList<ArrayList<E>>();
        var14_14 = new ArrayList<ad>();
        var13_13.add(var14_14);
        var15_17 = var9_11;
        var17_19 = var11_12;
        var19_20 = var23_1.C.iterator();
        while (var19_20.hasNext()) {
            var20_22 = var19_20.next();
            var21_23 = uSa.E;
            if (var23_1.a.isHorizontal()) {
                if (var23_1.I && !var14_14.isEmpty() && var15_17 + var20_22.l() > var23_1.I + var23_1.k - (double)var5_6) {
                    var21_23 = vRa.d;
                }
                if (var21_23 != 0) {
                    var14_14 = new ArrayList<E>();
                    var13_13.add(var14_14);
                    var15_17 = var9_11;
                    var17_19 += var3_5 + (double)var23_1.k;
                }
                var14_14.add(var20_22);
                var15_17 += var20_22.l() + (double)var23_1.j;
                continue;
            }
            if (var23_1.I && !var14_14.isEmpty() && var17_19 + var20_22.J() > var23_1.J + var23_1.j - (double)var8_10) {
                var21_23 = vRa.d;
            }
            if (var21_23 != 0) {
                var14_14 = new ArrayList<E>();
                var13_13.add(var14_14);
                var17_19 = var11_12;
                var15_17 += var1_3 + (double)var23_1.j;
            }
            var14_14.add(var20_22);
            var17_19 += var20_22.J() + (double)var23_1.k;
        }
        v2 = var23_1;
        v2.E = aSa.V;
        v2.f = aSa.V;
        var19_21 = aSa.V;
        var21_24 = aSa.V;
        v3 = var14_15 = uSa.E;
        while (v3 < var13_13.size()) {
            block79: {
                block80: {
                    a = (List)var13_13.get(var14_15);
                    if (a.isEmpty()) break block79;
                    var9_11 = (int)aSa.V;
                    var11_12 = (int)aSa.V;
                    var15_18 = a.iterator();
                    while (var15_18.hasNext()) {
                        var24_26 = (ad)var15_18.next();
                        if (var23_1.a.isHorizontal()) {
                            var9_11 += var24_26.l();
                            var11_12 = (int)Math.max((double)var11_12, var24_26.J());
                            continue;
                        }
                        var11_12 += var24_26.J();
                        var9_11 = (int)Math.max((double)var9_11, var24_26.l());
                    }
                    if (a.size() <= vRa.d) ** GOTO lbl98
                    if (var23_1.a.isHorizontal()) {
                        var9_11 += (double)(var23_1.j * (a.size() - vRa.d));
                        v4 = var19_21;
                    } else {
                        var11_12 += (double)(var23_1.k * (a.size() - vRa.d));
lbl98:
                        // 2 sources

                        v4 = var19_21;
                    }
                    var19_21 = Math.max(v4, (double)var9_11);
                    var21_24 = Math.max(var21_24, (double)var11_12);
                    v5 = var23_1;
                    var15_17 = v5.I + (double)var6_7;
                    var17_19 = v5.J + (double)var7_9;
                    if (var14_15 > 0) {
                        v6 = var23_1;
                        if (var23_1.a.isHorizontal()) {
                            var17_19 = v6.J + (double)var7_9 + (double)var14_15 * (var3_5 + (double)var23_1.k);
                        } else {
                            var15_17 = v6.I + (double)var6_7 + (double)var14_15 * (var1_3 + (double)var23_1.j);
                        }
                    }
                    var26_28 = aSa.V;
                    if (!var23_1.a.isHorizontal()) break block80;
                    switch (yqa.A[var23_1.i.ordinal()]) lbl-1000:
                    // 2 sources

                    {
                        case 1: {
                            if (false) ** GOTO lbl-1000
                            var15_17 = var23_1.I + var23_1.k - var9_11 - (double)var5_6;
                            break;
                        }
                        case 2: {
                            var15_17 = var23_1.I + (var23_1.k - var9_11) / KPa.y;
                            break;
                        }
                        case 3: {
                            if (a.size() > vRa.d) {
                                var26_28 = (var23_1.k - var9_11 - (double)var6_7 - (double)var5_6) / (double)(a.size() - vRa.d);
                                break;
                            }
                            ** GOTO lbl-1000
                        }
                        case 4: {
                            if (!a.isEmpty()) {
                                var26_28 = (var23_1.k - var9_11) / (double)(a.size() * uqa.g);
                                var15_17 += var26_28;
                                break;
                            }
                            ** GOTO lbl-1000
                        }
                        case 5: {
                            if (a.isEmpty()) ** GOTO lbl-1000
                            var26_28 = (var23_1.k - var9_11) / (double)(a.size() + vRa.d);
                            var15_17 += var26_28;
                        }
                        default: {
                            break;
                        }
                        {
                        }
                    }
                    ** GOTO lbl-1000
                }
                switch (yqa.A[var23_1.i.ordinal()]) lbl-1000:
                // 2 sources

                {
                    case 1: {
                        if (false) ** GOTO lbl-1000
                        var17_19 = var23_1.J + var23_1.j - var11_12 - (double)var8_10;
                        v7 = var15_17;
                        break;
                    }
                    case 2: {
                        var17_19 = var23_1.J + (var23_1.j - var11_12) / KPa.y;
                        v7 = var15_17;
                        break;
                    }
                    case 3: {
                        if (a.size() > vRa.d) {
                            var26_28 = (var23_1.j - var11_12 - (double)var7_9 - (double)var8_10) / (double)(a.size() - vRa.d);
                            v7 = var15_17;
                            break;
                        }
                        ** GOTO lbl167
                    }
                    case 4: {
                        if (!a.isEmpty()) {
                            var26_28 = (var23_1.j - var11_12) / (double)(a.size() * uqa.g);
                            var17_19 += var26_28;
                            v7 = var15_17;
                            break;
                        }
                        ** GOTO lbl167
                    }
                    case 5: {
                        if (!a.isEmpty()) {
                            var26_28 = (var23_1.j - var11_12) / (double)(a.size() + vRa.d);
                            var17_19 += var26_28;
                        }
                    }
lbl167:
                    // 6 sources

                    default: lbl-1000:
                    // 5 sources

                    {
                        v7 = var15_17;
                    }
                }
                var28_29 = v7;
                var15_17 = var17_19;
                v8 = uSa.E;
                while (v8 < a.size()) {
                    block82: {
                        block81: {
                            var25_27 = (ad)a.get(var24_25);
                            var17_19 = (int)(var24_25 < a.size() - vRa.d ? var26_28 : aSa.V);
                            if (!var23_1.a.isHorizontal()) break block81;
                            if (var23_1.i != gra.SPACE_BETWEEN || a.size() != uqa.g) ** GOTO lbl183
                            v9 = var23_1;
                            if (var24_25 == 0) {
                                var28_29 = v9.I + (double)var6_7;
                                v10 = var15_17;
                            } else {
                                var28_29 = v9.I + var23_1.k - var25_27.l() - (double)var5_6;
lbl183:
                                // 2 sources

                                v10 = var15_17;
                            }
                            var30_30 = v10;
                            switch (yqa.I[var23_1.B.ordinal()]) lbl-1000:
                            // 2 sources

                            {
                                case 1: {
                                    if (false) ** GOTO lbl-1000
                                    var30_30 = var15_17 + var11_12 - var25_27.J();
                                    v11 = var25_27;
                                    break;
                                }
                                case 2: {
                                    var30_30 = var15_17 + (var11_12 - var25_27.J()) / KPa.y;
                                    v11 = var25_27;
                                    break;
                                }
                                case 3: {
                                    var25_27.f((double)var11_12);
                                }
                                default: {
                                    v11 = var25_27;
                                }
                            }
                            v11.C((double)var28_29);
                            var25_27.l((double)var30_30);
                            if (var23_1.i != gra.SPACE_BETWEEN || var24_25 == a.size() - vRa.d) {
                                var28_29 += var25_27.l() + (double)var23_1.j + var17_19;
                            }
                            v12 = var23_1;
                            v12.E = Math.max(v12.E, var25_27.f() + var25_27.l() - var23_1.I);
                            v12.f = Math.max(v12.f, (double)(var30_30 + var25_27.J() - var23_1.J));
                            break block82;
                        }
                        if (var23_1.i != gra.SPACE_BETWEEN || a.size() != uqa.g) ** GOTO lbl215
                        v13 = var23_1;
                        if (var24_25 == 0) {
                            var15_17 = v13.J + (double)var7_9;
                            v14 = var28_29;
                        } else {
                            var15_17 = v13.J + var23_1.j - var25_27.J() - (double)var8_10;
lbl215:
                            // 2 sources

                            v14 = var28_29;
                        }
                        var30_30 = v14;
                        switch (yqa.I[var23_1.B.ordinal()]) lbl-1000:
                        // 2 sources

                        {
                            case 1: {
                                if (false) ** GOTO lbl-1000
                                var30_30 = var28_29 + var9_11 - var25_27.l();
                                v15 = var25_27;
                                break;
                            }
                            case 2: {
                                var30_30 = var28_29 + (var9_11 - var25_27.l()) / KPa.y;
                                v15 = var25_27;
                                break;
                            }
                            case 3: {
                                var25_27.J((double)var9_11);
                            }
                            default: {
                                v15 = var25_27;
                            }
                        }
                        v15.C((double)var30_30);
                        var25_27.l((double)var15_17);
                        if (var23_1.i != gra.SPACE_BETWEEN || var24_25 == a.size() - vRa.d) {
                            var15_17 += var25_27.J() + (double)var23_1.k + var17_19;
                        }
                        v16 = var23_1;
                        v16.E = Math.max(v16.E, (double)(var30_30 + var25_27.l() - var23_1.I));
                        v16.f = Math.max(v16.f, var25_27.C() + var25_27.J() - var23_1.J);
                    }
                    v8 = ++var24_25;
                }
            }
            v3 = ++var14_15;
        }
        for (Object a : var23_1.C) {
            if (var23_1.G.isHorizontal()) {
                v17 = a;
                v18 = var23_1;
                v17.C(v17.f() + (var23_1.G.isIncrease() != false ? v18.D.l() : -v18.D.l()));
                continue;
            }
            v19 = a;
            v20 = var23_1;
            v19.l(v19.C() + (var23_1.G.isIncrease() != false ? v20.D.l() : -v20.D.l()));
        }
        if (var23_1.m) ** GOTO lbl281
        if (!var23_1.I) {
            if (var23_1.a.isHorizontal()) {
                if (var13_13.size() > vRa.d) {
                    v21 = var23_1;
                    var23_1.k = (int)((double)((int)(var19_21 + (double)var6_7 + (double)var5_6)));
                    var23_1.j = (int)((double)((int)((double)var13_13.size() * var21_24 + (double)((var13_13.size() - vRa.d) * var23_1.k) + (double)var7_9 + (double)var8_10)));
                } else {
                    v22 = var23_1;
                    v21 = v22;
                    v22.k = (int)((double)((int)(v22.E + (double)var5_6)));
                    v22.j = (int)((double)((int)(v22.f + (double)var8_10)));
                }
            } else if (var13_13.size() > vRa.d) {
                v21 = var23_1;
                var23_1.j = (int)((double)((int)(var21_24 + (double)var7_9 + (double)var8_10)));
                var23_1.k = (int)((double)((int)((double)var13_13.size() * var19_21 + (double)((var13_13.size() - vRa.d) * var23_1.j) + (double)var6_7 + (double)var5_6)));
            } else {
                v23 = var23_1;
                v21 = v23;
                v23.k = (int)((double)((int)(v23.E + (double)var5_6)));
                v23.j = (int)((double)((int)(v23.f + (double)var8_10)));
            }
        } else {
            if (var23_1.k <= aSa.V) {
                var23_1.k = (int)((double)((int)(var23_1.E + (double)var5_6)));
            }
            if (var23_1.j <= aSa.V) {
                var23_1.j = (int)((double)((int)(var23_1.f + (double)var8_10)));
            }
lbl281:
            // 4 sources

            v21 = var23_1;
        }
        if (v21.J) {
            var23_1.k = (int)((double)((int)(var23_1.E + (double)var5_6)));
        }
        if (var23_1.b) {
            var23_1.j = (int)((double)((int)(var23_1.f + (double)var8_10)));
        }
    }

    public int J() {
        jb a2;
        return a2.F;
    }
}

