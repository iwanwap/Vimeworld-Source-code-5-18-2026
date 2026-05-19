/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
public final class nw
extends Enum<nw> {
    public static final /* enum */ nw WOOD_DOOR;
    public static final /* enum */ nw OPENING;
    private static final /* synthetic */ nw[] $VALUES;
    public static final /* enum */ nw GRATES;
    public static final /* enum */ nw IRON_DOOR;

    public static nw valueOf(String a2) {
        return Enum.valueOf(nw.class, a2);
    }

    static {
        OPENING = new nw();
        WOOD_DOOR = new nw();
        GRATES = new nw();
        IRON_DOOR = new nw();
        nw[] nwArray = new nw[AQa.P];
        nwArray[uSa.E] = OPENING;
        nwArray[vRa.d] = WOOD_DOOR;
        nwArray[uqa.g] = GRATES;
        nwArray[yRa.d] = IRON_DOOR;
        $VALUES = nwArray;
    }

    public static nw[] values() {
        return (nw[])$VALUES.clone();
    }

    private nw() {
        int a2 = n2;
        nw nw2 = this;
    }
}

