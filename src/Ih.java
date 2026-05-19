/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ei
 *  vRa
 */
public final class Ih
extends Enum<Ih> {
    public static final /* enum */ Ih VELOCITY;
    private static final /* synthetic */ Ih[] $VALUES;
    public static final /* enum */ Ih MOVE;

    /*
     * Enabled aggressive block sorting
     */
    public static Ih fromProto(Un a2) {
        switch (Ei.I[a2.ordinal()]) {
            case 1: {
                return MOVE;
            }
            case 2: {
                return VELOCITY;
            }
        }
        return MOVE;
    }

    private Ih() {
        int a2 = n2;
        Ih ih = this;
    }

    public static Ih valueOf(String a2) {
        return Enum.valueOf(Ih.class, a2);
    }

    public static Ih[] values() {
        return (Ih[])$VALUES.clone();
    }

    static {
        MOVE = new Ih();
        VELOCITY = new Ih();
        Ih[] ihArray = new Ih[uqa.g];
        ihArray[uSa.E] = MOVE;
        ihArray[vRa.d] = VELOCITY;
        $VALUES = ihArray;
    }
}

