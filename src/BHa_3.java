/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  VEa
 *  Zpa
 *  sia
 *  vRa
 *  vpa
 *  wga
 */
import java.util.Random;
import net.minecraft.util.ResourceLocation;

public final class BHa_3
extends wga {
    /*
     * WARNING - void declaration
     */
    public BHa_3(int n2, ResourceLocation resourceLocation, int n3) {
        void b2;
        void c2;
        BHa_3 a2;
        int d2 = n3;
        BHa_3 bHa_3 = a2 = this;
        super((int)c2, (ResourceLocation)b2, d2, sia.BREAKABLE);
        bHa_3.J(Zpa.T);
    }

    public int J(int n2) {
        int b2 = n2;
        BHa_3 a2 = this;
        return tTa.h + (b2 - vRa.d) * Yqa.i;
    }

    public boolean J(Mda mda2) {
        BHa_3 b2 = mda2;
        BHa_3 a2 = this;
        if (b2.d()) {
            return vRa.d != 0;
        }
        return super.J((Mda)b2);
    }

    public int f() {
        return yRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(Mda mda2, int n2, Random random) {
        void b2;
        Random c2 = random;
        Mda a2 = mda2;
        if (a2.J() instanceof VEa && c2.nextFloat() < Ora.D) {
            return uSa.E != 0;
        }
        if (c2.nextInt((int)(b2 + vRa.d)) > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int f(int n2) {
        int b2 = n2;
        BHa_3 a2 = this;
        return super.J(b2) + vpa.o;
    }
}

