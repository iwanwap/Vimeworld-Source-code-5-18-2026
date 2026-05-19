/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  Nia
 *  Yfa
 *  eAa
 *  vL
 *  vRa
 *  xy
 */
import net.minecraft.block.BlockFence;

public final class sfa_3
extends eAa {
    /*
     * WARNING - void declaration
     */
    public static boolean J(Sx sx2, Gg gg2, XF xF2) {
        void a2;
        void b2;
        Sx sx3 = sx2;
        void v0 = b2;
        Nia nia = Nia.J((Gg)v0, (XF)a2);
        int n2 = uSa.E;
        double d2 = hpa.y;
        void v1 = a2;
        int c2 = v1.getX();
        int n3 = v1.getY();
        int n4 = v1.getZ();
        for (Yfa yfa2 : v0.J(Yfa.class, new xy((double)c2 - d2, (double)n3 - d2, (double)n4 - d2, (double)c2 + d2, (double)n3 + d2, (double)n4 + d2))) {
            if (!yfa2.S() || yfa2.l() != sx3) continue;
            if (nia == null) {
                nia = Nia.f((Gg)b2, (XF)a2);
            }
            yfa2.J((vL)nia, vRa.d != 0);
            n2 = vRa.d;
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Sx sx2, Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4) {
        void e2;
        sfa_3 i2 = gg2;
        sfa_3 f5 = this;
        if (i2.J((XF)e2).J() instanceof BlockFence) {
            void g2;
            if (((Gg)i2).e) {
                return vRa.d != 0;
            }
            sfa_3.J((Sx)g2, (Gg)i2, (XF)e2);
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public sfa_3() {
        sfa_3 a2;
        sfa_3 sfa_32 = a2;
        sfa_32.J(yGa.J);
    }
}

