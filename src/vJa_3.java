/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  MQa
 *  Xsa
 *  hqa
 *  mFa
 *  pPa
 *  pqa
 *  uKa
 */
import net.minecraft.client.model.ModelVillager;
import net.minecraft.util.ResourceLocation;

public final class vJa_3
extends ic<mFa> {
    private static final ResourceLocation M = new ResourceLocation(Xsa.V);
    private static final ResourceLocation k;
    private static final ResourceLocation j;
    private static final ResourceLocation J;
    private static final ResourceLocation A;
    private static final ResourceLocation I;

    public ModelVillager J() {
        vJa_3 a2;
        return (ModelVillager)super.J();
    }

    /*
     * Enabled aggressive block sorting
     */
    public ResourceLocation J(mFa mFa2) {
        vJa_3 b2 = mFa2;
        vJa_3 a2 = this;
        switch (b2.g()) {
            case 0: {
                return A;
            }
            case 1: {
                return I;
            }
            case 2: {
                return k;
            }
            case 3: {
                return j;
            }
            case 4: {
                return J;
            }
        }
        return M;
    }

    public vJa_3(oLa oLa2) {
        Object b2 = oLa2;
        vJa_3 a2 = this;
        super((oLa)b2, new ModelVillager(JPa.N), MQa.L);
        vJa_3 vJa_32 = a2;
        vJa_32.f(new CJa(vJa_32.J().villagerHead));
    }

    /*
     * WARNING - void declaration
     */
    public void J(mFa mFa2, float f2) {
        float f3;
        void b2;
        float c2 = f2;
        vJa_3 a2 = this;
        c2 = pqa.Ha;
        if (b2.I() < 0) {
            f3 = c2 = (float)((double)c2 * kTa.B);
            a2.I = (ResourceLocation)rta.o;
        } else {
            a2.I = (ResourceLocation)MQa.L;
            f3 = c2;
        }
        float f4 = c2;
        uKa.l((float)f3, (float)f4, (float)f4);
    }

    static {
        A = new ResourceLocation(hqa.e);
        I = new ResourceLocation(fta.O);
        k = new ResourceLocation(pPa.ca);
        j = new ResourceLocation(tSa.l);
        J = new ResourceLocation(FRa.Da);
    }
}

