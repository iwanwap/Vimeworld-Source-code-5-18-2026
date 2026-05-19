/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ts
 */
import java.util.function.Consumer;
import ru.vimeworld.minidot.atlas.emoji.Emoji;
import ru.vimeworld.minidot.atlas.emoji.MiniDotEmoji;

public final class Ts_1
implements Consumer {
    private static final Ts instance = new Ts_1();

    private Ts_1() {
        Ts_1 a2;
    }

    public static Consumer J() {
        return instance;
    }

    public void accept(Object object) {
        Object b2 = object;
        Ts_1 a2 = this;
        MiniDotEmoji miniDotEmoji = ((Emoji)b2).J();
    }
}

