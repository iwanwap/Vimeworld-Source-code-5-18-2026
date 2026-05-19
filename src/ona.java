/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KA
 *  Kna
 *  Kpa
 *  Lra
 *  NTa
 *  ZOa
 *  kpa
 *  pua
 *  uKa
 *  vRa
 */
import com.google.common.collect.Lists;
import java.util.List;

public final class ona
extends KA {
    public int D;
    private int f;
    private int F;
    public int g;
    private int L;
    private Kna E;
    private List<String> m;
    private int C;
    private boolean i;
    public boolean M;
    public int k;
    private boolean j;
    public int J;
    private int A;
    public int I;

    /*
     * WARNING - void declaration
     */
    public void f(Kpa kpa2, int n2, int n3) {
        int d2 = n2;
        ona b2 = this;
        if (b2.M) {
            void a2;
            void c22;
            uKa.B();
            uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
            ona ona2 = b2;
            ona2.J((Kpa)c22, d2, (int)a2);
            int c22 = ona2.D + b2.k / uqa.g + b2.f / uqa.g - b2.m.size() * NTa.C / uqa.g;
            int n4 = d2 = uSa.E;
            while (n4 < b2.m.size()) {
                if (b2.j) {
                    ona ona3 = b2;
                    ona.J((String)b2.m.get(d2), (int)(ona3.g + ona3.J / uqa.g), (int)(c22 + d2 * NTa.C), (int)b2.F);
                } else {
                    ona.f((String)b2.m.get(d2), (int)b2.g, (int)(c22 + d2 * NTa.C), (int)b2.F);
                }
                n4 = ++d2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public ona(Kna kna2, int n2, int n3, int n4, int n5, int n6, int n7) {
        void h;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g;
        ona a2;
        int n8 = n7;
        ona ona2 = a2 = this;
        ona ona3 = a2;
        ona ona4 = a2;
        ona ona5 = a2;
        ona ona6 = a2;
        ona ona7 = a2;
        a2.J = ZOa.x;
        a2.k = kTa.j;
        a2.M = vRa.d;
        ona7.E = g;
        ona7.I = f2;
        ona6.g = e2;
        ona6.D = d2;
        ona5.J = c2;
        ona4.k = b2;
        ona5.m = Lists.newArrayList();
        ona4.j = uSa.E;
        ona3.i = uSa.E;
        ona2.F = h;
        ona3.C = pua.o;
        ona2.L = pua.o;
        ona2.A = pua.o;
        ona2.f = uSa.E;
    }

    public void J(Kpa kpa2, int n2, int n3) {
        ona ona2 = this;
        if (ona2.i) {
            ona ona3 = ona2;
            ona ona4 = ona2;
            int c2 = ona3.J + ona4.f * uqa.g;
            int b2 = ona3.k + ona2.f * uqa.g;
            int a2 = ona4.g - ona2.f;
            int d2 = ona3.D - ona2.f;
            int n4 = a2;
            ona.J((int)n4, (int)d2, (int)(n4 + c2), (int)(d2 + b2), (int)ona2.C);
            int n5 = a2;
            ona3.l(n5, n5 + c2, d2, ona2.L);
            int n6 = a2;
            ona3.l(n6, n6 + c2, d2 + b2, ona2.A);
            int n7 = d2;
            ona3.f(a2, n7, n7 + b2, ona2.L);
            int n8 = d2;
            ona3.f(a2 + c2, n8, n8 + b2, ona2.A);
        }
    }

    public void J(String string) {
        Object b2 = string;
        ona a2 = this;
        a2.m.add(oha.J((String)b2, new Object[uSa.E]));
    }

    public ona J() {
        ona a2;
        a2.j = vRa.d;
        return a2;
    }
}

