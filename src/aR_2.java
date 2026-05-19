/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  XM
 *  fO
 *  k
 *  np
 *  vRa
 */
public final class aR_2
extends np {
    public long A;
    public boolean I;

    /*
     * WARNING - void declaration
     */
    public aR_2(k k2, XM xM2) {
        void a2;
        aR_2 c2 = k2;
        aR_2 b2 = this;
        super((k)c2, (XM)a2);
        b2.I = uSa.E;
        c2 = a2.getETextTimer();
        if (c2.hasDuration()) {
            aR_2 aR_22 = b2;
            aR_22.I = vRa.d;
            aR_22.A = OT.e + c2.getDuration();
        }
        b2.l(Math.max(nqa.i, b2.J() - OT.e));
    }

    public void J(fO fO2) {
        aR_2 b2 = fO2;
        aR_2 a2 = this;
        aR_2 aR_22 = b2;
        super.J((fO)aR_22);
        b2 = aR_22.getETextTimer();
        if (b2.hasDuration()) {
            aR_2 aR_23 = a2;
            aR_23.I = vRa.d;
            aR_23.A = OT.e + b2.getDuration();
        }
    }

    private long J() {
        aR_2 a2;
        if (a2.I) {
            return a2.A;
        }
        return a2.i;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(long l2) {
        void a2;
        aR_2 aR_22 = this;
        boolean b2 = super.J((long)a2);
        if (b2) {
            aR_2 aR_23 = aR_22;
            aR_23.l(Math.max(nqa.i, aR_23.J() - a2));
        }
        return b2;
    }
}

