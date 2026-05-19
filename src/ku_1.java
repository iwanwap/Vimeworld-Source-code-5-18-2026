/*
 * Decompiled with CFR 0.152.
 */
import net.xtrafrancyz.mods.minidot.items.impl.ImageShadow;

public final class ku_1
implements m {
    private final ImageShadow arg$1;

    @Override
    public String J() {
        ku_1 a2;
        return ImageShadow.J(a2.arg$1);
    }

    private ku_1(ImageShadow imageShadow) {
        ImageShadow b2 = imageShadow;
        ku_1 a2 = this;
        a2.arg$1 = b2;
    }

    public static m J(ImageShadow a2) {
        return new ku_1(a2);
    }
}

