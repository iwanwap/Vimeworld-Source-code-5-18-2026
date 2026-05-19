/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

public final class HP
implements Consumer {
    private static final HP I = new HP();

    public static Consumer J() {
        return I;
    }

    public void accept(Object object) {
        Object b2 = object;
        HP a2 = this;
        ((Bp)b2).f();
    }

    private HP() {
        HP a2;
    }
}

