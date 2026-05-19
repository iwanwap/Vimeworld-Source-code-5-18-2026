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

public final class mU_3
implements Qd {
    public /* synthetic */ mU_3(iU iU2) {
        mU_3 b2 = iU2;
        mU_3 a2 = this;
        a2();
    }

    /*
     * WARNING - void declaration
     */
    public KV J(DZ dZ2, fv fv2, Random random) {
        void a2;
        void c2;
        mU_3 d2 = fv2;
        mU_3 b2 = this;
        mU_3 mU_32 = d2;
        ((fv)mU_32).field_175963_d = vRa.d;
        ((fv)mU_32).field_175965_b[DZ.NORTH.getIndex()].field_175963_d = vRa.d;
        ((fv)mU_32).field_175965_b[DZ.UP.getIndex()].field_175963_d = vRa.d;
        ((fv)mU_32).field_175965_b[DZ.NORTH.getIndex()].field_175965_b[DZ.UP.getIndex()].field_175963_d = vRa.d;
        return new Qv((DZ)c2, (fv)d2, (Random)a2);
    }

    private mU_3() {
        mU_3 a2;
    }

    public boolean J(fv fv2) {
        mU_3 b2 = fv2;
        mU_3 a2 = this;
        if (((fv)b2).field_175966_c[DZ.NORTH.getIndex()] && !((fv)b2).field_175965_b[DZ.NORTH.getIndex()].field_175963_d && ((fv)b2).field_175966_c[DZ.UP.getIndex()] && !((fv)b2).field_175965_b[DZ.UP.getIndex()].field_175963_d) {
            b2 = ((fv)b2).field_175965_b[DZ.NORTH.getIndex()];
            if (((fv)b2).field_175966_c[DZ.UP.getIndex()] && !((fv)b2).field_175965_b[DZ.UP.getIndex()].field_175963_d) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }
}

