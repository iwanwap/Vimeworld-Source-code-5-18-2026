/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  NTa
 *  SRa
 *  sia
 *  vRa
 *  vpa
 *  wga
 */
import net.minecraft.util.ResourceLocation;

public final class zha_3
extends wga {
    public boolean J(Mda mda2) {
        zha_3 b2 = mda2;
        zha_3 a2 = this;
        if (b2.J() == Gea.ja) {
            return vRa.d != 0;
        }
        return super.J((Mda)b2);
    }

    public int J(int n2) {
        int b2 = n2;
        zha_3 a2 = this;
        return vRa.d + NTa.C * (b2 - vRa.d);
    }

    /*
     * WARNING - void declaration
     */
    public zha_3(int n2, ResourceLocation resourceLocation, int n3) {
        void b2;
        void c2;
        zha_3 a2;
        int d2 = n3;
        zha_3 zha_32 = a2 = this;
        super((int)c2, (ResourceLocation)b2, d2, sia.DIGGER);
        zha_32.J(SRa.Ka);
    }

    public int f(int n2) {
        int b2 = n2;
        zha_3 a2 = this;
        return super.J(b2) + vpa.o;
    }

    public int f() {
        return tTa.h;
    }
}

