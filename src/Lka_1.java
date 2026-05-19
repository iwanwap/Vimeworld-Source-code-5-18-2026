/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ad
 *  JPa
 *  Lka
 *  Lla
 *  MQa
 *  id
 *  lEa
 *  lja
 *  pPa
 *  qja
 *  uKa
 *  vRa
 */
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelSkeleton;
import net.minecraft.util.ResourceLocation;

public final class Lka_1
extends Lla<lEa> {
    private static final ResourceLocation A;
    private static final ResourceLocation I;

    static {
        I = new ResourceLocation(Ira.H);
        A = new ResourceLocation(sqa.k);
    }

    public Lka_1(oLa oLa2) {
        Object b2 = oLa2;
        Lka_1 a2 = this;
        super((oLa)b2, (ModelBiped)new ModelSkeleton(), MQa.L);
        Lka_1 lka_1 = a2;
        lka_1.f((id)new lja((Ad)lka_1));
        Lka_1 lka_12 = a2;
        lka_12.f((id)new qja((Lka)lka_12, (Ad)a2));
    }

    public ResourceLocation J(lEa lEa2) {
        Lka_1 b2 = lEa2;
        Lka_1 a2 = this;
        if (b2.I() == vRa.d) {
            return A;
        }
        return I;
    }

    public void l() {
        uKa.J((float)vqa.M, (float)sqa.Z, (float)JPa.N);
    }

    public void J(lEa lEa2, float f2) {
        Lka_1 c2 = lEa2;
        Lka_1 b2 = this;
        if (c2.I() == vRa.d) {
            uKa.l((float)pPa.c, (float)pPa.c, (float)pPa.c);
        }
    }
}

