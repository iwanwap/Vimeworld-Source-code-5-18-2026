/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

public final class Ag
implements Comparator {
    public int compare(Object object, Object object2) {
        gE b2;
        Object c2 = object2;
        Ag a2 = this;
        b2 = b2;
        c2 = (gE)c2;
        if (b2.C != ((gE)c2).C) {
            return b2.C - ((gE)c2).C;
        }
        if (b2.q != ((gE)c2).q) {
            return ((gE)c2).q - b2.q;
        }
        gE gE2 = b2;
        if (!b2.b.equals(((gE)c2).b)) {
            return gE2.b.compareTo(((gE)c2).b);
        }
        return gE2.E.compareTo(((gE)c2).E);
    }

    public Ag() {
        Ag a2;
    }
}

