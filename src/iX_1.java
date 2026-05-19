/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  Jy
 *  Kz
 *  PW
 *  QFa
 *  Rw
 *  XTa
 *  iX
 *  jW
 *  nQa
 *  pqa
 *  vRa
 *  ysa
 */
import java.util.Random;
import net.minecraft.block.BlockSilverfish;
import net.minecraft.block.BlockSilverfish$EnumType;

public final class iX_1
extends Jy {
    private int M;
    private int k;
    private Rw j;
    private jW J;
    private int A;
    private int I;

    /*
     * Unable to fully structure code
     */
    public void J(Gg var1_2, Random var2_3, oz var3_4, int var4_5, int var5_6, double var6_8) {
        var0_1 = var5_6;
        v0 = b = this;
        v0.M = (int)QFa.lf.J();
        v0.G = QFa.Bc.J();
        if (!(a < pqa.q) && !(a > KPa.y)) ** GOTO lbl-1000
        v1 = b;
        if (v1.I == v1.M) {
            v2 = b;
            b.M = (int)QFa.Q.J();
            b.G = QFa.Q.J();
        } else lbl-1000:
        // 2 sources

        {
            if (a > oua.i) {
                v3 = b;
                if (v3.I != v3.A) {
                    v4 = b;
                    v4.M = (int)QFa.Gd.J();
                    v4.G = QFa.Gd.J();
                }
            }
            v2 = b;
        }
        v2.f((Gg)f, (Random)e, (oz)d, (int)c, (int)g, (double)a);
    }

    public Jy f(int n2) {
        int b2 = n2;
        iX_1 a2 = this;
        return new iX_1(b2, uSa.E != 0).J(a2);
    }

    private iX J(Jy jy) {
        iX_1 a2;
        iX_1 b2 = jy;
        iX_1 iX_12 = a2 = this;
        iX_12.I = a2.M;
        iX_12.J(b2.s, vRa.d != 0);
        a2.J(b2.Ma + nQa.r);
        iX_1 iX_13 = b2;
        a2.J(new Kz(iX_13.Ca, ((Jy)iX_13).k));
        iX_1 iX_14 = b2;
        a2.J(iX_14.E, iX_14.d);
        return iX_12;
    }

    /*
     * WARNING - void declaration
     */
    public iX_1(int n2, boolean bl) {
        void b2;
        iX_1 a2;
        boolean c2 = bl;
        iX_1 iX_12 = a2 = this;
        super((int)b2);
        iX_1 iX_13 = a2;
        iX_12.J = new PW(QFa.Od.J().J(BlockSilverfish.VARIANT, BlockSilverfish$EnumType.STONE), WOa.fa);
        iX_13.j = new Rw(uSa.E != 0);
        iX_12.k = uSa.E;
        iX_12.A = vRa.d;
        iX_12.M = uqa.g;
        iX_12.I = iX_12.k;
        if (c2) {
            a2.A.h = yRa.d;
            a2.I = a2.A;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Random random, XF xF) {
        int n2;
        int n3;
        int n4;
        void a2;
        void b2;
        void c2;
        iX_1 iX_12 = this;
        super.J((Gg)c2, (Random)b2, (XF)a2);
        int n5 = yRa.d + b2.nextInt(uua.p);
        int n6 = n4 = uSa.E;
        while (n6 < n5) {
            int d22;
            void v1 = b2;
            n3 = v1.nextInt(ERa.C);
            Object d22 = a2.add(n3, n2 = v1.nextInt(EPa.O) + AQa.P, d22 = v1.nextInt(ERa.C));
            if (c2.J((XF)((Object)d22)).J() == QFa.Gd) {
                c2.J((XF)((Object)d22), QFa.c.J(), uqa.g);
            }
            n6 = ++n4;
        }
        int n7 = n5 = uSa.E;
        while (n7 < XTa.W) {
            void v3 = b2;
            n4 = v3.nextInt(ERa.C);
            n3 = v3.nextInt(ysa.s);
            n2 = v3.nextInt(ERa.C);
            iX_12.J.J((Gg)c2, (Random)b2, a2.add(n4, n3, n2));
            n7 = ++n5;
        }
    }

    public bV J(Random random) {
        Random b2 = random;
        iX_1 a2 = this;
        if (b2.nextInt(yRa.d) > 0) {
            return a2.j;
        }
        return super.J(b2);
    }
}

