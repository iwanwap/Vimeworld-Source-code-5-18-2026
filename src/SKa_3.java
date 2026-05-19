/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GC
 *  JPa
 *  afa
 *  dpa
 *  pqa
 *  uKa
 *  vL
 */
import net.minecraft.client.model.ModelSkeletonHead;
import net.minecraft.util.ResourceLocation;

public final class SKa_3
extends GC<afa> {
    private static final ResourceLocation J = new ResourceLocation(dpa.v);
    private final ModelSkeletonHead A;
    private static final ResourceLocation I = new ResourceLocation(fPa.Ea);

    /*
     * WARNING - void declaration
     */
    private float J(float f2, float f3, float f4) {
        void a2;
        void c2;
        float d2 = f3;
        SKa_3 b2 = this;
        float f5 = d2 = d2 - c2;
        while (f5 < xua.V) {
            f5 = d2 + CRa.ja;
        }
        float f6 = d2;
        while (f6 >= Hra.Ga) {
            f6 = d2 - CRa.ja;
        }
        return (float)(c2 + a2 * d2);
    }

    public SKa_3(oLa oLa2) {
        Object b2 = oLa2;
        SKa_3 a2 = this;
        super((oLa)b2);
        SKa_3 sKa_3 = a2;
        sKa_3.A = new ModelSkeletonHead();
    }

    public ResourceLocation J(afa afa2) {
        SKa_3 b2 = afa2;
        SKa_3 a2 = this;
        if (b2.l()) {
            return J;
        }
        return I;
    }

    /*
     * WARNING - void declaration
     */
    public void J(afa afa2, double d2, double d3, double d4, float f2, float f3) {
        void b2;
        void c2;
        void d5;
        void e2;
        void a2;
        SKa_3 g2 = afa2;
        SKa_3 f4 = this;
        uKa.e();
        uKa.m();
        SKa_3 sKa_3 = f4;
        SKa_3 sKa_32 = g2;
        float f5 = sKa_3.J(((afa)sKa_32).s, ((afa)sKa_32).X, (float)a2);
        SKa_3 sKa_33 = g2;
        float f6 = ((afa)sKa_33).o + (((afa)sKa_33).d - ((afa)g2).o) * a2;
        uKa.J((float)((float)e2), (float)((float)d5), (float)((float)c2));
        float f7 = rRa.T;
        uKa.o();
        uKa.l((float)vqa.T, (float)vqa.T, (float)pqa.r);
        uKa.K();
        sKa_3.f((vL)g2);
        f4.A.J((vL)g2, JPa.N, JPa.N, JPa.N, f5, f6, f7);
        uKa.D();
        super.l((vL)g2, (double)e2, (double)d5, (double)c2, (float)b2, (float)a2);
    }
}

