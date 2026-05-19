/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import org.lwjgl.opengl.DisplayMode;

public final class tf_2
implements Comparator {
    public int compare(Object object, Object object2) {
        DisplayMode b2;
        Object c2 = object2;
        tf_2 a2 = this;
        b2 = b2;
        c2 = (DisplayMode)c2;
        if (b2.getWidth() != ((DisplayMode)c2).getWidth()) {
            return b2.getWidth() - ((DisplayMode)c2).getWidth();
        }
        if (b2.getHeight() != ((DisplayMode)c2).getHeight()) {
            return b2.getHeight() - ((DisplayMode)c2).getHeight();
        }
        if (b2.getBitsPerPixel() != ((DisplayMode)c2).getBitsPerPixel()) {
            return b2.getBitsPerPixel() - ((DisplayMode)c2).getBitsPerPixel();
        }
        if (b2.getFrequency() != ((DisplayMode)c2).getFrequency()) {
            return b2.getFrequency() - ((DisplayMode)c2).getFrequency();
        }
        return uSa.E;
    }

    public tf_2() {
        tf_2 a2;
    }
}

