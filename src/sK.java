/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  TPa
 *  WK
 *  oqa
 *  vRa
 */
import java.util.HashMap;

public final class sK
extends HashMap<String, WK> {
    private static final String[] VALID_PREFIXES;
    private static final String REPLACEMENT_PREFIX = "vimevar.";

    @Override
    public WK get(Object object) {
        sK sK2;
        Object b2;
        block2: {
            int n2;
            b2 = object;
            sK a2 = this;
            String[] stringArray = VALID_PREFIXES;
            int n3 = VALID_PREFIXES.length;
            int n4 = n2 = uSa.E;
            while (n4 < n3) {
                String string = stringArray[n2];
                if (((String)b2).startsWith(string)) {
                    b2 = new StringBuilder().insert(2 & 5, oqa.i).append(((String)b2).substring(string.length())).toString();
                    sK2 = a2;
                    break block2;
                }
                n4 = ++n2;
            }
            sK2 = a2;
        }
        return (WK)super.get(b2);
    }

    @Override
    public boolean containsKey(Object object) {
        sK sK2;
        Object b2;
        block2: {
            int n2;
            b2 = object;
            sK a2 = this;
            String[] stringArray = VALID_PREFIXES;
            int n3 = VALID_PREFIXES.length;
            int n4 = n2 = uSa.E;
            while (n4 < n3) {
                String string = stringArray[n2];
                if (((String)b2).startsWith(string)) {
                    b2 = new StringBuilder().insert(3 & 4, oqa.i).append(((String)b2).substring(string.length())).toString();
                    sK2 = a2;
                    break block2;
                }
                n4 = ++n2;
            }
            sK2 = a2;
        }
        return super.containsKey(b2);
    }

    static {
        String[] stringArray = new String[yRa.d];
        stringArray[uSa.E] = Nra.t;
        stringArray[vRa.d] = Fua.F;
        stringArray[uqa.g] = oqa.i;
        VALID_PREFIXES = stringArray;
    }

    public sK() {
        sK a2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean remove(Object object, Object object2) {
        void a2;
        sK sK2;
        Object c2;
        block2: {
            int n2;
            c2 = object;
            sK b2 = this;
            String[] stringArray = VALID_PREFIXES;
            int n3 = VALID_PREFIXES.length;
            int n4 = n2 = uSa.E;
            while (n4 < n3) {
                String string = stringArray[n2];
                if (((String)c2).startsWith(string)) {
                    c2 = new StringBuilder().insert(3 & 4, oqa.i).append(((String)c2).substring(string.length())).toString();
                    sK2 = b2;
                    break block2;
                }
                n4 = ++n2;
            }
            sK2 = b2;
        }
        return super.remove(c2, a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public WK put(String string, WK wK2) {
        void a2;
        int n2;
        String c2 = string;
        sK b2 = this;
        String[] stringArray = VALID_PREFIXES;
        int n3 = VALID_PREFIXES.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            String string2 = stringArray[n2];
            if (c2.startsWith(string2)) {
                return (WK)super.put(oqa.i + c2.substring(string2.length()), a2);
            }
            n4 = ++n2;
        }
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = c2;
        OT.b.warn(TPa.H, objectArray);
        return (WK)super.put(c2, a2);
    }

    @Override
    public WK remove(Object object) {
        sK sK2;
        Object b2;
        block2: {
            int n2;
            b2 = object;
            sK a2 = this;
            String[] stringArray = VALID_PREFIXES;
            int n3 = VALID_PREFIXES.length;
            int n4 = n2 = uSa.E;
            while (n4 < n3) {
                String string = stringArray[n2];
                if (((String)b2).startsWith(string)) {
                    b2 = new StringBuilder().insert(2 & 5, oqa.i).append(((String)b2).substring(string.length())).toString();
                    sK2 = a2;
                    break block2;
                }
                n4 = ++n2;
            }
            sK2 = a2;
        }
        return (WK)super.remove(b2);
    }
}

