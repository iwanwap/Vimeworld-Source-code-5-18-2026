/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  Yca
 *  bpa
 *  uC
 *  vL
 *  vRa
 */
import java.util.Random;
import net.minecraft.block.BlockDispenser;

public final class jDa_1
extends Yca {
    public jDa_1() {
        jDa_1 a2;
    }

    /*
     * WARNING - void declaration
     */
    public Mda f(dc dc2, Mda mda2) {
        void a2;
        Object c2 = dc2;
        jDa_1 b2 = this;
        Object object = c2;
        c2 = BlockDispenser.J(object.J());
        uC uC2 = BlockDispenser.J((dc)object);
        double d2 = uC2.l() + (double)((float)((DZ)((Object)c2)).getFrontOffsetX() * bpa.K);
        double d3 = uC2.J() + (double)((float)((DZ)((Object)c2)).getFrontOffsetY() * bpa.K);
        double d4 = uC2.f() + (double)((float)((DZ)((Object)c2)).getFrontOffsetZ() * bpa.K);
        Object t2 = object.J();
        Random random = ((Gg)t2).v;
        double d5 = random.nextGaussian() * fPa.ca + (double)((DZ)((Object)c2)).getFrontOffsetX();
        double d6 = random.nextGaussian() * fPa.ca + (double)((DZ)((Object)c2)).getFrontOffsetY();
        double d7 = random.nextGaussian() * fPa.ca + (double)((DZ)((Object)c2)).getFrontOffsetZ();
        Object t3 = t2;
        Object t4 = t2;
        t4.f((vL)new ZDa((Gg)t4, d2, d3, d4, d5, d6, d7));
        a2.J(vRa.d);
        return a2;
    }

    public void J(dc dc2) {
        dc b2 = dc2;
        jDa_1 a2 = this;
        b2.J().f(WRa.S, b2.J(), uSa.E);
    }
}

