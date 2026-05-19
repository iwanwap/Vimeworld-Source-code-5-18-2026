/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  LQa
 *  NCa
 *  Vx
 *  Waa
 *  yra
 */
public final class Kv_1
extends Vx {
    private Waa tagCompound;

    public Kv_1(String string) {
        Object b2 = string;
        Kv_1 a2 = this;
        super((String)b2);
        Kv_1 kv_1 = a2;
        kv_1.tagCompound = new Waa();
    }

    public void f(Waa waa2) {
        Kv_1 b2 = waa2;
        Kv_1 a2 = this;
        b2.J(LQa.q, (NCa)a2.tagCompound);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Waa waa2, int n2, int n3) {
        void c2;
        void b2;
        int d2 = n3;
        Kv_1 a2 = this;
        a2.tagCompound.J(Kv_1.J((int)b2, d2), (NCa)c2);
    }

    public Waa J() {
        Kv_1 a2;
        return a2.tagCompound;
    }

    public void J(Waa waa2) {
        Kv_1 b2 = waa2;
        Kv_1 a2 = this;
        a2.tagCompound = b2.J(LQa.q);
    }

    public static String J(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        return new StringBuilder().insert(3 ^ 3, dqa.X).append(a2).append(yra.t).append(b2).append(XOa.D).toString();
    }
}

