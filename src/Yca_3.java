/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  aSa
 *  bb
 *  jFa
 *  uC
 *  vL
 *  vRa
 */
import net.minecraft.block.BlockDispenser;

public class Yca_3
implements bb {
    public void J(dc dc2) {
        dc b2 = dc2;
        Yca_3 a2 = this;
        b2.J().f(PRa.U, b2.J(), uSa.E);
    }

    /*
     * WARNING - void declaration
     */
    public final Mda J(dc dc2, Mda mda2) {
        void b2;
        Yca_3 a2;
        Yca_3 c2 = mda2;
        Yca_3 yca_3 = a2 = this;
        c2 = yca_3.f((dc)b2, (Mda)c2);
        yca_3.J((dc)b2);
        void v1 = b2;
        yca_3.J((dc)v1, BlockDispenser.J(v1.J()));
        return c2;
    }

    /*
     * WARNING - void declaration
     */
    public Mda f(dc dc2, Mda mda2) {
        void a2;
        Object c2 = dc2;
        Yca_3 b2 = this;
        Object object = c2;
        c2 = BlockDispenser.J(object.J());
        uC uC2 = BlockDispenser.J((dc)object);
        Mda mda3 = a2.J(vRa.d);
        Yca_3.J(object.J(), mda3, uua.p, (DZ)((Object)c2), uC2);
        return a2;
    }

    private int J(DZ dZ2) {
        DZ b2 = dZ2;
        Yca_3 a2 = this;
        return b2.getFrontOffsetX() + vRa.d + (b2.getFrontOffsetZ() + vRa.d) * yRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(Gg gg2, Mda mda2, int n2, DZ dZ2, uC uC2) {
        void c2;
        void b2;
        void a2;
        Gg e2 = mda2;
        Gg d2 = gg2;
        void v0 = a2;
        double d3 = v0.l();
        double d4 = v0.J();
        double d5 = v0.f();
        d4 = b2.getAxis() == RX.Y ? (d4 -= fqa.ca) : (d4 -= qsa.l);
        e2 = new jFa(d2, d3, d4, d5, (Mda)e2);
        Gg gg3 = d2;
        d3 = gg3.v.nextDouble() * tpa.k + iSa.P;
        Gg gg4 = e2;
        Gg gg5 = e2;
        e2.f((double)b2.getFrontOffsetX() * d3);
        gg5.J(Bua.Ia);
        gg4.l((double)b2.getFrontOffsetZ() * d3);
        gg4.f(gg5.i + d2.v.nextGaussian() * Nta.B * (double)c2);
        gg4.J(gg4.Ea + d2.v.nextGaussian() * Nta.B * (double)c2);
        gg4.l(gg4.f + d2.v.nextGaussian() * Nta.B * (double)c2);
        gg3.f((vL)e2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(dc dc2, DZ dZ2) {
        void a2;
        dc c2 = dc2;
        Yca_3 b2 = this;
        c2.J().f(aSa.k, c2.J(), b2.J((DZ)a2));
    }

    public Yca_3() {
        Yca_3 a2;
    }
}

