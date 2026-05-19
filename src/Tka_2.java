/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CKa
 *  JPa
 *  MQa
 *  Sqa
 *  Tka
 *  dpa
 *  kta
 *  pqa
 *  sd
 *  uKa
 *  vRa
 */
import net.minecraft.client.model.ModelWither;
import net.minecraft.util.ResourceLocation;

public final class Tka_2
extends ic<IDa> {
    private static final ResourceLocation A = new ResourceLocation(dpa.v);
    private static final ResourceLocation I = new ResourceLocation(fPa.Ea);

    public ResourceLocation J(IDa iDa) {
        IDa b22 = iDa;
        Tka_2 a2 = this;
        int b22 = b22.I();
        if (b22 > 0 && (b22 > Fua.J || b22 / tTa.h % uqa.g != vRa.d)) {
            return A;
        }
        return I;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(IDa iDa, double d2, double d3, double d4, float f2, float f3) {
        void g2;
        void b2;
        void c2;
        void d5;
        void e2;
        void f4;
        float f5 = f3;
        Tka_2 a2 = this;
        void v0 = f4;
        KFa.J((sd)v0, vRa.d != 0);
        super.J(v0, (double)e2, (double)d5, (double)c2, (float)b2, (float)g2);
    }

    public Tka_2(oLa oLa2) {
        Object b2 = oLa2;
        Tka_2 a2 = this;
        super((oLa)b2, new ModelWither(JPa.N), pqa.r);
        Tka_2 tka_2 = a2;
        tka_2.f(new CKa((Tka)tka_2));
    }

    /*
     * WARNING - void declaration
     */
    public void J(IDa iDa, float f2) {
        void b22;
        Tka_2 tka_2 = this;
        float c2 = kta.v;
        int b22 = b22.I();
        if (b22 > 0) {
            void a2;
            c2 -= ((float)b22 - a2) / Sqa.q * MQa.L;
        }
        float f3 = c2;
        uKa.l((float)f3, (float)f3, (float)f3);
    }
}

