/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  TPa
 *  vRa
 *  yia
 */
public final class yia_2
implements Comparable<yia> {
    private final boolean bidirectional;
    private final String region;
    private final String name;
    private final String languageCode;

    public int hashCode() {
        yia_2 a2;
        return a2.languageCode.hashCode();
    }

    public String getLanguageCode() {
        yia_2 a2;
        return a2.languageCode;
    }

    @Override
    public int compareTo(yia yia2) {
        yia_2 b2 = yia2;
        yia_2 a2 = this;
        return a2.languageCode.compareTo(b2.languageCode);
    }

    public String toString() {
        yia_2 a2;
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = a2.name;
        objectArray[vRa.d] = a2.region;
        return String.format(TPa.X, objectArray);
    }

    public boolean isBidirectional() {
        yia_2 a2;
        return a2.bidirectional;
    }

    /*
     * WARNING - void declaration
     */
    public yia_2(String string, String string2, String string3, boolean bl) {
        void e2;
        void b2;
        void c2;
        void d2;
        yia_2 a2;
        boolean bl2 = bl;
        yia_2 yia_22 = a2 = this;
        yia_2 yia_23 = a2;
        yia_23.languageCode = d2;
        yia_23.region = c2;
        yia_22.name = b2;
        yia_22.bidirectional = e2;
    }

    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (!(b2 instanceof yia_2)) {
            return uSa.E != 0;
        }
        return ((yia_2)a2).languageCode.equals(((yia_2)b2).languageCode);
    }
}

