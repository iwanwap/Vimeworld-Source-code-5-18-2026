/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Jf
 */
import java.util.function.Supplier;
import ru.vimeworld.configuration.impl.EmojisConfiguration;

public final class Jf_2
implements Supplier {
    private static final Jf I = new Jf_2();

    public Object get() {
        return new EmojisConfiguration();
    }

    public static Supplier J() {
        return I;
    }

    private Jf_2() {
        Jf_2 a2;
    }
}

