/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
public final class Xy
extends Enum<Xy> {
    public static final /* enum */ Xy SOLARIS;
    private static final /* synthetic */ Xy[] $VALUES;
    public static final /* enum */ Xy LINUX;
    public static final /* enum */ Xy WINDOWS;
    public static final /* enum */ Xy OSX;
    public static final /* enum */ Xy UNKNOWN;

    public static Xy[] values() {
        return (Xy[])$VALUES.clone();
    }

    public static Xy valueOf(String a2) {
        return Enum.valueOf(Xy.class, a2);
    }

    static {
        LINUX = new Xy();
        SOLARIS = new Xy();
        WINDOWS = new Xy();
        OSX = new Xy();
        UNKNOWN = new Xy();
        Xy[] xyArray = new Xy[tTa.h];
        xyArray[uSa.E] = LINUX;
        xyArray[vRa.d] = SOLARIS;
        xyArray[uqa.g] = WINDOWS;
        xyArray[yRa.d] = OSX;
        xyArray[AQa.P] = UNKNOWN;
        $VALUES = xyArray;
    }

    private Xy() {
        int a2 = n2;
        Xy xy2 = this;
    }
}

