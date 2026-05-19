/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  E
 *  EC
 *  ERa
 *  F
 *  Gl
 *  JPa
 *  Joa
 *  Kpa
 *  QNa
 *  RQa
 *  ZRa
 *  aSa
 *  ac
 *  ad
 *  bna
 *  cI
 *  jRa
 *  nLa
 *  nka
 *  pqa
 *  pua
 *  uKa
 *  vL
 *  vRa
 *  vpa
 *  zma
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Joa_2
extends xLa {
    private List<E> j;
    private float J;
    private float A;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) throws IOException {
        void a2;
        void b2;
        void c2;
        Joa_2 joa_2;
        Joa_2 joa_22 = joa_2 = this;
        super.J((int)c2, (int)b2, (int)a2);
        Joa_2 d2 = joa_22.J();
        if (d2 == null) {
            return;
        }
        ((F)d2).J((int)c2, (int)b2, (int)a2, vRa.d != 0);
    }

    public Joa_2(Sx sx2) {
        Joa_2 a2;
        Object b2 = sx2;
        Joa_2 joa_2 = a2 = this;
        super(((Sx)((Object)b2)).x);
        Joa_2 joa_22 = a2;
        joa_2.j = new ArrayList<E>();
        joa_22.f = vRa.d;
        joa_2.j.add((E)new bna((Joa)a2));
        a2.j.add((E)new zma((Joa)a2));
    }

    @Override
    public void A() {
        Joa_2 a2;
        Joa_2 joa_2 = a2;
        joa_2.E.clear();
        if (joa_2.g.L.A()) {
            a2.g.J((EC)new QNa((Sx)a2.g.c));
            return;
        }
        super.A();
    }

    /*
     * WARNING - void declaration
     */
    public static void f(int n2, int n3, int n4, float f2, float f3, Gl gl2) {
        void b2;
        void a2;
        void d22;
        void e22;
        float f4 = f2;
        int c2 = n2;
        uKa.a();
        uKa.e();
        uKa.J((float)c2, (float)((float)e22), (float)SPa.b);
        uKa.l((float)((float)(-d22)), (float)((float)d22), (float)((float)d22));
        uKa.J((float)Hra.Ga, (float)JPa.N, (float)JPa.N, (float)pqa.r);
        void v0 = a2;
        float e22 = v0.ba;
        float d22 = v0.t;
        float f5 = v0.N;
        uKa.J((float)Era.h, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        nLa.f();
        uKa.J((float)opa.z, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        v0.ba = f4;
        v0.t = f4;
        v0.N = b2;
        uKa.J((float)JPa.N, (float)JPa.N, (float)JPa.N);
        oLa oLa2 = f4 = Kpa.J().J();
        oLa2.J(Hra.Ga);
        oLa2.l(uSa.E != 0);
        oLa2.J((vL)a2, aSa.V, aSa.V, aSa.V, JPa.N, pqa.r);
        f4.l(vRa.d != 0);
        void v2 = a2;
        v2.ba = e22;
        v2.t = d22;
        v2.N = f5;
        uKa.D();
        nLa.C();
        uKa.E();
        uKa.i((int)nka.P);
        uKa.z();
        uKa.i((int)nka.v);
    }

    public void l() {
        Joa_2 a2;
        if (a2.g.L.A()) {
            a2.g.J((EC)new QNa((Sx)a2.g.c));
        }
        a2.J();
    }

    public void J(ac ac2) throws IOException {
        Joa_2 b2 = ac2;
        Joa_2 a2 = this;
        if (((ac)b2).C == 0) {
            Joa_2 joa_2 = a2;
            a2.g.J((EC)new nNa((EC)joa_2, joa_2.g.c.J()));
        }
        if (((ac)b2).C == vRa.d) {
            Joa_2 joa_2 = a2;
            a2.g.J((EC)new cna((EC)joa_2, joa_2.g.c.J()));
        }
    }

    private ad J() {
        int n2;
        Joa_2 joa_2 = this;
        int n3 = n2 = joa_2.j.size();
        while (n3 > 0) {
            Joa_2 a2 = joa_2.j.get(n2 - vRa.d);
            if ((a2 instanceof F || a2 instanceof ad) && (a2 = (ad)a2).f()) {
                ad ad2;
                if (a2 instanceof eF && (ad2 = ((eF)((Object)a2)).J()) != null) {
                    return ad2;
                }
                return a2;
            }
            n3 = --n2;
        }
        return null;
    }

    public static /* synthetic */ void f(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        Joa_2.J((int)(a2 + ITa.E), (int)(b2 + Yqa.i), (int)(a2 + RQa.b), (int)(b2 + RQa.b), (int)pua.o);
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, int n2, int n3) {
        float d22 = f2;
        Joa_2 c2 = this;
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        nLa.C();
        Iterator<E> iterator = d22 = c2.j.iterator();
        while (iterator.hasNext()) {
            void a2;
            void b2;
            E e2 = d22.next();
            iterator = d22;
            e2.J((int)b2, (int)a2);
        }
        Joa_2 joa_2 = c2;
        joa_2.g.J().J(G);
        int d22 = joa_2.e;
        int n4 = joa_2.v;
        Joa_2 joa_22 = c2;
        joa_2.f(d22, n4, uSa.E, uSa.E, (int)joa_22.j, joa_22.F);
        cI.J((Runnable)Doa.J(d22, n4));
        Joa_2.J(d22 + cPa.Q, n4 + jRa.X, Fsa.d, (float)(d22 + cPa.Q) - c2.J, (float)(n4 + jRa.X - vpa.o) - c2.A, (Gl)c2.g.c);
        cI.J();
    }

    public void J(int n2, int n3) {
        int c2 = n3;
        Joa_2 a2 = this;
        a2.L.J(oha.J(Upa.q, new Object[uSa.E]), Bra.C, ERa.C, tpa.i);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3, float f2) {
        void a2;
        void c2;
        Joa_2 b2;
        int d2 = n3;
        Joa_2 joa_2 = b2 = this;
        void v1 = c2;
        super.J((int)v1, d2, (float)a2);
        joa_2.J = (float)v1;
        joa_2.A = d2;
    }

    /*
     * WARNING - void declaration
     */
    public void f(int n2, int n3, int n4) {
        void a2;
        void b2;
        void c2;
        Joa_2 joa_2;
        Joa_2 joa_22 = joa_2 = this;
        super.f((int)c2, (int)b2, (int)a2);
        Joa_2 d2 = joa_22.J();
        if (d2 == null) {
            return;
        }
        ((F)d2).J((int)c2, (int)b2, (int)a2, uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public static void J(int n2, int n3, int n4, float f2, float f3, Gl gl2) {
        void c2;
        void b2;
        void f4;
        void d22;
        void e22;
        Gl gl3 = gl2;
        int a2 = n2;
        uKa.a();
        uKa.e();
        uKa.J((float)a2, (float)((float)e22), (float)SPa.b);
        uKa.l((float)((float)(-d22)), (float)((float)d22), (float)((float)d22));
        uKa.J((float)Hra.Ga, (float)JPa.N, (float)JPa.N, (float)pqa.r);
        void v0 = f4;
        float e22 = v0.ba;
        float d22 = v0.X;
        float f5 = v0.d;
        float f6 = v0.ga;
        float f7 = v0.t;
        float f8 = v0.N;
        uKa.J((float)Era.h, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        nLa.f();
        uKa.J((float)opa.z, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)(-((float)Math.atan((double)(b2 / ZRa.l))) * eta.e), (float)pqa.r, (float)JPa.N, (float)JPa.N);
        v0.ba = (float)Math.atan((double)(c2 / ZRa.l)) * eta.e;
        v0.t = (float)Math.atan((double)(c2 / ZRa.l)) * ZRa.l;
        v0.ga = v0.X;
        v0.N = -((float)Math.atan((double)(b2 / ZRa.l))) * eta.e;
        uKa.J((float)JPa.N, (float)JPa.N, (float)JPa.N);
        oLa oLa2 = c2 = Kpa.J().J();
        oLa2.J(Hra.Ga);
        oLa2.l(uSa.E != 0);
        oLa2.J((vL)f4, aSa.V, aSa.V, aSa.V, JPa.N, pqa.r);
        c2.l(vRa.d != 0);
        void v2 = f4;
        void v3 = f4;
        f4.ba = e22;
        v3.X = d22;
        v3.d = f5;
        v2.ga = f6;
        v2.t = f7;
        v2.N = f8;
        uKa.D();
        nLa.C();
        uKa.E();
        uKa.i((int)nka.P);
        uKa.z();
        uKa.i((int)nka.v);
    }
}

