/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Epa
 *  Gg
 *  Mda
 *  Rda
 *  Ssa
 *  Yca
 *  Yea
 *  vL
 *  vRa
 */
import net.minecraft.block.BlockDispenser;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.BlockRailBase$EnumRailDirection;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class eda
extends Yca {
    private final Yca I;

    public void J(dc dc2) {
        dc b2 = dc2;
        eda a2 = this;
        b2.J().f(PRa.U, b2.J(), uSa.E);
    }

    /*
     * WARNING - void declaration
     */
    public Mda f(dc dc2, Mda mda2) {
        IBlockState iBlockState;
        void a2;
        eda eda2;
        double d2;
        BlockRailBase$EnumRailDirection blockRailBase$EnumRailDirection;
        BlockRailBase$EnumRailDirection blockRailBase$EnumRailDirection2;
        BlockRailBase$EnumRailDirection b2;
        eda eda3 = this;
        void v0 = b2;
        DZ dZ2 = BlockDispenser.J(v0.J());
        eda c2 = v0.J();
        double d3 = v0.l() + (double)dZ2.getFrontOffsetX() * Epa.Ka;
        double d4 = Math.floor(v0.J()) + (double)dZ2.getFrontOffsetY();
        double d5 = v0.f() + (double)dZ2.getFrontOffsetZ() * Epa.Ka;
        XF xF = v0.J().offset(dZ2);
        IBlockState iBlockState2 = c2.J(xF);
        if (iBlockState2.J() instanceof BlockRailBase) {
            IBlockState iBlockState3 = iBlockState2;
            blockRailBase$EnumRailDirection2 = iBlockState3.J(((BlockRailBase)iBlockState3.J()).J());
        } else {
            blockRailBase$EnumRailDirection2 = blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.NORTH_SOUTH;
        }
        if (BlockRailBase.J(iBlockState2)) {
            if (blockRailBase$EnumRailDirection.isAscending()) {
                d2 = oQa.fa;
                eda2 = c2;
            } else {
                d2 = tpa.k;
                eda2 = c2;
            }
        } else {
            BlockRailBase$EnumRailDirection blockRailBase$EnumRailDirection3;
            if (iBlockState2.J().J() != Material.air || !BlockRailBase.J(c2.J(xF.down()))) {
                return eda3.I.J((dc)((Object)b2), (Mda)a2);
            }
            iBlockState = c2.J(xF.down());
            if (iBlockState.J() instanceof BlockRailBase) {
                IBlockState iBlockState4 = iBlockState;
                blockRailBase$EnumRailDirection3 = iBlockState4.J(((BlockRailBase)iBlockState4.J()).J());
            } else {
                blockRailBase$EnumRailDirection3 = b2 = BlockRailBase$EnumRailDirection.NORTH_SOUTH;
            }
            if (dZ2 != DZ.DOWN && b2.isAscending()) {
                d2 = Ssa.fa;
                eda2 = c2;
            } else {
                d2 = cTa.A;
                eda2 = c2;
            }
        }
        iBlockState = Yea.J((Gg)eda2, (double)d3, (double)(d4 + d2), (double)d5, (Rda)qba.J((qba)a2.J()));
        if (a2.l()) {
            iBlockState.J(a2.J());
        }
        c2.f((vL)iBlockState);
        a2.J(vRa.d);
        return a2;
    }

    public eda() {
        eda a2;
        eda eda2 = a2;
        eda2.I = new Yca();
    }
}

