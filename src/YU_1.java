/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KV
 *  Qd
 *  fv
 *  iU
 *  vRa
 *  yV
 */
import java.util.Random;

public final class YU_1
implements Qd {
    private YU_1() {
        YU_1 a2;
    }

    public boolean J(fv fv2) {
        YU_1 b2 = fv2;
        YU_1 a2 = this;
        if (!(((fv)b2).field_175966_c[DZ.WEST.getIndex()] || ((fv)b2).field_175966_c[DZ.EAST.getIndex()] || ((fv)b2).field_175966_c[DZ.NORTH.getIndex()] || ((fv)b2).field_175966_c[DZ.SOUTH.getIndex()] || ((fv)b2).field_175966_c[DZ.UP.getIndex()])) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public KV J(DZ dZ2, fv fv2, Random random) {
        void a2;
        void c2;
        YU_1 d2 = fv2;
        YU_1 b2 = this;
        ((fv)d2).field_175963_d = vRa.d;
        return new yV((DZ)c2, (fv)d2, (Random)a2);
    }

    public /* synthetic */ YU_1(iU iU2) {
        YU_1 b2 = iU2;
        YU_1 a2 = this;
        a2();
    }
}

