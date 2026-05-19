/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Be
 *  Sf
 */
import java.util.function.Function;
import ru.vimeworld.minidot.atlas.emoji.Emoji;

public final class Be_1
implements Function {
    private static final Be I = new Be_1();

    public Object apply(Object object) {
        Object b2 = object;
        Be_1 a2 = this;
        return Sf.J((Emoji)((Emoji)b2));
    }

    public static Function J() {
        return I;
    }

    private Be_1() {
        Be_1 a2;
    }
}

