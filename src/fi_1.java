/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Qqa
 *  cRa
 *  fi
 *  hra
 *  kta
 *  uOa
 */
public final class fi_1
implements b {
    private final float A;
    private static final fi[] I;

    public fi_1(float f2) {
        float b2 = f2;
        fi_1 a2 = this;
        a2.A = b2;
    }

    public static fi J(float a2) {
        if (a2 >= Pua.P && a2 <= uOa.H && a2 * kta.v == (float)((int)(a2 * kta.v))) {
            return I[(int)(a2 * kta.v + gua.R)];
        }
        return new fi_1(a2);
    }

    static {
        int n2;
        I = new fi_1[hra.Ja];
        int n3 = n2 = Qqa.D;
        while (n3 <= cRa.h) {
            int n4 = n2 + cRa.h;
            fi_1 fi_12 = new fi_1((float)n2 / kta.v);
            fi_1.I[n4] = fi_12;
            n3 = ++n2;
        }
    }

    @Override
    public float J() {
        fi_1 a2;
        return a2.A;
    }
}

