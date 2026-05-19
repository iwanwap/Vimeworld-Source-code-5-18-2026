/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  UI
 *  vRa
 */
public final class uG_2 {
    public UI A;
    public String I;

    public int hashCode() {
        uG_2 uG_22 = this;
        int a2 = uG_22.I.hashCode();
        a2 = tua.U * a2 + uG_22.A.hashCode();
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public uG_2(String string, UI uI2) {
        void b2;
        uG_2 a2;
        uG_2 c2 = uI2;
        uG_2 uG_22 = a2 = this;
        uG_22.I = b2;
        uG_22.A = c2;
    }

    public boolean equals(Object object) {
        Object b2 = object;
        uG_2 a2 = this;
        if (b2 instanceof uG_2) {
            b2 = (uG_2)b2;
            if (a2.I.equals(((uG_2)b2).I) && a2.A == ((uG_2)b2).A) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }
}

