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

public final class Qv
extends KV {
    public Qv() {
        Qv a2;
    }

    /*
     * WARNING - void declaration
     */
    public Qv(DZ dZ2, fv fv2, Random random) {
        void c2;
        Qv d2 = fv2;
        Qv b2 = this;
        super(vRa.d, (DZ)c2, (fv)d2, vRa.d, uqa.g, uqa.g);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv2) {
        IBlockState iBlockState;
        int n2;
        void c2;
        Qv a2;
        Qv d2 = xv2;
        Qv qv2 = a2 = this;
        fv b2 = qv2.field_175830_k.field_175965_b[DZ.NORTH.getIndex()];
        fv fv2 = qv2.field_175830_k;
        fv fv3 = b2.field_175965_b[DZ.UP.getIndex()];
        fv fv4 = fv2.field_175965_b[DZ.UP.getIndex()];
        if (qv2.field_175830_k.field_175967_a / kTa.g > 0) {
            Qv qv3 = a2;
            qv3.J((Gg)c2, (Xv)d2, uSa.E, Yqa.i, b2.field_175966_c[DZ.DOWN.getIndex()]);
            qv3.J((Gg)c2, (Xv)d2, uSa.E, uSa.E, fv2.field_175966_c[DZ.DOWN.getIndex()]);
        }
        if (fv4.field_175965_b[DZ.UP.getIndex()] == null) {
            a2.J((Gg)c2, (Xv)d2, vRa.d, Yqa.i, vRa.d, uua.p, Yqa.i, XTa.W, field_175828_a);
        }
        if (fv3.field_175965_b[DZ.UP.getIndex()] == null) {
            a2.J((Gg)c2, (Xv)d2, vRa.d, Yqa.i, Yqa.i, uua.p, Yqa.i, hpa.Z, field_175828_a);
        }
        int n3 = n2 = vRa.d;
        while (n3 <= XTa.W) {
            iBlockState = field_175826_b;
            if (n2 == uqa.g || n2 == uua.p) {
                iBlockState = field_175828_a;
            }
            void v3 = c2;
            Qv qv4 = d2;
            int n4 = n2;
            IBlockState iBlockState2 = iBlockState;
            a2.J((Gg)c2, (Xv)d2, uSa.E, n4, uSa.E, uSa.E, n4, Ypa.A, iBlockState2, iBlockState2, uSa.E != 0);
            int n5 = n2;
            IBlockState iBlockState3 = iBlockState;
            a2.J((Gg)c2, (Xv)qv4, XTa.W, n5, uSa.E, XTa.W, n5, Ypa.A, iBlockState3, iBlockState3, uSa.E != 0);
            int n6 = n2;
            IBlockState iBlockState4 = iBlockState;
            a2.J((Gg)v3, (Xv)qv4, vRa.d, n6, uSa.E, uua.p, n6, uSa.E, iBlockState4, iBlockState4, uSa.E != 0);
            int n7 = n2++;
            IBlockState iBlockState5 = iBlockState;
            a2.J((Gg)v3, (Xv)d2, vRa.d, n7, Ypa.A, uua.p, n7, Ypa.A, iBlockState5, iBlockState5, uSa.E != 0);
            n3 = n2;
        }
        int n8 = n2 = vRa.d;
        while (n8 <= XTa.W) {
            iBlockState = field_175827_c;
            if (n2 == uqa.g || n2 == uua.p) {
                iBlockState = field_175825_e;
            }
            int n9 = n2++;
            IBlockState iBlockState6 = iBlockState;
            a2.J((Gg)c2, (Xv)d2, yRa.d, n9, XTa.W, AQa.P, n9, Yqa.i, iBlockState6, iBlockState6, uSa.E != 0);
            n8 = n2;
        }
        if (fv2.field_175966_c[DZ.SOUTH.getIndex()]) {
            a2.J((Gg)c2, (Xv)d2, yRa.d, vRa.d, uSa.E, AQa.P, uqa.g, uSa.E, uSa.E != 0);
        }
        if (fv2.field_175966_c[DZ.EAST.getIndex()]) {
            a2.J((Gg)c2, (Xv)d2, XTa.W, vRa.d, yRa.d, XTa.W, uqa.g, AQa.P, uSa.E != 0);
        }
        if (fv2.field_175966_c[DZ.WEST.getIndex()]) {
            a2.J((Gg)c2, (Xv)d2, uSa.E, vRa.d, yRa.d, uSa.E, uqa.g, AQa.P, uSa.E != 0);
        }
        if (b2.field_175966_c[DZ.NORTH.getIndex()]) {
            a2.J((Gg)c2, (Xv)d2, yRa.d, vRa.d, Ypa.A, AQa.P, uqa.g, Ypa.A, uSa.E != 0);
        }
        if (b2.field_175966_c[DZ.WEST.getIndex()]) {
            a2.J((Gg)c2, (Xv)d2, uSa.E, vRa.d, pPa.f, uSa.E, uqa.g, lqa.s, uSa.E != 0);
        }
        if (b2.field_175966_c[DZ.EAST.getIndex()]) {
            a2.J((Gg)c2, (Xv)d2, XTa.W, vRa.d, pPa.f, XTa.W, uqa.g, lqa.s, uSa.E != 0);
        }
        if (fv4.field_175966_c[DZ.SOUTH.getIndex()]) {
            a2.J((Gg)c2, (Xv)d2, yRa.d, tTa.h, uSa.E, AQa.P, uua.p, uSa.E, uSa.E != 0);
        }
        if (fv4.field_175966_c[DZ.EAST.getIndex()]) {
            Qv qv5 = a2;
            void v17 = c2;
            Qv qv6 = d2;
            a2.J((Gg)c2, (Xv)qv6, XTa.W, tTa.h, yRa.d, XTa.W, uua.p, AQa.P, uSa.E != 0);
            a2.J((Gg)v17, (Xv)qv6, tTa.h, AQa.P, uqa.g, uua.p, AQa.P, tTa.h, field_175826_b, field_175826_b, uSa.E != 0);
            qv5.J((Gg)v17, (Xv)d2, uua.p, vRa.d, uqa.g, uua.p, yRa.d, uqa.g, field_175826_b, field_175826_b, uSa.E != 0);
            qv5.J((Gg)c2, (Xv)d2, uua.p, vRa.d, tTa.h, uua.p, yRa.d, tTa.h, field_175826_b, field_175826_b, uSa.E != 0);
        }
        if (fv4.field_175966_c[DZ.WEST.getIndex()]) {
            Qv qv7 = a2;
            void v20 = c2;
            Qv qv8 = d2;
            a2.J((Gg)c2, (Xv)qv8, uSa.E, tTa.h, yRa.d, uSa.E, uua.p, AQa.P, uSa.E != 0);
            a2.J((Gg)v20, (Xv)qv8, vRa.d, AQa.P, uqa.g, uqa.g, AQa.P, tTa.h, field_175826_b, field_175826_b, uSa.E != 0);
            qv7.J((Gg)v20, (Xv)d2, vRa.d, vRa.d, uqa.g, vRa.d, yRa.d, uqa.g, field_175826_b, field_175826_b, uSa.E != 0);
            qv7.J((Gg)c2, (Xv)d2, vRa.d, vRa.d, tTa.h, vRa.d, yRa.d, tTa.h, field_175826_b, field_175826_b, uSa.E != 0);
        }
        if (fv3.field_175966_c[DZ.NORTH.getIndex()]) {
            a2.J((Gg)c2, (Xv)d2, yRa.d, tTa.h, Ypa.A, AQa.P, uua.p, Ypa.A, uSa.E != 0);
        }
        if (fv3.field_175966_c[DZ.WEST.getIndex()]) {
            Qv qv9 = a2;
            void v23 = c2;
            Qv qv10 = d2;
            a2.J((Gg)c2, (Xv)qv10, uSa.E, tTa.h, pPa.f, uSa.E, uua.p, lqa.s, uSa.E != 0);
            a2.J((Gg)v23, (Xv)qv10, vRa.d, AQa.P, NTa.C, uqa.g, AQa.P, uua.s, field_175826_b, field_175826_b, uSa.E != 0);
            qv9.J((Gg)v23, (Xv)d2, vRa.d, vRa.d, NTa.C, vRa.d, yRa.d, NTa.C, field_175826_b, field_175826_b, uSa.E != 0);
            qv9.J((Gg)c2, (Xv)d2, vRa.d, vRa.d, uua.s, vRa.d, yRa.d, uua.s, field_175826_b, field_175826_b, uSa.E != 0);
        }
        if (fv3.field_175966_c[DZ.EAST.getIndex()]) {
            Qv qv11 = a2;
            void v26 = c2;
            Qv qv12 = d2;
            a2.J((Gg)c2, (Xv)qv12, XTa.W, tTa.h, pPa.f, XTa.W, uua.p, lqa.s, uSa.E != 0);
            a2.J((Gg)v26, (Xv)qv12, tTa.h, AQa.P, NTa.C, uua.p, AQa.P, uua.s, field_175826_b, field_175826_b, uSa.E != 0);
            qv11.J((Gg)v26, (Xv)d2, uua.p, vRa.d, NTa.C, uua.p, yRa.d, NTa.C, field_175826_b, field_175826_b, uSa.E != 0);
            qv11.J((Gg)c2, (Xv)d2, uua.p, vRa.d, uua.s, uua.p, yRa.d, uua.s, field_175826_b, field_175826_b, uSa.E != 0);
        }
        return vRa.d != 0;
    }
}

