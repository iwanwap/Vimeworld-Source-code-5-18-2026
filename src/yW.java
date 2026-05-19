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
import net.minecraft.block.material.Material;

public final class yW
extends jW {
    public yW() {
        yW a2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF2) {
        int n2;
        XF a2;
        Block block;
        void c2;
        Random d2 = random;
        yW b2 = this;
        void v0 = c2;
        while (((block = v0.J(a2).J()).J() == Material.air || block.J() == Material.leaves) && a2.getY() > 0) {
            a2 = a2.down();
            v0 = c2;
        }
        int n3 = n2 = uSa.E;
        while (n3 < AQa.P) {
            XF xF3 = a2.add(d2.nextInt(Yqa.i) - d2.nextInt(Yqa.i), d2.nextInt(AQa.P) - d2.nextInt(AQa.P), d2.nextInt(Yqa.i) - d2.nextInt(Yqa.i));
            if (c2.J(xF3) && QFa.BB.J((Gg)c2, xF3, QFa.BB.J())) {
                c2.J(xF3, QFa.BB.J(), uqa.g);
            }
            n3 = ++n2;
        }
        return vRa.d != 0;
    }
}

