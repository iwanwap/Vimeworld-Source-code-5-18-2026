/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  KV
 *  NTa
 *  XTa
 *  Xv
 *  Ypa
 *  fv
 *  lqa
 *  pPa
 *  vRa
 */
import java.util.Random;
import net.minecraft.block.state.IBlockState;

public final class HU
extends KV {
    public HU() {
        HU a2;
    }

    /*
     * WARNING - void declaration
     */
    public HU(DZ dZ2, fv fv2, Random random) {
        void c2;
        HU d2 = fv2;
        HU b2 = this;
        super(vRa.d, (DZ)c2, (fv)d2, uqa.g, uqa.g, vRa.d);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv2) {
        int n2;
        void c2;
        HU a2;
        HU d2 = xv2;
        HU hU2 = a2 = this;
        fv b2 = hU2.field_175830_k.field_175965_b[DZ.EAST.getIndex()];
        fv fv2 = hU2.field_175830_k;
        fv fv3 = fv2.field_175965_b[DZ.UP.getIndex()];
        fv fv4 = b2.field_175965_b[DZ.UP.getIndex()];
        if (hU2.field_175830_k.field_175967_a / kTa.g > 0) {
            HU hU3 = a2;
            hU3.J((Gg)c2, (Xv)d2, Yqa.i, uSa.E, b2.field_175966_c[DZ.DOWN.getIndex()]);
            hU3.J((Gg)c2, (Xv)d2, uSa.E, uSa.E, fv2.field_175966_c[DZ.DOWN.getIndex()]);
        }
        if (fv3.field_175965_b[DZ.UP.getIndex()] == null) {
            a2.J((Gg)c2, (Xv)d2, vRa.d, Yqa.i, vRa.d, XTa.W, Yqa.i, uua.p, field_175828_a);
        }
        if (fv4.field_175965_b[DZ.UP.getIndex()] == null) {
            a2.J((Gg)c2, (Xv)d2, Yqa.i, Yqa.i, vRa.d, hpa.Z, Yqa.i, uua.p, field_175828_a);
        }
        int n3 = n2 = vRa.d;
        while (n3 <= XTa.W) {
            IBlockState iBlockState = field_175826_b;
            if (n2 == uqa.g || n2 == uua.p) {
                iBlockState = field_175828_a;
            }
            void v3 = c2;
            HU hU4 = d2;
            int n4 = n2;
            IBlockState iBlockState2 = iBlockState;
            a2.J((Gg)c2, (Xv)d2, uSa.E, n4, uSa.E, uSa.E, n4, XTa.W, iBlockState2, iBlockState2, uSa.E != 0);
            int n5 = n2;
            IBlockState iBlockState3 = iBlockState;
            a2.J((Gg)c2, (Xv)hU4, Ypa.A, n5, uSa.E, Ypa.A, n5, XTa.W, iBlockState3, iBlockState3, uSa.E != 0);
            int n6 = n2;
            IBlockState iBlockState4 = iBlockState;
            a2.J((Gg)v3, (Xv)hU4, vRa.d, n6, uSa.E, Ypa.A, n6, uSa.E, iBlockState4, iBlockState4, uSa.E != 0);
            int n7 = n2++;
            IBlockState iBlockState5 = iBlockState;
            a2.J((Gg)v3, (Xv)d2, vRa.d, n7, XTa.W, hpa.Z, n7, XTa.W, iBlockState5, iBlockState5, uSa.E != 0);
            n3 = n2;
        }
        HU hU5 = a2;
        void v14 = c2;
        HU hU6 = a2;
        void v16 = c2;
        HU hU7 = d2;
        HU hU8 = a2;
        void v19 = c2;
        HU hU9 = a2;
        void v21 = c2;
        HU hU10 = d2;
        HU hU11 = a2;
        void v24 = c2;
        HU hU12 = d2;
        HU hU13 = a2;
        void v27 = c2;
        HU hU14 = d2;
        HU hU15 = a2;
        hU15.J((Gg)c2, (Xv)d2, uqa.g, vRa.d, yRa.d, uqa.g, XTa.W, AQa.P, field_175826_b, field_175826_b, uSa.E != 0);
        hU15.J((Gg)c2, (Xv)d2, yRa.d, vRa.d, uqa.g, AQa.P, XTa.W, uqa.g, field_175826_b, field_175826_b, uSa.E != 0);
        a2.J((Gg)c2, (Xv)hU14, yRa.d, vRa.d, tTa.h, AQa.P, XTa.W, tTa.h, field_175826_b, field_175826_b, uSa.E != 0);
        a2.J((Gg)v27, (Xv)hU14, uua.s, vRa.d, yRa.d, uua.s, XTa.W, AQa.P, field_175826_b, field_175826_b, uSa.E != 0);
        hU13.J((Gg)v27, (Xv)d2, pPa.f, vRa.d, uqa.g, lqa.s, XTa.W, uqa.g, field_175826_b, field_175826_b, uSa.E != 0);
        hU13.J((Gg)c2, (Xv)d2, pPa.f, vRa.d, tTa.h, lqa.s, XTa.W, tTa.h, field_175826_b, field_175826_b, uSa.E != 0);
        a2.J((Gg)c2, (Xv)hU12, tTa.h, vRa.d, yRa.d, tTa.h, yRa.d, AQa.P, field_175826_b, field_175826_b, uSa.E != 0);
        a2.J((Gg)v24, (Xv)hU12, NTa.C, vRa.d, yRa.d, NTa.C, yRa.d, AQa.P, field_175826_b, field_175826_b, uSa.E != 0);
        hU11.J((Gg)v24, (Xv)d2, tTa.h, XTa.W, uqa.g, NTa.C, XTa.W, tTa.h, field_175826_b, field_175826_b, uSa.E != 0);
        hU11.J((Gg)c2, (Xv)d2, tTa.h, tTa.h, uqa.g, tTa.h, XTa.W, uqa.g, field_175826_b, field_175826_b, uSa.E != 0);
        a2.J((Gg)c2, (Xv)hU10, NTa.C, tTa.h, uqa.g, NTa.C, XTa.W, uqa.g, field_175826_b, field_175826_b, uSa.E != 0);
        a2.J((Gg)v21, (Xv)hU10, tTa.h, tTa.h, tTa.h, tTa.h, XTa.W, tTa.h, field_175826_b, field_175826_b, uSa.E != 0);
        hU9.J((Gg)v21, (Xv)d2, NTa.C, tTa.h, tTa.h, NTa.C, XTa.W, tTa.h, field_175826_b, field_175826_b, uSa.E != 0);
        hU9.f((Gg)c2, field_175826_b, uua.p, uua.p, uqa.g, (Xv)d2);
        a2.f((Gg)v19, field_175826_b, WOa.fa, uua.p, uqa.g, (Xv)d2);
        hU8.f((Gg)v19, field_175826_b, uua.p, uua.p, tTa.h, (Xv)d2);
        hU8.f((Gg)c2, field_175826_b, WOa.fa, uua.p, tTa.h, (Xv)d2);
        a2.J((Gg)c2, (Xv)hU7, tTa.h, AQa.P, yRa.d, uua.p, AQa.P, AQa.P, field_175826_b, field_175826_b, uSa.E != 0);
        a2.J((Gg)v16, (Xv)hU7, WOa.fa, AQa.P, yRa.d, NTa.C, AQa.P, AQa.P, field_175826_b, field_175826_b, uSa.E != 0);
        hU6.f((Gg)v16, field_175825_e, tTa.h, AQa.P, uqa.g, (Xv)d2);
        hU6.f((Gg)c2, field_175825_e, tTa.h, AQa.P, tTa.h, (Xv)d2);
        hU5.f((Gg)v14, field_175825_e, NTa.C, AQa.P, uqa.g, (Xv)d2);
        hU5.f((Gg)v14, field_175825_e, NTa.C, AQa.P, tTa.h, (Xv)d2);
        if (fv2.field_175966_c[DZ.SOUTH.getIndex()]) {
            a2.J((Gg)c2, (Xv)d2, yRa.d, vRa.d, uSa.E, AQa.P, uqa.g, uSa.E, uSa.E != 0);
        }
        if (fv2.field_175966_c[DZ.NORTH.getIndex()]) {
            a2.J((Gg)c2, (Xv)d2, yRa.d, vRa.d, XTa.W, AQa.P, uqa.g, XTa.W, uSa.E != 0);
        }
        if (fv2.field_175966_c[DZ.WEST.getIndex()]) {
            a2.J((Gg)c2, (Xv)d2, uSa.E, vRa.d, yRa.d, uSa.E, uqa.g, AQa.P, uSa.E != 0);
        }
        if (b2.field_175966_c[DZ.SOUTH.getIndex()]) {
            a2.J((Gg)c2, (Xv)d2, pPa.f, vRa.d, uSa.E, lqa.s, uqa.g, uSa.E, uSa.E != 0);
        }
        if (b2.field_175966_c[DZ.NORTH.getIndex()]) {
            a2.J((Gg)c2, (Xv)d2, pPa.f, vRa.d, XTa.W, lqa.s, uqa.g, XTa.W, uSa.E != 0);
        }
        if (b2.field_175966_c[DZ.EAST.getIndex()]) {
            a2.J((Gg)c2, (Xv)d2, Ypa.A, vRa.d, yRa.d, Ypa.A, uqa.g, AQa.P, uSa.E != 0);
        }
        if (fv3.field_175966_c[DZ.SOUTH.getIndex()]) {
            a2.J((Gg)c2, (Xv)d2, yRa.d, tTa.h, uSa.E, AQa.P, uua.p, uSa.E, uSa.E != 0);
        }
        if (fv3.field_175966_c[DZ.NORTH.getIndex()]) {
            a2.J((Gg)c2, (Xv)d2, yRa.d, tTa.h, XTa.W, AQa.P, uua.p, XTa.W, uSa.E != 0);
        }
        if (fv3.field_175966_c[DZ.WEST.getIndex()]) {
            a2.J((Gg)c2, (Xv)d2, uSa.E, tTa.h, yRa.d, uSa.E, uua.p, AQa.P, uSa.E != 0);
        }
        if (fv4.field_175966_c[DZ.SOUTH.getIndex()]) {
            a2.J((Gg)c2, (Xv)d2, pPa.f, tTa.h, uSa.E, lqa.s, uua.p, uSa.E, uSa.E != 0);
        }
        if (fv4.field_175966_c[DZ.NORTH.getIndex()]) {
            a2.J((Gg)c2, (Xv)d2, pPa.f, tTa.h, XTa.W, lqa.s, uua.p, XTa.W, uSa.E != 0);
        }
        if (fv4.field_175966_c[DZ.EAST.getIndex()]) {
            a2.J((Gg)c2, (Xv)d2, Ypa.A, tTa.h, yRa.d, Ypa.A, uua.p, AQa.P, uSa.E != 0);
        }
        return vRa.d != 0;
    }
}

