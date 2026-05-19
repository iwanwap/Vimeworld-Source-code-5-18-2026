/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AZ
 *  EQa
 *  ERa
 *  Gg
 *  Jy
 *  NTa
 *  Rea
 *  XTa
 *  Ypa
 *  jsa
 *  vRa
 */
import java.util.Random;
import net.minecraft.block.BlockDoublePlant$EnumPlantType;
import net.minecraft.block.BlockFlower$EnumFlowerType;

public final class daa_3
extends Jy {
    public boolean I;

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Random random, XF xF2) {
        int n2;
        void c2;
        int n3;
        int n4;
        void b2;
        int n5;
        daa_3 daa_32;
        XF d2 = xF2;
        daa_3 a2 = this;
        if (h.J((double)(d2.getX() + Yqa.i) / jsa.Ka, (double)(d2.getZ() + Yqa.i) / jsa.Ka) < fqa.I) {
            daa_32 = a2;
            a2.A.C = Ypa.A;
            a2.A.T = tTa.h;
        } else {
            daa_3 daa_33 = a2;
            daa_33.A.C = AQa.P;
            daa_33.A.T = NTa.C;
            V.J(BlockDoublePlant$EnumPlantType.GRASS);
            int n6 = n5 = uSa.E;
            while (n6 < XTa.W) {
                void v3 = b2;
                n4 = v3.nextInt(ERa.C) + Yqa.i;
                n3 = v3.nextInt(ERa.C) + Yqa.i;
                n2 = v3.nextInt(c2.l(d2.add(n4, uSa.E, n3)).getY() + fPa.i);
                V.J((Gg)c2, (Random)b2, d2.add(n4, n2, n3));
                n6 = ++n5;
            }
            daa_32 = a2;
        }
        if (daa_32.I) {
            V.J(BlockDoublePlant$EnumPlantType.SUNFLOWER);
            int n7 = n5 = uSa.E;
            while (n7 < NTa.C) {
                void v5 = b2;
                n4 = v5.nextInt(ERa.C) + Yqa.i;
                n3 = v5.nextInt(ERa.C) + Yqa.i;
                n2 = v5.nextInt(c2.l(d2.add(n4, uSa.E, n3)).getY() + fPa.i);
                V.J((Gg)c2, (Random)b2, d2.add(n4, n2, n3));
                n7 = ++n5;
            }
        }
        super.J((Gg)c2, (Random)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    public BlockFlower$EnumFlowerType J(Random random, XF xF2) {
        void b2;
        Object c22 = xF2;
        daa_3 a2 = this;
        if (h.J((double)c22.getX() / jsa.Ka, (double)c22.getZ() / jsa.Ka) < fqa.I) {
            int c22 = b2.nextInt(AQa.P);
            switch (c22) {
                case 0: {
                    while (false) {
                    }
                    return BlockFlower$EnumFlowerType.ORANGE_TULIP;
                }
                case 1: {
                    return BlockFlower$EnumFlowerType.RED_TULIP;
                }
                case 2: {
                    return BlockFlower$EnumFlowerType.PINK_TULIP;
                }
                default: {
                    return BlockFlower$EnumFlowerType.WHITE_TULIP;
                }
            }
        }
        if (b2.nextInt(yRa.d) > 0) {
            int c22 = b2.nextInt(yRa.d);
            if (c22 == 0) {
                return BlockFlower$EnumFlowerType.POPPY;
            }
            if (c22 == vRa.d) {
                return BlockFlower$EnumFlowerType.HOUSTONIA;
            }
            return BlockFlower$EnumFlowerType.OXEYE_DAISY;
        }
        return BlockFlower$EnumFlowerType.DANDELION;
    }

    public Jy f(int n2) {
        int b2 = n2;
        daa_3 a2 = this;
        daa_3 daa_32 = b2 = new daa_3(b2);
        b2.J(kTa.p);
        daa_32.I = vRa.d;
        daa_32.d(gsa.C);
        b2.v = EQa.J;
        return daa_32;
    }

    public daa_3(int n2) {
        daa_3 a2;
        int b2 = n2;
        daa_3 daa_32 = a2 = this;
        super(b2);
        daa_32.J(xSa.la, Xpa.R);
        a2.J(Q);
        a2.q.add(new AZ(Rea.class, tTa.h, uqa.g, uua.p));
        daa_3 daa_33 = a2;
        daa_33.A.h = rta.n;
        daa_33.A.C = AQa.P;
        daa_33.A.T = NTa.C;
    }
}

