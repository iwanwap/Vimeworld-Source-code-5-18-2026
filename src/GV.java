/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KV
 *  Qd
 *  fv
 *  iU
 *  vRa
 *  yw
 */
import java.util.Random;

public final class GV
implements Qd {
    public /* synthetic */ GV(iU iU2) {
        GV b2 = iU2;
        GV a2 = this;
        a2();
    }

    private GV() {
        GV a2;
    }

    /*
     * WARNING - void declaration
     */
    public KV J(DZ dZ2, fv fv2, Random random) {
        void a2;
        void c2;
        GV d2 = fv2;
        GV b2 = this;
        GV gV = d2;
        ((fv)gV).field_175963_d = vRa.d;
        ((fv)gV).field_175965_b[DZ.EAST.getIndex()].field_175963_d = vRa.d;
        return new yw((DZ)c2, (fv)d2, (Random)a2);
    }

    public boolean J(fv fv2) {
        GV b2 = fv2;
        GV a2 = this;
        if (((fv)b2).field_175966_c[DZ.EAST.getIndex()] && !((fv)b2).field_175965_b[DZ.EAST.getIndex()].field_175963_d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

