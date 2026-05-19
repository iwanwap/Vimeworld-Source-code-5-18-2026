/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  Yfa
 *  lja
 *  pqa
 *  uKa
 */
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.util.ResourceLocation;

public class Lla_3<T extends Yfa>
extends ic<T> {
    public float k;
    private static final ResourceLocation A = new ResourceLocation(lQa.N);
    public ModelBiped I;

    public ResourceLocation J(T t2) {
        Lla_3<T> b2 = t2;
        Lla_3 a2 = this;
        return A;
    }

    public void l() {
        uKa.J((float)JPa.N, (float)sqa.Z, (float)JPa.N);
    }

    /*
     * WARNING - void declaration
     */
    public Lla_3(oLa oLa2, ModelBiped modelBiped, float f2) {
        void b2;
        void c2;
        float d2 = f2;
        Lla_3<lja> a2 = this;
        a2((oLa)c2, (ModelBiped)b2, d2, pqa.r);
        Lla_3<lja> lla_3 = a2;
        Lla_3<lja> lla_32 = a2;
        lla_32.f(new lja(lla_32));
    }

    /*
     * WARNING - void declaration
     */
    public Lla_3(oLa oLa2, ModelBiped modelBiped, float f2, float f3) {
        void a2;
        void b2;
        void d2;
        Object e2 = modelBiped;
        Lla_3 c2 = this;
        Object object = e2;
        super((oLa)d2, (ModelBase)object, (float)b2);
        c2.I = object;
        c2.k = a2;
        Lla_3 lla_3 = c2;
        c2.f(new CJa(((ModelBiped)e2).bipedHead));
    }
}

