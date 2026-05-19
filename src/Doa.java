/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Joa
 */
public final class Doa
implements Runnable {
    private final int A;
    private final int I;

    @Override
    public void run() {
        Doa a2;
        Doa doa = a2;
        Joa.f((int)doa.A, (int)doa.I);
    }

    /*
     * WARNING - void declaration
     */
    private Doa(int n2, int n3) {
        void b2;
        Doa a2;
        int c2 = n3;
        Doa doa = a2 = this;
        doa.A = b2;
        doa.I = c2;
    }

    public static Runnable J(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        return new Doa(a2, b2);
    }
}

