/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  Bsa
 *  Cg
 *  ERa
 *  Fc
 *  NQa
 *  Oz
 *  Pqa
 *  Qja
 *  ZIa
 *  aKa
 *  ez
 *  hra
 *  lqa
 *  oja
 *  pua
 *  vRa
 *  xJa
 *  yQa
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.BitSet;
import optifine.Config;
import org.apache.logging.log4j.LogManager;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class aKa_2 {
    private static final String d = "CL_00000942";
    private boolean[] a;
    private KLa b;
    private hKa l;
    private gC e;
    private int G;
    public int D;
    private KLa[] f;
    public FloatBuffer F;
    private boolean g;
    private ShortBuffer L;
    private ez E;
    private ByteBuffer m;
    private double C;
    public Fc i;
    public int M;
    private KLa[] k;
    private double j;
    private boolean J;
    public IntBuffer A;
    private double I;

    /*
     * WARNING - void declaration
     */
    public void f(float f2, float f3, float f4, int n2) {
        void b22;
        void c22;
        void d22;
        int e2;
        aKa_2 a2;
        int n3 = n2;
        aKa_2 aKa_22 = a2 = this;
        e2 = aKa_22.J(e2);
        int d22 = Oz.f((int)((int)(d22 * NQa.Y)), (int)uSa.E, (int)osa.Ja);
        int c22 = Oz.f((int)((int)(c22 * NQa.Y)), (int)uSa.E, (int)osa.Ja);
        int b22 = Oz.f((int)((int)(b22 * NQa.Y)), (int)uSa.E, (int)osa.Ja);
        aKa_22.J(e2, d22, c22, b22, osa.Ja);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5) {
        void a2;
        void b2;
        void c2;
        void d2;
        aKa_2 aKa_22;
        aKa_2 aKa_23 = aKa_22 = this;
        aKa_2 aKa_24 = aKa_22;
        int e2 = (aKa_23.D - AQa.P) * aKa_24.l.f() + aKa_22.l.f(vRa.d) / AQa.P;
        int n6 = aKa_23.l.C() >> uqa.g;
        aKa_24.A.put(e2, (int)d2);
        aKa_22.A.put(e2 + n6, (int)c2);
        aKa_22.A.put(e2 + n6 * uqa.g, (int)b2);
        aKa_22.A.put(e2 + n6 * yRa.d, (int)a2);
    }

    public ByteBuffer J() {
        aKa_2 a2;
        return a2.m;
    }

    /*
     * WARNING - void declaration
     */
    public void l(float f2, float f3, float f4) {
        void b22;
        void c22;
        float d22 = f4;
        aKa_2 a2 = this;
        int c22 = (byte)(c22 * gua.R) & osa.Ja;
        int b22 = (byte)(b22 * gua.R) & osa.Ja;
        int d22 = (byte)(d22 * gua.R) & osa.Ja;
        c22 = c22 | b22 << Yqa.i | d22 << ERa.C;
        aKa_2 aKa_22 = a2;
        b22 = aKa_22.l.C() >> uqa.g;
        aKa_2 aKa_23 = a2;
        d22 = (aKa_22.D - AQa.P) * b22 + aKa_23.l.J() / AQa.P;
        aKa_23.A.put(d22, c22);
        a2.A.put(d22 + b22, c22);
        a2.A.put(d22 + b22 * uqa.g, c22);
        a2.A.put(d22 + b22 * yRa.d, c22);
    }

    private void f(int n2) {
        int b22 = n2;
        aKa_2 a2 = this;
        if (Config.h()) {
            b22 *= uqa.g;
        }
        if (b22 > a2.A.remaining()) {
            aKa_2 aKa_22 = a2;
            int n3 = aKa_22.m.capacity();
            int n4 = n3 % Bpa.M;
            aKa_2 aKa_23 = a2;
            b22 = n4 + (((aKa_23.A.position() + b22) * AQa.P - n4) / Bpa.M + vRa.d) * Bpa.M;
            LogManager.getLogger().warn(new StringBuilder().insert(3 ^ 3, WOa.M).append(n3).append(Pqa.Y).append(b22).append(Bsa.K).toString());
            n3 = aKa_22.A.position();
            KLa[] b22 = xJa.J((int)b22);
            aKa_23.m.position(uSa.E);
            b22.put(a2.m);
            b22.rewind();
            aKa_2 aKa_24 = a2;
            aKa_24.m = b22;
            aKa_24.F = aKa_24.m.asFloatBuffer();
            aKa_24.A = aKa_24.m.asIntBuffer();
            aKa_24.A.position(n3);
            aKa_2 aKa_25 = a2;
            aKa_25.L = aKa_25.m.asShortBuffer();
            aKa_25.L.position(n3 << vRa.d);
            if (aKa_22.f != null) {
                aKa_2 aKa_26 = a2;
                b22 = aKa_26.f;
                aKa_26.f = new KLa[aKa_26.f()];
                System.arraycopy(b22, uSa.E, a2.f, uSa.E, Math.min(b22.length, a2.f.length));
                a2.k = null;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5, int n6) {
        void d2;
        void c2;
        void b2;
        void f2;
        void e2;
        int n7 = n6;
        aKa_2 a2 = this;
        if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
            a2.A.put((int)e2, f2 << osa.c | b2 << ERa.C | c2 << Yqa.i | d2);
            return;
        }
        a2.A.put((int)e2, d2 << osa.c | c2 << ERa.C | b2 << Yqa.i | f2);
    }

    public hKa J() {
        aKa_2 a2;
        return a2.l;
    }

    public void M() {
        aKa_2 a2;
        aKa_2 aKa_22 = a2;
        aKa_22.D += vRa.d;
        aKa_22.f(aKa_22.l.f());
        aKa_22.G = uSa.E;
        aKa_22.e = aKa_22.l.J(a2.G);
        if (Config.h()) {
            Fc.M((aKa)a2);
        }
    }

    public void f(KLa kLa2) {
        KLa b2 = kLa2;
        aKa_2 a2 = this;
        if (a2.f != null) {
            a2.b = b2;
        }
    }

    public void J(Qja qja2) {
        KLa[] b2 = qja2;
        KLa[] a2 = this;
        a2.A.clear();
        a2.f(b2.J().length);
        a2.A.put(b2.J());
        a2.D = b2.J();
        KLa[] kLaArray = a2;
        a2.l = new hKa(b2.J());
        if (Qja.J((Qja)b2) != null) {
            if (a2.f == null) {
                a2.f = a2.k;
            }
            if (a2.f == null || a2.f.length < a2.f()) {
                a2.f = new KLa[a2.f()];
            }
            b2 = Qja.J((Qja)b2);
            System.arraycopy(b2, uSa.E, a2.f, uSa.E, b2.length);
            return;
        }
        if (a2.f != null) {
            a2.k = a2.f;
        }
        a2.f = null;
    }

    /*
     * WARNING - void declaration
     */
    public aKa J(int n2, int n3, int n4, int n5) {
        aKa_2 aKa_22;
        aKa_2 aKa_23 = this;
        if (aKa_23.g) {
            return aKa_23;
        }
        aKa_2 aKa_24 = aKa_23;
        aKa_2 aKa_25 = aKa_23;
        int e2 = aKa_24.D * aKa_24.l.C() + aKa_25.l.J(aKa_25.G);
        switch (vla.I[aKa_23.e.J().ordinal()]) {
            case 1: {
                void a2;
                void b2;
                void c2;
                void d2;
                aKa_2 aKa_26 = aKa_23;
                while (false) {
                }
                aKa_22 = aKa_26;
                aKa_26.m.putFloat(e2, (float)d2 / NQa.Y);
                aKa_23.m.putFloat(e2 + AQa.P, (float)c2 / NQa.Y);
                aKa_23.m.putFloat(e2 + Yqa.i, (float)b2 / NQa.Y);
                aKa_23.m.putFloat(e2 + lqa.s, (float)a2 / NQa.Y);
                break;
            }
            case 2: 
            case 3: {
                void a2;
                void b2;
                void c2;
                void d2;
                aKa_2 aKa_27 = aKa_23;
                aKa_22 = aKa_27;
                aKa_27.m.putFloat(e2, (float)d2);
                aKa_23.m.putFloat(e2 + AQa.P, (float)c2);
                aKa_23.m.putFloat(e2 + Yqa.i, (float)b2);
                aKa_23.m.putFloat(e2 + lqa.s, (float)a2);
                break;
            }
            case 4: 
            case 5: {
                void a2;
                void b2;
                void c2;
                void d2;
                aKa_2 aKa_28 = aKa_23;
                aKa_22 = aKa_28;
                aKa_28.m.putShort(e2, (short)d2);
                aKa_23.m.putShort(e2 + uqa.g, (short)c2);
                aKa_23.m.putShort(e2 + AQa.P, (short)b2);
                aKa_23.m.putShort(e2 + uua.p, (short)a2);
                break;
            }
            case 6: 
            case 7: {
                void a2;
                void b2;
                void c2;
                void d2;
                if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                    ByteBuffer byteBuffer = aKa_23.m.put(e2, (byte)d2);
                    aKa_2 aKa_29 = aKa_23;
                    aKa_23.m.put(e2 + vRa.d, (byte)c2);
                    aKa_22 = aKa_29;
                    aKa_29.m.put(e2 + uqa.g, (byte)b2);
                    aKa_23.m.put(e2 + yRa.d, (byte)a2);
                    break;
                }
                aKa_23.m.put(e2, (byte)a2);
                aKa_23.m.put(e2 + vRa.d, (byte)b2);
                aKa_23.m.put(e2 + uqa.g, (byte)c2);
                aKa_23.m.put(e2 + yRa.d, (byte)d2);
            }
            default: {
                aKa_22 = aKa_23;
            }
        }
        aKa_22.d();
        return aKa_23;
    }

    public int C() {
        aKa_2 a2;
        aKa_2 aKa_22 = a2;
        return aKa_22.D * aKa_22.l.f();
    }

    public void e() {
        aKa_2 aKa_22 = this;
        if (aKa_22.f != null) {
            int a2;
            int n2 = Config.J().J().l();
            if (aKa_22.a.length <= n2) {
                aKa_22.a = new boolean[n2 + vRa.d];
            }
            aKa_2 aKa_23 = aKa_22;
            Arrays.fill(aKa_23.a, uSa.E != 0);
            n2 = uSa.E;
            int n3 = pua.o;
            int n4 = aKa_23.D / AQa.P;
            int n5 = a2 = uSa.E;
            while (n5 < n4) {
                int n6;
                KLa kLa2 = aKa_22.f[a2];
                if (kLa2 != null && !aKa_22.a[n6 = kLa2.C()]) {
                    if (kLa2 == Cg.N) {
                        if (n3 < 0) {
                            n3 = a2;
                        }
                    } else {
                        aKa_2 aKa_24 = aKa_22;
                        ++n2;
                        a2 = aKa_24.J(kLa2, a2) - vRa.d;
                        if (aKa_24.E != ez.TRANSLUCENT) {
                            aKa_22.a[n6] = vRa.d;
                        }
                    }
                }
                n5 = ++a2;
            }
            if (n3 >= 0) {
                ++n2;
                aKa_22.J(Cg.N, n3);
            }
            if (n2 > 0) {
                // empty if block
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2) {
        int b2;
        aKa_2 aKa_22 = this;
        int n3 = b2 = uSa.E;
        while (n3 < AQa.P) {
            void a2;
            aKa_22.J((int)a2, b2++ + vRa.d);
            n3 = b2;
        }
    }

    public int J(int n2) {
        int b2 = n2;
        aKa_2 a2 = this;
        return ((a2.D - b2) * a2.l.C() + a2.l.d()) / AQa.P;
    }

    /*
     * Unable to fully structure code
     */
    public void J(float var1_2, float var2_3, float var3_4, int var4_5) {
        v0 = var5_6 = this;
        a = v0.J(a);
        e = pua.o;
        if (v0.g) ** GOTO lbl19
        e = var5_6.A.get(a);
        if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
            var6_7 = (int)((float)(e & osa.Ja) * d);
            var7_9 = (int)((float)(e >> Yqa.i & osa.Ja) * c);
            var8_11 = (int)((float)(e >> ERa.C & osa.Ja) * b);
            e &= gsa.X;
            e = e | var8_11 << ERa.C | var7_9 << Yqa.i | var6_7;
            v1 = var5_6;
        } else {
            var6_8 = (int)((float)(e >> osa.c & osa.Ja) * d);
            var7_10 = (int)((float)(e >> ERa.C & osa.Ja) * c);
            var8_12 = (int)((float)(e >> Yqa.i & osa.Ja) * b);
            e &= osa.Ja;
            e = e | var6_8 << osa.c | var7_10 << ERa.C | var8_12 << Yqa.i;
lbl19:
            // 2 sources

            v1 = var5_6;
        }
        v1.A.put(a, e);
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, int n3) {
        void b2;
        int c2 = n3;
        aKa_2 a2 = this;
        if ((c2 -= b2) > 0) {
            GL11.glDrawArrays(a2.M, (int)(b2 *= AQa.P), c2 *= AQa.P);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void f(float f2, float f3, float f4) {
        int n2;
        int n3;
        int c22;
        int n4;
        aKa_2 aKa_22 = this;
        int d22 = aKa_22.D / AQa.P;
        float[] fArray = new float[d22];
        int n5 = n4 = uSa.E;
        while (n5 < d22) {
            void a2;
            void b2;
            void c22;
            int n6 = n4;
            float f5 = aKa_2.J(aKa_22.F, (float)((double)c22 + aKa_22.C), (float)((double)b2 + aKa_22.I), (float)((double)a2 + aKa_22.j), aKa_22.l.f(), n4 * aKa_22.l.C());
            fArray[n6] = f5;
            n5 = ++n4;
        }
        Integer[] integerArray = new Integer[d22];
        int n7 = c22 = uSa.E;
        while (n7 < integerArray.length) {
            int n8 = c22++;
            integerArray[n8] = n8;
            n7 = c22;
        }
        Arrays.sort(integerArray, new oja((aKa)aKa_22, fArray));
        BitSet c22 = new BitSet();
        int b2 = aKa_22.l.C();
        int[] a2 = new int[b2];
        d22 = uSa.E;
        BitSet bitSet = c22;
        while ((d22 = bitSet.nextClearBit(d22)) < integerArray.length) {
            int n9 = integerArray[d22];
            if (n9 != d22) {
                aKa_22.A.limit(n9 * b2 + b2);
                aKa_22.A.position(n9 * b2);
                aKa_22.A.get(a2);
                n3 = n9;
                n2 = integerArray[n9];
                int n10 = n3;
                while (n10 != d22) {
                    aKa_22.A.limit(n2 * b2 + b2);
                    aKa_22.A.position(n2 * b2);
                    aKa_2 aKa_23 = aKa_22;
                    IntBuffer intBuffer = aKa_23.A.slice();
                    aKa_23.A.limit(n3 * b2 + b2);
                    aKa_22.A.position(n3 * b2);
                    aKa_22.A.put(intBuffer);
                    c22.set(n3);
                    n3 = n2;
                    n2 = integerArray[n2];
                    n10 = n3;
                }
                aKa_22.A.limit(d22 * b2 + b2);
                aKa_22.A.position(d22 * b2);
                aKa_22.A.put(a2);
            }
            BitSet bitSet2 = c22;
            bitSet = bitSet2;
            bitSet2.set(d22++);
        }
        aKa_2 aKa_24 = aKa_22;
        aKa_24.A.limit(aKa_24.A.capacity());
        aKa_22.A.position(aKa_22.C());
        if (aKa_24.f != null) {
            KLa[] d22 = new KLa[aKa_22.D / AQa.P];
            int n11 = aKa_22.l.f() / AQa.P * AQa.P;
            int n12 = n3 = uSa.E;
            while (n12 < integerArray.length) {
                n2 = integerArray[n3];
                d22[n3++] = aKa_22.f[n2];
                n12 = n3;
            }
            System.arraycopy(d22, uSa.E, aKa_22.f, uSa.E, d22.length);
        }
    }

    public void f(double c2, double b2, double a2) {
        aKa_2 d2;
        aKa_2 aKa_22 = d2;
        d2.C = c2;
        aKa_22.I = b2;
        aKa_22.j = a2;
    }

    public int l() {
        aKa_2 a2;
        return a2.M;
    }

    public void J(int[] nArray) {
        Object b2 = nArray;
        aKa_2 a2 = this;
        if (Config.h()) {
            Fc.J((aKa)a2, (int[])b2);
        }
        a2.f(((Object)b2).length);
        aKa_2 aKa_22 = a2;
        a2.A.position(a2.C());
        aKa_22.A.put((int[])b2);
        aKa_22.D += ((Object)b2).length / a2.l.f();
        if (Config.h()) {
            Fc.e((aKa)a2);
        }
    }

    private void d() {
        aKa_2 a2;
        aKa_2 aKa_22 = a2;
        aKa_22.G += vRa.d;
        aKa_2 aKa_23 = a2;
        aKa_22.G %= aKa_23.l.l();
        aKa_22.e = aKa_23.l.J(a2.G);
        if (aKa_22.e.J() == ZIa.PADDING) {
            a2.d();
        }
    }

    public aKa J(int n2) {
        int b2 = n2;
        aKa_2 a2 = this;
        return a2.J(b2 >> ERa.C & osa.Ja, b2 >> Yqa.i & osa.Ja, b2 & osa.Ja, b2 >> osa.c & osa.Ja);
    }

    public boolean f() {
        aKa_2 a2;
        if (a2.f != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, float f3, float f4) {
        int d2;
        aKa_2 aKa_22 = this;
        int n2 = d2 = uSa.E;
        while (n2 < AQa.P) {
            void a2;
            void b2;
            void c2;
            aKa_22.f((float)c2, (float)b2, (float)a2, d2++ + vRa.d);
            n2 = d2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public aKa J(int n2, int n3) {
        aKa_2 aKa_22;
        aKa_2 aKa_23;
        aKa_2 aKa_24 = aKa_23 = this;
        aKa_2 aKa_25 = aKa_23;
        int c2 = aKa_24.D * aKa_24.l.C() + aKa_25.l.J(aKa_25.G);
        switch (vla.I[aKa_23.e.J().ordinal()]) {
            case 1: {
                void a2;
                void b2;
                aKa_2 aKa_26 = aKa_23;
                while (false) {
                }
                aKa_22 = aKa_26;
                aKa_26.m.putFloat(c2, (float)b2);
                aKa_23.m.putFloat(c2 + AQa.P, (float)a2);
                break;
            }
            case 2: 
            case 3: {
                void a2;
                void b2;
                aKa_2 aKa_27 = aKa_23;
                aKa_22 = aKa_27;
                aKa_27.m.putInt(c2, (int)b2);
                aKa_23.m.putInt(c2 + AQa.P, (int)a2);
                break;
            }
            case 4: 
            case 5: {
                void a2;
                void b2;
                aKa_2 aKa_28 = aKa_23;
                aKa_22 = aKa_28;
                aKa_28.m.putShort(c2, (short)a2);
                aKa_23.m.putShort(c2 + uqa.g, (short)b2);
                break;
            }
            case 6: 
            case 7: {
                void a2;
                void b2;
                aKa_23.m.put(c2, (byte)a2);
                aKa_23.m.put(c2 + vRa.d, (byte)b2);
            }
            default: {
                aKa_22 = aKa_23;
            }
        }
        aKa_22.d();
        return aKa_23;
    }

    public aKa_2(int n2) {
        aKa_2 a2;
        int b2 = n2;
        aKa_2 aKa_22 = a2 = this;
        aKa_2 aKa_23 = a2;
        aKa_23.E = null;
        aKa_23.a = new boolean[hra.Ja];
        aKa_23.f = null;
        aKa_22.k = null;
        aKa_22.b = null;
        if (Config.h()) {
            b2 *= uqa.g;
        }
        aKa_2 aKa_24 = a2;
        aKa_24.m = xJa.J((int)(b2 * AQa.P));
        aKa_24.A = aKa_24.m.asIntBuffer();
        aKa_24.L = aKa_24.m.asShortBuffer();
        aKa_24.F = aKa_24.m.asFloatBuffer();
        Fc.J((aKa)aKa_24);
    }

    /*
     * WARNING - void declaration
     */
    public aKa J(float f2, float f3, float f4) {
        aKa_2 aKa_22;
        aKa_2 aKa_23;
        aKa_2 aKa_24 = aKa_23 = this;
        aKa_2 aKa_25 = aKa_23;
        int d2 = aKa_24.D * aKa_24.l.C() + aKa_25.l.J(aKa_25.G);
        switch (vla.I[aKa_23.e.J().ordinal()]) {
            case 1: {
                void a2;
                void b2;
                void c2;
                aKa_2 aKa_26 = aKa_23;
                while (false) {
                }
                aKa_22 = aKa_26;
                aKa_26.m.putFloat(d2, (float)c2);
                aKa_23.m.putFloat(d2 + AQa.P, (float)b2);
                aKa_23.m.putFloat(d2 + Yqa.i, (float)a2);
                break;
            }
            case 2: 
            case 3: {
                void a2;
                void b2;
                void c2;
                aKa_2 aKa_27 = aKa_23;
                aKa_22 = aKa_27;
                aKa_27.m.putInt(d2, (int)c2);
                aKa_23.m.putInt(d2 + AQa.P, (int)b2);
                aKa_23.m.putInt(d2 + Yqa.i, (int)a2);
                break;
            }
            case 4: 
            case 5: {
                void a2;
                void b2;
                void c2;
                aKa_2 aKa_28 = aKa_23;
                aKa_22 = aKa_28;
                aKa_28.m.putShort(d2, (short)((int)(c2 * ypa.Y) & yQa.j));
                aKa_23.m.putShort(d2 + uqa.g, (short)((int)(b2 * ypa.Y) & yQa.j));
                aKa_23.m.putShort(d2 + AQa.P, (short)((int)(a2 * ypa.Y) & yQa.j));
                break;
            }
            case 6: 
            case 7: {
                void a2;
                void b2;
                void c2;
                aKa_23.m.put(d2, (byte)((int)(c2 * gua.R) & osa.Ja));
                aKa_23.m.put(d2 + vRa.d, (byte)((int)(b2 * gua.R) & osa.Ja));
                aKa_23.m.put(d2 + uqa.g, (byte)((int)(a2 * gua.R) & osa.Ja));
            }
            default: {
                aKa_22 = aKa_23;
            }
        }
        aKa_22.d();
        return aKa_23;
    }

    public aKa J(double d2, double d3) {
        aKa_2 aKa_22;
        double a2;
        double b2;
        aKa_2 aKa_23 = this;
        if (aKa_23.b != null && aKa_23.f != null) {
            aKa_2 aKa_24 = aKa_23;
            b2 = aKa_24.b.J((float)b2);
            a2 = aKa_24.b.f((float)a2);
            aKa_24.f[aKa_23.D / AQa.P] = aKa_23.b;
        }
        aKa_2 aKa_25 = aKa_23;
        aKa_2 aKa_26 = aKa_23;
        int c2 = aKa_25.D * aKa_25.l.C() + aKa_26.l.J(aKa_26.G);
        switch (vla.I[aKa_23.e.J().ordinal()]) {
            case 1: {
                aKa_2 aKa_27 = aKa_23;
                while (false) {
                }
                aKa_22 = aKa_27;
                aKa_27.m.putFloat(c2, (float)b2);
                aKa_23.m.putFloat(c2 + AQa.P, (float)a2);
                break;
            }
            case 2: 
            case 3: {
                aKa_2 aKa_28 = aKa_23;
                aKa_22 = aKa_28;
                aKa_28.m.putInt(c2, (int)b2);
                aKa_23.m.putInt(c2 + AQa.P, (int)a2);
                break;
            }
            case 4: 
            case 5: {
                aKa_2 aKa_29 = aKa_23;
                aKa_22 = aKa_29;
                aKa_29.m.putShort(c2, (short)a2);
                aKa_23.m.putShort(c2 + uqa.g, (short)b2);
                break;
            }
            case 6: 
            case 7: {
                aKa_23.m.put(c2, (byte)a2);
                aKa_23.m.put(c2 + vRa.d, (byte)b2);
            }
            default: {
                aKa_22 = aKa_23;
            }
        }
        aKa_22.d();
        return aKa_23;
    }

    /*
     * WARNING - void declaration
     */
    public aKa J(double d2, double d3, double d4) {
        aKa_2 aKa_22;
        aKa_2 aKa_23 = this;
        if (Config.h()) {
            Fc.d((aKa)aKa_23);
        }
        aKa_2 aKa_24 = aKa_23;
        aKa_2 aKa_25 = aKa_23;
        int d5 = aKa_24.D * aKa_24.l.C() + aKa_25.l.J(aKa_25.G);
        switch (vla.I[aKa_23.e.J().ordinal()]) {
            case 1: {
                void a2;
                void b2;
                void c2;
                aKa_2 aKa_26 = aKa_23;
                while (false) {
                }
                aKa_22 = aKa_26;
                aKa_26.m.putFloat(d5, (float)(c2 + aKa_23.C));
                aKa_23.m.putFloat(d5 + AQa.P, (float)(b2 + aKa_23.I));
                aKa_23.m.putFloat(d5 + Yqa.i, (float)(a2 + aKa_23.j));
                break;
            }
            case 2: 
            case 3: {
                void a2;
                void b2;
                void c2;
                aKa_2 aKa_27 = aKa_23;
                aKa_22 = aKa_27;
                aKa_27.m.putInt(d5, Float.floatToRawIntBits((float)(c2 + aKa_23.C)));
                aKa_23.m.putInt(d5 + AQa.P, Float.floatToRawIntBits((float)(b2 + aKa_23.I)));
                aKa_23.m.putInt(d5 + Yqa.i, Float.floatToRawIntBits((float)(a2 + aKa_23.j)));
                break;
            }
            case 4: 
            case 5: {
                void a2;
                void b2;
                void c2;
                aKa_2 aKa_28 = aKa_23;
                aKa_22 = aKa_28;
                aKa_28.m.putShort(d5, (short)(c2 + aKa_23.C));
                aKa_23.m.putShort(d5 + uqa.g, (short)(b2 + aKa_23.I));
                aKa_23.m.putShort(d5 + AQa.P, (short)(a2 + aKa_23.j));
                break;
            }
            case 6: 
            case 7: {
                void a2;
                void b2;
                void c2;
                aKa_23.m.put(d5, (byte)(c2 + aKa_23.C));
                aKa_23.m.put(d5 + vRa.d, (byte)(b2 + aKa_23.I));
                aKa_23.m.put(d5 + uqa.g, (byte)(a2 + aKa_23.j));
            }
            default: {
                aKa_22 = aKa_23;
            }
        }
        aKa_22.d();
        return aKa_23;
    }

    public void C() {
        aKa_2 a2;
        aKa_2 aKa_22 = a2;
        aKa_22.f(aKa_22.l.f());
    }

    /*
     * WARNING - void declaration
     */
    public aKa J(float f2, float f3, float f4, float f5) {
        void e2;
        void b2;
        void c2;
        void d2;
        float f6 = f5;
        aKa_2 a2 = this;
        return a2.J((int)(d2 * NQa.Y), (int)(c2 * NQa.Y), (int)(b2 * NQa.Y), (int)(e2 * NQa.Y));
    }

    public Qja J() {
        aKa_2 aKa_22;
        aKa_2 aKa_23 = aKa_22 = this;
        aKa_22.A.rewind();
        int a22 = aKa_23.C();
        aKa_23.A.limit(a22);
        int[] nArray = new int[a22];
        aKa_22.A.get(nArray);
        aKa_2 aKa_24 = aKa_22;
        aKa_24.A.limit(aKa_24.A.capacity());
        aKa_22.A.position(a22);
        KLa[] a22 = null;
        if (aKa_23.f != null) {
            int n2 = aKa_22.D / AQa.P;
            a22 = new KLa[n2];
            System.arraycopy(aKa_22.f, uSa.E, a22, uSa.E, n2);
        }
        int[] nArray2 = nArray;
        return new Qja((aKa)aKa_22, nArray, new hKa(aKa_22.l), a22);
    }

    /*
     * WARNING - void declaration
     */
    public void J(KLa kLa2) {
        aKa_2 aKa_22 = this;
        if (aKa_22.f != null) {
            void a2;
            aKa_2 aKa_23 = aKa_22;
            int b2 = aKa_23.D / AQa.P;
            aKa_23.f[b2 - vRa.d] = a2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, hKa hKa2) {
        void b2;
        hKa c2 = hKa2;
        aKa_2 a2 = this;
        if (a2.J) {
            throw new IllegalStateException(Yua.l);
        }
        aKa_2 aKa_22 = a2;
        a2.J = vRa.d;
        a2.f();
        aKa_22.M = b2;
        aKa_22.l = c2;
        a2.e = c2.J(a2.G);
        a2.g = uSa.E;
        a2.m.limit(a2.m.capacity());
        if (Config.h()) {
            Fc.f((aKa)a2);
        }
        if (Config.y()) {
            if (a2.E != null) {
                if (a2.f == null) {
                    a2.f = a2.k;
                }
                if (a2.f == null || a2.f.length < a2.f()) {
                    a2.f = new KLa[a2.f()];
                    return;
                }
            }
        } else {
            if (a2.f != null) {
                a2.k = a2.f;
            }
            a2.f = null;
        }
    }

    public void J(ez ez2) {
        aKa_2 b2 = ez2;
        aKa_2 a2 = this;
        a2.E = b2;
        if (a2.E == null) {
            if (a2.f != null) {
                a2.k = a2.f;
            }
            a2.f = null;
            a2.b = null;
        }
    }

    private void J(int n2, int n3) {
        int a2;
        aKa_2 b2;
        int c2 = n2;
        aKa_2 aKa_22 = b2 = this;
        a2 = aKa_22.J(a2);
        int n4 = c2 >> ERa.C & osa.Ja;
        int n5 = c2 >> Yqa.i & osa.Ja;
        int n6 = c2 & osa.Ja;
        c2 = c2 >> osa.c & osa.Ja;
        aKa_22.J(a2, n4, n5, n6, c2);
    }

    /*
     * WARNING - void declaration
     */
    private int J(KLa kLa2, int n2) {
        void a2;
        void b2;
        aKa_2 aKa_22 = this;
        GL11.glBindTexture(BQa.Z, b2.J);
        int n3 = pua.o;
        int c2 = pua.o;
        int n4 = aKa_22.D / AQa.P;
        void v0 = a2 = a2;
        while (v0 < n4) {
            if (aKa_22.f[a2] == b2) {
                if (c2 < 0) {
                    c2 = a2;
                }
            } else if (c2 >= 0) {
                aKa_2 aKa_23 = aKa_22;
                aKa_23.f(c2, (int)a2);
                if (aKa_23.E == ez.TRANSLUCENT) {
                    return (int)a2;
                }
                c2 = pua.o;
                if (n3 < 0) {
                    n3 = a2;
                }
            }
            v0 = ++a2;
        }
        if (c2 >= 0) {
            aKa_22.f(c2, n4);
        }
        if (n3 < 0) {
            n3 = n4;
        }
        return n3;
    }

    /*
     * WARNING - void declaration
     */
    public void J(double d2, double d3, double d4) {
        int d5;
        aKa_2 aKa_22;
        aKa_2 aKa_23 = aKa_22 = this;
        int n2 = aKa_23.l.f();
        int n3 = (aKa_23.D - AQa.P) * n2;
        int n4 = d5 = uSa.E;
        while (n4 < AQa.P) {
            void a2;
            void b2;
            void c2;
            int n5 = n3 + d5 * n2;
            int n6 = n5 + vRa.d;
            int n7 = n6 + vRa.d;
            int n8 = n5;
            aKa_22.A.put(n8, Float.floatToRawIntBits((float)(c2 + aKa_22.C) + Float.intBitsToFloat(aKa_22.A.get(n8))));
            int n9 = n6;
            aKa_22.A.put(n9, Float.floatToRawIntBits((float)(b2 + aKa_22.I) + Float.intBitsToFloat(aKa_22.A.get(n9))));
            int n10 = n7;
            aKa_22.A.put(n10, Float.floatToRawIntBits((float)(a2 + aKa_22.j) + Float.intBitsToFloat(aKa_22.A.get(n10))));
            n4 = ++d5;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static float J(FloatBuffer floatBuffer, float f2, float f3, float f4, int n2, int n3) {
        float c2;
        float d2;
        float e2;
        void f222;
        void a2;
        FloatBuffer b2;
        int n4 = n2;
        FloatBuffer floatBuffer2 = b2 = floatBuffer;
        float f5 = floatBuffer2.get((int)(a2 + f222 * uSa.E + uSa.E));
        float f6 = floatBuffer2.get((int)(a2 + f222 * uSa.E + vRa.d));
        float f7 = floatBuffer2.get((int)(a2 + f222 * uSa.E + uqa.g));
        float f8 = floatBuffer2.get((int)(a2 + f222 * vRa.d + uSa.E));
        float f9 = floatBuffer2.get((int)(a2 + f222 * vRa.d + vRa.d));
        float f10 = floatBuffer2.get((int)(a2 + f222 * vRa.d + uqa.g));
        float f11 = floatBuffer2.get((int)(a2 + f222 * uqa.g + uSa.E));
        float f12 = floatBuffer2.get((int)(a2 + f222 * uqa.g + vRa.d));
        float f13 = floatBuffer2.get((int)(a2 + f222 * uqa.g + uqa.g));
        float f14 = floatBuffer2.get((int)(a2 + f222 * yRa.d + uSa.E));
        float f15 = floatBuffer2.get((int)(a2 + f222 * yRa.d + vRa.d));
        float f222 = floatBuffer2.get((int)(a2 + f222 * yRa.d + uqa.g));
        e2 = (f5 + f8 + f11 + f14) * rta.o - e2;
        d2 = (f6 + f9 + f12 + f15) * rta.o - d2;
        c2 = (f7 + f10 + f13 + f222) * rta.o - c2;
        float f16 = e2;
        float f17 = d2;
        float f18 = c2;
        return f16 * f16 + f17 * f17 + f18 * f18;
    }

    public void l() {
        a.g = vRa.d;
    }

    private int f() {
        aKa_2 a2;
        return a2.A.capacity() * AQa.P / (a2.l.f() * AQa.P);
    }

    public void f() {
        aKa_2 a2;
        aKa_2 aKa_22 = a2;
        a2.D = uSa.E;
        aKa_22.e = null;
        aKa_22.G = uSa.E;
        aKa_22.b = null;
    }

    public void J() {
        aKa_2 a2;
        if (!a2.J) {
            throw new IllegalStateException(wta.w);
        }
        a2.J = uSa.E;
        a2.m.position(uSa.E);
        a2.m.limit(a2.C() * AQa.P);
    }

    public int J() {
        aKa_2 a2;
        return a2.D;
    }

    public boolean J() {
        aKa_2 a2;
        return a2.g;
    }
}

