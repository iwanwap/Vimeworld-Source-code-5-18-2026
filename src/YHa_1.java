/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  sia
 *  vRa
 *  vpa
 *  wga
 */
import net.minecraft.util.ResourceLocation;

public final class YHa_1
extends wga {
    public int f() {
        return uqa.g;
    }

    /*
     * WARNING - void declaration
     */
    public YHa_1(int n2, ResourceLocation resourceLocation, int n3) {
        void b2;
        void c2;
        YHa_1 a2;
        int d2 = n3;
        YHa_1 yHa_1 = a2 = this;
        super((int)c2, (ResourceLocation)b2, d2, sia.WEAPON);
        yHa_1.J(Iqa.ja);
    }

    public int J(int n2) {
        int b2 = n2;
        YHa_1 a2 = this;
        return tTa.h + kTa.j * (b2 - vRa.d);
    }

    public int f(int n2) {
        int b2 = n2;
        YHa_1 a2 = this;
        return super.J(b2) + vpa.o;
    }
}

