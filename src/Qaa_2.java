/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AZ
 *  ERa
 *  Gg
 *  Jy
 *  Kz
 *  Lqa
 *  NTa
 *  Oz
 *  Qaa
 *  Qqa
 *  RQa
 *  Uv
 *  XSa
 *  aSa
 *  kw
 *  psa
 *  qv
 *  sY
 *  vRa
 *  xfa
 */
import java.util.Random;
import net.minecraft.block.BlockDoublePlant$EnumPlantType;
import net.minecraft.block.BlockFlower$EnumFlowerType;

public final class Qaa_2
extends Jy {
    public static final kw j = new kw(uSa.E != 0, vRa.d != 0);
    public static final Uv J;
    private int A;
    public static final kw I;

    public int f(XF xF2) {
        Qaa_2 a2;
        Object b22 = xF2;
        Qaa_2 qaa_2 = a2 = this;
        int b22 = super.f((XF)((Object)b22));
        if (qaa_2.A == yRa.d) {
            return (b22 & Psa.P) + Qqa.T >> vRa.d;
        }
        return b22;
    }

    /*
     * WARNING - void declaration
     */
    public BlockFlower$EnumFlowerType J(Random random, XF xF2) {
        void b2;
        Object c2 = xF2;
        Qaa_2 a2 = this;
        if (a2.A == vRa.d) {
            double d2 = Oz.J((double)((oua.i + h.J((double)c2.getX() / CRa.N, (double)c2.getZ() / CRa.N)) / KPa.y), (double)aSa.V, (double)kua.w);
            BlockFlower$EnumFlowerType blockFlower$EnumFlowerType = BlockFlower$EnumFlowerType.values()[(int)(d2 * (double)BlockFlower$EnumFlowerType.values().length)];
            if (blockFlower$EnumFlowerType == BlockFlower$EnumFlowerType.BLUE_ORCHID) {
                return BlockFlower$EnumFlowerType.POPPY;
            }
            return blockFlower$EnumFlowerType;
        }
        return super.J((Random)b2, (XF)((Object)c2));
    }

    /*
     * WARNING - void declaration
     */
    public Qaa_2(int n2, int n3) {
        void b2;
        int c2 = n3;
        Qaa_2 a2 = this;
        super((int)b2);
        a2.A = c2;
        a2.A.h = NTa.C;
        a2.A.T = uqa.g;
        if (a2.A == vRa.d) {
            Qaa_2 qaa_2 = a2;
            qaa_2.A.h = uua.p;
            qaa_2.A.C = ySa.T;
            qaa_2.A.T = vRa.d;
        }
        Qaa_2 qaa_2 = a2;
        qaa_2.J(Yqa.K);
        a2.J(ZSa.q, xSa.la);
        if (qaa_2.A == uqa.g) {
            a2.v = pta.Ha;
            a2.s = Lqa.d;
            a2.J(Ora.D, Ora.D);
        }
        if (a2.A == 0) {
            a2.q.add(new AZ(xfa.class, tTa.h, AQa.P, AQa.P));
        }
        if (a2.A == yRa.d) {
            a2.A.h = rta.n;
        }
    }

    public bV J(Random random) {
        Random b2 = random;
        Qaa_2 a2 = this;
        if (a2.A == yRa.d && b2.nextInt(yRa.d) > 0) {
            return J;
        }
        if (a2.A != uqa.g && b2.nextInt(tTa.h) != 0) {
            return a2.J;
        }
        return I;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Random random, XF xF2) {
        void a2;
        void c2;
        int n2;
        int n3;
        int n4;
        int n5;
        Random d2 = random;
        Qaa_2 b2 = this;
        if (b2.A == yRa.d) {
            int n6 = n5 = uSa.E;
            while (n6 < AQa.P) {
                int n7 = uSa.E;
                while (n7 < AQa.P) {
                    bV bV2;
                    n4 = n5 * AQa.P + vRa.d + Yqa.i + d2.nextInt(yRa.d);
                    n2 = n3 * AQa.P + vRa.d + Yqa.i + d2.nextInt(yRa.d);
                    XF xF3 = c2.l(a2.add(n4, uSa.E, n2));
                    if (d2.nextInt(kTa.j) == 0) {
                        bV2 = new qv();
                        bV2.J((Gg)c2, d2, xF3);
                    } else {
                        bV bV3 = bV2 = b2.J(d2);
                        bV3.J();
                        if (bV3.J((Gg)c2, d2, xF3)) {
                            bV2.J((Gg)c2, d2, xF3);
                        }
                    }
                    n7 = ++n3;
                }
                n6 = ++n5;
            }
        }
        n5 = d2.nextInt(tTa.h) - yRa.d;
        if (b2.A == vRa.d) {
            n5 += 2;
        }
        int n8 = n3 = uSa.E;
        while (n8 < n5) {
            n4 = d2.nextInt(yRa.d);
            if (n4 == 0) {
                V.J(BlockDoublePlant$EnumPlantType.SYRINGA);
            } else if (n4 == vRa.d) {
                V.J(BlockDoublePlant$EnumPlantType.ROSE);
            } else if (n4 == uqa.g) {
                V.J(BlockDoublePlant$EnumPlantType.PAEONIA);
            }
            int n9 = uSa.E;
            while (n9 < tTa.h) {
                Object object = d2;
                int n10 = ((Random)object).nextInt(ERa.C) + Yqa.i;
                int n11 = ((Random)object).nextInt(ERa.C) + Yqa.i;
                int n12 = ((Random)object).nextInt(c2.l(a2.add(n10, uSa.E, n11)).getY() + fPa.i);
                if (V.J((Gg)c2, d2, new XF(a2.getX() + n10, n12, a2.getZ() + n11))) break;
                n9 = ++n2;
            }
            n8 = ++n3;
        }
        super.J((Gg)c2, d2, (XF)a2);
    }

    /*
     * WARNING - void declaration
     */
    public Jy f(int n2) {
        void a2;
        Qaa_2 qaa_2 = this;
        if (qaa_2.Ka == Jy.Y.Ka) {
            Qaa_2 b2;
            Qaa_2 qaa_22 = b2 = new Qaa_2((int)a2, vRa.d);
            Qaa_2 qaa_23 = qaa_2;
            qaa_22.J(new Kz(qaa_23.Ca, qaa_23.k + psa.N));
            b2.J(RQa.ha);
            b2.J(Iqa.E, vRa.d != 0);
            b2.J(XSa.m);
            return qaa_22;
        }
        if (qaa_2.Ka != Jy.Sa.Ka && qaa_2.Ka != Jy.Aa.Ka) {
            Qaa_2 qaa_24 = qaa_2;
            return new iz((Qaa)qaa_24, (int)a2, qaa_24);
        }
        Qaa_2 qaa_25 = qaa_2;
        return new sY((Qaa)qaa_25, (int)a2, (Jy)qaa_25);
    }

    static {
        I = new kw(uSa.E != 0, uSa.E != 0);
        J = new Uv(uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public Jy J(int n2, boolean bl) {
        void b2;
        boolean c2 = bl;
        Qaa_2 a2 = this;
        if (a2.A == uqa.g) {
            Qaa_2 qaa_2 = a2;
            qaa_2.v = pta.Ha;
            qaa_2.s = b2;
            if (c2) {
                a2.v = (a2.v & Psa.P) >> vRa.d;
            }
            return a2;
        }
        return super.J((int)b2, c2);
    }
}

