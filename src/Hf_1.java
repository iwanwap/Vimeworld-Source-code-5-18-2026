/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Hf
 */
import java.util.function.Supplier;
import ru.vimeworld.configuration.impl.PresetsConfiguration;

public final class Hf_1
implements Supplier {
    private static final Hf I = new Hf_1();

    public static Supplier J() {
        return I;
    }

    private Hf_1() {
        Hf_1 a2;
    }

    public Object get() {
        return new PresetsConfiguration();
    }
}

