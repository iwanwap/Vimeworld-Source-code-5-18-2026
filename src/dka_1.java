/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 *  ODa
 *  SRa
 *  qta
 *  uKa
 */
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;

public final class dka_1
extends ic<ODa> {
    private static final ResourceLocation j = new ResourceLocation(dsa.O);
    private static final ResourceLocation J;
    private static final ResourceLocation A;
    private static final ResourceLocation I;

    /*
     * WARNING - void declaration
     */
    public dka_1(oLa oLa2, ModelBase modelBase, float f2) {
        void b2;
        void c2;
        float d2 = f2;
        dka_1 a2 = this;
        super((oLa)c2, (ModelBase)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(ODa oDa2, float f2) {
        void b2;
        float c2 = f2;
        dka_1 a2 = this;
        void v0 = b2;
        super.J((Gl)v0, c2);
        if (v0.ba()) {
            uKa.l((float)xSa.la, (float)xSa.la, (float)xSa.la);
        }
    }

    static {
        I = new ResourceLocation(Hra.Z);
        J = new ResourceLocation(SRa.D);
        A = new ResourceLocation(qta.A);
    }

    public ResourceLocation J(ODa oDa2) {
        dka_1 b2 = oDa2;
        dka_1 a2 = this;
        switch (b2.g()) {
            default: {
                return I;
            }
            case 1: {
                while (false) {
                }
                return j;
            }
            case 2: {
                return J;
            }
            case 3: {
                return A;
            }
        }
    }
}

