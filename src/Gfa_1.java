/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  Yca
 *  pqa
 *  vL
 *  vRa
 */
import net.minecraft.block.BlockDispenser;

public final class Gfa_1
extends Yca {
    public Gfa_1() {
        Gfa_1 a2;
    }

    /*
     * WARNING - void declaration
     */
    public Mda f(dc dc2, Mda mda2) {
        void a2;
        Object c2 = dc2;
        Gfa_1 b2 = this;
        Gfa_1 gfa_1 = c2;
        Object t2 = gfa_1.J();
        c2 = gfa_1.J().offset(BlockDispenser.J(c2.J()));
        c2 = new vFa((Gg)t2, (double)c2.getX() + kTa.B, c2.getY(), (double)c2.getZ() + kTa.B, null);
        void v1 = a2;
        t2.f((vL)c2);
        t2.J((vL)c2, Jpa.m, pqa.r, pqa.r);
        v1.E -= vRa.d;
        return v1;
    }
}

