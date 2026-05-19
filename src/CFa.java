/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  TQa
 *  XC
 *  Yca
 *  isa
 *  lqa
 *  uC
 *  vL
 *  vRa
 */
import net.minecraft.block.BlockDispenser;

public abstract class CFa
extends Yca {
    public abstract XC J(Gg var1, uC var2);

    public void J(dc dc2) {
        dc b2 = dc2;
        CFa a2 = this;
        b2.J().f(TQa.a, b2.J(), uSa.E);
    }

    /*
     * WARNING - void declaration
     */
    public Mda f(dc dc2, Mda mda2) {
        void a2;
        Object b2;
        CFa cFa = this;
        void v0 = b2;
        b2 = v0.J();
        uC uC2 = BlockDispenser.J((dc)v0);
        DZ c2 = BlockDispenser.J(v0.J());
        uC uC3 = uC2 = cFa.J((Gg)b2, uC2);
        uC3.J((double)c2.getFrontOffsetX(), (double)((float)c2.getFrontOffsetY() + Nra.e), (double)c2.getFrontOffsetZ(), cFa.f(), cFa.J());
        b2.f((vL)uC3);
        a2.J(vRa.d);
        return a2;
    }

    public float f() {
        return isa.W;
    }

    public float J() {
        return lqa.ga;
    }

    public CFa() {
        CFa a2;
    }
}

