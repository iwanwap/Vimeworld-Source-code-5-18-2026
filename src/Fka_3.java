/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 *  Ika
 *  RQa
 *  id
 *  nka
 *  pDa
 *  pqa
 *  uKa
 *  vL
 *  vRa
 */
import net.minecraft.util.ResourceLocation;
import optifine.Config;

public final class Fka_3
implements id {
    private final Ika J;
    private static final String A = "CL_00002419";
    private static final ResourceLocation I = new ResourceLocation(RQa.Ma);

    public boolean J() {
        return uSa.E != 0;
    }

    public Fka_3(Ika ika2) {
        Fka_3 b2 = ika2;
        Fka_3 a2 = this;
        a2.J = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gl gl2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        void i2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f9;
        void g2;
        void h2;
        float f10 = f8;
        Fka_3 a2 = this;
        a2.J((pDa)h2, (float)g2, (float)f9, (float)e2, (float)d2, (float)c2, (float)b2, (float)i2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(pDa pDa2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        void e2;
        void a2;
        void b2;
        void c2;
        void d2;
        void f9;
        void g2;
        void h2;
        Fka_3 fka_3 = this;
        fka_3.J.J(I);
        uKa.B();
        uKa.c();
        uKa.f((int)vRa.d, (int)vRa.d);
        uKa.L();
        uKa.I((int)Jqa.e);
        int i2 = LRa.V;
        int n2 = i2 % opa.w;
        nka.J((int)nka.P, (float)((float)n2 / pqa.r), (float)((float)(i2 /= opa.w) / pqa.r));
        uKa.P();
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        if (Config.h()) {
            pA.b();
        }
        Fka_3 fka_32 = fka_3;
        fka_32.J.J().J((vL)h2, (float)g2, (float)f9, (float)d2, (float)c2, (float)b2, (float)a2);
        fka_32.J.f((Gl)h2, (float)e2);
        uKa.k();
        uKa.K();
        uKa.I((int)Ira.A);
    }
}

