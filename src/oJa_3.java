/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  aKa
 *  bqa
 *  ez
 */
public final class oJa_3 {
    private final aKa[] I = new aKa[ez.values().length];

    public aKa J(int n2) {
        int b2 = n2;
        oJa_3 a2 = this;
        return a2.I[b2];
    }

    public aKa J(ez ez2) {
        oJa_3 b2 = ez2;
        oJa_3 a2 = this;
        return a2.I[b2.ordinal()];
    }

    public oJa_3() {
        oJa_3 a2;
        oJa_3 oJa_32 = a2;
        oJa_32.I[ez.SOLID.ordinal()] = new aKa(Bpa.M);
        oJa_32.I[ez.CUTOUT.ordinal()] = new aKa(BPa.D);
        oJa_32.I[ez.CUTOUT_MIPPED.ordinal()] = new aKa(BPa.D);
        oJa_32.I[ez.TRANSLUCENT.ordinal()] = new aKa(bqa.O);
    }
}

