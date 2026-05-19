/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  oR
 *  vRa
 *  vpa
 *  wR
 */
import java.time.LocalDate;
import java.time.Month;

public final class oR_3
extends Enum<oR> {
    public static final /* enum */ oR SPRING = new oR_3();
    public static final /* enum */ oR WINTER;
    private static final /* synthetic */ oR[] $VALUES;
    public static final /* enum */ oR SUMMER;
    public static final /* enum */ oR FALL;

    public static oR[] values() {
        return (oR[])$VALUES.clone();
    }

    public static oR valueOf(String a2) {
        return Enum.valueOf(oR_3.class, a2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static oR getCurrentSeason() {
        Month month = LocalDate.now().getMonth();
        switch (wR.I[month.ordinal()]) {
            case 1: 
            case 2: 
            case 3: {
                return WINTER;
            }
            case 4: 
            case 5: 
            case 6: {
                return SPRING;
            }
            case 7: 
            case 8: 
            case 9: {
                return SUMMER;
            }
            case 10: 
            case 11: 
            case 12: {
                return FALL;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(3 >> 2, vpa.f).append(month).toString());
    }

    private oR_3() {
        int a2 = n2;
        oR_3 oR_32 = this;
    }

    static {
        SUMMER = new oR_3();
        FALL = new oR_3();
        WINTER = new oR_3();
        oR_3[] oR_3Array = new oR_3[AQa.P];
        oR_3Array[uSa.E] = SPRING;
        oR_3Array[vRa.d] = SUMMER;
        oR_3Array[uqa.g] = FALL;
        oR_3Array[yRa.d] = WINTER;
        $VALUES = oR_3Array;
    }
}

