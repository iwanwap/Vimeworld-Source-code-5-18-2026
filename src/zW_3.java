/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  zW
 */
import java.util.concurrent.ThreadFactory;

public final class zW_3
implements ThreadFactory {
    private static final zW I = new zW_3();

    private zW_3() {
        zW_3 a2;
    }

    @Override
    public Thread newThread(Runnable runnable) {
        Runnable b2 = runnable;
        zW_3 a2 = this;
        return rw.J(b2);
    }

    public static ThreadFactory J() {
        return I;
    }
}

