/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ad
 *  JPa
 *  Tpa
 *  UEa
 *  fka
 *  lja
 *  uKa
 */
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;

public final class fka_1
extends ic<UEa> {
    private float A;
    private static final ResourceLocation I = new ResourceLocation(Tpa.O);

    public ResourceLocation J(UEa uEa2) {
        fka_1 b2 = uEa2;
        fka_1 a2 = this;
        return I;
    }

    /*
     * WARNING - void declaration
     */
    public fka_1(oLa oLa2, ModelBase modelBase, float f2, float f3) {
        void e2;
        void b2;
        void c2;
        void d2;
        fka_1 a2;
        float f4 = f3;
        fka_1 fka_12 = a2 = this;
        super((oLa)d2, (ModelBase)c2, (float)(b2 * e2));
        fka_12.A = e2;
        fka_1 fka_13 = a2;
        fka_12.f(new lja((Ad)a2));
        fka_1 fka_14 = a2;
        fka_14.f(new lka((fka)fka_14, a2));
    }

    public void l() {
        uKa.J((float)JPa.N, (float)sqa.Z, (float)JPa.N);
    }

    public void J(UEa uEa2, float f2) {
        fka_1 a2;
        float c2 = f2;
        fka_1 fka_12 = a2 = this;
        uKa.l((float)fka_12.A, (float)fka_12.A, (float)a2.A);
    }
}

