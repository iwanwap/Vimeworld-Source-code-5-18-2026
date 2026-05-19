/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GC
 *  JPa
 *  Nia
 *  Pqa
 *  pqa
 *  uKa
 *  vL
 */
import net.minecraft.client.model.ModelLeashKnot;
import net.minecraft.util.ResourceLocation;

public final class fJa_3
extends GC<Nia> {
    private ModelLeashKnot A;
    private static final ResourceLocation I = new ResourceLocation(Pqa.b);

    public ResourceLocation J(Nia nia2) {
        fJa_3 b2 = nia2;
        fJa_3 a2 = this;
        return I;
    }

    public fJa_3(oLa oLa2) {
        Object b2 = oLa2;
        fJa_3 a2 = this;
        super((oLa)b2);
        fJa_3 fJa_32 = a2;
        fJa_32.A = new ModelLeashKnot();
    }

    /*
     * WARNING - void declaration
     */
    public void J(Nia nia2, double d2, double d3, double d4, float f2, float f3) {
        void a2;
        void b2;
        void c2;
        void d5;
        void e2;
        fJa_3 g2 = nia2;
        fJa_3 f4 = this;
        uKa.e();
        uKa.m();
        uKa.J((float)((float)e2), (float)((float)d5), (float)((float)c2));
        float f5 = rRa.T;
        uKa.o();
        uKa.l((float)vqa.T, (float)vqa.T, (float)pqa.r);
        uKa.K();
        f4.f((vL)g2);
        f4.A.J((vL)g2, JPa.N, JPa.N, JPa.N, JPa.N, JPa.N, f5);
        uKa.D();
        super.l((vL)g2, (double)e2, (double)d5, (double)c2, (float)b2, (float)a2);
    }
}

