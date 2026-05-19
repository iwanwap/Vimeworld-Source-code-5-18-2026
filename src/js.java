/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
public final class js
extends Enum<js> {
    public static final /* enum */ js NOT_LOADED = new js();
    public static final /* enum */ js FAILED;
    public static final /* enum */ js LOADED;
    private static final /* synthetic */ js[] $VALUES;

    private js() {
        int a2 = n2;
        js js2 = this;
    }

    public static js valueOf(String a2) {
        return Enum.valueOf(js.class, a2);
    }

    public static js[] values() {
        return (js[])$VALUES.clone();
    }

    static {
        LOADED = new js();
        FAILED = new js();
        js[] jsArray = new js[yRa.d];
        jsArray[uSa.E] = NOT_LOADED;
        jsArray[vRa.d] = LOADED;
        jsArray[uqa.g] = FAILED;
        $VALUES = jsArray;
    }
}

