/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Fc
 *  I
 *  JPa
 *  NTa
 *  QSa
 *  XTa
 *  YSa
 *  aKa
 *  aSa
 *  lqa
 *  pqa
 *  vRa
 *  wra
 *  yQa
 */
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.minecraft.block.Block;
import net.minecraft.block.state.BlockStateBase;
import net.minecraft.block.state.IBlockState;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

public final class Fc_1 {
    public boolean E;
    public long[] m;
    public int C;
    public boolean i;
    public int M;
    public boolean k;
    public int j;
    public boolean J;
    public int A;
    public int I;

    public static void M(aKa aKa2) {
        aKa aKa3 = aKa2;
        aKa a22 = aKa3.i;
        if (a22.I == hpa.Z) {
            if (aKa3.M == XTa.W && aKa3.D % AQa.P == 0) {
                aKa aKa4 = aKa3;
                a22.J(aKa4, aKa4.C() - AQa.P * a22.I);
            }
            aKa aKa5 = a22;
            long l2 = aKa5.m[aKa5.M];
            aKa aKa6 = aKa3;
            int a22 = aKa6.C() - hpa.Z + lqa.s;
            aKa6.A.put(a22, (int)l2);
            aKa3.A.put(a22 + vRa.d, (int)(l2 >> fPa.i));
        }
    }

