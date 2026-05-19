/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FPa
 *  Gg
 *  Oz
 *  QFa
 *  gFa
 *  kqa
 *  uRa
 *  vRa
 *  vea
 */
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Ffa_2
extends gFa {
    private vea I;

    public boolean f() {
        Ffa_2 a2;
        if (!a2.I.j.J().f(kqa.N)) {
            return uSa.E != 0;
        }
        if (a2.I.J().J().J() != Material.air) {
            return uSa.E != 0;
        }
        if (a2.I.J().nextInt(kTa.j) == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void f() {
        Ffa_2 ffa_2;
        Ffa_2 ffa_22 = ffa_2 = this;
        Random a322 = ffa_22.I.J();
        Gg gg2 = ffa_22.I.j;
        int n2 = Oz.f((double)(ffa_22.I.la - KPa.y + a322.nextDouble() * FPa.T));
        int n3 = Oz.f((double)(ffa_22.I.Z + a322.nextDouble() * uRa.I));
        int a322 = Oz.f((double)(ffa_22.I.A - KPa.y + a322.nextDouble() * FPa.T));
        XF a322 = new XF(n2, n3, a322);
        IBlockState iBlockState = gg2.J(a322);
        Block block = iBlockState.J();
        if (vea.J().contains(block)) {
            ffa_2.I.J(iBlockState);
            gg2.J(a322, QFa.HF.J());
        }
    }

    public Ffa_2(vea vea2) {
        Ffa_2 b2 = vea2;
        Ffa_2 a2 = this;
        a2.I = b2;
    }
}

