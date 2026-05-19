/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Jw
 *  vRa
 */
import java.util.concurrent.ThreadLocalRandom;

public class ow_2 {
    private Jw j;
    private final Jw J;
    private int A;
    private final int I;

    /*
     * WARNING - void declaration
     */
    public ow_2(int n2, int n3) {
        void b2;
        int c2 = n3;
        ow_2 a2 = this;
        a2.I = c2;
        ow_2 ow_22 = a2;
        a2.J = new Jw(ThreadLocalRandom.current().nextInt());
        a2.j = new Jw(uSa.E);
        a2.J((int)b2);
    }

    public int J() {
        ow_2 a2;
        return Jw.J((Jw)a2.j) ^ Jw.J((Jw)a2.J);
    }

    public void J(int n2) {
        int b2 = n2;
        ow_2 a2 = this;
        int n3 = a2.A;
        a2.A = n3 + vRa.d;
        if (n3 >= a2.I) {
            a2.A = uSa.E;
            Jw.J((Jw)a2.J, (int)ThreadLocalRandom.current().nextInt());
            ow_2 ow_22 = a2;
            ow_22.j = new Jw(b2 ^ Jw.J((Jw)a2.J));
            return;
        }
        Jw.J((Jw)a2.j, (int)(b2 ^ Jw.J((Jw)a2.J)));
    }
}

