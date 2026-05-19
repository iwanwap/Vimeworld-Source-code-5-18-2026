/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KI
 *  Kj
 *  Kpa
 *  QFa
 *  Tg
 *  vRa
 */
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

public final class nI_3
extends KI {
    private final IBlockState J;
    private final Block A;
    private final XF I;

    public boolean J(Kpa kpa2, Tg tg) {
        Object c2 = kpa2;
        nI_3 b2 = this;
        if (((Kpa)c2).Ta == null) {
            return uSa.E != 0;
        }
        c2 = ((Kpa)c2).Ta.J(b2.I);
        if (b2.A == null) {
            if (c2.J() != QFa.HF) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (b2.J == null) {
            if (c2.J() == b2.A) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (c2 == b2.J) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public nI_3(Kj kj2) {
        nI_3 b2 = kj2;
        nI_3 a2 = this;
        nI_3 nI_32 = a2;
        nI_32.I = new XF(b2.getX(), b2.getY(), b2.getZ());
        if (b2.hasId()) {
            nI_3 nI_33 = b2;
            a2.A = Block.f(nI_33.getId());
            if (nI_33.hasMeta() && a2.A != null) {
                a2.J = a2.A.J(b2.getMeta());
                return;
            }
            a2.J = null;
            return;
        }
        a2.A = null;
        a2.J = null;
    }
}

