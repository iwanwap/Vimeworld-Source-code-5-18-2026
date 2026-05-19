/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 *  vz
 */
public final class vz_2 {
    private byte j;
    private byte J;
    private byte A;
    private byte I;

    /*
     * WARNING - void declaration
     */
    public vz_2(byte by2, byte by3, byte by4, byte by5) {
        void e2;
        void b2;
        void c2;
        void d2;
        vz_2 a2;
        byte by6 = by5;
        vz_2 vz_22 = a2 = this;
        vz_2 vz_23 = a2;
        vz_23.A = d2;
        vz_23.J = c2;
        vz_22.j = b2;
        vz_22.I = e2;
    }

    public byte C() {
        vz_2 a2;
        return a2.J;
    }

    public int hashCode() {
        vz_2 vz_22 = this;
        int a2 = vz_22.A;
        a2 = tua.U * a2 + vz_22.J;
        a2 = tua.U * a2 + vz_22.j;
        a2 = tua.U * a2 + vz_22.I;
        return a2;
    }

    public vz_2(vz vz2) {
        vz_2 a2;
        vz_2 b2 = vz2;
        vz_2 vz_22 = a2 = this;
        vz_2 vz_23 = b2;
        a2.A = b2.A;
        a2.J = vz_23.J;
        vz_22.j = vz_23.j;
        vz_22.I = b2.I;
    }

    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (!(b2 instanceof vz_2)) {
            return uSa.E != 0;
        }
        b2 = (vz_2)b2;
        if (((vz_2)a2).A != ((vz_2)b2).A) {
            return uSa.E != 0;
        }
        if (((vz_2)a2).I != ((vz_2)b2).I) {
            return uSa.E != 0;
        }
        if (((vz_2)a2).J != ((vz_2)b2).J) {
            return uSa.E != 0;
        }
        if (((vz_2)a2).j == ((vz_2)b2).j) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public byte l() {
        vz_2 a2;
        return a2.A;
    }

    public byte f() {
        vz_2 a2;
        return a2.j;
    }

    public byte J() {
        vz_2 a2;
        return a2.I;
    }
}

