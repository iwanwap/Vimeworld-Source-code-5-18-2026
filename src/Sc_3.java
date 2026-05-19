/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Sc
 *  ab
 */
import java.util.function.Function;

public final class Sc_3<T> {
    private int J;
    private T A;
    private final Function<Integer, T> I;

    public Sc_3(Function<Integer, T> function) {
        Sc_3 a2;
        Function<Integer, T> b2 = function;
        Sc_3 sc_3 = a2 = this;
        sc_3.A = null;
        sc_3.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public T J(int n2) {
        void a2;
        Sc_3 sc_3 = this;
        Sc_3<T> b2 = sc_3.A;
        if (b2 == null || sc_3.J < a2) {
            b2 = sc_3.I.apply((int)a2);
            sc_3.A = b2;
            sc_3.J = a2;
        }
        return (T)b2;
    }

    public static Sc<float[]> J() {
        return new Sc_3(ab.J());
    }

    public static /* synthetic */ float[] J(int a2) {
        return new float[a2];
    }
}

