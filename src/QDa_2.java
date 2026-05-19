/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  I
 *  Mda
 *  Oz
 *  QFa
 *  YSa
 *  eAa
 *  vRa
 */
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockBed$EnumPartType;
import net.minecraft.block.state.IBlockState;

public final class QDa_2
extends eAa {
    public QDa_2() {
        QDa_2 a2;
        QDa_2 qDa_2 = a2;
        qDa_2.J(yGa.a);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Sx sx2, Gg gg2, XF xF, DZ dZ2, float f2, float f3, float f4) {
        void h2;
        void g222;
        XF e2;
        void d22;
        QDa_2 i2 = gg2;
        QDa_2 f5 = this;
        if (((Gg)i2).e) {
            return vRa.d != 0;
        }
        if (d22 != DZ.UP) {
            return uSa.E != 0;
        }
        boolean c2 = i2.J(e2).J().f((Gg)i2, e2);
        if (!c2) {
            e2 = e2.up();
        }
        void v0 = g222;
        DZ b2 = DZ.getHorizontal(Oz.f((double)((double)(v0.X * YSa.G / CRa.ja) + kTa.B)) & yRa.d);
        XF xF2 = e2;
        XF a2 = xF2.offset(b2);
        if (v0.J(xF2, (DZ)d22, (Mda)h2) && g222.J(a2, (DZ)d22, (Mda)h2)) {
            int g222 = i2.J(a2).J().f((Gg)i2, a2);
            int d22 = c2 || i2.J(e2) ? vRa.d : uSa.E;
            int n2 = g222 = g222 != 0 || i2.J(a2) ? vRa.d : uSa.E;
            if (d22 != 0 && g222 != 0 && Gg.J((I)i2, (XF)e2.down()) && Gg.J((I)i2, (XF)a2.down())) {
                IBlockState g222 = QFa.Pd.J().J(BlockBed.OCCUPIED, uSa.E != 0).J(BlockBed.FACING, b2).J(BlockBed.PART, BlockBed$EnumPartType.FOOT);
                if (i2.J(e2, g222, yRa.d)) {
                    g222 = g222.J(BlockBed.PART, BlockBed$EnumPartType.HEAD);
                    i2.J(a2, g222, yRa.d);
                }
                h2.E -= vRa.d;
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }
}

