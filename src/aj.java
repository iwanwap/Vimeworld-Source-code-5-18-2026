/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DH
 *  DQa
 *  EG
 *  Fpa
 *  GG
 *  JI
 *  JPa
 *  JQa
 *  Ji
 *  LG
 *  LI
 *  NQa
 *  Nh
 *  OI
 *  Oz
 *  PTa
 *  QG
 *  QI
 *  Qi
 *  RH
 *  TH
 *  Tpa
 *  VH
 *  Wg
 *  Yh
 *  Yra
 *  bH
 *  bi
 *  bqa
 *  dH
 *  dj
 *  fi
 *  fpa
 *  gH
 *  hH
 *  jG
 *  kG
 *  kH
 *  li
 *  mh
 *  pua
 *  rH
 *  sh
 *  uh
 *  vL
 *  vRa
 *  xI
 *  yI
 *  yg
 *  zi
 */
import java.util.Random;

public final class aj
extends LI {
    private qI A;
    public static final aj I = new aj();

    public static /* synthetic */ float I(b[] a2) {
        return a2[uSa.E].J() % a2[vRa.d].J();
    }

    public static /* synthetic */ float j(b[] a2) {
        return Oz.J((float)a2[vRa.d].J(), (float)a2[uSa.E].J(), (float)a2[uqa.g].J());
    }

    public static /* synthetic */ b g(b[] a2) {
        return li.J((b[])a2);
    }

    public static /* synthetic */ b e(aj a2) {
        return ZH.J(a2);
    }

    public static /* synthetic */ float F(b[] bArray) {
        int n2;
        b[] bArray2 = bArray;
        float a2 = bArray2[uSa.E].J();
        int n3 = n2 = vRa.d;
        while (n3 < bArray2.length) {
            b b2 = bArray2[n2];
            a2 = Math.min(a2, b2.J());
            n3 = ++n2;
        }
        return a2;
    }

    public static /* synthetic */ float J() {
        return (float)((double)(OT.e % Fpa.ga) / Tpa.M);
    }

    public static /* synthetic */ b I(b[] a2) {
        return QI.J((b[])a2);
    }

    public static /* synthetic */ float k(b[] a2) {
        return Oz.d((float)a2[uSa.E].J());
    }

    public static /* synthetic */ b d(aj a2) {
        return OI.J((aj)a2);
    }

    public static /* synthetic */ b j(b[] a2) {
        return GG.J((b[])a2);
    }

    public static /* synthetic */ b F(b[] a2) {
        Random random = qI.k;
        random.getClass();
        return bH.J((Random)random);
    }

    public static /* synthetic */ float e(aj aj2) {
        aj a2;
        aj aj3 = aj2;
        if (aj3.A.e.E instanceof Ji && (a2 = ((Ji)aj3.A.e.E).J()) != null) {
            return ((vL)a2).X;
        }
        return JPa.N;
    }

    public static /* synthetic */ b k(b[] a2) {
        return Nh.J((b[])a2);
    }

    public static /* synthetic */ float d(aj a2) {
        return a2.A.A;
    }

    public static /* synthetic */ b G(b[] a2) {
        return zi.J((b[])a2);
    }

    public static /* synthetic */ b D(b[] a2) {
        return ti.J(a2);
    }

    public static /* synthetic */ b A(b[] a2) {
        return kG.J((b[])a2);
    }

    public static /* synthetic */ float G(b[] bArray) {
        int n2;
        b[] bArray2 = bArray;
        float a2 = bArray2[uSa.E].J();
        int n3 = n2 = vRa.d;
        while (n3 < bArray2.length) {
            b b2 = bArray2[n2];
            a2 = Math.max(a2, b2.J());
            n3 = ++n2;
        }
        return a2;
    }

    public static /* synthetic */ float D(b[] a2) {
        return Oz.J((float)a2[uSa.E].J());
    }

    public static /* synthetic */ b i(b[] a2) {
        return mh.J((b[])a2);
    }

    public static /* synthetic */ b M(b[] a2) {
        return LG.J((b[])a2);
    }

    public static /* synthetic */ b C(aj a2) {
        return RH.J((aj)a2);
    }

    public static /* synthetic */ b l(aj a2) {
        return dG.J(a2);
    }

    public static /* synthetic */ float A(b[] a2) {
        return (float)Math.atan(a2[uSa.E].J());
    }

    public static /* synthetic */ b e(b[] a2) {
        return DH.J((b[])a2);
    }

    public static /* synthetic */ b f(aj a2) {
        return hH.J((aj)a2);
    }

    public static /* synthetic */ b d(b[] a2) {
        return dj.J((b[])a2);
    }

    public static /* synthetic */ b f() {
        return Li.J();
    }

    private aj() {
        aj a2;
        aj aj2 = a2;
        aj aj3 = a2;
        aj2.J(IPa.Fa, qg.J(aj3));
        aj3.J(NQa.Z, xI.J((aj)a2));
        aj2.J(DQa.F, Qi.J());
        aj2.J(tSa.v, Yh.J((aj)a2));
        aj2.J(vsa.G, bi.J());
        aj2.f(Fua.R, QG.J());
        aj2.f(kua.A, EG.J());
        aj2.f(JQa.D, VH.J());
        aj2.f(BQa.C, sh.J());
        aj2.f(Yra.l, rH.J());
        aj2.f(ypa.r, Wi.J());
        aj2.f(nqa.U, TH.J());
        aj2.f(Tqa.v, sH.J());
        aj2.f(PTa.R, Wg.J());
        aj2.f(Bua.r, yg.J());
        aj2.f(fpa.s, gH.J());
        aj2.f(PQa.S, wg.J());
        aj2.f(XOa.J, kH.J());
        aj2.f(fqa.la, Og.J());
        aj2.f(bqa.W, dH.J());
        aj2.J(Xpa.g, jG.J((aj)a2));
        aj2.J(KPa.m, Ci.J(a2));
        aj2.J(JPa.Ia, yI.J((aj)a2));
    }

    public static /* synthetic */ float C(aj aj2) {
        aj a2;
        aj aj3 = aj2;
        if (aj3.A.e.E instanceof Ji && (a2 = ((Ji)aj3.A.e.E).J()) != null) {
            return ((vL)a2).d;
        }
        return JPa.N;
    }

    public static /* synthetic */ b C(b[] a2) {
        return JI.J((b[])a2);
    }

    /*
     * WARNING - void declaration
     */
    private static float J(float f2, float f3, float f4) {
        void b2;
        float a2;
        float c2 = f4;
        float f5 = a2 = f2;
        return f5 + (b2 - f5) * c2;
    }

    public static /* synthetic */ float i(b[] a2) {
        return (float)Math.atan2(a2[uSa.E].J(), a2[vRa.d].J());
    }

    public static /* synthetic */ float M(b[] a2) {
        return aj.J(a2[uSa.E].J(), a2[vRa.d].J(), a2[uqa.g].J());
    }

    public static /* synthetic */ float e(b[] a2) {
        return Oz.f((float)a2[uSa.E].J());
    }

    public static /* synthetic */ float d(b[] a2) {
        return Math.abs(a2[uSa.E].J());
    }

    public static /* synthetic */ float l(aj a2) {
        return (float)((double)(OT.e - a2.A.G) / Tpa.M);
    }

    public static /* synthetic */ float f(aj aj2) {
        aj a2;
        aj aj3 = aj2;
        if (aj3.A.e.E instanceof Ji && (a2 = ((Ji)aj3.A.e.E).J()) != null) {
            return a2.e();
        }
        return JPa.N;
    }

    public static /* synthetic */ b l(b[] a2) {
        return uI.J(a2);
    }

    public static /* synthetic */ float C(b[] a2) {
        return Oz.C((float)a2[uSa.E].J());
    }

    public static /* synthetic */ b J(aj a2) {
        return uh.J((aj)a2);
    }

    public static /* synthetic */ b f(b[] a2) {
        return Mh.J(a2);
    }

    public static /* synthetic */ b J() {
        return new fi(pua.j);
    }

    public static /* synthetic */ float J(aj a2) {
        return a2.A.e.h;
    }

    public static /* synthetic */ float l(b[] a2) {
        return (float)Math.pow(a2[uSa.E].J(), a2[vRa.d].J());
    }

    public static /* synthetic */ float f(b[] a2) {
        return Oz.J((float)a2[uSa.E].J());
    }

    /*
     * WARNING - void declaration
     */
    public float J(b b2, qI qI2) {
        void b3;
        Object c2 = qI2;
        aj a2 = this;
        a2.A = c2;
        return b3.J();
    }
}

