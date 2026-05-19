/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ez
 *  psa
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class BlockCustomLeaves
extends Block {
    public boolean isTransparent;

    public void J(boolean bl) {
        boolean b2 = bl;
        BlockCustomLeaves a2 = this;
        a2.isTransparent = b2;
    }

    @Override
    public boolean e() {
        return uSa.E != 0;
    }

    public BlockCustomLeaves() {
        BlockCustomLeaves a2;
        BlockCustomLeaves blockCustomLeaves = a2;
        super(Material.leavesCustom);
        blockCustomLeaves.J(yGa.a);
        a2.J(psa.N);
        a2.J(vRa.d);
        a2.J(soundTypeGrass);
    }

    @Override
    public boolean g() {
        BlockCustomLeaves a2;
        if (!a2.isTransparent) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public ez J() {
        BlockCustomLeaves a2;
        if (a2.isTransparent) {
            return ez.CUTOUT_MIPPED;
        }
        return ez.SOLID;
    }
}

