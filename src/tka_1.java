/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  tka
 *  vRa
 */
public final class tka_1
extends Enum<tka> {
    private static final /* synthetic */ tka[] $VALUES;
    public static final /* enum */ tka REBUILD_CHUNK = new tka_1();
    public static final /* enum */ tka RESORT_TRANSPARENCY = new tka_1();

    public static tka valueOf(String a2) {
        return Enum.valueOf(tka_1.class, a2);
    }

    static {
        tka_1[] tka_1Array = new tka_1[uqa.g];
        tka_1Array[uSa.E] = REBUILD_CHUNK;
        tka_1Array[vRa.d] = RESORT_TRANSPARENCY;
        $VALUES = tka_1Array;
    }

    public static tka[] values() {
        return (tka[])$VALUES.clone();
    }

    private tka_1() {
        int a2 = n2;
        tka_1 tka_12 = this;
    }
}

