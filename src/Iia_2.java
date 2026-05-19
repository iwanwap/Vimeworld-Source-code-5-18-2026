/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  ODa
 *  QFa
 *  hDa
 *  vRa
 */
import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockBed$EnumPartType;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Iia_2
extends hDa {
    private final ODa I;

    public void f() {
        Iia_2 a2;
        Iia_2 iia_2 = a2;
        super.f();
        iia_2.I.J().J(uSa.E != 0);
        if (!iia_2.C()) {
            a2.I.I(uSa.E != 0);
            return;
        }
        if (!a2.I.v()) {
            a2.I.I(vRa.d != 0);
        }
    }

    public boolean l() {
        Iia_2 a2;
        return super.l();
    }

    public void J() {
        Iia_2 a2;
        Iia_2 iia_2 = a2;
        super.J();
        iia_2.I.I(uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, XF xF2) {
        void a2;
        Iia_2 c2 = gg2;
        Iia_2 b2 = this;
        if (!c2.J(a2.up())) {
            return uSa.E != 0;
        }
        IBlockState iBlockState = c2.J((XF)a2);
        Block block = iBlockState.J();
        if (block == QFa.dC) {
            if ((c2 = c2.J((XF)a2)) instanceof Fz && ((Fz)((Object)c2)).I < vRa.d) {
                return vRa.d != 0;
            }
        } else {
            if (block == QFa.CB) {
                return vRa.d != 0;
            }
            if (block == QFa.Pd && iBlockState.J(BlockBed.PART) != BlockBed$EnumPartType.HEAD) {
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }

    public void l() {
        Iia_2 a2;
        Iia_2 iia_2 = a2;
        super.l();
        iia_2.I.J().J(uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public Iia_2(ODa oDa2, double d2) {
        void a2;
        Iia_2 c2 = oDa2;
        Iia_2 b2 = this;
        super((bga)((Object)c2), (double)a2, Yqa.i);
        b2.I = c2;
    }

    public boolean f() {
        Iia_2 a2;
        if (a2.I.ba() && !a2.I.v() && super.f()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

