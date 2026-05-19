/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
public final class gba
extends Enum<gba> {
    public static final /* enum */ gba UPDATE_LATENCY;
    public static final /* enum */ gba REMOVE_PLAYER;
    public static final /* enum */ gba ADD_PLAYER;
    private static final /* synthetic */ gba[] $VALUES;
    public static final /* enum */ gba UPDATE_GAME_MODE;
    public static final /* enum */ gba UPDATE_DISPLAY_NAME;

    public static gba valueOf(String a2) {
        return Enum.valueOf(gba.class, a2);
    }

    public static gba[] values() {
        return (gba[])$VALUES.clone();
    }

    private gba() {
        int a2 = n2;
        gba gba2 = this;
    }

    static {
        ADD_PLAYER = new gba();
        UPDATE_GAME_MODE = new gba();
        UPDATE_LATENCY = new gba();
        UPDATE_DISPLAY_NAME = new gba();
        REMOVE_PLAYER = new gba();
        gba[] gbaArray = new gba[tTa.h];
        gbaArray[uSa.E] = ADD_PLAYER;
        gbaArray[vRa.d] = UPDATE_GAME_MODE;
        gbaArray[uqa.g] = UPDATE_LATENCY;
        gbaArray[yRa.d] = UPDATE_DISPLAY_NAME;
        gbaArray[AQa.P] = REMOVE_PLAYER;
        $VALUES = gbaArray;
    }
}

