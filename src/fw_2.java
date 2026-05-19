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

public final class fw_2
extends jW {
    private Block I;

    public fw_2(Block block) {
        Object b2 = block;
        fw_2 a2 = this;
        a2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF2) {
        void c2;
        XF d2 = xF2;
        fw_2 a2 = this;
        if (c2.J(d2.up()).J() != QFa.Gd) {
            return uSa.E != 0;
        }
        if (c2.J(d2.down()).J() != QFa.Gd) {
            return uSa.E != 0;
        }
        if (c2.J(d2).J().J() != Material.air && c2.J(d2).J() != QFa.Gd) {
            return uSa.E != 0;
        }
        int n2 = uSa.E;
        if (c2.J(d2.west()).J() == QFa.Gd) {
            ++n2;
        }
        if (c2.J(d2.east()).J() == QFa.Gd) {
            ++n2;
        }
        if (c2.J(d2.north()).J() == QFa.Gd) {
            ++n2;
        }
        if (c2.J(d2.south()).J() == QFa.Gd) {
            ++n2;
        }
        int n3 = uSa.E;
        if (c2.J(d2.west())) {
            ++n3;
        }
        if (c2.J(d2.east())) {
            ++n3;
        }
        if (c2.J(d2.north())) {
            ++n3;
        }
        if (c2.J(d2.south())) {
            ++n3;
        }
        if (n2 == yRa.d && n3 == vRa.d) {
            void b2;
            c2.J(d2, a2.I.J(), uqa.g);
            c2.J(a2.I, d2, (Random)b2);
        }
        return vRa.d != 0;
    }
}

