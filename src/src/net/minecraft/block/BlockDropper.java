/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  HA
 *  Mda
 *  Ny
 *  Yca
 *  bb
 *  dz
 *  qX
 *  uY
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.BlockDispenser;
import net.minecraft.block.BlockSourceImpl;

public final class BlockDropper
extends BlockDispenser {
    private final bb dropBehavior;

    public BlockDropper() {
        BlockDropper a2;
        BlockDropper blockDropper = a2;
        blockDropper.dropBehavior = new Yca();
    }

    @Override
    public bb J(Mda mda2) {
        BlockDropper b2 = mda2;
        BlockDropper a2 = this;
        return a2.dropBehavior;
    }

    @Override
    public uY J(Gg gg2, int n2) {
        int c2 = n2;
        BlockDropper a2 = this;
        return new Ny();
    }

    @Override
    public void f(Gg gg2, XF xF) {
        block1: {
            dz dz2;
            int n2;
            Object c2;
            block4: {
                dz dz3;
                block3: {
                    Mda mda2;
                    block5: {
                        DZ dZ2;
                        HA b2;
                        block2: {
                            c2 = xF;
                            BlockDropper a2 = this;
                            BlockSourceImpl blockSourceImpl = new BlockSourceImpl((Gg)b2, (XF)((Object)c2));
                            dz3 = (dz)blockSourceImpl.J();
                            if (dz3 == null) break block1;
                            n2 = dz3.d();
                            if (n2 < 0) {
                                b2.f(BQa.J, (XF)((Object)c2), uSa.E);
                                return;
                            }
                            mda2 = dz3.J(n2);
                            if (mda2 == null) break block1;
                            dZ2 = b2.J((XF)((Object)c2)).J(FACING);
                            if ((b2 = qX.J((Gg)b2, (double)(c2 = ((XF)((Object)c2)).offset(dZ2)).getX(), (double)c2.getY(), (double)c2.getZ())) != null) break block2;
                            c2 = a2.dropBehavior.J((dc)blockSourceImpl, mda2);
                            if (c2 == null || ((Mda)c2).E > 0) break block3;
                            c2 = null;
                            dz2 = dz3;
                            break block4;
                        }
                        c2 = qX.J((HA)b2, (Mda)mda2.J().J(vRa.d), (DZ)dZ2.getOpposite());
                        if (c2 != null) break block5;
                        c2 = mda2.J();
                        if ((((Mda)c2).E -= vRa.d) > 0) break block3;
                        c2 = null;
                        dz2 = dz3;
                        break block4;
                    }
                    c2 = mda2.J();
                }
                dz2 = dz3;
            }
            dz2.J(n2, (Mda)c2);
        }
    }
}

