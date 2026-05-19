/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Jy
 *  QFa
 *  bY
 */
import java.util.Random;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDirt$DirtType;

public final class BZ_2
extends bY {
    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Random random, oz oz2, int n2, int n3, double d2) {
        void g2;
        void c2;
        void d3;
        void e2;
        void f2;
        BZ_2 bZ_2;
        void a2;
        BZ_2 b2;
        int n4 = n3;
        BZ_2 bZ_22 = b2 = this;
        bZ_22.M = QFa.lf.J();
        bZ_22.G = QFa.Bc.J();
        if (a2 > Jra.m) {
            bZ_2 = b2;
            b2.M = QFa.Gd.J();
            b2.G = QFa.Gd.J();
        } else {
            if (a2 > KPa.I) {
                b2.M = QFa.Bc.J().J(BlockDirt.VARIANT, BlockDirt$DirtType.COARSE_DIRT);
            }
            bZ_2 = b2;
        }
        bZ_2.f((Gg)f2, (Random)e2, (oz)d3, (int)c2, (int)g2, (double)a2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Random random, XF xF2) {
        void b2;
        void c2;
        Object d2 = xF2;
        BZ_2 a2 = this;
        a2.A.J((Gg)c2, (Random)b2, (Jy)a2, (XF)((Object)d2));
    }

    /*
     * WARNING - void declaration
     */
    public BZ_2(int n2, Jy jy2) {
        void b2;
        BZ_2 c2 = jy2;
        BZ_2 a2 = this;
        super((int)b2, (Jy)c2);
        a2.A.h = uqa.g;
        a2.A.C = uqa.g;
        a2.A.T = tTa.h;
    }
}

