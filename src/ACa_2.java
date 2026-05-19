/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  MQa
 *  Mda
 *  XTa
 *  kta
 *  pqa
 *  vRa
 *  xy
 */
import net.minecraft.block.Block;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.state.IBlockState;

public final class ACa_2
extends kda {
    public int J(int n2) {
        int b2 = n2;
        ACa_2 a2 = this;
        return b2;
    }

    public ACa_2(Block block) {
        ACa_2 a2;
        Object b2 = block;
        ACa_2 aCa_2 = a2 = this;
        super((Block)b2);
        aCa_2.f(uSa.E);
        a2.J(vRa.d != 0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Mda mda2, Sx sx2, Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4) {
        void a2;
        void b2;
        void c2;
        void f5;
        void d2;
        XF i2;
        void g2;
        void h2;
        ACa_2 aCa_2 = xF3;
        XF xF3 = xF2;
        ACa_2 e2 = aCa_2;
        if (h2.E == 0) {
            return uSa.E != 0;
        }
        if (!g2.J(i2, (DZ)d2, (Mda)h2)) {
            return uSa.E != 0;
        }
        IBlockState iBlockState = f5.J(i2);
        Block block = iBlockState.J();
        Object object = i2;
        if (!(d2 == DZ.UP && block == e2.I || block.f((Gg)f5, i2))) {
            object = i2.offset((DZ)d2);
            iBlockState = f5.J((XF)((Object)object));
            block = iBlockState.J();
        }
        if (block == e2.I && (i2 = iBlockState.J(BlockSnow.LAYERS).intValue()) <= XTa.W && (iBlockState = e2.I.J((Gg)f5, (XF)((Object)object), i2 = iBlockState.J(BlockSnow.LAYERS, i2 + vRa.d))) != null && f5.l((xy)iBlockState) && f5.J((XF)((Object)object), i2, uqa.g)) {
            f5.J((double)((float)object.getX() + MQa.L), (double)((float)object.getY() + MQa.L), (double)((float)object.getZ() + MQa.L), e2.I.stepSound.f(), (e2.I.stepSound.f() + pqa.r) / kta.v, e2.I.stepSound.J() * xSa.la);
            h2.E -= vRa.d;
            return vRa.d != 0;
        }
        return super.J((Mda)h2, (Sx)g2, (Gg)f5, (XF)((Object)object), (DZ)d2, (float)c2, (float)b2, (float)a2);
    }
}

