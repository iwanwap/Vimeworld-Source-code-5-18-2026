/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  wt
 */
import java.util.function.Function;

public final class wt_3
implements Function {
    private static final wt instance = new wt_3();

    public Object apply(Object object) {
        Object b2 = object;
        wt_3 a2 = this;
        return St.M((b[])b2);
    }

    public static Function J() {
        return instance;
    }

    private wt_3() {
        wt_3 a2;
    }
}

