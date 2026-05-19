/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  EQ
 *  ERa
 *  JPa
 *  Kh
 *  TPa
 *  Usa
 *  Vz
 *  XM
 *  XO
 *  aSa
 *  dQa
 *  fO
 *  k
 *  ld
 *  pY
 *  pua
 *  uKa
 *  vRa
 *  wOa
 */
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Ip_2
extends Bp {
    public final Ii d;
    public int a;
    public RQ b;
    public int l;
    public String[] e;
    public int G;
    public Point[] D;
    public int f;
    public int F;
    public XO g;
    public kL L;
    public lR E;
    public boolean m;
    public String[] C;
    public boolean i;
    public int k;
    public int j;
    public int J;
    public String[] A;
    public int I;

    public void D() {
        Ip_2 ip_2 = this;
        if (!ip_2.d.J) {
            return;
        }
        Ip_2 ip_22 = ip_2;
        ip_22.A();
        if (ip_22.E != lR.NO_WRAP) {
            int a2;
            Ip_2 ip_23 = ip_2;
            if (ip_23.A == ip_23.e) {
                ip_2.e = ip_2.C;
            }
            Ip_2 ip_24 = ip_2;
            ip_24.C = ip_24.e;
            ArrayList<String> arrayList = new ArrayList<String>();
            int n2 = ip_24.f();
            String[] stringArray = ip_24.e;
            int n3 = ip_24.e.length;
            int n4 = a2 = uSa.E;
            while (n4 < n3) {
                String string = stringArray[a2];
                arrayList.addAll(Arrays.asList(ip_2.J(string, n2)));
                n4 = ++a2;
            }
            ip_2.e = arrayList.toArray(new String[uSa.E]);
            Ip_2 ip_25 = ip_2;
            ip_25.A();
            ip_25.I = ip_25.f();
            ip_25.A = ip_25.e;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void J(fO var1_1) {
        b = var1_1;
        a = this;
        v0 = b;
        super.J((fO)v0);
        if (!v0.hasEText()) {
            return;
        }
        if ((b = b.getEText()).hasWidth()) {
            v1 = b;
            v2 = v1;
            a.L.J(nP.J(a, (float)v1.getWidth()));
        } else {
            if (b.hasWidthExpr()) {
                a.L.J(RJ.f(a, b.getWidthExpr()));
            }
            v2 = b;
        }
        if (v2.getTextCount() <= 0) ** GOTO lbl23
        if (b.getTextCount() == vRa.d && b.getText(uSa.E).isEmpty()) {
            a.e = new String[uSa.E];
            v3 = b;
        } else {
            a.e = b.getTextList().toArray(new String[uSa.E]);
lbl23:
            // 2 sources

            v3 = b;
        }
        if (v3.hasShadow()) {
            a.m = b.getShadow();
        }
        if (b.hasBackground()) {
            a.f(b.getBackground());
        }
        if (b.hasHoverBackground()) {
            a.f = b.getHoverBackground();
        }
        a.D();
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2) {
        Ip_2 ip_2;
        Object b2;
        void a2;
        Ip_2 ip_22 = this;
        void v0 = a2;
        if (v0 == (float)((int)v0)) {
            b2 = String.valueOf((int)a2);
            ip_2 = ip_22;
        } else {
            b2 = String.valueOf((float)a2);
            ip_2 = ip_22;
        }
        ip_2.J((String)b2);
    }

    public int f() {
        Ip_2 a2;
        return (int)(a2.J() - (float)(a2.a * uqa.g));
    }

    @Override
    public boolean J(long a2) {
        Ip_2 b2;
        if (!super.J(a2)) {
            return uSa.E != 0;
        }
        if (!b2.d.J) {
            Ip_2 ip_2 = b2;
            ip_2.o += dQa.Ga;
            if (ip_2.d.k) {
                b2.d.J = vRa.d;
                b2.D();
            }
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    @Override
    public void f() {
        Ip_2 a2;
        Ip_2 ip_2 = a2;
        super.f();
        ip_2.j = pua.o;
        ip_2.D();
    }

    /*
     * WARNING - void declaration
     */
    private String[] J(String string, int n2) {
        int n3;
        void a22;
        List<ld> b2;
        Ip_2 ip_2 = this;
        b2 = OMa.J((ld)new CY((String)((Object)b2)), (int)a22, ip_2.d, vRa.d != 0, vRa.d != 0);
        String[] a22 = new String[b2.size()];
        int n4 = n3 = uSa.E;
        while (n4 < b2.size()) {
            String string2 = b2.get(n3).f();
            if (n3 > 0) {
                Ip_2 c2 = new Vz();
                char[] cArray = a22[n3 - vRa.d].toCharArray();
                int n5 = uSa.E;
                while (n5 < cArray.length) {
                    int n6;
                    if (cArray[n6] == TPa.Aa && n6 < cArray.length - vRa.d) {
                        int n7;
                        if ((n7 = UOa.q.indexOf(cArray[++n6])) < ERa.C) {
                            c2 = new Vz();
                            c2.J(pY.func_175744_a((int)n7));
                        } else if (n7 == ERa.C) {
                            c2.A(vRa.d != 0);
                        } else if (n7 == yta.Ka) {
                            c2.G(vRa.d != 0);
                        } else if (n7 == yOa.B) {
                            c2.M(vRa.d != 0);
                        } else if (n7 == wOa.t) {
                            c2.F(vRa.d != 0);
                        } else if (n7 == kTa.j) {
                            c2.i(vRa.d != 0);
                        } else if (n7 == wOa.h) {
                            c2 = new Vz();
                        }
                    }
                    n5 = ++n6;
                }
                string2 = new StringBuilder().insert(3 & 4, c2.l()).append(string2).toString();
            }
            a22[n3++] = string2;
            n4 = n3;
        }
        return a22;
    }

    public void A() {
        int a2;
        Ip_2 ip_2 = this;
        if (ip_2.D.length != ip_2.e.length) {
            ip_2.D = new Point[ip_2.e.length];
        }
        Ip_2 ip_22 = ip_2;
        ip_22.F = uSa.E;
        ip_22.k = uSa.E;
        int n2 = a2 = uSa.E;
        while (n2 < ip_2.e.length) {
            Ip_2 ip_23 = ip_2;
            Ip_2 ip_24 = ip_2;
            Ip_2 ip_25 = ip_2;
            ip_23.D[a2] = new Point(ip_24.d.f(ip_24.e[a2]), ip_25.d.J(ip_25.e[a2]));
            ip_2.F = Math.max(ip_23.F, ip_2.D[a2].x);
            int n3 = ip_23.l != pua.o ? ip_2.l : ip_2.D[a2].y;
            ip_2.k += n3;
            n2 = ++a2;
        }
    }

    @Override
    public float d() {
        Ip_2 a2;
        return a2.k;
    }

    @Override
    public float e() {
        Ip_2 a2;
        Ip_2 ip_2 = a2;
        return ip_2.F + ip_2.a * uqa.g;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void J(long l2) {
        int n2;
        int n3;
        Object object = this;
        int a2 = ((Ip_2)object).f();
        if (a2 != ((Ip_2)object).I && ((Ip_2)object).E != lR.NO_WRAP) {
            ((Ip_2)object).D();
        }
        int n4 = n3 = (((Ip_2)object).e != false || ((Ip_2)object).q) && ((Ip_2)object).f != pua.o ? ((Ip_2)object).f : ((Ip_2)object).G;
        if (n3 != pua.o) {
            Kh.J((double)aSa.V, (double)aSa.V, (double)(a2 + ((Ip_2)object).a * uqa.g), (double)((Bp)object).f(), (int)((Bp)object).l(n3));
        }
        uKa.H();
        n3 = vqa.F;
        if (((Ip_2)object).J > 0) {
            n3 = (int)((OT.e - ((Ip_2)object).F) / (long)((Ip_2)object).J);
        }
        int n5 = uSa.E;
        int n6 = n2 = uSa.E;
        while (true) {
            Ip_2 ip_2;
            int n7;
            int n8;
            int n9;
            Object b2;
            int n10;
            block19: {
                block21: {
                    int n11;
                    block23: {
                        block20: {
                            block22: {
                                if (n6 >= ((Ip_2)object).e.length) break block20;
                                Ip_2 ip_22 = object;
                                n10 = ip_22.D[n2].x;
                                b2 = ip_22.e[n2];
                                if (n3 == vqa.F) break block21;
                                if (n3 != 0) break block22;
                                b2 = Mqa.y;
                                n9 = n10;
                                break block19;
                            }
                            n11 = n8 = uSa.E;
                            break block23;
                        }
                        if (n3 > 0) {
                            ((Ip_2)object).J = uSa.E;
                        }
                        return;
                    }
                    while (n11 < ((String)b2).length()) {
                        if (((String)b2).charAt(n8) == TPa.Aa && n8 < ((String)b2).length() - vRa.d && (n7 = UOa.q.indexOf(((String)b2).charAt(n8 + vRa.d))) != pua.o) {
                            ++n8;
                        } else if (--n3 == 0) {
                            b2 = ((String)b2).substring(uSa.E, n8);
                            n9 = n10;
                            break block19;
                        }
                        n11 = ++n8;
                    }
                }
                n9 = n10;
            }
            if (n9 > a2) {
                switch (EQ.A[((Ip_2)object).g.ordinal()]) {
                    case 1: {
                        Ip_2 ip_23 = object;
                        b2 = ip_23.d.J((String)b2, a2, uSa.E != 0);
                        n10 = ip_23.d.f((String)b2);
                        break;
                    }
                    case 2: {
                        b2 = new StringBuilder().insert(3 ^ 3, ((Ip_2)object).d.J((String)b2, a2 - ((Ip_2)object).J(), uSa.E != 0)).append(Usa.E).toString();
                        n10 = ((Ip_2)object).d.f((String)b2);
                        break;
                    }
                }
            }
            n8 = uSa.E;
            switch (EQ.I[((Ip_2)object).b.ordinal()]) {
                case 1: {
                    n8 = (a2 - n10) / uqa.g;
                    ip_2 = object;
                    break;
                }
                case 2: {
                    n8 = a2 - n10;
                }
                default: {
                    ip_2 = object;
                }
            }
            n7 = ip_2.l != pua.o ? ((Ip_2)object).l : ((Ip_2)object).D[n2].y;
            n10 = (n7 - ((Ip_2)object).D[n2].y) / uqa.g;
            if (!((String)b2).isEmpty()) {
                ((Ip_2)object).d.J((String)b2, n8 + ((Ip_2)object).a, n5 + n10, ((Ip_2)object).x.J, ((Ip_2)object).m);
            }
            n5 += n7;
            n6 = ++n2;
        }
    }

    private void f(int n2) {
        Ip_2 a2;
        int b2 = n2;
        Ip_2 ip_2 = a2 = this;
        ip_2.G = b2;
        ip_2.a = b2 == pua.o ? uSa.E : uqa.g;
    }

    @Override
    public void J() {
        Ip_2 a2;
        Ip_2 ip_2 = a2;
        super.J();
        ip_2.d.J();
    }

    private int J() {
        Ip_2 a2;
        if (a2.j == pua.o) {
            a2.j = a2.d.f(Usa.E);
        }
        return a2.j;
    }

    @Override
    public void C() {
        Ip_2 a2;
        a2.D();
    }

    /*
     * WARNING - void declaration
     */
    public Ip_2(k k2, XM xM2) {
        Ip_2 ip_2;
        void a2;
        Ip_2 c2 = k2;
        Ip_2 b2 = this;
        super((k)c2, (XM)a2);
        b2.D = new Point[uSa.E];
        Ip_2 ip_22 = b2;
        ip_22.a = uSa.E;
        ip_22.F = uSa.E;
        ip_22.k = uSa.E;
        ip_22.j = pua.o;
        ip_22.E = lR.NO_WRAP;
        ip_22.g = XO.VISIBLE;
        ip_22.b = RQ.CENTER;
        ip_22.L = kL.J();
        ip_22.l = pua.o;
        ip_22.m = vRa.d;
        ip_22.G = pua.o;
        ip_22.f = pua.o;
        ip_22.J = uSa.E;
        c2 = a2.getEText();
        if (c2.hasWidthExpr()) {
            Ip_2 ip_23 = b2;
            ip_2 = ip_23;
            b2.L.J(RJ.f(ip_23, c2.getWidthExpr()));
        } else if (c2.hasWidth()) {
            Ip_2 ip_24 = b2;
            ip_2 = ip_24;
            b2.L.J(nP.J(ip_24, (float)c2.getWidth()));
        } else {
            Ip_2 ip_25 = b2;
            ip_2 = ip_25;
            ip_25.L.J(nP.J(b2, vqa.T));
        }
        ip_2.e = c2.getTextList().toArray(new String[uSa.E]);
        if (c2.hasAlign()) {
            b2.b = RQ.fromProto(c2.getAlign());
        }
        if (c2.hasWordWrap()) {
            b2.E = lR.fromProto(c2.getWordWrap());
        }
        if (c2.hasOverflow()) {
            b2.g = XO.fromProto((ZL)c2.getOverflow());
        }
        if (c2.hasShadow()) {
            b2.m = c2.getShadow();
        }
        if (c2.hasBackground()) {
            b2.f(c2.getBackground());
        }
        if (b2.j != 0 && c2.hasHoverBackground()) {
            b2.f = c2.getHoverBackground();
        }
        if (c2.hasLineHeight()) {
            b2.l = c2.getLineHeight();
        }
        if (c2.hasLivePrintingDelay()) {
            b2.J = c2.getLivePrintingDelay();
        }
        b2.d = OT.i.g.J(c2.hasFont() ? c2.getFont() : null);
    }

    @Override
    public float J() {
        Ip_2 ip_2 = this;
        if (ip_2.i) {
            return JPa.N;
        }
        ip_2.i = vRa.d;
        float a2 = ip_2.L.f();
        ip_2.i = uSa.E;
        return a2;
    }

    public void J(String string) {
        String b2 = string;
        Ip_2 a2 = this;
        if (a2.e == null || a2.e.length < vRa.d || !a2.e[uSa.E].equals(b2)) {
            String[] stringArray = new String[vRa.d];
            stringArray[uSa.E] = b2;
            a2.e = stringArray;
            a2.D();
        }
    }
}

