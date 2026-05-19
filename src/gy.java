/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AZ
 *  ERa
 *  Gg
 *  Jy
 *  Kz
 *  NTa
 *  QFa
 *  Rw
 *  XTa
 *  ZW
 *  jW
 *  pQa
 *  rx
 *  uQa
 *  vRa
 *  xfa
 */
import java.util.Random;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDirt$DirtType;
import net.minecraft.block.BlockDoublePlant$EnumPlantType;
import net.minecraft.block.BlockTallGrass$EnumType;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class gy
extends Jy {
    private int M;
    private static final Rw k;
    private static final ZW j;
    private static final ZW J;
    private static final rx A;
    private static final Hw I;

    /*
     * Unable to fully structure code
     */
    public void J(Gg var1_2, Random var2_3, oz var3_4, int var4_5, int var5_6, double var6_8) {
        var0_1 = var5_6;
        b = this;
        if (b.M != vRa.d && b.M != uqa.g) ** GOTO lbl13
        v0 = b;
        v0.M = (int)QFa.lf.J();
        v0.G = QFa.Bc.J();
        if (a > Jra.m) {
            v1 = b;
            b.M = (int)QFa.Bc.J().J(BlockDirt.VARIANT, BlockDirt$DirtType.COARSE_DIRT);
        } else {
            if (a > kTa.Q) {
                b.M = (int)QFa.Bc.J().J(BlockDirt.VARIANT, BlockDirt$DirtType.PODZOL);
            }
lbl13:
            // 4 sources

            v1 = b;
        }
        v1.f((Gg)f, (Random)e, (oz)d, (int)c, (int)g, (double)a);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Random random, XF xF) {
        void a2;
        void c2;
        int n2;
        int n3;
        int n4;
        int n5;
        Random d2 = random;
        gy b2 = this;
        if (b2.M == vRa.d || b2.M == uqa.g) {
            n5 = d2.nextInt(yRa.d);
            int n6 = n4 = uSa.E;
            while (n6 < n5) {
                Random random2 = d2;
                n3 = random2.nextInt(ERa.C) + Yqa.i;
                n2 = random2.nextInt(ERa.C) + Yqa.i;
                XF xF2 = c2.l(a2.add(n3, uSa.E, n2));
                I.J((Gg)c2, d2, xF2);
                n6 = ++n4;
            }
        }
        V.J(BlockDoublePlant$EnumPlantType.FERN);
        int n7 = n5 = uSa.E;
        while (n7 < XTa.W) {
            Object object = d2;
            n4 = ((Random)object).nextInt(ERa.C) + Yqa.i;
            n3 = ((Random)object).nextInt(ERa.C) + Yqa.i;
            n2 = ((Random)object).nextInt(c2.l(a2.add(n4, uSa.E, n3)).getY() + fPa.i);
            V.J((Gg)c2, d2, a2.add(n4, n2, n3));
            n7 = ++n5;
        }
        super.J((Gg)c2, d2, (XF)a2);
    }

    public jW J(Random random) {
        Random b2 = random;
        gy a2 = this;
        if (b2.nextInt(tTa.h) > 0) {
            return new dx(BlockTallGrass$EnumType.FERN);
        }
        return new dx(BlockTallGrass$EnumType.GRASS);
    }

    public Jy f(int n2) {
        int b2 = n2;
        gy a2 = this;
        if (a2.Ka == Jy.qa.Ka) {
            gy gy2 = a2;
            return new gy(b2, uqa.g).J(pQa.W, vRa.d != 0).J(uQa.m).J(Yqa.K).J(rta.o, xSa.la).J(new Kz(gy2.Ca, (float)gy2.k));
        }
        return super.f(b2);
    }

    public bV J(Random random) {
        Random b2 = random;
        gy a2 = this;
        if ((a2.M == vRa.d || a2.M == uqa.g) && b2.nextInt(yRa.d) == 0) {
            if (a2.M != uqa.g && b2.nextInt(uua.s) != 0) {
                return j;
            }
            return J;
        }
        if (b2.nextInt(yRa.d) == 0) {
            return A;
        }
        return k;
    }

    /*
     * WARNING - void declaration
     */
    public gy(int n2, int n3) {
        void b2;
        int c2 = n3;
        gy a2 = this;
        super((int)b2);
        a2.M = c2;
        a2.q.add(new AZ(xfa.class, Yqa.i, AQa.P, AQa.P));
        a2.A.h = NTa.C;
        if (a2.M != vRa.d && c2 != uqa.g) {
            gy gy2 = a2;
            gy2.A.T = vRa.d;
            gy2.A.d = vRa.d;
            return;
        }
        gy gy3 = a2;
        gy3.A.T = XTa.W;
        gy3.A.W = vRa.d;
        gy3.A.d = yRa.d;
    }

    static {
        A = new rx();
        k = new Rw(uSa.E != 0);
        j = new ZW(uSa.E != 0, uSa.E != 0);
        J = new ZW(uSa.E != 0, vRa.d != 0);
        I = new Hw(QFa.h, uSa.E);
    }
}

