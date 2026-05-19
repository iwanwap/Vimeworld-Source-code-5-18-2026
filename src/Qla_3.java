/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Oz
 *  Qta
 *  pqa
 */
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;

public final class Qla_3
extends ic<aEa> {
    private static final ResourceLocation I = new ResourceLocation(Qta.l);

    /*
     * WARNING - void declaration
     */
    public float J(aEa aEa2, float f2) {
        void a2;
        Object c22 = aEa2;
        Qla_3 b2 = this;
        Object object = c22;
        Object object2 = c22;
        float f3 = ((aEa)((Object)object)).j + (((aEa)((Object)object)).J - ((aEa)((Object)object2)).j) * a2;
        Object object3 = c22;
        float c22 = ((aEa)((Object)object2)).A + (((aEa)((Object)object3)).C - ((aEa)((Object)object3)).A) * a2;
        return (Oz.d((float)f3) + pqa.r) * c22;
    }

    /*
     * WARNING - void declaration
     */
    public Qla_3(oLa oLa2, ModelBase modelBase, float f2) {
        void b2;
        void c2;
        float d2 = f2;
        Qla_3 a2 = this;
        super((oLa)c2, (ModelBase)b2, d2);
    }

    public ResourceLocation J(aEa aEa2) {
        Object b2 = aEa2;
        Qla_3 a2 = this;
        return I;
    }
}

