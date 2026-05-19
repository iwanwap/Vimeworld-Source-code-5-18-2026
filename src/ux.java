/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  KV
 *  NTa
 *  QFa
 *  XTa
 *  Xv
 *  Ypa
 *  fv
 *  lqa
 *  vRa
 */
import java.util.Random;
import net.minecraft.block.state.IBlockState;

public final class ux
extends KV {
    /*
     * WARNING - void declaration
     */
    public ux(DZ dZ2, fv fv2, Random random) {
        void c2;
        ux d2 = fv2;
        ux b2 = this;
        super(vRa.d, (DZ)c2, (fv)d2, uqa.g, uqa.g, uqa.g);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv) {
        int n2;
        void c2;
        ux a2;
        ux d2 = xv;
        ux ux2 = a2 = this;
        ux2.J((Gg)c2, (Xv)d2, vRa.d, Yqa.i, uSa.E, hpa.Z, Yqa.i, hpa.Z, field_175828_a);
        int b2 = XTa.W;
        IBlockState iBlockState = field_175826_b;
        int n3 = b2;
        IBlockState iBlockState2 = iBlockState;
        ux2.J((Gg)c2, (Xv)d2, uSa.E, n3, uSa.E, uSa.E, n3, Ypa.A, iBlockState2, iBlockState2, uSa.E != 0);
        int n4 = b2;
        IBlockState iBlockState3 = iBlockState;
        ux2.J((Gg)c2, (Xv)d2, Ypa.A, n4, uSa.E, Ypa.A, n4, Ypa.A, iBlockState3, iBlockState3, uSa.E != 0);
        int n5 = b2;
        IBlockState iBlockState4 = iBlockState;
        ux2.J((Gg)c2, (Xv)d2, vRa.d, n5, uSa.E, Ypa.A, n5, uSa.E, iBlockState4, iBlockState4, uSa.E != 0);
        int n6 = b2;
        IBlockState iBlockState5 = iBlockState;
        ux2.J((Gg)c2, (Xv)d2, vRa.d, n6, Ypa.A, hpa.Z, n6, Ypa.A, iBlockState5, iBlockState5, uSa.E != 0);
        int n7 = b2 = vRa.d;
        while (n7 <= uua.p) {
            iBlockState = field_175826_b;
            if (b2 == uqa.g || b2 == uua.p) {
                iBlockState = field_175828_a;
            }
            int n8 = uSa.E;
            while (n8 <= Ypa.A) {
                ux ux3 = a2;
                void v12 = c2;
                int n9 = n2;
                IBlockState iBlockState6 = iBlockState;
                a2.J((Gg)v12, (Xv)d2, n9, b2, uSa.E, n9, b2, vRa.d, iBlockState6, iBlockState6, uSa.E != 0);
                int n10 = n2;
                IBlockState iBlockState7 = iBlockState;
                ux3.J((Gg)v12, (Xv)d2, n10, b2, uua.p, n10, b2, WOa.fa, iBlockState7, iBlockState7, uSa.E != 0);
                int n11 = n2;
                IBlockState iBlockState8 = iBlockState;
                ux3.J((Gg)c2, (Xv)d2, n11, b2, hpa.Z, n11, b2, Ypa.A, iBlockState8, iBlockState8, uSa.E != 0);
                n8 = n2 += 15;
            }
            void v19 = c2;
            ux ux4 = d2;
            int n12 = b2;
            IBlockState iBlockState9 = iBlockState;
            a2.J((Gg)c2, (Xv)d2, vRa.d, n12, uSa.E, vRa.d, n12, uSa.E, iBlockState9, iBlockState9, uSa.E != 0);
            int n13 = b2;
            IBlockState iBlockState10 = iBlockState;
            a2.J((Gg)c2, (Xv)ux4, uua.p, n13, uSa.E, WOa.fa, n13, uSa.E, iBlockState10, iBlockState10, uSa.E != 0);
            int n14 = b2;
            IBlockState iBlockState11 = iBlockState;
            a2.J((Gg)v19, (Xv)ux4, hpa.Z, n14, uSa.E, hpa.Z, n14, uSa.E, iBlockState11, iBlockState11, uSa.E != 0);
            int n15 = b2++;
            IBlockState iBlockState12 = iBlockState;
            a2.J((Gg)v19, (Xv)d2, vRa.d, n15, Ypa.A, hpa.Z, n15, Ypa.A, iBlockState12, iBlockState12, uSa.E != 0);
            n7 = b2;
        }
        void v29 = c2;
        a2.J((Gg)v29, (Xv)d2, uua.p, yRa.d, uua.p, WOa.fa, uua.p, WOa.fa, field_175827_c, field_175827_c, uSa.E != 0);
        a2.J((Gg)v29, (Xv)d2, XTa.W, AQa.P, XTa.W, Yqa.i, tTa.h, Yqa.i, QFa.WC.J(), QFa.WC.J(), uSa.E != 0);
        int n16 = b2 = yRa.d;
        while (n16 <= uua.p) {
            int n17 = uua.p;
            while (n17 <= WOa.fa) {
                ux ux5 = a2;
                ux5.f((Gg)c2, field_175825_e, n2, b2, uua.p, (Xv)d2);
                int n18 = n2;
                ux5.f((Gg)c2, field_175825_e, n18, b2, WOa.fa, (Xv)d2);
                n17 = n2 += 3;
            }
            n16 = b2 += 3;
        }
        void v34 = c2;
        ux ux6 = d2;
        ux ux7 = a2;
        void v37 = c2;
        ux ux8 = d2;
        ux ux9 = a2;
        void v40 = c2;
        ux ux10 = d2;
        ux ux11 = a2;
        void v43 = c2;
        ux ux12 = d2;
        ux ux13 = a2;
        void v46 = c2;
        ux ux14 = d2;
        ux ux15 = a2;
        void v49 = c2;
        ux ux16 = d2;
        ux ux17 = a2;
        void v52 = c2;
        ux ux18 = d2;
        a2.J((Gg)c2, (Xv)d2, tTa.h, vRa.d, uua.p, tTa.h, uqa.g, uua.p, field_175826_b, field_175826_b, uSa.E != 0);
        a2.J((Gg)c2, (Xv)ux18, tTa.h, vRa.d, WOa.fa, tTa.h, uqa.g, WOa.fa, field_175826_b, field_175826_b, uSa.E != 0);
        a2.J((Gg)v52, (Xv)ux18, NTa.C, vRa.d, uua.p, NTa.C, uqa.g, uua.p, field_175826_b, field_175826_b, uSa.E != 0);
        ux17.J((Gg)v52, (Xv)d2, NTa.C, vRa.d, WOa.fa, NTa.C, uqa.g, WOa.fa, field_175826_b, field_175826_b, uSa.E != 0);
        ux17.J((Gg)c2, (Xv)d2, uua.p, vRa.d, tTa.h, uua.p, uqa.g, tTa.h, field_175826_b, field_175826_b, uSa.E != 0);
        a2.J((Gg)c2, (Xv)ux16, WOa.fa, vRa.d, tTa.h, WOa.fa, uqa.g, tTa.h, field_175826_b, field_175826_b, uSa.E != 0);
        a2.J((Gg)v49, (Xv)ux16, uua.p, vRa.d, NTa.C, uua.p, uqa.g, NTa.C, field_175826_b, field_175826_b, uSa.E != 0);
        ux15.J((Gg)v49, (Xv)d2, WOa.fa, vRa.d, NTa.C, WOa.fa, uqa.g, NTa.C, field_175826_b, field_175826_b, uSa.E != 0);
        ux15.J((Gg)c2, (Xv)d2, tTa.h, uqa.g, tTa.h, tTa.h, uua.p, tTa.h, field_175826_b, field_175826_b, uSa.E != 0);
        a2.J((Gg)c2, (Xv)ux14, tTa.h, uqa.g, NTa.C, tTa.h, uua.p, NTa.C, field_175826_b, field_175826_b, uSa.E != 0);
        a2.J((Gg)v46, (Xv)ux14, NTa.C, uqa.g, tTa.h, NTa.C, uua.p, tTa.h, field_175826_b, field_175826_b, uSa.E != 0);
        ux13.J((Gg)v46, (Xv)d2, NTa.C, uqa.g, NTa.C, NTa.C, uua.p, NTa.C, field_175826_b, field_175826_b, uSa.E != 0);
        ux13.J((Gg)c2, (Xv)d2, tTa.h, XTa.W, vRa.d, tTa.h, XTa.W, uua.p, field_175826_b, field_175826_b, uSa.E != 0);
        a2.J((Gg)c2, (Xv)ux12, NTa.C, XTa.W, vRa.d, NTa.C, XTa.W, uua.p, field_175826_b, field_175826_b, uSa.E != 0);
        a2.J((Gg)v43, (Xv)ux12, tTa.h, XTa.W, WOa.fa, tTa.h, XTa.W, hpa.Z, field_175826_b, field_175826_b, uSa.E != 0);
        ux11.J((Gg)v43, (Xv)d2, NTa.C, XTa.W, WOa.fa, NTa.C, XTa.W, hpa.Z, field_175826_b, field_175826_b, uSa.E != 0);
        ux11.J((Gg)c2, (Xv)d2, vRa.d, XTa.W, tTa.h, uua.p, XTa.W, tTa.h, field_175826_b, field_175826_b, uSa.E != 0);
        a2.J((Gg)c2, (Xv)ux10, vRa.d, XTa.W, NTa.C, uua.p, XTa.W, NTa.C, field_175826_b, field_175826_b, uSa.E != 0);
        a2.J((Gg)v40, (Xv)ux10, WOa.fa, XTa.W, tTa.h, hpa.Z, XTa.W, tTa.h, field_175826_b, field_175826_b, uSa.E != 0);
        ux9.J((Gg)v40, (Xv)d2, WOa.fa, XTa.W, NTa.C, hpa.Z, XTa.W, NTa.C, field_175826_b, field_175826_b, uSa.E != 0);
        ux9.J((Gg)c2, (Xv)d2, uqa.g, vRa.d, uqa.g, uqa.g, vRa.d, yRa.d, field_175826_b, field_175826_b, uSa.E != 0);
        a2.J((Gg)c2, (Xv)ux8, yRa.d, vRa.d, uqa.g, yRa.d, vRa.d, uqa.g, field_175826_b, field_175826_b, uSa.E != 0);
        a2.J((Gg)v37, (Xv)ux8, uua.s, vRa.d, uqa.g, uua.s, vRa.d, yRa.d, field_175826_b, field_175826_b, uSa.E != 0);
        ux7.J((Gg)v37, (Xv)d2, lqa.s, vRa.d, uqa.g, lqa.s, vRa.d, uqa.g, field_175826_b, field_175826_b, uSa.E != 0);
        ux7.J((Gg)c2, (Xv)d2, uqa.g, vRa.d, lqa.s, uqa.g, vRa.d, uua.s, field_175826_b, field_175826_b, uSa.E != 0);
        a2.J((Gg)c2, (Xv)ux6, yRa.d, vRa.d, uua.s, yRa.d, vRa.d, uua.s, field_175826_b, field_175826_b, uSa.E != 0);
        a2.J((Gg)v34, (Xv)ux6, uua.s, vRa.d, lqa.s, uua.s, vRa.d, uua.s, field_175826_b, field_175826_b, uSa.E != 0);
        a2.J((Gg)v34, (Xv)d2, lqa.s, vRa.d, uua.s, lqa.s, vRa.d, uua.s, field_175826_b, field_175826_b, uSa.E != 0);
        return vRa.d != 0;
    }

    public ux() {
        ux a2;
    }
}

