/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class PE_2 {
    private Map<String, String> j;
    private String J;
    private byte[] A;
    private int I;

    public int J() {
        PE_2 a2;
        return a2.I;
    }

    public String J() {
        PE_2 a2;
        return a2.J;
    }

    public String J(String string) {
        String b2 = string;
        PE_2 a2 = this;
        return a2.j.get(b2);
    }

    public Map J() {
        PE_2 a2;
        return a2.j;
    }

    /*
     * WARNING - void declaration
     */
    public PE_2(int n2, String string, Map map, byte[] byArray) {
        Object e2;
        void b2;
        void c2;
        void d2;
        PE_2 a2;
        PE_2 pE_2 = object;
        Object object = byArray;
        PE_2 pE_22 = a2 = pE_2;
        PE_2 pE_23 = a2;
        PE_2 pE_24 = a2;
        a2.I = uSa.E;
        pE_24.J = null;
        PE_2 pE_25 = a2;
        pE_24.j = new LinkedHashMap<String, String>();
        pE_24.A = null;
        pE_23.I = d2;
        pE_23.J = c2;
        pE_22.j = b2;
        pE_22.A = (byte[])e2;
    }

    public byte[] J() {
        PE_2 a2;
        return a2.A;
    }
}

