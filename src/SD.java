/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;
import ru.vimeworld.configuration.impl.HomeScreenConfiguration;

public final class SD
implements Supplier {
    private static final SD I = new SD();

    public static Supplier J() {
        return I;
    }

    private SD() {
        SD a2;
    }

    public Object get() {
        return new HomeScreenConfiguration();
    }
}

