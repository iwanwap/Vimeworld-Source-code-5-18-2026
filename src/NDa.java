/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  Mda
 *  QFa
 *  eAa
 *  pqa
 *  vRa
 *  ysa
 */
import net.minecraft.block.material.Material;

public final class NDa
extends eAa {
    public NDa() {
        NDa a2;
        NDa nDa = a2;
        nDa.i = vRa.d;
        nDa.f(ysa.s);
        a2.J(yGa.J);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Sx sx2, Gg gg2, XF xF, DZ dZ2, float f2, float f3, float f4) {
        void f5;
        void h;
        void d2;
        Object i2;
        void g2;
        NDa nDa = object;
        Object object = xF;
        NDa e2 = nDa;
        if (!g2.J((XF)((Object)(i2 = ((XF)((Object)i2)).offset((DZ)d2))), (DZ)d2, (Mda)h)) {
            return uSa.E != 0;
        }
        if (f5.J((XF)((Object)i2)).J().J() == Material.air) {
            void v1 = f5;
            v1.J((double)i2.getX() + kTa.B, (double)i2.getY() + kTa.B, (double)i2.getZ() + kTa.B, osa.l, pqa.r, M.nextFloat() * Xpa.R + xSa.la);
            v1.J((XF)((Object)i2), QFa.ic.J());
        }
        h.J(vRa.d, (Gl)g2);
        return vRa.d != 0;
    }
}

