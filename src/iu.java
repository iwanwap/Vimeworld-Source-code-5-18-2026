/*
 * Decompiled with CFR 0.152.
 */
import net.xtrafrancyz.mods.minidot.items.impl.ImageArrowTrail;

public final class iu
implements m {
    private final String arg$1;

    public static m J(String a2) {
        return new iu(a2);
    }

    private iu(String string) {
        String b2 = string;
        iu a2 = this;
        a2.arg$1 = b2;
    }

    @Override
    public String J() {
        iu a2;
        return ImageArrowTrail.J(a2.arg$1);
    }
}

