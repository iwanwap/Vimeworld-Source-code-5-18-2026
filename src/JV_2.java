/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  QFa
 *  RQa
 *  Uw
 *  Xv
 *  Ypa
 *  fV
 *  lqa
 *  pPa
 *  vRa
 *  ysa
 */
import java.util.List;
import java.util.Random;

public class JV_2
extends fV {
    /*
     * WARNING - void declaration
     */
    public void J(uU uU2, List<uU> list, Random random) {
        void b2;
        void c2;
        Object d2 = random;
        JV_2 a2 = this;
        pw.f((Uw)c2, (List)b2, (Random)d2, a2.boundingBox.minX - vRa.d, a2.boundingBox.maxY - AQa.P, a2.boundingBox.minZ + vRa.d, DZ.WEST, a2.J());
        pw.f((Uw)c2, (List)b2, (Random)d2, a2.boundingBox.maxX + vRa.d, a2.boundingBox.maxY - AQa.P, a2.boundingBox.minZ + vRa.d, DZ.EAST, a2.J());
        pw.f((Uw)c2, (List)b2, (Random)d2, a2.boundingBox.minX + vRa.d, a2.boundingBox.maxY - AQa.P, a2.boundingBox.minZ - vRa.d, DZ.NORTH, a2.J());
        pw.f((Uw)c2, (List)b2, (Random)d2, a2.boundingBox.minX + vRa.d, a2.boundingBox.maxY - AQa.P, a2.boundingBox.maxZ + vRa.d, DZ.SOUTH, a2.J());
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv2) {
        int b2;
        void c2;
        JV_2 d2 = xv2;
        JV_2 a2 = this;
        if (a2.field_143015_k < 0) {
            JV_2 jV_2 = a2;
            jV_2.field_143015_k = jV_2.J((Gg)c2, (Xv)d2);
            if (jV_2.field_143015_k < 0) {
                return vRa.d != 0;
            }
            JV_2 jV_22 = a2;
            a2.boundingBox.J(uSa.E, jV_22.field_143015_k - jV_22.boundingBox.maxY + yRa.d, uSa.E);
        }
        void v2 = c2;
        JV_2 jV_2 = a2;
        void v4 = c2;
        JV_2 jV_23 = a2;
        void v6 = c2;
        JV_2 jV_24 = a2;
        void v8 = c2;
        JV_2 jV_25 = a2;
        void v10 = c2;
        a2.J((Gg)v10, (Xv)d2, vRa.d, uSa.E, vRa.d, AQa.P, lqa.s, AQa.P, QFa.yB.J(), QFa.jd.J(), uSa.E != 0);
        jV_25.f((Gg)v10, QFa.HF.J(), uqa.g, lqa.s, uqa.g, (Xv)d2);
        jV_25.f((Gg)c2, QFa.HF.J(), yRa.d, lqa.s, uqa.g, (Xv)d2);
        a2.f((Gg)v8, QFa.HF.J(), uqa.g, lqa.s, yRa.d, (Xv)d2);
        jV_24.f((Gg)v8, QFa.HF.J(), yRa.d, lqa.s, yRa.d, (Xv)d2);
        jV_24.f((Gg)c2, QFa.U.J(), vRa.d, uua.s, vRa.d, (Xv)d2);
        a2.f((Gg)v6, QFa.U.J(), vRa.d, hpa.Z, vRa.d, (Xv)d2);
        jV_23.f((Gg)v6, QFa.U.J(), AQa.P, uua.s, vRa.d, (Xv)d2);
        jV_23.f((Gg)c2, QFa.U.J(), AQa.P, hpa.Z, vRa.d, (Xv)d2);
        a2.f((Gg)v4, QFa.U.J(), vRa.d, uua.s, AQa.P, (Xv)d2);
        jV_2.f((Gg)v4, QFa.U.J(), vRa.d, hpa.Z, AQa.P, (Xv)d2);
        jV_2.f((Gg)c2, QFa.U.J(), AQa.P, uua.s, AQa.P, (Xv)d2);
        a2.f((Gg)v2, QFa.U.J(), AQa.P, hpa.Z, AQa.P, (Xv)d2);
        a2.J((Gg)v2, (Xv)d2, vRa.d, Ypa.A, vRa.d, AQa.P, Ypa.A, AQa.P, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        int n2 = b2 = uSa.E;
        while (n2 <= tTa.h) {
            int n3 = uSa.E;
            while (n3 <= tTa.h) {
                int n4;
                if (n4 == 0 || n4 == tTa.h || b2 == 0 || b2 == tTa.h) {
                    void v13 = c2;
                    a2.f((Gg)v13, QFa.Q.J(), n4, pPa.f, b2, (Xv)d2);
                    a2.J((Gg)v13, n4, lqa.s, b2, (Xv)d2);
                }
                n3 = ++n4;
            }
            n2 = ++b2;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public JV_2(Uw uw2, int n2, Random random, int n3, int n4) {
        void f2;
        void b2;
        void c2;
        void d2;
        void e2;
        int n5 = n4;
        JV_2 a2 = this;
        super((Uw)e2, (int)d2);
        a2.coordBaseMode = LX.HORIZONTAL.random((Random)c2);
        switch (zw.$SwitchMap$net$minecraft$util$EnumFacing[a2.coordBaseMode.ordinal()]) {
            case 1: 
            case 2: {
                void v0 = b2;
                a2.boundingBox = new Xv((int)v0, ysa.s, (int)f2, (int)(v0 + uua.p - vRa.d), RQa.b, (int)(f2 + uua.p - vRa.d));
                return;
            }
        }
        void v1 = b2;
        a2.boundingBox = new Xv((int)v1, ysa.s, (int)f2, (int)(v1 + uua.p - vRa.d), RQa.b, (int)(f2 + uua.p - vRa.d));
    }

    public JV_2() {
        JV_2 a2;
    }
}

