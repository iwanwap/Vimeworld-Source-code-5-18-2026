/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fpa
 *  Iea
 *  MQa
 */
import net.minecraft.client.model.ModelSnowMan;
import net.minecraft.util.ResourceLocation;

public final class hja
extends ic<Iea> {
    private static final ResourceLocation I = new ResourceLocation(Fpa.P);

    public ResourceLocation J(Iea iea) {
        hja b2 = iea;
        hja a2 = this;
        return I;
    }

    public hja(oLa oLa2) {
        Object b2 = oLa2;
        hja a2 = this;
        super((oLa)b2, new ModelSnowMan(), MQa.L);
        hja hja2 = a2;
        hja2.f(new lJa(hja2));
    }

    public ModelSnowMan J() {
        hja a2;
        return (ModelSnowMan)super.J();
    }
}

