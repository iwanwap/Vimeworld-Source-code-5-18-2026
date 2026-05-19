/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  QFa
 *  jW
 *  vRa
 */
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.BlockTallGrass$EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class dx
extends jW {
    private final IBlockState I;

    public dx(BlockTallGrass$EnumType blockTallGrass$EnumType) {
        Object b2 = blockTallGrass$EnumType;
        dx a2 = this;
        a2.I = QFa.y.J().J(BlockTallGrass.TYPE, b2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF) {
        int n2;
        XF a2;
        Block block;
        void c2;
        Random d2 = random;
        dx b2 = this;
        void v0 = c2;
        while (((block = v0.J(a2).J()).J() == Material.air || block.J() == Material.leaves) && a2.getY() > 0) {
            a2 = a2.down();
            v0 = c2;
        }
        int n3 = n2 = uSa.E;
        while (n3 < XOa.h) {
            XF xF2 = a2.add(d2.nextInt(Yqa.i) - d2.nextInt(Yqa.i), d2.nextInt(AQa.P) - d2.nextInt(AQa.P), d2.nextInt(Yqa.i) - d2.nextInt(Yqa.i));
            if (c2.J(xF2) && QFa.y.J((Gg)c2, xF2, b2.I)) {
                c2.J(xF2, b2.I, uqa.g);
            }
            n3 = ++n2;
        }
        return vRa.d != 0;
    }
}

