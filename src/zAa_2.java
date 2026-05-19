/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aAa
 *  asa
 *  pua
 *  ura
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class zAa_2 {
    private aAa[] A = new aAa[ura.V];
    private int I;

    public void J() {
        a.I = uSa.E;
    }

    public boolean J() {
        zAa_2 a2;
        if (a2.I == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public aAa J() {
        zAa_2 zAa_22;
        zAa_2 zAa_23 = zAa_22 = this;
        zAa_2 a2 = zAa_23.A[uSa.E];
        zAa_23.A[uSa.E] = zAa_22.A[zAa_22.I -= vRa.d];
        zAa_2 zAa_24 = zAa_22;
        zAa_22.A[zAa_24.I] = null;
        if (zAa_24.I > 0) {
            zAa_22.J(uSa.E);
        }
        ((aAa)a2).i = pua.o;
        return a2;
    }

    public zAa_2() {
        zAa_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(aAa aAa2, float f2) {
        void a2;
        zAa_2 c2 = aAa2;
        zAa_2 b2 = this;
        float f3 = ((aAa)c2).m;
        ((aAa)c2).m = a2;
        if (a2 < f3) {
            b2.f(((aAa)c2).i);
            return;
        }
        b2.J(((aAa)c2).i);
    }

    public aAa J(aAa aAa2) {
        zAa_2 b2 = aAa2;
        zAa_2 a2 = this;
        if (((aAa)b2).i >= 0) {
            throw new IllegalStateException(asa.m);
        }
        zAa_2 zAa_22 = a2;
        if (zAa_22.I == zAa_22.A.length) {
            aAa[] aAaArray = new aAa[a2.I << vRa.d];
            System.arraycopy(a2.A, uSa.E, aAaArray, uSa.E, a2.I);
            a2.A = aAaArray;
        }
        zAa_2 zAa_23 = a2;
        zAa_23.A[a2.I] = b2;
        ((aAa)b2).i = zAa_23.I;
        int n2 = zAa_23.I;
        zAa_23.I = n2 + vRa.d;
        a2.f(n2);
        return b2;
    }

    private void f(int n2) {
        aAa aAa2;
        int b2;
        block2: {
            zAa_2 zAa_22;
            b2 = n2;
            zAa_2 a2 = this;
            aAa2 = a2.A[b2];
            float f2 = aAa2.m;
            int n3 = b2;
            while (n3 > 0) {
                int n4 = b2 - vRa.d >> vRa.d;
                aAa aAa3 = a2.A[n4];
                if (f2 >= aAa3.m) {
                    zAa_22 = a2;
                    break block2;
                }
                a2.A[b2] = aAa3;
                aAa3.i = b2;
                n3 = n4;
            }
            zAa_22 = a2;
        }
        zAa_22.A[b2] = aAa2;
        aAa2.i = b2;
    }

    private void J(int n2) {
        int b2 = n2;
        zAa_2 a2 = this;
        aAa aAa2 = a2.A[b2];
        float f2 = aAa2.m;
        while (true) {
            float f3;
            float f4;
            aAa aAa3;
            zAa_2 zAa_22;
            int n3 = vRa.d + (b2 << vRa.d);
            int n4 = n3 + vRa.d;
            if (n3 >= a2.I) {
                zAa_22 = a2;
                break;
            }
            aAa aAa4 = a2.A[n3];
            float f5 = aAa4.m;
            if (n4 >= a2.I) {
                aAa3 = null;
                f4 = Gta.o;
                f3 = f5;
            } else {
                aAa3 = a2.A[n4];
                f4 = aAa3.m;
                f3 = f5;
            }
            if (f3 < f4) {
                if (f5 >= f2) {
                    zAa_22 = a2;
                    break;
                }
                a2.A[b2] = aAa4;
                aAa4.i = b2;
                b2 = n3;
                continue;
            }
            if (f4 >= f2) {
                zAa_22 = a2;
                break;
            }
            a2.A[b2] = aAa3;
            aAa3.i = b2;
            b2 = n4;
        }
        zAa_22.A[b2] = aAa2;
        aAa2.i = b2;
    }
}

