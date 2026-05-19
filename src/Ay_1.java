/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ay
 *  Dha
 *  ERa
 *  Gg
 *  JSa
 *  Jy
 *  Lqa
 *  MZ
 *  My
 *  RIa
 *  Ypa
 *  Yra
 *  asa
 *  hw
 *  pqa
 *  vRa
 *  vpa
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class Ay_1 {
    private List<Jy> k;
    private String j;
    private hw J;
    private My A;
    private hw I;

    public List<Jy> J() {
        Ay_1 a2;
        return a2.k;
    }

    public Jy J(XF xF2) {
        Object b2 = xF2;
        Ay_1 a2 = this;
        return a2.J((XF)((Object)b2), null);
    }

    /*
     * WARNING - void declaration
     */
    public Jy[] f(Jy[] jyArray, int n2, int n3, int n4, int n5) {
        void c2;
        void d2;
        void a2;
        void b2;
        Jy[] e2;
        Ay_1 ay_1 = this;
        iW.J();
        if (e2 == null || e2.length < b2 * a2) {
            e2 = new Jy[b2 * a2];
        }
        Object object = ay_1.I.J((int)d2, (int)c2, (int)b2, (int)a2);
        try {
            int f22;
            int n6 = f22 = uSa.E;
            while (n6 < b2 * a2) {
                int n7 = f22++;
                e2[n7] = Jy.J((int)object[n7], (Jy)Jy.f);
                n6 = f22;
            }
        }
        catch (Throwable f22) {
            RIa rIa2 = RIa.J((Throwable)f22, (String)dqa.z);
            object = rIa2;
            Dha f22 = rIa2.J(vpa.Aa);
            f22.J(vqa.z, (Object)e2.length);
            Dha dha = f22;
            dha.J(rRa.X, (Object)((int)d2));
            dha.J(oua.v, (Object)((int)c2));
            dha.J(Zqa.q, (Object)((int)b2));
            dha.J(opa.h, (Object)((int)a2));
            throw new MZ((RIa)object);
        }
        return e2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean J(int n2, int n3, int n4, List<Jy> list) {
        void a2;
        RIa rIa2;
        void c2;
        void b2;
        void d2;
        Ay_1 ay_1 = this;
        iW.J();
        void var5_8 = d2 - b2 >> uqa.g;
        int e22 = c2 - b2 >> uqa.g;
        void var7_10 = d2 + b2 >> uqa.g;
        void var8_11 = c2 + b2 >> uqa.g;
        var7_10 = var7_10 - var5_8 + vRa.d;
        var8_11 = var8_11 - e22 + vRa.d;
        int[] nArray = ay_1.I.J((int)var5_8, e22, (int)var7_10, (int)var8_11);
        try {
            int n5 = e22 = uSa.E;
            while (n5 < var7_10 * var8_11) {
                rIa2 = Jy.l((int)nArray[e22]);
                if (!a2.contains(rIa2)) {
                    return uSa.E != 0;
                }
                n5 = ++e22;
            }
            return vRa.d != 0;
        }
        catch (Throwable e22) {
            rIa2 = RIa.J((Throwable)e22, (String)dqa.z);
            Dha dha = rIa2.J(rta.g);
            dha.J(rta.g, (Object)ay_1.I.toString());
            dha.J(rRa.X, (Object)((int)d2));
            dha.J(oua.v, (Object)((int)c2));
            dha.J(JSa.w, (Object)((int)b2));
            dha.J(Yra.T, (Object)a2);
            throw new MZ(rIa2);
        }
    }

    public Ay_1(Gg gg2) {
        Ay_1 b2 = gg2;
        Ay_1 a2 = this;
        a2(b2.J(), b2.J().J(), b2.J().J());
    }

    public float J(float f2, int n2) {
        float c2 = f2;
        Ay_1 b2 = this;
        return c2;
    }

    /*
     * WARNING - void declaration
     */
    public Jy[] J(Jy[] jyArray, int n2, int n3, int n4, int n5, boolean bl) {
        void d2;
        int e2;
        void a22;
        void g2;
        void c2;
        Jy[] f2;
        int n6 = n5;
        Ay_1 b2 = this;
        iW.J();
        if (f2 == null || f2.length < c2 * g2) {
            f2 = new Jy[c2 * g2];
        }
        if (a22 != false && c2 == ERa.C && g2 == ERa.C && (e2 & Ypa.A) == 0 && (d2 & Ypa.A) == 0) {
            Jy[] a22 = b2.A.J(e2, (int)d2);
            System.arraycopy(a22, uSa.E, f2, uSa.E, (int)(c2 * g2));
            return f2;
        }
        int[] a22 = b2.J.J(e2, (int)d2, (int)c2, (int)g2);
        int n7 = e2 = uSa.E;
        while (n7 < c2 * g2) {
            int n8 = e2++;
            f2[n8] = Jy.J((int)a22[n8], (Jy)Jy.f);
            n7 = e2;
        }
        return f2;
    }

    /*
     * WARNING - void declaration
     */
    public Jy J(XF xF2, Jy jy2) {
        void a2;
        Object c2 = xF2;
        Ay_1 b2 = this;
        return b2.A.J(c2.getX(), c2.getZ(), (Jy)a2);
    }

    /*
     * WARNING - void declaration
     */
    public float[] J(float[] fArray, int n2, int n3, int n4, int n5) {
        int n6;
        void c2;
        void d2;
        void a2;
        void b2;
        float[] e2;
        Ay_1 ay_1 = this;
        iW.J();
        if (e2 == null || e2.length < b2 * a2) {
            e2 = new float[b2 * a2];
        }
        int[] nArray = ay_1.J.J((int)d2, (int)c2, (int)b2, (int)a2);
        int n7 = n6 = uSa.E;
        while (n7 < b2 * a2) {
            try {
                float f2;
                float f32 = (float)Jy.J((int)nArray[n6], (Jy)Jy.f).J() / asa.o;
                if (f2 > pqa.r) {
                    f32 = pqa.r;
                }
                e2[n6] = f32;
            }
            catch (Throwable f32) {
                RIa f32 = RIa.J((Throwable)f32, (String)dqa.z);
                Dha dha = f32.J(ROa.A);
                dha.J(Lqa.i, (Object)n6);
                dha.J(FRa.U, (Object)e2.length);
                Dha dha2 = dha;
                dha2.J(rRa.X, (Object)((int)d2));
                dha2.J(oua.v, (Object)((int)c2));
                dha2.J(Zqa.q, (Object)((int)b2));
                dha2.J(opa.h, (Object)((int)a2));
                throw new MZ(f32);
            }
            n7 = ++n6;
        }
        return e2;
    }

    /*
     * WARNING - void declaration
     */
    public Jy[] J(Jy[] jyArray, int n2, int n3, int n4, int n5) {
        void f2;
        void b2;
        void c2;
        void d2;
        void e2;
        int n6 = n5;
        Ay_1 a2 = this;
        return a2.J((Jy[])e2, (int)d2, (int)c2, (int)b2, (int)f2, vRa.d != 0);
    }

    public Ay_1() {
        Ay_1 a2;
        Ay_1 ay_1 = a2;
        Ay_1 ay_12 = a2;
        ay_1.A = new My((Ay)a2);
        ay_12.j = Mqa.y;
        ay_1.k = Lists.newArrayList();
        ay_1.k.add(Jy.Y);
        a2.k.add(Jy.Z);
        a2.k.add(Jy.I);
        a2.k.add(Jy.l);
        a2.k.add(Jy.fa);
        a2.k.add(Jy.Fa);
        a2.k.add(Jy.y);
    }

    /*
     * WARNING - void declaration
     */
    public Ay_1(long l2, Fy fy2, String string) {
        void c2;
        void a2;
        Ay_1 b2;
        hw[] d2 = fy2;
        Ay_1 ay_1 = b2 = this;
        b2();
        ay_1.j = a2;
        d2 = hw.J((long)c2, (Fy)d2, (String)a2);
        ay_1.I = d2[uSa.E];
        ay_1.J = d2[vRa.d];
    }

    public void J() {
        Ay_1 a2;
        a2.A.J();
    }

    /*
     * WARNING - void declaration
     */
    public XF J(int n2, int n3, int n4, List<Jy> list, Random random) {
        int n5;
        void d2;
        void c22;
        int f2 = n2;
        Ay_1 e2 = this;
        iW.J();
        int n6 = f2 - c22 >> uqa.g;
        void var7_10 = d2 - c22 >> uqa.g;
        f2 = f2 + c22 >> uqa.g;
        d2 = d2 + c22 >> uqa.g;
        f2 = f2 - n6 + vRa.d;
        d2 = d2 - var7_10 + vRa.d;
        int[] c22 = e2.I.J(n6, (int)var7_10, f2, (int)d2);
        XF xF2 = null;
        int n7 = uSa.E;
        int n8 = n5 = uSa.E;
        while (n8 < f2 * d2) {
            void a2;
            void b2;
            int n9 = n6 + n5 % f2 << uqa.g;
            void var12_15 = var7_10 + n5 / f2 << uqa.g;
            Jy jy2 = Jy.l((int)c22[n5]);
            if (b2.contains(jy2) && (xF2 == null || a2.nextInt(n7 + vRa.d) == 0)) {
                ++n7;
                xF2 = new XF(n9, uSa.E, (int)var12_15);
            }
            n8 = ++n5;
        }
        return xF2;
    }
}

