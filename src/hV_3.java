/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KV
 *  Qd
 *  Xw
 *  fv
 *  iU
 *  vRa
 */
import java.util.Random;

public final class hV_3
implements Qd {
    private hV_3() {
        hV_3 a2;
    }

    public /* synthetic */ hV_3(iU iU2) {
        hV_3 b2 = iU2;
        hV_3 a2 = this;
        a2();
    }

    /*
     * WARNING - void declaration
     */
    public KV J(DZ dZ2, fv fv2, Random random) {
        void a2;
        void c2;
        hV_3 d2 = fv2;
        hV_3 b2 = this;
        hV_3 hV_32 = d2;
        ((fv)hV_32).field_175963_d = vRa.d;
        ((fv)hV_32).field_175965_b[DZ.UP.getIndex()].field_175963_d = vRa.d;
        return new Xw((DZ)c2, (fv)d2, (Random)a2);
    }

    public boolean J(fv fv2) {
        hV_3 b2 = fv2;
        hV_3 a2 = this;
        if (((fv)b2).field_175966_c[DZ.UP.getIndex()] && !((fv)b2).field_175965_b[DZ.UP.getIndex()].field_175963_d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

