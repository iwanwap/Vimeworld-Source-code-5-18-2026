/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EW
 *  KV
 *  Qd
 *  fv
 *  iU
 *  vRa
 */
import java.util.Random;

public final class yv_2
implements Qd {
    public /* synthetic */ yv_2(iU iU2) {
        yv_2 b2 = iU2;
        yv_2 a2 = this;
        a2();
    }

    private yv_2() {
        yv_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    public KV J(DZ dZ2, fv fv2, Random random) {
        void a2;
        void c2;
        void b2;
        yv_2 yv_22 = this;
        yv_2 d2 = b2;
        if (!((fv)d2).field_175966_c[DZ.NORTH.getIndex()] || b2.field_175965_b[DZ.NORTH.getIndex()].field_175963_d) {
            d2 = b2.field_175965_b[DZ.SOUTH.getIndex()];
        }
        yv_2 yv_23 = d2;
        ((fv)yv_23).field_175963_d = vRa.d;
        ((fv)yv_23).field_175965_b[DZ.NORTH.getIndex()].field_175963_d = vRa.d;
        return new EW((DZ)c2, (fv)d2, (Random)a2);
    }

    public boolean J(fv fv2) {
        yv_2 b2 = fv2;
        yv_2 a2 = this;
        if (((fv)b2).field_175966_c[DZ.NORTH.getIndex()] && !((fv)b2).field_175965_b[DZ.NORTH.getIndex()].field_175963_d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

