/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  Oz
 *  Yea
 *  lMa
 *  pqa
 *  rMa
 *  vRa
 *  wOa
 */
import net.minecraft.util.ResourceLocation;

public final class Tna_2
extends rMa {
    private final Yea A;
    private final Sx I;

    public void J() {
        Tna_2 tna_2 = this;
        if (!tna_2.A.J && tna_2.I.B() && tna_2.I.ja == tna_2.A) {
            float f2;
            float a2 = Oz.J((double)(tna_2.A.i * tna_2.A.i + tna_2.A.f * tna_2.A.f));
            if ((double)f2 >= SPa.x) {
                tna_2.C = JPa.N + Oz.J((float)a2, (float)JPa.N, (float)pqa.r) * wOa.w;
                return;
            }
            tna_2.C = JPa.N;
            return;
        }
        tna_2.I = (Sx)vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public Tna_2(Sx sx2, Yea yea2) {
        void b2;
        Tna_2 a2;
        Tna_2 c2 = yea2;
        Tna_2 tna_2 = a2 = this;
        Tna_2 tna_22 = a2;
        super(new ResourceLocation(BPa.a));
        tna_22.I = b2;
        tna_2.A = c2;
        tna_22.i = lMa.NONE;
        tna_2.M = vRa.d;
        tna_2.J = uSa.E;
    }
}

