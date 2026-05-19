/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  Lfa
 *  Lra
 *  Mda
 *  NCa
 *  NTa
 *  Tfa
 *  Waa
 *  Wsa
 *  Yfa
 *  Ypa
 *  bb
 *  eAa
 *  fpa
 *  pPa
 *  pua
 *  vRa
 */
import net.minecraft.block.BlockDispenser;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class VEa_2
extends eAa {
    private final Tfa i;
    public final int M;
    public final int k;
    public final int j;
    private static final bb J;
    public static final String[] A;
    private static final int[] I;

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Mda mda3) {
        void b2;
        VEa_2 c2 = mda3;
        VEa_2 a2 = this;
        if (a2.i.getRepairItem() == c2.J()) {
            return vRa.d != 0;
        }
        return super.J((Mda)b2, (Mda)c2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Mda mda2, int n2) {
        void a2;
        Waa b2;
        VEa_2 vEa_2 = this;
        if (vEa_2.i != Tfa.LEATHER) {
            throw new UnsupportedOperationException(LPa.C);
        }
        VEa_2 c2 = b2.J();
        if (c2 == null) {
            c2 = new Waa();
            b2.J((Waa)c2);
        }
        VEa_2 vEa_22 = c2;
        b2 = vEa_22.J(Jpa.q);
        if (!vEa_22.J(Jpa.q, NTa.C)) {
            c2.J(Jpa.q, (NCa)b2);
        }
        b2.J(Zra.L, (int)a2);
    }

    /*
     * WARNING - void declaration
     */
    public VEa_2(Tfa tfa, int n2, int n3) {
        void b2;
        void c2;
        VEa_2 a2;
        int d2 = n3;
        VEa_2 vEa_2 = a2 = this;
        a2.i = c2;
        vEa_2.j = d2;
        vEa_2.k = b2;
        a2.M = c2.getDamageReductionAmount(d2);
        a2.f(c2.getDurability(d2));
        a2.i = (Tfa)vRa.d;
        a2.J(yGa.m);
        BlockDispenser.dispenseBehaviorRegistry.J(a2, J);
    }

    /*
     * WARNING - void declaration
     */
    public int J(Mda mda2, int n2) {
        void a2;
        VEa_2 c22 = mda2;
        VEa_2 b2 = this;
        if (a2 > 0) {
            return Wsa.K;
        }
        int c22 = b2.f((Mda)c22);
        if (c22 < 0) {
            c22 = Wsa.K;
        }
        return c22;
    }

    public int J() {
        VEa_2 a2;
        return a2.i.getEnchantability();
    }

    public void J(Mda mda2) {
        VEa_2 b2 = mda2;
        VEa_2 a2 = this;
        if (a2.i == Tfa.LEATHER && (b2 = b2.J()) != null && (b2 = b2.J(Jpa.q)).J(Zra.L)) {
            b2.J(Zra.L);
        }
    }

    public int f(Mda mda2) {
        VEa_2 b2 = mda2;
        VEa_2 a2 = this;
        if (a2.i != Tfa.LEATHER) {
            return pua.o;
        }
        if ((b2 = b2.J()) != null && (b2 = b2.J(Jpa.q)) != null && b2.J(Zra.L, yRa.d)) {
            return b2.J(Zra.L);
        }
        return fpa.D;
    }

    static {
        int[] nArray = new int[AQa.P];
        nArray[uSa.E] = pPa.f;
        nArray[vRa.d] = ERa.C;
        nArray[uqa.g] = Ypa.A;
        nArray[yRa.d] = uua.s;
        I = nArray;
        String[] stringArray = new String[AQa.P];
        stringArray[uSa.E] = Lra.h;
        stringArray[vRa.d] = Tqa.q;
        stringArray[uqa.g] = vua.c;
        stringArray[yRa.d] = zpa.Aa;
        A = stringArray;
        J = new Lfa();
    }

    public boolean C(Mda mda2) {
        VEa_2 b2 = mda2;
        VEa_2 a2 = this;
        if (a2.i != Tfa.LEATHER) {
            return uSa.E != 0;
        }
        if (!b2.M()) {
            return uSa.E != 0;
        }
        if (!b2.J().J(Jpa.q, NTa.C)) {
            return uSa.E != 0;
        }
        return b2.J().J(Jpa.q).J(Zra.L, yRa.d);
    }

    public Tfa J() {
        VEa_2 a2;
        return a2.i;
    }

    public static /* synthetic */ int[] J() {
        return I;
    }

    /*
     * Enabled aggressive block sorting
     */
    public uEa J() {
        VEa_2 a2;
        switch (a2.j) {
            case 0: {
                return uEa.HEAD;
            }
            case 1: {
                return uEa.CHEST;
            }
            case 2: {
                return uEa.LEGS;
            }
            case 3: {
                return uEa.FEET;
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(Mda mda2, Gg gg2, Sx sx2) {
        void a2;
        VEa_2 d2 = mda2;
        VEa_2 c2 = this;
        int b2 = Yfa.J((Mda)d2) - vRa.d;
        if (a2.J(b2) == null) {
            a2.f(b2, d2.J());
            ((Mda)d2).E = uSa.E;
        }
        return d2;
    }
}

