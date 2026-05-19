/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KE
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ue_1 {
    private Map<String, KE> A;
    private final String I;

    public ue_1(String string) {
        String b2 = string;
        ue_1 a2 = this;
        ue_1 ue_12 = a2;
        a2.A = new HashMap<String, KE>();
        a2.I = b2;
    }

    public String J() {
        ue_1 a2;
        return a2.I;
    }

    public void J(Map<String, KE> map) {
        Map<String, KE> b2 = map;
        ue_1 a2 = this;
        a2.A = b2;
    }

    public Map<String, KE> J() {
        ue_1 a2;
        return a2.A;
    }

    public int J() {
        Iterator<KE> iterator;
        ue_1 ue_12 = this;
        int a2 = uSa.E;
        Iterator<KE> iterator2 = iterator = ue_12.A.values().iterator();
        while (iterator2.hasNext()) {
            KE kE2 = iterator.next();
            a2 = Math.max(a2, kE2.J());
            iterator2 = iterator;
        }
        return a2;
    }
}

