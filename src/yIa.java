/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  sia
 *  wga
 */
import net.minecraft.util.ResourceLocation;

public final class yIa
extends wga {
    public int f() {
        return yRa.d;
    }

    public int f(int n2) {
        int b2 = n2;
        yIa a2 = this;
        return a2.J(b2) + Fsa.d;
    }

    /*
     * WARNING - void declaration
     */
    public yIa(int n2, ResourceLocation resourceLocation, int n3) {
        void b2;
        void c2;
        yIa a2;
        int d2 = n3;
        yIa yIa2 = a2 = this;
        super((int)c2, (ResourceLocation)b2, d2, sia.ARMOR_HEAD);
        yIa2.J(GPa.x);
    }

    public int J(int n2) {
        int b2 = n2;
        yIa a2 = this;
        return NTa.C * b2;
    }
}

