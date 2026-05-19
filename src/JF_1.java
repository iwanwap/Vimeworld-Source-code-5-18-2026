/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JF
 *  qF
 */
import java.util.function.Function;

public final class JF_1
implements Function {
    private static final JF I = new JF_1();

    private JF_1() {
        JF_1 a2;
    }

    public static Function J() {
        return I;
    }

    public Object apply(Object object) {
        Object b2 = object;
        JF_1 a2 = this;
        return ((qF)b2).toString();
    }
}

