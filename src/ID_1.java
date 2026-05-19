/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  Bpa
 *  Bsa
 *  ERa
 *  JPa
 *  Kpa
 *  NPa
 *  NQa
 *  Qqa
 *  Qta
 *  SQa
 *  Sc
 *  TQa
 *  WSa
 *  Wf
 *  Wsa
 *  XTa
 *  Xd
 *  cRa
 *  dQa
 *  fF
 *  fTa
 *  hE
 *  hra
 *  jsa
 *  nLa
 *  nka
 *  pqa
 *  psa
 *  pua
 *  re
 *  uKa
 *  vRa
 *  vc
 *  wd
 *  ye
 */
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import javax.vecmath.Matrix4f;
import javax.vecmath.Vector4f;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ID_1 {
    private int h;
    private DoubleBuffer K;
    private IntBuffer H;
    public final String c;
    private int B;
    private final re d;
    private FloatBuffer a;
    private static final Sc<float[]> b;
    private int l;
    private ResourceLocation e;
    private FloatBuffer G;
    private final re D;
    private static final Sc<boolean[]> f;
    private float F;
    private final Xd g;
    public final ye L;
    private final re E;
    private final fF m;
    private static final Sc<float[]> C;
    private static final Sc<float[]> i;
    private FloatBuffer M;
    private final re k;
    private int j;
    private Xd J;
    private int A;
    private final re I;

    public float J() {
        ID_1 a2;
        return a2.F;
    }

    public void l() {
        ID_1 a2;
        ID_1 iD_1 = a2;
        ID_1 iD_12 = a2;
        ID_1 iD_13 = a2;
        GL15.glDeleteBuffers(iD_13.h);
        GL15.glDeleteBuffers(iD_13.A);
        GL15.glDeleteBuffers(iD_13.B);
        GL15.glDeleteBuffers(iD_13.j);
        iD_12.a = null;
        iD_12.G = null;
        iD_1.K = null;
        iD_1.H = null;
    }

    public ResourceLocation J() {
        ID_1 a2;
        return a2.e;
    }

    public void f(float[] fArray) {
        ID_1 a2;
        Object b2 = fArray;
        ID_1 iD_1 = a2 = this;
        iD_1.G.clear();
        iD_1.G.put((float[])b2, uSa.E, a2.L.f().length).flip();
        GL15.glBindBuffer(Qta.T, a2.A);
        GL15.glBufferData(Qta.T, a2.G, Jra.i);
    }

    private ResourceLocation J(sf sf2) {
        sf b2 = sf2;
        ID_1 a2 = this;
        if (b2 == null) {
            return a2.e;
        }
        if (b2.J() == null) {
            return a2.e;
        }
        return b2.J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(Kpa kpa2, sf sf2) {
        sf c22 = sf2;
        ID_1 a2 = this;
        if (c22 != null && (!c22.C() || a2.F <= JPa.N)) {
            return;
        }
        ResourceLocation resourceLocation = a2.J(c22);
        int n2 = c22 != null && c22.J() ? vRa.d : uSa.E;
        int n3 = c22 != null && c22.f() ? vRa.d : uSa.E;
        int n4 = c22 == null || c22.l() ? vRa.d : uSa.E;
        float f2 = nka.ja;
        float f3 = nka.u;
        if (resourceLocation != null) {
            Object object;
            if (c22.J() != null) {
                Object object2 = c22;
                object = object2;
                uKa.C((int)((sf)object2).J());
            } else {
                void b22;
                b22.J().J(resourceLocation);
                object = c22;
            }
            if (object != null) {
                a2.J(c22.J());
            }
        }
        if (n2 != 0 && n3 != 0) {
            GL11.glShadeModel(gua.X);
        }
        if (n3 == 0) {
            nLa.C();
        }
        if (n4 == 0) {
            nka.J((int)nka.P, (float)xra.Ga, (float)xra.Ga);
        }
        int b22 = c22 != null ? c22.f() : Wsa.K;
        float c22 = (float)(b22 >> ERa.C & osa.Ja) / NQa.Y;
        float f4 = (float)(b22 >> Yqa.i & osa.Ja) / NQa.Y;
        float b22 = (float)(b22 & osa.Ja) / NQa.Y;
        float f5 = a2.F;
        uKa.f((float)c22, (float)f4, (float)b22, (float)f5);
        GL15.glBindBuffer(Qta.T, a2.h);
        GL11.glVertexPointer(AQa.P, JPa.la, uSa.E, nqa.i);
        GL15.glBindBuffer(Qta.T, a2.A);
        GL11.glNormalPointer(JPa.la, uSa.E, nqa.i);
        GL15.glBindBuffer(Qta.T, a2.B);
        GL11.glTexCoordPointer(uqa.g, eta.R, uSa.E, nqa.i);
        GL11.glEnableClientState(WSa.Ma);
        GL11.glEnableClientState(pqa.n);
        GL11.glEnableClientState(dQa.ia);
        if (pA.ra != pua.o) {
            GL15.glBindBuffer(Qta.T, a2.l);
            GL20.glVertexAttribPointer(pA.ra, AQa.P, JPa.la, uSa.E != 0, uSa.E, nqa.i);
            GL20.glEnableVertexAttribArray(pA.ra);
        }
        GL15.glBindBuffer(Ata.v, a2.j);
        GL11.glDrawElements(AQa.P, a2.L.f().length, Ira.t, nqa.i);
        GL15.glBindBuffer(Ata.v, uSa.E);
        GL15.glBindBuffer(Qta.T, uSa.E);
        GL11.glDisableClientState(WSa.Ma);
        GL11.glDisableClientState(pqa.n);
        GL11.glDisableClientState(dQa.ia);
        if (pA.ra != pua.o) {
            GL20.glDisableVertexAttribArray(pA.ra);
        }
        if (n2 != 0 && n3 != 0) {
            GL11.glShadeModel(Zra.f);
        }
        if (n3 == 0) {
            nLa.f();
        }
        if (n4 == 0) {
            nka.J((int)nka.P, (float)f2, (float)f3);
        }
        a2.F = pqa.r;
    }

    /*
     * WARNING - void declaration
     */
    private static float[] J(int n2, int[] nArray, double[] dArray, float[] fArray, float[] fArray2) {
        int n3;
        void d2;
        int n4 = n2;
        float[] e2 = (float[])i.J(n4);
        Arrays.fill(e2, uSa.E, n4, JPa.N);
        boolean[] blArray = (boolean[])f.J(n4);
        Arrays.fill(blArray, uSa.E, n4, uSa.E != 0);
        Vector4f vector4f = new Vector4f();
        int n5 = ((void)d2).length / yRa.d;
        int n6 = n3 = uSa.E;
        while (n6 < n5) {
            int n7 = (n3 << vRa.d) + n3;
            void v1 = d2;
            void var11_12 = v1[n7];
            void var12_13 = v1[n7 + vRa.d];
            n7 = v1[n7 + uqa.g];
            void var13_14 = var11_12 << uqa.g;
            void var14_15 = var12_13 << uqa.g;
            int n8 = n7 << uqa.g;
            boolean bl = blArray[var11_12];
            boolean bl2 = blArray[var12_13];
            int n9 = blArray[n7];
            if (!bl && !bl2 && n9 == 0) {
                void a2;
                void c2;
                void b2;
                n9 = var11_12 << vRa.d;
                void var19_20 = var12_13 << vRa.d;
                int n10 = n7 << vRa.d;
                void v2 = var13_14;
                vc.J((float)b2[var13_14], (float)b2[v2 + vRa.d], (float)b2[var13_14 + uqa.g], (float)b2[var14_15], (float)b2[var14_15 + vRa.d], (float)b2[var14_15 + uqa.g], (float)b2[n8], (float)b2[n8 + vRa.d], (float)b2[n8 + uqa.g], (float)((float)c2[n9]), (float)((float)c2[n9 + vRa.d]), (float)((float)c2[var19_20]), (float)((float)c2[var19_20 + vRa.d]), (float)((float)c2[n10]), (float)((float)c2[n10 + vRa.d]), (float)a2[var11_12 * yRa.d], (float)a2[var11_12 * yRa.d + vRa.d], (float)a2[var11_12 * yRa.d + uqa.g], (Vector4f)vector4f);
                e2[var14_15] = e2[n8] = vector4f.x * ypa.Y;
                e2[v2] = e2[n8];
                float f2 = vector4f.y * ypa.Y;
                e2[n8 + vRa.d] = f2;
                e2[var14_15 + vRa.d] = f2;
                e2[var13_14 + vRa.d] = f2;
                float f3 = vector4f.z * ypa.Y;
                e2[n8 + uqa.g] = f3;
                e2[var14_15 + uqa.g] = f3;
                e2[var13_14 + uqa.g] = f3;
                float f4 = vector4f.w * ypa.Y;
                e2[n8 + yRa.d] = f4;
                e2[var14_15 + yRa.d] = f4;
                e2[var13_14 + yRa.d] = f4;
                blArray[var12_13] = blArray[n7] = vRa.d;
                blArray[var11_12] = blArray[n7];
            } else if (bl) {
                e2[var14_15] = e2[n8] = e2[var13_14];
                float f5 = e2[var13_14 + vRa.d];
                e2[n8 + vRa.d] = f5;
                e2[var14_15 + vRa.d] = f5;
                float f6 = e2[var13_14 + uqa.g];
                e2[n8 + uqa.g] = f6;
                e2[var14_15 + uqa.g] = f6;
                float f7 = e2[var13_14 + yRa.d];
                e2[n8 + yRa.d] = f7;
                e2[var14_15 + yRa.d] = f7;
            } else {
                float[] fArray3 = e2;
                if (bl2) {
                    fArray3[var13_14] = e2[n8] = e2[var14_15];
                    float f8 = e2[var14_15 + vRa.d];
                    e2[n8 + vRa.d] = f8;
                    e2[var13_14 + vRa.d] = f8;
                    float f9 = e2[var14_15 + uqa.g];
                    e2[n8 + uqa.g] = f9;
                    e2[var13_14 + uqa.g] = f9;
                    float f10 = e2[var14_15 + yRa.d];
                    e2[n8 + yRa.d] = f10;
                    e2[var13_14 + yRa.d] = f10;
                } else {
                    fArray3[var13_14] = e2[var14_15] = e2[n8];
                    float f11 = e2[n8 + vRa.d];
                    e2[var14_15 + vRa.d] = f11;
                    e2[var13_14 + vRa.d] = f11;
                    float f12 = e2[n8 + uqa.g];
                    e2[var14_15 + uqa.g] = f12;
                    e2[var13_14 + uqa.g] = f12;
                    float f13 = e2[n8 + yRa.d];
                    e2[var14_15 + yRa.d] = f13;
                    e2[var13_14 + yRa.d] = f13;
                }
            }
            n6 = ++n3;
        }
        return e2;
    }

    public FloatBuffer J() {
        ID_1 a2;
        return a2.G;
    }

    public void f() {
        ID_1 iD_1 = this;
        float[] fArray = iD_1.L.J();
        float[] fArray2 = (float[])b.J(fArray.length);
        float[] fArray3 = iD_1.L.f();
        Object a2 = (float[])C.J(fArray3.length);
        ID_1 iD_12 = iD_1;
        Matrix4f[] matrix4fArray = iD_12.J.k;
        float[] fArray4 = iD_12.L.l();
        int[] nArray = iD_12.L.J();
        ID_1.J(fArray, fArray2, fArray3, (float[])a2, matrix4fArray, fArray4, nArray);
        iD_12.J(fArray2, (float[])a2);
        iD_12.J(fArray2);
        iD_12.f((float[])a2);
        fArray = ID_1.J(iD_12.L.J().length, iD_1.L.f(), iD_1.L.J(), fArray2, (float[])a2);
        ID_1 iD_13 = iD_1;
        iD_13.M.clear();
        iD_13.M.put(fArray, uSa.E, iD_1.L.J().length).flip();
        GL15.glBindBuffer(Qta.T, iD_1.l);
        GL15.glBufferData(Qta.T, iD_1.M, Jra.i);
    }

    public Xd f() {
        ID_1 a2;
        return a2.J;
    }

    public IntBuffer J() {
        ID_1 a2;
        return a2.H;
    }

    public void J(IntBuffer intBuffer) {
        IntBuffer b2 = intBuffer;
        ID_1 a2 = this;
        a2.H = b2;
    }

    public static /* synthetic */ boolean[] J(int a2) {
        return new boolean[a2];
    }

    /*
     * WARNING - void declaration
     */
    private void f(float[] fArray, float[] fArray2) {
        void b2;
        ID_1 a2;
        Object c2 = fArray2;
        ID_1 iD_1 = a2 = this;
        ID_1 iD_12 = a2;
        iD_1.E.J(iD_12.L, a2.f(), (float[])b2, (float[])c2);
        iD_1.I.J(a2.L, a2.f(), (float[])b2, (float[])c2);
        iD_12.d.J(a2.L, a2.f(), (float[])b2, (float[])c2);
        iD_1.D.J(a2.L, a2.f(), (float[])b2, (float[])c2);
        iD_1.k.J(a2.L, a2.f(), (float[])b2, (float[])c2);
    }

    public String J() {
        ID_1 a2;
        return a2.c;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(float[] fArray, float[] fArray2, float[] fArray3, float[] fArray4, Matrix4f[] matrix4fArray, float[] fArray5, int[] nArray) {
        int n2;
        float[] fArray6 = fArray;
        int n3 = fArray6.length / AQa.P;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            void f2;
            void d2;
            void e2;
            int n5 = (n2 << vRa.d) + n2;
            int n6 = n2 << uqa.g;
            float f3 = JPa.N;
            float f4 = JPa.N;
            float f5 = JPa.N;
            float f6 = JPa.N;
            float f7 = JPa.N;
            float f8 = JPa.N;
            float f9 = JPa.N;
            int n7 = uSa.E;
            int n8 = uSa.E;
            while (n8 < AQa.P) {
                void v2;
                int n9;
                void b2;
                void var20_21 = b2[n6 + n9];
                if (v2 > JPa.N) {
                    void a2;
                    void c2;
                    ++n7;
                    float[] g2 = c2[a2[n6 + n9]];
                    float f10 = fArray6[n6];
                    float f11 = fArray6[n6 + vRa.d];
                    float f12 = fArray6[n6 + uqa.g];
                    float f13 = fArray6[n6 + yRa.d];
                    f3 += (g2.m00 * f10 + g2.m01 * f11 + g2.m02 * f12 + g2.m03 * f13) * var20_21;
                    f4 += (g2.m10 * f10 + g2.m11 * f11 + g2.m12 * f12 + g2.m13 * f13) * var20_21;
                    f5 += (g2.m20 * f10 + g2.m21 * f11 + g2.m22 * f12 + g2.m23 * f13) * var20_21;
                    f6 += (g2.m30 * f10 + g2.m31 * f11 + g2.m32 * f12 + g2.m33 * f13) * var20_21;
                    void v3 = e2;
                    f10 = v3[n5];
                    f11 = v3[n5 + vRa.d];
                    f12 = v3[n5 + uqa.g];
                    f7 += (g2.m00 * f10 + g2.m01 * f11 + g2.m02 * f12) * var20_21;
                    f8 += (g2.m10 * f10 + g2.m11 * f11 + g2.m12 * f12) * var20_21;
                    f9 += (g2.m20 * f10 + g2.m21 * f11 + g2.m22 * f12) * var20_21;
                }
                n8 = ++n9;
            }
            if (n7 == 0) {
                void v4 = d2;
                int n10 = n5;
                d2[n10] = e2[n5];
                v4[n10 + vRa.d] = e2[n5 + vRa.d];
                v4[n5 + uqa.g] = e2[n5 + uqa.g];
                void v6 = f2;
                int n11 = n6;
                f2[n11] = fArray6[n6];
                v6[n11 + vRa.d] = fArray6[n6 + vRa.d];
                f2[n6 + uqa.g] = fArray6[n6 + uqa.g];
                v6[n6 + yRa.d] = pqa.r;
            } else {
                void v8 = f2;
                int n12 = n6;
                void v10 = f2;
                v10[n6] = f3 / f6;
                v10[n6 + vRa.d] = f4 / f6;
                v8[n12 + uqa.g] = f5 / f6;
                v8[n12 + yRa.d] = pqa.r;
                void v11 = d2;
                int n13 = n5;
                d2[n13] = f7;
                v11[n13 + vRa.d] = f8;
                v11[n5 + uqa.g] = f9;
            }
            n4 = ++n2;
        }
    }

    static {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        b = Sc.J();
        C = Sc.J();
        i = Sc.J();
        f = new Sc(Wf.J());
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        float[] fArray = new float[rua.c];
        int n9 = n8 = uSa.E;
        while (n9 < fArray.length) {
            fArray[n8++] = threadLocalRandom.nextFloat();
            n9 = n8;
        }
        float[] fArray2 = (float[])b.J(fArray.length);
        float[] fArray3 = new float[Qqa.B];
        int n10 = n7 = uSa.E;
        while (n10 < fArray3.length) {
            fArray3[n7++] = threadLocalRandom.nextFloat();
            n10 = n7;
        }
        float[] fArray4 = (float[])C.J(fArray3.length);
        Matrix4f[] matrix4fArray = new Matrix4f[ySa.T];
        int n11 = n6 = uSa.E;
        while (n11 < matrix4fArray.length) {
            float[] fArray5 = new float[ERa.C];
            int n12 = uSa.E;
            while (n12 < fArray5.length) {
                fArray5[n5++] = threadLocalRandom.nextFloat();
                n12 = n5;
            }
            int n13 = n6;
            int n14 = n6++;
            matrix4fArray[n13] = new Matrix4f();
            matrix4fArray[n13].set(fArray5);
            n11 = n6;
        }
        float[] fArray6 = new float[rua.c];
        int n15 = n4 = uSa.E;
        while (n15 < fArray6.length) {
            if (threadLocalRandom.nextInt(tTa.h) == 0) {
                fArray6[n4] = (float)threadLocalRandom.nextGaussian();
            }
            n15 = ++n4;
        }
        int[] nArray = new int[fArray.length];
        int n16 = n5 = uSa.E;
        while (n16 < nArray.length) {
            nArray[n5++] = threadLocalRandom.nextInt(matrix4fArray.length);
            n16 = n5;
        }
        int n17 = n5 = uSa.E;
        while (n17 < XTa.W) {
            ID_1.J(fArray, fArray2, fArray3, fArray4, matrix4fArray, fArray6, nArray);
            n17 = ++n5;
        }
        int[] nArray2 = new int[rua.c];
        int n18 = n3 = uSa.E;
        while (n18 < nArray2.length) {
            nArray2[n3++] = threadLocalRandom.nextInt(rSa.B);
            n18 = n3;
        }
        double[] dArray = new double[rua.c];
        int n19 = n2 = uSa.E;
        while (n19 < dArray.length) {
            dArray[n2++] = threadLocalRandom.nextGaussian();
            n19 = n2;
        }
        int n20 = n2 = uSa.E;
        while (n20 < XTa.W) {
            ID_1.J(rua.c, nArray2, dArray, fArray2, fArray4);
            n20 = ++n2;
        }
    }

    public fF J() {
        ID_1 a2;
        return a2.m;
    }

    /*
     * WARNING - void declaration
     */
    public void J(float[] fArray, float[] fArray2) {
        void a2;
        void b2;
        ID_1 iD_1 = this;
        if (!iD_1.I.J()) {
            iD_1.f((float[])b2, (float[])a2);
            return;
        }
        float f2 = fTa.X;
        float f3 = Vra.d;
        float f4 = ATa.Z;
        float f5 = MRa.N;
        float f6 = NPa.E;
        float f7 = Bta.D;
        int n2 = uSa.E;
        int n3 = iD_1.L.J().length / AQa.P;
        int n4 = n2;
        while (n4 < n3) {
            double d2;
            Object object;
            ID_1 c2;
            double d3;
            block15: {
                d3 = iD_1.L.J()[n2 * uqa.g + vRa.d];
                c2 = hE.NONE;
                int n5 = uSa.E;
                while (n5 < AQa.P) {
                    int n6;
                    int n7 = iD_1.L.J()[n2 * AQa.P + n6];
                    if (n7 != pua.o) {
                        Object object2;
                        object = (wd)iD_1.f().J().get(n7);
                        if (object.f().contains(psa.l)) {
                            object2 = hE.LEG;
                        } else if (object.f().contains(jsa.D)) {
                            object2 = hE.ARM;
                        } else {
                            if (object.f().contains(Eqa.Z)) {
                                c2 = hE.BODY;
                            }
                            object2 = c2;
                        }
                        if (object2 != hE.NONE) {
                            d2 = d3;
                            break block15;
                        }
                    }
                    n5 = ++n6;
                }
                d2 = d3;
            }
            if ((d2 >= (double)f2 && d3 <= (double)f3 || d3 >= (double)f4 && d3 <= (double)f5 || d3 >= (double)f6 && d3 <= (double)f7) && c2 != hE.NONE) {
                float f8;
                re re2;
                float f9 = iD_1.L.J()[n2 * AQa.P + uqa.g];
                if (c2 == hE.BODY) {
                    re2 = iD_1.k;
                    f8 = f9;
                } else if (d3 > Bsa.x) {
                    re2 = c2 == hE.LEG ? iD_1.D : iD_1.I;
                    f8 = f9;
                } else {
                    re2 = c2 == hE.LEG ? iD_1.d : iD_1.E;
                    f8 = f9;
                }
                re re3 = re2;
                object = f8 < JPa.N ? re3.f() : re3.J();
                object.add(n2);
            }
            n4 = ++n2;
        }
        iD_1.f((float[])b2, (float[])a2);
    }

    public void J(ResourceLocation resourceLocation) {
        ResourceLocation b2 = resourceLocation;
        ID_1 a2 = this;
        a2.e = b2;
    }

    public void J(float f2) {
        float b2 = f2;
        ID_1 a2 = this;
        a2.F = b2;
    }

    public ye J() {
        ID_1 a2;
        return a2.L;
    }

    public Xd J() {
        ID_1 a2;
        return a2.g;
    }

    private void J(int n2) {
        int b2 = n2;
        ID_1 a2 = this;
        GL11.glTexParameteri(BQa.Z, lQa.E, b2);
        GL11.glTexParameteri(BQa.Z, wua.C, b2);
    }

    /*
     * WARNING - void declaration
     */
    public ID_1(fF fF2, String string, ye ye2) {
        void b2;
        void c2;
        ID_1 a2;
        ID_1 d2 = ye2;
        ID_1 iD_1 = a2 = this;
        a2.F = pqa.r;
        a2.m = c2;
        a2.c = b2;
        iD_1.L = d2;
        iD_1.g = a2.L.J().J();
        iD_1.g.J();
        iD_1.J = iD_1.g;
        iD_1.J();
        ID_1 iD_12 = a2;
        iD_1.I = new re((wd)a2.J().J().get(TQa.z), (wd)a2.J().J().get(Bpa.Da));
        a2.E = new re((wd)a2.J().J().get(Xpa.f), (wd)a2.J().J().get(sra.u));
        a2.D = new re((wd)a2.J().J().get(hra.U), (wd)a2.J().J().get(SQa.U));
        a2.d = new re((wd)a2.J().J().get(yta.U), (wd)a2.J().J().get(ROa.U));
        a2.k = new re((wd)a2.J().J().get(Eqa.Z), (wd)a2.J().J().get(cRa.p));
    }

    private void J() {
        ID_1 a2;
        a2.a = BufferUtils.createFloatBuffer(a2.L.J().length);
        ID_1 iD_1 = a2;
        iD_1.a.put(a2.L.J()).flip();
        a2.G = BufferUtils.createFloatBuffer(iD_1.L.f().length);
        ID_1 iD_12 = a2;
        iD_12.G.put(a2.L.f()).flip();
        a2.M = BufferUtils.createFloatBuffer(iD_12.L.J().length);
        a2.K = BufferUtils.createDoubleBuffer(a2.L.J().length);
        ID_1 iD_13 = a2;
        iD_13.K.put(a2.L.J()).flip();
        a2.H = BufferUtils.createIntBuffer(iD_13.L.f().length);
        ID_1 iD_14 = a2;
        iD_14.H.put(iD_14.L.f()).flip();
        ID_1 iD_15 = a2;
        iD_15.h = GL15.glGenBuffers();
        GL15.glBindBuffer(Qta.T, a2.h);
        GL15.glBufferData(Qta.T, a2.a, Jra.i);
        iD_15.A = GL15.glGenBuffers();
        GL15.glBindBuffer(Qta.T, a2.A);
        GL15.glBufferData(Qta.T, a2.G, Pua.F);
        a2.l = GL15.glGenBuffers();
        iD_15.B = GL15.glGenBuffers();
        GL15.glBindBuffer(Qta.T, a2.B);
        GL15.glBufferData(Qta.T, a2.K, Pua.F);
        iD_15.j = GL15.glGenBuffers();
        GL15.glBindBuffer(Ata.v, a2.j);
        GL15.glBufferData(Ata.v, a2.H, Pua.F);
        GL15.glBindBuffer(Qta.T, uSa.E);
        GL15.glBindBuffer(Ata.v, uSa.E);
    }

    public void J(float[] fArray) {
        ID_1 a2;
        Object b2 = fArray;
        ID_1 iD_1 = a2 = this;
        iD_1.a.clear();
        iD_1.a.put((float[])b2, uSa.E, a2.L.J().length).flip();
        GL15.glBindBuffer(Qta.T, a2.h);
        GL15.glBufferData(Qta.T, a2.a, Jra.i);
    }

    public void J(FloatBuffer floatBuffer) {
        FloatBuffer b2 = floatBuffer;
        ID_1 a2 = this;
        a2.G = b2;
    }

    public void J(Xd xd) {
        ID_1 b2 = xd;
        ID_1 a2 = this;
        a2.J = b2;
    }
}

