/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicInteger;

public final class NW_1
implements Runnable {
    public final /* synthetic */ AtomicInteger I;

    @Override
    public void run() {
        NW_1 a2;
        a2.I.incrementAndGet();
    }

    public NW_1(AtomicInteger object) {
        Object a2 = object;
        object = this;
        ((NW_1)object).I = a2;
        object();
    }
}

