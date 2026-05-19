/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 *  WSa
 *  bKa
 *  id
 *  nka
 *  pqa
 *  uKa
 *  vL
 *  vRa
 *  vea
 */
import net.minecraft.util.ResourceLocation;
import optifine.Config;

public final class pLa
implements id {
    private final bKa J;
    private static final ResourceLocation A = new ResourceLocation(WSa.H);
    private static final String I = "CL_00002418";

    public boolean J() {
        return uSa.E != 0;
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
        void g;
        void h;
        float f10 = f8;
        pLa a2 = this;
        a2.J((vea)h, (float)g, (float)f9, (float)e2, (float)d2, (float)c2, (float)b2, (float)i2);
    }

    public pLa(bKa bKa2) {
        pLa b2 = bKa2;
        pLa a2 = this;
        a2.J = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(vea vea2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        void e2;
        void a2;
        void b2;
        void c2;
        void d2;
        void f9;
        void g;
        void h;
        pLa pLa2 = this;
        pLa2.J.J(A);
        uKa.B();
        uKa.c();
        uKa.f((int)vRa.d, (int)vRa.d);
        uKa.L();
        uKa.J((!h.C() ? vRa.d : uSa.E) != 0);
        int i2 = LRa.V;
        int n2 = i2 % opa.w;
        nka.J((int)nka.P, (float)((float)n2 / pqa.r), (float)((float)(i2 /= opa.w) / pqa.r));
        uKa.P();
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        if (Config.h()) {
            pA.b();
        }
        pLa pLa3 = pLa2;
        pLa3.J.J().J((vL)h, (float)g, (float)f9, (float)d2, (float)c2, (float)b2, (float)a2);
        pLa3.J.f((Gl)h, (float)e2);
        uKa.J(vRa.d != 0);
        uKa.k();
        uKa.K();
    }
}

