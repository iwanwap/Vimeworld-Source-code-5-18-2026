/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
public final class Fp
extends Enum<Fp> {
    public static final /* enum */ Fp NORTH = new Fp(AQa.P);
    public final int index;
    public static final /* enum */ Fp UP;
    private static final /* synthetic */ Fp[] $VALUES;
    public static final /* enum */ Fp SOUTH;
    public static final /* enum */ Fp DOWN;
    public static final /* enum */ Fp EAST;
    public static final /* enum */ Fp WEST;

    static {
        SOUTH = new Fp(tTa.h);
        DOWN = new Fp(yRa.d);
        UP = new Fp(uqa.g);
        WEST = new Fp(uSa.E);
        EAST = new Fp(vRa.d);
        Fp[] fpArray = new Fp[uua.p];
        fpArray[uSa.E] = NORTH;
        fpArray[vRa.d] = SOUTH;
        fpArray[uqa.g] = DOWN;
        fpArray[yRa.d] = UP;
        fpArray[AQa.P] = WEST;
        fpArray[tTa.h] = EAST;
        $VALUES = fpArray;
    }

    private Fp(int n3) {
        int b2 = n3;
        Fp a2 = this;
        a2.index = b2;
    }

    public static Fp[] values() {
        return (Fp[])$VALUES.clone();
    }

    public static Fp valueOf(String a2) {
        return Enum.valueOf(Fp.class, a2);
    }
}

