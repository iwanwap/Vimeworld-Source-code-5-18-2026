/*
 * Decompiled with CFR 0.152.
 */
public final class fQa_1
implements Runnable {
    private final QOa I;

    private fQa_1(QOa qOa2) {
        QOa b2 = qOa2;
        fQa_1 a2 = this;
        a2.I = b2;
    }

    @Override
    public void run() {
        fQa_1 a2;
        QOa.J(a2.I);
    }

    public static Runnable J(QOa a2) {
        return new fQa_1(a2);
    }
}

