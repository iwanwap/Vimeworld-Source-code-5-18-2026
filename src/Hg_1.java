/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Hg
 */
import java.util.function.Supplier;
import ru.vimeworld.configuration.impl.VoiceChatConfiguration;

public final class Hg_1
implements Supplier {
    private static final Hg I = new Hg_1();

    public Object get() {
        return new VoiceChatConfiguration();
    }

    public static Supplier J() {
        return I;
    }

    private Hg_1() {
        Hg_1 a2;
    }
}

