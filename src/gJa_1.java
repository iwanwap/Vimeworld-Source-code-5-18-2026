/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  WSa
 *  cfa
 *  kPa
 *  pY
 */
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;

public final class gJa_1
extends ic<cfa> {
    private static final ResourceLocation C;
    private static final ResourceLocation i;
    private static final ResourceLocation M;
    private static final ResourceLocation k;
    private static final ResourceLocation j;
    private static final ResourceLocation J;
    private static final ResourceLocation A;
    private static final ResourceLocation I;

    static {
        J = new ResourceLocation(WPa.Ga);
        I = new ResourceLocation(Fua.z);
        C = new ResourceLocation(Bpa.j);
        i = new ResourceLocation(WSa.s);
        M = new ResourceLocation(qsa.t);
        A = new ResourceLocation(cTa.d);
        k = new ResourceLocation(kPa.A);
        j = new ResourceLocation(pta.fa);
    }

    /*
     * WARNING - void declaration
     */
    public gJa_1(oLa oLa2, ModelBase modelBase, float f2) {
        void b2;
        void c2;
        float d2 = f2;
        gJa_1 a2 = this;
        super((oLa)c2, (ModelBase)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    public ResourceLocation J(cfa cfa2) {
        void a2;
        gJa_1 gJa_12 = this;
        String b2 = pY.getTextWithoutFormattingCodes((String)a2.J());
        if (b2 != null && b2.equals(Lsa.ja)) {
            return k;
        }
        switch (a2.H()) {
            default: {
                return J;
            }
            case 1: {
                while (false) {
                }
                return I;
            }
            case 2: {
                return C;
            }
            case 3: {
                return A;
            }
            case 4: {
                return i;
            }
            case 5: {
                return M;
            }
            case 99: {
                return j;
            }
        }
    }
}

