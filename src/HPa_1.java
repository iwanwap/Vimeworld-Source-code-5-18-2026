/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CQa
 *  HPa
 */
import java.util.function.Consumer;

public final class HPa_1
implements Consumer {
    private static final HPa I = new HPa_1();

    public void accept(Object object) {
        Object b2 = object;
        HPa_1 a2 = this;
        CQa.J((Throwable)((Throwable)b2));
    }

    public static Consumer J() {
        return I;
    }

    private HPa_1() {
        HPa_1 a2;
    }
}

