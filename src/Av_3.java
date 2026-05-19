/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.function.Consumer;

public final class Av_3
implements Consumer {
    private final Map I;

    private Av_3(Map map) {
        Map b2 = map;
        Av_3 a2 = this;
        a2.I = b2;
    }

    public void accept(Object object) {
        Object b2 = object;
        Av_3 a2 = this;
        Object v2 = a2.I.remove((String)b2);
    }

    public static Consumer J(Map a2) {
        return new Av_3(a2);
    }
}

