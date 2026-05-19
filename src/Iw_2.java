/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KV
 *  Qd
 *  fv
 *  iU
 *  vRa
 */
import java.util.Random;

public final class Iw_2
implements Qd {
    /*
     * WARNING - void declaration
     */
    public KV J(DZ dZ2, fv fv2, Random random) {
        void a2;
        void c2;
        Iw_2 d2 = fv2;
        Iw_2 b2 = this;
        Iw_2 iw_2 = d2;
        ((fv)iw_2).field_175963_d = vRa.d;
        ((fv)iw_2).field_175965_b[DZ.EAST.getIndex()].field_175963_d = vRa.d;
        ((fv)iw_2).field_175965_b[DZ.UP.getIndex()].field_175963_d = vRa.d;
        ((fv)iw_2).field_175965_b[DZ.EAST.getIndex()].field_175965_b[DZ.UP.getIndex()].field_175963_d = vRa.d;
        return new HU((DZ)c2, (fv)d2, (Random)a2);
    }

    public /* synthetic */ Iw_2(iU iU2) {
        Iw_2 b2 = iU2;
        Iw_2 a2 = this;
        a2();
    }

    private Iw_2() {
        Iw_2 a2;
    }

    public boolean J(fv fv2) {
        Iw_2 b2 = fv2;
        Iw_2 a2 = this;
        if (((fv)b2).field_175966_c[DZ.EAST.getIndex()] && !((fv)b2).field_175965_b[DZ.EAST.getIndex()].field_175963_d && ((fv)b2).field_175966_c[DZ.UP.getIndex()] && !((fv)b2).field_175965_b[DZ.UP.getIndex()].field_175963_d) {
            b2 = ((fv)b2).field_175965_b[DZ.EAST.getIndex()];
            if (((fv)b2).field_175966_c[DZ.UP.getIndex()] && !((fv)b2).field_175965_b[DZ.UP.getIndex()].field_175963_d) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }
}

