/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fd
 */
import java.util.Collections;
import java.util.List;

public final class wGa
implements Fd {
    private final boolean textureClamp;
    private final boolean textureBlur;
    private final List<Integer> listMipmaps;

    public boolean f() {
        wGa a2;
        return a2.textureClamp;
    }

    /*
     * WARNING - void declaration
     */
    public wGa(boolean bl, boolean bl2, List<Integer> list) {
        void b2;
        void c2;
        wGa a2;
        List<Integer> d2 = list;
        wGa wGa2 = a2 = this;
        a2.textureBlur = c2;
        wGa2.textureClamp = b2;
        wGa2.listMipmaps = d2;
    }

    public boolean J() {
        wGa a2;
        return a2.textureBlur;
    }

    public List<Integer> J() {
        wGa a2;
        return Collections.unmodifiableList(a2.listMipmaps);
    }
}

