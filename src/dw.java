/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  zU
 */
import java.util.UUID;
import java.util.function.Function;

public final class dw
implements Function {
    private static final dw I = new dw();

    private dw() {
        dw a2;
    }

    public static Function J() {
        return I;
    }

    public Object apply(Object object) {
        Object b2 = object;
        dw a2 = this;
        return zU.J((UUID)((UUID)b2));
    }
}

