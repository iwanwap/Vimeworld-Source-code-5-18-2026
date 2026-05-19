/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ARa
 *  Dpa
 */
import java.util.function.Function;

public final class ARa_3
implements Function {
    private static final ARa I = new ARa_3();

    private ARa_3() {
        ARa_3 a2;
    }

    public Object apply(Object object) {
        Object b2 = object;
        ARa_3 a2 = this;
        return Dpa.J((byte[])((byte[])b2));
    }

    public static Function J() {
        return I;
    }
}

