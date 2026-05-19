/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  IC
 *  Tpa
 *  Usa
 *  aSa
 *  vRa
 *  yra
 */
public final class IC_3 {
    public double A;
    public double I;

    public IC C(double a2) {
        IC_3 b2;
        double d2 = a2;
        return b2.J(d2, d2);
    }

    public IC l(double a2) {
        IC_3 b2;
        double d2 = a2;
        return b2.l(d2, d2);
    }

    public IC d(IC iC2) {
        IC_3 b2 = iC2;
        IC_3 a2 = this;
        return a2.J(b2.I, b2.A);
    }

    public IC d(double b2, double a2) {
        IC_3 c2;
        IC_3 iC_3 = c2;
        iC_3.I *= b2;
        iC_3.A *= a2;
        return iC_3;
    }

    public IC C(double b2, double a2) {
        IC_3 c2;
        IC_3 iC_3 = c2;
        iC_3.I -= b2;
        iC_3.A -= a2;
        return iC_3;
    }

    public IC C(IC iC2) {
        IC_3 b2 = iC2;
        IC_3 a2 = this;
        return a2.J(b2.I, b2.A);
    }

    public IC_3(double b2, double a2) {
        IC_3 c2;
        IC_3 iC_3 = c2;
        iC_3.I = b2;
        iC_3.A = a2;
    }

    public IC f(double a2) {
        IC_3 b2;
        double d2 = a2;
        return b2.d(d2, d2);
    }

    public IC_3(String string) {
        Object b2 = string;
        IC_3 a2 = this;
        b2 = ((String)b2).replace(Tpa.E, Mqa.y);
        if (!((String)b2).contains(yra.t)) {
            return;
        }
        if (((String[])(b2 = ((String)b2).split(yra.t))).length <= vRa.d) {
            return;
        }
        b2 = b2[uSa.E];
        IC_3 iC_3 = a2;
        iC_3.I = Double.parseDouble(((String)b2).trim().replace(Usa.ja, Mqa.y));
        iC_3.A = Double.parseDouble(b2[vRa.d].trim().replace(Usa.ja, Mqa.y));
    }

    public IC_3(IC iC2) {
        IC_3 a2;
        IC_3 b2 = iC2;
        IC_3 iC_3 = a2 = this;
        iC_3.I = b2.I;
        iC_3.A = b2.A;
    }

    public IC l(double b2, double a2) {
        IC_3 c2;
        IC_3 iC_3 = c2;
        iC_3.I /= b2;
        iC_3.A /= a2;
        return iC_3;
    }

    public IC f(double b2, double a2) {
        IC_3 c2;
        c2.I = b2;
        c2.A = a2;
        return c2;
    }

    public IC J(double b2, double a2) {
        IC_3 c2;
        IC_3 iC_3 = c2;
        iC_3.I += b2;
        iC_3.A += a2;
        return iC_3;
    }

    public IC l(IC iC2) {
        IC_3 b2 = iC2;
        IC_3 a2 = this;
        return a2.f(b2.I, b2.A);
    }

    public IC J(double a2) {
        IC_3 b2;
        double d2 = a2;
        return b2.J(d2, d2);
    }

    public IC_3() {
        IC_3 a2;
        a2.I = aSa.V;
        a2.A = aSa.V;
    }

    public IC J() {
        IC_3 a2;
        return new IC_3((IC)a2);
    }

    public IC f(IC iC2) {
        IC_3 b2 = iC2;
        IC_3 a2 = this;
        return a2.d(b2.I, b2.A);
    }

    public IC J(IC iC2) {
        IC_3 b2 = iC2;
        IC_3 a2 = this;
        return a2.l(b2.I, b2.A);
    }
}

