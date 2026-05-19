/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Js
 */
import java.util.function.Consumer;
import net.xtrafrancyz.mods.minidot.items.pet.TriggerTeddy;

public final class Wt
implements Consumer {
    private static final Wt instance = new Wt();

    public static Consumer J() {
        return instance;
    }

    public void accept(Object object) {
        Object b2 = object;
        Wt a2 = this;
        TriggerTeddy.f((Js)b2);
    }

    private Wt() {
        Wt a2;
    }
}

