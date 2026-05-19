/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aSa
 *  fSa
 *  vRa
 */
public final class rTa_2
extends fSa {
    public double x;
    public double y;
    public double z;

    public rTa_2(fSa fSa2) {
        rTa_2 b2 = fSa2;
        rTa_2 a2 = this;
        super((fSa)b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, double d2) {
        void a2;
        int c2 = n2;
        rTa_2 b2 = this;
        if (c2 == 0) {
            b2.x = a2;
        }
        if (c2 == vRa.d) {
            b2.y = a2;
        }
        if (c2 == uqa.g) {
            b2.z = a2;
        }
    }

    public rTa_2(double c2, double b2, double a2) {
        rTa_2 d2;
        rTa_2 rTa_22 = d2;
        d2.x = c2;
        rTa_22.y = b2;
        rTa_22.z = a2;
    }

    public double J(int n2) {
        int b2 = n2;
        rTa_2 a2 = this;
        if (b2 == 0) {
            return a2.x;
        }
        if (b2 == vRa.d) {
            return a2.y;
        }
        if (b2 == uqa.g) {
            return a2.z;
        }
        return aSa.V;
    }

    public int J() {
        return yRa.d;
    }
}

