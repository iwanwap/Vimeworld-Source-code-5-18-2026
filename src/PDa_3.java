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
import net.minecraft.block.BlockTNT;

public final class PDa_3
extends Yca {
    private boolean I = vRa.d;

    public void J(dc dc2) {
        dc b2 = dc2;
        PDa_3 a2 = this;
        if (a2.I) {
            b2.J().f(PRa.U, b2.J(), uSa.E);
            return;
        }
        b2.J().f(BQa.J, b2.J(), uSa.E);
    }

    public PDa_3() {
        PDa_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    public Mda f(dc dc2, Mda mda2) {
        void a2;
        Object c2 = dc2;
        PDa_3 b2 = this;
        PDa_3 pDa_3 = c2;
        Object t2 = pDa_3.J();
        if (t2.J((XF)((Object)(c2 = pDa_3.J().offset(BlockDispenser.J(c2.J())))))) {
            t2.J((XF)((Object)c2), QFa.ic.J());
            if (a2.J(vRa.d, ((Gg)t2).v)) {
                a2.E = uSa.E;
                return a2;
            }
        } else {
            if (t2.J((XF)((Object)c2)).J() == QFa.Lc) {
                QFa.Lc.J((Gg)t2, (XF)((Object)c2), QFa.Lc.J().J(BlockTNT.EXPLODE, vRa.d != 0));
                t2.G((XF)((Object)c2));
                return a2;
            }
            b2.I = uSa.E;
        }
        return a2;
    }
}

