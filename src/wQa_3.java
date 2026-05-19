/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nra
 */
import java.time.Duration;

public final class wQa_3
implements Runnable {
    private final long J;
    private final nra A;
    private final Duration I;

    @Override
    public void run() {
        wQa_3 a2;
        wQa_3 wQa_32 = a2;
        nra.J((nra)wQa_32.A, (long)wQa_32.J, (Duration)a2.I);
    }

    /*
     * WARNING - void declaration
     */
    private wQa_3(nra nra2, long l2, Duration duration) {
        Duration d2;
        void b2;
        void c2;
        wQa_3 a2;
        wQa_3 wQa_32 = duration2;
        Duration duration2 = duration;
        wQa_3 wQa_33 = a2 = wQa_32;
        a2.A = c2;
        wQa_33.J = b2;
        wQa_33.I = d2;
    }

    /*
     * WARNING - void declaration
     */
    public static Runnable J(nra nra2, long l2, Duration duration) {
        void b2;
        Object c2 = duration;
        nra a2 = nra2;
        return new wQa_3(a2, (long)b2, (Duration)c2);
    }
}

