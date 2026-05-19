/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  k
 *  vRa
 */
public final class vI_3 {
    public final String A;
    public final k I;

    public int hashCode() {
        vI_3 a2;
        return a2.I.hashCode() + a2.A.hashCode();
    }

    /*
     * WARNING - void declaration
     */
    public vI_3(k k2, String string) {
        void b2;
        vI_3 a2;
        String c2 = string;
        vI_3 vI_32 = a2 = this;
        vI_32.I = b2;
        vI_32.A = c2;
    }

    public boolean equals(Object object) {
        Object b2 = object;
        vI_3 a2 = this;
        if (b2 instanceof vI_3 && ((vI_3)b2).I == a2.I && ((vI_3)b2).A.equals(a2.A)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

