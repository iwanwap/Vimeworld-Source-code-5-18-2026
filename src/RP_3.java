/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.function.Consumer;

public final class RP_3
implements Consumer {
    private final String I;

    public void accept(Object object) {
        Object b2 = object;
        RP_3 a2 = this;
        eq.J(a2.I, (List)b2);
    }

    private RP_3(String string) {
        String b2 = string;
        RP_3 a2 = this;
        a2.I = b2;
    }

    public static Consumer J(String a2) {
        return new RP_3(a2);
    }
}

