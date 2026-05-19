/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  Oz
 *  Xd
 *  YSa
 *  Yra
 *  jpa
 *  pqa
 *  pua
 *  vRa
 *  wd
 *  ye
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.vecmath.Vector4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class re_1 {
    private final List<Integer> k;
    private final wd j;
    private static final Vector4f J = new Vector4f();
    private final wd A;
    private final List<Integer> I;

    /*
     * WARNING - void declaration
     */
    public re_1(wd wd2, wd wd3) {
        void b2;
        re_1 a2;
        re_1 c2 = wd3;
        re_1 re_12 = a2 = this;
        re_1 re_13 = a2;
        a2.k = new ArrayList<Integer>();
        re_13.I = new ArrayList<Integer>();
        re_12.j = b2;
        re_12.A = c2;
    }

    public boolean J() {
        re_1 a2;
        if (!a2.k.isEmpty()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public List<Integer> f() {
        re_1 a2;
        return a2.I;
    }

    public List<Integer> J() {
        re_1 a2;
        return a2.k;
    }

    /*
     * WARNING - void declaration
     */
    public void J(ye ye2, Xd xd2, float[] fArray, float[] fArray2) {
        void a2;
        void b2;
        void c2;
        re_1 e22 = ye2;
        re_1 d2 = this;
        re_1 re_12 = e22;
        float e22 = Oz.J((float)((d2.A.d() + jpa.f) / pua.j), (float)JPa.N, (float)pqa.r);
        float f2 = pqa.r - e22;
        re_1 re_13 = d2;
        re_13.J((ye)re_12, (Xd)c2, re_13.k, (float[])b2, (float[])a2, e22);
        re_1 re_14 = d2;
        re_14.J((ye)re_12, (Xd)c2, re_14.I, (float[])b2, (float[])a2, f2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(ye ye2, Xd xd2, List<Integer> list, float[] fArray, float[] fArray2, float f2) {
        Iterator d2;
        re_1 re_12 = this;
        int n2 = uSa.E;
        Iterator iterator = d2 = d2.iterator();
        while (iterator.hasNext()) {
            void b2;
            int n3;
            int g2;
            int n4;
            int n5;
            int n6;
            block4: {
                block5: {
                    int n7;
                    block2: {
                        block3: {
                            void c2;
                            void e2;
                            void a2;
                            void f3;
                            n6 = (Integer)d2.next();
                            void v1 = f3;
                            float f4 = v1.J()[n6 * AQa.P];
                            float f5 = v1.J()[n6 * AQa.P + vRa.d] + a2 * YSa.G / Yra.i - Mqa.N;
                            float f6 = v1.J()[n6 * AQa.P + uqa.g];
                            J.set(f4, f5, f6, pqa.r);
                            e2.k[re_12.j.J()].transform(J);
                            void v2 = c2;
                            int n8 = n6;
                            c2[n6 * AQa.P] = re_1.J.x;
                            c2[n8 * AQa.P + vRa.d] = re_1.J.y;
                            v2[n8 * AQa.P + uqa.g] = re_1.J.z;
                            v2[n6 * AQa.P + yRa.d] = re_1.J.w;
                            int n9 = n6;
                            n5 = n9 - n9 % yRa.d;
                            n7 = n6 - n5;
                            n4 = n2 - n5;
                            g2 = uSa.E;
                            if (n4 < 0) break block2;
                            if ((n7 != 0 || n4 != uqa.g) && (n4 != 0 || n7 != uqa.g)) break block3;
                            n3 = g2 = vRa.d;
                            break block4;
                        }
                        if ((n7 != 0 || n4 != vRa.d) && (n4 != 0 || n7 != vRa.d)) break block5;
                        n3 = g2 = uqa.g;
                        break block4;
                    }
                    g2 = n7 == vRa.d ? uSa.E : vRa.d;
                }
                n3 = g2;
            }
            g2 = n3 + n5;
            int n10 = n6;
            void v7 = b2;
            v7[n10 * yRa.d] = v7[g2 * yRa.d];
            void v8 = b2;
            v8[n10 * yRa.d + vRa.d] = v8[g2 * yRa.d + vRa.d];
            void v9 = b2;
            v9[n10 * yRa.d + uqa.g] = v9[g2 * yRa.d + uqa.g];
            if (n4 >= 0) {
                int n11 = n2;
                void v11 = b2;
                v11[n11 * yRa.d] = v11[g2 * yRa.d];
                void v12 = b2;
                v12[n11 * yRa.d + vRa.d] = v12[g2 * yRa.d + vRa.d];
                void v13 = b2;
                v13[n11 * yRa.d + uqa.g] = v13[g2 * yRa.d + uqa.g];
            }
            n2 = n6;
            iterator = d2;
        }
    }

    public wd J() {
        re_1 a2;
        return a2.j;
    }
}

