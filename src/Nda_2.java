/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 *  Mda
 *  Pba
 *  Yca
 *  Yfa
 *  psa
 *  vRa
 */
import net.minecraft.block.BlockDispenser;

public final class Nda_2
extends Yca {
    public Nda_2() {
        Nda_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    public Mda f(dc dc2, Mda mda2) {
        void a2;
        Object c2 = dc2;
        Nda_2 b2 = this;
        Object object = c2;
        c2 = BlockDispenser.J(object.J());
        double d2 = object.l() + (double)((DZ)((Object)c2)).getFrontOffsetX();
        double d3 = (float)object.J().getY() + psa.N;
        double d4 = object.f() + (double)((DZ)((Object)c2)).getFrontOffsetZ();
        c2 = Pba.J(object.J(), (int)a2.J(), (double)d2, (double)d3, (double)d4);
        if (c2 instanceof Gl && a2.l()) {
            ((Yfa)c2).J(a2.J());
        }
        void v1 = a2;
        v1.J(vRa.d);
        return v1;
    }
}

