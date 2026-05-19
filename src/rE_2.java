/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  rE
 */
import java.util.function.Function;
import ru.vimeworld.configuration.impl.EmojisConfiguration;

public final class rE_2
implements Function {
    private static final rE I = new rE_2();

    public static Function J() {
        return I;
    }

    public Object apply(Object object) {
        Object b2 = object;
        rE_2 a2 = this;
        return EmojisConfiguration.J((String)b2);
    }

    private rE_2() {
        rE_2 a2;
    }
}

