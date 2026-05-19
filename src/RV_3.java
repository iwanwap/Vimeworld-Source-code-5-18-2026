/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DW
 *  RV
 */
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;

public final class RV_3
implements RemovalListener {
    private static final RV I = new RV_3();

    public static RemovalListener J() {
        return I;
    }

    public void onRemoval(RemovalNotification removalNotification) {
        RemovalNotification b2 = removalNotification;
        RV_3 a2 = this;
        DW.J((RemovalNotification)b2);
    }

    private RV_3() {
        RV_3 a2;
    }
}

