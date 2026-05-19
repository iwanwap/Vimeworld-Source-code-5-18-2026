/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  zra
 */
public final class iqa_1
implements Runnable {
    private final String j;
    private final zra J;
    private final float A;
    private final QOa I;

    /*
     * WARNING - void declaration
     */
    private iqa_1(QOa qOa, String string, float f2, zra zra2) {
        iqa_1 e2;
        void b2;
        void c2;
        void d2;
        iqa_1 a2;
        iqa_1 iqa_12 = iqa_13;
        iqa_1 iqa_13 = zra2;
        iqa_1 iqa_14 = a2 = iqa_12;
        iqa_1 iqa_15 = a2;
        iqa_15.I = d2;
        iqa_15.j = c2;
        iqa_14.A = b2;
        iqa_14.J = e2;
    }

    /*
     * WARNING - void declaration
     */
    public static Runnable J(QOa qOa, String string, float f2, zra zra2) {
        void b2;
        void c2;
        QOa d2 = zra2;
        QOa a2 = qOa;
        return new iqa_1(a2, (String)c2, (float)b2, (zra)d2);
    }

    @Override
    public void run() {
        iqa_1 a2;
        iqa_1 iqa_12 = a2;
        iqa_1 iqa_13 = a2;
        QOa.J(iqa_12.I, iqa_12.j, iqa_13.A, iqa_13.J);
    }
}

