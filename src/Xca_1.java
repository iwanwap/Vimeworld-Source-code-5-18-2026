/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  eAa
 *  vRa
 */
import net.minecraft.block.Block;

public final class Xca_1
extends eAa {
    private Block A;
    private Block I;

    /*
     * WARNING - void declaration
     */
    public Xca_1(Block block, Block block2) {
        void b2;
        Object c2 = block2;
        Xca_1 a2 = this;
        a2.I = b2;
        a2.A = c2;
        a2.J(yGa.E);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Sx sx2, Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4) {
        void f5;
        void h2;
        XF i2;
        void g2;
        void d2;
        Xca_1 xca_1 = xF3;
        XF xF3 = xF2;
        Xca_1 e2 = xca_1;
        if (d2 != DZ.UP) {
            return uSa.E != 0;
        }
        if (!g2.J(i2.offset((DZ)d2), (DZ)d2, (Mda)h2)) {
            return uSa.E != 0;
        }
        if (f5.J(i2).J() == e2.A && f5.J(i2.up())) {
            f5.J(i2.up(), e2.I.J());
            h2.E -= vRa.d;
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

