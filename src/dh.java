/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.util.function.Consumer;

public final class dh
implements Consumer {
    private final si I;

    private dh(si si2) {
        si b2 = si2;
        dh a2 = this;
        a2.I = b2;
    }

    public void accept(Object object) {
        Object b2 = object;
        dh a2 = this;
        si.J(a2.I, (InputStream)b2);
    }

    public static Consumer J(si a2) {
        return new dh(a2);
    }
}

