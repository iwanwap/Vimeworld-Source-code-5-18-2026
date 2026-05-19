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

public final class Kx_2
extends jW {
    private final Block A;
    private final boolean I;

    /*
     * WARNING - void declaration
     */
    public Kx_2(Block block, boolean bl) {
        void b2;
        Kx_2 a2;
        boolean c2 = bl;
        Kx_2 kx_2 = a2 = this;
        kx_2.A = b2;
        kx_2.I = c2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF2) {
        void c2;
        XF d2 = xF2;
        Kx_2 a2 = this;
        if (c2.J(d2.up()).J() != QFa.GA) {
            return uSa.E != 0;
        }
        if (c2.J(d2).J().J() != Material.air && c2.J(d2).J() != QFa.GA) {
            return uSa.E != 0;
        }
        int n2 = uSa.E;
        if (c2.J(d2.west()).J() == QFa.GA) {
            ++n2;
        }
        if (c2.J(d2.east()).J() == QFa.GA) {
            ++n2;
        }
        if (c2.J(d2.north()).J() == QFa.GA) {
            ++n2;
        }
        if (c2.J(d2.south()).J() == QFa.GA) {
            ++n2;
        }
        if (c2.J(d2.down()).J() == QFa.GA) {
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
        if (c2.J(d2.down())) {
            ++n3;
        }
        if (!a2.I && n2 == AQa.P && n3 == vRa.d || n2 == tTa.h) {
            void b2;
            c2.J(d2, a2.A.J(), uqa.g);
            c2.J(a2.A, d2, (Random)b2);
        }
        return vRa.d != 0;
    }
}

