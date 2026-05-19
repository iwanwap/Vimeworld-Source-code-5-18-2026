/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  Mda
 *  Oz
 *  QFa
 *  Ypa
 *  Yra
 *  aaa
 *  eAa
 *  uY
 *  vRa
 */
import net.minecraft.block.BlockStandingSign;
import net.minecraft.block.BlockWallSign;

public final class PAa
extends eAa {
    public PAa() {
        PAa a2;
        PAa pAa = a2;
        pAa.i = ERa.C;
        pAa.J(yGa.a);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Sx sx2, Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4) {
        void v1;
        void h2;
        void g2;
        Object i2;
        void f5;
        void d2;
        PAa pAa = object;
        Object object = xF2;
        PAa e2 = pAa;
        if (d2 == DZ.DOWN) {
            return uSa.E != 0;
        }
        if (!f5.J((XF)((Object)i2)).J().J().i()) {
            return uSa.E != 0;
        }
        if (!g2.J((XF)((Object)(i2 = ((XF)((Object)i2)).offset((DZ)d2))), (DZ)d2, (Mda)h2)) {
            return uSa.E != 0;
        }
        if (!QFa.Nd.J((Gg)f5, (XF)((Object)i2))) {
            return uSa.E != 0;
        }
        if (f5.e) {
            return vRa.d != 0;
        }
        if (d2 == DZ.UP) {
            v1 = h2;
            int c2 = Oz.f((double)((double)((g2.X + Hra.Ga) * Yra.i / CRa.ja) + kTa.B)) & Ypa.A;
            f5.J((XF)((Object)i2), QFa.Nd.J().J(BlockStandingSign.ROTATION, c2), yRa.d);
        } else {
            f5.J((XF)((Object)i2), QFa.WB.J().J(BlockWallSign.FACING, d2), yRa.d);
            v1 = h2;
        }
        v1.E -= vRa.d;
        uY c2 = f5.J((XF)((Object)i2));
        if (c2 instanceof aaa && !kda.J((Gg)f5, (Sx)g2, (XF)((Object)i2), (Mda)h2)) {
            g2.J((aaa)c2);
        }
        return vRa.d != 0;
    }
}

