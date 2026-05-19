/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  QFa
 *  eAa
 *  pqa
 *  psa
 *  vRa
 */
import net.minecraft.block.material.Material;

public final class efa_1
extends eAa {
    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Sx sx, Gg gg2, XF xF, DZ dZ, float f2, float f3, float f4) {
        void h;
        void d2;
        Object i2;
        void g;
        void f5;
        efa_1 efa_12 = object;
        Object object = xF;
        efa_1 e2 = efa_12;
        if (f5.e) {
            return vRa.d != 0;
        }
        if (!g.J((XF)((Object)(i2 = ((XF)((Object)i2)).offset((DZ)d2))), (DZ)d2, (Mda)h)) {
            return uSa.E != 0;
        }
        if (f5.J((XF)((Object)i2)).J().J() == Material.air) {
            void v1 = f5;
            v1.J((double)i2.getX() + kTa.B, (double)i2.getY() + kTa.B, (double)i2.getZ() + kTa.B, dua.b, pqa.r, (M.nextFloat() - M.nextFloat()) * psa.N + pqa.r);
            v1.J((XF)((Object)i2), QFa.ic.J());
        }
        if (!g.h.f()) {
            h.E -= vRa.d;
        }
        return vRa.d != 0;
    }

    public efa_1() {
        efa_1 a2;
        efa_1 efa_12 = a2;
        efa_12.J(yGa.g);
    }
}

