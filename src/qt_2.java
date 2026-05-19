/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  qt
 */
import java.util.function.Function;

public final class qt_2
implements Function {
    private static final qt instance = new qt_2();

    private qt_2() {
        qt_2 a2;
    }

    public Object apply(Object object) {
        Object b2 = object;
        qt_2 a2 = this;
        return St.l((b[])b2);
    }

    public static Function J() {
        return instance;
    }
}

