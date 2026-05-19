/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Jy
 *  vRa
 */
import net.minecraft.block.state.BlockStateBase;

public final class Nf {
    /*
     * WARNING - void declaration
     */
    public static boolean J(int n2, ze[] zeArray) {
        int b2;
        void a2;
        int n3 = n2;
        if (a2 == null) {
            return vRa.d != 0;
        }
        int n4 = b2 = uSa.E;
        while (n4 < ((void)a2).length) {
            if (a2[b2].J() == n3) {
                return vRa.d != 0;
            }
            n4 = ++b2;
        }
        return uSa.E != 0;
    }

    public Nf() {
        Nf a2;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(int n2, int[] nArray) {
        int b2;
        void a2;
        int n3 = n2;
        if (a2 == null) {
            return vRa.d != 0;
        }
        int n4 = b2 = uSa.E;
        while (n4 < ((void)a2).length) {
            if (a2[b2] == n3) {
                return vRa.d != 0;
            }
            n4 = ++b2;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(int n2, int n3, ze[] zeArray) {
        int c2;
        void a2;
        int n4 = n2;
        if (a2 == null) {
            return vRa.d != 0;
        }
        int n5 = c2 = uSa.E;
        while (n5 < ((void)a2).length) {
            void b2;
            if (a2[c2].J(n4, (int)b2)) {
                return vRa.d != 0;
            }
            n5 = ++c2;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(KLa kLa2, KLa[] kLaArray) {
        int b2;
        void a2;
        KLa kLa3 = kLa2;
        if (a2 == null) {
            return vRa.d != 0;
        }
        int n2 = b2 = uSa.E;
        while (n2 < ((void)a2).length) {
            if (a2[b2] == kLa3) {
                return vRa.d != 0;
            }
            n2 = ++b2;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(BlockStateBase blockStateBase, ze[] zeArray) {
        int b2;
        void a2;
        BlockStateBase blockStateBase2 = blockStateBase;
        if (a2 == null) {
            return vRa.d != 0;
        }
        int n2 = b2 = uSa.E;
        while (n2 < ((void)a2).length) {
            if (a2[b2].J(blockStateBase2)) {
                return vRa.d != 0;
            }
            n2 = ++b2;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(Jy jy, Jy[] jyArray) {
        int b2;
        void a2;
        Jy jy2 = jy;
        if (a2 == null) {
            return vRa.d != 0;
        }
        int n2 = b2 = uSa.E;
        while (n2 < ((void)a2).length) {
            if (a2[b2] == jy2) {
                return vRa.d != 0;
            }
            n2 = ++b2;
        }
        return uSa.E != 0;
    }
}

