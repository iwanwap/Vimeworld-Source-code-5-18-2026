/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class HR
extends Fq {
    private final Map<String, float[]> A;
    private final Map<String, BR> I;

    /*
     * WARNING - void declaration
     */
    public void J(String string, BR bR) {
        void b2;
        BR c2 = bR;
        HR a2 = this;
        a2.I.put((String)b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, float[] fArray) {
        void b2;
        Object c2 = fArray;
        HR a2 = this;
        a2.A.put((String)b2, (float[])c2);
    }

    public Collection<BR> J() {
        HR a2;
        return a2.I.values();
    }

    public float[] J(String string) {
        String b2 = string;
        HR a2 = this;
        return a2.A.get(b2);
    }

    /*
     * WARNING - void declaration
     */
    public HR(String string, String string2, float[] fArray, float[] fArray2) {
        Object e2;
        void b2;
        void c2;
        void d2;
        HR hR = object;
        Object object = fArray2;
        HR a2 = hR;
        super((String)d2, (String)c2, (float[])b2, (float[])e2);
        HR hR2 = a2;
        a2.A = new HashMap<String, float[]>();
        hR2.I = new HashMap<String, BR>();
    }
}

