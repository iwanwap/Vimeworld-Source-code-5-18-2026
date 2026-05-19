/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  XFa
 *  Yca
 *  vRa
 */
import net.minecraft.block.BlockDispenser;

public final class iDa_1
extends Yca {
    private final Yca I;

    public iDa_1() {
        iDa_1 a2;
        iDa_1 iDa_12 = a2;
        iDa_12.I = new Yca();
    }

    /*
     * WARNING - void declaration
     */
    public Mda f(dc dc2, Mda mda2) {
        void a2;
        dc c2 = dc2;
        iDa_1 b2 = this;
        XFa xFa2 = (XFa)a2.J();
        XF xF2 = c2.J().offset(BlockDispenser.J(c2.J()));
        if (xFa2.J(c2.J(), xF2)) {
            void v0 = a2;
            v0.J(Gea.Ca);
            v0.E = vRa.d;
            return v0;
        }
        return b2.I.J(c2, (Mda)a2);
    }
}

