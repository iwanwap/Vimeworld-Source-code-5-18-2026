/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  JTa
 *  NTa
 *  OW
 *  QFa
 *  Waa
 *  Wv
 *  XTa
 *  Xv
 *  Ypa
 *  lW
 *  pPa
 *  pua
 *  vRa
 *  ww
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public final class OW_3
extends Wv {
    private static final List<baa> strongholdRoomCrossingChestContents;
    public int roomType;

    public void f(Waa waa2) {
        OW_3 b2 = waa2;
        OW_3 a2 = this;
        OW_3 oW_3 = b2;
        super.f((Waa)oW_3);
        oW_3.J(JTa.Ga, a2.roomType);
    }

    public void J(Waa waa2) {
        OW_3 b2 = waa2;
        OW_3 a2 = this;
        super.J((Waa)b2);
        a2.roomType = b2.J(JTa.Ga);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv2) {
        void b2;
        void c2;
        OW_3 a2 = this;
        OW_3 d2 = xv2;
        if (a2.J((Gg)c2, (Xv)d2)) {
            return uSa.E != 0;
        }
        OW_3 oW_3 = a2;
        void v1 = c2;
        OW_3 oW_32 = a2;
        oW_32.J((Gg)c2, (Xv)d2, uSa.E, uSa.E, uSa.E, NTa.C, uua.p, NTa.C, vRa.d != 0, (Random)b2, (ww)LV.J());
        oW_32.J((Gg)c2, (Random)b2, (Xv)d2, a2.field_143013_d, AQa.P, vRa.d, uSa.E);
        a2.J((Gg)v1, (Xv)d2, AQa.P, vRa.d, NTa.C, uua.p, yRa.d, NTa.C, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        oW_3.J((Gg)v1, (Xv)d2, uSa.E, vRa.d, AQa.P, uSa.E, yRa.d, uua.p, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        oW_3.J((Gg)c2, (Xv)d2, NTa.C, vRa.d, AQa.P, NTa.C, yRa.d, uua.p, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        switch (a2.roomType) {
            case 0: {
                OW_3 oW_33 = a2;
                while (false) {
                }
                void v4 = c2;
                OW_3 oW_34 = a2;
                void v6 = c2;
                OW_3 oW_35 = a2;
                void v8 = c2;
                OW_3 oW_36 = a2;
                void v10 = c2;
                OW_3 oW_37 = a2;
                void v12 = c2;
                a2.f((Gg)c2, QFa.v.J(), tTa.h, vRa.d, tTa.h, (Xv)d2);
                a2.f((Gg)v12, QFa.v.J(), tTa.h, uqa.g, tTa.h, (Xv)d2);
                oW_37.f((Gg)v12, QFa.v.J(), tTa.h, yRa.d, tTa.h, (Xv)d2);
                oW_37.f((Gg)c2, QFa.FB.J(), AQa.P, yRa.d, tTa.h, (Xv)d2);
                a2.f((Gg)v10, QFa.FB.J(), uua.p, yRa.d, tTa.h, (Xv)d2);
                oW_36.f((Gg)v10, QFa.FB.J(), tTa.h, yRa.d, AQa.P, (Xv)d2);
                oW_36.f((Gg)c2, QFa.FB.J(), tTa.h, yRa.d, uua.p, (Xv)d2);
                a2.f((Gg)v8, QFa.Ib.J(), AQa.P, vRa.d, AQa.P, (Xv)d2);
                oW_35.f((Gg)v8, QFa.Ib.J(), AQa.P, vRa.d, tTa.h, (Xv)d2);
                oW_35.f((Gg)c2, QFa.Ib.J(), AQa.P, vRa.d, uua.p, (Xv)d2);
                a2.f((Gg)v6, QFa.Ib.J(), uua.p, vRa.d, AQa.P, (Xv)d2);
                oW_34.f((Gg)v6, QFa.Ib.J(), uua.p, vRa.d, tTa.h, (Xv)d2);
                oW_34.f((Gg)c2, QFa.Ib.J(), uua.p, vRa.d, uua.p, (Xv)d2);
                oW_33.f((Gg)v4, QFa.Ib.J(), tTa.h, vRa.d, AQa.P, (Xv)d2);
                oW_33.f((Gg)v4, QFa.Ib.J(), tTa.h, vRa.d, uua.p, (Xv)d2);
                break;
            }
            case 1: {
                int n2;
                int n3 = n2 = uSa.E;
                while (n3 < tTa.h) {
                    OW_3 oW_38 = a2;
                    void v15 = c2;
                    a2.f((Gg)c2, QFa.v.J(), yRa.d, vRa.d, yRa.d + n2, (Xv)d2);
                    a2.f((Gg)v15, QFa.v.J(), XTa.W, vRa.d, yRa.d + n2, (Xv)d2);
                    oW_38.f((Gg)v15, QFa.v.J(), yRa.d + n2, vRa.d, yRa.d, (Xv)d2);
                    int n4 = yRa.d + n2;
                    oW_38.f((Gg)c2, QFa.v.J(), n4, vRa.d, XTa.W, (Xv)d2);
                    n3 = ++n2;
                }
                OW_3 oW_39 = a2;
                void v18 = c2;
                OW_3 oW_310 = a2;
                oW_310.f((Gg)c2, QFa.v.J(), tTa.h, vRa.d, tTa.h, (Xv)d2);
                oW_310.f((Gg)c2, QFa.v.J(), tTa.h, uqa.g, tTa.h, (Xv)d2);
                oW_39.f((Gg)v18, QFa.v.J(), tTa.h, yRa.d, tTa.h, (Xv)d2);
                oW_39.f((Gg)v18, QFa.jd.J(), tTa.h, AQa.P, tTa.h, (Xv)d2);
                break;
            }
            case 2: {
                int n5;
                int n6 = n5 = vRa.d;
                while (n6 <= WOa.fa) {
                    OW_3 oW_311 = a2;
                    oW_311.f((Gg)c2, QFa.yB.J(), vRa.d, yRa.d, n5, (Xv)d2);
                    oW_311.f((Gg)c2, QFa.yB.J(), WOa.fa, yRa.d, n5++, (Xv)d2);
                    n6 = n5;
                }
                int n7 = n5 = vRa.d;
                while (n7 <= WOa.fa) {
                    OW_3 oW_312 = a2;
                    oW_312.f((Gg)c2, QFa.yB.J(), n5, yRa.d, vRa.d, (Xv)d2);
                    oW_312.f((Gg)c2, QFa.yB.J(), n5++, yRa.d, WOa.fa, (Xv)d2);
                    n7 = n5;
                }
                OW_3 oW_313 = a2;
                void v25 = c2;
                OW_3 oW_314 = a2;
                void v27 = c2;
                OW_3 oW_315 = a2;
                void v29 = c2;
                a2.f((Gg)v29, QFa.yB.J(), tTa.h, vRa.d, AQa.P, (Xv)d2);
                oW_315.f((Gg)v29, QFa.yB.J(), tTa.h, vRa.d, uua.p, (Xv)d2);
                oW_315.f((Gg)c2, QFa.yB.J(), tTa.h, yRa.d, AQa.P, (Xv)d2);
                a2.f((Gg)v27, QFa.yB.J(), tTa.h, yRa.d, uua.p, (Xv)d2);
                oW_314.f((Gg)v27, QFa.yB.J(), AQa.P, vRa.d, tTa.h, (Xv)d2);
                oW_314.f((Gg)c2, QFa.yB.J(), uua.p, vRa.d, tTa.h, (Xv)d2);
                oW_313.f((Gg)v25, QFa.yB.J(), AQa.P, yRa.d, tTa.h, (Xv)d2);
                oW_313.f((Gg)v25, QFa.yB.J(), uua.p, yRa.d, tTa.h, (Xv)d2);
                int n8 = n5 = vRa.d;
                while (n8 <= yRa.d) {
                    OW_3 oW_316 = a2;
                    void v32 = c2;
                    a2.f((Gg)c2, QFa.yB.J(), AQa.P, n5, AQa.P, (Xv)d2);
                    a2.f((Gg)v32, QFa.yB.J(), uua.p, n5, AQa.P, (Xv)d2);
                    oW_316.f((Gg)v32, QFa.yB.J(), AQa.P, n5, uua.p, (Xv)d2);
                    oW_316.f((Gg)c2, QFa.yB.J(), uua.p, n5++, uua.p, (Xv)d2);
                    n8 = n5;
                }
                a2.f((Gg)c2, QFa.FB.J(), tTa.h, yRa.d, tTa.h, (Xv)d2);
                int n9 = n5 = uqa.g;
                while (n9 <= Yqa.i) {
                    OW_3 oW_317 = a2;
                    oW_317.f((Gg)c2, QFa.L.J(), uqa.g, yRa.d, n5, (Xv)d2);
                    oW_317.f((Gg)c2, QFa.L.J(), yRa.d, yRa.d, n5, (Xv)d2);
                    if (n5 <= yRa.d || n5 >= XTa.W) {
                        OW_3 oW_318 = a2;
                        void v36 = c2;
                        a2.f((Gg)c2, QFa.L.J(), AQa.P, yRa.d, n5, (Xv)d2);
                        oW_318.f((Gg)v36, QFa.L.J(), tTa.h, yRa.d, n5, (Xv)d2);
                        oW_318.f((Gg)v36, QFa.L.J(), uua.p, yRa.d, n5, (Xv)d2);
                    }
                    OW_3 oW_319 = a2;
                    void v38 = c2;
                    oW_319.f((Gg)v38, QFa.L.J(), XTa.W, yRa.d, n5, (Xv)d2);
                    oW_319.f((Gg)v38, QFa.L.J(), Yqa.i, yRa.d, n5++, (Xv)d2);
                    n9 = n5;
                }
                void v39 = c2;
                void v40 = c2;
                OW_3 oW_320 = a2;
                oW_320.f((Gg)v40, QFa.z.J(oW_320.J(QFa.z, DZ.WEST.getIndex())), WOa.fa, vRa.d, yRa.d, (Xv)d2);
                OW_3 oW_321 = a2;
                oW_321.f((Gg)v40, QFa.z.J(oW_321.J(QFa.z, DZ.WEST.getIndex())), WOa.fa, uqa.g, yRa.d, (Xv)d2);
                a2.f((Gg)v39, QFa.z.J(a2.J(QFa.z, DZ.WEST.getIndex())), WOa.fa, yRa.d, yRa.d, (Xv)d2);
                baa[] baaArray = new baa[vRa.d];
                baaArray[uSa.E] = Gea.ha.J((Random)b2);
                a2.J((Gg)v39, (Xv)d2, (Random)b2, yRa.d, AQa.P, Yqa.i, baa.J(strongholdRoomCrossingChestContents, baaArray), vRa.d + b2.nextInt(AQa.P));
            }
        }
        return vRa.d != 0;
    }

    public OW_3() {
        OW_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    public static OW J(List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void b2;
        void c2;
        void d2;
        int g22 = n2;
        List<uU> e2 = list;
        Xv g22 = Xv.J((int)g22, (int)d2, (int)c2, (int)pta.a, (int)pua.o, (int)uSa.E, (int)pPa.f, (int)XTa.W, (int)pPa.f, (DZ)b2);
        if (OW_3.J((Xv)g22) && uU.J(e2, g22) == null) {
            void f2;
            void a2;
            return new OW_3((int)a2, (Random)f2, g22, (DZ)b2);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public OW_3(int n2, Random random, Xv xv2, DZ dZ2) {
        void b2;
        void a2;
        void d2;
        OW_3 c2;
        Random e2 = random;
        OW_3 oW_3 = c2 = this;
        super((int)d2);
        c2.coordBaseMode = a2;
        c2.field_143013_d = c2.J(e2);
        oW_3.boundingBox = b2;
        oW_3.roomType = e2.nextInt(tTa.h);
    }

    static {
        baa[] baaArray = new baa[XTa.W];
        baaArray[uSa.E] = new baa(Gea.GA, uSa.E, vRa.d, tTa.h, NTa.C);
        baaArray[vRa.d] = new baa(Gea.Bb, uSa.E, vRa.d, yRa.d, tTa.h);
        baaArray[uqa.g] = new baa(Gea.zc, uSa.E, AQa.P, WOa.fa, tTa.h);
        baaArray[yRa.d] = new baa(Gea.qc, uSa.E, yRa.d, Yqa.i, NTa.C);
        baaArray[AQa.P] = new baa(Gea.Ra, uSa.E, vRa.d, yRa.d, Ypa.A);
        baaArray[tTa.h] = new baa(Gea.Mb, uSa.E, vRa.d, yRa.d, Ypa.A);
        baaArray[uua.p] = new baa(Gea.gB, uSa.E, vRa.d, vRa.d, vRa.d);
        strongholdRoomCrossingChestContents = Lists.newArrayList(baaArray);
    }

    /*
     * WARNING - void declaration
     */
    public void J(uU uU2, List<uU> list, Random random) {
        void b2;
        void c2;
        Object d2 = random;
        OW_3 a2 = this;
        a2.f((lW)c2, (List)b2, (Random)d2, AQa.P, vRa.d);
        a2.l((lW)c2, (List)b2, (Random)d2, vRa.d, AQa.P);
        a2.J((lW)c2, (List)b2, (Random)d2, vRa.d, AQa.P);
    }
}

