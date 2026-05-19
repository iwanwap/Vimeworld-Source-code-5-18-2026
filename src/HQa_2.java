/*
 * Decompiled with CFR 0.152.
 */
public final class HQa_2
implements Runnable {
    private final QOa I;

    @Override
    public void run() {
        HQa_2 a2;
        QOa.f(a2.I);
    }

    private HQa_2(QOa qOa2) {
        QOa b2 = qOa2;
        HQa_2 a2 = this;
        a2.I = b2;
    }

    public static Runnable J(QOa a2) {
        return new HQa_2(a2);
    }
}

