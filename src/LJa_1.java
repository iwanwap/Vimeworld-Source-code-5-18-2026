/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CLa
 *  Cra
 *  ERa
 *  JPa
 *  MQa
 *  NQa
 *  Oz
 *  Rja
 *  XSa
 *  Yka
 *  Yra
 *  ala
 *  hC
 *  hJa
 *  isa
 *  pqa
 *  psa
 *  pua
 *  uja
 *  vRa
 */
import optifine.Config;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class LJa_1 {
    private static final String J = "CL_00002490";
    private static final float A;
    private static final float I;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static DZ J(int[] var0) {
        var1_5 = var0;
        a = var1_5.length / AQa.P;
        var2_6 = a * uqa.g;
        a * yRa.d;
        var8_9 = new Vector3f(Float.intBitsToFloat(var1_5[uSa.E]), Float.intBitsToFloat(var1_5[vRa.d]), Float.intBitsToFloat(var1_5[uqa.g]));
        a = new Vector3f(Float.intBitsToFloat(var1_5[a]), Float.intBitsToFloat(var1_5[a + vRa.d]), Float.intBitsToFloat(var1_5[a + uqa.g]));
        var2_7 = new Vector3f(Float.intBitsToFloat(var1_5[var2_6]), Float.intBitsToFloat(var1_5[var2_6 + vRa.d]), Float.intBitsToFloat(var1_5[var2_6 + uqa.g]));
        var4_10 = new Vector3f();
        var5_12 = new Vector3f();
        var6_14 = new Vector3f();
        Vector3f.sub((Vector3f)var8_9, a, var4_10);
        Vector3f.sub(var2_7, a, var5_12);
        Vector3f.cross(var5_12, var4_10, var6_14);
        v0 = var6_14;
        v1 = var6_14;
        v2 = var6_14;
        v3 = var6_14;
        a = (float)Math.sqrt(v0.x * v1.x + v2.y * v2.y + v3.z * v3.z);
        v0.x /= a;
        v1.y /= a;
        v0.z /= a;
        a = null;
        var2_8 = JPa.N;
        var8_9 = DZ.VALUES;
        var4_11 = var8_9.length;
        v4 = var5_13 = uSa.E;
        while (v4 < var4_11) {
            var7_17 = var8_9[var5_13];
            var3_16 /* !! */  = var7_17.getDirectionVec();
            var3_16 /* !! */  = new Vector3f(var3_16 /* !! */ .getX(), var3_16 /* !! */ .getY(), var3_16 /* !! */ .getZ());
            var3_15 = Vector3f.dot(var6_14, (Vector3f)var3_16 /* !! */ );
            if (v5 >= JPa.N && var3_15 > var2_8) {
                var2_8 = var3_15;
                a = var7_17;
            }
            v4 = ++var5_13;
        }
        if (!(var2_8 < psa.Ja)) ** GOTO lbl46
        if (a != DZ.EAST && a != DZ.WEST && a != DZ.NORTH && a != DZ.SOUTH) {
            v6 = a = DZ.UP;
        } else {
            a = DZ.NORTH;
lbl46:
            // 2 sources

            v6 = a;
        }
        if (v6 == null) {
            return DZ.UP;
        }
        return a;
    }

    /*
     * WARNING - void declaration
     */
    private void J(int[] nArray, int n2, int n3, Vector3f vector3f, int n4, KLa kLa2, hJa hJa2) {
        void e2;
        void a2;
        void b2;
        void c2;
        void d2;
        void g;
        int h = n2;
        LJa_1 f2 = this;
        int n5 = ((void)g).length / AQa.P;
        void v0 = g;
        int n6 = h *= n5;
        void v2 = g;
        int n7 = h;
        g[n7] = Float.floatToRawIntBits(d2.x);
        v2[n7 + vRa.d] = Float.floatToRawIntBits(d2.y);
        v2[h + uqa.g] = Float.floatToRawIntBits(d2.z);
        g[n6 + yRa.d] = c2;
        v0[n6 + AQa.P] = Float.floatToRawIntBits(b2.J((double)a2.J((int)e2)));
        v0[h + AQa.P + vRa.d] = Float.floatToRawIntBits(b2.f((double)a2.f((int)e2)));
    }

    /*
     * WARNING - void declaration
     */
    private void J(int[] nArray, int n2, DZ dZ2, Rja rja2, float[] fArray, KLa kLa2, hC hC2, CLa cLa, boolean bl, boolean bl2) {
        void g;
        void e2;
        void b2;
        void j2;
        void c2;
        Vector3f f2;
        void i2;
        int a2;
        void h;
        void d2;
        LJa_1 lJa_1 = this;
        Object k2 = d2.rotate((DZ)h);
        a2 = a2 != 0 ? lJa_1.J((DZ)((Object)k2)) : pua.o;
        k2 = cla.getFacing((DZ)h).func_179025_a((int)i2);
        f2 = new Vector3f((float)f2[((ala)k2).J], (float)f2[((ala)k2).A], (float)f2[((ala)k2).I]);
        LJa_1 lJa_12 = lJa_1;
        Vector3f vector3f = f2;
        lJa_1.J(vector3f, (CLa)c2);
        lJa_12.J((int[])j2, lJa_12.J(vector3f, (DZ)h, (int)i2, (hC)d2, (boolean)b2), (int)i2, f2, a2, (KLa)e2, g.blockFaceUV);
    }

    /*
     * WARNING - void declaration
     */
    private float[] J(Vector3f vector3f, Vector3f vector3f2) {
        void b2;
        Vector3f c2 = vector3f2;
        LJa_1 a2 = this;
        float[] fArray = new float[DZ.VALUES.length];
        fArray[NJa.M] = b2.x / Yra.i;
        fArray[NJa.A] = b2.y / Yra.i;
        fArray[NJa.k] = b2.z / Yra.i;
        fArray[NJa.j] = c2.x / Yra.i;
        fArray[NJa.I] = c2.y / Yra.i;
        fArray[NJa.J] = c2.z / Yra.i;
        return fArray;
    }

    static {
        I = pqa.r / (float)Math.cos(UOa.m) - pqa.r;
        A = pqa.r / (float)Math.cos(Cra.k) - pqa.r;
    }

    /*
     * WARNING - void declaration
     */
    private void J(Vector3f vector3f, Vector3f vector3f2, Matrix4f matrix4f, Vector3f vector3f3) {
        void a2;
        void b2;
        void d2;
        Vector4f vector4f;
        Vector3f e2 = vector3f2;
        LJa_1 c2 = this;
        Vector4f vector4f2 = vector4f = new Vector4f(d2.x - e2.x, d2.y - e2.y, d2.z - e2.z, pqa.r);
        Matrix4f.transform((Matrix4f)b2, vector4f2, vector4f2);
        Vector4f vector4f3 = vector4f;
        vector4f3.x *= a2.x;
        vector4f3.y *= a2.y;
        vector4f3.z *= a2.z;
        d2.set(vector4f3.x + e2.x, vector4f.y + e2.y, vector4f.z + e2.z);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int[] nArray, DZ dZ2) {
        void a22;
        Object object;
        int n2;
        int n3;
        Object c2;
        void b2;
        LJa_1 lJa_1 = this;
        int[] nArray2 = new int[((void)b2).length];
        System.arraycopy(b2, uSa.E, nArray2, uSa.E, ((void)b2).length);
        Object object2 = c2 = (Object)new float[DZ.VALUES.length];
        object2[NJa.M] = Upa.Aa;
        object2[NJa.A] = Upa.Aa;
        object2[NJa.k] = Upa.Aa;
        object2[NJa.j] = XSa.Y;
        object2[NJa.I] = XSa.Y;
        object2[NJa.J] = XSa.Y;
        int n4 = ((void)b2).length / AQa.P;
        int n5 = n3 = uSa.E;
        while (n5 < AQa.P) {
            n2 = n4 * n3;
            float f2 = Float.intBitsToFloat(nArray2[n2]);
            float f3 = Float.intBitsToFloat(nArray2[n2 + vRa.d]);
            object = Float.intBitsToFloat(nArray2[n2 + uqa.g]);
            if (f2 < c2[NJa.M]) {
                c2[NJa.M] = f2;
            }
            if (f3 < c2[NJa.A]) {
                c2[NJa.A] = f3;
            }
            if (object < c2[NJa.k]) {
                c2[NJa.k] = object;
            }
            if (f2 > c2[NJa.j]) {
                c2[NJa.j] = f2;
            }
            if (f3 > c2[NJa.I]) {
                c2[NJa.I] = f3;
            }
            if (object > c2[NJa.J]) {
                c2[NJa.J] = object;
            }
            n5 = ++n3;
        }
        cla cla2 = cla.getFacing((DZ)a22);
        int n6 = n2 = uSa.E;
        while (n6 < AQa.P) {
            int n7 = n4 * n2;
            ala ala2 = cla2.func_179025_a(n2);
            Object object3 = c2;
            ala ala3 = ala2;
            object = c2[ala2.J];
            Object a22 = object3[ala3.A];
            Object object4 = object3[ala3.I];
            void v5 = b2;
            int n8 = n7;
            b2[n8] = Float.floatToRawIntBits(object);
            v5[n8 + vRa.d] = Float.floatToRawIntBits((float)a22);
            v5[n7 + uqa.g] = Float.floatToRawIntBits((float)object4);
            int n9 = uSa.E;
            while (n9 < AQa.P) {
                int n10;
                int n11 = n4 * n10;
                float f4 = Float.intBitsToFloat(nArray2[n11]);
                float f5 = Float.intBitsToFloat(nArray2[n11 + vRa.d]);
                float f6 = Float.intBitsToFloat(nArray2[n11 + uqa.g]);
                if (Oz.J((float)object, (float)f4) && Oz.J((float)a22, (float)f5) && Oz.J((float)object4, (float)f6)) {
                    void v8 = b2;
                    v8[n7 + AQa.P] = nArray2[n11 + AQa.P];
                    v8[n7 + AQa.P + vRa.d] = nArray2[n11 + AQa.P + vRa.d];
                }
                n9 = ++n10;
            }
            n6 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public int J(Vector3f vector3f, DZ dZ2, int n2, AGa aGa, boolean bl) {
        void f2;
        void b2;
        void c2;
        void d2;
        void e2;
        boolean bl2 = bl;
        LJa_1 a2 = this;
        return a2.J((Vector3f)e2, (DZ)d2, (int)c2, (AGa)b2, (boolean)f2);
    }

    /*
     * WARNING - void declaration
     */
    public int J(Vector3f vector3f, DZ dZ2, int n2, hC hC2, boolean bl) {
        void d2;
        void e2;
        void c2;
        LJa_1 f2;
        LJa_1 lJa_1 = lJa_12;
        LJa_1 lJa_12 = hC2;
        LJa_1 b2 = lJa_1;
        if (f2 == AGa.X0_Y0) {
            return (int)c2;
        }
        b2.J((Vector3f)e2, new Vector3f(MQa.L, MQa.L, MQa.L), ((AGa)((Object)f2)).getMatrix4d(), new Vector3f(pqa.r, pqa.r, pqa.r));
        return f2.rotate((DZ)d2, (int)c2);
    }

    private int J(DZ dZ2) {
        Object b22 = dZ2;
        LJa_1 a2 = this;
        int b22 = Oz.f((int)((int)(a2.J((DZ)((Object)b22)) * NQa.Y)), (int)uSa.E, (int)osa.Ja);
        return gsa.X | b22 << ERa.C | b22 << Yqa.i | b22;
    }

    private float J(DZ dZ2) {
        DZ b2 = dZ2;
        LJa_1 a2 = this;
        switch (uja.I[b2.ordinal()]) {
            case 1: {
                boolean bl = Config.h();
                while (false) {
                }
                if (bl) {
                    return pA.hc;
                }
                return MQa.L;
            }
            case 2: {
                return pqa.r;
            }
            case 3: 
            case 4: {
                if (Config.h()) {
                    return pA.La;
                }
                return xSa.la;
            }
            case 5: 
            case 6: {
                if (Config.h()) {
                    return pA.Pa;
                }
                return Ora.D;
            }
        }
        return pqa.r;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int[] nArray, DZ dZ2, hJa hJa2, KLa kLa2) {
        int e2;
        LJa_1 lJa_1 = this;
        int n2 = e2 = uSa.E;
        while (n2 < AQa.P) {
            void a2;
            void b2;
            void c2;
            void d2;
            lJa_1.J(e2++, (int[])d2, (DZ)c2, (hJa)b2, (KLa)a2);
            n2 = e2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(Vector3f vector3f, CLa cLa) {
        void a2;
        LJa_1 lJa_1 = this;
        if (a2 != null) {
            void b2;
            LJa_1 lJa_12;
            void v1;
            Matrix4f matrix4f = lJa_1.J();
            Vector3f c2 = new Vector3f(JPa.N, JPa.N, JPa.N);
            switch (uja.J[a2.A.ordinal()]) {
                case 1: {
                    void v0 = a2;
                    while (false) {
                    }
                    v1 = v0;
                    Matrix4f matrix4f2 = matrix4f;
                    Matrix4f.rotate(v0.j * Bua.ga, new Vector3f(pqa.r, JPa.N, JPa.N), matrix4f2, matrix4f2);
                    c2.set(JPa.N, pqa.r, pqa.r);
                    break;
                }
                case 2: {
                    void v3 = a2;
                    v1 = v3;
                    Matrix4f matrix4f3 = matrix4f;
                    Matrix4f.rotate(v3.j * Bua.ga, new Vector3f(JPa.N, pqa.r, JPa.N), matrix4f3, matrix4f3);
                    c2.set(pqa.r, JPa.N, pqa.r);
                    break;
                }
                case 3: {
                    Matrix4f matrix4f4 = matrix4f;
                    Matrix4f.rotate(a2.j * Bua.ga, new Vector3f(JPa.N, JPa.N, pqa.r), matrix4f4, matrix4f4);
                    c2.set(pqa.r, pqa.r, JPa.N);
                }
                default: {
                    v1 = a2;
                }
            }
            if (v1.I) {
                Vector3f vector3f2;
                Vector3f vector3f3 = c2;
                if (Math.abs(a2.j) == xTa.S) {
                    vector3f3.scale(I);
                    vector3f2 = c2;
                } else {
                    vector3f3.scale(A);
                    vector3f2 = c2;
                }
                Vector3f.add(vector3f2, new Vector3f(pqa.r, pqa.r, pqa.r), c2);
                lJa_12 = lJa_1;
            } else {
                c2.set(pqa.r, pqa.r, pqa.r);
                lJa_12 = lJa_1;
            }
            void v9 = b2;
            lJa_12.J((Vector3f)b2, new Vector3f(a2.J), matrix4f, c2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public Yka J(Vector3f vector3f, Vector3f vector3f2, Rja rja2, KLa kLa2, DZ dZ2, hC hC2, CLa cLa, boolean bl, boolean bl2) {
        void a2;
        void b2;
        void c2;
        void d2;
        int[] i2;
        void e2;
        void f2;
        void g;
        Object j2 = vector3f2;
        LJa_1 h = this;
        i2 = h.J((Rja)g, (KLa)f2, (DZ)e2, h.J((Vector3f)i2, (Vector3f)j2), (hC)d2, (CLa)c2, (boolean)b2, (boolean)a2);
        j2 = LJa_1.J(i2);
        if (b2 != false) {
            h.J(i2, (DZ)((Object)j2), g.blockFaceUV, (KLa)f2);
        }
        if (c2 == null) {
            h.J(i2, (DZ)((Object)j2));
        }
        return new Yka(i2, g.tintIndex, (DZ)((Object)j2), (KLa)f2);
    }

    public LJa_1() {
        LJa_1 a2;
    }

    private Matrix4f J() {
        Matrix4f matrix4f = new Matrix4f();
        matrix4f.setIdentity();
        return matrix4f;
    }

    /*
     * WARNING - void declaration
     */
    private int[] J(Rja rja2, KLa kLa2, DZ dZ2, float[] fArray, hC hC2, CLa cLa, boolean bl, boolean bl2) {
        int n2;
        LJa_1 lJa_1 = this;
        int i22 = EPa.O;
        if (Config.h()) {
            i22 = Upa.D;
        }
        int[] i22 = new int[i22];
        int n3 = n2 = uSa.E;
        while (n3 < AQa.P) {
            void a2;
            void b2;
            void c2;
            void d2;
            void g;
            void e2;
            void h;
            void f2;
            lJa_1.J(i22, n2++, (DZ)f2, (Rja)h, (float[])e2, (KLa)g, (hC)d2, (CLa)c2, (boolean)b2, (boolean)a2);
            n3 = n2;
        }
        return i22;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void J(int n2, int[] nArray, DZ dZ2, hJa hJa2, KLa kLa2) {
        void a2;
        void v4;
        void c2;
        int e2;
        void d2;
        LJa_1 lJa_1 = this;
        int n3 = ((void)d2).length / AQa.P;
        int f22 = n3 * e2;
        void v0 = d2;
        float f3 = Float.intBitsToFloat((int)v0[f22]);
        float f4 = Float.intBitsToFloat((int)v0[f22 + vRa.d]);
        float f22 = Float.intBitsToFloat((int)v0[f22 + uqa.g]);
        if (f3 < Qra.j || f3 >= isa.W) {
            float f5 = f3;
            f3 = f5 - (float)Oz.J((float)f5);
        }
        if (f4 < Qra.j || f4 >= isa.W) {
            float f6 = f4;
            f4 = f6 - (float)Oz.J((float)f6);
        }
        if (f22 < Qra.j || f22 >= isa.W) {
            float f7 = f22;
            f22 = f7 - (float)Oz.J((float)f7);
        }
        float f8 = JPa.N;
        float f9 = JPa.N;
        switch (uja.I[c2.ordinal()]) {
            case 1: {
                void b2;
                f8 = f3 * Yra.i;
                f9 = (pqa.r - f22) * Yra.i;
                v4 = b2;
                break;
            }
            case 2: {
                void b2;
                f8 = f3 * Yra.i;
                f9 = f22 * Yra.i;
                v4 = b2;
                break;
            }
            case 3: {
                void b2;
                f8 = (pqa.r - f3) * Yra.i;
                f9 = (pqa.r - f4) * Yra.i;
                v4 = b2;
                break;
            }
            case 4: {
                void b2;
                f8 = f3 * Yra.i;
                f9 = (pqa.r - f4) * Yra.i;
                v4 = b2;
                break;
            }
            case 5: {
                void b2;
                f8 = f22 * Yra.i;
                f9 = (pqa.r - f4) * Yra.i;
                v4 = b2;
                break;
            }
            case 6: {
                f8 = (pqa.r - f22) * Yra.i;
                f9 = (pqa.r - f4) * Yra.i;
            }
            default: {
                void b2;
                v4 = b2;
            }
        }
        e2 = v4.f(e2) * n3;
        void v5 = d2;
        v5[e2 + AQa.P] = Float.floatToRawIntBits(a2.J((double)f8));
        v5[e2 + AQa.P + vRa.d] = Float.floatToRawIntBits(a2.f((double)f9));
    }

    /*
     * WARNING - void declaration
     */
    public Yka J(Vector3f vector3f, Vector3f vector3f2, Rja rja2, KLa kLa2, DZ dZ2, AGa aGa, CLa cLa, boolean bl, boolean bl2) {
        void a2;
        void b2;
        void c2;
        void d2;
        int[] i2;
        void e2;
        void f2;
        void g;
        Object j2 = vector3f2;
        LJa_1 h = this;
        i2 = h.J((Rja)g, (KLa)f2, (DZ)e2, h.J((Vector3f)i2, (Vector3f)j2), (hC)d2, (CLa)c2, (boolean)b2, (boolean)a2);
        j2 = LJa_1.J(i2);
        if (b2 != false) {
            h.J(i2, (DZ)((Object)j2), g.blockFaceUV, (KLa)f2);
        }
        if (c2 == null) {
            h.J(i2, (DZ)((Object)j2));
        }
        return new Yka(i2, g.tintIndex, (DZ)((Object)j2), (KLa)f2);
    }
}

