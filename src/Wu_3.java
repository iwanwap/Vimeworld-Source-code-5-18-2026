/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.function.Function;

public final class Wu_3
implements Function {
    private final Map I;

    public static Function J(Map a2) {
        return new Wu_3(a2);
    }

    private Wu_3(Map map) {
        Map b2 = map;
        Wu_3 a2 = this;
        a2.I = b2;
    }

    public Object apply(Object object) {
        Object b2 = object;
        Wu_3 a2 = this;
        return a2.I.get((Integer)b2);
    }
}

