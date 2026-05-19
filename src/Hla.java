/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GC
 *  JPa
 *  MQa
 *  Oz
 *  kta
 *  psa
 *  sFa
 *  uKa
 *  vL
 *  vQa
 *  vRa
 *  ysa
 */
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelEnderCrystal;
import net.minecraft.util.ResourceLocation;

public final class Hla
extends GC<sFa> {
    private static final ResourceLocation A = new ResourceLocation(ysa.b);
    private ModelBase I;

    public ResourceLocation J(sFa sFa2) {
        Hla b2 = sFa2;
        Hla a2 = this;
        return A;
    }

    public Hla(oLa oLa2) {
        Object b2 = oLa2;
        Hla a2 = this;
        super((oLa)b2);
        Hla hla = a2;
        a2.I = new ModelEnderCrystal(JPa.N, vRa.d != 0);
        hla.I = (ModelBase)MQa.L;
    }

    /*
     * WARNING - void declaration
     */
    public void J(sFa sFa2, double d2, double d3, double d4, float f2, float f3) {
        void b2;
        void c2;
        void d5;
        void e2;
        void a2;
        void f4;
        Hla hla = this;
        float f5 = (float)f4.J + a2;
        uKa.e();
        uKa.J((float)((float)e2), (float)((float)d5), (float)((float)c2));
        Hla hla2 = hla;
        hla.J(A);
        float g = Oz.d((float)(f5 * psa.N)) / kta.v + MQa.L;
        g = g * g + g;
        hla2.I.J((vL)f4, JPa.N, f5 * vQa.q, g * psa.N, JPa.N, JPa.N, rRa.T);
        uKa.D();
        super.l((vL)f4, (double)e2, (double)d5, (double)c2, (float)b2, (float)a2);
    }
}

