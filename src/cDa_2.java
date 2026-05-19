/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  QFa
 *  Yca
 *  vRa
 */
import net.minecraft.block.BlockDispenser;
import net.minecraft.block.BlockPumpkin;

public final class cDa_2
extends Yca {
    private boolean I = vRa.d;

    public void J(dc dc2) {
        dc b2 = dc2;
        cDa_2 a2 = this;
        if (a2.I) {
            b2.J().f(PRa.U, b2.J(), uSa.E);
            return;
        }
        b2.J().f(BQa.J, b2.J(), uSa.E);
    }

    public cDa_2() {
        cDa_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    public Mda f(dc dc2, Mda mda2) {
        void a2;
        Object c2 = dc2;
        cDa_2 b2 = this;
        cDa_2 cDa_22 = c2;
        Object t2 = cDa_22.J();
        c2 = cDa_22.J().offset(BlockDispenser.J(c2.J()));
        BlockPumpkin blockPumpkin = (BlockPumpkin)QFa.s;
        if (t2.J((XF)((Object)c2)) && blockPumpkin.l((Gg)t2, (XF)((Object)c2))) {
            if (!((Gg)t2).e) {
                t2.J((XF)((Object)c2), blockPumpkin.J(), yRa.d);
            }
            void v1 = a2;
            v1.E -= vRa.d;
            return v1;
        }
        b2.I = uSa.E;
        return a2;
    }
}

