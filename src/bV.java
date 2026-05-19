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

public abstract class bV
extends jW {
    public boolean J(Block block) {
        Block b2 = block;
        bV a2 = this;
        Material material = b2.J();
        if (material == Material.air || material == Material.leaves || b2 == QFa.lf || b2 == QFa.Bc || b2 == QFa.UA || b2 == QFa.hf || b2 == QFa.nE || b2 == QFa.Y || b2 == QFa.vC) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, XF xF) {
        void b2;
        Object c2 = xF;
        bV a2 = this;
        if (b2.J((XF)((Object)c2)).J() != QFa.Bc) {
            a2.J((Gg)b2, (XF)((Object)c2), QFa.Bc.J());
        }
    }

    public void J(Gg gg2, Random random, XF object) {
        Object d2 = object;
        object = this;
    }

    public bV(boolean bl) {
        boolean b2 = bl;
        bV a2 = this;
        super(b2);
    }
}

