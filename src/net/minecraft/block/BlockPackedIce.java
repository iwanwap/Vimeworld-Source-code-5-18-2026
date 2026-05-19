/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  MQa
 *  Ox
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class BlockPackedIce
extends Block {
    public BlockPackedIce() {
        super(Material.packedIce);
        BlockPackedIce a2;
        a2.slipperiness = new Ox(MQa.d);
        a2.J(yGa.A);
    }

    @Override
    public int J(Random random) {
        Random b2 = random;
        BlockPackedIce a2 = this;
        return uSa.E;
    }
}

