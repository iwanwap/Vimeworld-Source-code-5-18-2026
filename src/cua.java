/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
public final class cua
extends Enum<cua> {
    public static final /* enum */ cua RIGHT_CLICK_AIR = new cua();
    public static final /* enum */ cua LEFT_CLICK_BLOCK;
    private static final /* synthetic */ cua[] $VALUES;
    public static final /* enum */ cua RIGHT_CLICK_BLOCK;

    public static cua valueOf(String a2) {
        return Enum.valueOf(cua.class, a2);
    }

    private cua() {
        int a2 = n2;
        cua cua2 = this;
    }

    static {
        RIGHT_CLICK_BLOCK = new cua();
        LEFT_CLICK_BLOCK = new cua();
        cua[] cuaArray = new cua[yRa.d];
        cuaArray[uSa.E] = RIGHT_CLICK_AIR;
        cuaArray[vRa.d] = RIGHT_CLICK_BLOCK;
        cuaArray[uqa.g] = LEFT_CLICK_BLOCK;
        $VALUES = cuaArray;
    }

    public static cua[] values() {
        return (cua[])$VALUES.clone();
    }
}

