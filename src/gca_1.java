/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  vRa
 */
import net.minecraft.block.Block;

public final class gca_1
extends YCa {
    private Block A;
    private Block I;

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Sx sx2, Gg gg2, XF xF, DZ dZ2, float f2, float f3, float f4) {
        void f5;
        void h;
        XF i2;
        void g;
        void d2;
        gca_1 gca_12 = xF2;
        XF xF2 = xF;
        gca_1 e2 = gca_12;
        if (d2 != DZ.UP) {
            return uSa.E != 0;
        }
        if (!g.J(i2.offset((DZ)d2), (DZ)d2, (Mda)h)) {
            return uSa.E != 0;
        }
        if (f5.J(i2).J() == e2.A && f5.J(i2.up())) {
            f5.J(i2.up(), e2.I.J());
            h.E -= vRa.d;
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public gca_1(int n2, float f2, Block block, Block block2) {
        Object e2;
        void b2;
        void c2;
        void d2;
        gca_1 a2;
        gca_1 gca_12 = object;
        Object object = block2;
        gca_1 gca_13 = a2 = gca_12;
        super((int)d2, (float)c2, uSa.E != 0);
        gca_13.I = b2;
        gca_13.A = e2;
    }
}

