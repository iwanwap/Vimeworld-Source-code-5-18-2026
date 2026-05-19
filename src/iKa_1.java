/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  MQa
 *  id
 *  vL
 *  zda
 */
import net.minecraft.client.model.ModelPig;
import net.minecraft.util.ResourceLocation;

public final class iKa_1
implements id<zda> {
    private final ModelPig J;
    private final ZKa A;
    private static final ResourceLocation I = new ResourceLocation(qsa.r);

    public boolean J() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(zda zda2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        iKa_1 i2 = zda2;
        iKa_1 h2 = this;
        if (i2.v()) {
            void a2;
            void b2;
            void c2;
            void d2;
            void f9;
            void g2;
            iKa_1 iKa_12 = h2;
            iKa_12.A.J(I);
            iKa_1 iKa_13 = h2;
            iKa_12.J.J(iKa_13.A.J());
            iKa_13.J.J((vL)i2, (float)g2, (float)f9, (float)d2, (float)c2, (float)b2, (float)a2);
        }
    }

    public iKa_1(ZKa zKa) {
        Object b2 = zKa;
        iKa_1 a2 = this;
        iKa_1 iKa_12 = a2;
        a2.J = new ModelPig(MQa.L);
        a2.A = b2;
    }
}

