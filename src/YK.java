/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  QJ
 *  iJ
 */
import java.util.Comparator;

public final class YK
implements Comparator {
    private static final YK I = new YK();

    private YK() {
        YK a2;
    }

    /*
     * WARNING - void declaration
     */
    public int compare(Object object, Object object2) {
        void b2;
        Object c2 = object2;
        YK a2 = this;
        return iJ.J((QJ)((QJ)b2), (QJ)((QJ)c2));
    }

    public static Comparator J() {
        return I;
    }
}

