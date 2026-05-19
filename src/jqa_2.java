/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gqa
 *  jqa
 */
import java.util.function.Consumer;

public final class jqa_2
implements Consumer {
    private static final jqa I = new jqa_2();

    private jqa_2() {
        jqa_2 a2;
    }

    public void accept(Object object) {
        Object b2 = object;
        jqa_2 a2 = this;
        Gqa.J((Throwable)((Throwable)b2));
    }

    public static Consumer J() {
        return I;
    }
}

