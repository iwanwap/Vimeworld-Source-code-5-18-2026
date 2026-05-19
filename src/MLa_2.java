/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Lra
 *  cga
 *  id
 *  kpa
 *  pqa
 *  uKa
 *  vKa
 *  vL
 *  vRa
 */
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelSlime;

public final class MLa_2
implements id<cga> {
    private final vKa A;
    private final ModelBase I;

    /*
     * WARNING - void declaration
     */
    public void J(cga cga2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        MLa_2 i2 = cga2;
        MLa_2 h2 = this;
        if (!i2.C()) {
            void a2;
            void b2;
            void c2;
            void d2;
            void f9;
            void g2;
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            uKa.l();
            uKa.B();
            uKa.f((int)Lra.k, (int)kpa.J);
            MLa_2 mLa_2 = h2;
            h2.I.J(mLa_2.A.J());
            mLa_2.I.J((vL)i2, (float)g2, (float)f9, (float)d2, (float)c2, (float)b2, (float)a2);
            uKa.k();
            uKa.b();
        }
    }

    public boolean J() {
        return vRa.d != 0;
    }

    public MLa_2(vKa vKa2) {
        MLa_2 b2 = vKa2;
        MLa_2 a2 = this;
        MLa_2 mLa_2 = a2;
        a2.I = new ModelSlime(uSa.E);
        a2.A = b2;
    }
}

