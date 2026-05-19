/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  VQa
 *  iea
 *  vRa
 */
import net.minecraft.block.Block;

public class nDa_3
extends kda {
    public int J(int n2) {
        int b2 = n2;
        nDa_3 a2 = this;
        return b2;
    }

    @Override
    public String C(Mda mda2) {
        nDa_3 b2 = mda2;
        nDa_3 a2 = this;
        return new StringBuilder().insert(3 ^ 3, super.J()).append(VQa.ja).append(iea.byMetadata((int)b2.J()).getUnlocalizedName()).toString();
    }

    public nDa_3(Block block) {
        nDa_3 a2;
        Object b2 = block;
        nDa_3 nDa_32 = a2 = this;
        super((Block)b2);
        nDa_32.f(uSa.E);
        a2.J(vRa.d != 0);
    }
}

