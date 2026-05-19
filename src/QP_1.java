/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JSa
 *  vRa
 */
public final class QP_1
implements Runnable {
    private final String I;

    @Override
    public void run() {
        QP_1 qP_1 = this;
        eq a2 = OT.i.F;
        if (qP_1.I.endsWith(JSa.a)) {
            a2.J(qP_1.I.substring(uSa.E, qP_1.I.length() - vRa.d));
            return;
        }
        a2.f(qP_1.I);
    }

    public QP_1(String string) {
        String b2 = string;
        QP_1 a2 = this;
        a2.I = b2;
    }
}

