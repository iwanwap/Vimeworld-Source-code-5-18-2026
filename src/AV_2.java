/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AV
 *  Gg
 *  ISa
 *  NTa
 *  QFa
 *  Waa
 *  Wv
 *  XTa
 *  Xv
 *  Ypa
 *  cra
 *  eAa
 *  lqa
 *  pPa
 *  pua
 *  vRa
 *  ww
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public final class AV_2
extends Wv {
    private static final List<baa> strongholdLibraryChestContents;
    private boolean isLargeRoom;

    static {
        baa[] baaArray = new baa[AQa.P];
        baaArray[uSa.E] = new baa(Gea.Qa, uSa.E, vRa.d, yRa.d, kTa.j);
        baaArray[vRa.d] = new baa(Gea.LB, uSa.E, uqa.g, XTa.W, kTa.j);
        baaArray[uqa.g] = new baa((eAa)Gea.CC, uSa.E, vRa.d, vRa.d, vRa.d);
        baaArray[yRa.d] = new baa(Gea.Gb, uSa.E, vRa.d, vRa.d, vRa.d);
        strongholdLibraryChestContents = Lists.newArrayList(baaArray);
    }

    /*
     * WARNING - void declaration
     */
    public AV_2(int n2, Random random, Xv xv2, DZ dZ2) {
        void c2;
        void a2;
        void d2;
        AV_2 b2;
        AV_2 e2 = xv2;
        AV_2 aV_2 = b2 = this;
        super((int)d2);
        b2.coordBaseMode = a2;
        b2.field_143013_d = b2.J((Random)c2);
        aV_2.boundingBox = e2;
        aV_2.isLargeRoom = e2.f() > uua.p ? vRa.d : uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public static AV J(List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void f2;
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        List<uU> list2 = list;
        Xv g2 = Xv.J((int)e2, (int)d2, (int)c2, (int)pta.a, (int)pua.o, (int)uSa.E, (int)hpa.Z, (int)pPa.f, (int)Ypa.A, (DZ)b2);
        if (!(AV_2.J((Xv)g2) && uU.J(list2, g2) == null || AV_2.J((Xv)(g2 = Xv.J((int)e2, (int)d2, (int)c2, (int)pta.a, (int)pua.o, (int)uSa.E, (int)hpa.Z, (int)uua.p, (int)Ypa.A, (DZ)b2))) && uU.J(list2, g2) == null)) {
            return null;
        }
        return new AV_2((int)a2, (Random)f2, g2, (DZ)b2);
    }

    public void J(Waa waa2) {
        AV_2 b2 = waa2;
        AV_2 a2 = this;
        super.J((Waa)b2);
        a2.isLargeRoom = b2.f(ISa.q);
    }

    public void f(Waa waa2) {
        AV_2 b2 = waa2;
        AV_2 a2 = this;
        AV_2 aV_2 = b2;
        super.f((Waa)aV_2);
        aV_2.J(ISa.q, a2.isLargeRoom);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv2) {
        void b2;
        void c2;
        AV_2 a2 = this;
        AV_2 d2 = xv2;
        if (a2.J((Gg)c2, (Xv)d2)) {
            return uSa.E != 0;
        }
        int n2 = pPa.f;
        if (!a2.isLargeRoom) {
            n2 = uua.p;
        }
        void v0 = c2;
        a2.J((Gg)c2, (Xv)d2, uSa.E, uSa.E, uSa.E, uua.s, n2 - vRa.d, hpa.Z, vRa.d != 0, (Random)b2, (ww)LV.J());
        a2.J((Gg)v0, (Random)b2, (Xv)d2, a2.field_143013_d, AQa.P, vRa.d, uSa.E);
        a2.J((Gg)v0, (Xv)d2, (Random)b2, cra.S, uqa.g, vRa.d, vRa.d, pPa.f, AQa.P, uua.s, QFa.A.J(), QFa.A.J(), uSa.E != 0);
        int n3 = n2 = vRa.d;
        while (n3 <= uua.s) {
            if ((n2 - vRa.d) % AQa.P == 0) {
                AV_2 aV_2 = a2;
                void v3 = c2;
                AV_2 aV_22 = d2;
                int n4 = n2;
                a2.J((Gg)c2, (Xv)aV_22, vRa.d, vRa.d, n4, vRa.d, AQa.P, n4, QFa.L.J(), QFa.L.J(), uSa.E != 0);
                int n5 = n2;
                a2.J((Gg)v3, (Xv)aV_22, lqa.s, vRa.d, n5, lqa.s, AQa.P, n5, QFa.L.J(), QFa.L.J(), uSa.E != 0);
                aV_2.f((Gg)v3, QFa.FB.J(), uqa.g, yRa.d, n2, (Xv)d2);
                aV_2.f((Gg)c2, QFa.FB.J(), pPa.f, yRa.d, n2, (Xv)d2);
                if (aV_2.isLargeRoom) {
                    AV_2 aV_23 = a2;
                    int n6 = n2;
                    aV_23.J((Gg)c2, (Xv)d2, vRa.d, uua.p, n6, vRa.d, WOa.fa, n6, QFa.L.J(), QFa.L.J(), uSa.E != 0);
                    int n7 = n2;
                    aV_23.J((Gg)c2, (Xv)d2, lqa.s, uua.p, n7, lqa.s, WOa.fa, n7, QFa.L.J(), QFa.L.J(), uSa.E != 0);
                }
            } else {
                AV_2 aV_2 = a2;
                int n8 = n2;
                aV_2.J((Gg)c2, (Xv)d2, vRa.d, vRa.d, n8, vRa.d, AQa.P, n8, QFa.gA.J(), QFa.gA.J(), uSa.E != 0);
                int n9 = n2;
                aV_2.J((Gg)c2, (Xv)d2, lqa.s, vRa.d, n9, lqa.s, AQa.P, n9, QFa.gA.J(), QFa.gA.J(), uSa.E != 0);
                if (a2.isLargeRoom) {
                    AV_2 aV_24 = a2;
                    int n10 = n2;
                    aV_24.J((Gg)c2, (Xv)d2, vRa.d, uua.p, n10, vRa.d, WOa.fa, n10, QFa.gA.J(), QFa.gA.J(), uSa.E != 0);
                    int n11 = n2;
                    aV_24.J((Gg)c2, (Xv)d2, lqa.s, uua.p, n11, lqa.s, WOa.fa, n11, QFa.gA.J(), QFa.gA.J(), uSa.E != 0);
                }
            }
            n3 = ++n2;
        }
        int n12 = n2 = yRa.d;
        while (n12 < lqa.s) {
            AV_2 aV_2 = a2;
            void v18 = c2;
            int n13 = n2;
            a2.J((Gg)v18, (Xv)d2, yRa.d, vRa.d, n13, AQa.P, yRa.d, n13, QFa.gA.J(), QFa.gA.J(), uSa.E != 0);
            int n14 = n2;
            aV_2.J((Gg)v18, (Xv)d2, uua.p, vRa.d, n14, XTa.W, yRa.d, n14, QFa.gA.J(), QFa.gA.J(), uSa.E != 0);
            int n15 = n2;
            aV_2.J((Gg)c2, (Xv)d2, WOa.fa, vRa.d, n15, NTa.C, yRa.d, n15, QFa.gA.J(), QFa.gA.J(), uSa.E != 0);
            n12 = n2 += 2;
        }
        if (a2.isLargeRoom) {
            AV_2 aV_2 = a2;
            void v23 = c2;
            AV_2 aV_25 = a2;
            void v25 = c2;
            AV_2 aV_26 = a2;
            void v27 = c2;
            AV_2 aV_27 = a2;
            void v29 = c2;
            AV_2 aV_28 = a2;
            void v31 = c2;
            AV_2 aV_29 = a2;
            void v33 = c2;
            AV_2 aV_210 = a2;
            void v35 = c2;
            AV_2 aV_211 = a2;
            void v37 = c2;
            AV_2 aV_212 = a2;
            void v39 = c2;
            AV_2 aV_213 = a2;
            void v41 = c2;
            AV_2 aV_214 = d2;
            AV_2 aV_215 = a2;
            void v44 = c2;
            AV_2 aV_216 = a2;
            void v46 = c2;
            AV_2 aV_217 = d2;
            a2.J((Gg)c2, (Xv)d2, vRa.d, tTa.h, vRa.d, yRa.d, tTa.h, uua.s, QFa.L.J(), QFa.L.J(), uSa.E != 0);
            a2.J((Gg)c2, (Xv)aV_217, NTa.C, tTa.h, vRa.d, lqa.s, tTa.h, uua.s, QFa.L.J(), QFa.L.J(), uSa.E != 0);
            a2.J((Gg)v46, (Xv)aV_217, AQa.P, tTa.h, vRa.d, WOa.fa, tTa.h, uqa.g, QFa.L.J(), QFa.L.J(), uSa.E != 0);
            aV_216.J((Gg)v46, (Xv)d2, AQa.P, tTa.h, lqa.s, WOa.fa, tTa.h, uua.s, QFa.L.J(), QFa.L.J(), uSa.E != 0);
            aV_216.f((Gg)c2, QFa.L.J(), WOa.fa, tTa.h, pPa.f, (Xv)d2);
            a2.f((Gg)v44, QFa.L.J(), Yqa.i, tTa.h, pPa.f, (Xv)d2);
            aV_215.f((Gg)v44, QFa.L.J(), WOa.fa, tTa.h, NTa.C, (Xv)d2);
            aV_215.J((Gg)c2, (Xv)d2, yRa.d, uua.p, uqa.g, yRa.d, uua.p, lqa.s, QFa.U.J(), QFa.U.J(), uSa.E != 0);
            a2.J((Gg)c2, (Xv)aV_214, NTa.C, uua.p, uqa.g, NTa.C, uua.p, NTa.C, QFa.U.J(), QFa.U.J(), uSa.E != 0);
            a2.J((Gg)v41, (Xv)aV_214, AQa.P, uua.p, uqa.g, WOa.fa, uua.p, uqa.g, QFa.U.J(), QFa.U.J(), uSa.E != 0);
            aV_213.J((Gg)v41, (Xv)d2, AQa.P, uua.p, lqa.s, Yqa.i, uua.p, lqa.s, QFa.U.J(), QFa.U.J(), uSa.E != 0);
            aV_213.f((Gg)c2, QFa.U.J(), WOa.fa, uua.p, pPa.f, (Xv)d2);
            a2.f((Gg)v39, QFa.U.J(), Yqa.i, uua.p, pPa.f, (Xv)d2);
            aV_212.f((Gg)v39, QFa.U.J(), WOa.fa, uua.p, NTa.C, (Xv)d2);
            n2 = aV_212.J(QFa.z, yRa.d);
            aV_212.f((Gg)c2, QFa.z.J(n2), NTa.C, vRa.d, uua.s, (Xv)d2);
            a2.f((Gg)v37, QFa.z.J(n2), NTa.C, uqa.g, uua.s, (Xv)d2);
            aV_211.f((Gg)v37, QFa.z.J(n2), NTa.C, yRa.d, uua.s, (Xv)d2);
            aV_211.f((Gg)c2, QFa.z.J(n2), NTa.C, AQa.P, uua.s, (Xv)d2);
            a2.f((Gg)v35, QFa.z.J(n2), NTa.C, tTa.h, uua.s, (Xv)d2);
            aV_210.f((Gg)v35, QFa.z.J(n2), NTa.C, uua.p, uua.s, (Xv)d2);
            aV_210.f((Gg)c2, QFa.z.J(n2), NTa.C, XTa.W, uua.s, (Xv)d2);
            n2 = XTa.W;
            int n16 = XTa.W;
            a2.f((Gg)v33, QFa.U.J(), n2 - vRa.d, WOa.fa, n16, (Xv)d2);
            aV_29.f((Gg)v33, QFa.U.J(), n2, WOa.fa, n16, (Xv)d2);
            aV_29.f((Gg)c2, QFa.U.J(), n2 - vRa.d, Yqa.i, n16, (Xv)d2);
            a2.f((Gg)v31, QFa.U.J(), n2, Yqa.i, n16, (Xv)d2);
            aV_28.f((Gg)v31, QFa.U.J(), n2 - vRa.d, XTa.W, n16, (Xv)d2);
            aV_28.f((Gg)c2, QFa.U.J(), n2, XTa.W, n16, (Xv)d2);
            a2.f((Gg)v29, QFa.U.J(), n2 - uqa.g, XTa.W, n16, (Xv)d2);
            aV_27.f((Gg)v29, QFa.U.J(), n2 + vRa.d, XTa.W, n16, (Xv)d2);
            aV_27.f((Gg)c2, QFa.U.J(), n2 - vRa.d, XTa.W, n16 - vRa.d, (Xv)d2);
            a2.f((Gg)v27, QFa.U.J(), n2 - vRa.d, XTa.W, n16 + vRa.d, (Xv)d2);
            aV_26.f((Gg)v27, QFa.U.J(), n2, XTa.W, n16 - vRa.d, (Xv)d2);
            aV_26.f((Gg)c2, QFa.U.J(), n2, XTa.W, n16 + vRa.d, (Xv)d2);
            a2.f((Gg)v25, QFa.FB.J(), n2 - uqa.g, Yqa.i, n16, (Xv)d2);
            aV_25.f((Gg)v25, QFa.FB.J(), n2 + vRa.d, Yqa.i, n16, (Xv)d2);
            aV_25.f((Gg)c2, QFa.FB.J(), n2 - vRa.d, Yqa.i, n16 - vRa.d, (Xv)d2);
            a2.f((Gg)v23, QFa.FB.J(), n2 - vRa.d, Yqa.i, n16 + vRa.d, (Xv)d2);
            aV_2.f((Gg)v23, QFa.FB.J(), n2, Yqa.i, n16 - vRa.d, (Xv)d2);
            aV_2.f((Gg)c2, QFa.FB.J(), n2, Yqa.i, n16 + vRa.d, (Xv)d2);
        }
        baa[] baaArray = new baa[vRa.d];
        baaArray[uSa.E] = Gea.ha.J((Random)b2, vRa.d, tTa.h, uqa.g);
        a2.J((Gg)c2, (Xv)d2, (Random)b2, yRa.d, yRa.d, tTa.h, baa.J(strongholdLibraryChestContents, baaArray), vRa.d + b2.nextInt(AQa.P));
        if (a2.isLargeRoom) {
            AV_2 aV_2 = a2;
            aV_2.f((Gg)c2, QFa.HF.J(), lqa.s, WOa.fa, vRa.d, (Xv)d2);
            baa[] baaArray2 = new baa[vRa.d];
            baaArray2[uSa.E] = Gea.ha.J((Random)b2, vRa.d, tTa.h, uqa.g);
            aV_2.J((Gg)c2, (Xv)d2, (Random)b2, lqa.s, Yqa.i, vRa.d, baa.J(strongholdLibraryChestContents, baaArray2), vRa.d + b2.nextInt(AQa.P));
        }
        return vRa.d != 0;
    }

    public AV_2() {
        AV_2 a2;
    }
}