    public static void e(aKa aKa2) {
        aKa aKa3 = aKa2;
        aKa a2 = aKa3.i;
        if (a2.I == hpa.Z && aKa3.M == XTa.W && aKa3.D % AQa.P == 0) {
            aKa aKa4 = aKa3;
            a2.J(aKa4, aKa4.C() - AQa.P * a2.I);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void J(IBlockState iBlockState, XF xF, I i2, aKa aKa2) {
        void a2;
        int n2;
        int n3;
        int d22;
        IBlockState b2;
        IBlockState d22 = i2;
        IBlockState iBlockState2 = b2 = iBlockState;
        Block c22 = iBlockState2.J();
        if (iBlockState2 instanceof BlockStateBase) {
            BlockStateBase blockStateBase = (BlockStateBase)b2;
            d22 = blockStateBase.l();
            n3 = blockStateBase.f();
            n2 = d22;
        } else {
            d22 = Block.J(c22);
            n3 = c22.f(b2);
            n2 = d22;
        }
        d22 = AC.J(n2, n3);
        int c22 = ((c22.J().ordinal() & yQa.j) << ERa.C) + (d22 & yQa.j);
        d22 = n3 & yQa.j;
        a2.i.J(((long)d22 << fPa.i) + (long)c22);
    }

    public static boolean J(boolean bl, aKa aKa2) {
        aKa b2 = aKa2;
        boolean a2 = bl;
        b2.i.J();
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(int n2, int n3, int n4, aKa aKa2) {
        void b2;
        Object d2 = aKa2;
        int a2 = n2;
        if (b2 != false) {
            void c2;
            int n5 = d2.J().C();
            if (n5 == Upa.D) {
                d2 = d2.J();
                ((ByteBuffer)d2).position(fPa.i);
                GL20.glVertexAttribPointer(pA.wb, uqa.g, JPa.la, uSa.E != 0, n5, (ByteBuffer)d2);
                ((ByteBuffer)d2).position(wra.P);
                GL20.glVertexAttribPointer(pA.ra, AQa.P, Yua.W, uSa.E != 0, n5, (ByteBuffer)d2);
                ((ByteBuffer)d2).position(QSa.p);
                GL20.glVertexAttribPointer(pA.hb, yRa.d, Yua.W, uSa.E != 0, n5, (ByteBuffer)d2);
                ((ByteBuffer)d2).position(uSa.E);
                GL20.glEnableVertexAttribArray(pA.wb);
                GL20.glEnableVertexAttribArray(pA.ra);
                GL20.glEnableVertexAttribArray(pA.hb);
                GL11.glDrawArrays(a2, (int)c2, (int)b2);
                GL20.glDisableVertexAttribArray(pA.wb);
                GL20.glDisableVertexAttribArray(pA.ra);
                GL20.glDisableVertexAttribArray(pA.hb);
                return;
            }
            GL11.glDrawArrays(a2, (int)c2, (int)b2);
        }
    }

    public void J() {
        Fc_1 a2;
        Fc_1 fc_1 = a2;
        a2.m[fc_1.M] = nqa.i;
        fc_1.M -= vRa.d;
    }

    public void J(aKa aKa2, int n2) {
        FloatBuffer b2;
        int c2 = n2;
        Fc_1 a2 = this;
        void v0 = b2;
        b2 = v0.F;
        IntBuffer intBuffer = v0.A;
        v0.C();
        FloatBuffer floatBuffer = b2;
        float f2 = floatBuffer.get(c2 + uSa.E * a2.I);
        float f3 = floatBuffer.get(c2 + uSa.E * a2.I + vRa.d);
        float f4 = floatBuffer.get(c2 + uSa.E * a2.I + uqa.g);
        float f5 = floatBuffer.get(c2 + uSa.E * a2.I + a2.A);
        float f6 = floatBuffer.get(c2 + uSa.E * a2.I + a2.A + vRa.d);
        float f7 = floatBuffer.get(c2 + vRa.d * a2.I);
        float f8 = floatBuffer.get(c2 + vRa.d * a2.I + vRa.d);
        float f9 = floatBuffer.get(c2 + vRa.d * a2.I + uqa.g);
        float f10 = floatBuffer.get(c2 + vRa.d * a2.I + a2.A);
        float f11 = floatBuffer.get(c2 + vRa.d * a2.I + a2.A + vRa.d);
        float f12 = floatBuffer.get(c2 + uqa.g * a2.I);
        float f13 = floatBuffer.get(c2 + uqa.g * a2.I + vRa.d);
        float f14 = floatBuffer.get(c2 + uqa.g * a2.I + uqa.g);
        float f15 = floatBuffer.get(c2 + uqa.g * a2.I + a2.A);
        float f16 = floatBuffer.get(c2 + uqa.g * a2.I + a2.A + vRa.d);
        float f17 = floatBuffer.get(c2 + yRa.d * a2.I);
        float f18 = floatBuffer.get(c2 + yRa.d * a2.I + vRa.d);
        float f19 = floatBuffer.get(c2 + yRa.d * a2.I + uqa.g);
        float f20 = floatBuffer.get(c2 + yRa.d * a2.I + a2.A);
        float f21 = floatBuffer.get(c2 + yRa.d * a2.I + a2.A + vRa.d);
        float f22 = f12 - f2;
        float f23 = f13 - f3;
        float f24 = f14 - f4;
        float f25 = f23 * (f19 -= f9) - (f18 -= f8) * f24;
        float f26 = f24 * (f17 -= f7) - f19 * f22;
        float f27 = f22 * f18 - f17 * f23;
        float f28 = f25;
        float f29 = f26;
        float f30 = f27;
        float f31 = f28 * f28 + f29 * f29 + f30 * f30;
        float f32 = (double)f31 != aSa.V ? (float)(oua.i / Math.sqrt(f31)) : pqa.r;
        f25 *= f32;
        f26 *= f32;
        f27 *= f32;
        f22 = f7 - f2;
        f23 = f8 - f3;
        f24 = f9 - f4;
        f7 = f10 - f5;
        f8 = f11 - f6;
        f17 = f12 - f2;
        f18 = f13 - f3;
        f19 = f14 - f4;
        f2 = f15 - f5;
        f3 = f16 - f6;
        f4 = f7 * f3 - f2 * f8;
        f9 = f4 != JPa.N ? pqa.r / f4 : pqa.r;
        f4 = (f3 * f22 - f8 * f17) * f9;
        f12 = (f3 * f23 - f8 * f18) * f9;
        f3 = (f3 * f24 - f8 * f19) * f9;
        f8 = (f7 * f17 - f2 * f22) * f9;
        f13 = (f7 * f18 - f2 * f23) * f9;
        f2 = (f7 * f19 - f2 * f24) * f9;
        float f33 = f4;
        float f34 = f12;
        float f35 = f3;
        f31 = f33 * f33 + f34 * f34 + f35 * f35;
        f32 = (double)f31 != aSa.V ? (float)(oua.i / Math.sqrt(f31)) : pqa.r;
        f4 *= f32;
        f12 *= f32;
        f3 *= f32;
        float f36 = f8;
        float f37 = f13;
        float f38 = f2;
        f31 = f36 * f36 + f37 * f37 + f38 * f38;
        f32 = (double)f31 != aSa.V ? (float)(oua.i / Math.sqrt(f31)) : pqa.r;
        f7 = f27 * f12 - f26 * f3;
        f9 = f25 * f3 - f27 * f4;
        f14 = f26 * f4 - f25 * f12;
        f2 = (f8 *= f32) * f7 + (f13 *= f32) * f9 + (f2 *= f32) * f14 < JPa.N ? vqa.T : pqa.r;
        int n3 = (int)(f25 * gua.R) & osa.Ja;
        int n4 = (int)(f26 * gua.R) & osa.Ja;
        n3 = (((int)(f27 * gua.R) & osa.Ja) << ERa.C) + (n4 << Yqa.i) + n3;
        intBuffer.put(c2 + uSa.E * a2.I + a2.j, n3);
        intBuffer.put(c2 + vRa.d * a2.I + a2.j, n3);
        intBuffer.put(c2 + uqa.g * a2.I + a2.j, n3);
        intBuffer.put(c2 + yRa.d * a2.I + a2.j, n3);
        int n5 = ((int)(f4 * ypa.Y) & yQa.j) + (((int)(f12 * ypa.Y) & yQa.j) << ERa.C);
        int n6 = ((int)(f3 * ypa.Y) & yQa.j) + (((int)(f2 * ypa.Y) & yQa.j) << ERa.C);
        intBuffer.put(c2 + uSa.E * a2.I + NTa.C, n5);
        intBuffer.put(c2 + uSa.E * a2.I + NTa.C + vRa.d, n6);
        intBuffer.put(c2 + vRa.d * a2.I + NTa.C, n5);
        intBuffer.put(c2 + vRa.d * a2.I + NTa.C + vRa.d, n6);
        intBuffer.put(c2 + uqa.g * a2.I + NTa.C, n5);
        intBuffer.put(c2 + uqa.g * a2.I + NTa.C + vRa.d, n6);
        intBuffer.put(c2 + yRa.d * a2.I + NTa.C, n5);
        intBuffer.put(c2 + yRa.d * a2.I + NTa.C + vRa.d, n6);
        float f39 = (f5 + f10 + f15 + f20) / YSa.G;
        float f40 = (f6 + f11 + f16 + f21) / YSa.G;
        b2.put(c2 + uSa.E * a2.I + Yqa.i, f39);
        b2.put(c2 + uSa.E * a2.I + Yqa.i + vRa.d, f40);
        b2.put(c2 + vRa.d * a2.I + Yqa.i, f39);
        b2.put(c2 + vRa.d * a2.I + Yqa.i + vRa.d, f40);
        b2.put(c2 + uqa.g * a2.I + Yqa.i, f39);
        b2.put(c2 + uqa.g * a2.I + Yqa.i + vRa.d, f40);
        b2.put(c2 + yRa.d * a2.I + Yqa.i, f39);
        b2.put(c2 + yRa.d * a2.I + Yqa.i + vRa.d, f40);
    }

    public Fc_1() {
        Fc_1 a2;
        Fc_1 fc_1 = a2;
        fc_1.m = new long[NTa.C];
        fc_1.M = uSa.E;
        fc_1.m[a2.M] = nqa.i;
    }

    public void J(long a2) {
        Fc_1 b2;
        Fc_1 fc_1 = b2;
        fc_1.M += vRa.d;
        fc_1.m[b2.M] = a2;
    }

    public static void d(aKa a2) {
        if (a2.D == 0) {
            Fc_1.f(a2);
        }
    }

    public static void C(aKa a2) {
        a2.i.J();
    }

    public static void l(aKa aKa2) {
        aKa aKa3 = aKa2;
        if (aKa3.J().l() && aKa3.M == XTa.W && aKa3.D % AQa.P == 0) {
            int n2;
            aKa aKa4 = aKa3;
            aKa a2 = aKa4.i;
            Fc_1.f(aKa4);
            int n3 = aKa4.D * a2.I;
            int n4 = n2 = uSa.E;
            while (n4 < n3) {
                int n5 = n2;
                a2.J(aKa3, n5);
                n4 = n5 + a2.I * AQa.P;
            }
        }
    }

    public static void f(aKa aKa2) {
        aKa aKa3;
        aKa aKa4 = aKa3 = aKa2;
        Fc fc2 = aKa4.i;
        hKa a2 = aKa4.J();
        Fc fc3 = fc2;
        fc2.I = a2.C() / AQa.P;
        fc2.J = fc2.E = a2.l();
        fc3.i = a2.J(uSa.E);
        fc3.j = fc2.E ? a2.J() / AQa.P : uSa.E;
        fc2.A = fc2.i ? a2.f(uSa.E) / AQa.P : uSa.E;
        fc2.C = Yqa.i;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(aKa aKa2, int[] nArray) {
        aKa aKa3 = aKa2;
        if (aKa3.D == 0) {
            Fc_1.f(aKa3);
        }
        aKa b2 = aKa3.i;
        if (b2.I == hpa.Z) {
            void a2;
            aKa aKa4 = b2;
            long l2 = aKa4.m[aKa4.M];
            int n2 = b2 = lqa.s;
            while (n2 + vRa.d < ((void)a2).length) {
                void v2 = a2;
                v2[b2] = (int)l2;
                int n3 = b2 + vRa.d;
                v2[n3] = (int)(l2 >> fPa.i);
                n2 = b2 += 14;
            }
        }
    }

    public static void J(aKa a2) {
        aKa aKa2 = a2;
        aKa2.i = new Fc_1();
    }
}

