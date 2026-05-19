/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.LinkedBlockingDeque;

public final class Hj_3
extends LinkedBlockingDeque<Runnable> {
    public /* synthetic */ Hj_3(qj qj2) {
        qj b2 = qj2;
        Hj_3 a2 = this;
        a2();
    }

    @Override
    public Runnable take() throws InterruptedException {
        Hj_3 a2;
        return (Runnable)super.takeLast();
    }

    private Hj_3() {
        Hj_3 a2;
    }
}

