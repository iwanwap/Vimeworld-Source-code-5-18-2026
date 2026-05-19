/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FPa
 *  JPa
 *  Lqa
 *  MQa
 *  Oz
 *  Yea
 *  pqa
 *  rMa
 *  vRa
 */
import net.minecraft.util.ResourceLocation;

public final class hNa_1
extends rMa {
    private float J;
    private final Yea I;

    public void J() {
        float f2;
        hNa_1 hNa_12 = this;
        if (hNa_12.I.J) {
            hNa_12.I = (Yea)vRa.d;
            return;
        }
        hNa_1 hNa_13 = hNa_12;
        hNa_13.I = (Yea)((float)hNa_13.I.la);
        hNa_13.k = (float)hNa_13.I.Z;
        hNa_13.j = (float)hNa_13.I.A;
        float a2 = Oz.J((double)(hNa_13.I.i * hNa_12.I.i + hNa_12.I.f * hNa_12.I.f));
        if ((double)f2 >= SPa.x) {
            hNa_12.J = Oz.J((float)(hNa_12.J + FPa.p), (float)JPa.N, (float)pqa.r);
            hNa_12.C = JPa.N + Oz.J((float)a2, (float)JPa.N, (float)MQa.L) * ZSa.q;
            return;
        }
        hNa_1 hNa_14 = hNa_12;
        hNa_14.J = JPa.N;
        hNa_14.C = JPa.N;
    }

    public hNa_1(Yea yea2) {
        hNa_1 a2;
        hNa_1 b2 = yea2;
        hNa_1 hNa_12 = a2 = this;
        hNa_1 hNa_13 = a2;
        super(new ResourceLocation(Lqa.p));
        hNa_13.J = JPa.N;
        hNa_12.I = b2;
        hNa_13.M = vRa.d;
        hNa_12.J = uSa.E;
    }
}

