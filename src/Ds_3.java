/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ds
 */
import java.util.function.Function;

public final class Ds_3
implements Function {
    private static final Ds instance = new Ds_3();

    private Ds_3() {
        Ds_3 a2;
    }

    public static Function J() {
        return instance;
    }

    public Object apply(Object object) {
        Object b2 = object;
        Ds_3 a2 = this;
        return St.f((b[])b2);
    }
}

