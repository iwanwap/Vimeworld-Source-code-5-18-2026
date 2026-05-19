/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  NTa
 *  QFa
 *  vRa
 */
import java.util.Random;
import net.minecraft.block.BlockSilverfish;
import net.minecraft.block.BlockSilverfish$EnumType;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class fea_2
extends HDa {
    private final qda J;
    private boolean A;
    private DZ I;

    @Override
    public void l() {
        fea_2 fea_22 = this;
        if (!fea_22.A) {
            super.l();
            return;
        }
        Gg gg2 = fea_22.J.j;
        Object a2 = new XF(fea_22.J.la, fea_22.J.Z + kTa.B, fea_22.J.A).offset(fea_22.I);
        IBlockState iBlockState = gg2.J((XF)((Object)a2));
        if (BlockSilverfish.J(iBlockState)) {
            gg2.J((XF)((Object)a2), QFa.Od.J().J(BlockSilverfish.VARIANT, BlockSilverfish$EnumType.forModelBlock(iBlockState)), yRa.d);
            fea_2 fea_23 = fea_22;
            fea_23.J.Q();
            fea_23.J.k();
        }
    }

    public fea_2(qda qda2) {
        fea_2 a2;
        Object b2 = qda2;
        fea_2 fea_22 = a2 = this;
        super((bga)((Object)b2), oua.i, NTa.C);
        fea_22.J = b2;
        fea_22.J(vRa.d);
    }

    @Override
    public boolean f() {
        fea_2 fea_22 = this;
        if (fea_22.J.C() != null) {
            return uSa.E != 0;
        }
        if (!fea_22.J.J().f()) {
            return uSa.E != 0;
        }
        Object a2 = fea_22.J.J();
        if (((Random)a2).nextInt(NTa.C) == 0) {
            fea_22.I = DZ.random((Random)a2);
            fea_2 fea_23 = fea_22;
            a2 = new XF(fea_23.J.la, fea_22.J.Z + kTa.B, fea_22.J.A).offset(fea_22.I);
            if (BlockSilverfish.J(fea_23.J.j.J((XF)((Object)a2)))) {
                fea_22.A = vRa.d;
                return vRa.d != 0;
            }
        }
        fea_22.A = uSa.E;
        return super.f();
    }

    @Override
    public boolean l() {
        fea_2 a2;
        if (a2.A) {
            return uSa.E != 0;
        }
        return super.l();
    }
}

