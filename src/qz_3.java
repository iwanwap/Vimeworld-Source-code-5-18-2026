/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Tpa
 *  XSa
 *  aX
 */
public final class qz_3
implements Hd {
    public qz_3() {
        qz_3 a2;
    }

    @Override
    public String J(int n2) {
        double d2;
        int b2 = n2;
        qz_3 a2 = this;
        double d3 = (double)b2 / fqa.W;
        double d4 = d3 / Tpa.M;
        if (d2 > kTa.B) {
            return new StringBuilder().insert(2 & 5, aX.J().format(d4)).append(Ora.b).toString();
        }
        if (d3 > kTa.B) {
            return new StringBuilder().insert(3 & 4, aX.J().format(d3)).append(Cqa.g).toString();
        }
        return b2 + XSa.r;
    }
}

