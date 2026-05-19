/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FEa
 *  FPa
 *  Gg
 *  LQa
 *  MQa
 *  Mda
 *  NTa
 *  Oz
 *  Rua
 *  Ssa
 *  Vx
 *  Waa
 *  XSa
 *  Ypa
 *  ZOa
 *  Zpa
 *  Zta
 *  aSa
 *  dW
 *  kta
 *  vRa
 *  vz
 *  waa
 *  ysa
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class dW_3
extends Vx {
    public byte C;
    public int i;
    public byte M;
    private Map<Sx, zx> k;
    public byte[] j;
    public List<zx> J;
    public Map<String, vz> A;
    public int I;

    /*
     * WARNING - void declaration
     */
    private void J(int n2, Gg gg2, String string, double d2, double d3, double d4) {
        void var11_19;
        int f2;
        void d5;
        dW_3 dW_32;
        byte b232;
        byte by3;
        block7: {
            dW_3 dW_33;
            block6: {
                int n3;
                float g232;
                float c232;
                block5: {
                    void e232;
                    void a2;
                    void b232;
                    void c232;
                    dW_33 = this;
                    int g232 = vRa.d << dW_33.C;
                    c232 = (float)(c232 - (double)dW_33.I) / (float)g232;
                    g232 = (float)(b232 - (double)dW_33.i) / (float)g232;
                    by3 = (byte)((double)(c232 * kta.v) + kTa.B);
                    b232 = (byte)((double)(g232 * kta.v) + kTa.B);
                    n3 = Ssa.u;
                    if (!(c232 >= (float)(-n3)) || !(g232 >= (float)(-n3)) || !(c232 <= (float)n3) || !(g232 <= (float)n3)) break block5;
                    void v0 = a2;
                    a2 = v0 + (v0 < aSa.V ? cTa.Y : Wqa.Z);
                    byte by2 = (byte)(a2 * Zta.ba / ZOa.Ja);
                    if (dW_33.M >= 0) break block6;
                    dW_32 = dW_33;
                    int e232 = (int)(e232.J().f() / MQa.r);
                    byte by4 = (byte)(e232 * e232 * FPa.t + e232 * APa.J >> Ypa.A & Ypa.A);
                    break block7;
                }
                if (Math.abs(c232) >= POa.ga || Math.abs(g232) >= POa.ga) {
                    dW_33.A.remove(d5);
                    return;
                }
                f2 = uua.p;
                int n4 = uSa.E;
                if (c232 <= (float)(-n3)) {
                    by3 = (byte)((double)(n3 * uqa.g) + vqa.c);
                }
                if (g232 <= (float)(-n3)) {
                    b232 = (byte)((double)(n3 * uqa.g) + vqa.c);
                }
                if (c232 >= (float)n3) {
                    by3 = (byte)(n3 * uqa.g + vRa.d);
                }
                if (g232 >= (float)n3) {
                    b232 = (byte)(n3 * uqa.g + vRa.d);
                }
            }
            dW_32 = dW_33;
        }
        dW_32.A.put((String)d5, new vz((byte)f2, by3, b232, (byte)var11_19));
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        dW_3 dW_32;
        dW_3 dW_33 = dW_32 = this;
        super.J();
        Iterator<zx> c2 = dW_33.J.iterator();
        Object object = c2;
        while (object.hasNext()) {
            void a2;
            void b2;
            ((zx)c2.next()).J((int)b2, (int)a2);
            object = c2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(Sx sx2, Mda mda2) {
        Object c22;
        int n2;
        Waa a2;
        void b2;
        dW_3 dW_32 = this;
        if (!dW_32.k.containsKey(b2)) {
            zx zx2 = new zx((dW)dW_32, (Sx)b2);
            dW_32.k.put((Sx)b2, zx2);
            dW_32.J.add(zx2);
        }
        if (!b2.K.J((Mda)a2)) {
            dW_32.A.remove(b2.J());
        }
        int n3 = n2 = uSa.E;
        while (n3 < dW_32.J.size()) {
            c22 = dW_32.J.get(n2);
            if (!((zx)c22).i.J && (((zx)c22).i.K.J((Mda)a2) || a2.f())) {
                if (!a2.f() && ((zx)c22).i.Ha == dW_32.M) {
                    dW_32.J(uSa.E, (Gg)((zx)c22).i.j, ((zx)c22).i.J(), ((zx)c22).i.la, ((zx)c22).i.A, ((zx)c22).i.X);
                }
            } else {
                dW_32.k.remove((Object)((zx)c22).i);
                dW_32.J.remove(c22);
            }
            n3 = ++n2;
        }
        if (a2.f()) {
            FEa fEa2 = a2.J();
            c22 = fEa2.f();
            dW_32.J(vRa.d, (Gg)b2.j, new StringBuilder().insert(3 ^ 3, Ora.u).append(fEa2.M()).toString(), c22.getX(), c22.getZ(), fEa2.j.getHorizontalIndex() * Jsa.ha);
        }
        if (a2.M() && a2.J().J(xua.m, WOa.fa)) {
            int c22;
            waa waa2 = a2.J().J(xua.m, NTa.C);
            int n4 = c22 = uSa.E;
            while (n4 < waa2.J()) {
                a2 = waa2.J(c22);
                if (!dW_32.A.containsKey(a2.J(QTa.O))) {
                    dW_32.J(a2.J(Zpa.x), (Gg)b2.j, a2.J(QTa.O), a2.J(rRa.X), a2.J(oua.v), a2.J(rRa.w));
                }
                n4 = ++c22;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public zx J(Sx sx2) {
        void a2;
        dW_3 dW_32 = this;
        Object b2 = dW_32.k.get(a2);
        if (b2 == null) {
            b2 = new zx((dW)dW_32, (Sx)a2);
            dW_32.k.put((Sx)a2, (zx)b2);
            dW_32.J.add((zx)b2);
        }
        return b2;
    }

    public void J(Waa waa2) {
        int n2;
        Object b2 = waa2;
        dW_3 a2 = this;
        dW_3 dW_32 = b2;
        dW_3 dW_33 = a2;
        dW_3 dW_34 = b2;
        a2.M = b2.J(XSa.g);
        a2.I = dW_34.J(LQa.a);
        a2.i = dW_34.J(vqa.X);
        dW_33.C = b2.J(Rua.C);
        dW_33.C = (byte)Oz.f((int)a2.C, (int)uSa.E, (int)AQa.P);
        short s2 = dW_32.J(oQa.R);
        short s3 = dW_32.J(NTa.x);
        if (s2 == XOa.h && s3 == XOa.h) {
            a2.j = b2.J(Qra.ga);
            return;
        }
        b2 = b2.J(Qra.ga);
        a2.j = new byte[qQa.O];
        int n3 = (XOa.h - s2) / uqa.g;
        int n4 = (XOa.h - s3) / uqa.g;
        int n5 = n2 = uSa.E;
        while (n5 < s3) {
            int n6 = n2 + n4;
            if (n6 >= 0 || n6 < XOa.h) {
                int n7 = uSa.E;
                while (n7 < s2) {
                    int n8;
                    int n9 = n8 + n3;
                    if (n9 >= 0 || n9 < XOa.h) {
                        a2.j[n9 + n6 * XOa.h] = (byte)b2[n8 + n2 * s2];
                    }
                    n7 = ++n8;
                }
            }
            n5 = ++n2;
        }
    }

    public dW_3(String string) {
        Object b2 = string;
        dW_3 a2 = this;
        super((String)b2);
        a2.j = new byte[qQa.O];
        a2.J = Lists.newArrayList();
        a2.k = Maps.newHashMap();
        a2.A = Maps.newLinkedHashMap();
    }

    /*
     * WARNING - void declaration
     */
    public void J(double d2, double d3, int n2) {
        void b2;
        void c22;
        int d4;
        int n3 = n2;
        dW_3 a2 = this;
        d4 = XOa.h * (vRa.d << d4);
        int c22 = Oz.f((double)((c22 + ypa.X) / (double)d4));
        dW_3 dW_32 = a2;
        dW_32.I = c22 * d4 + d4 / uqa.g - ysa.s;
        dW_32.i = Oz.f((double)((b2 + ypa.X) / (double)d4)) * d4 + d4 / uqa.g - ysa.s;
    }

    /*
     * WARNING - void declaration
     */
    public KC J(Mda mda2, Gg gg2, Sx sx2) {
        void c2;
        void a2;
        Object d2 = gg2;
        dW_3 b2 = this;
        d2 = b2.k.get(a2);
        if (d2 == null) {
            return null;
        }
        return ((zx)d2).J((Mda)c2);
    }

    public void f(Waa waa2) {
        dW_3 b2 = waa2;
        dW_3 a2 = this;
        dW_3 dW_32 = b2;
        dW_32.J(XSa.g, a2.M);
        dW_32.J(LQa.a, a2.I);
        dW_32.J(vqa.X, a2.i);
        dW_32.J(Rua.C, a2.C);
        dW_32.J(oQa.R, (short)XOa.h);
        dW_32.J(NTa.x, (short)XOa.h);
        dW_32.J(Qra.ga, a2.j);
    }
}

