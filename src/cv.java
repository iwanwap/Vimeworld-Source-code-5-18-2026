/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  NTa
 *  QFa
 *  Uw
 *  Waa
 *  XTa
 *  Xv
 *  Ypa
 *  eAa
 *  fV
 *  lqa
 *  pPa
 *  pua
 *  vRa
 *  wPa
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class cv
extends fV {
    private boolean hasMadeChest;
    private static final List<baa> villageBlacksmithChestContents;

    public int l(int n2, int n3) {
        int c2 = n3;
        cv a2 = this;
        return yRa.d;
    }

    static {
        baa[] baaArray = new baa[yta.Ka];
        baaArray[uSa.E] = new baa(Gea.b, uSa.E, vRa.d, yRa.d, yRa.d);
        baaArray[vRa.d] = new baa(Gea.GA, uSa.E, vRa.d, tTa.h, NTa.C);
        baaArray[uqa.g] = new baa(Gea.Bb, uSa.E, vRa.d, yRa.d, tTa.h);
        baaArray[yRa.d] = new baa(Gea.Ra, uSa.E, vRa.d, yRa.d, Ypa.A);
        baaArray[AQa.P] = new baa(Gea.Mb, uSa.E, vRa.d, yRa.d, Ypa.A);
        baaArray[tTa.h] = new baa(Gea.gB, uSa.E, vRa.d, vRa.d, tTa.h);
        baaArray[uua.p] = new baa(Gea.LA, uSa.E, vRa.d, vRa.d, tTa.h);
        baaArray[XTa.W] = new baa((eAa)Gea.x, uSa.E, vRa.d, vRa.d, tTa.h);
        baaArray[Yqa.i] = new baa((eAa)Gea.G, uSa.E, vRa.d, vRa.d, tTa.h);
        baaArray[WOa.fa] = new baa((eAa)Gea.H, uSa.E, vRa.d, vRa.d, tTa.h);
        baaArray[NTa.C] = new baa((eAa)Gea.XC, uSa.E, vRa.d, vRa.d, tTa.h);
        baaArray[pPa.f] = new baa(eAa.J((Block)QFa.X), uSa.E, yRa.d, XTa.W, tTa.h);
        baaArray[lqa.s] = new baa(eAa.J((Block)QFa.Y), uSa.E, yRa.d, XTa.W, tTa.h);
        baaArray[uua.s] = new baa(Gea.NA, uSa.E, vRa.d, vRa.d, yRa.d);
        baaArray[hpa.Z] = new baa(Gea.La, uSa.E, vRa.d, vRa.d, vRa.d);
        baaArray[Ypa.A] = new baa(Gea.Yc, uSa.E, vRa.d, vRa.d, vRa.d);
        baaArray[ERa.C] = new baa(Gea.sd, uSa.E, vRa.d, vRa.d, vRa.d);
        villageBlacksmithChestContents = Lists.newArrayList(baaArray);
    }

    public cv() {
        cv a2;
    }

    public void f(Waa waa2) {
        cv b2 = waa2;
        cv a2 = this;
        cv cv2 = b2;
        super.f((Waa)cv2);
        cv2.J(wPa.fa, a2.hasMadeChest);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv2) {
        int b22;
        void c2;
        cv d2 = xv2;
        cv a2 = this;
        if (a2.field_143015_k < 0) {
            cv cv2 = a2;
            cv2.field_143015_k = cv2.J((Gg)c2, (Xv)d2);
            if (cv2.field_143015_k < 0) {
                return vRa.d != 0;
            }
            cv cv3 = a2;
            a2.boundingBox.J(uSa.E, cv3.field_143015_k - cv3.boundingBox.maxY + uua.p - vRa.d, uSa.E);
        }
        void v2 = c2;
        cv cv4 = a2;
        void v4 = c2;
        cv cv5 = a2;
        void v6 = c2;
        cv cv6 = a2;
        void v8 = c2;
        cv cv7 = a2;
        void v10 = c2;
        cv cv8 = a2;
        void v12 = c2;
        cv cv9 = a2;
        void v14 = c2;
        cv cv10 = d2;
        cv cv11 = a2;
        void v17 = c2;
        cv cv12 = d2;
        cv cv13 = a2;
        void v20 = c2;
        cv cv14 = d2;
        cv cv15 = a2;
        void v23 = c2;
        cv cv16 = d2;
        cv cv17 = a2;
        cv17.J((Gg)c2, (Xv)d2, uSa.E, vRa.d, uSa.E, WOa.fa, AQa.P, uua.p, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        cv17.J((Gg)c2, (Xv)d2, uSa.E, uSa.E, uSa.E, WOa.fa, uSa.E, uua.p, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)cv16, uSa.E, AQa.P, uSa.E, WOa.fa, AQa.P, uua.p, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        a2.J((Gg)v23, (Xv)cv16, uSa.E, tTa.h, uSa.E, WOa.fa, tTa.h, uua.p, QFa.Ib.J(), QFa.Ib.J(), uSa.E != 0);
        cv15.J((Gg)v23, (Xv)d2, vRa.d, tTa.h, vRa.d, Yqa.i, tTa.h, tTa.h, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        cv15.J((Gg)c2, (Xv)d2, vRa.d, vRa.d, uSa.E, uqa.g, yRa.d, uSa.E, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)cv14, uSa.E, vRa.d, uSa.E, uSa.E, AQa.P, uSa.E, QFa.UA.J(), QFa.UA.J(), uSa.E != 0);
        a2.J((Gg)v20, (Xv)cv14, yRa.d, vRa.d, uSa.E, yRa.d, AQa.P, uSa.E, QFa.UA.J(), QFa.UA.J(), uSa.E != 0);
        cv13.J((Gg)v20, (Xv)d2, uSa.E, vRa.d, uua.p, uSa.E, AQa.P, uua.p, QFa.UA.J(), QFa.UA.J(), uSa.E != 0);
        cv13.f((Gg)c2, QFa.L.J(), yRa.d, yRa.d, vRa.d, (Xv)d2);
        a2.J((Gg)c2, (Xv)cv12, yRa.d, vRa.d, uqa.g, yRa.d, yRa.d, uqa.g, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        a2.J((Gg)v17, (Xv)cv12, AQa.P, vRa.d, yRa.d, tTa.h, yRa.d, yRa.d, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        cv11.J((Gg)v17, (Xv)d2, uSa.E, vRa.d, vRa.d, uSa.E, yRa.d, tTa.h, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        cv11.J((Gg)c2, (Xv)d2, vRa.d, vRa.d, uua.p, tTa.h, yRa.d, uua.p, QFa.L.J(), QFa.L.J(), uSa.E != 0);
        a2.J((Gg)c2, (Xv)cv10, tTa.h, vRa.d, uSa.E, tTa.h, yRa.d, uSa.E, QFa.U.J(), QFa.U.J(), uSa.E != 0);
        a2.J((Gg)v14, (Xv)cv10, WOa.fa, vRa.d, uSa.E, WOa.fa, yRa.d, uSa.E, QFa.U.J(), QFa.U.J(), uSa.E != 0);
        cv9.J((Gg)v14, (Xv)d2, uua.p, vRa.d, AQa.P, WOa.fa, AQa.P, uua.p, QFa.yB.J(), QFa.yB.J(), uSa.E != 0);
        cv9.f((Gg)c2, QFa.fA.J(), XTa.W, vRa.d, tTa.h, (Xv)d2);
        a2.f((Gg)v12, QFa.fA.J(), Yqa.i, vRa.d, tTa.h, (Xv)d2);
        cv8.f((Gg)v12, QFa.u.J(), WOa.fa, uqa.g, tTa.h, (Xv)d2);
        cv8.f((Gg)c2, QFa.u.J(), WOa.fa, uqa.g, AQa.P, (Xv)d2);
        a2.J((Gg)v10, (Xv)d2, XTa.W, uqa.g, AQa.P, Yqa.i, uqa.g, tTa.h, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        cv7.f((Gg)v10, QFa.yB.J(), uua.p, vRa.d, yRa.d, (Xv)d2);
        cv7.f((Gg)c2, QFa.Xb.J(), uua.p, uqa.g, yRa.d, (Xv)d2);
        a2.f((Gg)v8, QFa.Xb.J(), uua.p, yRa.d, yRa.d, (Xv)d2);
        cv6.f((Gg)v8, QFa.Rd.J(), Yqa.i, vRa.d, vRa.d, (Xv)d2);
        cv6.f((Gg)c2, QFa.JB.J(), uSa.E, uqa.g, uqa.g, (Xv)d2);
        a2.f((Gg)v6, QFa.JB.J(), uSa.E, uqa.g, AQa.P, (Xv)d2);
        cv5.f((Gg)v6, QFa.JB.J(), uqa.g, uqa.g, uua.p, (Xv)d2);
        cv5.f((Gg)c2, QFa.JB.J(), AQa.P, uqa.g, uua.p, (Xv)d2);
        a2.f((Gg)v4, QFa.U.J(), uqa.g, vRa.d, AQa.P, (Xv)d2);
        cv4.f((Gg)v4, QFa.Te.J(), uqa.g, uqa.g, AQa.P, (Xv)d2);
        cv4.f((Gg)v2, QFa.L.J(), vRa.d, vRa.d, tTa.h, (Xv)d2);
        cv cv18 = a2;
        cv18.f((Gg)v2, QFa.WA.J(cv18.J(QFa.WA, yRa.d)), uqa.g, vRa.d, tTa.h, (Xv)d2);
        cv cv19 = a2;
        cv19.f((Gg)v2, QFa.WA.J(cv19.J(QFa.WA, vRa.d)), vRa.d, vRa.d, AQa.P, (Xv)d2);
        if (!a2.hasMadeChest) {
            if (d2.J(new XF(a2.J(tTa.h, tTa.h), a2.J(vRa.d), a2.f(tTa.h, tTa.h)))) {
                void b22;
                a2.hasMadeChest = vRa.d;
                a2.J((Gg)c2, (Xv)d2, (Random)b22, tTa.h, vRa.d, tTa.h, villageBlacksmithChestContents, yRa.d + b22.nextInt(uua.p));
            }
        }
        int n2 = b22 = uua.p;
        while (n2 <= Yqa.i) {
            if (a2.J((Gg)c2, b22, uSa.E, pua.o, (Xv)d2).J().J() == Material.air && a2.J((Gg)c2, b22, pua.o, pua.o, (Xv)d2).J().J() != Material.air) {
                cv cv20 = a2;
                cv20.f((Gg)c2, QFa.We.J(cv20.J(QFa.We, yRa.d)), b22, uSa.E, pua.o, (Xv)d2);
            }
            n2 = ++b22;
        }
        int n3 = b22 = uSa.E;
        while (n3 < XTa.W) {
            int n4 = uSa.E;
            while (n4 < NTa.C) {
                int n5;
                cv cv21 = a2;
                cv21.J((Gg)c2, n5, uua.p, b22, (Xv)d2);
                cv21.J((Gg)c2, QFa.yB.J(), n5++, pua.o, b22, (Xv)d2);
                n4 = n5;
            }
            n3 = ++b22;
        }
        a2.J((Gg)c2, (Xv)d2, XTa.W, vRa.d, vRa.d, vRa.d);
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static cv J(Uw uw2, List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void g2;
        void b2;
        void c2;
        void d2;
        int h22 = n2;
        Uw e2 = uw2;
        Xv h22 = Xv.J((int)h22, (int)d2, (int)c2, (int)uSa.E, (int)uSa.E, (int)uSa.E, (int)NTa.C, (int)uua.p, (int)XTa.W, (DZ)b2);
        if (cv.J((Xv)h22) && uU.J((List<uU>)g2, h22) == null) {
            void f2;
            void a2;
            return new cv(e2, (int)a2, (Random)f2, h22, (DZ)b2);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public cv(Uw uw2, int n2, Random random, Xv xv2, DZ dZ2) {
        void b2;
        Object f2;
        void d2;
        void e2;
        cv a2;
        cv cv2 = object;
        Object object = dZ2;
        cv cv3 = a2 = cv2;
        super((Uw)e2, (int)d2);
        cv3.coordBaseMode = f2;
        cv3.boundingBox = b2;
    }

    public void J(Waa waa2) {
        cv b2 = waa2;
        cv a2 = this;
        super.J((Waa)b2);
        a2.hasMadeChest = b2.f(wPa.fa);
    }
}

