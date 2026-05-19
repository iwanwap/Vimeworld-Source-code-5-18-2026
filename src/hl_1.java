/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  fi
 *  hl
 */
public final class hl_1
extends kL {
    private static final b I = new fi(JPa.N);

    public hl_1(b b2) {
        b b3 = b2;
        hl_1 a2 = this;
        super(b3);
    }

    public static float J(float a2) {
        float f2;
        a2 %= CRa.ja;
        if (f2 < JPa.N) {
            return a2 + CRa.ja;
        }
        return a2;
    }

    public void f(float f2) {
        float b2 = f2;
        hl_1 a2 = this;
        super.J(hl_1.J(b2));
    }

    /*
     * Unable to fully structure code
     */
    public void f(float var1_2, int var2_3, K var3_4) {
        var6_5 = this;
        var4_6 = hl_1.J(c);
        var5_7 = hl_1.J(var6_5.f());
        d = var4_6 - var5_7;
        if (!(Math.abs(var4_6 - var5_7) > Hra.Ga)) ** GOTO lbl11
        if (var4_6 > var5_7) {
            d -= CRa.ja;
            v0 = var5_7;
        } else {
            d += CRa.ja;
lbl11:
            // 2 sources

            v0 = var5_7;
        }
        c = v0 + d;
        super.J(c, (int)b, (K)a);
    }

    public hl_1(float f2) {
        float b2 = f2;
        hl_1 a2 = this;
        super(b2);
    }

    public static hl J() {
        return new hl_1(I);
    }
}

