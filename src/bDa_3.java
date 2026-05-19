/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  VQa
 *  iea
 *  nDa
 */
import net.minecraft.block.Block;

public final class bDa_3
extends nDa {
    private final int I;

    public String C(Mda mda2) {
        bDa_3 b2 = mda2;
        bDa_3 a2 = this;
        return new StringBuilder().insert(2 & 5, super.J()).append(VQa.ja).append(iea.byMetadata((int)(b2.J() + a2.I)).getUnlocalizedName()).toString();
    }

    /*
     * WARNING - void declaration
     */
    public bDa_3(Block block, int n2) {
        void b2;
        bDa_3 a2;
        int c2 = n2;
        bDa_3 bDa_32 = a2 = this;
        super((Block)b2);
        bDa_32.I = c2;
        bDa_32.J(osa.V);
    }
}

