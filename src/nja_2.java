/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  MQa
 *  NQa
 *  Oz
 *  Tla
 *  WQa
 *  Wsa
 *  nja
 *  pqa
 *  psa
 *  uKa
 *  zfa
 */
import net.minecraft.client.model.ModelCreeper;
import net.minecraft.util.ResourceLocation;

public final class nja_2
extends ic<zfa> {
    private static final ResourceLocation I = new ResourceLocation(WQa.U);

    public void J(zfa zfa2, float f2) {
        float f3;
        float a2;
        nja_2 c22 = zfa2;
        nja_2 b2 = this;
        float c22 = c22.l(a2);
        a2 = pqa.r + Oz.d((float)(c22 * QTa.G)) * c22 * Jpa.B;
        c22 = Oz.J((float)c22, (float)JPa.N, (float)pqa.r);
        c22 *= c22;
        c22 *= c22;
        float f4 = f3 = (pqa.r + c22 * Xpa.R) * a2;
        uKa.l((float)f4, (float)((pqa.r + c22 * Nra.e) / a2), (float)f4);
    }

    /*
     * WARNING - void declaration
     */
    public int J(zfa zfa2, float f2, float f3) {
        void a2;
        nja_2 d22 = zfa2;
        nja_2 c2 = this;
        float d22 = d22.l((float)a2);
        if ((int)(d22 * FRa.Ga) % uqa.g == 0) {
            return uSa.E;
        }
        return Oz.f((int)((int)(d22 * psa.N * NQa.Y)), (int)uSa.E, (int)osa.Ja) << osa.c | Wsa.K;
    }

    public ResourceLocation J(zfa zfa2) {
        nja_2 b2 = zfa2;
        nja_2 a2 = this;
        return I;
    }

    public nja_2(oLa oLa2) {
        Object b2 = oLa2;
        nja_2 a2 = this;
        super((oLa)b2, new ModelCreeper(), MQa.L);
        nja_2 nja_22 = a2;
        nja_22.f(new Tla((nja)nja_22));
    }
}

