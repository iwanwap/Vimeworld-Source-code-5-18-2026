/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
public final class QV_1 {
    public String A;
    public int I;

    public int hashCode() {
        QV_1 a2;
        return a2.A.hashCode() + a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public QV_1(String string, int n2) {
        void b2;
        QV_1 a2;
        int c2 = n2;
        QV_1 qV_1 = a2 = this;
        qV_1.A = b2;
        qV_1.I = c2;
    }

    public boolean equals(Object object) {
        Object b2 = object;
        QV_1 a2 = this;
        if (!(b2 instanceof QV_1)) {
            return uSa.E != 0;
        }
        b2 = (QV_1)b2;
        if (((QV_1)b2).I == a2.I && ((QV_1)b2).A.equals(a2.A)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

