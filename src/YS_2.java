/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  QSa
 *  YS
 *  vRa
 */
public final class YS_2
extends Enum<YS> {
    public static final /* enum */ YS NEW = new YS_2(QSa.ja);
    private static final /* synthetic */ YS[] $VALUES;
    public static final /* enum */ YS OLD = new YS_2(vTa.q);
    private final String displayName;

    public static YS[] values() {
        return (YS[])$VALUES.clone();
    }

    private YS_2(String string2) {
        Object b2 = string2;
        YS_2 a2 = this;
        a2.displayName = b2;
    }

    static {
        YS_2[] yS_2Array = new YS_2[uqa.g];
        yS_2Array[uSa.E] = NEW;
        yS_2Array[vRa.d] = OLD;
        $VALUES = yS_2Array;
    }

    public static YS valueOf(String a2) {
        return Enum.valueOf(YS_2.class, a2);
    }

    public String getDisplayName() {
        YS_2 a2;
        return a2.displayName;
    }
}

