/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  TQa
 *  Yca
 *  gea
 *  psa
 *  vL
 *  vRa
 */
import net.minecraft.block.BlockDispenser;

public final class vEa
extends Yca {
    public vEa() {
        vEa a2;
    }

    /*
     * WARNING - void declaration
     */
    public Mda f(dc dc2, Mda mda2) {
        void a2;
        Object c2 = dc2;
        vEa b2 = this;
        Object object = c2;
        DZ dZ2 = BlockDispenser.J(object.J());
        double d2 = object.l() + (double)dZ2.getFrontOffsetX();
        double d3 = (float)object.J().getY() + psa.N;
        double d4 = object.f() + (double)dZ2.getFrontOffsetZ();
        c2 = new gea(c2.J(), d2, d3, d4, (Mda)a2);
        object.J().f((vL)c2);
        a2.J(vRa.d);
        return a2;
    }

    public void J(dc dc2) {
        dc b2 = dc2;
        vEa a2 = this;
        b2.J().f(TQa.a, b2.J(), uSa.E);
    }
}

