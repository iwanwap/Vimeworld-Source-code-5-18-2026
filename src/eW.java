/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  QFa
 *  Uw
 *  Xv
 *  fV
 *  iea
 *  pua
 *  vRa
 */
import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockTorch;

public final class eW
extends fV {
    /*
     * WARNING - void declaration
     */
    public static Xv J(Uw uw2, List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2) {
        void f2;
        void a2;
        void b2;
        void c2;
        void d2;
        Object g = random;
        Uw e2 = uw2;
        g = Xv.J((int)d2, (int)c2, (int)b2, (int)uSa.E, (int)uSa.E, (int)uSa.E, (int)yRa.d, (int)AQa.P, (int)uqa.g, (DZ)a2);
        if (uU.J((List<uU>)f2, (Xv)g) != null) {
            return null;
        }
        return g;
    }

    public eW() {
        eW a2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, Xv xv) {
        void c2;
        eW d2 = xv;
        eW a2 = this;
        if (a2.field_143015_k < 0) {
            eW eW2 = a2;
            eW2.field_143015_k = eW2.J((Gg)c2, (Xv)d2);
            if (eW2.field_143015_k < 0) {
                return vRa.d != 0;
            }
            eW eW3 = a2;
            a2.boundingBox.J(uSa.E, eW3.field_143015_k - eW3.boundingBox.maxY + AQa.P - vRa.d, uSa.E);
        }
        eW eW4 = a2;
        void v3 = c2;
        eW eW5 = a2;
        eW5.J((Gg)c2, (Xv)d2, uSa.E, uSa.E, uSa.E, uqa.g, yRa.d, vRa.d, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        eW5.f((Gg)c2, QFa.U.J(), vRa.d, uSa.E, uSa.E, (Xv)d2);
        a2.f((Gg)v3, QFa.U.J(), vRa.d, vRa.d, uSa.E, (Xv)d2);
        eW4.f((Gg)v3, QFa.U.J(), vRa.d, uqa.g, uSa.E, (Xv)d2);
        eW4.f((Gg)c2, QFa.cd.J(iea.WHITE.getDyeDamage()), vRa.d, yRa.d, uSa.E, (Xv)d2);
        int b2 = a2.coordBaseMode == DZ.EAST || a2.coordBaseMode == DZ.NORTH ? vRa.d : uSa.E;
        a2.f((Gg)c2, QFa.FB.J().J(BlockTorch.FACING, a2.coordBaseMode.rotateY()), b2 != 0 ? uqa.g : uSa.E, yRa.d, uSa.E, (Xv)d2);
        eW eW6 = a2;
        eW6.f((Gg)c2, QFa.FB.J().J(BlockTorch.FACING, a2.coordBaseMode), vRa.d, yRa.d, vRa.d, (Xv)d2);
        eW6.f((Gg)c2, QFa.FB.J().J(BlockTorch.FACING, a2.coordBaseMode.rotateYCCW()), b2 != 0 ? uSa.E : uqa.g, yRa.d, uSa.E, (Xv)d2);
        a2.f((Gg)c2, QFa.FB.J().J(BlockTorch.FACING, a2.coordBaseMode.getOpposite()), vRa.d, yRa.d, pua.o, (Xv)d2);
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public eW(Uw uw2, int n2, Random random, Xv xv, DZ dZ2) {
        void b2;
        Object f2;
        void d2;
        void e2;
        eW a2;
        eW eW2 = object;
        Object object = dZ2;
        eW eW3 = a2 = eW2;
        super((Uw)e2, (int)d2);
        eW3.coordBaseMode = f2;
        eW3.boundingBox = b2;
    }
}

