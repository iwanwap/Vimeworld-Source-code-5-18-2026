/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  RB
 *  lB
 *  vRa
 */
import optifine.Config;

public final class tc {
    /*
     * WARNING - void declaration
     */
    public static lB J(lB[] lBArray, RB[] rBArray, boolean bl) {
        int c2;
        lB[] lBArray2 = lBArray;
        if (lBArray2 == null) {
            return null;
        }
        int n2 = c2 = uSa.E;
        while (n2 < lBArray2.length) {
            void a2;
            void b2;
            lB lB2 = lBArray2[c2];
            if (tc.J(lB2, (RB[])b2, (boolean)a2)) {
                return lB2;
            }
            n2 = ++c2;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static RB J(String string, RB[] rBArray) {
        int b2;
        void a2;
        String string2 = string;
        if (a2 == null) {
            return null;
        }
        int n2 = b2 = uSa.E;
        while (n2 < ((void)a2).length) {
            void var3_4 = a2[b2];
            if (var3_4.e().equals(string2)) {
                return var3_4;
            }
            n2 = ++b2;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(lB lB2, RB[] rBArray, boolean bl) {
        int n2;
        void b2;
        lB lB3 = lB2;
        if (lB3 == null) {
            return uSa.E != 0;
        }
        if (b2 == null) {
            return uSa.E != 0;
        }
        String[] stringArray = lB3.J();
        int n3 = n2 = uSa.E;
        while (n3 < stringArray.length) {
            Object c2 = stringArray[n2];
            Object object = tc.J((String)c2, (RB[])b2);
            if (object != null) {
                void a2;
                RB rB2 = object;
                object = a2 != false ? rB2.J() : rB2.d();
                if (!Config.equals(object, c2 = lB3.J((String)c2))) {
                    return uSa.E != 0;
                }
            }
            n3 = ++n2;
        }
        return vRa.d != 0;
    }

    public tc() {
        tc a2;
    }
}

