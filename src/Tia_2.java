/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  sia
 *  vRa
 *  wga
 *  wra
 */
import net.minecraft.util.ResourceLocation;

public final class Tia_2
extends wga {
    public int f(int n2) {
        int b2 = n2;
        Tia_2 a2 = this;
        return a2.J(b2) + wra.P;
    }

    public int J(int n2) {
        int b2 = n2;
        Tia_2 a2 = this;
        return vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public Tia_2(int n2, ResourceLocation resourceLocation, int n3) {
        void b2;
        void c2;
        Tia_2 a2;
        int d2 = n3;
        Tia_2 tia_2 = a2 = this;
        super((int)c2, (ResourceLocation)b2, d2, sia.ARMOR_HEAD);
        tia_2.J(Zra.h);
    }

    public int f() {
        return vRa.d;
    }
}

