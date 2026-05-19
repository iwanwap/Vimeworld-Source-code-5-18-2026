/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nra
 */
import java.time.Duration;

public final class era_2
implements Runnable {
    private final Duration j;
    private final nra J;
    private final boolean A;
    private final boolean I;

    @Override
    public void run() {
        era_2 a2;
        era_2 era_22 = a2;
        era_2 era_23 = a2;
        nra.J((nra)era_22.J, (boolean)era_22.A, (boolean)era_23.I, (Duration)era_23.j);
    }

    /*
     * WARNING - void declaration
     */
    public static Runnable J(nra nra2, boolean bl, boolean bl2, Duration duration) {
        void b2;
        void c2;
        Object d2 = duration;
        nra a2 = nra2;
        return new era_2(a2, (boolean)c2, (boolean)b2, (Duration)d2);
    }

    /*
     * WARNING - void declaration
     */
    private era_2(nra nra2, boolean bl, boolean bl2, Duration duration) {
        Duration e2;
        void b2;
        void c2;
        void d2;
        era_2 a2;
        era_2 era_22 = duration2;
        Duration duration2 = duration;
        era_2 era_23 = a2 = era_22;
        era_2 era_24 = a2;
        era_24.J = d2;
        era_24.A = c2;
        era_23.I = b2;
        era_23.j = e2;
    }
}

