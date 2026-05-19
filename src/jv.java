/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  QFa
 *  Uw
 *  Waa
 *  Xv
 *  fV
 *  pua
 *  vRa
 *  vpa
 */
import java.util.List;
import java.util.Random;
import net.minecraft.block.material.Material;

public final class jv
extends fV {
    private boolean isTallHouse;
    private int tablePosition;

    public void J(Waa waa2) {
        jv a2;
        jv b2 = waa2;
        jv jv2 = a2 = this;
        jv jv3 = b2;
        super.J((Waa)jv3);
        jv2.tablePosition = jv3.J(vpa.C);
        jv2.isTallHouse = b2.f(pta.l);
    }

    /*
     * WARNING - void declaration
     */
    public jv(Uw uw2, int n2, Random random, Xv xv, DZ dZ2) {
        void b2;
        void a2;
        void d2;
        void e2;
        jv c2;
        Random f2 = random;
        jv jv2 = c2 = this;
        jv jv3 = c2;
        super((Uw)e2, (int)d2);
        jv3.coordBaseMode = a2;
        jv3.boundingBox = b2;
        jv2.isTallHouse = f2.nextBoolean();
        jv2.tablePosition = f2.nextInt(yRa.d);
    }

    public jv() {
        jv a2;
    }

    public void f(Waa waa2) {
        jv b2 = waa2;
        jv a2 = this;
        jv jv2 = b2;
        super.f((Waa)jv2);
        jv2.J(vpa.C, a2.tablePosition);
        jv2.J(pta.l, a2.isTallHouse);
    }

    /*
     * WARNING - void declaration
     */
    public static jv J(Uw uw2, List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void g2;
        void b2;
        void c2;
        void d2;
        int h22 = n2;
        Uw e2 = uw2;
        Xv h22 = Xv.J((int)h22, (int)d2, (int)c2, (int)uSa.E, (int)uSa.E, (int)uSa.E, (int)AQa.P, (int)uua.p, (int)tTa.h, (DZ)b2);
        if (jv.J((Xv)h22) && uU.J((List<uU>)g2, h22) == null) {
            void f2;
            void a2;
            return new jv(e2, (int)a2, (Random)f2, h22, (DZ)b2);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv) {
        void b2;
        jv jv2;
        void c2;
        jv d2 = xv;
        jv a2 = this;
        if (a2.field_143015_k < 0) {
            jv jv3 = a2;
            jv3.field_143015_k = jv3.J((Gg)c2, (Xv)d2);
            if (jv3.field_143015_k < 0) {
                return vRa.d != 0;
            }
            jv jv4 = a2;
            a2.boundingBox.J(uSa.E, jv4.field_143015_k - jv4.boundingBox.maxY + uua.p - vRa.d, uSa.E);
        }
        jv jv5 = a2;
        void v3 = c2;
        a2.J((Gg)v3, (Xv)d2, vRa.d, vRa.d, vRa.d, yRa.d, tTa.h, AQa.P, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        jv5.J((Gg)v3, (Xv)d2, uSa.E, uSa.E, uSa.E, yRa.d, uSa.E, AQa.P, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        jv5.J((Gg)c2, (Xv)d2, vRa.d, uSa.E, vRa.d, uqa.g, uSa.E, yRa.d, QFa.Bc.J(), QFa.Bc.J(), uSa.E != 0);
        if (a2.isTallHouse) {
            jv jv6 = a2;
            jv2 = jv6;
            jv6.J((Gg)c2, (Xv)d2, vRa.d, AQa.P, vRa.d, uqa.g, AQa.P, yRa.d, QFa.UA.J(), QFa.UA.J(), uSa.E != 0);
        } else {
            jv jv7 = a2;
            jv2 = jv7;
            jv7.J((Gg)c2, (Xv)d2, vRa.d, tTa.h, vRa.d, uqa.g, tTa.h, yRa.d, QFa.UA.J(), QFa.UA.J(), uSa.E != 0);
        }
        jv2.f((Gg)c2, QFa.UA.J(), vRa.d, AQa.P, uSa.E, (Xv)d2);
        jv jv8 = a2;
        void v8 = c2;
        jv jv9 = d2;
        jv jv10 = a2;
        void v11 = c2;
        jv jv11 = d2;
        jv jv12 = a2;
        void v14 = c2;
        jv jv13 = a2;
        void v16 = c2;
        jv jv14 = a2;
        void v18 = c2;
        jv jv15 = a2;
        jv15.f((Gg)c2, QFa.UA.J(), uqa.g, AQa.P, uSa.E, (Xv)d2);
        jv15.f((Gg)c2, QFa.UA.J(), vRa.d, AQa.P, AQa.P, (Xv)d2);
        a2.f((Gg)v18, QFa.UA.J(), uqa.g, AQa.P, AQa.P, (Xv)d2);
        jv14.f((Gg)v18, QFa.UA.J(), uSa.E, AQa.P, vRa.d, (Xv)d2);
        jv14.f((Gg)c2, QFa.UA.J(), uSa.E, AQa.P, uqa.g, (Xv)d2);
        a2.f((Gg)v16, QFa.UA.J(), uSa.E, AQa.P, yRa.d, (Xv)d2);
        jv13.f((Gg)v16, QFa.UA.J(), yRa.d, AQa.P, vRa.d, (Xv)d2);
        jv13.f((Gg)c2, QFa.UA.J(), yRa.d, AQa.P, uqa.g, (Xv)d2);
        a2.f((Gg)v14, QFa.UA.J(), yRa.d, AQa.P, yRa.d, (Xv)d2);
        jv12.J((Gg)v14, (Xv)d2, uSa.E, vRa.d, uSa.E, uSa.E, yRa.d, uSa.E, QFa.UA.J(), QFa.UA.J(), uSa.E != 0);
        jv12.J((Gg)c2, (Xv)d2, yRa.d, vRa.d, uSa.E, yRa.d, yRa.d, uSa.E, QFa.UA.J(), QFa.UA.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)jv11, uSa.E, vRa.d, AQa.P, uSa.E, yRa.d, AQa.P, QFa.UA.J(), QFa.UA.J(), uSa.E != 0);
        a2.J((Gg)v11, (Xv)jv11, yRa.d, vRa.d, AQa.P, yRa.d, yRa.d, AQa.P, QFa.UA.J(), QFa.UA.J(), uSa.E != 0);
        jv10.J((Gg)v11, (Xv)d2, uSa.E, vRa.d, vRa.d, uSa.E, yRa.d, yRa.d, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        jv10.J((Gg)c2, (Xv)d2, yRa.d, vRa.d, vRa.d, yRa.d, yRa.d, yRa.d, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)jv9, vRa.d, vRa.d, uSa.E, uqa.g, yRa.d, uSa.E, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        a2.J((Gg)v8, (Xv)jv9, vRa.d, vRa.d, AQa.P, uqa.g, yRa.d, AQa.P, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        jv8.f((Gg)v8, QFa.JB.J(), uSa.E, uqa.g, uqa.g, (Xv)d2);
        jv8.f((Gg)c2, QFa.JB.J(), yRa.d, uqa.g, uqa.g, (Xv)d2);
        if (jv8.tablePosition > 0) {
            void v20 = c2;
            jv jv16 = a2;
            jv16.f((Gg)v20, QFa.U.J(), jv16.tablePosition, vRa.d, yRa.d, (Xv)d2);
            jv jv17 = a2;
            jv17.f((Gg)v20, QFa.Te.J(), jv17.tablePosition, uqa.g, yRa.d, (Xv)d2);
        }
        jv jv18 = a2;
        void v24 = c2;
        jv jv19 = a2;
        jv19.f((Gg)c2, QFa.HF.J(), vRa.d, vRa.d, uSa.E, (Xv)d2);
        jv19.f((Gg)c2, QFa.HF.J(), vRa.d, uqa.g, uSa.E, (Xv)d2);
        jv18.J((Gg)v24, (Xv)d2, (Random)b2, vRa.d, vRa.d, uSa.E, DZ.getHorizontal(a2.J(QFa.UB, vRa.d)));
        if (jv18.J((Gg)v24, vRa.d, uSa.E, pua.o, (Xv)d2).J().J() == Material.air && a2.J((Gg)c2, vRa.d, pua.o, pua.o, (Xv)d2).J().J() != Material.air) {
            jv jv20 = a2;
            jv20.f((Gg)c2, QFa.We.J(jv20.J(QFa.We, yRa.d)), vRa.d, uSa.E, pua.o, (Xv)d2);
        }
        int n2 = b2 = uSa.E;
        while (n2 < tTa.h) {
            int n3 = uSa.E;
            while (n3 < AQa.P) {
                int n4;
                jv jv21 = a2;
                jv21.J((Gg)c2, n4, uua.p, b2, (Xv)d2);
                jv21.J((Gg)c2, QFa.yB.J(), n4++, pua.o, b2, (Xv)d2);
                n3 = n4;
            }
            n2 = ++b2;
        }
        a2.J((Gg)c2, (Xv)d2, vRa.d, vRa.d, uqa.g, vRa.d);
        return vRa.d != 0;
    }
}

