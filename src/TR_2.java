/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  TR
 */
import java.util.function.Function;

public final class TR_2
implements Function {
    private static final TR instance = new TR_2();

    private TR_2() {
        TR_2 a2;
    }

    public Object apply(Object object) {
        Object b2 = object;
        TR_2 a2 = this;
        return St.A((b[])b2);
    }

    public static Function J() {
        return instance;
    }
}

