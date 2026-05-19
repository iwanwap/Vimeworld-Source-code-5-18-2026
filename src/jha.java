/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  sia
 *  vRa
 *  vpa
 *  wga
 */
import net.minecraft.util.ResourceLocation;

public final class jha
extends wga {
    /*
     * WARNING - void declaration
     */
    public jha(int n2, ResourceLocation resourceLocation, int n3) {
        void b2;
        void c2;
        jha a2;
        int d2 = n3;
        jha jha2 = a2 = this;
        super((int)c2, (ResourceLocation)b2, d2, sia.WEAPON);
        jha2.J(LRa.g);
    }

    public int f() {
        return uqa.g;
    }

    public int J(int n2) {
        int b2 = n2;
        jha a2 = this;
        return NTa.C + kTa.j * (b2 - vRa.d);
    }

    public int f(int n2) {
        int b2 = n2;
        jha a2 = this;
        return super.J(b2) + vpa.o;
    }
}

