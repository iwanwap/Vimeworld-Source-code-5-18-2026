/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  MQa
 *  Mda
 *  QFa
 *  dEa
 *  eAa
 *  kta
 *  pqa
 *  vRa
 *  wda
 */
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDirt$DirtType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class Hea
extends eAa {
    public wda I;

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Sx sx2, Gg gg2, XF xF2, IBlockState iBlockState) {
        void d2;
        void e2;
        IBlockState f2;
        void b2;
        void c2;
        Hea hea = iBlockState2;
        IBlockState iBlockState2 = iBlockState;
        Hea a2 = hea;
        void v1 = c2;
        v1.J((double)((float)b2.getX() + MQa.L), (double)((float)b2.getY() + MQa.L), (double)((float)b2.getZ() + MQa.L), f2.J().stepSound.J(), (f2.J().stepSound.f() + pqa.r) / kta.v, f2.J().stepSound.J() * xSa.la);
        if (v1.e) {
            return vRa.d != 0;
        }
        c2.J((XF)b2, f2);
        e2.J(vRa.d, (Gl)d2);
        return vRa.d != 0;
    }

    public boolean i() {
        return vRa.d != 0;
    }

    public Hea(wda wda2) {
        Hea b2 = wda2;
        Hea a2 = this;
        a2.I = b2;
        a2.i = vRa.d;
        a2.f(b2.getMaxUses());
        a2.J(yGa.J);
    }

    public String f() {
        Hea a2;
        return a2.I.toString();
    }

    /*
     * WARNING - void declaration
     */
    public float J(Mda mda2, Block block) {
        void b2;
        Object c2 = block;
        Hea a2 = this;
        if (c2 == QFa.lC || c2 == QFa.db) {
            return a2.I.getEfficiencyOnProperMaterial();
        }
        return super.J((Mda)b2, (Block)c2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Sx sx2, Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4) {
        void f5;
        void h2;
        void d2;
        XF i2;
        void g2;
        Hea hea = xF3;
        XF xF3 = xF2;
        Hea e2 = hea;
        if (!g2.J(i2.offset((DZ)d2), (DZ)d2, (Mda)h2)) {
            return uSa.E != 0;
        }
        IBlockState c2 = f5.J(i2);
        Block b2 = c2.J();
        if (d2 != DZ.DOWN && f5.J(i2.up()).J().J() == Material.air) {
            if (b2 == QFa.lf) {
                return e2.J((Mda)h2, (Sx)g2, (Gg)f5, i2, QFa.rd.J());
            }
            if (b2 == QFa.Bc) {
                switch (dEa.I[c2.J(BlockDirt.VARIANT).ordinal()]) {
                    case 1: {
                        while (false) {
                        }
                        return e2.J((Mda)h2, (Sx)g2, (Gg)f5, i2, QFa.rd.J());
                    }
                    case 2: {
                        return e2.J((Mda)h2, (Sx)g2, (Gg)f5, i2, QFa.Bc.J().J(BlockDirt.VARIANT, BlockDirt$DirtType.DIRT));
                    }
                }
            }
        }
        return uSa.E != 0;
    }
}

