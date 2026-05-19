/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ela
 *  JPa
 *  MQa
 *  nFa
 *  pqa
 *  uKa
 *  vRa
 *  yja
 */
import net.minecraft.client.model.ModelWitch;
import net.minecraft.util.ResourceLocation;

public final class Ela_1
extends ic<nFa> {
    private static final ResourceLocation I = new ResourceLocation(pta.q);

    public Ela_1(oLa oLa2) {
        Object b2 = oLa2;
        Ela_1 a2 = this;
        super((oLa)b2, new ModelWitch(JPa.N), MQa.L);
        Ela_1 ela_1 = a2;
        ela_1.f(new yja((Ela)ela_1));
    }

    public void J(nFa nFa2, float f2) {
        float c2 = f2;
        Ela_1 a2 = this;
        float f3 = pqa.Ha;
        uKa.l((float)f3, (float)f3, (float)f3);
    }

    public ResourceLocation J(nFa nFa2) {
        Ela_1 b2 = nFa2;
        Ela_1 a2 = this;
        return I;
    }

    public void l() {
        uKa.J((float)JPa.N, (float)sqa.Z, (float)JPa.N);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(nFa nFa2, double d2, double d3, double d4, float f2, float f3) {
        void a2;
        void b2;
        void c2;
        void d5;
        void e2;
        Ela_1 g2 = nFa2;
        Ela_1 f4 = this;
        ((ModelWitch)f4.C).field_82900_g = g2.J() != null ? vRa.d : uSa.E;
        super.J(g2, (double)e2, (double)d5, (double)c2, (float)b2, (float)a2);
    }
}

