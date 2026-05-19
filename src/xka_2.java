/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 *  JPa
 *  Oz
 *  bpa
 *  cRa
 *  kPa
 *  mEa
 *  uKa
 */
import net.minecraft.client.model.ModelBat;
import net.minecraft.util.ResourceLocation;

public final class xka_2
extends ic<mEa> {
    private static final ResourceLocation I = new ResourceLocation(cRa.q);

    /*
     * WARNING - void declaration
     */
    public void J(mEa mEa2, float f2, float f3, float f4) {
        void a2;
        void b2;
        xka_2 xka_22;
        void d2;
        float e2 = f2;
        xka_2 c2 = this;
        if (!d2.V()) {
            uKa.J((float)JPa.N, (float)(Oz.C((float)(e2 * bpa.K)) * Nra.e), (float)JPa.N);
            xka_22 = c2;
        } else {
            uKa.J((float)JPa.N, (float)Qra.j, (float)JPa.N);
            xka_22 = c2;
        }
        super.J((Gl)d2, e2, (float)b2, (float)a2);
    }

    public void J(mEa mEa2, float f2) {
        float c2 = f2;
        xka_2 a2 = this;
        uKa.l((float)kPa.W, (float)kPa.W, (float)kPa.W);
    }

    public ResourceLocation J(mEa mEa2) {
        xka_2 b2 = mEa2;
        xka_2 a2 = this;
        return I;
    }

    public xka_2(oLa oLa2) {
        Object b2 = oLa2;
        xka_2 a2 = this;
        super((oLa)b2, new ModelBat(), rta.o);
    }
}

