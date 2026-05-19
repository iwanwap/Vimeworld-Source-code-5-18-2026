/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Ix
 *  QFa
 *  Xv
 *  lW
 *  vRa
 *  ww
 */
import java.util.List;
import java.util.Random;

public final class Fv_2
extends Ix {
    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv2) {
        void b2;
        void c2;
        Fv_2 a2 = this;
        Fv_2 d2 = xv2;
        if (a2.J((Gg)c2, (Xv)d2)) {
            return uSa.E != 0;
        }
        Fv_2 fv_2 = a2;
        fv_2.J((Gg)c2, (Xv)d2, uSa.E, uSa.E, uSa.E, AQa.P, AQa.P, AQa.P, vRa.d != 0, (Random)b2, (ww)LV.J());
        fv_2.J((Gg)c2, (Random)b2, (Xv)d2, a2.field_143013_d, vRa.d, vRa.d, uSa.E);
        if (a2.coordBaseMode != DZ.NORTH && a2.coordBaseMode != DZ.EAST) {
            a2.J((Gg)c2, (Xv)d2, uSa.E, vRa.d, vRa.d, uSa.E, yRa.d, yRa.d, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        } else {
            a2.J((Gg)c2, (Xv)d2, AQa.P, vRa.d, vRa.d, AQa.P, yRa.d, yRa.d, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(uU uU2, List<uU> list, Random random) {
        void b2;
        void c2;
        Object d2 = random;
        Fv_2 a2 = this;
        if (a2.coordBaseMode != DZ.NORTH && a2.coordBaseMode != DZ.EAST) {
            a2.l((lW)c2, (List)b2, (Random)d2, vRa.d, vRa.d);
            return;
        }
        a2.J((lW)c2, (List)b2, (Random)d2, vRa.d, vRa.d);
    }

    public Fv_2() {
        Fv_2 a2;
    }
}

