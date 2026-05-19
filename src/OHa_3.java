/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  Ypa
 *  sia
 *  wga
 */
import net.minecraft.util.ResourceLocation;

public final class OHa_3
extends wga {
    public int f() {
        return yRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public OHa_3(int n2, ResourceLocation resourceLocation, int n3) {
        void b2;
        void c2;
        OHa_3 a2;
        int d2 = n3;
        OHa_3 oHa_3 = a2 = this;
        super((int)c2, (ResourceLocation)b2, d2, sia.ARMOR_FEET);
        oHa_3.J(xTa.u);
    }

    public int f(int n2) {
        int b2 = n2;
        OHa_3 a2 = this;
        return a2.J(b2) + Ypa.A;
    }

    public int J(int n2) {
        int b2 = n2;
        OHa_3 a2 = this;
        return b2 * NTa.C;
    }
}

