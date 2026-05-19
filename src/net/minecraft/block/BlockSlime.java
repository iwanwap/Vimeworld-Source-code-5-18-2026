/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  JPa
 *  Ox
 *  Qqa
 *  aSa
 *  ez
 *  vL
 */
package net.minecraft.block;

import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public final class BlockSlime
extends BlockBreakable {
    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, vL vL2, float f2) {
        void a2;
        BlockSlime e2 = vL2;
        BlockSlime b2 = this;
        if (e2.q()) {
            void c2;
            void d2;
            super.J((Gg)d2, (XF)c2, (vL)e2, (float)a2);
            return;
        }
        e2.f((float)a2, JPa.N);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, vL vL2) {
        BlockSlime c2 = vL2;
        BlockSlime a2 = this;
        if (c2.q()) {
            void b2;
            super.J((Gg)b2, (vL)c2);
            return;
        }
        if (((vL)c2).Ea < aSa.V) {
            BlockSlime blockSlime = c2;
            blockSlime.J(-((vL)blockSlime).Ea);
        }
    }

    @Override
    public ez J() {
        return ez.TRANSLUCENT;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, vL vL2) {
        void b2;
        void c2;
        BlockSlime d2 = vL2;
        BlockSlime a2 = this;
        if (Math.abs(((vL)d2).Ea) < tpa.k && !d2.q()) {
            double d3 = Qqa.b + Math.abs(((vL)d2).Ea) * iSa.P;
            BlockSlime blockSlime = d2;
            blockSlime.f(((vL)blockSlime).i * d3);
            blockSlime.l(((vL)blockSlime).f * d3);
        }
        super.J((Gg)c2, (XF)b2, (vL)d2);
    }

    public BlockSlime() {
        BlockSlime a2;
        BlockSlime blockSlime = a2;
        super(Material.clay, uSa.E != 0, MapColor.grassColor);
        blockSlime.J(yGa.a);
        BlockSlime blockSlime2 = a2;
        blockSlime2.slipperiness = new Ox(xSa.la);
    }
}

