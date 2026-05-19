/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Hda
 *  vRa
 */
import net.minecraft.util.ResourceLocation;

public final class IBa_1
extends Hda {
    /*
     * WARNING - void declaration
     */
    public IBa_1(int n2, ResourceLocation resourceLocation, boolean bl, int n3) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n4 = n3;
        IBa_1 a2 = this;
        super((int)d2, (ResourceLocation)c2, (boolean)b2, (int)e2);
    }

    public boolean l() {
        return vRa.d != 0;
    }

    public boolean J(int n2, int n3) {
        int c2 = n2;
        IBa_1 b2 = this;
        if (c2 >= vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

