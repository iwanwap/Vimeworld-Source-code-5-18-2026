/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ANa
 *  Kpa
 *  Xsa
 */
public final class pv_1 {
    private static String I;

    public pv_1() {
        pv_1 a2;
    }

    public static boolean J() {
        String string;
        ANa aNa2 = Kpa.J().c;
        if ((aNa2 == null || (string = aNa2.D()) == null) && (string = I) == null) {
            return uSa.E != 0;
        }
        I = string;
        return I.endsWith(Xsa.j);
    }
}

