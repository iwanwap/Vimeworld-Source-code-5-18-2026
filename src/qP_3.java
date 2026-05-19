/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pq
 */
public final class qP_3
implements Runnable {
    private final float J;
    private final Pq A;
    private final float I;

    @Override
    public void run() {
        qP_3 a2;
        qP_3 qP_32 = a2;
        Pq.J((Pq)qP_32.A, (float)qP_32.J, (float)a2.I);
    }

    /*
     * WARNING - void declaration
     */
    private qP_3(Pq pq2, float f2, float f3) {
        void b2;
        void c2;
        qP_3 a2;
        float d2 = f3;
        qP_3 qP_32 = a2 = this;
        a2.A = c2;
        qP_32.J = b2;
        qP_32.I = d2;
    }

    /*
     * WARNING - void declaration
     */
    public static Runnable J(Pq pq2, float f2, float f3) {
        void b2;
        float c2 = f3;
        Pq a2 = pq2;
        return new qP_3(a2, (float)b2, c2);
    }
}

