/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Dga
 *  Gl
 *  XTa
 *  id
 *  nka
 *  pqa
 *  uKa
 *  vL
 *  vRa
 *  zka
 */
import net.minecraft.util.ResourceLocation;
import optifine.Config;

public final class RJa_1
implements id {
    private static final ResourceLocation J = new ResourceLocation(XTa.J);
    private final zka A;
    private static final String I = "CL_00002410";

    /*
     * WARNING - void declaration
     */
    public void J(Dga dga2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        void e2;
        void a2;
        void b2;
        void c2;
        void d2;
        void f9;
        void g22;
        void h2;
        RJa_1 rJa_1 = this;
        rJa_1.A.J(J);
        uKa.B();
        uKa.c();
        uKa.f((int)vRa.d, (int)vRa.d);
        if (h2.C()) {
            uKa.J(uSa.E != 0);
        } else {
            uKa.J(vRa.d != 0);
        }
        int i2 = LRa.V;
        int n2 = i2 % opa.w;
        nka.J((int)nka.P, (float)((float)n2 / pqa.r), (float)((float)(i2 /= opa.w) / pqa.r));
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        if (Config.h()) {
            pA.b();
        }
        void v0 = h2;
        rJa_1.A.J().J((vL)v0, (float)g22, (float)f9, (float)d2, (float)c2, (float)b2, (float)a2);
        int g22 = v0.J((float)e2);
        n2 = g22 % opa.w;
        i2 = g22 / opa.w;
        nka.J((int)nka.P, (float)((float)n2 / pqa.r), (float)((float)i2 / pqa.r));
        rJa_1.A.f((Gl)h2, (float)e2);
        uKa.k();
        uKa.K();
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
        RJa_1 a2 = this;
        a2.J((Dga)h2, (float)g2, (float)f9, (float)e2, (float)d2, (float)c2, (float)b2, (float)i2);
    }

    public RJa_1(zka zka2) {
        RJa_1 b2 = zka2;
        RJa_1 a2 = this;
        a2.A = b2;
    }

    public boolean J() {
        return uSa.E != 0;
    }
}

