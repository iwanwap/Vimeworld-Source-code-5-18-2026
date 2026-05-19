/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aU
 *  iS
 *  vRa
 *  yR
 */
import java.util.Arrays;

public final class iS_2
extends Enum<iS> {
    private static final iS[] SYNCED;
    public static final /* enum */ iS MINIDOT_GUI;
    private final boolean sync;
    public static final /* enum */ iS LOCAL;
    private static final /* synthetic */ iS[] $VALUES;

    private iS_2(boolean bl2) {
        boolean b2 = bl2;
        iS_2 a2 = this;
        a2.sync = b2;
    }

    public static iS valueOf(String a2) {
        return Enum.valueOf(iS_2.class, a2);
    }

    static {
        MINIDOT_GUI = new iS_2(vRa.d != 0);
        LOCAL = new iS_2(uSa.E != 0);
        iS_2[] iS_2Array = new iS_2[uqa.g];
        iS_2Array[uSa.E] = MINIDOT_GUI;
        iS_2Array[vRa.d] = LOCAL;
        $VALUES = iS_2Array;
        SYNCED = (iS[])Arrays.stream(iS_2.values()).filter(yR.J()).toArray(aU.J());
    }

    public static iS[] values() {
        return (iS[])$VALUES.clone();
    }

    public static /* synthetic */ boolean lambda$static$0(iS a2) {
        return a2.sync;
    }

    public static iS[] getSynced() {
        return SYNCED;
    }

    public boolean isSync() {
        iS_2 a2;
        return a2.sync;
    }

    public static /* synthetic */ iS[] lambda$static$1(int a2) {
        return new iS_2[a2];
    }
}

