/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ay
 *  Jy
 *  vRa
 */
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class Qy
extends Ay {
    private float A;
    private Jy I;

    /*
     * WARNING - void declaration
     */
    public XF J(int n2, int n3, int n4, List<Jy> list, Random random) {
        void b2;
        int f2 = n4;
        Qy c2 = this;
        if (b2.contains(c2.I)) {
            void d2;
            void a2;
            void e2;
            return new XF((int)(e2 - f2 + a2.nextInt(f2 * uqa.g + vRa.d)), uSa.E, (int)(d2 - f2 + a2.nextInt(f2 * uqa.g + vRa.d)));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public float[] J(float[] fArray, int n2, int n3, int n4, int n5) {
        void a2;
        void b2;
        Object f2 = fArray;
        Qy e2 = this;
        if (f2 == null || ((Qy)f2).length < b2 * a2) {
            f2 = new float[b2 * a2];
        }
        Object object = f2;
        Arrays.fill((float[])object, uSa.E, (int)(b2 * a2), e2.A);
        return object;
    }

    /*
     * WARNING - void declaration
     */
    public Jy[] J(Jy[] jyArray, int n2, int n3, int n4, int n5) {
        void a2;
        void b2;
        Object[] f2 = jyArray;
        Object[] e2 = this;
        if (f2 == null || f2.length < b2 * a2) {
            f2 = new Jy[b2 * a2];
        }
        Arrays.fill(f2, uSa.E, (int)(b2 * a2), e2.I);
        return f2;
    }

    public Jy J(XF xF) {
        Object b2 = xF;
        Qy a2 = this;
        return a2.I;
    }

    public boolean J(int n2, int n3, int n4, List<Jy> list) {
        List<Jy> e2;
        Qy qy2 = list2;
        List<Jy> list2 = list;
        Qy a2 = qy2;
        return e2.contains(a2.I);
    }

    /*
     * WARNING - void declaration
     */
    public Jy[] J(Jy[] jyArray, int n2, int n3, int n4, int n5, boolean bl) {
        void g2;
        void c2;
        void d2;
        void e2;
        void f2;
        int n6 = n5;
        Qy b2 = this;
        return b2.J((Jy[])f2, (int)e2, (int)d2, (int)c2, (int)g2);
    }

    /*
     * WARNING - void declaration
     */
    public Qy(Jy jy, float f2) {
        void b2;
        Qy a2;
        float c2 = f2;
        Qy qy2 = a2 = this;
        qy2.I = b2;
        qy2.A = c2;
    }

    /*
     * WARNING - void declaration
     */
    public Jy[] f(Jy[] jyArray, int n2, int n3, int n4, int n5) {
        void a2;
        void b2;
        Object[] f2 = jyArray;
        Object[] e2 = this;
        if (f2 == null || f2.length < b2 * a2) {
            f2 = new Jy[b2 * a2];
        }
        Arrays.fill(f2, uSa.E, (int)(b2 * a2), e2.I);
        return f2;
    }
}

