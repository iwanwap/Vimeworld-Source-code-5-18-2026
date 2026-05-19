/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EQa
 *  Sqa
 *  Ypa
 *  Zta
 *  aX
 *  vQa
 *  vRa
 */
public final class ky_3
implements Hd {
    public ky_3() {
        ky_3 a2;
    }

    @Override
    public String J(int n2) {
        StringBuilder stringBuilder;
        double d2;
        int b2 = n2;
        ky_3 a2 = this;
        double d3 = (double)b2 / vQa.c;
        double d4 = d3 / Zta.l;
        double d5 = d4 / Zta.l;
        double d6 = d5 / zOa.y;
        double d7 = d6 / EQa.q;
        if (d2 > kTa.B) {
            return new StringBuilder().insert(3 >> 2, aX.J().format(d7)).append(vRa.ga).toString();
        }
        if (d6 > kTa.B) {
            return new StringBuilder().insert(3 & 4, aX.J().format(d6)).append(STa.g).toString();
        }
        if (d5 > kTa.B) {
            return new StringBuilder().insert(2 & 5, aX.J().format(d5)).append(Ypa.Ia).toString();
        }
        if (d4 > kTa.B) {
            stringBuilder = new StringBuilder();
            return stringBuilder.insert(5 >> 3, aX.J().format(d4)).append(Cqa.g).toString();
        }
        stringBuilder = new StringBuilder();
        return stringBuilder.append(d3).append(Sqa.d).toString();
    }
}

