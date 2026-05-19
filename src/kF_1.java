/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kF
 *  wD
 */
import java.util.function.BiFunction;
import ru.vimeworld.configuration.impl.VoiceChatConfiguration;

public final class kF_1
implements BiFunction {
    private static final kF I = new kF_1();

    /*
     * WARNING - void declaration
     */
    public Object apply(Object object, Object object2) {
        void b2;
        Object c2 = object2;
        kF_1 a2 = this;
        return VoiceChatConfiguration.J((String)b2, (wD)c2);
    }

    public static BiFunction J() {
        return I;
    }

    private kF_1() {
        kF_1 a2;
    }
}

