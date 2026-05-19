/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  I
 *  JPa
 *  Kpa
 *  Lra
 *  MQa
 *  NQa
 *  Oz
 *  Qsa
 *  XE
 *  XSa
 *  Yra
 *  Zta
 *  aKa
 *  aSa
 *  nQa
 *  pqa
 *  vRa
 *  yQa
 */
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class sla_2 {
    private KLa[] J;
    private KLa[] A = new KLa[uqa.g];
    private static final String I = "CL_00002519";

    public sla_2() {
        sla_2 a2;
        a2.J = new KLa[uqa.g];
        a2.J();
    }

    public void J() {
        sla_2 sla_22 = this;
        WKa a2 = Kpa.J().J();
        sla_2 sla_23 = sla_22;
        sla_23.A[uSa.E] = a2.J(UTa.t);
        sla_23.A[vRa.d] = a2.J(KQa.z);
        sla_23.J[uSa.E] = a2.J(Lra.v);
        sla_23.J[vRa.d] = a2.J(nQa.p);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(I i2, IBlockState iBlockState, XF xF2, aKa aKa2) {
        int e2222;
        float f2;
        float f3;
        float f4;
        float f5;
        void a2;
        float f6;
        boolean[] blArray;
        void b2;
        void d2;
        void c322;
        sla_2 sla_22 = this;
        BlockLiquid blockLiquid = (BlockLiquid)c322.J();
        blockLiquid.J((I)d2, (XF)b2);
        KLa[] kLaArray = blockLiquid.J() == Material.lava ? sla_22.A : sla_22.J;
        void v0 = d2;
        JE e2222 = JE.J((I)v0, (IBlockState)c322, (XF)b2);
        int c322 = XE.J((I)v0, (IBlockState)c322, (XF)b2, (JE)e2222);
        float f7 = (float)(c322 >> ERa.C & osa.Ja) / NQa.Y;
        float f8 = (float)(c322 >> Yqa.i & osa.Ja) / NQa.Y;
        float c322 = (float)(c322 & osa.Ja) / NQa.Y;
        BlockLiquid blockLiquid2 = blockLiquid;
        boolean e2222 = blockLiquid2.J((I)d2, b2.up(), DZ.UP);
        boolean bl = blockLiquid2.J((I)d2, b2.down(), DZ.DOWN);
        boolean[] blArray2 = blArray = e2222.J();
        boolean[] blArray3 = blArray;
        blArray2[uSa.E] = blockLiquid.J((I)d2, b2.north(), DZ.NORTH);
        blArray3[vRa.d] = blockLiquid.J((I)d2, b2.south(), DZ.SOUTH);
        blArray2[uqa.g] = blockLiquid.J((I)d2, b2.west(), DZ.WEST);
        blArray3[yRa.d] = blockLiquid.J((I)d2, b2.east(), DZ.EAST);
        if (!(e2222 || bl || blArray[uSa.E] || blArray[vRa.d] || blArray[uqa.g] || blArray[yRa.d])) {
            return uSa.E != 0;
        }
        int n2 = uSa.E;
        float f9 = MQa.L;
        float f10 = pqa.r;
        float f11 = xSa.la;
        float f12 = Ora.D;
        Material material = blockLiquid.J();
        sla_2 sla_23 = sla_22;
        void v5 = d2;
        sla_2 sla_24 = sla_22;
        float f13 = sla_24.J((I)d2, (XF)b2, material);
        float f14 = sla_24.J((I)d2, b2.south(), material);
        float f15 = sla_23.J((I)v5, b2.east().south(), material);
        void v7 = b2;
        float f16 = sla_23.J((I)v5, v7.east(), material);
        void v8 = b2;
        double d3 = v8.getX();
        double d4 = v8.getY();
        double d5 = v7.getZ();
        float f17 = ZSa.r;
        if (e2222) {
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            BlockLiquid blockLiquid3;
            float f23;
            n2 = vRa.d;
            KLa e2222 = kLaArray[uSa.E];
            f6 = (float)BlockLiquid.J((I)d2, (XF)b2, material);
            if (f23 > XSa.Y) {
                e2222 = kLaArray[vRa.d];
            }
            a2.f(e2222);
            f13 -= f17;
            f14 -= f17;
            f15 -= f17;
            f16 -= f17;
            if (f6 < XSa.Y) {
                blockLiquid3 = blockLiquid;
                KLa kLa2 = e2222;
                f5 = kLa2.J(aSa.V);
                f22 = kLa2.f(aSa.V);
                f4 = f5;
                f21 = kLa2.f(Zta.ba);
                f20 = kLa2.J(Zta.ba);
                f19 = f21;
                f18 = f20;
                f3 = f22;
            } else {
                float f24 = Oz.d((float)f6) * rta.o;
                float f25 = Oz.C((float)f6) * rta.o;
                float f26 = Qsa.k;
                blockLiquid3 = blockLiquid;
                KLa kLa3 = e2222;
                f5 = kLa3.J((double)(Qsa.k + (-f25 - f24) * Yra.i));
                f22 = kLa3.f((double)(Qsa.k + (-f25 + f24) * Yra.i));
                f4 = kLa3.J((double)(Qsa.k + (-f25 + f24) * Yra.i));
                f21 = kLa3.f((double)(Qsa.k + (f25 + f24) * Yra.i));
                f20 = kLa3.J((double)(Qsa.k + (f25 + f24) * Yra.i));
                f19 = kLa3.f((double)(Qsa.k + (f25 - f24) * Yra.i));
                f18 = kLa3.J((double)(Qsa.k + (f25 - f24) * Yra.i));
                f3 = kLa3.f((double)(Qsa.k + (-f25 - f24) * Yra.i));
            }
            int n3 = blockLiquid3.f((I)d2, (XF)b2);
            int n4 = n3 >> ERa.C & yQa.j;
            int n5 = n3 & yQa.j;
            float f27 = f10 * f7;
            float f28 = f10 * f8;
            f2 = f10 * c322;
            void v13 = a2;
            double d6 = d3;
            a2.J(d3 + aSa.V, d4 + (double)f13, d5 + aSa.V).J(f27, f28, f2, pqa.r).J((double)f5, (double)f22).J(n4, n5).M();
            a2.J(d6 + aSa.V, d4 + (double)f14, d5 + oua.i).J(f27, f28, f2, pqa.r).J((double)f4, (double)f21).J(n4, n5).M();
            v13.J(d6 + oua.i, d4 + (double)f15, d5 + oua.i).J(f27, f28, f2, pqa.r).J((double)f20, (double)f19).J(n4, n5).M();
            v13.J(d3 + oua.i, d4 + (double)f16, d5 + aSa.V).J(f27, f28, f2, pqa.r).J((double)f18, (double)f3).J(n4, n5).M();
            if (blockLiquid.f((I)d2, b2.up())) {
                void v15 = a2;
                double d7 = d3;
                a2.J(d3 + aSa.V, d4 + (double)f13, d5 + aSa.V).J(f27, f28, f2, pqa.r).J((double)f5, (double)f22).J(n4, n5).M();
                a2.J(d7 + oua.i, d4 + (double)f16, d5 + aSa.V).J(f27, f28, f2, pqa.r).J((double)f18, (double)f3).J(n4, n5).M();
                v15.J(d7 + oua.i, d4 + (double)f15, d5 + oua.i).J(f27, f28, f2, pqa.r).J((double)f20, (double)f19).J(n4, n5).M();
                v15.J(d3 + aSa.V, d4 + (double)f14, d5 + oua.i).J(f27, f28, f2, pqa.r).J((double)f4, (double)f21).J(n4, n5).M();
            }
        }
        if (bl) {
            float e2222 = kLaArray[uSa.E].l();
            f6 = kLaArray[uSa.E].C();
            f5 = kLaArray[uSa.E].J();
            f4 = kLaArray[uSa.E].f();
            int n6 = blockLiquid.f((I)d2, b2.down());
            int n7 = n6 >> ERa.C & yQa.j;
            int n8 = n6 & yQa.j;
            void v17 = a2;
            double d8 = d3;
            float f29 = f9;
            a2.J(d3, d4, d5 + oua.i).J(f29, f29, f29, pqa.r).J((double)e2222, (double)f4).J(n7, n8).M();
            float f30 = f9;
            a2.J(d8, d4, d5).J(f30, f30, f30, pqa.r).J((double)e2222, (double)f5).J(n7, n8).M();
            float f31 = f9;
            v17.J(d8 + oua.i, d4, d5).J(f31, f31, f31, pqa.r).J((double)f6, (double)f5).J(n7, n8).M();
            float f32 = f9;
            v17.J(d3 + oua.i, d4, d5 + oua.i).J(f32, f32, f32, pqa.r).J((double)f6, (double)f4).J(n7, n8).M();
            n2 = vRa.d;
        }
        int n9 = e2222 = uSa.E;
        while (n9 < AQa.P) {
            int n10 = uSa.E;
            int n11 = uSa.E;
            if (e2222 == 0) {
                --n11;
            }
            if (e2222 == vRa.d) {
                ++n11;
            }
            if (e2222 == uqa.g) {
                --n10;
            }
            if (e2222 == yRa.d) {
                ++n10;
            }
            XF xF3 = b2.add(n10, uSa.E, n11);
            KLa kLa4 = kLaArray[vRa.d];
            a2.f(kLa4);
            if (blArray[e2222]) {
                double d9;
                double d10;
                double d11;
                double d12;
                float f33;
                if (e2222 == 0) {
                    f3 = f13;
                    f33 = f16;
                    d12 = d3;
                    d11 = d3 + oua.i;
                    d10 = d5 + (double)f17;
                    d9 = d5 + (double)f17;
                } else if (e2222 == vRa.d) {
                    f3 = f15;
                    f33 = f14;
                    d12 = d3 + oua.i;
                    d11 = d3;
                    d10 = d5 + oua.i - (double)f17;
                    d9 = d5 + oua.i - (double)f17;
                } else if (e2222 == uqa.g) {
                    f3 = f14;
                    f33 = f13;
                    d12 = d3 + (double)f17;
                    d11 = d3 + (double)f17;
                    d10 = d5 + oua.i;
                    d9 = d5;
                } else {
                    f3 = f16;
                    f33 = f15;
                    d12 = d3 + oua.i - (double)f17;
                    d11 = d3 + oua.i - (double)f17;
                    d10 = d5;
                    d9 = d5 + oua.i;
                }
                n2 = vRa.d;
                KLa kLa5 = kLa4;
                f2 = kLa5.J(aSa.V);
                float f34 = kLa5.J(Wqa.Z);
                f9 = kLa5.f((double)((pqa.r - f3) * Yra.i * MQa.L));
                float f35 = kLa5.f((double)((pqa.r - f33) * Yra.i * MQa.L));
                float f36 = kLa5.f(Wqa.Z);
                int n12 = blockLiquid.f((I)d2, xF3);
                int n13 = n12 >> ERa.C & yQa.j;
                n12 &= yQa.j;
                float f37 = e2222 < uqa.g ? f11 : f12;
                float f38 = f10 * f37 * f7;
                float f39 = f10 * f37 * f8;
                f37 = f10 * f37 * c322;
                void v25 = a2;
                double d13 = d11;
                void v27 = a2;
                void v28 = a2;
                a2.J(d12, d4 + (double)f3, d10).J(f38, f39, f37, pqa.r).J((double)f2, (double)f9).J(n13, n12).M();
                v28.J(d11, d4 + (double)f33, d9).J(f38, f39, f37, pqa.r).J((double)f34, (double)f35).J(n13, n12).M();
                v28.J(d11, d4 + aSa.V, d9).J(f38, f39, f37, pqa.r).J((double)f34, (double)f36).J(n13, n12).M();
                v27.J(d12, d4 + aSa.V, d10).J(f38, f39, f37, pqa.r).J((double)f2, (double)f36).J(n13, n12).M();
                v27.J(d12, d4 + aSa.V, d10).J(f38, f39, f37, pqa.r).J((double)f2, (double)f36).J(n13, n12).M();
                a2.J(d13, d4 + aSa.V, d9).J(f38, f39, f37, pqa.r).J((double)f34, (double)f36).J(n13, n12).M();
                v25.J(d13, d4 + (double)f33, d9).J(f38, f39, f37, pqa.r).J((double)f34, (double)f35).J(n13, n12).M();
                v25.J(d12, d4 + (double)f3, d10).J(f38, f39, f37, pqa.r).J((double)f2, (double)f9).J(n13, n12).M();
            }
            n9 = ++e2222;
        }
        a2.f((KLa)null);
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private float J(I i2, XF xF2, Material material) {
        int n2;
        sla_2 sla_22 = this;
        int n3 = uSa.E;
        float f2 = JPa.N;
        int n4 = n2 = uSa.E;
        while (n4 < AQa.P) {
            void a2;
            void c2;
            void b2;
            Object d22 = b2.add(-(n2 & vRa.d), uSa.E, -(n2 >> vRa.d & vRa.d));
            if (c2.J(((XF)((Object)d22)).up()).J().J() == a2) {
                return pqa.r;
            }
            Material material2 = (d22 = c2.J((XF)((Object)d22))).J().J();
            if (material2 != a2) {
                if (!material2.i()) {
                    ++n3;
                    f2 += pqa.r;
                }
            } else {
                int d22 = d22.J(BlockLiquid.LEVEL);
                if (d22 >= Yqa.i || d22 == 0) {
                    n3 += 10;
                    f2 += BlockLiquid.J(d22) * FRa.Ga;
                }
                ++n3;
                f2 += BlockLiquid.J(d22);
            }
            n4 = ++n2;
        }
        return pqa.r - f2 / (float)n3;
    }
}

