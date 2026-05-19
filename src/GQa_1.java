/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nra
 */
import java.time.Duration;

public final class GQa_1
implements Runnable {
    private final nra j;
    private final Duration J;
    private final boolean A;
    private final boolean I;

    @Override
    public void run() {
        GQa_1 a2;
        GQa_1 gQa_1 = a2;
        GQa_1 gQa_12 = a2;
        nra.f((nra)gQa_1.j, (boolean)gQa_1.A, (boolean)gQa_12.I, (Duration)gQa_12.J);
    }

    /*
     * WARNING - void declaration
     */
    private GQa_1(nra nra2, boolean bl, boolean bl2, Duration duration) {
        Duration e2;
        void b2;
        void c2;
        void d2;
        GQa_1 a2;
        GQa_1 gQa_1 = duration2;
        Duration duration2 = duration;
        GQa_1 gQa_12 = a2 = gQa_1;
        GQa_1 gQa_13 = a2;
        gQa_13.j = d2;
        gQa_13.A = c2;
        gQa_12.I = b2;
        gQa_12.J = e2;
    }

    /*
     * WARNING - void declaration
     */
    public static Runnable J(nra nra2, boolean bl, boolean bl2, Duration duration) {
        void b2;
        void c2;
        Object d2 = duration;
        nra a2 = nra2;
        return new GQa_1(a2, (boolean)c2, (boolean)b2, (Duration)d2);
    }
}

