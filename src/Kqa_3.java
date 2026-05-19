/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  QQa
 *  ira
 */
import java.util.function.BiConsumer;

public final class Kqa_3
implements Runnable {
    private final BiConsumer J;
    private final QQa A;
    private final ira I;

    @Override
    public void run() {
        Kqa_3 a2;
        Kqa_3 kqa_3 = a2;
        QQa.J((QQa)kqa_3.A, (BiConsumer)kqa_3.J, (ira)a2.I);
    }

    /*
     * WARNING - void declaration
     */
    public static Runnable J(QQa qQa2, BiConsumer biConsumer, ira ira2) {
        void b2;
        QQa c2 = ira2;
        QQa a2 = qQa2;
        return new Kqa_3(a2, (BiConsumer)b2, (ira)c2);
    }

    /*
     * WARNING - void declaration
     */
    private Kqa_3(QQa qQa2, BiConsumer biConsumer, ira ira2) {
        void b2;
        void c2;
        Kqa_3 a2;
        Kqa_3 d2 = ira2;
        Kqa_3 kqa_3 = a2 = this;
        a2.A = c2;
        kqa_3.J = b2;
        kqa_3.I = d2;
    }
}

