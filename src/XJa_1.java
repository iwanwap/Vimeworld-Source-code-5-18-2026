/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  OLa
 *  XJa
 *  vRa
 */
import java.util.List;

public final class XJa_1
implements D {
    private final List<OLa> listVariants;
    private final String name;

    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (!(b2 instanceof XJa_1)) {
            return uSa.E != 0;
        }
        b2 = (XJa_1)b2;
        if (!((XJa_1)a2).name.equals(((XJa_1)b2).name)) {
            return uSa.E != 0;
        }
        return ((XJa_1)a2).listVariants.equals(((XJa_1)b2).listVariants);
    }

    public static /* synthetic */ String J(XJa a2) {
        return a2.name;
    }

    /*
     * WARNING - void declaration
     */
    public XJa_1(String string, List<OLa> list) {
        void b2;
        XJa_1 a2;
        List<OLa> c2 = list;
        XJa_1 xJa_1 = a2 = this;
        xJa_1.name = b2;
        xJa_1.listVariants = c2;
    }

    public List<OLa> J() {
        XJa_1 a2;
        return a2.listVariants;
    }

    public int hashCode() {
        XJa_1 xJa_1 = this;
        int a2 = xJa_1.name.hashCode();
        a2 = tua.U * a2 + xJa_1.listVariants.hashCode();
        return a2;
    }
}

