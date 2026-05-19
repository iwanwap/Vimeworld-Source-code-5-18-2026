/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  LJa
 *  Lja
 *  Yka
 *  Yra
 *  pqa
 *  vRa
 */
import java.util.Arrays;

public final class eKa
extends Yka {
    private static final String A = "CL_00002492";
    private final KLa I;

    /*
     * WARNING - void declaration
     */
    public eKa(Yka yka, KLa kLa2) {
        void a2;
        eKa c2 = yka;
        eKa b2 = this;
        super(Arrays.copyOf(c2.J(), c2.J().length), c2.M, LJa.J((int[])c2.J()));
        b2.I = a2;
        b2.J();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void J(int n2) {
        int a2;
        eKa eKa2 = this;
        a2 = eKa2.j.length / AQa.P * a2;
        eKa eKa3 = eKa2;
        float f2 = Float.intBitsToFloat(eKa3.j[a2]);
        float f3 = Float.intBitsToFloat(eKa3.j[a2 + vRa.d]);
        float f4 = Float.intBitsToFloat(eKa3.j[a2 + uqa.g]);
        float b2 = JPa.N;
        float f5 = JPa.N;
        switch (Lja.I[eKa2.k.ordinal()]) {
            case 1: {
                b2 = f2 * Yra.i;
                f5 = (pqa.r - f4) * Yra.i;
                eKa eKa4 = eKa2;
                break;
            }
            case 2: {
                b2 = f2 * Yra.i;
                f5 = f4 * Yra.i;
                eKa eKa4 = eKa2;
                break;
            }
            case 3: {
                b2 = (pqa.r - f2) * Yra.i;
                f5 = (pqa.r - f3) * Yra.i;
                eKa eKa4 = eKa2;
                break;
            }
            case 4: {
                b2 = f2 * Yra.i;
                f5 = (pqa.r - f3) * Yra.i;
                eKa eKa4 = eKa2;
                break;
            }
            case 5: {
                b2 = f4 * Yra.i;
                f5 = (pqa.r - f3) * Yra.i;
                eKa eKa4 = eKa2;
                break;
            }
            case 6: {
                b2 = (pqa.r - f4) * Yra.i;
                f5 = (pqa.r - f3) * Yra.i;
            }
            default: {
                eKa eKa4 = eKa2;
            }
        }
        eKa4.j[a2 + AQa.P] = Float.floatToRawIntBits(eKa2.I.J((double)b2));
        eKa2.j[a2 + AQa.P + vRa.d] = Float.floatToRawIntBits(eKa2.I.f((double)f5));
    }

    private void J() {
        int a2;
        eKa eKa2 = this;
        int n2 = a2 = uSa.E;
        while (n2 < AQa.P) {
            eKa2.J(a2++);
            n2 = a2;
        }
    }
}

