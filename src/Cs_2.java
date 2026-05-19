/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cs
 */
import java.util.function.Function;

public final class Cs_2
implements Function {
    private static final Cs instance = new Cs_2();

    private Cs_2() {
        Cs_2 a2;
    }

    public Object apply(Object object) {
        Object b2 = object;
        Cs_2 a2 = this;
        return St.G((b[])b2);
    }

    public static Function J() {
        return instance;
    }
}

