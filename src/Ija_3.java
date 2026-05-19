/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  HFa
 *  JPa
 *  MQa
 *  pqa
 *  uKa
 *  yra
 */
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;

public final class Ija_3
extends ic<HFa> {
    private static final ResourceLocation I = new ResourceLocation(yra.l);

    public ResourceLocation J(HFa hFa2) {
        Ija_3 b2 = hFa2;
        Ija_3 a2 = this;
        return I;
    }

    /*
     * WARNING - void declaration
     */
    public Ija_3(oLa oLa2, ModelBase modelBase, float f2) {
        void b2;
        void c2;
        float d2 = f2;
        Ija_3 a2 = this;
        super((oLa)c2, (ModelBase)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    public float J(HFa hFa2, float f2) {
        void a2;
        Ija_3 c2 = hFa2;
        Ija_3 b2 = this;
        Ija_3 ija_3 = c2;
        return ((HFa)ija_3).x + (((HFa)ija_3).b - ((HFa)c2).x) * a2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(HFa hFa2, float f2, float f3, float f4) {
        void b2;
        void a2;
        Ija_3 e22 = hFa2;
        Ija_3 d2 = this;
        Ija_3 ija_3 = e22;
        Ija_3 ija_32 = e22;
        float c2 = ((HFa)ija_3).a + (((HFa)ija_3).j - ((HFa)ija_32).a) * a2;
        Ija_3 ija_33 = e22;
        float e22 = ((HFa)ija_32).c + (((HFa)ija_33).H - ((HFa)ija_33).c) * a2;
        uKa.J((float)JPa.N, (float)MQa.L, (float)JPa.N);
        uKa.J((float)(Hra.Ga - b2), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)c2, (float)pqa.r, (float)JPa.N, (float)JPa.N);
        uKa.J((float)e22, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)JPa.N, (float)qQa.f, (float)JPa.N);
    }
}

