/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  Ypa
 *  sia
 *  vRa
 *  vpa
 *  wga
 */
import net.minecraft.util.ResourceLocation;

public final class zIa_3
extends wga {
    public int J(int n2) {
        int b2 = n2;
        zIa_3 a2 = this;
        return Ypa.A;
    }

    /*
     * WARNING - void declaration
     */
    public zIa_3(int n2, ResourceLocation resourceLocation, int n3) {
        void b2;
        void c2;
        zIa_3 a2;
        int d2 = n3;
        zIa_3 zIa_32 = a2 = this;
        super((int)c2, (ResourceLocation)b2, d2, sia.DIGGER);
        zIa_32.J(GPa.t);
    }

    public int f(int n2) {
        int b2 = n2;
        zIa_3 a2 = this;
        return super.J(b2) + vpa.o;
    }

    public int f() {
        return vRa.d;
    }

    public boolean J(Mda mda2) {
        zIa_3 b2 = mda2;
        zIa_3 a2 = this;
        if (b2.J() == Gea.ja) {
            return vRa.d != 0;
        }
        return super.J((Mda)b2);
    }

    public boolean J(wga wga2) {
        zIa_3 a2 = this;
        zIa_3 b2 = wga2;
        if (super.J((wga)b2) && b2.I != zIa_3.g.I) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

