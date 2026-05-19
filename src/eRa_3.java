/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nra
 */
public final class eRa_3
implements Runnable {
    private final int j;
    private final byte[] J;
    private final nra A;
    private final long I;

    @Override
    public void run() {
        eRa_3 a2;
        eRa_3 eRa_32 = a2;
        nra.J((nra)eRa_32.A, (int)eRa_32.j, (long)a2.I, (byte[])a2.J);
    }

    /*
     * WARNING - void declaration
     */
    private eRa_3(nra nra2, int n2, long l2, byte[] byArray) {
        Object e2;
        void b2;
        void c2;
        void d2;
        eRa_3 a2;
        eRa_3 eRa_32 = object;
        Object object = byArray;
        eRa_3 eRa_33 = a2 = eRa_32;
        eRa_3 eRa_34 = a2;
        eRa_34.A = d2;
        eRa_34.j = c2;
        eRa_33.I = b2;
        eRa_33.J = (byte[])e2;
    }

    /*
     * WARNING - void declaration
     */
    public static Runnable J(nra object, int n2, long l2, byte[] byArray) {
        nra d2;
        void b2;
        void c2;
        nra nra2 = object;
        object = byArray;
        nra a2 = nra2;
        return new eRa_3(a2, (int)c2, (long)b2, (byte[])d2);
    }
}

