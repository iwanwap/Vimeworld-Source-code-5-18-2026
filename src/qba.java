/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  Rda
 *  Yea
 *  aSa
 *  bb
 *  eAa
 *  vL
 *  vRa
 */
import net.minecraft.block.BlockDispenser;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.BlockRailBase$EnumRailDirection;
import net.minecraft.block.state.IBlockState;

public final class qba
extends eAa {
    private static final bb A = new eda();
    private final Rda I;

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Sx sx, Gg gg2, XF xF, DZ dZ, float f2, float f3, float f4) {
        void e2;
        void f5;
        Object i2 = sx;
        qba g = this;
        i2 = f5.J((XF)e2);
        if (BlockRailBase.J((IBlockState)i2)) {
            if (!f5.e) {
                void h;
                BlockRailBase$EnumRailDirection blockRailBase$EnumRailDirection;
                if (i2.J() instanceof BlockRailBase) {
                    Object object = i2;
                    blockRailBase$EnumRailDirection = object.J(((BlockRailBase)object.J()).J());
                } else {
                    blockRailBase$EnumRailDirection = BlockRailBase$EnumRailDirection.NORTH_SOUTH;
                }
                BlockRailBase$EnumRailDirection d2 = blockRailBase$EnumRailDirection;
                double d3 = aSa.V;
                if (d2.isAscending()) {
                    d3 = kTa.B;
                }
                i2 = Yea.J((Gg)f5, (double)((double)e2.getX() + kTa.B), (double)((double)e2.getY() + BQa.R + d3), (double)((double)e2.getZ() + kTa.B), (Rda)g.I);
                if (h.l()) {
                    i2.J(h.J());
                }
                f5.f((vL)i2);
            }
            h.E -= vRa.d;
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ Rda J(qba a2) {
        return a2.I;
    }

    public qba(Rda rda2) {
        qba b2 = rda2;
        qba a2 = this;
        a2.i = vRa.d;
        a2.I = b2;
        a2.J(yGa.f);
        BlockDispenser.dispenseBehaviorRegistry.J(a2, A);
    }
}

