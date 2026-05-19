/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Wsa
 *  lC
 *  vRa
 */
public final class Uc
extends lC {
    public static final String[] A;
    public static final String[] I;

    public String C() {
        Uc a2;
        if (a2.J()) {
            return Kg.C();
        }
        if (a2.f()) {
            return Kg.l();
        }
        if (a2.l()) {
            return Kg.f();
        }
        return super.C();
    }

    public boolean l() {
        Uc a2;
        if (a2.J() == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean f() {
        Uc a2;
        if (a2.J() == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean J() {
        Uc a2;
        if (a2.J() == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    static {
        String[] stringArray = new String[yRa.d];
        stringArray[uSa.E] = BQa.la;
        stringArray[vRa.d] = oQa.l;
        stringArray[uqa.g] = MRa.E;
        A = stringArray;
        String[] stringArray2 = new String[yRa.d];
        stringArray2[uSa.E] = xqa.A;
        stringArray2[vRa.d] = APa.fa;
        stringArray2[uqa.g] = Wsa.fa;
        I = stringArray2;
    }

    /*
     * WARNING - void declaration
     */
    public Uc(String string, String string2, int n2) {
        void b2;
        void c2;
        int d2 = n2;
        Uc a2 = this;
        super((String)c2, A, (String)b2, I, d2);
    }
}

