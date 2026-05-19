/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  NCa
 *  NTa
 *  Waa
 *  eAa
 *  kta
 *  uY
 *  vRa
 */
package net.minecraft.block;

public final class BlockJukebox$TileEntityJukebox
extends uY {
    private Mda record;

    public void f(Waa waa2) {
        BlockJukebox$TileEntityJukebox b2 = waa2;
        BlockJukebox$TileEntityJukebox a2 = this;
        BlockJukebox$TileEntityJukebox blockJukebox$TileEntityJukebox = b2;
        super.f((Waa)blockJukebox$TileEntityJukebox);
        if (blockJukebox$TileEntityJukebox.J(kta.j, NTa.C)) {
            a2.J(Mda.J((Waa)b2.J(kta.j)));
            return;
        }
        if (b2.J(Jta.J) > 0) {
            a2.J(new Mda(eAa.l((int)b2.J(Jta.J)), vRa.d, uSa.E));
        }
    }

    public Mda J() {
        BlockJukebox$TileEntityJukebox a2;
        return a2.record;
    }

    public void J(Waa waa2) {
        BlockJukebox$TileEntityJukebox a2;
        BlockJukebox$TileEntityJukebox b2 = waa2;
        BlockJukebox$TileEntityJukebox blockJukebox$TileEntityJukebox = a2 = this;
        super.J((Waa)b2);
        if (blockJukebox$TileEntityJukebox.J() != null) {
            b2.J(kta.j, (NCa)a2.J().J(new Waa()));
        }
    }

    public BlockJukebox$TileEntityJukebox() {
        BlockJukebox$TileEntityJukebox a2;
    }

    public void J(Mda mda2) {
        BlockJukebox$TileEntityJukebox b2 = mda2;
        BlockJukebox$TileEntityJukebox a2 = this;
        a2.record = b2;
        a2.f();
    }
}

