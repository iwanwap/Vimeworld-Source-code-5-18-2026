/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kna
 *  Kpa
 *  vRa
 */
public final class Eh
implements P {
    private final Kna I;

    @Override
    public int f(String string) {
        String b2 = string;
        Eh a2 = this;
        return a2.I.J(b2);
    }

    @Override
    public int J(String string) {
        String b2 = string;
        Eh a2 = this;
        return a2.I.u;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(String string, int n2, int n3, int n4, boolean bl) {
        void f2;
        void c2;
        void d2;
        void e2;
        void a2;
        int n5 = n4;
        Eh b2 = this;
        Kna.f = uSa.E;
        if (a2 != false) {
            b2.I.J((String)e2, (float)d2, (float)c2, (int)f2);
        } else {
            b2.I.J((String)e2, (int)d2, (int)c2, (int)f2);
        }
        Kna.f = vRa.d;
    }

    public Eh() {
        Eh a2;
        a2.I = Kpa.J().Ea;
    }

    @Override
    public void J() {
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public String J(String string, int n2, boolean bl) {
        void b2;
        void c2;
        boolean d2 = bl;
        Eh a2 = this;
        return a2.I.J((String)c2, (int)b2, d2);
    }
}

