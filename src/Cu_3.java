/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cu
 *  Js
 */
import java.util.function.Consumer;
import net.xtrafrancyz.mods.minidot.items.pet.FarmSunflower;

public final class Cu_3
implements Consumer {
    private static final Cu instance = new Cu_3();

    private Cu_3() {
        Cu_3 a2;
    }

    public static Consumer J() {
        return instance;
    }

    public void accept(Object object) {
        Object b2 = object;
        Cu_3 a2 = this;
        FarmSunflower.f((Js)b2);
    }
}

