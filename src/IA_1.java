/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ob
 */
public final class IA_1
implements Runnable {
    private final ob I;

    @Override
    public void run() {
        IA_1 a2;
        ob.J((ob)a2.I);
    }

    private IA_1(ob ob2) {
        IA_1 b2 = ob2;
        IA_1 a2 = this;
        a2.I = b2;
    }

    public static Runnable J(ob a2) {
        return new IA_1(a2);
    }
}

