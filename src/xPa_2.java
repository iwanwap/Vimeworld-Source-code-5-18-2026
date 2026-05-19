/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Dpa
 *  xPa
 */
import java.util.function.Function;

public final class xPa_2
implements Function {
    private static final xPa I = new xPa_2();

    public Object apply(Object object) {
        Object b2 = object;
        xPa_2 a2 = this;
        return Dpa.f((byte[])((byte[])b2));
    }

    private xPa_2() {
        xPa_2 a2;
    }

    public static Function J() {
        return I;
    }
}

