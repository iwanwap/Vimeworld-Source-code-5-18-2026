/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Dga
 *  RJa
 *  pqa
 *  zka
 */
import net.minecraft.client.model.ModelSpider;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class zka_3<T extends Dga>
extends ic<T> {
    private static final ResourceLocation I = new ResourceLocation(xqa.Ka);

    public zka_3(oLa oLa2) {
        Object b2 = oLa2;
        zka_3 a2 = this;
        super((oLa)b2, new ModelSpider(), pqa.r);
        zka_3 zka_32 = a2;
        zka_32.f(new RJa((zka)zka_32));
    }

    public ResourceLocation J(T t2) {
        zka_3<T> b2 = t2;
        zka_3 a2 = this;
        return I;
    }

    public float J(T t2) {
        zka_3<T> b2 = t2;
        zka_3 a2 = this;
        return Hra.Ga;
    }
}

