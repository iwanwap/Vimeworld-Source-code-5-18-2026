/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GDa
 *  JPa
 *  MQa
 *  lMa
 *  pqa
 *  rMa
 *  vRa
 */
import net.minecraft.util.ResourceLocation;

public final class gqa_3
extends rMa {
    private final GDa I;

    public void J() {
        gqa_3 gqa_32 = this;
        if (!gqa_32.I.J && gqa_32.I.v()) {
            gqa_3 gqa_33 = gqa_32;
            gqa_33.I = (GDa)((float)gqa_33.I.la);
            gqa_33.k = (float)gqa_33.I.Z;
            gqa_33.j = (float)gqa_33.I.A;
            float a2 = gqa_33.I.d(JPa.N);
            gqa_33.C = JPa.N + pqa.r * a2 * a2;
            gqa_33.A = ZSa.q + MQa.L * a2;
            return;
        }
        gqa_32.I = (GDa)vRa.d;
    }

    public gqa_3(GDa gDa2) {
        gqa_3 a2;
        gqa_3 b2 = gDa2;
        gqa_3 gqa_32 = a2 = this;
        gqa_3 gqa_33 = a2;
        super(new ResourceLocation(SPa.m));
        gqa_32.I = b2;
        a2.i = lMa.NONE;
        gqa_32.M = vRa.d;
        gqa_32.J = uSa.E;
    }
}

