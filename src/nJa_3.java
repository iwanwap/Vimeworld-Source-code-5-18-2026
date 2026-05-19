/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GLa
 *  JPa
 *  RPa
 *  nJa
 *  uKa
 *  xfa
 */
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;

public final class nJa_3
extends ic<xfa> {
    private static final ResourceLocation J = new ResourceLocation(JPa.g);
    private static final ResourceLocation A = new ResourceLocation(RPa.s);
    private static final ResourceLocation I = new ResourceLocation(Zra.Ja);

    /*
     * WARNING - void declaration
     */
    public nJa_3(oLa oLa2, ModelBase modelBase, float f2) {
        void b2;
        void c2;
        float d2 = f2;
        nJa_3 a2 = this;
        super((oLa)c2, (ModelBase)b2, d2);
        nJa_3 nJa_32 = a2;
        nJa_3 nJa_33 = a2;
        nJa_33.f(new GLa((nJa)nJa_33));
    }

    public float J(xfa xfa2, float f2) {
        nJa_3 c2 = xfa2;
        nJa_3 b2 = this;
        return c2.j();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(xfa xfa2, double d2, double d3, double d4, float f2, float f3) {
        void b2;
        void c2;
        void d5;
        void e2;
        void a2;
        nJa_3 g2 = xfa2;
        nJa_3 f4 = this;
        if (g2.Ha()) {
            float f5 = g2.J((float)a2) * g2.C((float)a2);
            uKa.f((float)f5, (float)f5, (float)f5);
        }
        super.J(g2, (double)e2, (double)d5, (double)c2, (float)b2, (float)a2);
    }

    public ResourceLocation J(xfa xfa2) {
        nJa_3 b2 = xfa2;
        nJa_3 a2 = this;
        if (b2.ba()) {
            return A;
        }
        if (b2.Fa()) {
            return I;
        }
        return J;
    }
}

