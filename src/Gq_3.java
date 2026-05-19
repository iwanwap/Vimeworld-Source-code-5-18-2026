/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gq
 */
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;

public final class Gq_3
implements RemovalListener {
    private static final Gq I = new Gq_3();

    public void onRemoval(RemovalNotification removalNotification) {
        RemovalNotification b2 = removalNotification;
        Gq_3 a2 = this;
        gP.J(b2);
    }

    public static RemovalListener J() {
        return I;
    }

    private Gq_3() {
        Gq_3 a2;
    }
}

