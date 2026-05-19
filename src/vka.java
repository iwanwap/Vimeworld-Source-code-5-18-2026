/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GC
 *  JPa
 *  MQa
 *  Oz
 *  Wda
 *  pqa
 *  uKa
 *  vL
 *  wOa
 */
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBoat;
import net.minecraft.util.ResourceLocation;

public final class vka
extends GC<Wda> {
    private static final ResourceLocation A = new ResourceLocation(ppa.Aa);
    public ModelBase I;

    /*
     * WARNING - void declaration
     */
    public void J(Wda wda2, double d2, double d3, double d4, float f2, float f3) {
        float f4;
        void a2;
        void f5;
        void b2;
        void c2;
        void d5;
        void e2;
        vka vka2 = this;
        uKa.e();
        uKa.J((float)((float)e2), (float)((float)d5 + rta.o), (float)((float)c2));
        uKa.J((float)(Hra.Ga - b2), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        void v0 = f5;
        float g2 = (float)v0.f() - a2;
        float f6 = v0.J() - a2;
        if (f4 < JPa.N) {
            f6 = JPa.N;
        }
        if (g2 > JPa.N) {
            uKa.J((float)(Oz.d((float)g2) * g2 * f6 / FRa.Ga * (float)f5.J()), (float)pqa.r, (float)JPa.N, (float)JPa.N);
        }
        g2 = wOa.w;
        uKa.l((float)g2, (float)g2, (float)g2);
        uKa.l((float)(pqa.r / g2), (float)(pqa.r / g2), (float)(pqa.r / g2));
        vka2.f((vL)f5);
        uKa.l((float)vqa.T, (float)vqa.T, (float)pqa.r);
        vka2.I.J((vL)f5, JPa.N, JPa.N, Qra.j, JPa.N, JPa.N, rRa.T);
        uKa.D();
        super.l((vL)f5, (double)e2, (double)d5, (double)c2, (float)b2, (float)a2);
    }

    public ResourceLocation J(Wda wda2) {
        vka b2 = wda2;
        vka a2 = this;
        return A;
    }

    public vka(oLa oLa2) {
        Object b2 = oLa2;
        vka a2 = this;
        super((oLa)b2);
        vka vka2 = a2;
        a2.I = new ModelBoat();
        vka2.I = (ModelBase)MQa.L;
    }
}

