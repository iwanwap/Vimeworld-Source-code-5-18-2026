/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JQa
 *  TPa
 *  Wsa
 *  lC
 *  vRa
 *  wOa
 */
import optifine.Config;

public final class qb_1
extends lC {
    public static final String[] A;
    public static final String[] I;

    public boolean C() {
        qb_1 a2;
        if (a2.J() == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean l() {
        qb_1 a2;
        if (a2.J() == yRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public qb_1(String string, String string2, int n2) {
        void b2;
        void c2;
        int d2 = n2;
        qb_1 a2 = this;
        super((String)c2, A, (String)b2, I, d2);
    }

    public boolean J(String string) {
        Object b2 = string;
        qb_1 a2 = this;
        if (Config.equals(b2, TPa.n)) {
            b2 = kra.Ea;
        }
        return super.J((String)b2);
    }

    static {
        String[] stringArray = new String[AQa.P];
        stringArray[uSa.E] = BQa.la;
        stringArray[vRa.d] = wOa.m;
        stringArray[uqa.g] = JQa.n;
        stringArray[yRa.d] = kra.Ea;
        A = stringArray;
        String[] stringArray2 = new String[AQa.P];
        stringArray2[uSa.E] = xqa.A;
        stringArray2[vRa.d] = zpa.fa;
        stringArray2[uqa.g] = rQa.q;
        stringArray2[yRa.d] = Wsa.fa;
        I = stringArray2;
    }

    public boolean f() {
        qb_1 a2;
        if (a2.J() == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean J() {
        qb_1 a2;
        if (a2.J() == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

