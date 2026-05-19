/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Gg
 *  Mda
 *  Vda
 *  Yca
 *  iea
 *  vRa
 */
import net.minecraft.block.BlockDispenser;

public final class RFa_2
extends Yca {
    private boolean I = vRa.d;

    public void J(dc dc2) {
        dc b2 = dc2;
        RFa_2 a2 = this;
        if (a2.I) {
            b2.J().f(PRa.U, b2.J(), uSa.E);
            return;
        }
        b2.J().f(BQa.J, b2.J(), uSa.E);
    }

    /*
     * WARNING - void declaration
     */
    public Mda f(dc dc2, Mda mda2) {
        void b2;
        RFa_2 c2 = mda2;
        RFa_2 a2 = this;
        if (iea.WHITE == iea.byDyeDamage((int)c2.J())) {
            XF xF;
            void v0 = b2;
            Object t2 = v0.J();
            if (Vda.J((Mda)c2, t2, (XF)(xF = v0.J().offset(BlockDispenser.J(b2.J()))))) {
                if (!((Gg)t2).e) {
                    t2.f(BRa.v, xF, uSa.E);
                    return c2;
                }
            } else {
                a2.I = uSa.E;
            }
            return c2;
        }
        return super.f((dc)b2, (Mda)c2);
    }

    public RFa_2() {
        RFa_2 a2;
    }
}

