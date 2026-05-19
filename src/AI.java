/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  zy
 */
import java.util.function.Consumer;

public final class AI
implements Consumer {
    private static final AI I = new AI();

    private AI() {
        AI a2;
    }

    public static Consumer J() {
        return I;
    }

    public void accept(Object object) {
        Object b2 = object;
        AI a2 = this;
        Ni.J((zy)b2);
    }
}

