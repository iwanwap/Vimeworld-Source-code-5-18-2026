/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  Oz
 *  Pq
 *  XM
 *  k
 *  pqa
 */
public final class hP_1
extends Pq {
    private long A;
    private boolean I;

    /*
     * WARNING - void declaration
     */
    public hP_1(k k2, XM xM2) {
        void a2;
        Object c2 = k2;
        hP_1 b2 = this;
        super((k)c2, (XM)a2);
        b2.A = fqa.Da;
        b2.I = uSa.E;
        c2 = a2.getEProgressTimer();
        if (((Bm)c2).hasReverse()) {
            b2.I = ((Bm)c2).getReverse();
        }
        if (((Bm)c2).hasTimerDuration()) {
            b2.A = ((Bm)c2).getTimerDuration();
        }
        if (b2.A == fqa.Da) {
            b2.A = b2.i - b2.F;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(long l2) {
        void a2;
        hP_1 hP_12 = this;
        float b2 = pqa.r - Oz.J((float)((float)(a2 - hP_12.F) / (float)hP_12.A), (float)JPa.N, (float)pqa.r);
        if (hP_12.I) {
            b2 = pqa.r - b2;
        }
        hP_12.A.J(b2);
        super.J((long)a2);
    }
}

