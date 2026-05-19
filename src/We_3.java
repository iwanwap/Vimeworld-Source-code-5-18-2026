/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  JPa
 *  Kd
 *  Kpa
 *  Oz
 *  SOa
 *  ac
 *  if
 *  pqa
 *  vRa
 */
import java.awt.Color;

public class We_3
extends ac {
    private float M;
    private final float k;
    public boolean j;
    private final float A;
    private Fha I;

    /*
     * WARNING - void declaration
     */
    public void f(Kpa kpa2, int n2, int n3) {
        int d22 = n3;
        We_3 a2 = this;
        if (a2.k != false) {
            if (a2.j) {
                void c2;
                void b2;
                We_3 we_3 = a2;
                a2.M = (float)(b2 - (we_3.m + yRa.d)) / (float)(a2.j - kTa.j);
                a2.M = Oz.J((float)we_3.M, (float)JPa.N, (float)pqa.r);
                float d22 = a2.I.denormalizeValue(a2.M);
                c2.z.f(a2.I, d22);
                a2.M = a2.I.normalizeValue(d22);
                a2.i = c2.z.J(a2.I);
            }
            We_3 we_3 = a2;
            int d22 = a2.m + yRa.d + (int)(we_3.M * (float)(we_3.j - kTa.j));
            if.J((double)d22, (double)((double)(a2.I + AQa.P)), (double)SOa.w, (double)SOa.w, (Color)Bc.Ja, (Color)Bc.Ga, (Kd)Kd.XXS);
        }
    }

    public int J(boolean bl) {
        boolean b2 = bl;
        We_3 a2 = this;
        return uSa.E;
    }

    public void J(int n2, int n3) {
        int c2 = n3;
        We_3 a2 = this;
        a2.j = uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Kpa kpa2, int n2, int n3) {
        void a2;
        void c2;
        We_3 b2 = this;
        int d2 = n2;
        if (super.J((Kpa)c2, d2, (int)a2)) {
            void v0 = c2;
            We_3 we_3 = b2;
            We_3 we_32 = b2;
            we_3.M = (float)(d2 - (we_32.m + AQa.P)) / (float)(b2.j - Yqa.i);
            we_3.M = Oz.J((float)we_32.M, (float)JPa.N, (float)pqa.r);
            We_3 we_33 = b2;
            v0.z.f(we_33.I, we_33.I.denormalizeValue(b2.M));
            we_3.i = v0.z.J(b2.I);
            b2.j = vRa.d;
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public We_3(int n2, int n3, int n4, Fha fha2, float f2, float f3) {
        void a2;
        void b2;
        Fha g2;
        void d2;
        void e2;
        void f222;
        We_3 c2;
        We_3 we_3 = fha3;
        Fha fha3 = fha2;
        We_3 we_32 = c2 = we_3;
        We_3 we_33 = c2;
        super((int)f222, (int)e2, (int)d2, Jpa.Ha, kTa.j, Mqa.y);
        c2.M = pqa.r;
        c2.I = g2;
        we_33.k = b2;
        we_32.A = a2;
        Kpa f222 = Kpa.J();
        Fha fha4 = g2;
        we_33.M = fha4.normalizeValue(f222.z.J(fha4));
        we_32.i = f222.z.J(g2);
    }

    /*
     * WARNING - void declaration
     */
    public We_3(int n2, int n3, int n4, Fha fha2) {
        Object e2;
        void b2;
        void c2;
        void d2;
        We_3 we_3 = object;
        Object object = fha2;
        We_3 a2 = we_3;
        a2((int)d2, (int)c2, (int)b2, (Fha)((Object)e2), JPa.N, pqa.r);
    }
}

