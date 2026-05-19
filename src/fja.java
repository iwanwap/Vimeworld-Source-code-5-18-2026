/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Aka
 *  Gl
 *  Kpa
 *  Rea
 *  aQa
 *  pqa
 *  uKa
 *  vRa
 */
import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelHorse;
import net.minecraft.util.ResourceLocation;

public final class fja
extends ic<Rea> {
    private static final ResourceLocation M;
    private static final ResourceLocation k;
    private static final ResourceLocation j;
    private static final Map<String, ResourceLocation> J;
    private static final ResourceLocation A;
    private static final ResourceLocation I;

    static {
        J = Maps.newHashMap();
        I = new ResourceLocation(sqa.S);
        k = new ResourceLocation(aQa.L);
        j = new ResourceLocation(tTa.H);
        A = new ResourceLocation(Era.K);
        M = new ResourceLocation(Psa.c);
    }

    /*
     * WARNING - void declaration
     */
    private ResourceLocation f(Rea rea2) {
        void a2;
        fja fja2 = this;
        void v0 = a2;
        String string = v0.D();
        if (!v0.aa()) {
            return null;
        }
        Object b2 = J.get(string);
        if (b2 == null) {
            Kpa.J().J().J((ResourceLocation)(b2 = new ResourceLocation(string)), (H)new Aka(a2.J()));
            J.put(string, (ResourceLocation)b2);
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    public fja(oLa oLa2, ModelHorse modelHorse, float f2) {
        void b2;
        void c2;
        float d2 = f2;
        fja a2 = this;
        super((oLa)c2, (ModelBase)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Rea rea2, float f2) {
        void a2;
        float f3;
        void b2;
        fja fja2 = this;
        float c2 = pqa.r;
        int n2 = b2.B();
        if (n2 == vRa.d) {
            f3 = c2 = c2 * zOa.C;
        } else {
            if (n2 == uqa.g) {
                c2 *= LRa.d;
            }
            f3 = c2;
        }
        float f4 = c2;
        uKa.l((float)f3, (float)f4, (float)f4);
        super.J((Gl)b2, (float)a2);
    }

    public ResourceLocation J(Rea rea2) {
        fja b2 = rea2;
        fja a2 = this;
        if (!b2.Da()) {
            switch (b2.B()) {
                default: {
                    return I;
                }
                case 1: {
                    while (false) {
                    }
                    return j;
                }
                case 2: {
                    return k;
                }
                case 3: {
                    return A;
                }
                case 4: {
                    return M;
                }
            }
        }
        return a2.f((Rea)b2);
    }
}

