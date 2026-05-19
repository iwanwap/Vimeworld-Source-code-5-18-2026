/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import optifine.Config;

public final class Qf
implements Comparator {
    public int compare(Object object, Object object2) {
        gE b2;
        Object c2 = object2;
        Qf a2 = this;
        b2 = b2;
        c2 = (gE)c2;
        if (b2.q != ((gE)c2).q) {
            return ((gE)c2).q - b2.q;
        }
        if (!Config.equals(b2.b, ((gE)c2).b)) {
            return b2.b.compareTo(((gE)c2).b);
        }
        return b2.E.compareTo(((gE)c2).E);
    }

    public Qf() {
        Qf a2;
    }
}

