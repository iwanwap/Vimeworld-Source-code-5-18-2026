/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  KV
 *  XTa
 *  Xv
 *  fv
 *  vRa
 */
import java.util.Random;

public final class RW_2
extends KV {
    private int field_175833_o;

    /*
     * WARNING - void declaration
     */
    public RW_2(DZ dZ2, fv fv2, Random random) {
        void b2;
        void c2;
        Random d2 = random;
        RW_2 a2 = this;
        super(vRa.d, (DZ)c2, (fv)b2, vRa.d, vRa.d, vRa.d);
        a2.field_175833_o = d2.nextInt(yRa.d);
    }

    public RW_2() {
        RW_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv2) {
        int n2;
        void c2;
        RW_2 a2;
        RW_2 d2;
        block20: {
            int n3;
            block22: {
                block21: {
                    block19: {
                        RW_2 rW_2;
                        RW_2 rW_22;
                        RW_2 rW_23;
                        void b2;
                        d2 = xv2;
                        a2 = this;
                        if (a2.field_175830_k.field_175967_a / kTa.g > 0) {
                            a2.J((Gg)c2, (Xv)d2, uSa.E, uSa.E, a2.field_175830_k.field_175966_c[DZ.DOWN.getIndex()]);
                        }
                        if (a2.field_175830_k.field_175965_b[DZ.UP.getIndex()] == null) {
                            a2.J((Gg)c2, (Xv)d2, vRa.d, AQa.P, vRa.d, uua.p, AQa.P, uua.p, field_175828_a);
                        }
                        int n4 = n3 = a2.field_175833_o != 0 && b2.nextBoolean() && !a2.field_175830_k.field_175966_c[DZ.DOWN.getIndex()] && !a2.field_175830_k.field_175966_c[DZ.UP.getIndex()] && a2.field_175830_k.J() > vRa.d ? vRa.d : uSa.E;
                        if (a2.field_175833_o != 0) break block19;
                        RW_2 rW_24 = a2;
                        void v2 = c2;
                        RW_2 rW_25 = d2;
                        RW_2 rW_26 = a2;
                        void v5 = c2;
                        RW_2 rW_27 = d2;
                        RW_2 rW_28 = a2;
                        void v8 = c2;
                        RW_2 rW_29 = a2;
                        void v10 = c2;
                        RW_2 rW_210 = d2;
                        RW_2 rW_211 = a2;
                        void v13 = c2;
                        RW_2 rW_212 = d2;
                        a2.J((Gg)c2, (Xv)d2, uSa.E, vRa.d, uSa.E, uqa.g, vRa.d, uqa.g, field_175826_b, field_175826_b, uSa.E != 0);
                        a2.J((Gg)c2, (Xv)rW_212, uSa.E, yRa.d, uSa.E, uqa.g, yRa.d, uqa.g, field_175826_b, field_175826_b, uSa.E != 0);
                        a2.J((Gg)v13, (Xv)rW_212, uSa.E, uqa.g, uSa.E, uSa.E, uqa.g, uqa.g, field_175828_a, field_175828_a, uSa.E != 0);
                        rW_211.J((Gg)v13, (Xv)d2, vRa.d, uqa.g, uSa.E, uqa.g, uqa.g, uSa.E, field_175828_a, field_175828_a, uSa.E != 0);
                        rW_211.f((Gg)c2, field_175825_e, vRa.d, uqa.g, vRa.d, (Xv)d2);
                        a2.J((Gg)c2, (Xv)rW_210, tTa.h, vRa.d, uSa.E, XTa.W, vRa.d, uqa.g, field_175826_b, field_175826_b, uSa.E != 0);
                        a2.J((Gg)v10, (Xv)rW_210, tTa.h, yRa.d, uSa.E, XTa.W, yRa.d, uqa.g, field_175826_b, field_175826_b, uSa.E != 0);
                        rW_29.J((Gg)v10, (Xv)d2, XTa.W, uqa.g, uSa.E, XTa.W, uqa.g, uqa.g, field_175828_a, field_175828_a, uSa.E != 0);
                        rW_29.J((Gg)c2, (Xv)d2, tTa.h, uqa.g, uSa.E, uua.p, uqa.g, uSa.E, field_175828_a, field_175828_a, uSa.E != 0);
                        a2.f((Gg)v8, field_175825_e, uua.p, uqa.g, vRa.d, (Xv)d2);
                        rW_28.J((Gg)v8, (Xv)d2, uSa.E, vRa.d, tTa.h, uqa.g, vRa.d, XTa.W, field_175826_b, field_175826_b, uSa.E != 0);
                        rW_28.J((Gg)c2, (Xv)d2, uSa.E, yRa.d, tTa.h, uqa.g, yRa.d, XTa.W, field_175826_b, field_175826_b, uSa.E != 0);
                        a2.J((Gg)c2, (Xv)rW_27, uSa.E, uqa.g, tTa.h, uSa.E, uqa.g, XTa.W, field_175828_a, field_175828_a, uSa.E != 0);
                        a2.J((Gg)v5, (Xv)rW_27, vRa.d, uqa.g, XTa.W, uqa.g, uqa.g, XTa.W, field_175828_a, field_175828_a, uSa.E != 0);
                        rW_26.f((Gg)v5, field_175825_e, vRa.d, uqa.g, uua.p, (Xv)d2);
                        rW_26.J((Gg)c2, (Xv)d2, tTa.h, vRa.d, tTa.h, XTa.W, vRa.d, XTa.W, field_175826_b, field_175826_b, uSa.E != 0);
                        a2.J((Gg)c2, (Xv)rW_25, tTa.h, yRa.d, tTa.h, XTa.W, yRa.d, XTa.W, field_175826_b, field_175826_b, uSa.E != 0);
                        a2.J((Gg)v2, (Xv)rW_25, XTa.W, uqa.g, tTa.h, XTa.W, uqa.g, XTa.W, field_175828_a, field_175828_a, uSa.E != 0);
                        rW_24.J((Gg)v2, (Xv)d2, tTa.h, uqa.g, XTa.W, uua.p, uqa.g, XTa.W, field_175828_a, field_175828_a, uSa.E != 0);
                        rW_24.f((Gg)c2, field_175825_e, uua.p, uqa.g, uua.p, (Xv)d2);
                        if (rW_24.field_175830_k.field_175966_c[DZ.SOUTH.getIndex()]) {
                            RW_2 rW_213 = a2;
                            rW_23 = rW_213;
                            rW_213.J((Gg)c2, (Xv)d2, yRa.d, yRa.d, uSa.E, AQa.P, yRa.d, uSa.E, field_175826_b, field_175826_b, uSa.E != 0);
                        } else {
                            rW_23 = a2;
                            RW_2 rW_214 = a2;
                            void v18 = c2;
                            a2.J((Gg)v18, (Xv)d2, yRa.d, yRa.d, uSa.E, AQa.P, yRa.d, vRa.d, field_175826_b, field_175826_b, uSa.E != 0);
                            rW_214.J((Gg)v18, (Xv)d2, yRa.d, uqa.g, uSa.E, AQa.P, uqa.g, uSa.E, field_175828_a, field_175828_a, uSa.E != 0);
                            rW_214.J((Gg)c2, (Xv)d2, yRa.d, vRa.d, uSa.E, AQa.P, vRa.d, vRa.d, field_175826_b, field_175826_b, uSa.E != 0);
                        }
                        RW_2 rW_215 = a2;
                        if (rW_23.field_175830_k.field_175966_c[DZ.NORTH.getIndex()]) {
                            rW_215.J((Gg)c2, (Xv)d2, yRa.d, yRa.d, XTa.W, AQa.P, yRa.d, XTa.W, field_175826_b, field_175826_b, uSa.E != 0);
                            rW_22 = a2;
                        } else {
                            rW_215.J((Gg)c2, (Xv)d2, yRa.d, yRa.d, uua.p, AQa.P, yRa.d, XTa.W, field_175826_b, field_175826_b, uSa.E != 0);
                            RW_2 rW_216 = a2;
                            rW_22 = rW_216;
                            rW_216.J((Gg)c2, (Xv)d2, yRa.d, uqa.g, XTa.W, AQa.P, uqa.g, XTa.W, field_175828_a, field_175828_a, uSa.E != 0);
                            rW_216.J((Gg)c2, (Xv)d2, yRa.d, vRa.d, uua.p, AQa.P, vRa.d, XTa.W, field_175826_b, field_175826_b, uSa.E != 0);
                        }
                        RW_2 rW_217 = a2;
                        if (rW_22.field_175830_k.field_175966_c[DZ.WEST.getIndex()]) {
                            rW_217.J((Gg)c2, (Xv)d2, uSa.E, yRa.d, yRa.d, uSa.E, yRa.d, AQa.P, field_175826_b, field_175826_b, uSa.E != 0);
                            rW_2 = a2;
                        } else {
                            rW_217.J((Gg)c2, (Xv)d2, uSa.E, yRa.d, yRa.d, vRa.d, yRa.d, AQa.P, field_175826_b, field_175826_b, uSa.E != 0);
                            RW_2 rW_218 = a2;
                            rW_2 = rW_218;
                            rW_218.J((Gg)c2, (Xv)d2, uSa.E, uqa.g, yRa.d, uSa.E, uqa.g, AQa.P, field_175828_a, field_175828_a, uSa.E != 0);
                            rW_218.J((Gg)c2, (Xv)d2, uSa.E, vRa.d, yRa.d, vRa.d, vRa.d, AQa.P, field_175826_b, field_175826_b, uSa.E != 0);
                        }
                        RW_2 rW_219 = a2;
                        if (rW_2.field_175830_k.field_175966_c[DZ.EAST.getIndex()]) {
                            rW_219.J((Gg)c2, (Xv)d2, XTa.W, yRa.d, yRa.d, XTa.W, yRa.d, AQa.P, field_175826_b, field_175826_b, uSa.E != 0);
                            n2 = n3;
                        } else {
                            rW_219.J((Gg)c2, (Xv)d2, uua.p, yRa.d, yRa.d, XTa.W, yRa.d, AQa.P, field_175826_b, field_175826_b, uSa.E != 0);
                            n2 = n3;
                            RW_2 rW_220 = a2;
                            rW_220.J((Gg)c2, (Xv)d2, XTa.W, uqa.g, yRa.d, XTa.W, uqa.g, AQa.P, field_175828_a, field_175828_a, uSa.E != 0);
                            rW_220.J((Gg)c2, (Xv)d2, uua.p, vRa.d, yRa.d, XTa.W, vRa.d, AQa.P, field_175826_b, field_175826_b, uSa.E != 0);
                        }
                        break block20;
                    }
                    if (a2.field_175833_o != vRa.d) break block21;
                    RW_2 rW_2 = a2;
                    void v29 = c2;
                    RW_2 rW_221 = a2;
                    void v31 = c2;
                    RW_2 rW_222 = a2;
                    void v33 = c2;
                    RW_2 rW_223 = d2;
                    RW_2 rW_224 = a2;
                    void v36 = c2;
                    RW_2 rW_225 = d2;
                    RW_2 rW_226 = a2;
                    void v39 = c2;
                    RW_2 rW_227 = a2;
                    void v41 = c2;
                    RW_2 rW_228 = a2;
                    void v43 = c2;
                    RW_2 rW_229 = d2;
                    a2.J((Gg)c2, (Xv)rW_229, uqa.g, vRa.d, uqa.g, uqa.g, yRa.d, uqa.g, field_175826_b, field_175826_b, uSa.E != 0);
                    a2.J((Gg)v43, (Xv)rW_229, uqa.g, vRa.d, tTa.h, uqa.g, yRa.d, tTa.h, field_175826_b, field_175826_b, uSa.E != 0);
                    rW_228.J((Gg)v43, (Xv)d2, tTa.h, vRa.d, tTa.h, tTa.h, yRa.d, tTa.h, field_175826_b, field_175826_b, uSa.E != 0);
                    rW_228.J((Gg)c2, (Xv)d2, tTa.h, vRa.d, uqa.g, tTa.h, yRa.d, uqa.g, field_175826_b, field_175826_b, uSa.E != 0);
                    a2.f((Gg)v41, field_175825_e, uqa.g, uqa.g, uqa.g, (Xv)d2);
                    rW_227.f((Gg)v41, field_175825_e, uqa.g, uqa.g, tTa.h, (Xv)d2);
                    rW_227.f((Gg)c2, field_175825_e, tTa.h, uqa.g, tTa.h, (Xv)d2);
                    a2.f((Gg)v39, field_175825_e, tTa.h, uqa.g, uqa.g, (Xv)d2);
                    rW_226.J((Gg)v39, (Xv)d2, uSa.E, vRa.d, uSa.E, vRa.d, yRa.d, uSa.E, field_175826_b, field_175826_b, uSa.E != 0);
                    rW_226.J((Gg)c2, (Xv)d2, uSa.E, vRa.d, vRa.d, uSa.E, yRa.d, vRa.d, field_175826_b, field_175826_b, uSa.E != 0);
                    a2.J((Gg)c2, (Xv)rW_225, uSa.E, vRa.d, XTa.W, vRa.d, yRa.d, XTa.W, field_175826_b, field_175826_b, uSa.E != 0);
                    a2.J((Gg)v36, (Xv)rW_225, uSa.E, vRa.d, uua.p, uSa.E, yRa.d, uua.p, field_175826_b, field_175826_b, uSa.E != 0);
                    rW_224.J((Gg)v36, (Xv)d2, uua.p, vRa.d, XTa.W, XTa.W, yRa.d, XTa.W, field_175826_b, field_175826_b, uSa.E != 0);
                    rW_224.J((Gg)c2, (Xv)d2, XTa.W, vRa.d, uua.p, XTa.W, yRa.d, uua.p, field_175826_b, field_175826_b, uSa.E != 0);
                    a2.J((Gg)c2, (Xv)rW_223, uua.p, vRa.d, uSa.E, XTa.W, yRa.d, uSa.E, field_175826_b, field_175826_b, uSa.E != 0);
                    a2.J((Gg)v33, (Xv)rW_223, XTa.W, vRa.d, vRa.d, XTa.W, yRa.d, vRa.d, field_175826_b, field_175826_b, uSa.E != 0);
                    rW_222.f((Gg)v33, field_175828_a, vRa.d, uqa.g, uSa.E, (Xv)d2);
                    rW_222.f((Gg)c2, field_175828_a, uSa.E, uqa.g, vRa.d, (Xv)d2);
                    a2.f((Gg)v31, field_175828_a, vRa.d, uqa.g, XTa.W, (Xv)d2);
                    rW_221.f((Gg)v31, field_175828_a, uSa.E, uqa.g, uua.p, (Xv)d2);
                    rW_221.f((Gg)c2, field_175828_a, uua.p, uqa.g, XTa.W, (Xv)d2);
                    a2.f((Gg)v29, field_175828_a, XTa.W, uqa.g, uua.p, (Xv)d2);
                    rW_2.f((Gg)v29, field_175828_a, uua.p, uqa.g, uSa.E, (Xv)d2);
                    rW_2.f((Gg)c2, field_175828_a, XTa.W, uqa.g, vRa.d, (Xv)d2);
                    if (!rW_2.field_175830_k.field_175966_c[DZ.SOUTH.getIndex()]) {
                        RW_2 rW_230 = a2;
                        void v46 = c2;
                        a2.J((Gg)v46, (Xv)d2, vRa.d, yRa.d, uSa.E, uua.p, yRa.d, uSa.E, field_175826_b, field_175826_b, uSa.E != 0);
                        rW_230.J((Gg)v46, (Xv)d2, vRa.d, uqa.g, uSa.E, uua.p, uqa.g, uSa.E, field_175828_a, field_175828_a, uSa.E != 0);
                        rW_230.J((Gg)c2, (Xv)d2, vRa.d, vRa.d, uSa.E, uua.p, vRa.d, uSa.E, field_175826_b, field_175826_b, uSa.E != 0);
                    }
                    if (!a2.field_175830_k.field_175966_c[DZ.NORTH.getIndex()]) {
                        RW_2 rW_231 = a2;
                        void v48 = c2;
                        a2.J((Gg)v48, (Xv)d2, vRa.d, yRa.d, XTa.W, uua.p, yRa.d, XTa.W, field_175826_b, field_175826_b, uSa.E != 0);
                        rW_231.J((Gg)v48, (Xv)d2, vRa.d, uqa.g, XTa.W, uua.p, uqa.g, XTa.W, field_175828_a, field_175828_a, uSa.E != 0);
                        rW_231.J((Gg)c2, (Xv)d2, vRa.d, vRa.d, XTa.W, uua.p, vRa.d, XTa.W, field_175826_b, field_175826_b, uSa.E != 0);
                    }
                    if (!a2.field_175830_k.field_175966_c[DZ.WEST.getIndex()]) {
                        RW_2 rW_232 = a2;
                        void v50 = c2;
                        a2.J((Gg)v50, (Xv)d2, uSa.E, yRa.d, vRa.d, uSa.E, yRa.d, uua.p, field_175826_b, field_175826_b, uSa.E != 0);
                        rW_232.J((Gg)v50, (Xv)d2, uSa.E, uqa.g, vRa.d, uSa.E, uqa.g, uua.p, field_175828_a, field_175828_a, uSa.E != 0);
                        rW_232.J((Gg)c2, (Xv)d2, uSa.E, vRa.d, vRa.d, uSa.E, vRa.d, uua.p, field_175826_b, field_175826_b, uSa.E != 0);
                    }
                    if (a2.field_175830_k.field_175966_c[DZ.EAST.getIndex()]) break block22;
                    n2 = n3;
                    RW_2 rW_233 = a2;
                    void v52 = c2;
                    a2.J((Gg)v52, (Xv)d2, XTa.W, yRa.d, vRa.d, XTa.W, yRa.d, uua.p, field_175826_b, field_175826_b, uSa.E != 0);
                    rW_233.J((Gg)v52, (Xv)d2, XTa.W, uqa.g, vRa.d, XTa.W, uqa.g, uua.p, field_175828_a, field_175828_a, uSa.E != 0);
                    rW_233.J((Gg)c2, (Xv)d2, XTa.W, vRa.d, vRa.d, XTa.W, vRa.d, uua.p, field_175826_b, field_175826_b, uSa.E != 0);
                    break block20;
                }
                if (a2.field_175833_o == uqa.g) {
                    RW_2 rW_2 = a2;
                    void v54 = c2;
                    RW_2 rW_234 = d2;
                    RW_2 rW_235 = a2;
                    void v57 = c2;
                    RW_2 rW_236 = d2;
                    RW_2 rW_237 = a2;
                    void v60 = c2;
                    RW_2 rW_238 = d2;
                    RW_2 rW_239 = a2;
                    void v63 = c2;
                    RW_2 rW_240 = d2;
                    a2.J((Gg)c2, (Xv)rW_240, uSa.E, vRa.d, uSa.E, uSa.E, vRa.d, XTa.W, field_175826_b, field_175826_b, uSa.E != 0);
                    a2.J((Gg)v63, (Xv)rW_240, XTa.W, vRa.d, uSa.E, XTa.W, vRa.d, XTa.W, field_175826_b, field_175826_b, uSa.E != 0);
                    rW_239.J((Gg)v63, (Xv)d2, vRa.d, vRa.d, uSa.E, uua.p, vRa.d, uSa.E, field_175826_b, field_175826_b, uSa.E != 0);
                    rW_239.J((Gg)c2, (Xv)d2, vRa.d, vRa.d, XTa.W, uua.p, vRa.d, XTa.W, field_175826_b, field_175826_b, uSa.E != 0);
                    a2.J((Gg)c2, (Xv)rW_238, uSa.E, uqa.g, uSa.E, uSa.E, uqa.g, XTa.W, field_175827_c, field_175827_c, uSa.E != 0);
                    a2.J((Gg)v60, (Xv)rW_238, XTa.W, uqa.g, uSa.E, XTa.W, uqa.g, XTa.W, field_175827_c, field_175827_c, uSa.E != 0);
                    rW_237.J((Gg)v60, (Xv)d2, vRa.d, uqa.g, uSa.E, uua.p, uqa.g, uSa.E, field_175827_c, field_175827_c, uSa.E != 0);
                    rW_237.J((Gg)c2, (Xv)d2, vRa.d, uqa.g, XTa.W, uua.p, uqa.g, XTa.W, field_175827_c, field_175827_c, uSa.E != 0);
                    a2.J((Gg)c2, (Xv)rW_236, uSa.E, yRa.d, uSa.E, uSa.E, yRa.d, XTa.W, field_175826_b, field_175826_b, uSa.E != 0);
                    a2.J((Gg)v57, (Xv)rW_236, XTa.W, yRa.d, uSa.E, XTa.W, yRa.d, XTa.W, field_175826_b, field_175826_b, uSa.E != 0);
                    rW_235.J((Gg)v57, (Xv)d2, vRa.d, yRa.d, uSa.E, uua.p, yRa.d, uSa.E, field_175826_b, field_175826_b, uSa.E != 0);
                    rW_235.J((Gg)c2, (Xv)d2, vRa.d, yRa.d, XTa.W, uua.p, yRa.d, XTa.W, field_175826_b, field_175826_b, uSa.E != 0);
                    a2.J((Gg)c2, (Xv)rW_234, uSa.E, vRa.d, yRa.d, uSa.E, uqa.g, AQa.P, field_175827_c, field_175827_c, uSa.E != 0);
                    a2.J((Gg)v54, (Xv)rW_234, XTa.W, vRa.d, yRa.d, XTa.W, uqa.g, AQa.P, field_175827_c, field_175827_c, uSa.E != 0);
                    rW_2.J((Gg)v54, (Xv)d2, yRa.d, vRa.d, uSa.E, AQa.P, uqa.g, uSa.E, field_175827_c, field_175827_c, uSa.E != 0);
                    rW_2.J((Gg)c2, (Xv)d2, yRa.d, vRa.d, XTa.W, AQa.P, uqa.g, XTa.W, field_175827_c, field_175827_c, uSa.E != 0);
                    if (rW_2.field_175830_k.field_175966_c[DZ.SOUTH.getIndex()]) {
                        a2.J((Gg)c2, (Xv)d2, yRa.d, vRa.d, uSa.E, AQa.P, uqa.g, uSa.E, uSa.E != 0);
                    }
                    if (a2.field_175830_k.field_175966_c[DZ.NORTH.getIndex()]) {
                        a2.J((Gg)c2, (Xv)d2, yRa.d, vRa.d, XTa.W, AQa.P, uqa.g, XTa.W, uSa.E != 0);
                    }
                    if (a2.field_175830_k.field_175966_c[DZ.WEST.getIndex()]) {
                        a2.J((Gg)c2, (Xv)d2, uSa.E, vRa.d, yRa.d, uSa.E, uqa.g, AQa.P, uSa.E != 0);
                    }
                    if (a2.field_175830_k.field_175966_c[DZ.EAST.getIndex()]) {
                        a2.J((Gg)c2, (Xv)d2, XTa.W, vRa.d, yRa.d, XTa.W, uqa.g, AQa.P, uSa.E != 0);
                    }
                }
            }
            n2 = n3;
        }
        if (n2 != 0) {
            RW_2 rW_2 = a2;
            void v66 = c2;
            a2.J((Gg)v66, (Xv)d2, yRa.d, vRa.d, yRa.d, AQa.P, vRa.d, AQa.P, field_175826_b, field_175826_b, uSa.E != 0);
            rW_2.J((Gg)v66, (Xv)d2, yRa.d, uqa.g, yRa.d, AQa.P, uqa.g, AQa.P, field_175828_a, field_175828_a, uSa.E != 0);
            rW_2.J((Gg)c2, (Xv)d2, yRa.d, yRa.d, yRa.d, AQa.P, yRa.d, AQa.P, field_175826_b, field_175826_b, uSa.E != 0);
        }
        return vRa.d != 0;
    }
}

