/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  MQa
 *  Mda
 *  kta
 *  pqa
 *  vRa
 */
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockSlab$EnumBlockHalf;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;

public final class eCa_3
extends kda {
    private final BlockSlab A;
    private final BlockSlab I;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, DZ dZ2, Sx sx2, Mda mda2) {
        void b2;
        Object f22;
        void c2;
        void e2;
        void a2;
        XF d2;
        eCa_3 eCa_32 = this;
        void var6_8 = d2;
        eCa_3 eCa_33 = eCa_32;
        IProperty<?> iProperty = eCa_33.I.J();
        Object object = eCa_33.I.J((Mda)a2);
        IBlockState iBlockState = e2.J(d2);
        if (iBlockState.J() == eCa_32.I) {
            int f22;
            int n2 = f22 = iBlockState.J(BlockSlab.HALF) == BlockSlab$EnumBlockHalf.TOP ? vRa.d : uSa.E;
            if ((c2 == DZ.UP && f22 == 0 || c2 == DZ.DOWN && f22 != 0) && object == iBlockState.J(iProperty)) {
                return vRa.d != 0;
            }
        }
        if ((f22 = e2.J(d2 = d2.offset((DZ)c2))).J() == eCa_32.I && object == f22.J(iProperty)) {
            return vRa.d != 0;
        }
        return super.J((Gg)e2, (XF)var6_8, (DZ)c2, (Sx)b2, (Mda)a2);
    }

    public int J(int n2) {
        int b2 = n2;
        eCa_3 a2 = this;
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(Mda mda2, Gg gg2, XF xF2, Object object) {
        IBlockState a2;
        void c2;
        Object e2 = xF2;
        eCa_3 b2 = this;
        IBlockState iBlockState = c2.J((XF)((Object)e2));
        if (iBlockState.J() == b2.I && (iBlockState = iBlockState.J(b2.I.J())) == a2) {
            a2 = b2.A.J().J(b2.I.J(), iBlockState);
            void v0 = c2;
            if (v0.l(b2.A.J((Gg)v0, (XF)((Object)e2), a2)) && c2.J((XF)((Object)e2), a2, yRa.d)) {
                c2.J((double)((float)e2.getX() + MQa.L), (double)((float)e2.getY() + MQa.L), (double)((float)e2.getZ() + MQa.L), b2.A.stepSound.f(), (b2.A.stepSound.f() + pqa.r) / kta.v, b2.A.stepSound.J() * xSa.la);
                d.E -= vRa.d;
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public String C(Mda mda2) {
        eCa_3 b2 = mda2;
        eCa_3 a2 = this;
        return a2.I.J(b2.J());
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
        eCa_3 eCa_32 = xF3;
        XF xF3 = xF2;
        eCa_3 e2 = eCa_32;
        if (h2.E == 0) {
            return uSa.E != 0;
        }
        if (!g2.J(i2.offset((DZ)d2), (DZ)d2, (Mda)h2)) {
            return uSa.E != 0;
        }
        Object object = e2.I.J((Mda)h2);
        IBlockState iBlockState = f5.J(i2);
        if (iBlockState.J() == e2.I) {
            IProperty<?> iProperty = e2.I.J();
            IBlockState iBlockState2 = iBlockState;
            iBlockState = iBlockState2.J(iProperty);
            BlockSlab$EnumBlockHalf blockSlab$EnumBlockHalf = iBlockState2.J(BlockSlab.HALF);
            if ((d2 == DZ.UP && blockSlab$EnumBlockHalf == BlockSlab$EnumBlockHalf.BOTTOM || d2 == DZ.DOWN && blockSlab$EnumBlockHalf == BlockSlab$EnumBlockHalf.TOP) && iBlockState == object) {
                iBlockState = e2.A.J().J(iProperty, iBlockState);
                void v2 = f5;
                if (v2.l(e2.A.J((Gg)v2, i2, iBlockState)) && f5.J(i2, iBlockState, yRa.d)) {
                    f5.J((double)((float)i2.getX() + MQa.L), (double)((float)i2.getY() + MQa.L), (double)((float)i2.getZ() + MQa.L), e2.A.stepSound.f(), (e2.A.stepSound.f() + pqa.r) / kta.v, e2.A.stepSound.J() * xSa.la);
                    h2.E -= vRa.d;
                }
                return vRa.d != 0;
            }
        }
        if (e2.J((Mda)h2, (Gg)f5, i2.offset((DZ)d2), object)) {
            return vRa.d != 0;
        }
        return super.J((Mda)h2, (Sx)g2, (Gg)f5, i2, (DZ)d2, (float)c2, (float)b2, (float)a2);
    }

    /*
     * WARNING - void declaration
     */
    public eCa_3(Block block, BlockSlab blockSlab, BlockSlab blockSlab2) {
        void b2;
        void c2;
        Object d2 = blockSlab2;
        eCa_3 a2 = this;
        super((Block)c2);
        a2.I = b2;
        a2.A = d2;
        a2.f(uSa.E);
        a2.J(vRa.d != 0);
    }
}

