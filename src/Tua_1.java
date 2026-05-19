/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aSa
 *  fSa
 *  vRa
 */
public final class Tua_1
extends fSa {
    public double x;
    public double y;

    public double J(int n2) {
        int b2 = n2;
        Tua_1 a2 = this;
        if (b2 == 0) {
            return a2.x;
        }
        if (b2 == vRa.d) {
            return a2.y;
        }
        return aSa.V;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, double d2) {
        void a2;
        int c2 = n2;
        Tua_1 b2 = this;
        if (c2 == 0) {
            b2.x = a2;
        }
        if (c2 == vRa.d) {
            b2.y = a2;
        }
    }

    public int J() {
        return uqa.g;
    }

    public Tua_1(fSa fSa2) {
        Tua_1 b2 = fSa2;
        Tua_1 a2 = this;
        super((fSa)b2);
    }

    public Tua_1(double b2, double a2) {
        Tua_1 c2;
        Tua_1 tua_1 = c2;
        tua_1.x = b2;
        tua_1.y = a2;
    }
}

