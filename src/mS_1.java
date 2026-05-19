/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Dt
 *  FPa
 *  Fpa
 *  Hda
 *  JPa
 *  Kh
 *  Kpa
 *  MQa
 *  NQa
 *  NTa
 *  Oz
 *  Qqa
 *  RR
 *  Ssa
 *  YSa
 *  ZOa
 *  aT
 *  jt
 *  kba
 *  kta
 *  mS
 *  pQa
 *  pqa
 *  uKa
 *  uw
 *  vRa
 *  wOa
 */
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import net.minecraft.util.ResourceLocation;

public final class mS_1
extends aT {
    private static final int m = 10;
    public static final mS C = new mS_1();
    private final Kpa i;
    private static final ResourceLocation M = new ResourceLocation(gua.fa);
    private static final boolean k = true;
    private int J;
    public static final String A = "##TEffectHud";

    public void f() {
        mS_1 a2;
        mS_1 mS_12 = a2;
        super.f();
        mS_12.A();
    }

    public static void D() {
        mS_1.C.k.J((float)jt.v * MQa.L);
        mS_1.C.J.J((float)jt.v * MQa.L);
        RR.J((Bp)C, (boolean)jt.K);
    }

    public float e() {
        mS_1 a2;
        return wOa.h + jt.o * a2.J;
    }

    public float d() {
        mS_1 mS_12 = this;
        int a2 = mS_12.i.c.J().size();
        if (a2 == 0) {
            return JPa.N;
        }
        return a2 * yOa.B + (a2 - vRa.d) * uqa.g;
    }

    public mS_1() {
        mS_1 a2;
        mS_1 mS_12 = a2;
        super(vTa.M);
        mS_12.i = Kpa.J();
        mS_12.d.J(YSa.G);
        mS_12.b.J(kta.v);
        mS_12.A();
    }

    private void A() {
        mS_1 a2;
        a2.J = a2.i.Ea.J(pQa.ja);
    }

    /*
     * WARNING - void declaration
     */
    public void J(long l2) {
        mS_1 mS_12 = this;
        if (uw.d) {
            return;
        }
        Collection collection = mS_12.i.c.J();
        if (!collection.isEmpty()) {
            int n2;
            kba[] kbaArray = collection.toArray(new kba[uSa.E]);
            Arrays.sort(kbaArray, Comparator.comparingInt(Dt.J()).reversed());
            int n3 = uSa.E;
            kba[] kbaArray2 = kbaArray;
            int n4 = kbaArray.length;
            int n5 = n2 = uSa.E;
            while (n5 < n4) {
                Hda hda;
                void a2;
                mS_1 b22 = kbaArray2[n2];
                Object object = Hda.A[b22.f()];
                int b22 = b22.l() / kTa.j;
                uKa.e();
                int n6 = jt.G;
                if (b22 < NTa.C) {
                    float f2 = (Oz.C((float)((float)Math.toRadians((double)a2 * Qqa.b % ZOa.Ja))) + pqa.r) * MQa.L;
                    n6 = mS_1.l((int)n6, (int)Math.max(tTa.h, (int)(f2 * NQa.Y)));
                    uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)f2);
                    hda = object;
                } else {
                    uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
                    hda = object;
                }
                int n7 = hda.f();
                mS_12.i.J().J(M);
                Kh.J((int)uSa.E, (int)n3, (float)(n7 % Yqa.i * yOa.B), (float)(FPa.e + n7 / Yqa.i * yOa.B), (float)vqa.A, (float)vqa.A, (float)Fpa.q, (float)Fpa.q);
                uKa.D();
                object = b22 < Jpa.z ? b22 / Psa.M + Era.Aa + mS_1.toString(b22 % Psa.M, uqa.g) : Ssa.b;
                float f3 = n3 + (jt.o == vRa.d ? tTa.h : uSa.E);
                n3 += 20;
                mS_12.J((long)a2, (String)object, POa.Aa, f3, jt.o, uSa.E != 0, jt.C, n6, vRa.d != 0);
                n5 = ++n2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static String toString(int n2, int n3) {
        void a2;
        StringBuilder b2;
        int n4 = n2;
        StringBuilder stringBuilder = b2 = new StringBuilder(n4 + Mqa.y);
        while (stringBuilder.length() < a2) {
            StringBuilder stringBuilder2 = b2;
            stringBuilder = stringBuilder2;
            stringBuilder2.insert(uSa.E, GPa.J);
        }
        if (b2.length() > a2) {
            return b2.substring(uSa.E, (int)a2);
        }
        return b2.toString();
    }
}

