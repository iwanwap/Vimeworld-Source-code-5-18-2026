/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  MLa
 *  MQa
 *  cga
 *  pqa
 *  uKa
 *  vKa
 */
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;

public final class vKa_1
extends ic<cga> {
    private static final ResourceLocation I = new ResourceLocation(Vra.t);

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(cga cga2, double d2, double d3, double d4, float f2, float f3) {
        void a2;
        void b2;
        void c2;
        void d5;
        void e2;
        vKa_1 g2 = cga2;
        vKa_1 f4 = this;
        f4.I = (ResourceLocation)(rta.o * (float)g2.H());
        super.J(g2, (double)e2, (double)d5, (double)c2, (float)b2, (float)a2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(cga cga2, float f2) {
        void a2;
        vKa_1 c22 = cga2;
        vKa_1 b2 = this;
        vKa_1 vKa_12 = c22;
        float f3 = vKa_12.H();
        vKa_1 vKa_13 = c22;
        float c22 = (((cga)vKa_12).J + (((cga)vKa_13).C - ((cga)vKa_13).J) * a2) / (f3 * MQa.L + pqa.r);
        c22 = pqa.r / (c22 + pqa.r);
        uKa.l((float)(c22 * f3), (float)(pqa.r / c22 * f3), (float)(c22 * f3));
    }

    public ResourceLocation J(cga cga2) {
        vKa_1 b2 = cga2;
        vKa_1 a2 = this;
        return I;
    }

    /*
     * WARNING - void declaration
     */
    public vKa_1(oLa oLa2, ModelBase modelBase, float f2) {
        void b2;
        void c2;
        float d2 = f2;
        vKa_1 a2 = this;
        super((oLa)c2, (ModelBase)b2, d2);
        vKa_1 vKa_12 = a2;
        vKa_1 vKa_13 = a2;
        vKa_13.f(new MLa((vKa)vKa_13));
    }
}

