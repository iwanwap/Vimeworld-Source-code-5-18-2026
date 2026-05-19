/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  jW
 *  vRa
 *  ysa
 */
import java.util.Random;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockFlower$EnumFlowerType;
import net.minecraft.block.state.IBlockState;

public final class Ww_2
extends jW {
    private BlockFlower A;
    private IBlockState I;

    /*
     * WARNING - void declaration
     */
    public void J(BlockFlower blockFlower, BlockFlower$EnumFlowerType blockFlower$EnumFlowerType) {
        void a2;
        Ww_2 b2;
        BlockFlower c2 = blockFlower;
        Ww_2 ww_2 = b2 = this;
        ww_2.A = c2;
        ww_2.I = c2.J().J(c2.J(), a2);
    }

    /*
     * WARNING - void declaration
     */
    public Ww_2(BlockFlower blockFlower, BlockFlower$EnumFlowerType blockFlower$EnumFlowerType) {
        void b2;
        Ww_2 a2;
        Object c2 = blockFlower$EnumFlowerType;
        Ww_2 ww_2 = a2 = this;
        ww_2.J((BlockFlower)b2, (BlockFlower$EnumFlowerType)((Object)c2));
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF2) {
        int n2;
        Random d2 = random;
        Ww_2 b2 = this;
        int n3 = n2 = uSa.E;
        while (n3 < ysa.s) {
            void c2;
            void a2;
            XF xF3 = a2.add(d2.nextInt(Yqa.i) - d2.nextInt(Yqa.i), d2.nextInt(AQa.P) - d2.nextInt(AQa.P), d2.nextInt(Yqa.i) - d2.nextInt(Yqa.i));
            if (c2.J(xF3) && (!c2.F.f() || xF3.getY() < osa.Ja) && b2.A.J((Gg)c2, xF3, b2.I)) {
                c2.J(xF3, b2.I, uqa.g);
            }
            n3 = ++n2;
        }
        return vRa.d != 0;
    }
}

