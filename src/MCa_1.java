/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  VQa
 *  vRa
 */
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;

public final class MCa_1
extends kda {
    private final BlockLeaves I;

    public MCa_1(BlockLeaves blockLeaves) {
        MCa_1 a2;
        Object b2 = blockLeaves;
        MCa_1 mCa_1 = a2 = this;
        super((Block)b2);
        mCa_1.I = b2;
        mCa_1.f(uSa.E);
        a2.J(vRa.d != 0);
    }

    public int J(int n2) {
        int b2 = n2;
        MCa_1 a2 = this;
        return b2 | AQa.P;
    }

    public int J(Mda mda2, int n2) {
        MCa_1 b2;
        MCa_1 c2 = mda2;
        MCa_1 mCa_1 = b2 = this;
        return mCa_1.I.J(mCa_1.I.J(c2.J()));
    }

    @Override
    public String C(Mda mda2) {
        MCa_1 b2 = mda2;
        MCa_1 a2 = this;
        return new StringBuilder().insert(5 >> 3, super.J()).append(VQa.ja).append(a2.I.J(b2.J()).getUnlocalizedName()).toString();
    }
}

