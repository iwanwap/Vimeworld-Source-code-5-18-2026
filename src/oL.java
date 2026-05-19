/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;
import java.util.function.Supplier;

public final class oL
implements Supplier {
    private final Function A;
    private final RJ I;

    public static Supplier J(RJ rJ, Function function) {
        Object b2 = function;
        RJ a2 = rJ;
        return new oL(a2, (Function)b2);
    }

    public Object get() {
        oL a2;
        oL oL2 = a2;
        return RJ.J(oL2.I, oL2.A);
    }

    /*
     * WARNING - void declaration
     */
    private oL(RJ rJ, Function function) {
        void b2;
        oL a2;
        Function c2 = function;
        oL oL2 = a2 = this;
        oL2.I = b2;
        oL2.A = c2;
    }
}

