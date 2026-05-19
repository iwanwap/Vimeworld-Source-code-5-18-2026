/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  MQa
 *  ega
 *  pqa
 *  uKa
 */
import net.minecraft.client.model.ModelMagmaCube;
import net.minecraft.util.ResourceLocation;

public final class eJa_2
extends ic<ega> {
    private static final ResourceLocation I = new ResourceLocation(yRa.h);

    public eJa_2(oLa oLa2) {
        Object b2 = oLa2;
        eJa_2 a2 = this;
        super((oLa)b2, new ModelMagmaCube(), rta.o);
    }

    public ResourceLocation J(ega ega2) {
        eJa_2 b2 = ega2;
        eJa_2 a2 = this;
        return I;
    }

    public void J(ega ega2, float f2) {
        float a2;
        eJa_2 c22 = ega2;
        eJa_2 b2 = this;
        eJa_2 eJa_22 = c22;
        int n2 = eJa_22.H();
        eJa_2 eJa_23 = c22;
        float c22 = (((ega)eJa_22).J + (((ega)eJa_23).C - ((ega)eJa_23).J) * a2) / ((float)n2 * MQa.L + pqa.r);
        c22 = pqa.r / (c22 + pqa.r);
        a2 = n2;
        uKa.l((float)(c22 * a2), (float)(pqa.r / c22 * a2), (float)(c22 * a2));
    }
}

