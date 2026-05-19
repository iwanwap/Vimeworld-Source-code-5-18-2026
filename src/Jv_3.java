/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  QFa
 *  vRa
 */
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class Jv_3
extends hx {
    private final IBlockState A;
    private final IBlockState I;

    /*
     * WARNING - void declaration
     */
    public Jv_3(IBlockState iBlockState, IBlockState iBlockState2) {
        void b2;
        Jv_3 a2;
        Object c2 = iBlockState2;
        Jv_3 jv_3 = a2 = this;
        super(uSa.E != 0);
        jv_3.I = b2;
        jv_3.A = c2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, Random random, XF xF2) {
        Block block;
        void c2;
        Object d2 = xF2;
        Jv_3 a2 = this;
        void v0 = c2;
        while (((block = v0.J((XF)((Object)d2)).J()).J() == Material.air || block.J() == Material.leaves) && d2.getY() > 0) {
            d2 = ((XF)((Object)d2)).down();
            v0 = c2;
        }
        block = c2.J((XF)((Object)d2)).J();
        if (block == QFa.Bc || block == QFa.lf) {
            int n2;
            Object object = d2 = ((XF)((Object)d2)).up();
            a2.J((Gg)c2, (XF)((Object)object), a2.I);
            int n3 = n2 = object.getY();
            while (n3 <= d2.getY() + uqa.g) {
                int n4 = n2 - d2.getY();
                n4 = uqa.g - n4;
                int n5 = d2.getX() - n4;
                while (n5 <= d2.getX() + n4) {
                    int n6;
                    int n7 = n6 - d2.getX();
                    int n8 = d2.getZ() - n4;
                    while (n8 <= d2.getZ() + n4) {
                        XF xF3;
                        void b2;
                        int n9;
                        int n10 = n9 - d2.getZ();
                        if (!(Math.abs(n7) == n4 && Math.abs(n10) == n4 && b2.nextInt(uqa.g) == 0 || c2.J(xF3 = new XF(n6, n2, n9)).J().J())) {
                            Jv_3 jv_3 = a2;
                            jv_3.J((Gg)c2, xF3, jv_3.A);
                        }
                        n8 = ++n9;
                    }
                    n5 = ++n6;
                }
                n3 = ++n2;
            }
        }
        return vRa.d != 0;
    }
}

