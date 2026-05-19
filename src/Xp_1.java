/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  XM
 *  k
 *  oP
 *  pqa
 */
public final class Xp_1
extends oP {
    private final long I;

    public void J(long a2) {
        Xp_1 b2;
        Xp_1 xp_1 = b2;
        xp_1.A = pqa.r - (float)(a2 - b2.F) / (float)xp_1.I;
        if (xp_1.A < JPa.N) {
            b2.A = JPa.N;
        }
        super.J(a2);
    }

    /*
     * WARNING - void declaration
     */
    public Xp_1(k k2, XM xM2) {
        void b2;
        Xp_1 a2;
        Xp_1 c2 = xM2;
        Xp_1 xp_1 = a2 = this;
        super((k)b2, (XM)c2);
        a2.I = xp_1.i - a2.F;
    }
}

