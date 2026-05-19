/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  Yca
 *  dz
 *  eAa
 *  vRa
 */
import net.minecraft.block.Block;
import net.minecraft.block.BlockDispenser;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class SFa
extends Yca {
    private final Yca I;

    public SFa() {
        SFa a2;
        SFa sFa2 = a2;
        sFa2.I = new Yca();
    }

    /*
     * WARNING - void declaration
     */
    public Mda f(dc dc2, Mda mda2) {
        void a2;
        Object t2;
        SFa c2;
        XF xF;
        void b2;
        SFa sFa2 = this;
        void v0 = b2;
        Object t3 = v0.J();
        IBlockState iBlockState = t3.J(xF = v0.J().offset(BlockDispenser.J(b2.J())));
        Block block = iBlockState.J();
        Material material = block.J();
        if (Material.water.equals(material) && block instanceof BlockLiquid && iBlockState.J(BlockLiquid.LEVEL) == 0) {
            c2 = Gea.Ba;
            t2 = t3;
        } else {
            if (!Material.lava.equals(material) || !(block instanceof BlockLiquid) || iBlockState.J(BlockLiquid.LEVEL) != 0) {
                return super.f((dc)b2, (Mda)a2);
            }
            c2 = Gea.eb;
            t2 = t3;
        }
        t2.G(xF);
        if ((a2.E -= vRa.d) == 0) {
            void v2 = a2;
            v2.J((eAa)c2);
            v2.E = vRa.d;
            return v2;
        }
        if (((dz)b2.J()).J(new Mda((eAa)c2)) < 0) {
            sFa2.I.J((dc)b2, new Mda((eAa)c2));
        }
        return a2;
    }
}

