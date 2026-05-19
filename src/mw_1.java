/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  QFa
 *  hra
 *  vRa
 */
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class mw_1
extends bV {
    public final IBlockState j;
    public int J;
    public final int A;
    public final IBlockState I;

    /*
     * WARNING - void declaration
     */
    public void f(Gg gg2, XF xF, int n2) {
        void var5_8;
        void a2;
        mw_1 mw_12 = this;
        void v0 = a2;
        void var4_7 = v0 * v0;
        void v1 = var5_8 = -a2;
        while (v1 <= a2 + vRa.d) {
            void v2 = -a2;
            while (v2 <= a2 + vRa.d) {
                void var6_9;
                block7: {
                    void b2;
                    XF d22;
                    void c2;
                    Material material;
                    block6: {
                        void d22 = var5_8 - vRa.d;
                        void var8_10 = var6_9 - vRa.d;
                        void v3 = var5_8;
                        void v4 = var6_9;
                        if (v3 * v3 + v4 * v4 <= var4_7) break block6;
                        void v5 = d22;
                        void v6 = var8_10;
                        if (v5 * v5 + v6 * v6 <= var4_7) break block6;
                        void v7 = var5_8;
                        void v8 = var8_10;
                        if (v7 * v7 + v8 * v8 <= var4_7) break block6;
                        void v9 = d22;
                        void v10 = var6_9;
                        if (v9 * v9 + v10 * v10 > var4_7) break block7;
                    }
                    if ((material = c2.J(d22 = b2.add((int)var5_8, uSa.E, (int)var6_9)).J().J()) == Material.air || material == Material.leaves) {
                        mw_12.J((Gg)c2, d22, mw_12.j);
                    }
                }
                v2 = ++var6_9;
            }
            v1 = ++var5_8;
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(Gg gg2, XF xF, int n2) {
        void a2;
        void b2;
        mw_1 mw_12 = this;
        int n3 = vRa.d;
        if (b2.getY() >= vRa.d && b2.getY() + a2 + vRa.d <= hra.Ja) {
            int n4;
            int n5 = n4 = uSa.E;
            while (n5 <= vRa.d + a2) {
                int n6;
                int d2 = uqa.g;
                if (n4 == 0) {
                    n6 = d2 = vRa.d;
                } else {
                    if (n4 >= vRa.d + a2 - uqa.g) {
                        d2 = uqa.g;
                    }
                    n6 = d2;
                }
                int n7 = -n6;
                while (n7 <= d2 && n3 != 0) {
                    int n8;
                    int n9 = -d2;
                    while (n9 <= d2 && n3 != 0) {
                        int n10;
                        void c2;
                        if (b2.getY() + n4 < 0 || b2.getY() + n4 >= hra.Ja || !mw_12.J(c2.J(b2.add(n8, n4, n10)).J())) {
                            n3 = uSa.E;
                        }
                        n9 = ++n10;
                    }
                    n7 = ++n8;
                }
                n5 = ++n4;
            }
            return n3 != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public mw_1(boolean bl, int n2, int n3, IBlockState iBlockState, IBlockState iBlockState2) {
        Object f2;
        void b2;
        void c2;
        void d2;
        void e2;
        mw_1 a2;
        mw_1 mw_12 = object;
        Object object = iBlockState2;
        mw_1 mw_13 = a2 = mw_12;
        mw_1 mw_14 = a2;
        super((boolean)e2);
        mw_14.A = d2;
        mw_14.J = c2;
        mw_13.I = b2;
        mw_13.j = f2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF, int n2) {
        void a2;
        void d2;
        mw_1 b2 = this;
        Object e2 = xF;
        if (b2.J((Gg)d2, (XF)((Object)e2), (int)a2) && b2.J((XF)((Object)e2), (Gg)d2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, XF xF, int n2) {
        int n3;
        int d2 = n2;
        mw_1 a2 = this;
        int n4 = d2;
        int n5 = n4 * n4;
        int n6 = n3 = -d2;
        while (n6 <= d2) {
            int n7 = -d2;
            while (n7 <= d2) {
                void b2;
                XF xF2;
                void c2;
                Material material;
                int n8;
                int n9 = n3;
                int n10 = n8;
                if (n9 * n9 + n10 * n10 <= n5 && ((material = c2.J(xF2 = b2.add(n3, uSa.E, n8)).J().J()) == Material.air || material == Material.leaves)) {
                    a2.J((Gg)c2, xF2, a2.j);
                }
                n7 = ++n8;
            }
            n6 = ++n3;
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(XF xF, Gg gg2) {
        void a2;
        void b2;
        mw_1 mw_12 = this;
        Object c2 = b2.down();
        Block block = a2.J((XF)((Object)c2)).J();
        if ((block == QFa.lf || block == QFa.Bc) && b2.getY() >= uqa.g) {
            mw_1 mw_13 = mw_12;
            void v1 = a2;
            mw_1 mw_14 = c2;
            mw_12.J((Gg)a2, (XF)((Object)mw_14));
            mw_12.J((Gg)v1, ((XF)((Object)mw_14)).east());
            mw_13.J((Gg)v1, ((XF)((Object)c2)).south());
            mw_13.J((Gg)a2, ((XF)((Object)c2)).south().east());
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public int J(Random random) {
        void a2;
        mw_1 mw_12;
        mw_1 mw_13 = mw_12 = this;
        int b2 = a2.nextInt(yRa.d) + mw_13.A;
        if (mw_13.J > vRa.d) {
            b2 += a2.nextInt(mw_12.J);
        }
        return b2;
    }
}

