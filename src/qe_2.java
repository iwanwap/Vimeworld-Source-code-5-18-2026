/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  qe
 */
import java.util.function.Supplier;
import ru.vimeworld.configuration.impl.MDConfiguration;

public final class qe_2
implements Supplier {
    private static final qe I = new qe_2();

    public static Supplier J() {
        return I;
    }

    private qe_2() {
        qe_2 a2;
    }

    public Object get() {
        return new MDConfiguration();
    }
}

