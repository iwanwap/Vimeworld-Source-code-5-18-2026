/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  GH
 *  Gg
 *  IG
 *  JPa
 *  Ji
 *  KH
 *  Kpa
 *  MQa
 *  NQa
 *  UG
 *  aLa
 *  pqa
 *  qh
 *  sI
 *  ui
 *  vRa
 *  yQa
 */
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class qI {
    public float W;
    public float q;
    public long x;
    public float v;
    public boolean o;
    public float h;
    private final int K;
    public boolean H;
    public float c;
    public int B;
    public float d;
    public UG a;
    private static final zz b;
    public boolean l;
    public final sI e;
    public long G;
    public int D;
    public int f;
    public float F;
    public PG g;
    public float L;
    public float E;
    public float m;
    public float C;
    public float i;
    private static int M;
    public static final Random k;
    public float j;
    public float J;
    public final int A;
    public float I;

    public void f(Gg gg2) {
        qI a2;
        qI b2 = gg2;
        qI qI2 = a2 = this;
        a2.C -= qI2.h;
        if (qI2.J != JPa.N) {
            qI qI3 = a2;
            qI3.c *= a2.J;
            qI qI4 = a2;
            qI3.C *= qI4.J;
            qI4.I *= a2.J;
        }
        qI qI5 = a2;
        qI5.m = qI5.W;
        qI5.q = qI5.E;
        qI5.d = qI5.i;
        qI5.W += a2.c;
        qI5.E += a2.C;
        qI5.i += a2.I;
        if (qI5.o) {
            a2.J((Gg)b2);
        }
    }

    private void J(Gg gg2) {
        qI b2 = gg2;
        qI a2 = this;
        int n2 = b2 = b2.J(b.func_181079_c((int)a2.W, (int)a2.E, (int)a2.i), uSa.E);
        a2.D = n2 >> ERa.C & yQa.j;
        a2.f = n2 & yQa.j;
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, float f3, float f4) {
        void b2;
        void c2;
        float d2 = f4;
        qI a2 = this;
        a2.L = qI.J((float)(c2 - a2.W)) + qI.J((float)(b2 - a2.E)) + qI.J(d2 - a2.i);
    }

    private static float J(float f2, float f3) {
        float b2 = f3;
        float a2 = f2;
        if (b2 == JPa.N) {
            return a2;
        }
        return a2 - b2 * MQa.L + k.nextFloat() * b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(IG iG, long l2, float f2, float f3, float f4, float f5) {
        void f6;
        float f7;
        float a2;
        float b2;
        float c2;
        float d2;
        qI qI2 = this;
        if (!qI2.a.f()) {
            return;
        }
        qI qI3 = qI2;
        float g = qI3.j;
        int n2 = qI3.B;
        int n3 = n2 >> osa.c & osa.Ja;
        int n4 = n2 >> ERa.C & osa.Ja;
        int n5 = n2 >> Yqa.i & osa.Ja;
        n2 &= osa.Ja;
        qI qI4 = qI2;
        c2 = qI3.m + (qI4.W - qI4.m) * d2 - c2;
        qI qI5 = qI2;
        b2 = qI3.q + (qI5.E - qI5.q) * d2 - b2;
        qI qI6 = qI2;
        d2 = qI3.d + (qI6.i - qI6.d) * d2 - a2;
        a2 = aLa.C();
        float f8 = aLa.l();
        float f9 = aLa.J();
        float f10 = aLa.d();
        float f11 = aLa.f();
        ui ui2 = qI3.a.J(qI2.g);
        if (qI3.l) {
            ui ui3 = ui2;
            f7 = ui3.k;
            ui3.k = ui3.A;
            ui3.A = f7;
        }
        if (qI2.H) {
            ui ui4 = ui2;
            f7 = ui4.J;
            ui4.J = ui4.j;
            ui4.j = f7;
        }
        if (qI2.F > JPa.N) {
            void e2;
            n3 = Math.min(n3, (int)((float)(e2 - qI2.G) / qI2.F));
            n3 = Math.min(n3, (int)((float)(qI2.x - e2) / qI2.F));
        }
        void v6 = f6;
        float f12 = c2;
        void v8 = f6;
        f6.J(ui2.I);
        qI qI7 = qI2;
        v8.J((double)(c2 - (a2 + f10) * g), (double)(b2 - f8 * g), (double)(d2 - (f9 + f11) * g)).J((double)ui2.k, (double)ui2.J).J(n4, n5, n2, n3).J(qI7.D, qI7.f).M();
        qI qI8 = qI2;
        v8.J((double)(c2 - (a2 - f10) * g), (double)(b2 + f8 * g), (double)(d2 - (f9 - f11) * g)).J((double)ui2.k, (double)ui2.j).J(n4, n5, n2, n3).J(qI8.D, qI8.f).M();
        qI qI9 = qI2;
        v6.J((double)(f12 + (a2 + f10) * g), (double)(b2 + f8 * g), (double)(d2 + (f9 + f11) * g)).J((double)ui2.A, (double)ui2.j).J(n4, n5, n2, n3).J(qI9.D, qI9.f).M();
        qI qI10 = qI2;
        v6.J((double)(f12 + (a2 - f10) * g), (double)(b2 - f8 * g), (double)(d2 + (f9 - f11) * g)).J((double)ui2.A, (double)ui2.J).J(n4, n5, n2, n3).J(qI10.D, qI10.f).M();
    }

    public qI(sI sI2, int n2) {
        qI qI2;
        int a22;
        qI b2;
        qI c2 = sI2;
        qI qI3 = b2 = this;
        int n3 = M;
        M = n3 + vRa.d;
        b2.K = n3;
        b2.A = a22;
        qI3.e = c2;
        qI3.m = qI3.W = qI.J(((sI)c2).x, ((sI)c2).o);
        qI qI4 = b2;
        qI qI5 = c2;
        qI4.q = qI4.E = qI.J(((sI)qI5).A, ((sI)qI5).k);
        qI qI6 = b2;
        qI qI7 = c2;
        qI6.d = qI6.i = qI.J(((sI)qI7).a, ((sI)qI7).P);
        qI qI8 = b2;
        qI qI9 = b2;
        qI qI10 = c2;
        qI qI11 = b2;
        qI qI12 = c2;
        b2.c = qI.J(((sI)c2).M, ((sI)qI12).u);
        qI11.C = qI.J(((sI)qI12).g, ((sI)c2).m);
        qI11.I = qI.J(((sI)c2).C, ((sI)c2).i);
        qI9.j = qI.J(((sI)qI10).t, ((sI)c2).j) * Nra.e;
        qI qI13 = c2;
        qI9.J = pqa.r - qI.J(((sI)qI13).W, ((sI)qI13).J);
        qI qI14 = c2;
        qI9.h = qI.J(((sI)qI10).w, ((sI)qI14).T);
        qI8.F = (float)((sI)qI14).K / NQa.Y;
        qI8.D = qI8.f = ((sI)c2).d << AQa.P;
        qI qI15 = b2;
        qI qI16 = c2;
        b2.o = ((sI)c2).e;
        b2.B = ((sI)qI16).Q;
        qI15.v = ((sI)qI16).n * ((sI)c2).n;
        qI15.l = ((sI)c2).G && k.nextBoolean() ? vRa.d : uSa.E;
        b2.H = ((sI)c2).H && k.nextBoolean() ? vRa.d : uSa.E;
        qI qI17 = c2;
        a22 = qI.J(((sI)c2).b, ((sI)qI17).f);
        if (((sI)qI17).F != null) {
            a22 += (int)aj.I.J(((sI)c2).F, b2);
        }
        b2.G = OT.e + (long)a22;
        qI qI18 = c2;
        b2.x = b2.G + (long)qI.J(((sI)qI18).D, ((sI)qI18).c);
        if (((sI)c2).N != null) {
            qI2 = b2;
            b2.a = ((sI)c2).N;
        } else {
            qh a22 = new qh(((sI)c2).l);
            new qh(((sI)c2).l).C = ((sI)c2).s;
            qI qI19 = b2;
            qI2 = qI19;
            qI19.a = OT.i.g.J(a22, GH.J((qI)qI19));
        }
        qI2.g = new PG(b2.G);
        qI qI20 = c2;
        b2.g.j = qI.J(((sI)qI20).p, ((sI)qI20).R);
    }

    public static float J(float a2) {
        float f2 = a2;
        return f2 * f2;
    }

    public void J() {
        qI qI2 = this;
        if (qI2.e.I != null) {
            qI2.W += aj.I.J(qI2.e.I, qI2);
        }
        if (qI2.e.L != null) {
            qI2.E += aj.I.J(qI2.e.L, qI2);
        }
        if (qI2.e.v != null) {
            qI2.i += aj.I.J(qI2.e.v, qI2);
        }
        if (qI2.e.q != null) {
            qI2.c += aj.I.J(qI2.e.q, qI2);
        }
        if (qI2.e.O != null) {
            qI2.C += aj.I.J(qI2.e.O, qI2);
        }
        if (qI2.e.B != null) {
            qI2.I += aj.I.J(qI2.e.B, qI2);
        }
        if (qI2.e.E instanceof Ji) {
            qI a2 = ((Ji)qI2.e.E).J();
            if (a2 == null) {
                qI2.x = nqa.i;
                return;
            }
            qI qI3 = qI2;
            qI qI4 = a2;
            qI2.W = (float)((KH)a2).j + qI2.W;
            qI3.E = (float)((KH)qI4).J + qI2.E;
            qI3.i = (float)((KH)qI4).k + qI2.i;
        }
        if (qI2.o) {
            qI2.J((Gg)Kpa.J().Ta);
        }
        qI qI5 = qI2;
        qI5.m = qI5.W;
        qI5.q = qI5.E;
        qI5.d = qI5.i;
    }

    static {
        k = new Random();
        b = new zz();
    }

    public boolean J() {
        qI a2;
        qI qI2 = a2;
        if (qI2.L < qI2.v) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean equals(Object object) {
        Object b2 = object;
        Object a2 = this;
        if (b2 == a2) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int hashCode() {
        qI a2;
        return a2.K;
    }

    public static /* synthetic */ String J(qI a2) {
        return new StringBuilder().insert(5 >> 3, Bua.c).append((int)a2.W).append(TOa.n).append((int)a2.E).append(TOa.n).append((int)a2.i).toString();
    }

    private static int J(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        if (b2 == 0) {
            return a2;
        }
        return a2 - b2 / uqa.g + (int)(k.nextFloat() * (float)b2);
    }
}

