/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 *  MQa
 *  Mda
 *  NTa
 *  VEa
 *  gZ
 *  kGa
 *  pqa
 *  sia
 *  vL
 *  vRa
 *  vpa
 *  wga
 */
import java.util.Random;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class KHa_1
extends wga {
    public boolean J(Mda mda2) {
        KHa_1 b2 = mda2;
        KHa_1 a2 = this;
        if (b2.J() instanceof VEa) {
            return vRa.d != 0;
        }
        return super.J((Mda)b2);
    }

    public static int J(int n2, Random random) {
        Random b2 = random;
        int a2 = n2;
        if (a2 > NTa.C) {
            return a2 - NTa.C;
        }
        return vRa.d + b2.nextInt(AQa.P);
    }

    /*
     * WARNING - void declaration
     */
    public KHa_1(int n2, ResourceLocation resourceLocation, int n3) {
        void b2;
        void c2;
        KHa_1 a2;
        int d2 = n3;
        KHa_1 kHa_1 = a2 = this;
        super((int)c2, (ResourceLocation)b2, d2, sia.ARMOR_TORSO);
        kHa_1.J(yta.ja);
    }

    public static boolean J(int n2, Random random) {
        Random b2 = random;
        int a2 = n2;
        if (a2 <= 0) {
            return uSa.E != 0;
        }
        if (b2.nextFloat() < VPa.i * (float)a2) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int f(int n2) {
        int b2 = n2;
        KHa_1 a2 = this;
        return super.J(b2) + vpa.o;
    }

    public int J(int n2) {
        int b2 = n2;
        KHa_1 a2 = this;
        return NTa.C + kTa.j * (b2 - vRa.d);
    }

    /*
     * WARNING - void declaration
     */
    public void f(Gl gl2, vL vL2, int n2) {
        void a2;
        void c2;
        KHa_1 kHa_1 = this;
        Random random = c2.J();
        KHa_1 d2 = kGa.J((wga)wga.A, (Gl)c2);
        if (KHa_1.J((int)a2, random)) {
            void b2;
            if (b2 != null) {
                b2.J(gZ.J((vL)c2), (float)KHa_1.J((int)a2, random));
                b2.J(lTa.y, MQa.L, pqa.r);
            }
            if (d2 != null) {
                d2.J(yRa.d, (Gl)c2);
                return;
            }
        } else if (d2 != null) {
            d2.J(vRa.d, (Gl)c2);
        }
    }

    public int f() {
        return yRa.d;
    }
}

