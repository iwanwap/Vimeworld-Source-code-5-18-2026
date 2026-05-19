/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hTa
 *  lqa
 *  sia
 *  vRa
 *  wga
 */
import net.minecraft.util.ResourceLocation;

public final class EGa_1
extends wga {
    public int J(int n2) {
        int b2 = n2;
        EGa_1 a2 = this;
        return lqa.s + (b2 - vRa.d) * kTa.j;
    }

    /*
     * WARNING - void declaration
     */
    public EGa_1(int n2, ResourceLocation resourceLocation, int n3) {
        void b2;
        void c2;
        EGa_1 a2;
        int d2 = n3;
        EGa_1 eGa_1 = a2 = this;
        super((int)c2, (ResourceLocation)b2, d2, sia.BOW);
        eGa_1.J(hTa.K);
    }

    public int f() {
        return uqa.g;
    }

    public int f(int n2) {
        int b2 = n2;
        EGa_1 a2 = this;
        return a2.J(b2) + kTa.g;
    }
}

