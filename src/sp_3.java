/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Kh
 *  NTa
 *  Qsa
 *  Wp
 *  XM
 *  XQ
 *  XTa
 *  aKa
 *  aSa
 *  bpa
 *  bqa
 *  dQa
 *  eN
 *  fO
 *  k
 *  mka
 *  pKa
 *  pua
 *  uKa
 *  vRa
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class sp_3
extends Bp {
    private int a;
    private boolean b;
    private int G;
    private int D;
    private int f;
    private int F;
    private int g;
    private String L;
    private int E;
    private final XQ[] m;
    private final List<String[]> C;
    private final Ii i;
    private int M;
    private int k;
    private int j;
    private boolean J;
    private int A;
    private int I;

    @Override
    public boolean J(int n2) {
        sp_3 a2 = this;
        int b2 = n2;
        if (super.J(b2)) {
            return vRa.d != 0;
        }
        if (a2.l()) {
            if (a2.a - b2 >= 0 && a2.a - b2 + a2.F <= a2.C.size()) {
                a2.a -= b2;
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public sp_3(k k2, XM xM2) {
        Object object;
        void a2;
        sp_3 c2 = k2;
        sp_3 b2 = this;
        super((k)c2, (XM)a2);
        b2.k = bpa.g;
        b2.j = bqa.L;
        b2.J = uSa.E;
        b2.I = pua.o;
        b2.a = uSa.E;
        b2.G = uSa.E;
        b2.A = bqa.L;
        b2.g = WRa.v;
        b2.f = uSa.E;
        c2 = a2.getETable();
        if (c2.hasTitle()) {
            b2.L = c2.getTitle();
        }
        if (c2.hasTitleColor()) {
            b2.k = c2.getTitleColor();
        }
        if (c2.hasHeadingColor()) {
            b2.j = c2.getHeadingColor();
        }
        if (c2.hasScrollbarColor()) {
            b2.A = c2.getScrollbarColor();
        }
        if (c2.hasRowHoverColor()) {
            b2.g = c2.getRowHoverColor();
        }
        if (c2.hasDrawBack()) {
            b2.J = c2.getDrawBack();
        }
        if (c2.hasRadius()) {
            b2.f = c2.getRadius();
        }
        b2.m = new XQ[c2.getColumnsCount()];
        int n2 = a2 = uSa.E;
        while (n2 < b2.m.length) {
            object = c2.getColumns(a2);
            b2.m[a2] = new XQ(object.getName(), object.getWidth());
            XQ xQ2 = b2.m[a2];
            if (object.hasCenter()) {
                xQ2.k = object.getCenter();
            }
            if (object.hasColor()) {
                xQ2.A = object.getColor();
            }
            n2 = ++a2;
        }
        b2.C = new ArrayList<String[]>(c2.getRowsCount());
        Iterator iterator = a2 = c2.getRowsList().iterator();
        while (iterator.hasNext()) {
            object = (An)a2.next();
            b2.C.add(((An)object).getValuesList().toArray(new String[uSa.E]));
            iterator = a2;
        }
        if (c2.hasMaxRows()) {
            b2.G = c2.getMaxRows();
        }
        b2.i = OT.i.g.J(c2.hasFont() ? c2.getFont() : null);
        b2.A();
    }

    @Override
    public float e() {
        sp_3 a2;
        return a2.M;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void J(fO fO2) {
        eN a2;
        sp_3 sp_32 = this;
        void v0 = a2;
        super.J((fO)v0);
        if (!v0.hasETable()) {
            return;
        }
        a2 = a2.getETable();
        for (sp_3 b2 : a2.getActionsList()) {
            switch (Wp.I[b2.getKind().ordinal()]) {
                case 1: {
                    sp_32.C.add(b2.getRow().getValuesList().toArray(new String[uSa.E]));
                    break;
                }
                case 2: {
                    sp_32.C.add(b2.getRowId(), b2.getRow().getValuesList().toArray(new String[uSa.E]));
                    break;
                }
                case 3: {
                    sp_32.C.remove(b2.getRowId());
                    break;
                }
                case 4: {
                    sp_32.C.set(b2.getRowId(), b2.getRow().getValuesList().toArray(new String[uSa.E]));
                    break;
                }
                case 5: {
                    sp_32.C.clear();
                    break;
                }
            }
        }
        sp_3 sp_33 = sp_32;
        if (sp_33.a + sp_33.F > sp_32.C.size()) {
            sp_32.a = Math.max(uSa.E, sp_32.C.size() - sp_32.F);
        }
        if (a2.getActionsCount() > 0) {
            sp_32.A();
        }
    }

    public boolean l() {
        sp_3 a2;
        sp_3 sp_32 = a2;
        if (sp_32.F < sp_32.C.size()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public void J(long l2) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        sp_3 sp_32 = this;
        int a2 = sp_3.J(sp_32.x.J);
        int n8 = Qsa.P;
        if (sp_3.J(n8) > a2) {
            n8 = sp_3.l(n8, a2);
        }
        sp_32.b = uKa.C();
        if (sp_32.b && sp_32.J) {
            uKa.m();
        }
        int n9 = uSa.E;
        if (sp_32.L != null) {
            sp_3 sp_33 = sp_32;
            sp_3 sp_34 = sp_32;
            n7 = sp_33.i.f(sp_34.L) + NTa.C;
            Kh.J((double)((double)(sp_33.M - n7) / KPa.y), (double)aSa.V, (double)n7, (double)(sp_32.E - vRa.d), (int)n8, (double)sp_32.f, (int)yRa.d);
            n9 += sp_32.E;
            if (sp_34.f > 0) {
                --n9;
            }
        }
        Kh.J((double)aSa.V, (double)n9, (double)sp_32.M, (double)(sp_32.E - vRa.d), (int)n8, (double)sp_32.f, (int)yRa.d);
        uKa.z();
        pKa.J().J().J(XTa.W, mka.I);
        n7 = n9 += sp_32.E;
        if (sp_32.l()) {
            n6 = n9;
            sp_3 sp_35 = sp_32;
            int b2 = sp_35.M - uqa.g;
            n5 = sp_35.D - n6 - vRa.d;
            sp_3 sp_36 = sp_32;
            n4 = (int)((float)n5 * ((float)sp_32.F / (float)sp_36.C.size()));
            sp_3.J(b2, n6, KPa.y, n5, n8);
            n6 = (int)((float)n6 + (float)(n5 - n4) * (float)sp_32.a / (float)(sp_32.C.size() - sp_32.F));
            n3 = sp_36.A;
            if (sp_3.J(n3) > a2) {
                n3 = sp_3.l(n3, a2);
            }
            sp_3.J(b2, n6, KPa.y, n4, n3);
        }
        int n10 = n6 = sp_32.a;
        while (true) {
            sp_3 sp_37 = sp_32;
            if (n10 >= sp_37.a + sp_37.F || n6 >= sp_32.C.size()) break;
            int b2 = n8;
            if (sp_32.I == n6 && sp_3.J(b2 = sp_32.g) > a2) {
                b2 = sp_3.l(b2, a2);
            }
            n5 = uSa.E;
            XQ[] xQArray = sp_32.m;
            n3 = sp_32.m.length;
            int n11 = uSa.E;
            while (n11 < n3) {
                int n12;
                XQ xQ2 = xQArray[n12];
                sp_3.J(n5, n9, xQ2.I, sp_32.E - vRa.d, b2);
                n5 += xQ2.I + vRa.d;
                n11 = ++n12;
            }
            n9 += sp_32.E;
            n10 = ++n6;
        }
        pKa.J().J();
        uKa.H();
        if (sp_32.b && sp_32.J) {
            uKa.h();
        }
        sp_3 sp_38 = sp_32;
        n6 = sp_3.l(sp_38.j, a2);
        if (sp_38.L != null) {
            sp_3 sp_39 = sp_32;
            sp_3 sp_310 = sp_32;
            int b2 = sp_39.i.f(sp_310.L) + NTa.C;
            sp_310.J(sp_39.L, (sp_32.M - b2) / uqa.g, uSa.E, b2, sp_3.l(sp_32.k, a2), vRa.d != 0);
        }
        int b2 = uSa.E;
        XQ[] xQArray = sp_32.m;
        n4 = sp_32.m.length;
        int n13 = n3 = uSa.E;
        while (n13 < n4) {
            XQ xQ3 = xQArray[n3];
            int n14 = b2;
            sp_32.J(xQ3.j, n14, n7 - sp_32.E, xQ3.I, n6, vRa.d != 0);
            b2 = n14 + (xQ3.I + vRa.d);
            n13 = ++n3;
        }
        n9 = n7;
        int n15 = n2 = sp_32.a;
        while (true) {
            sp_3 sp_311 = sp_32;
            if (n15 >= sp_311.a + sp_311.F || n2 >= sp_32.C.size()) break;
            b2 = uSa.E;
            String[] stringArray = sp_32.C.get(n2);
            int n16 = uSa.E;
            while (n16 < stringArray.length) {
                int n17 = b2;
                sp_32.J(stringArray[n3], n17, n9, sp_32.m[n3].I, sp_3.l(sp_32.m[n3].A, a2), sp_32.m[n3].k);
                b2 = n17 + (sp_32.m[++n3].I + vRa.d);
                n16 = n3;
            }
            n9 += sp_32.E;
            n15 = ++n2;
        }
        sp_32.I = pua.o;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(double d2, double d3, double d4, double d5, int n2) {
        void c2;
        void b2;
        void d6;
        double e2;
        aKa aKa2;
        int n3 = n2;
        int n4 = n3 >> osa.c & osa.Ja;
        int n5 = n3 >> ERa.C & osa.Ja;
        int a2 = n3 >> Yqa.i & osa.Ja;
        aKa aKa3 = aKa2 = pKa.J().J();
        double d7 = e2;
        aKa2.J(e2, (double)(d6 + b2), aSa.V).J(n5, a2, n3 &= osa.Ja, n4).M();
        aKa2.J(d7 + c2, (double)(d6 + b2), aSa.V).J(n5, a2, n3, n4).M();
        aKa3.J(d7 + c2, (double)d6, aSa.V).J(n5, a2, n3, n4).M();
        aKa3.J(e2, (double)d6, aSa.V).J(n5, a2, n3, n4).M();
    }

    /*
     * WARNING - void declaration
     */
    private void J(String string, int n2, int n3, int n4, int n5, boolean bl2) {
        void b2;
        void d2;
        void c2;
        void a2;
        void e2;
        String g2 = string;
        sp_3 f2 = this;
        f2.i.J(g2, (int)(e2 + (a2 != false ? (c2 - f2.i.f(g2)) / uqa.g : vRa.d)), (int)d2, (int)b2, uSa.E != 0);
    }

    @Override
    public void J() {
        sp_3 a2;
        sp_3 sp_32 = a2;
        super.J();
        sp_32.i.J();
    }

    @Override
    public boolean J(long a2) {
        sp_3 b2;
        if (!super.J(a2)) {
            return uSa.E != 0;
        }
        if (!b2.i.J) {
            sp_3 sp_32 = b2;
            sp_32.o += dQa.Ga;
            if (sp_32.i.k) {
                b2.i.J = vRa.d;
                b2.A();
            }
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    private void A() {
        int a2;
        sp_3 sp_32;
        sp_3 sp_33 = this;
        if (!sp_33.i.J) {
            return;
        }
        if (sp_33.G == 0) {
            sp_3 sp_34 = sp_33;
            sp_32 = sp_34;
            sp_34.F = sp_34.C.size();
        } else {
            sp_3 sp_35 = sp_33;
            sp_32 = sp_35;
            sp_33.F = Math.min(sp_35.G, sp_33.C.size());
        }
        sp_32.E = sp_33.i.J(Psa.Q) + vRa.d;
        sp_33.D = sp_33.L != null ? sp_33.E : uSa.E;
        sp_3 sp_36 = sp_33;
        sp_33.D += (sp_36.F + vRa.d) * sp_33.E;
        if (sp_36.f > 0) {
            sp_33.D -= vRa.d;
        }
        sp_3 sp_37 = sp_33;
        sp_37.M = uSa.E;
        XQ[] xQArray = sp_37.m;
        int n2 = sp_37.m.length;
        int n3 = a2 = uSa.E;
        while (n3 < n2) {
            XQ xQ2 = xQArray[a2];
            if (xQ2.J == 0) {
                xQ2.I = sp_33.i.f(xQ2.j);
            }
            sp_33.M += xQ2.I + vRa.d;
            n3 = ++a2;
        }
        sp_3 sp_38 = sp_33;
        sp_38.M -= vRa.d;
        if (sp_38.l()) {
            sp_33.M += yRa.d;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3, long l2) {
        void a2;
        void c2;
        sp_3 b2;
        int d2 = n3;
        sp_3 sp_32 = b2 = this;
        super.J((int)c2, d2, (long)a2);
        if (sp_32.e) {
            if (b2.l() && c2 + yRa.d >= b2.M) {
                b2.I = pua.o;
                return;
            }
            d2 -= b2.E;
            if (b2.f > 0) {
                ++d2;
            }
            if (b2.L != null) {
                d2 -= b2.E;
            }
            if (d2 >= 0 && d2 % b2.E != b2.E - vRa.d) {
                b2.I = b2.a + d2 / b2.E;
            }
        }
    }

    @Override
    public float d() {
        sp_3 a2;
        return a2.D;
    }
}

