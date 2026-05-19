/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AZ
 *  BZ
 *  Bv
 *  ERa
 *  Gg
 *  Jy
 *  MQa
 *  Rea
 *  XTa
 *  bpa
 *  pPa
 *  pqa
 *  vRa
 */
import java.util.Random;
import net.minecraft.block.BlockDoublePlant$EnumPlantType;

public final class PZ_3
extends Jy {
    private static final Bv I = new Bv(uSa.E != 0);

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Random random, XF xF2) {
        void a2;
        void c2;
        void b2;
        int n2;
        PZ_3 pZ_3 = this;
        V.J(BlockDoublePlant$EnumPlantType.GRASS);
        int n3 = n2 = uSa.E;
        while (n3 < XTa.W) {
            void v1 = b2;
            int n4 = v1.nextInt(ERa.C) + Yqa.i;
            int d2 = v1.nextInt(ERa.C) + Yqa.i;
            int n5 = v1.nextInt(c2.l(a2.add(n4, uSa.E, d2)).getY() + fPa.i);
            V.J((Gg)c2, (Random)b2, a2.add(n4, n5, d2));
            n3 = ++n2;
        }
        super.J((Gg)c2, (Random)b2, (XF)a2);
    }

    public bV J(Random random) {
        Random b2 = random;
        PZ_3 a2 = this;
        if (b2.nextInt(tTa.h) > 0) {
            return I;
        }
        return a2.J;
    }

    public Jy f(int n2) {
        int b22 = n2;
        PZ_3 a2 = this;
        BZ b22 = new BZ(b22, (Jy)a2);
        PZ_3 pZ_3 = a2;
        b22.E = (pZ_3.E + pqa.r) * MQa.L;
        b22.Ca = pZ_3.Ca * MQa.L + bpa.K;
        b22.k = a2.k * MQa.L + pPa.c;
        return b22;
    }

    public PZ_3(int n2) {
        PZ_3 a2;
        int b2 = n2;
        PZ_3 pZ_3 = a2 = this;
        super(b2);
        pZ_3.q.add(new AZ(Rea.class, vRa.d, uqa.g, uua.p));
        PZ_3 pZ_32 = a2;
        pZ_32.A.h = vRa.d;
        pZ_32.A.C = AQa.P;
        pZ_32.A.T = kTa.j;
    }
}

