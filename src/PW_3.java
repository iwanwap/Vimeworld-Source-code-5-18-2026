/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Oz
 *  QFa
 *  Qsa
 *  Zta
 *  jW
 *  pqa
 *  pua
 *  vRa
 */
import com.google.common.base.Predicate;
import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockHelper;

public final class PW_3
extends jW {
    private final int J;
    private final Predicate<IBlockState> A;
    private final IBlockState I;

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF2) {
        void a2;
        void b2;
        PW_3 pW_3 = this;
        float d22 = b2.nextFloat() * pua.j;
        void v0 = a2;
        void v1 = a2;
        double d3 = (float)(v1.getX() + Yqa.i) + Oz.d((float)d22) * (float)pW_3.J / Qsa.k;
        double d4 = (float)(v1.getX() + Yqa.i) - Oz.d((float)d22) * (float)pW_3.J / Qsa.k;
        double d5 = (float)(v0.getZ() + Yqa.i) + Oz.C((float)d22) * (float)pW_3.J / Qsa.k;
        double d6 = (float)(v0.getZ() + Yqa.i) - Oz.C((float)d22) * (float)pW_3.J / Qsa.k;
        double d7 = v0.getY() + b2.nextInt(yRa.d) - uqa.g;
        double d8 = v0.getY() + b2.nextInt(yRa.d) - uqa.g;
        int n2 = a2 = uSa.E;
        while (n2 < pW_3.J) {
            d22 = (float)a2 / (float)pW_3.J;
            double d9 = d3;
            double d10 = d9 + (d4 - d9) * (double)d22;
            double d11 = d7;
            double d12 = d11 + (d8 - d11) * (double)d22;
            double d13 = d5;
            double d14 = d13 + (d6 - d13) * (double)d22;
            double d15 = b2.nextDouble() * (double)pW_3.J / Zta.ba;
            double d16 = (double)(Oz.d((float)(pua.j * d22)) + pqa.r) * d15 + oua.i;
            d15 = (double)(Oz.d((float)(pua.j * d22)) + pqa.r) * d15 + oua.i;
            int d22 = Oz.f((double)(d10 - d16 / KPa.y));
            int n3 = Oz.f((double)(d12 - d15 / KPa.y));
            int n4 = Oz.f((double)(d14 - d16 / KPa.y));
            int n5 = Oz.f((double)(d10 + d16 / KPa.y));
            int n6 = Oz.f((double)(d12 + d15 / KPa.y));
            int n7 = Oz.f((double)(d14 + d16 / KPa.y));
            int n8 = d22 = d22;
            while (n8 <= n5) {
                double d17;
                double d18 = ((double)d22 + kTa.B - d10) / (d16 / KPa.y);
                if (d17 * d17 < oua.i) {
                    int n9 = n3;
                    while (n9 <= n6) {
                        int n10;
                        double d19 = ((double)n10 + kTa.B - d12) / (d15 / KPa.y);
                        double d20 = d18;
                        double d21 = d19;
                        if (d20 * d20 + d21 * d21 < oua.i) {
                            int n11 = n4;
                            while (n11 <= n7) {
                                XF xF3;
                                void c2;
                                int n12;
                                double d23 = ((double)n12 + kTa.B - d14) / (d16 / KPa.y);
                                double d24 = d18;
                                double d25 = d19;
                                double d26 = d23;
                                if (d24 * d24 + d25 * d25 + d26 * d26 < oua.i && pW_3.A.apply(c2.J(xF3 = new XF(d22, n10, n12)))) {
                                    c2.J(xF3, pW_3.I, uqa.g);
                                }
                                n11 = ++n12;
                            }
                        }
                        n9 = ++n10;
                    }
                }
                n8 = ++d22;
            }
            n2 = ++a2;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public PW_3(IBlockState iBlockState, int n2, Predicate<IBlockState> predicate) {
        void b2;
        void c2;
        PW_3 a2;
        Object d2 = predicate;
        PW_3 pW_3 = a2 = this;
        a2.I = c2;
        pW_3.J = b2;
        pW_3.A = d2;
    }

    /*
     * WARNING - void declaration
     */
    public PW_3(IBlockState iBlockState, int n2) {
        void b2;
        int c2 = n2;
        PW_3 a2 = this;
        a2((IBlockState)b2, c2, BlockHelper.J(QFa.Gd));
    }
}

