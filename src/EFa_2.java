/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  NTa
 *  QFa
 *  XTa
 *  cfa
 *  dpa
 *  hDa
 *  kqa
 *  vRa
 */
import net.minecraft.block.Block;
import net.minecraft.block.BlockCarrot;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class EFa_2
extends hDa {
    private final cfa J;
    private boolean A;
    private boolean I;

    public boolean f() {
        EFa_2 a2;
        if (a2.A <= 0) {
            if (!a2.J.j.J().f(kqa.N)) {
                return uSa.E != 0;
            }
            a2.I = uSa.E;
            a2.A = cfa.J((cfa)a2.J);
        }
        return super.f();
    }

    public boolean J(Gg gg2, XF xF) {
        IBlockState b2;
        Object c2 = xF;
        EFa_2 a2 = this;
        if (b2.J((XF)((Object)c2)).J() == QFa.rd) {
            c2 = ((XF)((Object)c2)).up();
            b2 = b2.J((XF)((Object)c2));
            if (b2.J() instanceof BlockCarrot && b2.J(BlockCarrot.AGE) == XTa.W && a2.A && !a2.I) {
                a2.I = vRa.d;
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }

    public void l() {
        EFa_2 a2;
        super.l();
    }

    public void f() {
        EFa_2 eFa_2;
        EFa_2 eFa_22 = eFa_2 = this;
        super.f();
        EFa_2 eFa_23 = eFa_2;
        eFa_22.J.J().J((double)eFa_23.J.getX() + kTa.B, (double)(eFa_2.J.getY() + vRa.d), (double)eFa_2.J.getZ() + kTa.B, FRa.Ga, (float)eFa_2.J.F());
        if (eFa_23.C()) {
            EFa_2 eFa_24 = eFa_2;
            Gg gg2 = eFa_24.J.j;
            Object a2 = eFa_24.J.up();
            IBlockState iBlockState = gg2.J((XF)((Object)a2));
            Block block = iBlockState.J();
            if (eFa_24.I && block instanceof BlockCarrot && iBlockState.J(BlockCarrot.AGE) == XTa.W) {
                gg2.J((XF)((Object)a2), QFa.HF.J(), uqa.g);
                gg2.f((XF)((Object)a2), vRa.d != 0);
                eFa_2.J.T();
            }
            EFa_2 eFa_25 = eFa_2;
            eFa_25.I = uSa.E;
            eFa_25.A = NTa.C;
        }
    }

    public EFa_2(cfa cfa2) {
        EFa_2 b2 = cfa2;
        EFa_2 a2 = this;
        super((bga)((Object)b2), dpa.X, ERa.C);
        a2.I = uSa.E;
        a2.J = b2;
    }

    public boolean l() {
        EFa_2 a2;
        if (a2.I && super.l()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J() {
        EFa_2 a2;
        super.J();
    }
}

