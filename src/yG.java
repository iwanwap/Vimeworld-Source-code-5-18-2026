/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  XTa
 *  an
 *  vRa
 */
import java.util.EnumMap;

public final class yG
extends Enum<yG> {
    public static final /* enum */ yG CENTER;
    public static final /* enum */ yG TOP;
    public static final /* enum */ yG BOTTOM_RIGHT;
    public static final /* enum */ yG RIGHT;
    public static final /* enum */ yG BOTTOM;
    public static final /* enum */ yG TOP_LEFT;
    public static final /* enum */ yG BOTTOM_LEFT;
    public final an proto;
    private static final /* synthetic */ yG[] $VALUES;
    public static final /* enum */ yG TOP_RIGHT;
    public static final /* enum */ yG LEFT;
    private static final EnumMap<an, yG> reverse;

    static {
        int n2;
        TOP_RIGHT = new yG(an.TOP_RIGHT);
        TOP = new yG(an.TOP);
        TOP_LEFT = new yG(an.TOP_LEFT);
        BOTTOM_RIGHT = new yG(an.BOTTOM_RIGHT);
        BOTTOM = new yG(an.BOTTOM);
        BOTTOM_LEFT = new yG(an.BOTTOM_LEFT);
        RIGHT = new yG(an.RIGHT);
        LEFT = new yG(an.LEFT);
        CENTER = new yG(an.CENTER);
        yG[] yGArray = new yG[WOa.fa];
        yGArray[uSa.E] = TOP_RIGHT;
        yGArray[vRa.d] = TOP;
        yGArray[uqa.g] = TOP_LEFT;
        yGArray[yRa.d] = BOTTOM_RIGHT;
        yGArray[AQa.P] = BOTTOM;
        yGArray[tTa.h] = BOTTOM_LEFT;
        yGArray[uua.p] = RIGHT;
        yGArray[XTa.W] = LEFT;
        yGArray[Yqa.i] = CENTER;
        $VALUES = yGArray;
        reverse = new EnumMap(an.class);
        yG[] yGArray2 = yG.values();
        int n3 = yGArray2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            yG yG2 = yGArray2[n2];
            reverse.put(yG2.proto, yG2);
            n4 = ++n2;
        }
    }

    public static yG[] values() {
        return (yG[])$VALUES.clone();
    }

    public static yG valueOf(String a2) {
        return Enum.valueOf(yG.class, a2);
    }

    private yG(an an2) {
        yG b2 = an2;
        yG a2 = this;
        a2.proto = b2;
    }

    public static yG fromProto(an an2, yG yG2) {
        Object b2 = yG2;
        an a2 = an2;
        return reverse.getOrDefault(a2, (yG)((Object)b2));
    }
}

