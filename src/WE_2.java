/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EQa
 *  vRa
 */
public final class WE_2 {
    private int A;
    private int I;

    /*
     * WARNING - void declaration
     */
    public WE_2(int n2, int n3) {
        void b2;
        WE_2 a2;
        int c2 = n3;
        WE_2 wE_2 = a2 = this;
        wE_2.I = Math.min((int)b2, c2);
        wE_2.A = Math.max((int)b2, c2);
    }

    public String toString() {
        WE_2 a2;
        return new StringBuilder().insert(3 & 4, EQa.t).append(a2.I).append(ATa.Da).append(a2.A).toString();
    }

    public boolean J(int n2) {
        int b2 = n2;
        WE_2 a2 = this;
        if (b2 < a2.I) {
            return uSa.E != 0;
        }
        if (b2 <= a2.A) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int f() {
        WE_2 a2;
        return a2.I;
    }

    public int J() {
        WE_2 a2;
        return a2.A;
    }
}

