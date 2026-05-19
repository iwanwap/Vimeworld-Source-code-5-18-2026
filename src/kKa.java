/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  MQa
 *  Qsa
 *  Yda
 *  kta
 *  pqa
 *  uKa
 */
import net.minecraft.client.model.ModelGhast;
import net.minecraft.util.ResourceLocation;

public final class kKa
extends ic<Yda> {
    private static final ResourceLocation A;
    private static final ResourceLocation I;

    public ResourceLocation J(Yda yda2) {
        kKa b2 = yda2;
        kKa a2 = this;
        if (b2.V()) {
            return A;
        }
        return I;
    }

    public void J(Yda yda2, float f2) {
        kKa c22 = yda2;
        kKa b2 = this;
        float c22 = pqa.r;
        float a2 = (Qsa.k + c22) / kta.v;
        float f3 = c22 = (Qsa.k + pqa.r / c22) / kta.v;
        uKa.l((float)f3, (float)a2, (float)f3);
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
    }

    public kKa(oLa oLa2) {
        Object b2 = oLa2;
        kKa a2 = this;
        super((oLa)b2, new ModelGhast(), MQa.L);
    }

    static {
        I = new ResourceLocation(Zqa.d);
        A = new ResourceLocation(Pua.V);
    }
}

