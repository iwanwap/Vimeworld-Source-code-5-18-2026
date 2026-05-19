/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  MQa
 *  Mda
 *  QFa
 *  eAa
 *  kta
 *  pqa
 *  vL
 *  vRa
 */
import net.minecraft.block.Block;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.state.IBlockState;

public final class Uaa_3
extends eAa {
    private Block I;

    public Uaa_3(Block block) {
        Object b2 = block;
        Uaa_3 a2 = this;
        a2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Sx sx2, Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4) {
        void a2;
        void b2;
        void c2;
        void h2;
        void v1;
        void g2;
        Object d2;
        Object i2;
        void f5;
        Uaa_3 uaa_3 = object;
        Object object = xF2;
        Uaa_3 e2 = uaa_3;
        IBlockState iBlockState = f5.J((XF)((Object)i2));
        Block block = iBlockState.J();
        if (block == QFa.gC && iBlockState.J(BlockSnow.LAYERS) < vRa.d) {
            d2 = DZ.UP;
            v1 = g2;
        } else {
            if (!block.f((Gg)f5, (XF)((Object)i2))) {
                i2 = ((XF)((Object)i2)).offset((DZ)((Object)d2));
            }
            v1 = g2;
        }
        if (!v1.J((XF)((Object)i2), (DZ)((Object)d2), (Mda)h2)) {
            return uSa.E != 0;
        }
        if (h2.E == 0) {
            return uSa.E != 0;
        }
        if (f5.J(e2.I, (XF)((Object)i2), uSa.E != 0, (DZ)((Object)d2), (vL)null, (Mda)h2) && f5.J((XF)((Object)i2), (IBlockState)(d2 = e2.I.J((Gg)f5, (XF)((Object)i2), (DZ)((Object)d2), (float)c2, (float)b2, (float)a2, uSa.E, (Gl)g2)), yRa.d)) {
            d2 = f5.J((XF)((Object)i2));
            if (d2.J() == e2.I) {
                kda.J((Gg)f5, (Sx)g2, (XF)((Object)i2), (Mda)h2);
                d2.J().J((Gg)f5, (XF)((Object)i2), (IBlockState)d2, (Gl)g2, (Mda)h2);
            }
            f5.J((double)((float)i2.getX() + MQa.L), (double)((float)i2.getY() + MQa.L), (double)((float)i2.getZ() + MQa.L), e2.I.stepSound.f(), (e2.I.stepSound.f() + pqa.r) / kta.v, e2.I.stepSound.J() * xSa.la);
            h2.E -= vRa.d;
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

