/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 *  XE
 *  ZFa
 *  id
 *  iea
 *  nJa
 *  uKa
 *  vL
 *  vRa
 *  xfa
 */
import net.minecraft.util.ResourceLocation;
import optifine.Config;

public final class GLa_3
implements id {
    private static final ResourceLocation J = new ResourceLocation(eta.i);
    private static final String A = "CL_00002405";
    private final nJa I;

    public boolean J() {
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(xfa xfa2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        void h2;
        GLa_3 gLa_3 = this;
        if (h2.ba() && !h2.C()) {
            void a2;
            void b2;
            void c2;
            void d2;
            void f9;
            void g2;
            gLa_3.I.J(J);
            iea e2 = iea.byMetadata((int)h2.J().getMetadata());
            Object i2 = ZFa.J((iea)e2);
            if (Config.Fa()) {
                i2 = XE.f((iea)e2, (float[])i2);
            }
            uKa.f((float)i2[uSa.E], (float)i2[vRa.d], (float)i2[uqa.g]);
            gLa_3.I.J().J((vL)h2, (float)g2, (float)f9, (float)d2, (float)c2, (float)b2, (float)a2);
        }
    }

    public GLa_3(nJa nJa2) {
        GLa_3 b2 = nJa2;
        GLa_3 a2 = this;
        a2.I = b2;
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
        GLa_3 a2 = this;
        a2.J((xfa)h2, (float)g2, (float)f9, (float)e2, (float)d2, (float)c2, (float)b2, (float)i2);
    }
}

