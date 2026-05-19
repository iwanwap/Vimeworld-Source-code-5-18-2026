/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Eka
 *  QFa
 *  SZ
 *  Yea
 *  rKa
 */
import net.minecraft.block.state.IBlockState;

public final class dLa_1
extends rKa<rEa> {
    public dLa_1(oLa oLa2) {
        Object b2 = oLa2;
        dLa_1 a2 = this;
        super((oLa)b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(rEa rEa2, float f2, IBlockState iBlockState) {
        void a2;
        void b2;
        rEa d2 = rEa2;
        dLa_1 c2 = this;
        super.J((Yea)d2, (float)b2, (IBlockState)a2);
        if (a2.J() == QFa.P) {
            Eka.J((SZ)d2.J(), (double)d2.la, (double)d2.Z, (double)d2.A, (float)b2);
        }
    }
}

