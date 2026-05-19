/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ez
 *  vRa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;

public final class BlockGlass
extends BlockBreakable {
    @Override
    public ez J() {
        return ez.CUTOUT;
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    @Override
    public boolean G() {
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public BlockGlass(Material material, boolean bl2) {
        void b2;
        BlockGlass a2;
        boolean c2 = bl2;
        BlockGlass blockGlass = a2 = this;
        super((Material)b2, c2);
        blockGlass.J(yGa.A);
    }

    @Override
    public int J(Random random) {
        Random b2 = random;
        BlockGlass a2 = this;
        return uSa.E;
    }
}

