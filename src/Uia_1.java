/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  Ypa
 *  bua
 *  sia
 *  vRa
 *  wga
 */
import net.minecraft.util.ResourceLocation;

public final class Uia_1
extends wga {
    public int f(int n2) {
        int b2 = n2;
        Uia_1 a2 = this;
        return a2.J(b2) + Ypa.A;
    }

    public int f() {
        return tTa.h;
    }

    /*
     * WARNING - void declaration
     */
    public Uia_1(int n2, ResourceLocation resourceLocation, int n3) {
        void b2;
        void c2;
        Uia_1 a2;
        int d2 = n3;
        Uia_1 uia_1 = a2 = this;
        super((int)c2, (ResourceLocation)b2, d2, sia.BOW);
        uia_1.J(bua.Ha);
    }

    public int J(int n2) {
        int b2 = n2;
        Uia_1 a2 = this;
        return vRa.d + (b2 - vRa.d) * NTa.C;
    }
}

